package top.kwseeker.antlr4.mysql.sharding.parser.mysql.visitor.statement.type;

import top.kwseeker.antlr4.mysql.autogen.MySQLStatementParser.*;
import top.kwseeker.antlr4.mysql.sharding.api.ASTNode;
import top.kwseeker.antlr4.mysql.sharding.api.visitor.statement.type.DMLStatementVisitor;
import top.kwseeker.antlr4.mysql.sharding.parser.mysql.visitor.statement.MySQLStatementVisitor;

import java.util.ArrayList;

public class MySQLDMLStatementVisitor extends MySQLStatementVisitor implements DMLStatementVisitor {

    //@Override
    //public ASTNode visitCall(final CallContext ctx) {
    //    List<ExpressionSegment> params = new ArrayList<>();
    //    ctx.expr().forEach(each -> params.add((ExpressionSegment) visit(each)));
    //    return new MySQLCallStatement(ctx.identifier().getText(), params);
    //}
    //
    //@Override
    //public ASTNode visitDoStatement(final DoStatementContext ctx) {
    //    List<ExpressionSegment> params = new ArrayList<>();
    //    ctx.expr().forEach(each -> params.add((ExpressionSegment) visit(each)));
    //    return new MySQLDoStatement(params);
    //}
    //
    //@Override
    //public ASTNode visitHandlerStatement(final HandlerStatementContext ctx) {
    //    return new MySQLHandlerStatement();
    //}
    //
    //@Override
    //public ASTNode visitImportStatement(final ImportStatementContext ctx) {
    //    return new MySQLImportStatement();
    //}
    //
    //@Override
    //public ASTNode visitLoadStatement(final LoadStatementContext ctx) {
    //    return null == ctx.loadDataStatement() ? visit(ctx.loadXmlStatement()) : visit(ctx.loadDataStatement());
    //}
    //
    //@Override
    //public ASTNode visitLoadDataStatement(final LoadDataStatementContext ctx) {
    //    return new MySQLLoadDataStatement((SimpleTableSegment) visit(ctx.tableName()));
    //}
    //
    //@Override
    //public ASTNode visitLoadXmlStatement(final LoadXmlStatementContext ctx) {
    //    return new MySQLLoadXMLStatement((SimpleTableSegment) visit(ctx.tableName()));
    //}
}
