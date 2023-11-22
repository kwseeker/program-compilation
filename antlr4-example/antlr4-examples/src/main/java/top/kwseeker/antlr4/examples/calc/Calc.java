package top.kwseeker.antlr4.examples.calc;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.tree.ParseTree;
import top.kwseeker.antlr4.examples.calc.autogen.ExprCalcLexer;
import top.kwseeker.antlr4.examples.calc.autogen.ExprCalcParser;

public class Calc {

    public static void main(String[] args) throws Exception {
        //ANTLRInputStream 在 4.13.1 中已经弃用，官方推荐 CharStreams
        CharStream charStream = CharStreams.fromStream(System.in);

        ExprCalcLexer lexer = new ExprCalcLexer(charStream);
        CommonTokenStream tokenStream = new CommonTokenStream(lexer);
        ExprCalcParser parser = new ExprCalcParser(tokenStream);

        ParseTree tree = parser.prog(); //返回 prog 规则根节点

        ExprCalcEvalVisitor evalVisitor = new ExprCalcEvalVisitor();
        evalVisitor.visit(tree);
    }
}
