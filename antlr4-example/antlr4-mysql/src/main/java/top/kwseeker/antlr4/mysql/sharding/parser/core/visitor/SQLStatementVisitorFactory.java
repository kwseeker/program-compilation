package top.kwseeker.antlr4.mysql.sharding.parser.core.visitor;

import top.kwseeker.antlr4.mysql.sharding.api.visitor.statement.SQLStatementVisitor;
import top.kwseeker.antlr4.mysql.sharding.infra.database.DatabaseType;
import top.kwseeker.antlr4.mysql.sharding.parser.mysql.visitor.statement.MySQLStatementVisitorFacade;
import top.kwseeker.antlr4.mysql.sharding.spi.SQLStatementVisitorFacade;

public class SQLStatementVisitorFactory {

    public static SQLStatementVisitor newInstance(final DatabaseType databaseType, final SQLVisitorRule visitorRule) {
        //原代码是SPI根据数据库类型加载Facade实现类的
        //Facade也只不过是根据SQL类型返回具体的Visitor类型Class，不同SQL类型Visitor逻辑不一样
        SQLStatementVisitorFacade facade = new MySQLStatementVisitorFacade();


    }
}
