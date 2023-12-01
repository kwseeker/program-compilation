package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.SQLSegment;

public interface ProjectionSegment extends SQLSegment {
    
    /**
     * Get column label.
     *
     * @return column label
     */
    String getColumnLabel();
    
    /**
     * Judge whether column is visible or not.
     * 
     * @return whether column is visible or not
     */
    default boolean isVisible() {
        return true;
    }
}