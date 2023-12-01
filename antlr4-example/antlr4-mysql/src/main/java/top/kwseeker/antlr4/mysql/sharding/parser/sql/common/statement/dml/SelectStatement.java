package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.statement.dml;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml.OrderBySegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml.ProjectionsSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml.WhereSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic.TableSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.statement.AbstractSQLStatement;

public class SelectStatement extends AbstractSQLStatement implements DMLStatement {
    //查询的列
    private ProjectionsSegment projections;
    //from 子句
    private TableSegment from;
    //where 子句
    private WhereSegment where;
    //order by 子句
    private OrderBySegment orderBy;

    public ProjectionsSegment getProjections() {
        return projections;
    }

    public void setProjections(ProjectionsSegment projections) {
        this.projections = projections;
    }

    public OrderBySegment getOrderBy() {
        return orderBy;
    }

    public void setOrderBy(OrderBySegment orderBy) {
        this.orderBy = orderBy;
    }

    public TableSegment getFrom() {
        return from;
    }

    public void setFrom(TableSegment from) {
        this.from = from;
    }

    public WhereSegment getWhere() {
        return where;
    }

    public void setWhere(WhereSegment where) {
        this.where = where;
    }
}
