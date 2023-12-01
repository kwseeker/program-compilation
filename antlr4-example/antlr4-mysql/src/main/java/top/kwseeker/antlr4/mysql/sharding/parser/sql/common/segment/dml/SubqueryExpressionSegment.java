package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

//一个场景：联表条件中的表
public final class SubqueryExpressionSegment implements SimpleExpressionSegment {

    private final SubquerySegment subquery;

    public int getStartIndex() {
        return this.subquery.getStartIndex();
    }

    public int getStopIndex() {
        return this.subquery.getStopIndex();
    }

    public String getText() {
        return this.subquery.getText();
    }

    public SubqueryExpressionSegment(SubquerySegment subquery) {
        this.subquery = subquery;
    }

    public SubquerySegment getSubquery() {
        return this.subquery;
    }
}