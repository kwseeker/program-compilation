package top.kwseeker.antlr4.mysql.sharding.parser.core.parser;

import org.antlr.v4.runtime.Parser;
import org.antlr.v4.runtime.atn.PredictionMode;
import top.kwseeker.antlr4.mysql.sharding.api.parser.SQLParser;
import top.kwseeker.antlr4.mysql.sharding.infra.database.DatabaseType;
import top.kwseeker.antlr4.mysql.sharding.parser.core.ParseASTNode;
import top.kwseeker.antlr4.mysql.sharding.parser.core.SQLParserFactory;
import top.kwseeker.antlr4.mysql.sharding.parser.mysql.parser.MySQLParserFacade;
import top.kwseeker.antlr4.mysql.sharding.spi.SQLDialectParserFacade;

public class SQLParserExecutor {

    private final DatabaseType databaseType;

    public SQLParserExecutor(DatabaseType databaseType) {
        this.databaseType = databaseType;
    }

    public ParseASTNode parse(final String sql) {
        //原实现：先通过SPI加载databaseType数据库对应的 SQLDialectParserFacade,获取词法分析器Lexer和语法解析器Parser，然后构造SQLParser
        SQLDialectParserFacade mysqlParserFacade = new MySQLParserFacade();

        SQLParser sqlParser;
        try {
            sqlParser = SQLParserFactory.newInstance(sql, mysqlParserFacade.getLexerClass(), mysqlParserFacade.getParserClass());
        } catch (ReflectiveOperationException e) {
            throw new RuntimeException("Failed to create sql parser: ", e);
        }

        //源代码，转换了异常ParseCancellationException
        ((Parser) sqlParser).getInterpreter().setPredictionMode(PredictionMode.SLL);
        return (ParseASTNode) sqlParser.parse();
    }
}
