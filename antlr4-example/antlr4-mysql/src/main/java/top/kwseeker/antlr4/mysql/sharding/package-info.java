package top.kwseeker.antlr4.mysql.sharding;

//代码主要 ShardingSphere-JDBC 中抽离简化而来，展示怎么使用 Antlr4 解析逻辑 SQL 并改写。
//　其实官方源码模块分的已经很细了，解析SQL AST这部分代码和其他基本没什么耦合，且封装逻辑很少（仅仅是拓展了SPI和本地缓存Caffeine），可以直接读源码．
//代码主要在下面两个模块：
//  shardingsphere/infra/parser
//      核心接口类：SQLParserEngine。
//  shardingsphere/parser/sql
//      下面有两个模块：
//      dialect: 定义各种方言sql的语法规则（Antlr4 .g4 文件），以及基本的词法分析器、语法解析器、Visitor的实现。
//      engine: 定义 Parser Visitor 引擎实现： SQLParserEngine SQLStatementVisitorEngine