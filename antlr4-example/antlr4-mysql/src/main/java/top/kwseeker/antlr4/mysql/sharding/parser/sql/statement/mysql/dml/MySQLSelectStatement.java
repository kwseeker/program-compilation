package top.kwseeker.antlr4.mysql.sharding.parser.sql.statement.mysql.dml;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml.LimitSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.statement.dml.SelectStatement;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.statement.mysql.MySQLStatement;

import java.util.Optional;

public class MySQLSelectStatement extends SelectStatement implements MySQLStatement {

    //limit 子句
    private LimitSegment limit;

    public Optional<LimitSegment> getLimit() {
        return Optional.ofNullable(this.limit);
    }

    public void setLimit(LimitSegment limit) {
        this.limit = limit;
    }
}
