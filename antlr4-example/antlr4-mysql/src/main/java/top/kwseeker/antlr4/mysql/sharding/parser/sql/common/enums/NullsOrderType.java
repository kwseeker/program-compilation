package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.enums;

public enum NullsOrderType {
    
    /**
     * Nulls first.
     */
    FIRST,
    
    /**
     * Nulls last.
     */
    LAST;
    
    /**
     * Get reversed order type.
     * 
     * @return reversed order type
     */
    public NullsOrderType getReversedOrderType() {
        return this == FIRST ? LAST : FIRST;
    }
}