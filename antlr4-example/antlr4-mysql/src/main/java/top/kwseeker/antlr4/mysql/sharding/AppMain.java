package top.kwseeker.antlr4.mysql.sharding;

import top.kwseeker.antlr4.mysql.sharding.infra.database.mysql.MySQLDatabaseType;
import top.kwseeker.antlr4.mysql.sharding.parser.api.SQLParserEngine;
import top.kwseeker.antlr4.mysql.sharding.parser.api.SQLStatementVisitorEngine;
import top.kwseeker.antlr4.mysql.sharding.parser.core.ParseASTNode;
import top.kwseeker.antlr4.mysql.sharding.parser.sql.statement.SQLStatement;

public class AppMain {

    public static void main(String[] args) {
        //假如分表场景中，有一个逻辑SQL如下，按order_id取模2的结果分两个表，逻辑SQL转实际SQL的流程：
        int orderId = 1001;
        //String sql = "select * from t_order where order_id = ?";
        String sql = "SELECT i.* FROM t_order o JOIN t_order_item i ON o.order_id=i.order_id WHERE o.user_id=? AND o.order_id=?";

        MySQLDatabaseType databaseType = new MySQLDatabaseType();

        //解析树
        SQLParserEngine engine = new SQLParserEngine(databaseType.getType());
        ParseASTNode astNode = engine.parse(sql, false);
        //ParseTree rootNode = astNode.getRootNode();

        //遍历解析树，转成更易读的 SQLStatement
        SQLStatementVisitorEngine visitorEngine = new SQLStatementVisitorEngine(databaseType);
        SQLStatement sqlStatement = visitorEngine.visit(astNode);

        //像ShardingSphere然后要做的就是再遍历 SQLStatement 对象，找到SQL中所有 TableSegment 中的表名，然后根据分表规则将表名替换为实际的表名
        //ShardingSphere遍历SQLStatement之后将表相关的信息加入了 SQLRewriteContext private final List<SQLToken> sqlTokens = new LinkedList<>();
        //可以研究下面代码看它是怎么提取表的信息的
        //public void generateSQLTokens() {
        //    this.sqlTokens.addAll(this.sqlTokenGenerators.generateSQLTokens(this.database.getName(), this.database.getSchemas(), this.sqlStatementContext, this.parameters, this.connectionContext));
        //}
    }

    //String sql = "SELECT i.* FROM t_order o JOIN t_order_item i ON o.order_id=i.order_id WHERE o.user_id=? AND o.order_id=?";
    //sqlStatement = {MySQLSelectStatement@1216}
    // limit = null
    // projections = {ProjectionsSegment@1217}
    //  startIndex = 7
    //  stopIndex = 9
    //  projections = {LinkedList@1222}  size = 1
    //   0 = {ShorthandProjectionSegment@1224}
    //    startIndex = 7
    //    stopIndex = 9
    //    alias = null
    //    owner = {OwnerSegment@1225}
    //    actualProjectionSegments = {LinkedList@1226}  size = 0
    //  distinctRow = false
    // from = {JoinTableSegment@1218}
    //  startIndex = 16
    //  stopIndex = 69
    //  alias = null
    //  left = {SimpleTableSegment@1233}
    //   tableName = {TableNameSegment@1238}
    //    startIndex = 16
    //    stopIndex = 22
    //    identifier = {IdentifierValue@1240}
    //     value = "t_order"
    //     quoteCharacter = {QuoteCharacter@1229} "NONE"
    //    tableBoundedInfo = null
    //   owner = null
    //   alias = {AliasSegment@1239}
    //    startIndex = 24
    //    stopIndex = 24
    //    identifier = {IdentifierValue@1242}
    //     value = "o"
    //     quoteCharacter = {QuoteCharacter@1229} "NONE"
    //  natural = false
    //  joinType = "INNER"
    //  right = {SimpleTableSegment@1235}
    //   tableName = {TableNameSegment@1244}
    //    startIndex = 31
    //    stopIndex = 42
    //    identifier = {IdentifierValue@1246}
    //     value = "t_order_item"
    //     quoteCharacter = {QuoteCharacter@1229} "NONE"
    //    tableBoundedInfo = null
    //   owner = null
    //   alias = {AliasSegment@1245}
    //    startIndex = 44
    //    stopIndex = 44
    //    identifier = {IdentifierValue@1248}
    //     value = "i"
    //     quoteCharacter = {QuoteCharacter@1229} "NONE"
    //  condition = {BinaryOperationExpression@1236}
    //   startIndex = 49
    //   stopIndex = 69
    //   left = {ColumnSegment@1250}
    //   right = {ColumnSegment@1251}
    //   operator = "="
    //   text = "o.order_id=i.order_id"
    //  derivedJoinTableProjectionSegments = {LinkedList@1237}  size = 0
    // where = {WhereSegment@1219}
    //  startIndex = 71
    //  stopIndex = 104
    //  expr = {BinaryOperationExpression@1254}
    //   startIndex = 77
    //   stopIndex = 104
    //   left = {BinaryOperationExpression@1255}
    //    startIndex = 77
    //    stopIndex = 87
    //    left = {ColumnSegment@1259}
    //     startIndex = 77
    //     stopIndex = 85
    //     identifier = {IdentifierValue@1276}
    //      value = "user_id"
    //      quoteCharacter = {QuoteCharacter@1229} "NONE"
    //     nestedObjectAttributes = null
    //     owner = {OwnerSegment@1277}
    //     isVariable = false
    //    right = {ParameterMarkerExpressionSegment@1260}
    //     startIndex = 87
    //     stopIndex = 87
    //     parameterMarkerIndex = 0
    //     parameterMarkerType = {ParameterMarkerType@1274} "QUESTION"
    //      marker = "?"
    //      name = "QUESTION"
    //      ordinal = 0
    //     alias = null
    //    operator = "="
    //    text = "o.user_id=?"
    //   right = {BinaryOperationExpression@1256}
    //    startIndex = 93
    //    stopIndex = 104
    //    left = {ColumnSegment@1263}
    //     startIndex = 93
    //     stopIndex = 102
    //     identifier = {IdentifierValue@1267}
    //      value = "order_id"
    //      quoteCharacter = {QuoteCharacter@1229} "NONE"
    //     nestedObjectAttributes = null
    //     owner = {OwnerSegment@1268}
    //     isVariable = false
    //    right = {ParameterMarkerExpressionSegment@1264}
    //     startIndex = 104
    //     stopIndex = 104
    //     parameterMarkerIndex = 1
    //     parameterMarkerType = {ParameterMarkerType@1274} "QUESTION"
    //     alias = null
    //    operator = "="
    //    text = "o.order_id=?"
    //   operator = "AND"
    //   text = "o.user_id=? AND o.order_id=?"
    // orderBy = null
    // parameterMarkerSegments = {LinkedList@1220}  size = 2
    //  0 = {ParameterMarkerExpressionSegment@1260}
    //  1 = {ParameterMarkerExpressionSegment@1264}
    // uniqueParameterIndexes = {HashSet@1221}  size = 2
    //  0 = {Integer@1272} 0
    //  1 = {Integer@1273} 1

    //String sql = "select * from t_order where order_id = ?";
    //sqlStatement = {MySQLSelectStatement@1212}
    // limit = null
    // projections = {ProjectionsSegment@1213}
    //  startIndex = 7
    //  stopIndex = 7
    //  projections = {LinkedList@1221}  size = 1
    //   0 = {ShorthandProjectionSegment@1223}
    //    startIndex = 7
    //    stopIndex = 7
    //    alias = null
    //    owner = null
    //    actualProjectionSegments = {LinkedList@1229}  size = 0
    //  distinctRow = false
    // from = {SimpleTableSegment@1214}
    //  tableName = {TableNameSegment@1220}
    //   startIndex = 14
    //   stopIndex = 20
    //   identifier = {IdentifierValue@1230}
    //    value = "t_order"
    //    quoteCharacter = {QuoteCharacter@1232} "NONE"
    //   tableBoundedInfo = null
    //  owner = null
    //  alias = null
    // where = {WhereSegment@1215}
    //  startIndex = 22
    //  stopIndex = 39
    //  expr = {BinaryOperationExpression@1224}
    //   startIndex = 28
    //   stopIndex = 39
    //   left = {ColumnSegment@1234}
    //    startIndex = 28
    //    stopIndex = 35
    //    identifier = {IdentifierValue@1237}
    //     value = "order_id"
    //     quoteCharacter = {QuoteCharacter@1232} "NONE"
    //    nestedObjectAttributes = null
    //    owner = null
    //    isVariable = false
    //   right = {ParameterMarkerExpressionSegment@1219}
    //    startIndex = 39
    //    stopIndex = 39
    //    parameterMarkerIndex = 0
    //    parameterMarkerType = {ParameterMarkerType@1225} "QUESTION"
    //     marker = "?"
    //     name = "QUESTION"
    //     ordinal = 0
    //    alias = null
    //   operator = "="
    //   text = "order_id = ?"
    // orderBy = null
    // parameterMarkerSegments = {LinkedList@1216}  size = 1
    //  0 = {ParameterMarkerExpressionSegment@1219}
    //   startIndex = 39
    //   stopIndex = 39
    //   parameterMarkerIndex = 0
    //   parameterMarkerType = {ParameterMarkerType@1225} "QUESTION"
    //    marker = "?"
    //    name = "QUESTION"
    //    ordinal = 0
    //   alias = null
    // uniqueParameterIndexes = {HashSet@1217}  size = 1
    //  0 = {Integer@1228} 0
}
