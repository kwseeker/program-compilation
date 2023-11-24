package top.kwseeker.antlr4.mysql.sharding.parser.mysql.parser;

import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import top.kwseeker.antlr4.mysql.autogen.MySQLStatementParser;
import top.kwseeker.antlr4.mysql.sharding.api.ASTNode;
import top.kwseeker.antlr4.mysql.sharding.api.parser.SQLParser;
import top.kwseeker.antlr4.mysql.sharding.parser.core.ParseASTNode;

public class MySQLParser extends MySQLStatementParser implements SQLParser {

    public MySQLParser(TokenStream input) {
        super(input);
    }

    @Override
    public ASTNode parse() {
        return new ParseASTNode(execute(), (CommonTokenStream) getTokenStream());
    }
}
