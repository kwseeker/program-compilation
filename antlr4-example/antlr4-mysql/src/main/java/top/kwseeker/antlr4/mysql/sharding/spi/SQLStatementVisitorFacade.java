package top.kwseeker.antlr4.mysql.sharding.spi;

import top.kwseeker.antlr4.mysql.sharding.api.visitor.statement.type.*;

public interface SQLStatementVisitorFacade {

    Class<? extends DMLStatementVisitor> getDMLVisitorClass();

    Class<? extends DDLStatementVisitor> getDDLVisitorClass();

    Class<? extends TCLStatementVisitor> getTCLVisitorClass();

    Class<? extends DCLStatementVisitor> getDCLVisitorClass();

    Class<? extends DALStatementVisitor> getDALVisitorClass();

    Class<? extends RLStatementVisitor> getRLVisitorClass();
}
