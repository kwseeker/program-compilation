package top.kwseeker.antlr4.mysql.sharding;

import org.antlr.v4.runtime.tree.ParseTree;
import top.kwseeker.antlr4.mysql.sharding.parser.api.SQLParserEngine;
import top.kwseeker.antlr4.mysql.sharding.parser.core.ParseASTNode;

public class Main {

    public static void main(String[] args) {
        //假如分表场景中，有一个逻辑SQL如下，按order_id取模2的结果分两个表，逻辑SQL转实际SQL的流程：
        int orderId = 1001;
        String sql = "select * from t_order where order_id = ?";

        SQLParserEngine engine = new SQLParserEngine("MySQL");
        ParseASTNode astNode = engine.parse(sql, false);
        ParseTree rootNode = astNode.getRootNode();


    }
}
