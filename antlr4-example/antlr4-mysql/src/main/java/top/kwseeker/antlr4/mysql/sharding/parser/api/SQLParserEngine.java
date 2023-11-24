package top.kwseeker.antlr4.mysql.sharding.parser.api;

import top.kwseeker.antlr4.mysql.sharding.infra.database.DatabaseType;
import top.kwseeker.antlr4.mysql.sharding.infra.database.mysql.MySQLDatabaseType;
import top.kwseeker.antlr4.mysql.sharding.parser.core.ParseASTNode;
import top.kwseeker.antlr4.mysql.sharding.parser.core.parser.SQLParserExecutor;

//ShardingSphere 对 SQLParserExecutor 又封装了一次，主要是为了支持缓存
public class SQLParserEngine {

    private final SQLParserExecutor sqlParserExecutor;
    // caffeine 缓存
    //private final LoadingCache<String, ParseASTNode> parseTreeCache;

    //原方法支持SPI加载和缓存配置，这里忽略
    public SQLParserEngine(final String databaseType) {
        //原实现是由 TypedSPILoader 加载
        DatabaseType dbType = new MySQLDatabaseType();
        sqlParserExecutor = new SQLParserExecutor(dbType);
    }

    /**
     * 解析逻辑SQL生成语法树
     * @return ParseASTNode 语法树对象的根节点
     */
    public ParseASTNode parse(String sql, final boolean useCache) {
        if (useCache) {
            System.out.println("不展示缓存功能");
        }
        return sqlParserExecutor.parse(sql);
    }
}
