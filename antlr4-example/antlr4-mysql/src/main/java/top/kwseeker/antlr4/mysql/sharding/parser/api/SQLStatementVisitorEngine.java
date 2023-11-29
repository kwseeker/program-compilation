package top.kwseeker.antlr4.mysql.sharding.parser.api;

import top.kwseeker.antlr4.mysql.sharding.api.ASTNode;
import top.kwseeker.antlr4.mysql.sharding.api.visitor.statement.SQLStatementVisitor;
import top.kwseeker.antlr4.mysql.sharding.infra.database.DatabaseType;
import top.kwseeker.antlr4.mysql.sharding.infra.database.mysql.MySQLDatabaseType;
import top.kwseeker.antlr4.mysql.sharding.parser.core.ParseASTNode;
import top.kwseeker.antlr4.mysql.sharding.parser.core.visitor.SQLStatementVisitorFactory;
import top.kwseeker.antlr4.mysql.sharding.parser.core.visitor.SQLVisitorRule;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.statement.SQLStatement;

/**
 * Visitor 引擎遍历 SQL AST 转成更易读的　SQLStatement　语法树
 */
public class SQLStatementVisitorEngine {

    private final DatabaseType databaseType;

    public SQLStatementVisitorEngine(DatabaseType databaseType) {
        this.databaseType = databaseType;
    }

    public SQLStatement visit(final ParseASTNode parseASTNode) {
        SQLVisitorRule sqlVisitorRule = SQLVisitorRule.valueOf(parseASTNode.getRootNode().getClass());
        SQLStatementVisitor visitor = SQLStatementVisitorFactory.newInstance(databaseType, sqlVisitorRule);
        ASTNode sqlStatement = parseASTNode.getRootNode().accept(visitor);
        return (SQLStatement) sqlStatement;
    }
}
