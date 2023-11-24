package top.kwseeker.antlr4.mysql.sharding.parser.mysql.visitor.statement;

import top.kwseeker.antlr4.mysql.sharding.api.visitor.statement.type.*;
import top.kwseeker.antlr4.mysql.sharding.parser.mysql.visitor.statement.type.*;
import top.kwseeker.antlr4.mysql.sharding.spi.SQLStatementVisitorFacade;

public class MySQLStatementVisitorFacade implements SQLStatementVisitorFacade {

    @Override
    public Class<? extends DMLStatementVisitor> getDMLVisitorClass() {
        return MySQLDMLStatementVisitor.class;
    }

    @Override
    public Class<? extends DDLStatementVisitor> getDDLVisitorClass() {
        return MySQLDDLStatementVisitor.class;
    }

    @Override
    public Class<? extends TCLStatementVisitor> getTCLVisitorClass() {
        return MySQLTCLStatementVisitor.class;
    }

    @Override
    public Class<? extends DCLStatementVisitor> getDCLVisitorClass() {
        return MySQLDCLStatementVisitor.class;
    }

    @Override
    public Class<? extends DALStatementVisitor> getDALVisitorClass() {
        return MySQLDALStatementVisitor.class;
    }

    @Override
    public Class<? extends RLStatementVisitor> getRLVisitorClass() {
        return MySQLRLStatementVisitor.class;
    }

    public String getDatabaseType() {
        return "MySQL";
    }
}
