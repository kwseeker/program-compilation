package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.SQLSegment;

import java.util.Collection;
import java.util.LinkedList;

public final class ProjectionsSegment implements SQLSegment {
    
    private final int startIndex;
    private final int stopIndex;
    //可能查询多列
    private final Collection<ProjectionSegment> projections = new LinkedList<>();
    private boolean distinctRow;

    public ProjectionsSegment(int startIndex, int stopIndex) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
    }

    @Override
    public int getStartIndex() {
        return startIndex;
    }

    @Override
    public int getStopIndex() {
        return stopIndex;
    }

    public Collection<ProjectionSegment> getProjections() {
        return projections;
    }

    public boolean isDistinctRow() {
        return distinctRow;
    }

    public void setDistinctRow(boolean distinctRow) {
        this.distinctRow = distinctRow;
    }
}