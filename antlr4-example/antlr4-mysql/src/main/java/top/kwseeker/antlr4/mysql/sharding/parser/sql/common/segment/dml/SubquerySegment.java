package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.enums.SubqueryType;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.statement.dml.SelectStatement;

/**
 * 子查询段
 */
public final class SubquerySegment implements ExpressionSegment {
    
    private final int startIndex;
    private final int stopIndex;
    //子查询也是完整的SELECT查询
    private final SelectStatement select;
    //
    private final String text;
    private SubqueryType subqueryType;

    public SubquerySegment(int startIndex, int stopIndex, SelectStatement select, String text) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.select = select;
        this.text = text;
    }

    @Override
    public int getStartIndex() {
        return startIndex;
    }

    @Override
    public int getStopIndex() {
        return stopIndex;
    }

    public SelectStatement getSelect() {
        return select;
    }

    @Override
    public String getText() {
        return text;
    }

    public SubqueryType getSubqueryType() {
        return subqueryType;
    }

    public void setSubqueryType(SubqueryType subqueryType) {
        this.subqueryType = subqueryType;
    }
}