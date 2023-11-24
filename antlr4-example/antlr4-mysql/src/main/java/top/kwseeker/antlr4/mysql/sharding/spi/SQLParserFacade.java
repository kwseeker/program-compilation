package top.kwseeker.antlr4.mysql.sharding.spi;

import top.kwseeker.antlr4.mysql.sharding.api.parser.SQLLexer;
import top.kwseeker.antlr4.mysql.sharding.api.parser.SQLParser;

public interface SQLParserFacade {

    Class<? extends SQLLexer> getLexerClass();
    Class<? extends SQLParser> getParserClass();
}
