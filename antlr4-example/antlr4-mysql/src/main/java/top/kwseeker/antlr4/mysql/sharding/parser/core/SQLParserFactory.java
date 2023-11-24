package top.kwseeker.antlr4.mysql.sharding.parser.core;

import org.antlr.v4.runtime.*;
import top.kwseeker.antlr4.mysql.sharding.api.parser.SQLLexer;
import top.kwseeker.antlr4.mysql.sharding.api.parser.SQLParser;

import java.nio.CharBuffer;

public final class SQLParserFactory {

    public static SQLParser newInstance(final String sql,
                                        final Class<? extends SQLLexer> lexerClass,
                                        final Class<? extends SQLParser> parserClass) throws ReflectiveOperationException {
        CodePointBuffer codePointBuffer = CodePointBuffer.withChars(CharBuffer.wrap(sql.toCharArray()));
        CodePointCharStream charStream = CodePointCharStream.fromBuffer(codePointBuffer);

        Lexer lexer = (Lexer) lexerClass.getConstructor(CharStream.class).newInstance(charStream);
        lexer.removeErrorListener(ConsoleErrorListener.INSTANCE);   //TODO
        TokenStream tokenStream = new CommonTokenStream(lexer);

        SQLParser sqlParser = parserClass.getConstructor(TokenStream.class).newInstance(tokenStream);
        ((Parser) sqlParser).setErrorHandler(new BailErrorStrategy());  //TODO
        ((Parser) sqlParser).removeErrorListener(ConsoleErrorListener.INSTANCE);

        return sqlParser;
        //return createSQLParser(createTokenStream(sql, lexerClass), parserClass);
    }
}
