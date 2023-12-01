package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.SQLSegment;

import java.util.Collection;

public final class OrderBySegment implements SQLSegment {
    
    private final int startIndex;
    
    private final int stopIndex;
    
    private final Collection<OrderByItemSegment> orderByItems;

    public OrderBySegment(int startIndex, int stopIndex, Collection<OrderByItemSegment> orderByItems) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.orderByItems = orderByItems;
    }

    @Override
    public int getStartIndex() {
        return startIndex;
    }

    @Override
    public int getStopIndex() {
        return stopIndex;
    }

    public Collection<OrderByItemSegment> getOrderByItems() {
        return orderByItems;
    }
}