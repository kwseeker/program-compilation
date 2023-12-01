package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.SQLSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.IdentifierValue;

public final class TableNameSegment implements SQLSegment {
    
    private final int startIndex;
    private final int stopIndex;
    //表名
    private final IdentifierValue identifier;
    //表绑定信息，其实是数据库信息（数据库名）
    private TableSegmentBoundedInfo tableBoundedInfo;

    public TableNameSegment(int startIndex, int stopIndex, IdentifierValue identifier) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.identifier = identifier;
    }

    @Override
    public int getStartIndex() {
        return this.startIndex;
    }

    @Override
    public int getStopIndex() {
        return this.stopIndex;
    }

    public IdentifierValue getIdentifier() {
        return identifier;
    }

    public TableSegmentBoundedInfo getTableBoundedInfo() {
        return tableBoundedInfo;
    }

    public void setTableBoundedInfo(TableSegmentBoundedInfo tableBoundedInfo) {
        this.tableBoundedInfo = tableBoundedInfo;
    }
}