package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.literal;

/**
 * Other literal value.
 */
public final class OtherLiteralValue implements LiteralValue<String> {
    
    private final String value;

    public OtherLiteralValue(String value) {
        this.value = value;
    }

    @Override
    public String getValue() {
        return value;
    }
}
