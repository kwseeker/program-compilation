package top.kwseeker.antlr4.mysql.sharding.parser.mysql.visitor.statement;

import top.kwseeker.antlr4.mysql.autogen.MySQLStatementBaseVisitor;
import top.kwseeker.antlr4.mysql.autogen.MySQLStatementParser;
import top.kwseeker.antlr4.mysql.sharding.api.ASTNode;

/**
 * 继承　MySQLStatementBaseVisitor　这一自动生成的　Visitor,
 * 重新定制访问者模式遍历方式
 */
public abstract class MySQLStatementVisitor extends MySQLStatementBaseVisitor<ASTNode> {

    @Override
    public ASTNode visitSelect(MySQLStatementParser.SelectContext ctx) {
        return super.visitSelect(ctx);
    }
}
