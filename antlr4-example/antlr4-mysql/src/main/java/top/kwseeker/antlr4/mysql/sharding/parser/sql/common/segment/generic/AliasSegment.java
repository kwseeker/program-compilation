package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.SQLSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.IdentifierValue;

public final class AliasSegment implements SQLSegment {
    
    private final int startIndex;
    private final int stopIndex;
    
    private final IdentifierValue identifier;

    public AliasSegment(int startIndex, int stopIndex, IdentifierValue identifier) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.identifier = identifier;
    }

    @Override
    public int getStartIndex() {
        return startIndex;
    }

    @Override
    public int getStopIndex() {
        return stopIndex;
    }

    public IdentifierValue getIdentifier() {
        return identifier;
    }
}