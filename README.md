# program-compilation
程序编译原理相关工具、框架、场景与实践。

文档：[docs](./docs)

+ [Antlr4](./docs/antlr4)



## Antlr4

### Antlr4基础

参考文档：[Antlr4 docs](./docs/antlr4/antlr4.md)

### Antlr4应用场景

#### SQL Parser

+ **ShardingSphere**

  看源码发现ShardingSphere使用了Antlr4解析SQL语句语法树；

  相关大概流程：先用Antlr4解析出原生的解析树对象（ParserRuleContext），然后经过一次访问器模式遍历，转成了ShardingSphere自己的更易读的`SqlStatement`语法树对象，最后替换其中 `TableToken` （代表数据表的词法符号）的逻辑表名为通过分表规则和传参计算出的真实表名，最终构造出实际的可执行的 sql。
  
  并没有在语法树对象上修改，再将语法树对象转成可执行的 sql 语句；主要是这个转换太耗时了。
  
  为了防止对同一条SQL反复解析语法树，ShardingSphere还默认开启了本地缓存（Caffine）。
  
  后面会对比其他方案实现，比如 Druid 的 SQL Parser。
  
  除了分库分表改写SQL，还有些其他使用场景，比如无用条件去除等等，后面看看怎么做的。
  
  其他方案或应用：
  
  + 《Alibaba Druid v1.0 使用手册》- [SQL Parser](https://www.bookstack.cn/read/Druid/561a8f205346f80b.md)。
  
  + [SQL解析在美团的应用](https://tech.meituan.com/2018/05/20/sql-parser-used-in-mtdp.html) 。

