package top.kwseeker.antlr4.mysql.sharding.parser.sql.common.enums;

import com.google.common.base.Strings;

import java.util.Arrays;

public enum QuoteCharacter {
    
    BACK_QUOTE("`", "`"),
    SINGLE_QUOTE("'", "'"),
    QUOTE("\"", "\""),
    BRACKETS("[", "]"),
    PARENTHESES("(", ")"),
    NONE("", "");
    
    private final String startDelimiter;

    private final String endDelimiter;

    QuoteCharacter(String startDelimiter, String endDelimiter) {
        this.startDelimiter = startDelimiter;
        this.endDelimiter = endDelimiter;
    }

    /**
     * Get quote character.
     * 
     * @param value value to be get quote character
     * @return value of quote character
     */
    public static QuoteCharacter getQuoteCharacter(final String value) {
        if (Strings.isNullOrEmpty(value)) {
            return NONE;
        }
        return Arrays.stream(values())
                .filter(each -> NONE != each && each.startDelimiter.charAt(0) == value.charAt(0))
                .findFirst().orElse(NONE);
    }
    
    /**
     * Wrap value with quote character.
     * 
     * @param value value to be wrapped
     * @return wrapped value
     */
    public String wrap(final String value) {
        return startDelimiter + value + endDelimiter;
    }
    
    /**
     * Unwrap value with quote character.
     *
     * @param value value to be unwrapped
     * @return unwrapped value
     */
    public String unwrap(final String value) {
        return isWrapped(value) ? value.substring(startDelimiter.length(), value.length() - endDelimiter.length()) : value;
    }
    
    /**
     * Is wrapped by quote character.
     * 
     * @param value value to be judged
     * @return is wrapped or not
     */
    public boolean isWrapped(final String value) {
        return value.startsWith(startDelimiter) && value.endsWith(endDelimiter);
    }
}
