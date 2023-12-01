package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic;

import java.util.Optional;

public interface OwnerAvailable {
    
    /**
     * Get owner.
     *
     * @return owner
     */
    Optional<OwnerSegment> getOwner();
    
    /**
     * Set owner.
     *
     * @param owner owner
     */
    void setOwner(OwnerSegment owner);
}