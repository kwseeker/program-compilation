package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.IdentifierValue;

public final class TableSegmentBoundedInfo {
    
    private final IdentifierValue originalDatabase;
    
    private final IdentifierValue originalSchema;

    public TableSegmentBoundedInfo(IdentifierValue originalDatabase, IdentifierValue originalSchema) {
        this.originalDatabase = originalDatabase;
        this.originalSchema = originalSchema;
    }

    public IdentifierValue getOriginalDatabase() {
        return originalDatabase;
    }

    public IdentifierValue getOriginalSchema() {
        return originalSchema;
    }
}
