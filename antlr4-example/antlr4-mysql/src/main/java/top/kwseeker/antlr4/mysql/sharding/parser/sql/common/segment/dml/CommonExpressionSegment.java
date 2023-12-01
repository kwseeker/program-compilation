package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

public final class CommonExpressionSegment implements ComplexExpressionSegment {
    private final int startIndex;
    private final int stopIndex;
    private final String text;

    public CommonExpressionSegment(int startIndex, int stopIndex, String text) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.text = text;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public int getStopIndex() {
        return this.stopIndex;
    }

    public String getText() {
        return this.text;
    }
}