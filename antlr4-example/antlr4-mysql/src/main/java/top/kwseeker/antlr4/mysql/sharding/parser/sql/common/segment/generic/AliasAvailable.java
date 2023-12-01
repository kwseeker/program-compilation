package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.SQLSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.IdentifierValue;

import java.util.Optional;

public interface AliasAvailable extends SQLSegment {
    
    /**
     * Get alias name.
     *
     * @return alias name
     */
    Optional<String> getAliasName();
    
    /**
     * Get alias.
     *
     * @return alias
     */
    Optional<IdentifierValue> getAlias();
    
    /**
     * Set alias.
     *
     * @param alias alias
     */
    void setAlias(AliasSegment alias);
}