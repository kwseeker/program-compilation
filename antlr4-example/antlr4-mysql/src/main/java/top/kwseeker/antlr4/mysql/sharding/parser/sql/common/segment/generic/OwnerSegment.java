package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.SQLSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.IdentifierValue;

import java.util.Optional;

/**
 * 其实指代的就是表名
 */
public final class OwnerSegment implements SQLSegment {
    
    private final int startIndex;
    private final int stopIndex;
    //表标识符节点，内部存储表名（支持带QuoteCharacter）
    private final IdentifierValue identifier;
    //这个owner代表“表”所属的“数据库（Schema）”节点
    private OwnerSegment owner;

    public OwnerSegment(int startIndex, int stopIndex, IdentifierValue identifier) {
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

    /**
     * Get owner.
     *
     * @return owner segment
     */
    public Optional<OwnerSegment> getOwner() {
        return Optional.ofNullable(owner);
    }

    public IdentifierValue getIdentifier() {
        return identifier;
    }

    public void setOwner(OwnerSegment owner) {
        this.owner = owner;
    }
}