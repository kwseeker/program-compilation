package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.SQLSegment;

public interface PaginationValueSegment extends SQLSegment {
    
    /**
     * Is bound opened.
     * 
     * @return bound opened
     */
    boolean isBoundOpened();
}