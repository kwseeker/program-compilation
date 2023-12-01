package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml.SubquerySegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.IdentifierValue;

import java.util.Optional;

public final class SubqueryTableSegment implements TableSegment {
    
    private final SubquerySegment subquery;
    private AliasSegment alias;
    //private PivotSegment pivot;

    public SubqueryTableSegment(SubquerySegment subquery) {
        this.subquery = subquery;
    }

    @Override
    public Optional<String> getAliasName() {
        return null == alias ? Optional.empty() : Optional.ofNullable(alias.getIdentifier().getValue());
    }
    
    @Override
    public Optional<IdentifierValue> getAlias() {
        return Optional.ofNullable(alias).map(AliasSegment::getIdentifier);
    }

    //public Optional<PivotSegment> getPivot() {
    //    return Optional.ofNullable(pivot);
    //}

    public SubquerySegment getSubquery() {
        return subquery;
    }

    @Override
    public int getStartIndex() {
        return subquery.getStartIndex();
    }
    
    @Override
    public int getStopIndex() {
        return subquery.getStopIndex();
    }

    public Optional<AliasSegment> getAliasSegment() {
        return Optional.ofNullable(alias);
    }

    @Override
    public void setAlias(AliasSegment alias) {
        this.alias = alias;
    }

    //public void setPivot(PivotSegment pivot) {
    //    this.pivot = pivot;
    //}
}