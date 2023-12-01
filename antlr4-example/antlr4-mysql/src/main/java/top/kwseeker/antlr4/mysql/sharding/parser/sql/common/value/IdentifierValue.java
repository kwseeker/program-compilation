package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value;

import com.google.common.base.Strings;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.enums.QuoteCharacter;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.util.SQLUtils;

/**
 * 标识符
 */
public final class IdentifierValue implements ValueASTNode<String> {

    //标识符的文本字符串值，不包含 QuoteCharacter
    private final String value;
    //比如 `table1` 中的 “`”
    private final QuoteCharacter quoteCharacter;

    public IdentifierValue(String value, QuoteCharacter quoteCharacter) {
        this.value = value;
        this.quoteCharacter = quoteCharacter;
    }

    public IdentifierValue(final String text) {
        this(SQLUtils.getExactlyValue(text), QuoteCharacter.getQuoteCharacter(text));
    }
    
    public IdentifierValue(final String text, final String reservedCharacters) {
        this(SQLUtils.getExactlyValue(text, reservedCharacters), QuoteCharacter.getQuoteCharacter(text));
    }
    
    /**
     * Get value with quote characters, i.e. `table1` or `field1`
     *
     * @return value with quote characters
     */
    public String getValueWithQuoteCharacters() {
        return null == value ? "" : quoteCharacter.wrap(value);
    }
    
    /**
     * Get quoted content.
     *
     * @param text text
     * @return quote content
     */
    public static String getQuotedContent(final String text) {
        if (Strings.isNullOrEmpty(text)) {
            return text;
        }
        QuoteCharacter quoteCharacter = QuoteCharacter.getQuoteCharacter(text);
        if (QuoteCharacter.NONE == quoteCharacter) {
            return text.trim();
        }
        return text.substring(1, text.length() - 1);
    }

    @Override
    public String getValue() {
        return this.value;
    }
}