# Antlr4 解析 SQL 语句语法树

参考 `antlr4-mysql`模块实现，代码是从 ShardingSphere 抽离出来的，展示怎么使用 Antlr4 解析逻辑 SQL 并改写。

其实官方源码模块分的已经很细了，解析SQL AST这部分代码和其他基本没什么耦合，且额外封装逻辑很少（仅仅是拓展了**SPI**和**本地缓存Caffeine**），可以直接读源码，根本没有理解阻力．

代码主要在ShardingSphere下面两个模块：

+ infra/parser

  核心接口类：SQLParserEngine。

+ parser

  下面有两个子模块：

  + dialect

    定义各种方言sql的语法规则（Antlr4 .g4 文件），以及基本的词法分析器、语法解析器、Visitor的实现。

  + engine

    定义 Parser Visitor 引擎实现： SQLParserEngine SQLStatementVisitorEngine。



## Antlr4 SQL语法规则

代码中解析的规则是 `execute`：

```java
// MySQLParser
public ASTNode parse() {
	return new ParseASTNode(execute(), (CommonTokenStream) getTokenStream());
}
```

完整的SQL语法规则还是挺复杂的（5k多行），这里以select查询语句为例分析其语法规则定义:

```antlr4
//MySQLStatement.g4
execute
    : (select
    ... 					//这里省略其他子规则
    | delimiter
    ) (SEMI_ EOF? | EOF)	//以“分号+0或1个EOF”、“EOF”结尾
    | EOF
    ;

//Symbol.g4
SEMI_:               ';';

//DMLStatement.g4
select
    : queryExpression lockClauseList?
    | queryExpressionParens
    | selectWithInto
    ;
    
queryExpression
    : withClause? (queryExpressionBody | queryExpressionParens) orderByClause? limitClause?
    ;

//用于匹配 with 子句，
withClause
    : WITH RECURSIVE? cteClause (COMMA_ cteClause)*	//匹配 with recursive？ 不区分大小写
    ;

//匹配SQL关键字，这么写是为了不区分大小写
WITH
    : W I T H		//这里 W I T H 每个都是一个fragement，即不是词法符号，只是被其他词法规则使用
    ;
    
//匹配 cte 子句，格式：cte_name [(col_name [, col_name] ...)] AS (subquery)
//比如 cte1 AS (SELECT a, b FROM table1)
cteClause
    : identifier (LP_ columnNames RP_)? AS subquery		//LP_ 匹配 '(' ， RP_匹配 ')'
    ;

identifier
    : IDENTIFIER_
    | identifierKeywordsUnambiguous
    | identifierKeywordsAmbiguous1RolesAndLabels
    | identifierKeywordsAmbiguous2Labels
    | identifierKeywordsAmbiguous3Roles
    | identifierKeywordsAmbiguous4SystemVariables
    | customKeyword
    | DOUBLE_QUOTED_TEXT
    | UNDERSCORE_CHARSET
    | BQUOTA_STRING
    ;

IDENTIFIER_
    : [A-Za-z_$0-9\u0080-\uFFFF]*?[A-Za-z_$\u0080-\uFFFF]+?[A-Za-z_$0-9\u0080-\uFFFF]*
    | BQ_ ~'`'+ BQ_
    ;

lockClauseList
    : lockClause+
    ;
    
queryExpressionParens
    : LP_ (queryExpressionParens | queryExpression lockClauseList?) RP_
    ;
    
selectWithInto
    : LP_ selectWithInto RP_
    | queryExpression selectIntoExpression lockClauseList?
    | queryExpression lockClauseList selectIntoExpression
    ;
```



## MySQL SQL语法

参考：https://dev.mysql.com/doc/refman/8.0/en/sql-statements.html

上面的规则定义中出现了一些不常用的SQL语法，这里补充说明一下。

### DDL

### DML

+ [with](https://dev.mysql.com/doc/refman/8.0/en/with.html)

  使用`with`可以定义**公共表表达式**(CTE，common table expression)是一个命名的临时结果集，它存在于单个语句的作用域中，以后可以在该语句中多次引用它。

  格式：

  ```
  with_clause:
      WITH [RECURSIVE]
          cte_name [(col_name [, col_name] ...)] AS (subquery)
          [, cte_name [(col_name [, col_name] ...)] AS (subquery)] ...
  ```

  比如：

  ```sql
  WITH
    cte1 AS (SELECT a, b FROM table1),
    cte2 AS (SELECT c, d FROM table2)
  SELECT b, d FROM cte1 JOIN cte2
  WHERE cte1.a = cte2.c;
  # 递归公共表表达式是具有引用其自身名称的子查询的表达式。
  WITH RECURSIVE cte (n) AS
  (
    SELECT 1
    UNION ALL
    SELECT n + 1 FROM cte WHERE n < 5
  )
  SELECT * FROM cte;
  ```

### TL

