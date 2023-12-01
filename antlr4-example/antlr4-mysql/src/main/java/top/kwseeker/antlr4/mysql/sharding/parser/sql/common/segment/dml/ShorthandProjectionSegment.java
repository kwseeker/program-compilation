package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic.AliasSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic.OwnerAvailable;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic.OwnerSegment;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Optional;

//public final class ShorthandProjectionSegment implements ProjectionSegment, OwnerAvailable, AliasAvailable {
public final class ShorthandProjectionSegment implements ProjectionSegment, OwnerAvailable {

    private final int startIndex;
    private final int stopIndex;
    private AliasSegment alias;
    private OwnerSegment owner;
    private Collection<ProjectionSegment> actualProjectionSegments = new LinkedList<>();

    public ShorthandProjectionSegment(int startIndex, int stopIndex) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
    }

    @Override
    public int getStartIndex() {
        return this.startIndex;
    }

    @Override
    public int getStopIndex() {
        return this.stopIndex;
    }

    //
    @Override
    public String getColumnLabel() {
        return null;
    }

    //
    @Override
    public Optional<OwnerSegment> getOwner() {
        return Optional.empty();
    }

    //
    @Override
    public void setOwner(OwnerSegment owner) {
        this.owner = owner;
    }

    public void setAlias(AliasSegment alias) {
        this.alias = alias;
    }

}