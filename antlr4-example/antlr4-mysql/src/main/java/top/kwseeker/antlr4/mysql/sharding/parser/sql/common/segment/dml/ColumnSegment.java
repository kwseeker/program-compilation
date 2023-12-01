package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml;

import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic.OwnerAvailable;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic.OwnerSegment;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.IdentifierValue;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * 列名部分，联表、WHERE 条件表达式中会用到
 */
public final class ColumnSegment implements ExpressionSegment, OwnerAvailable {

    private final int startIndex;
    private final int stopIndex;
    //列的标识符值
    private final IdentifierValue identifier;
    private List<IdentifierValue> nestedObjectAttributes;
    //所属的数据表
    private OwnerSegment owner;
    //private ColumnSegmentBoundedInfo columnBoundedInfo;
    //private ColumnSegmentBoundedInfo otherUsingColumnBoundedInfo;
    private boolean isVariable;

    public ColumnSegment(int startIndex, int stopIndex, IdentifierValue identifier) {
        this.startIndex = startIndex;
        this.stopIndex = stopIndex;
        this.identifier = identifier;
        //this.columnBoundedInfo = new ColumnSegmentBoundedInfo(identifier);
    }

    public String getQualifiedName() {
        String column = this.identifier.getValueWithQuoteCharacters();
        if (null != this.nestedObjectAttributes && !this.nestedObjectAttributes.isEmpty()) {
            column = String.join(".", column, (CharSequence)this.nestedObjectAttributes.stream()
                    .map(IdentifierValue::getValueWithQuoteCharacters).collect(Collectors.joining(".")));
        }

        return null == this.owner ? column : String.join(".", this.owner.getIdentifier().getValueWithQuoteCharacters(), column);
    }

    public String getExpression() {
        String column = this.identifier.getValue();
        if (null != this.nestedObjectAttributes && !this.nestedObjectAttributes.isEmpty()) {
            column = String.join(".", column, (CharSequence)this.nestedObjectAttributes.stream()
                    .map(IdentifierValue::getValue).collect(Collectors.joining(".")));
        }

        return null == this.owner ? column : String.join(".", this.owner.getIdentifier().getValue(), column);
    }

    public Optional<OwnerSegment> getOwner() {
        return Optional.ofNullable(this.owner);
    }

    public String getText() {
        return this.getExpression();
    }

    public int getStartIndex() {
        return this.startIndex;
    }

    public int getStopIndex() {
        return this.stopIndex;
    }

    public IdentifierValue getIdentifier() {
        return this.identifier;
    }

    public List<IdentifierValue> getNestedObjectAttributes() {
        return this.nestedObjectAttributes;
    }

    //public ColumnSegmentBoundedInfo getColumnBoundedInfo() {
    //    return this.columnBoundedInfo;
    //}
    //
    //public ColumnSegmentBoundedInfo getOtherUsingColumnBoundedInfo() {
    //    return this.otherUsingColumnBoundedInfo;
    //}

    public boolean isVariable() {
        return this.isVariable;
    }

    public void setNestedObjectAttributes(List<IdentifierValue> nestedObjectAttributes) {
        this.nestedObjectAttributes = nestedObjectAttributes;
    }

    public void setOwner(OwnerSegment owner) {
        this.owner = owner;
    }

    //public void setColumnBoundedInfo(ColumnSegmentBoundedInfo columnBoundedInfo) {
    //    this.columnBoundedInfo = columnBoundedInfo;
    //}
    //
    //public void setOtherUsingColumnBoundedInfo(ColumnSegmentBoundedInfo otherUsingColumnBoundedInfo) {
    //    this.otherUsingColumnBoundedInfo = otherUsingColumnBoundedInfo;
    //}

    public void setVariable(boolean isVariable) {
        this.isVariable = isVariable;
    }
}
