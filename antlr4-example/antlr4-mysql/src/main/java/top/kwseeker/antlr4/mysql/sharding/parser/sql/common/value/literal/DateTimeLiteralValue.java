package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.literal;

/**
 * Date time literal value.
 */
public final class DateTimeLiteralValue implements LiteralValue<String> {
    
    private final String dateTimeType;
    
    private final String dateTimeValue;
    
    private final boolean containsBrace;
    
    public DateTimeLiteralValue(final String dateTimeType, final String dateTimeValue, final boolean containsBrace) {
        this.dateTimeType = dateTimeType;
        this.dateTimeValue = containsBrace ? dateTimeValue.substring(1, dateTimeValue.length() - 1) : dateTimeValue;
        this.containsBrace = containsBrace;
    }
    
    @Override
    public String getValue() {
        if (containsBrace) {
            return "{" + dateTimeType + " " + dateTimeValue + "}";
        }
        return dateTimeType + " " + dateTimeValue;
    }
}
