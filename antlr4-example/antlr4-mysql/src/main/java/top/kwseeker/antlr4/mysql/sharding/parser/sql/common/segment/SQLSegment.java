package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment;

import top.kwseeker.antlr4.mysql.sharding.api.ASTNode;

/**
 * SQL segment.
 */
public interface SQLSegment extends ASTNode {
    
    /**
     * Get start index.
     *
     * @return start index
     */
    int getStartIndex();
    
    /**
     * Get stop index.
     *
     * @return stop index
     */
    int getStopIndex();
}
