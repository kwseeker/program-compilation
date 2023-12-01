package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.enums.ParameterMarkerType;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic.AliasAvailable;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic.AliasSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic.ParameterMarkerSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.IdentifierValue;

import java.util.Optional;

public class ParameterMarkerExpressionSegment implements SimpleExpressionSegment, ProjectionSegment, AliasAvailable, ParameterMarkerSegment {

    private final int startIndex;
    private final int stopIndex;
    //该参数标记在标记列表中的索引
    private final int parameterMarkerIndex;
    //标记类型：？或 $
    private final ParameterMarkerType parameterMarkerType;
    private AliasSegment alias;

    public ParameterMarkerExpressionSegment(int startIndex, int stopIndex, int parameterMarkerIndex, ParameterMarkerType parameterMarkerType) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.parameterMarkerIndex = parameterMarkerIndex;
        this.parameterMarkerType = parameterMarkerType;
    }

    public String getColumnLabel() {
        return this.getAliasName().orElse(String.valueOf(this.parameterMarkerIndex));
    }

    public Optional<String> getAliasName() {
        return null == this.alias ? Optional.empty() : Optional.ofNullable(this.alias.getIdentifier().getValue());
    }

    public Optional<IdentifierValue> getAlias() {
        return Optional.ofNullable(this.alias).map(AliasSegment::getIdentifier);
    }

    public int getParameterIndex() {
        return this.parameterMarkerIndex;
    }

    public int getStopIndex() {
        return null == this.alias ? this.stopIndex : this.alias.getStopIndex();
    }

    public String getText() {
        return this.parameterMarkerType.getMarker();
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public int getParameterMarkerIndex() {
        return this.parameterMarkerIndex;
    }

    public ParameterMarkerType getParameterMarkerType() {
        return this.parameterMarkerType;
    }

    //lombok生成的
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        } else if (!(o instanceof ParameterMarkerExpressionSegment)) {
            return false;
        } else {
            ParameterMarkerExpressionSegment other = (ParameterMarkerExpressionSegment)o;
            if (!other.canEqual(this)) {
                return false;
            } else if (this.getStartIndex() != other.getStartIndex()) {
                return false;
            } else if (this.getStopIndex() != other.getStopIndex()) {
                return false;
            } else if (this.getParameterMarkerIndex() != other.getParameterMarkerIndex()) {
                return false;
            } else {
                Object this$parameterMarkerType = this.getParameterMarkerType();
                Object other$parameterMarkerType = other.getParameterMarkerType();
                if (this$parameterMarkerType == null) {
                    if (other$parameterMarkerType != null) {
                        return false;
                    }
                } else if (!this$parameterMarkerType.equals(other$parameterMarkerType)) {
                    return false;
                }

                Object this$alias = this.getAlias();
                Object other$alias = other.getAlias();
                if (this$alias == null) {
                    if (other$alias != null) {
                        return false;
                    }
                } else if (!this$alias.equals(other$alias)) {
                    return false;
                }

                return true;
            }
        }
    }

    protected boolean canEqual(Object other) {
        return other instanceof ParameterMarkerExpressionSegment;
    }

    public int hashCode() {
        int result = 1;
        result = result * 59 + this.getStartIndex();
        result = result * 59 + this.getStopIndex();
        result = result * 59 + this.getParameterMarkerIndex();
        Object $parameterMarkerType = this.getParameterMarkerType();
        result = result * 59 + ($parameterMarkerType == null ? 43 : $parameterMarkerType.hashCode());
        Object $alias = this.getAlias();
        result = result * 59 + ($alias == null ? 43 : $alias.hashCode());
        return result;
    }

    public void setAlias(AliasSegment alias) {
        this.alias = alias;
    }
}