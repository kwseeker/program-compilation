package top.kwseeker.antlr4.mysql.sharding.parser.api;

import top.kwseeker.antlr4.mysql.sharding.api.visitor.statement.SQLStatementVisitor;
import top.kwseeker.antlr4.mysql.sharding.parser.core.ParseASTNode;
import top.kwseeker.antlr4.mysql.sharding.parser.core.visitor.SQLStatementVisitorFactory;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.statement.SQLStatement;

/**
 * Visitor 引擎遍历 SQL AST 转成更易读的　SQLStatement　语法树
 */
public class SQLStatementVisitorEngine {

    public SQLStatement visit(final ParseASTNode parseASTNode) {
        SQLStatementVisitor visitor = SQLStatementVisitorFactory.newInstance();
        return parseASTNode.getRootNode().accept(visitor);
    }
}
