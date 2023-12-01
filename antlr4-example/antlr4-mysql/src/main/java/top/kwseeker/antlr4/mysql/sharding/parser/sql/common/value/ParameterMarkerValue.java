package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.enums.ParameterMarkerType;

public final class ParameterMarkerValue implements ValueASTNode<Integer> {
    private final Integer value;
    private final ParameterMarkerType type;

    public ParameterMarkerValue(Integer value, ParameterMarkerType type) {
        this.value = value;
        this.type = type;
    }

    @Override
    public Integer getValue() {
        return this.value;
    }

    public ParameterMarkerType getType() {
        return this.type;
    }
}