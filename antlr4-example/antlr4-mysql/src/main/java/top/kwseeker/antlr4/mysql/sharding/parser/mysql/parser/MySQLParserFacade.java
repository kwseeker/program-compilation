package top.kwseeker.antlr4.mysql.sharding.parser.mysql.parser;

import top.kwseeker.antlr4.mysql.sharding.api.parser.SQLLexer;
import top.kwseeker.antlr4.mysql.sharding.api.parser.SQLParser;
import top.kwseeker.antlr4.mysql.sharding.spi.SQLDialectParserFacade;

public class MySQLParserFacade implements SQLDialectParserFacade {

    @Override
    public String getType() {
        return "MySQL";
    }

    @Override
    public Class<? extends SQLLexer> getLexerClass() {
        return MySQLLexer.class;
    }

    @Override
    public Class<? extends SQLParser> getParserClass() {
        return MySQLParser.class;
    }
}
