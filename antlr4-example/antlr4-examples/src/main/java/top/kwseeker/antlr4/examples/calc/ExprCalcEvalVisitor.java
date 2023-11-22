package top.kwseeker.antlr4.examples.calc;

import top.kwseeker.antlr4.examples.calc.autogen.ExprCalcBaseVisitor;
import top.kwseeker.antlr4.examples.calc.autogen.ExprCalcParser;

import java.util.HashMap;
import java.util.Map;

public class ExprCalcEvalVisitor extends ExprCalcBaseVisitor<Integer> {

    Map<String, Integer> memory = new HashMap<>();

    /**
     * ID '=' expr NEWLINE
     */
    @Override
    public Integer visitAssign(ExprCalcParser.AssignContext ctx) {
        System.out.println("visitAssign called");
        String id = ctx.ID().getText();  // id is left-hand side of '='
        int value = visit(ctx.expr());   // compute value of expression on right
        memory.put(id, value);           // store it in our memory
        System.out.printf("%s => %d\n", id, value);
        return value;
    }

    /**
     * expr NEWLINE
     */
    @Override
    public Integer visitPrintExpr(ExprCalcParser.PrintExprContext ctx) {
        System.out.println("visitPrintExpr called " + ctx);
        Integer value = visit(ctx.expr()); // evaluate the expr child
        System.out.println("result:" + value); // print the result
        return 0;                          // return dummy value
    }

    /**
     * INT
     */
    @Override
    public Integer visitInt(ExprCalcParser.IntContext ctx) {
        System.out.println("visitInt called " + ctx);
        return Integer.valueOf(ctx.INT().getText());
    }

    /**
     * ID
     */
    @Override
    public Integer visitId(ExprCalcParser.IdContext ctx) {
        System.out.println("visitId called " + ctx);
        String id = ctx.ID().getText();
        if (memory.containsKey(id)) return memory.get(id);
        return 0;
    }

    /**
     * expr op=('*'|'/') expr
     */
    @Override
    public Integer visitMulDiv(ExprCalcParser.MulDivContext ctx) {
        System.out.println("visitMulDiv called " + ctx);
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        //if (ctx.op.getType() == ExprCalcParser.MUL)
        if (ctx.MUL() != null)
            return left * right;
        return left / right; // must be DIV
    }

    /**
     * expr op=('+'|'-') expr
     */
    @Override
    public Integer visitAddSub(ExprCalcParser.AddSubContext ctx) {
        System.out.println("visitAddSub called " + ctx);
        int left = visit(ctx.expr(0));  // get value of left subexpression
        int right = visit(ctx.expr(1)); // get value of right subexpression
        //if (ctx.op.getType() == ExprCalcParser.ADD)
        if (ctx.ADD() != null)
            return left + right;
        return left - right; // must be SUB
    }

    /**
     * '(' expr ')'
     */
    @Override
    public Integer visitParens(ExprCalcParser.ParensContext ctx) {
        System.out.println("visitParens called " + ctx);
        return visit(ctx.expr()); // return child expr's value
    }
}
