package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.SQLSegment;

import java.util.Optional;

public final class LimitSegment implements SQLSegment {
    
    private final int startIndex;
    private final int stopIndex;
    //
    private final PaginationValueSegment offset;
    //
    private final PaginationValueSegment rowCount;

    public LimitSegment(int startIndex, int stopIndex, PaginationValueSegment offset, PaginationValueSegment rowCount) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.offset = offset;
        this.rowCount = rowCount;
    }

    @Override
    public int getStartIndex() {
        return 0;
    }

    @Override
    public int getStopIndex() {
        return 0;
    }

    /**
     * Get offset.
     * 
     * @return offset
     */
    public Optional<PaginationValueSegment> getOffset() {
        return Optional.ofNullable(offset);
    }
    
    /**
     * Get row count.
     *
     * @return row count
     */
    public Optional<PaginationValueSegment> getRowCount() {
        return Optional.ofNullable(rowCount);
    }
}
