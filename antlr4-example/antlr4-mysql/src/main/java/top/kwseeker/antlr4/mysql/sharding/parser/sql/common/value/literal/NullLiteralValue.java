package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.literal;

/**
 * Null literal value.
 */
public final class NullLiteralValue implements LiteralValue<String> {
    
    private final String value;

    public NullLiteralValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
