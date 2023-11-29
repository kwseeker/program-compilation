package top.kwseeker.antlr4.mysql.sharding;

import top.kwseeker.antlr4.mysql.sharding.infra.database.mysql.MySQLDatabaseType;
import top.kwseeker.antlr4.mysql.sharding.parser.api.SQLParserEngine;
import top.kwseeker.antlr4.mysql.sharding.parser.api.SQLStatementVisitorEngine;
import top.kwseeker.antlr4.mysql.sharding.parser.core.ParseASTNode;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.statement.SQLStatement;

public class AppMain {

    public static void main(String[] args) {
        //假如分表场景中，有一个逻辑SQL如下，按order_id取模2的结果分两个表，逻辑SQL转实际SQL的流程：
        int orderId = 1001;
        String sql = "select * from t_order where order_id = ?";

        MySQLDatabaseType databaseType = new MySQLDatabaseType();

        SQLParserEngine engine = new SQLParserEngine(databaseType.getType());
        ParseASTNode astNode = engine.parse(sql, false);
        //ParseTree rootNode = astNode.getRootNode();

        SQLStatementVisitorEngine visitorEngine = new SQLStatementVisitorEngine(databaseType);
        SQLStatement sqlStatement = visitorEngine.visit(astNode);

    }
}
