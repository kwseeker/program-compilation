package top.kwseeker.antlr4.mysql.sharding.parser.core.visitor;

import top.kwseeker.antlr4.mysql.sharding.api.visitor.statement.SQLStatementVisitor;
import top.kwseeker.antlr4.mysql.sharding.infra.database.DatabaseType;
import top.kwseeker.antlr4.mysql.sharding.parser.mysql.visitor.statement.MySQLStatementVisitorFacade;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.statement.SQLStatementType;
import top.kwseeker.antlr4.mysql.sharding.spi.SQLStatementVisitorFacade;

import java.lang.reflect.InvocationTargetException;

public class SQLStatementVisitorFactory {

    public static SQLStatementVisitor newInstance(final DatabaseType databaseType, final SQLVisitorRule visitorRule) throws RuntimeException {
        //原代码是SPI根据数据库类型 databaseType 加载Facade实现类的
        //Facade也只不过是根据SQL类型返回具体的Visitor类型(Class)，不同SQL类型Visitor逻辑不一样
        SQLStatementVisitorFacade visitorFacade = new MySQLStatementVisitorFacade();
        try {
            SQLStatementType type = visitorRule.getType();
            switch (type) {
                case DML:
                    return visitorFacade.getDMLVisitorClass().getConstructor().newInstance();
                case DDL:
                    return visitorFacade.getDDLVisitorClass().getConstructor().newInstance();
                case TCL:
                    return visitorFacade.getTCLVisitorClass().getConstructor().newInstance();
                case DCL:
                    return visitorFacade.getDCLVisitorClass().getConstructor().newInstance();
                case DAL:
                    return visitorFacade.getDALVisitorClass().getConstructor().newInstance();
                case RL:
                    return visitorFacade.getRLVisitorClass().getConstructor().newInstance();
                default:
                    throw new RuntimeException("not support type: " + type.name());
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
