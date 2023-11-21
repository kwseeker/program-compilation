package top.kwseeker.antlr4.examples.calc;

import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Calc {

    public static void main(String[] args) throws Exception {
        //从文件或标准输入读取内容
        String inputFile = null;
        if (args.length > 0)
            inputFile = args[0];
        InputStream is = System.in;
        if (inputFile != null) {
            is = Files.newInputStream(Paths.get(inputFile));
        }

        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String expr = br.readLine();              // get first expression
        int line = 1;                             // track input expr line numbers

        ExprSimpleParser parser = new ExprSimpleParser(null); // share single parser instance
        parser.setBuildParseTree(false);          // don't need trees

        while (expr != null) {             // while we have more expressions
            // create new lexer and token stream for each line (expression)
            ANTLRInputStream input = new ANTLRInputStream(expr + "\n");
            ExprSimpleLexer lexer = new ExprSimpleLexer(input);
            lexer.setLine(line);           // notify lexer of input position
            lexer.setCharPositionInLine(0);
            CommonTokenStream tokens = new CommonTokenStream(lexer);
            parser.setInputStream(tokens); // notify parser of new token stream
            parser.expr();                 // start the parser
            expr = br.readLine();          // see if there's another line
            line++;
        }
    }
}
