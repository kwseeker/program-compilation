package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.SQLSegment;

public final class WhereSegment implements SQLSegment {
    private final int startIndex;
    private final int stopIndex;
    private final ExpressionSegment expr;

    public WhereSegment(int startIndex, int stopIndex, ExpressionSegment expr) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.expr = expr;
    }

    @Override
    public int getStartIndex() {
        return this.startIndex;
    }

    @Override
    public int getStopIndex() {
        return this.stopIndex;
    }

    public ExpressionSegment getExpr() {
        return this.expr;
    }
}