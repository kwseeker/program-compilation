// Generated from /home/arvin/mywork/program-compilation/antlr4-example/antlr4-mysql/src/main/antlr4/imports/BaseRule.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link BaseRuleParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface BaseRuleVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(BaseRuleParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#customKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomKeyword(BaseRuleParser.CustomKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(BaseRuleParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#string_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_(BaseRuleParser.String_Context ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#stringLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterals(BaseRuleParser.StringLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(BaseRuleParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#temporalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporalLiterals(BaseRuleParser.TemporalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiterals(BaseRuleParser.HexadecimalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitValueLiterals(BaseRuleParser.BitValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#booleanLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiterals(BaseRuleParser.BooleanLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueLiterals(BaseRuleParser.NullValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(BaseRuleParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(BaseRuleParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsUnambiguous(BaseRuleParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous1RolesAndLabels(BaseRuleParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous2Labels(BaseRuleParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous3Roles(BaseRuleParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous4SystemVariables(BaseRuleParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextOrIdentifier(BaseRuleParser.TextOrIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#ipAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpAddress(BaseRuleParser.IpAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(BaseRuleParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#userVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariable(BaseRuleParser.UserVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#systemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemVariable(BaseRuleParser.SystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalueSystemVariable(BaseRuleParser.RvalueSystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#setSystemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSystemVariable(BaseRuleParser.SetSystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#optionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionType(BaseRuleParser.OptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#internalVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalVariableName(BaseRuleParser.InternalVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExprOrDefault(BaseRuleParser.SetExprOrDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionCharacteristics(BaseRuleParser.TransactionCharacteristicsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#isolationLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationLevel(BaseRuleParser.IsolationLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#isolationTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationTypes(BaseRuleParser.IsolationTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionAccessMode(BaseRuleParser.TransactionAccessModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(BaseRuleParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#schemaNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaNames(BaseRuleParser.SchemaNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#charsetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetName(BaseRuleParser.CharsetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#schemaPairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaPairs(BaseRuleParser.SchemaPairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#schemaPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaPair(BaseRuleParser.SchemaPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(BaseRuleParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(BaseRuleParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(BaseRuleParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#constraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintName(BaseRuleParser.ConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#oldColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldColumn(BaseRuleParser.OldColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#newColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewColumn(BaseRuleParser.NewColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#delimiterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimiterName(BaseRuleParser.DelimiterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserIdentifierOrText(BaseRuleParser.UserIdentifierOrTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#username}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsername(BaseRuleParser.UsernameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventName(BaseRuleParser.EventNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#serverName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerName(BaseRuleParser.ServerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#wrapperName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapperName(BaseRuleParser.WrapperNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(BaseRuleParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(BaseRuleParser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#viewName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewName(BaseRuleParser.ViewNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(BaseRuleParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(BaseRuleParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(BaseRuleParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#tableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableList(BaseRuleParser.TableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#viewNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewNames(BaseRuleParser.ViewNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(BaseRuleParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#groupName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupName(BaseRuleParser.GroupNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#routineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineName(BaseRuleParser.RoutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#shardLibraryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardLibraryName(BaseRuleParser.ShardLibraryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#componentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentName(BaseRuleParser.ComponentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#pluginName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginName(BaseRuleParser.PluginNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(BaseRuleParser.HostnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(BaseRuleParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#cloneInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneInstance(BaseRuleParser.CloneInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#cloneDir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneDir(BaseRuleParser.CloneDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#channelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelName(BaseRuleParser.ChannelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#logName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogName(BaseRuleParser.LogNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#roleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleName(BaseRuleParser.RoleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleIdentifierOrText(BaseRuleParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#engineRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineRef(BaseRuleParser.EngineRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#triggerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerName(BaseRuleParser.TriggerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#triggerTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerTime(BaseRuleParser.TriggerTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#tableOrTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOrTables(BaseRuleParser.TableOrTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#userOrRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRole(BaseRuleParser.UserOrRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#partitionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionName(BaseRuleParser.PartitionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(BaseRuleParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOrPartitionNameList(BaseRuleParser.AllOrPartitionNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#triggerEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvent(BaseRuleParser.TriggerEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#triggerOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOrder(BaseRuleParser.TriggerOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(BaseRuleParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#andOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperator(BaseRuleParser.AndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#orOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperator(BaseRuleParser.OrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#notOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator(BaseRuleParser.NotOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(BaseRuleParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(BaseRuleParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(BaseRuleParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(BaseRuleParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(BaseRuleParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(BaseRuleParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(BaseRuleParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#onEmptyError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnEmptyError(BaseRuleParser.OnEmptyErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#columnRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRef(BaseRuleParser.ColumnRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#columnRefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRefList(BaseRuleParser.ColumnRefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(BaseRuleParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#udfFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdfFunction(BaseRuleParser.UdfFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(BaseRuleParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#jsonFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonFunction(BaseRuleParser.JsonFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonFunctionName(BaseRuleParser.JsonFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionName(BaseRuleParser.AggregationFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(BaseRuleParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#overClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause(BaseRuleParser.OverClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#windowSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpecification(BaseRuleParser.WindowSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#frameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameClause(BaseRuleParser.FrameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#frameStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStart(BaseRuleParser.FrameStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#frameEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameEnd(BaseRuleParser.FrameEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#frameBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBetween(BaseRuleParser.FrameBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#specialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(BaseRuleParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#currentUserFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentUserFunction(BaseRuleParser.CurrentUserFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#groupingFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingFunction(BaseRuleParser.GroupingFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupConcatFunction(BaseRuleParser.GroupConcatFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#windowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunction(BaseRuleParser.WindowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#windowingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowingClause(BaseRuleParser.WindowingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#leadLagInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeadLagInfo(BaseRuleParser.LeadLagInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#nullTreatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullTreatment(BaseRuleParser.NullTreatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#checkType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(BaseRuleParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#repairType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairType(BaseRuleParser.RepairTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(BaseRuleParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#convertFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertFunction(BaseRuleParser.ConvertFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#castType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastType(BaseRuleParser.CastTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#positionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunction(BaseRuleParser.PositionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#substringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringFunction(BaseRuleParser.SubstringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#extractFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunction(BaseRuleParser.ExtractFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#charFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunction(BaseRuleParser.CharFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#trimFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunction(BaseRuleParser.TrimFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#valuesFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesFunction(BaseRuleParser.ValuesFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#weightStringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeightStringFunction(BaseRuleParser.WeightStringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#levelClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelClause(BaseRuleParser.LevelClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelInWeightListElement(BaseRuleParser.LevelInWeightListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(BaseRuleParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorthandRegularFunction(BaseRuleParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleteRegularFunction(BaseRuleParser.CompleteRegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#regularFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName(BaseRuleParser.RegularFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#matchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpression(BaseRuleParser.MatchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchSearchModifier(BaseRuleParser.MatchSearchModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(BaseRuleParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#datetimeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeExpr(BaseRuleParser.DatetimeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLogFileIndexNumber(BaseRuleParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#caseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen(BaseRuleParser.CaseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#caseElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse(BaseRuleParser.CaseElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#intervalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpression(BaseRuleParser.IntervalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(BaseRuleParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#intervalUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalUnit(BaseRuleParser.IntervalUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(BaseRuleParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(BaseRuleParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(BaseRuleParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(BaseRuleParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(BaseRuleParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#textString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextString(BaseRuleParser.TextStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#textStringHash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStringHash(BaseRuleParser.TextStringHashContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#fieldOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOptions(BaseRuleParser.FieldOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(BaseRuleParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDatetimePrecision(BaseRuleParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetWithOptBinary(BaseRuleParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#ascii}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscii(BaseRuleParser.AsciiContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#unicode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicode(BaseRuleParser.UnicodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharset(BaseRuleParser.CharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#defaultCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCollation(BaseRuleParser.DefaultCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#defaultEncryption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultEncryption(BaseRuleParser.DefaultEncryptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#defaultCharset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCharset(BaseRuleParser.DefaultCharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#now}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNow(BaseRuleParser.NowContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#columnFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnFormat(BaseRuleParser.ColumnFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#storageMedia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageMedia(BaseRuleParser.StorageMediaContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(BaseRuleParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#keyOrIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyOrIndex(BaseRuleParser.KeyOrIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#fieldLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldLength(BaseRuleParser.FieldLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#characterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSet(BaseRuleParser.CharacterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#collateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateClause(BaseRuleParser.CollateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOrVarSpec(BaseRuleParser.FieldOrVarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(BaseRuleParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(BaseRuleParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#connectionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectionId(BaseRuleParser.ConnectionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#labelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelName(BaseRuleParser.LabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#cursorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorName(BaseRuleParser.CursorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#conditionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionName(BaseRuleParser.ConditionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#combineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombineOption(BaseRuleParser.CombineOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoWriteToBinLog(BaseRuleParser.NoWriteToBinLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link BaseRuleParser#channelOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelOption(BaseRuleParser.ChannelOptionContext ctx);
}