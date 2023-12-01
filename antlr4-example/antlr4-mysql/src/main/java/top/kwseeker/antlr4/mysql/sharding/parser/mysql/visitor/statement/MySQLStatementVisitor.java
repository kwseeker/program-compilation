package top.kwseeker.antlr4.mysql.sharding.parser.mysql.visitor.statement;

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.misc.Interval;
import top.kwseeker.antlr4.mysql.autogen.MySQLStatementBaseVisitor;
import top.kwseeker.antlr4.mysql.autogen.MySQLStatementParser.*;
import top.kwseeker.antlr4.mysql.sharding.api.ASTNode;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.enums.JoinType;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.enums.ParameterMarkerType;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.dml.*;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.segment.generic.*;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.util.SQLUtils;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.IdentifierValue;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.ParameterMarkerValue;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.common.value.literal.*;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.statement.mysql.dml.MySQLSelectStatement;

import java.util.Collection;
import java.util.LinkedList;

/**
 * 继承　MySQLStatementBaseVisitor　这一自动生成的　Visitor,
 * 重新定制访问者模式遍历方式
 * 遍历方式就是按 ANTLR4 定义的语法规则树进行深度优先遍历
 */
public abstract class MySQLStatementVisitor extends MySQLStatementBaseVisitor<ASTNode> {

    //参数标记
    private final Collection<ParameterMarkerSegment> parameterMarkerSegments = new LinkedList<>();

    /**
     * 这里只展示最简单最常规的 Select 语法, 完整的看 ShardingSphere 源码
     * select
     *     : queryExpression lockClauseList?
     *     | queryExpressionParens
     *     | selectWithInto
     *     ;
     */
    @Override
    public ASTNode visitSelect(SelectContext ctx) {
        //return super.visitSelect(ctx);
        MySQLSelectStatement result;
        //语法规则中定义了3种，这里只展示处理 queryExpression 也忽略加锁子句 lockClauseList
        if (ctx.queryExpression() != null) {
            //visit() 方法继承 AbstractParseTreeVisitor 用于深入遍历当前节点的某个子节点
            result = (MySQLSelectStatement) visit(ctx.queryExpression());
        } else {
            throw new RuntimeException("error grammar or not support yet");
        }
        result.addParameterMarkerSegments(getParameterMarkerSegments());
        return result;
    }

    /**
     * 这一层原本解析 with子句、(queryExpressionBody、queryExpressionParens)、order by 子句、limit 子句
     * queryExpression
     *     : withClause? (queryExpressionBody | queryExpressionParens) orderByClause? limitClause?
     *     ;
     * 这里只展示 queryExpressionBody、order by 子句、limit 子句
     */
    @Override
    public ASTNode visitQueryExpression(final QueryExpressionContext ctx) {
        MySQLSelectStatement result;
        if (ctx.queryExpressionBody() != null) {
            result = (MySQLSelectStatement) visit(ctx.queryExpressionBody());
        } else {
            throw new RuntimeException("error grammar or not support yet");
        }
        if (ctx.orderByClause() != null) {
            //TODO 重写 visitOrderBy()
            result.setOrderBy((OrderBySegment) visit(ctx.orderByClause()));
        }
        if (ctx.limitClause() != null) {
            //TODO 重写 visitLimit()
            result.setLimit((LimitSegment) visit(ctx.limitClause()));
        }
        return result;
    }

    /**
     * queryExpressionBody
     *     : queryPrimary
     *     | queryExpressionParens combineClause
     *     | queryExpressionBody combineClause
     *     ;
     * 这里只展示 queryPrimary
     */
    @Override
    public ASTNode visitQueryExpressionBody(QueryExpressionBodyContext ctx) {
        if (1 == ctx.getChildCount() && ctx.getChild(0) instanceof QueryPrimaryContext) {
            return visit(ctx.queryPrimary());
        }
        throw new RuntimeException("error grammar or not support yet");
    }

    /**
     * queryPrimary
     *     : querySpecification
     *     | tableValueConstructor
     *     | tableStatement
     *     ;
     * 这里只展示 querySpecification
     */
    //@Override
    //public ASTNode visitQueryPrimary(QueryPrimaryContext ctx) {
    //    return super.visitQueryPrimary(ctx);
    //}

    /**
     * querySpecification
     *     : SELECT selectSpecification* projections selectIntoExpression? fromClause? whereClause? groupByClause? havingClause? windowClause?
     *     ;
     * 这里只展示 SELECT projections fromClause? whereClause?
     */
    @Override
    public ASTNode visitQuerySpecification(QuerySpecificationContext ctx) {
        MySQLSelectStatement result = new MySQLSelectStatement();
        //SQL中查询的列名部分
        result.setProjections((ProjectionsSegment) visit(ctx.projections()));
        //SQL中的一些修饰符，暂略
        //if (null != ctx.selectSpecification()) {
        //    result.getProjections().setDistinctRow(isDistinct(ctx));
        //}
        //from 子句
        if (null != ctx.fromClause()) {
            if (null != ctx.fromClause().tableReferences()) {
                TableSegment tableSource = (TableSegment) visit(ctx.fromClause().tableReferences());
                result.setFrom(tableSource);
            }
            if (null != ctx.fromClause().DUAL()) {
                TableSegment tableSource = new SimpleTableSegment(new TableNameSegment(ctx.fromClause().DUAL().getSymbol().getStartIndex(),
                        ctx.fromClause().DUAL().getSymbol().getStopIndex(), new IdentifierValue(ctx.fromClause().DUAL().getText())));
                result.setFrom(tableSource);
            }
        }
        //where 子句
        if (null != ctx.whereClause()) {
            result.setWhere((WhereSegment) visit(ctx.whereClause()));
        }
        //group by 子句, 暂略
        //if (null != ctx.groupByClause()) {
        //    result.setGroupBy((GroupBySegment) visit(ctx.groupByClause()));
        //}
        return result;
    }

    /**
     * projections
     *     : (unqualifiedShorthand | projection) (COMMA_ projection)*
     *     ;
     */
    @Override
    public ASTNode visitProjections(final ProjectionsContext ctx) {
        Collection<ProjectionSegment> projections = new LinkedList<>();
        //如果列名部分有“*”，不包括“.*”这种情况
        if (null != ctx.unqualifiedShorthand()) {
            projections.add(new ShorthandProjectionSegment(ctx.unqualifiedShorthand().getStart().getStartIndex(),
                    ctx.unqualifiedShorthand().getStop().getStopIndex()));
        }
        //如果列名有逻辑运算符、“标识符.*”这种结构，比如 i.a
        for (ProjectionContext each : ctx.projection()) {
            projections.add((ProjectionSegment) visit(each));
        }

        ProjectionsSegment result = new ProjectionsSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex());
        result.getProjections().addAll(projections);
        return result;
    }

    /**
     * projection
     *     : expr (AS? alias)? | qualifiedShorthand
     *     ;
     * 这里只展示 qualifiedShorthand
     */
    @Override
    public ASTNode visitProjection(final ProjectionContext ctx) {
        if (null != ctx.qualifiedShorthand()) {
            return createShorthandProjection(ctx.qualifiedShorthand());
        }
        //其他语法暂时忽略
        throw new RuntimeException("error grammar or not support yet");
    }

    private ShorthandProjectionSegment createShorthandProjection(final QualifiedShorthandContext shorthand) {
        ShorthandProjectionSegment result = new ShorthandProjectionSegment(shorthand.getStart().getStartIndex(),
                shorthand.getStop().getStopIndex());
        //qualifiedShorthand
        //    : (identifier DOT_)? identifier DOT_ASTERISK_
        //    ;
        //由上面规则定义 identifier 可能有1或2个，比如 表.列 库.表.列，如果 identifier size 为 2, 第一个肯定代表库名，第二个代表表名
        IdentifierContext tableIdentifier = shorthand.identifier().get(shorthand.identifier().size() - 1);
        OwnerSegment tableSegment = new OwnerSegment(tableIdentifier.getStart().getStartIndex(),
                tableIdentifier.getStop().getStopIndex(), new IdentifierValue(tableIdentifier.getText()));
        result.setOwner(tableSegment);
        //如果是“库.表.列”
        if (shorthand.identifier().size() > 1) {
            IdentifierContext schemaIdentifier = shorthand.identifier().get(0);
            tableSegment.setOwner(new OwnerSegment(schemaIdentifier.getStart().getStartIndex(), schemaIdentifier.getStop().getStopIndex(),
                    new IdentifierValue(schemaIdentifier.getText())));
        }
        return result;
    }

    /**
     * 解析 FROM 表名部分，可能包含多个表名，比如联表查询时
     * tableReferences
     *     : tableReference (COMMA_ tableReference)*
     *     ;
     */
    @Override
    public ASTNode visitTableReferences(TableReferencesContext ctx) {
        TableSegment result = (TableSegment) visit(ctx.tableReference(0));
        //如果有多个表通过逗号连接，则是联表, 将联结表层层封装到一个JoinTableSegment
        if (ctx.tableReference().size() > 1) {
            for (int i = 1; i < ctx.tableReference().size(); i++) {
                result = generateJoinTableSourceFromEscapedTableReference(ctx.tableReference(i), result);
            }
        }
        return result;
    }

    private JoinTableSegment generateJoinTableSourceFromEscapedTableReference(final TableReferenceContext ctx, final TableSegment tableSegment) {
        JoinTableSegment result = new JoinTableSegment();
        result.setStartIndex(tableSegment.getStartIndex());
        result.setStopIndex(ctx.stop.getStopIndex());
        result.setLeft(tableSegment);
        result.setJoinType(JoinType.COMMA.name());
        result.setRight((TableSegment) visit(ctx));
        return result;
    }

    /**
     * tableReference
     *     : (tableFactor | LBE_ OJ escapedTableReference RBE_) joinedTable*
     * 这里只展示分析 tableFactor joinedTable*
     */
    @Override
    public ASTNode visitTableReference(final TableReferenceContext ctx) {
        TableSegment result;
        TableSegment left;
        //left = null == ctx.tableFactor() ? (TableSegment) visit(ctx.escapedTableReference()) : (TableSegment) visit(ctx.tableFactor());
        //tableFactor
        if (ctx.tableFactor() != null) {
            left = (TableSegment) visit(ctx.tableFactor());
        } else {
            //escapedTableReference
            throw new RuntimeException("not support yet");
        }
        //joinedTable*
        for (JoinedTableContext each : ctx.joinedTable()) {
            left = visitJoinedTable(each, left);
        }
        result = left;
        return result;
    }

    /**
     * tableFactor
     *     : tableName partitionNames? (AS? alias)? indexHintList? | subquery AS? alias (LP_ columnNames RP_)? | LATERAL subquery AS? alias (LP_ columnNames RP_)? | LP_ tableReferences RP_
     *     ;
     * 这里只展示解析 tableName (AS? alias)? | subquery AS? alias (LP_ columnNames RP_)? | LP_ tableReferences RP_
     * “subquery AS? alias (LP_ columnNames RP_)?” ： 这个分支可以支持子查询
     * “LP_ tableReferences RP_” ：加上这个分支可以支持多重子查询
     */
    @Override
    public ASTNode visitTableFactor(final TableFactorContext ctx) {
        //tableName部分
        if (null != ctx.tableName()) {
            SimpleTableSegment result = (SimpleTableSegment) visit(ctx.tableName());
            if (null != ctx.alias()) {
                result.setAlias((AliasSegment) visit(ctx.alias()));
            }
            return result;
        }
        //解析子查询部分
        if (null != ctx.subquery()) {
            MySQLSelectStatement subquery = (MySQLSelectStatement) visit(ctx.subquery());
            SubquerySegment subquerySegment = new SubquerySegment(ctx.subquery().start.getStartIndex(),
                    ctx.subquery().stop.getStopIndex(),
                    subquery,
                    getOriginalText(ctx.subquery()));
            SubqueryTableSegment result = new SubqueryTableSegment(subquerySegment);
            if (null != ctx.alias()) {
                result.setAlias((AliasSegment) visit(ctx.alias()));
            }
            return result;
        }
        //多重子查询
        return visit(ctx.tableReferences());
    }

    protected String getOriginalText(final ParserRuleContext ctx) {
        //获取派生此ParserRuleContext的CharStream（其实就是SQL语句的CharStream），从start.startIndex到stop.stopIndex的所有文本
        //比如对于子查询SubqueryContext，就是获取此子查询的文本字符串
        return ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
    }

    /**
     * alias
     *     : textOrIdentifier
     *     ;
     * textOrIdentifier
     *     : identifier | string_ | ipAddress
     *     ;
     */
    @Override
    public ASTNode visitAlias(AliasContext ctx) {
        //没有继续深入访问
        return new AliasSegment(ctx.start.getStartIndex(), ctx.stop.getStopIndex(),
                new IdentifierValue(ctx.textOrIdentifier().getText()));
    }

    /**
     * tableName
     *     : (owner DOT_)? name
     *     ;
     */
    @Override
    public final ASTNode visitTableName(final TableNameContext ctx) {
        SimpleTableSegment result = new SimpleTableSegment(new TableNameSegment(ctx.name().getStart().getStartIndex(),
                ctx.name().getStop().getStopIndex(), new IdentifierValue(ctx.name().identifier().getText())));
        OwnerContext owner = ctx.owner();
        if (null != owner) {
            result.setOwner((OwnerSegment) visit(owner));
        }
        return result;
    }

    @Override
    public final ASTNode visitOwner(final OwnerContext ctx) {
        return new OwnerSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(),
                (IdentifierValue) visit(ctx.identifier()));
    }

    /**
     * subquery
     *     : queryExpressionParens
     *     ;
     */
    @Override
    public ASTNode visitSubquery(final SubqueryContext ctx) {
        return visit(ctx.queryExpressionParens());
    }

    /**
     * queryExpressionParens
     *     : LP_ (queryExpressionParens | queryExpression lockClauseList?) RP_
     *     ;
     * 只展示解析 LP_ (queryExpressionParens | queryExpression) RP_
     */
    @Override
    public ASTNode visitQueryExpressionParens(QueryExpressionParensContext ctx) {
        if (ctx.queryExpressionParens() != null) {
            return visit(ctx.queryExpressionParens());
        }
        MySQLSelectStatement result = (MySQLSelectStatement) visit(ctx.queryExpression());
        result.addParameterMarkerSegments(getParameterMarkerSegments());
        return result;
    }

    /**
     * identifier
     *     : IDENTIFIER_	//这条后面的规则都不推荐
     *     | identifierKeywordsUnambiguous
     *     | identifierKeywordsAmbiguous1RolesAndLabels
     *     | identifierKeywordsAmbiguous2Labels
     *     | identifierKeywordsAmbiguous3Roles
     *     | identifierKeywordsAmbiguous4SystemVariables
     *     | customKeyword
     *     | DOUBLE_QUOTED_TEXT
     *     | UNDERSCORE_CHARSET
     *     | BQUOTA_STRING
     *     ;
     * 这里只展示 IDENTIFIER_
     */
    @Override
    public ASTNode visitIdentifier(IdentifierContext ctx) {
        return new IdentifierValue(ctx.getText());
    }

    /**
     * joinedTable
     *     : innerJoinType tableReference joinSpecification?
     *     | outerJoinType tableReference joinSpecification
     *     | naturalJoinType tableFactor
     *     ;
     * innerJoinType
     *     : (INNER | CROSS)? JOIN
     *     | STRAIGHT_JOIN
     *     ;
     * outerJoinType
     *     : (LEFT | RIGHT) OUTER? JOIN
     *     ;
     * naturalJoinType
     *     : NATURAL INNER? JOIN
     *     | NATURAL (LEFT | RIGHT) OUTER? JOIN
     *     ;
     *
     * @param tableSegment 被联结的表
     */
    private JoinTableSegment visitJoinedTable(final JoinedTableContext ctx, final TableSegment tableSegment) {
        //TODO 调试内存信息
        JoinTableSegment result = new JoinTableSegment();
        result.setLeft(tableSegment);
        result.setStartIndex(tableSegment.getStartIndex());
        result.setStopIndex(ctx.stop.getStopIndex());
        result.setJoinType(getJoinType(ctx));
        result.setNatural(null != ctx.naturalJoinType());
        TableSegment right = null == ctx.tableFactor() ? (TableSegment) visit(ctx.tableReference()) :
                (TableSegment) visit(ctx.tableFactor());
        result.setRight(right);
        return null == ctx.joinSpecification() ? result : visitJoinSpecification(ctx.joinSpecification(), result);
    }

    private String getJoinType(final JoinedTableContext ctx) {
        if (null != ctx.innerJoinType()) {  //innerJoinType()不为空说明适配了内联结的语法规则，就是内联结
            return JoinType.INNER.name();
        }
        if (null != ctx.outerJoinType()) {
            return null == ctx.outerJoinType().LEFT() ? JoinType.RIGHT.name() : JoinType.LEFT.name();
        }
        if (null != ctx.naturalJoinType()) { //自然联结
            NaturalJoinTypeContext naturalJoinTypeContext = ctx.naturalJoinType();
            if (null != naturalJoinTypeContext.LEFT()) {
                return JoinType.LEFT.name();
            }
            if (null != naturalJoinTypeContext.RIGHT()) {
                return JoinType.RIGHT.name();
            }
            return JoinType.INNER.name();
        }
        //使用逗号的内联结
        return JoinType.COMMA.name();
    }

    /**
     * 联结条件
     * joinSpecification
     *     : ON expr | USING LP_ columnNames RP_
     *     ;
     * 只展示 ON expr
     */
    private JoinTableSegment visitJoinSpecification(final JoinSpecificationContext ctx, final JoinTableSegment result) {
        if (null != ctx.expr()) {
            ExpressionSegment condition = (ExpressionSegment) visit(ctx.expr());
            result.setCondition(condition);
        }
        if (null != ctx.USING()) {
            //result.setUsing(ctx.columnNames().columnName().stream().map(each -> (ColumnSegment) visit(each)).collect(Collectors.toList()));
            throw new RuntimeException("not support yet");
        }
        return result;
    }

    /**
     * expr
     *     : booleanPrimary
     *     | expr andOperator expr
     *     | expr orOperator expr
     *     | expr XOR expr
     *     | notOperator expr
     *     ;
     * 只展示 booleanPrimary | expr andOperator expr
     */
    @Override
    public final ASTNode visitExpr(final ExprContext ctx) {
        if (null != ctx.booleanPrimary()) {
            return visit(ctx.booleanPrimary());
        }
        if (null != ctx.andOperator()) {
            return createBinaryOperationExpression(ctx, ctx.andOperator().getText());
        }
        //if (null != ctx.XOR()) {
        //    return createBinaryOperationExpression(ctx, "XOR");
        //}
        //if (null != ctx.orOperator()) {
        //    return createBinaryOperationExpression(ctx, ctx.orOperator().getText());
        //}
        //return new NotExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), (ExpressionSegment) visit(ctx.expr(0)), false);
        throw new RuntimeException("not support yet");
    }

    /**
     * 条件表达式（联表、WHERE中都会用到），比如：o.order_id = i.order_id
     * booleanPrimary
     *     : booleanPrimary IS NOT? (TRUE | FALSE | UNKNOWN | NULL)
     *     | booleanPrimary SAFE_EQ_ predicate
     *     | booleanPrimary MEMBER OF LP_ (expr) RP_
     *     | booleanPrimary comparisonOperator predicate
     *     | booleanPrimary comparisonOperator (ALL | ANY) subquery
     *     | booleanPrimary assignmentOperator predicate
     *     | predicate
     *     ;
     * 只展示解析 booleanPrimary comparisonOperator predicate
     * | booleanPrimary comparisonOperator (ALL | ANY) subquery
     * | predicate
     */
    @Override
    public ASTNode visitBooleanPrimary(BooleanPrimaryContext ctx) {
        if (ctx.comparisonOperator() != null) {
            //条件左值
            ExpressionSegment left = (ExpressionSegment) visit(ctx.booleanPrimary());
            //条件右值
            ExpressionSegment right;
            //comparisonOperator 右表有两种规则 predicate、(ALL | ANY) subquery
            if (ctx.predicate() != null) {
                right = (ExpressionSegment) visit(ctx.predicate());
            } else {
                right = new SubqueryExpressionSegment(new SubquerySegment(ctx.subquery().start.getStartIndex(),
                        ctx.subquery().stop.getStopIndex(),
                        (MySQLSelectStatement) visit(ctx.subquery()),
                        getOriginalText(ctx.subquery())
                        ));
            }
            //条件操作符号，比如 =
            String operator = ctx.comparisonOperator().getText();
            //条件文本字符串，比如：o.order_id = i.order_id
            String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
            return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, operator, text);
        }
        if (ctx.predicate() != null) {
            return visit(ctx.predicate());
        }
        //其他忽略
        throw new RuntimeException("not support yet");
    }

    private BinaryOperationExpression createBinaryOperationExpression(final ExprContext ctx, final String operator) {
        ExpressionSegment left = (ExpressionSegment) visit(ctx.expr(0));
        ExpressionSegment right = (ExpressionSegment) visit(ctx.expr(1));
        String text = ctx.start.getInputStream().getText(new Interval(ctx.start.getStartIndex(), ctx.stop.getStopIndex()));
        return new BinaryOperationExpression(ctx.start.getStartIndex(), ctx.stop.getStopIndex(), left, right, operator, text);
    }

    /**
     * predicate
     *     : bitExpr NOT? IN subquery
     *     | bitExpr NOT? IN LP_ expr (COMMA_ expr)* RP_
     *     | bitExpr NOT? BETWEEN bitExpr AND predicate
     *     | bitExpr SOUNDS LIKE bitExpr
     *     | bitExpr NOT? LIKE simpleExpr (ESCAPE simpleExpr)?
     *     | bitExpr NOT? (REGEXP | RLIKE) bitExpr
     *     | bitExpr
     *     ;
     * 在条件表达式中，属于右值
     * 这里只展示解析 bitExpr
     */
    @Override
    public ASTNode visitPredicate(PredicateContext ctx) {
        if (ctx.IN() != null || ctx.BETWEEN() != null || ctx.LIKE() != null
                || ctx.REGEXP() != null || ctx.RLIKE() != null) {
            throw new RuntimeException("not support yet");
        }
        return visit(ctx.bitExpr(0));
    }

    /**
     * bitExpr
     *     : bitExpr VERTICAL_BAR_ bitExpr
     *     | bitExpr AMPERSAND_ bitExpr
     *     | bitExpr SIGNED_LEFT_SHIFT_ bitExpr
     *     | bitExpr SIGNED_RIGHT_SHIFT_ bitExpr
     *     | bitExpr PLUS_ bitExpr
     *     | bitExpr MINUS_ bitExpr
     *     | bitExpr ASTERISK_ bitExpr
     *     | bitExpr SLASH_ bitExpr
     *     | bitExpr DIV bitExpr
     *     | bitExpr MOD bitExpr
     *     | bitExpr MOD_ bitExpr
     *     | bitExpr CARET_ bitExpr
     *     | bitExpr PLUS_ intervalExpression
     *     | bitExpr MINUS_ intervalExpression
     *     | simpleExpr
     *     ;
     * 这里只展示 simpleExpr
     */
    @Override
    public ASTNode visitBitExpr(BitExprContext ctx) {
        if (null != ctx.simpleExpr()) {
            return visit(ctx.simpleExpr());
        }
        throw new RuntimeException("not support yet");
    }

    /**
     * simpleExpr
     *     : functionCall
     *     | parameterMarker
     *     | literals
     *     | columnRef
     *     | simpleExpr collateClause
     *     | variable       //变量 @Xxx
     *     | simpleExpr VERTICAL_BAR_ VERTICAL_BAR_ simpleExpr
     *     | (PLUS_ | MINUS_ | TILDE_ | notOperator | BINARY) simpleExpr
     *     | ROW? LP_ expr (COMMA_ expr)* RP_
     *     | EXISTS? subquery
     *     | LBE_ identifier expr RBE_
     *     | identifier (JSON_SEPARATOR | JSON_UNQUOTED_SEPARATOR) string_
     *     | path (RETURNING dataType)? onEmptyError?
     *     | matchExpression
     *     | caseExpression
     *     | intervalExpression
     *     ;
     * 这里只分析 parameterMarker | literals | columnRef
     * parameterMarker  //参数标记"?"
     *     : QUESTION_
     *     ;
     * literals     //代表常量，比如字符串常量、数字
     * columnRef    //列引用
     *     : identifier (DOT_ identifier)? (DOT_ identifier)?
     *     ;
     *
     */
    @Override
    public final ASTNode visitSimpleExpr(final SimpleExprContext ctx) {
        int startIndex = ctx.start.getStartIndex();
        int stopIndex = ctx.stop.getStopIndex();
        //参数标记 ？ $
        if (null != ctx.parameterMarker()) {
            ParameterMarkerValue parameterMarker = (ParameterMarkerValue) visit(ctx.parameterMarker());
            ParameterMarkerExpressionSegment result = new ParameterMarkerExpressionSegment(startIndex, stopIndex,
                    parameterMarker.getValue(), parameterMarker.getType());
            parameterMarkerSegments.add(result);
            return result;
        }
        //常量
        if (null != ctx.literals()) {
            return SQLUtils.createLiteralExpression(visit(ctx.literals()), startIndex, stopIndex,
                    ctx.literals().start.getInputStream().getText(new Interval(startIndex, stopIndex)));
        }
        //列引用
        if (null != ctx.columnRef()) {
            return visit(ctx.columnRef());
        }
        throw new RuntimeException("not support yet");
    }

    /**
     * parameterMarker
     *     : QUESTION_
     *     ;
     */
    @Override
    public final ASTNode visitParameterMarker(final ParameterMarkerContext ctx) {
        //parameterMarkerSegments.size() 其实是当前参数标记在parameterMarkerSegments中的索引
        return new ParameterMarkerValue(parameterMarkerSegments.size(), ParameterMarkerType.QUESTION);
    }


    @Override
    public final ASTNode visitLiterals(final LiteralsContext ctx) {
        if (null != ctx.stringLiterals()) {
            return visit(ctx.stringLiterals());
        }
        if (null != ctx.numberLiterals()) {
            return visit(ctx.numberLiterals());
        }
        if (null != ctx.temporalLiterals()) {
            return visit(ctx.temporalLiterals());
        }
        if (null != ctx.hexadecimalLiterals()) {
            return visit(ctx.hexadecimalLiterals());
        }
        if (null != ctx.bitValueLiterals()) {
            return visit(ctx.bitValueLiterals());
        }
        if (null != ctx.booleanLiterals()) {
            return visit(ctx.booleanLiterals());
        }
        if (null != ctx.nullValueLiterals()) {
            return visit(ctx.nullValueLiterals());
        }
        throw new IllegalStateException("Literals must have string, number, dateTime, hex, bit, boolean or null.");
    }

    @Override
    public final ASTNode visitStringLiterals(final StringLiteralsContext ctx) {
        return new StringLiteralValue(ctx.getText());
    }

    @Override
    public final ASTNode visitNumberLiterals(final NumberLiteralsContext ctx) {
        return new NumberLiteralValue(ctx.getText());
    }

    /**
     * temporalLiterals
     *     : (DATE | TIME | TIMESTAMP) textString
     *     ;
     */
    @Override
    public ASTNode visitTemporalLiterals(final TemporalLiteralsContext ctx) {
        // TODO deal with TemporalLiterals
        return new OtherLiteralValue(ctx.getText());
    }

    @Override
    public final ASTNode visitHexadecimalLiterals(final HexadecimalLiteralsContext ctx) {
        // TODO deal with hexadecimalLiterals
        return new OtherLiteralValue(ctx.getText());
    }

    @Override
    public final ASTNode visitBitValueLiterals(final BitValueLiteralsContext ctx) {
        // TODO deal with bitValueLiterals
        return new OtherLiteralValue(ctx.getText());
    }

    @Override
    public final ASTNode visitBooleanLiterals(final BooleanLiteralsContext ctx) {
        return new BooleanLiteralValue(ctx.getText());
    }

    @Override
    public final ASTNode visitNullValueLiterals(final NullValueLiteralsContext ctx) {
        return new NullLiteralValue(ctx.getText());
    }

    /**
     * columnRef
     *     : identifier (DOT_ identifier)? (DOT_ identifier)?
     *     ;
     * 可能有3种格式：列、表.列、库.表.列
     */
    @Override
    public ASTNode visitColumnRef(final ColumnRefContext ctx) {
        int identifierCount = ctx.identifier().size();
        ColumnSegment result;
        if (1 == identifierCount) {         //"列"
            result = new ColumnSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(),
                    (IdentifierValue) visit(ctx.identifier(0)));
        } else if (2 == identifierCount) {  //表.列
            result = new ColumnSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(),
                    (IdentifierValue) visit(ctx.identifier(1)));    //列
            result.setOwner(new OwnerSegment(ctx.identifier(0).start.getStartIndex(),
                    ctx.identifier(0).stop.getStopIndex(),
                    (IdentifierValue) visit(ctx.identifier(0))));   //表
        } else {                            //库.表.列
            result = new ColumnSegment(ctx.getStart().getStartIndex(), ctx.getStop().getStopIndex(),
                    (IdentifierValue) visit(ctx.identifier(2)));    //列
            OwnerSegment owner = new OwnerSegment(ctx.identifier(1).start.getStartIndex(), ctx.identifier(1).stop.getStopIndex(),
                    (IdentifierValue) visit(ctx.identifier(1)));    //表
            owner.setOwner(new OwnerSegment(ctx.identifier(0).start.getStartIndex(), ctx.identifier(0).stop.getStopIndex(),
                    (IdentifierValue) visit(ctx.identifier(0))));   //库
            result.setOwner(owner);
        }
        return result;
    }

    /**
     * whereClause
     *     : WHERE expr
     *     ;
     */
    @Override
    public ASTNode visitWhereClause(final WhereClauseContext ctx) {
        ASTNode segment = visit(ctx.expr());
        return new WhereSegment(ctx.getStart().getStartIndex(),
                ctx.getStop().getStopIndex(), (ExpressionSegment) segment);
    }


    public Collection<ParameterMarkerSegment> getParameterMarkerSegments() {
        return parameterMarkerSegments;
    }
}
