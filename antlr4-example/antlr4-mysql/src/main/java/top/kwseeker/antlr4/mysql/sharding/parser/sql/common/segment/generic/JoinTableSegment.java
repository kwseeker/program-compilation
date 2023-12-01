package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml.ExpressionSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml.ProjectionSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.IdentifierValue;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;

/**
 * 表联结部分
 */
public final class JoinTableSegment implements TableSegment {
    //从被联结的表开始计在整个SQL字符串中的开始索引
    private int startIndex;
    //到联结子句结束在整个SQL字符串中的结束索引
    private int stopIndex;
    private AliasSegment alias;
    //被联结的表，联结关键字左边的表, 比如 "t1 left join t2 ..." 中的 "t1"
    private TableSegment left;
    //是否使用自然联结
    private boolean natural;
    //联结类型
    private String joinType;
    //右边的表
    private TableSegment right;
    //联结条件，ON ... 或 USING()
    private ExpressionSegment condition;
    //USING() 中的列, 暂时忽略解析USING
    //private List<ColumnSegment> using = Collections.emptyList();
    //private List<ColumnSegment> derivedUsing = Collections.emptyList();
    
    private Collection<ProjectionSegment> derivedJoinTableProjectionSegments = new LinkedList<>();
    
    @Override
    public Optional<String> getAliasName() {
        return null == alias ? Optional.empty() : Optional.ofNullable(alias.getIdentifier().getValue());
    }
    
    @Override
    public Optional<IdentifierValue> getAlias() {
        return Optional.ofNullable(alias).map(AliasSegment::getIdentifier);
    }

    public Optional<AliasSegment> getAliasSegment() {
        return Optional.ofNullable(alias);
    }

    @Override
    public int getStartIndex() {
        return startIndex;
    }

    public void setStartIndex(int startIndex) {
        this.startIndex = startIndex;
    }

    @Override
    public int getStopIndex() {
        return stopIndex;
    }

    public void setStopIndex(int stopIndex) {
        this.stopIndex = stopIndex;
    }

    @Override
    public void setAlias(AliasSegment alias) {
        this.alias = alias;
    }

    public TableSegment getLeft() {
        return left;
    }

    public void setLeft(TableSegment left) {
        this.left = left;
    }

    public boolean isNatural() {
        return natural;
    }

    public void setNatural(boolean natural) {
        this.natural = natural;
    }

    public String getJoinType() {
        return joinType;
    }

    public void setJoinType(String joinType) {
        this.joinType = joinType;
    }

    public TableSegment getRight() {
        return right;
    }

    public void setRight(TableSegment right) {
        this.right = right;
    }

    public ExpressionSegment getCondition() {
        return condition;
    }

    public void setCondition(ExpressionSegment condition) {
        this.condition = condition;
    }

    //public List<ColumnSegment> getUsing() {
    //    return using;
    //}
    //
    //public void setUsing(List<ColumnSegment> using) {
    //    this.using = using;
    //}
    //
    //public List<ColumnSegment> getDerivedUsing() {
    //    return derivedUsing;
    //}
    //
    //public void setDerivedUsing(List<ColumnSegment> derivedUsing) {
    //    this.derivedUsing = derivedUsing;
    //}

    public Collection<ProjectionSegment> getDerivedJoinTableProjectionSegments() {
        return derivedJoinTableProjectionSegments;
    }

    public void setDerivedJoinTableProjectionSegments(Collection<ProjectionSegment> derivedJoinTableProjectionSegments) {
        this.derivedJoinTableProjectionSegments = derivedJoinTableProjectionSegments;
    }
}