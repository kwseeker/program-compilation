package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.IdentifierValue;

import java.util.Optional;

public final class SimpleTableSegment implements TableSegment, OwnerAvailable {
    
    private final TableNameSegment tableName;
    private OwnerSegment owner;
    private AliasSegment alias;
    //private PivotSegment pivot;

    public SimpleTableSegment(TableNameSegment tableName) {
        this.tableName = tableName;
    }

    @Override
    public int getStartIndex() {
        if (null == owner) {
            return tableName.getStartIndex();
        }
        return owner.getOwner().isPresent() ? owner.getOwner().get().getStartIndex() : owner.getStartIndex();
    }
    
    @Override
    public int getStopIndex() {
        return null == alias ? tableName.getStopIndex() : alias.getStopIndex();
    }
    
    @Override
    public Optional<OwnerSegment> getOwner() {
        return Optional.ofNullable(owner);
    }
    
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

    //public Optional<PivotSegment> getPivot() {
    //    return Optional.ofNullable(pivot);
    //}

    @Override
    public void setOwner(OwnerSegment owner) {
        this.owner = owner;
    }

    @Override
    public void setAlias(AliasSegment alias) {
        this.alias = alias;
    }

    //public void setPivot(PivotSegment pivot) {
    //    this.pivot = pivot;
    //}
}