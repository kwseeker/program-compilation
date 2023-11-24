package top.kwseeker.antlr4.mysql.sharding.parser.mysql.parser;

import org.antlr.v4.runtime.CharStream;
import top.kwseeker.antlr4.mysql.autogen.MySQLStatementLexer;
import top.kwseeker.antlr4.mysql.sharding.api.parser.SQLLexer;

public class MySQLLexer extends MySQLStatementLexer implements SQLLexer {

    public MySQLLexer(final CharStream input) {
        super(input);
    }
}
