package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.literal;

/**
 * String literal value.
 */
public final class StringLiteralValue implements LiteralValue<String> {
    
    private final String value;
    
    public StringLiteralValue(final String value) {
        this.value = value.substring(1, value.length() - 1); //去掉两边的引号
    }
    
    //public static StringLiteralValue getStandardEscapesStringLiteralValue(final String value) {
    //    return new StringLiteralValue(StringUtils.replaceStandardEscapes(value));
    //}

    @Override
    public String getValue() {
        return value;
    }
}
