package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

/**
 * 条件表达式，比如联表 t1.a = t2.a
 * 类名（二元运算表达式）感觉名字起的不好, 不如 ConditionExpression
 */
public final class BinaryOperationExpression implements ExpressionSegment {

    private final int startIndex;
    private final int stopIndex;
    //如 t1.a
    private final ExpressionSegment left;
    //t2.a
    private final ExpressionSegment right;
    // =
    private final String operator;
    //如“t1.a = t2.a”
    private final String text;

    public BinaryOperationExpression(int startIndex, int stopIndex, ExpressionSegment left, ExpressionSegment right, String operator, String text) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.left = left;
        this.right = right;
        this.operator = operator;
        this.text = text;
    }

    @Override
    public int getStartIndex() {
        return this.startIndex;
    }

    @Override
    public int getStopIndex() {
        return this.stopIndex;
    }

    public ExpressionSegment getLeft() {
        return this.left;
    }

    public ExpressionSegment getRight() {
        return this.right;
    }

    public String getOperator() {
        return this.operator;
    }

    @Override
    public String getText() {
        return this.text;
    }
}