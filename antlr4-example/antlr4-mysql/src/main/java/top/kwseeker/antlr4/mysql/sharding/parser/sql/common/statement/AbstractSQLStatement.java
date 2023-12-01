package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.statement;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic.ParameterMarkerSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.statement.SQLStatement;

import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;

public class AbstractSQLStatement implements SQLStatement {

    private final Collection<ParameterMarkerSegment> parameterMarkerSegments = new LinkedList<>();

    private final Collection<Integer> uniqueParameterIndexes = new HashSet<>();

    @Override
    public int getParameterCount() {
        return uniqueParameterIndexes.size();
    }

    public void addParameterMarkerSegments(final Collection<ParameterMarkerSegment> parameterMarkerSegments) {
        for (ParameterMarkerSegment each : parameterMarkerSegments) {
            this.parameterMarkerSegments.add(each);
            uniqueParameterIndexes.add(each.getParameterIndex());
        }
    }
}
