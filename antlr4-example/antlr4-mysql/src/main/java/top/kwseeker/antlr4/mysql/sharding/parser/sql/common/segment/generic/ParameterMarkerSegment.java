package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.SQLSegment;

public interface ParameterMarkerSegment extends SQLSegment {
    
    /**
     * Get parameter index.
     *
     * @return parameter index
     */
    int getParameterIndex();
}