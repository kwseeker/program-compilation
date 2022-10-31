# program-compilation
程序编译原理&amp;实践（先研究SQL的常见语法分析器解析AST并应用的原理）。



## SQL Parser

相对于其他语言的语法解析编译，SQL Parser （SQL语法解析器通称）感觉更接地气，在一些开源框架的源码中，比如 Sharding-JDBC、Druid都会看到SQL语法解析与应用的场景，比如解析SQL语法后对SQL进行修改替换实现分库分表、无用条件去除等等。

这里从 Alibaba Druid 的 SQL Parser 入手，后面会对比 Antlr V4，感受下SQL语法解析原理与实际应用。

参考：《Alibaba Druid v1.0 使用手册》- [SQL Parser](https://www.bookstack.cn/read/Druid/561a8f205346f80b.md)。

关于SQL解析基本流程(和其他语言都类似)，参考网文吧 [SQL解析在美团的应用](https://tech.meituan.com/2018/05/20/sql-parser-used-in-mtdp.html) 。

