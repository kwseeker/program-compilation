package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.literal;

/**
 * Boolean literal value.
 */
public final class BooleanLiteralValue implements LiteralValue<Boolean> {
    
    private final boolean value;
    
    public BooleanLiteralValue(final String value) {
        this.value = Boolean.parseBoolean(value);
    }
    
    @Override
    public Boolean getValue() {
        return value;
    }
}
