package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

public class LiteralExpressionSegment implements SimpleExpressionSegment {
    
    private final int startIndex;
    private final int stopIndex;
    private final Object literals;

    public String getText() {
        return this.literals.toString();
    }

    public LiteralExpressionSegment(int startIndex, int stopIndex, Object literals) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.literals = literals;
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public int getStopIndex() {
        return this.stopIndex;
    }

    public Object getLiterals() {
        return this.literals;
    }
}