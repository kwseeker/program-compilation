package top.kwseeker.antlr4.mysql.sharding.api.visitor.statement;

import top.kwseeker.antlr4.mysql.sharding.api.ASTNode;
import top.kwseeker.antlr4.mysql.sharding.api.visitor.SQLVisitor;

public interface SQLStatementVisitor extends SQLVisitor<ASTNode> {
}