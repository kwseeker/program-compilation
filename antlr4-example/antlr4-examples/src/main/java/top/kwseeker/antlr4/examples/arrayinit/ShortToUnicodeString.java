package top.kwseeker.antlr4.examples.arrayinit;

import top.kwseeker.antlr4.examples.arrayinit.autogen.ArrayInitBaseListener;
import top.kwseeker.antlr4.examples.arrayinit.autogen.ArrayInitParser;

public class ShortToUnicodeString extends ArrayInitBaseListener {
    /** Translate { to " */
    @Override
    public void enterInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    /** Translate } to " */
    @Override
    public void exitInit(ArrayInitParser.InitContext ctx) {
        System.out.print('"');
    }

    /** Translate integers to 4-digit hexadecimal strings prefixed with \\u */
    @Override
    public void enterValue(ArrayInitParser.ValueContext ctx) {
        // Assumes no nested array initializers
        int value = Integer.parseInt(ctx.INT().getText());
        System.out.printf("\\u%04x", value);
    }
}
