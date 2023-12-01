package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value;

import top.kwseeker.antlr4.mysql.sharding.api.ASTNode;

public interface ValueASTNode<T> extends ASTNode {

    T getValue();
}