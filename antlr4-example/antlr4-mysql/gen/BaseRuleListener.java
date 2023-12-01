// Generated from /home/arvin/mywork/program-compilation/antlr4-example/antlr4-mysql/src/main/antlr4/imports/BaseRule.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link BaseRuleParser}.
 */
public interface BaseRuleListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(BaseRuleParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(BaseRuleParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#customKeyword}.
	 * @param ctx the parse tree
	 */
	void enterCustomKeyword(BaseRuleParser.CustomKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#customKeyword}.
	 * @param ctx the parse tree
	 */
	void exitCustomKeyword(BaseRuleParser.CustomKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(BaseRuleParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(BaseRuleParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(BaseRuleParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(BaseRuleParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(BaseRuleParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(BaseRuleParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(BaseRuleParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(BaseRuleParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#temporalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterTemporalLiterals(BaseRuleParser.TemporalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#temporalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitTemporalLiterals(BaseRuleParser.TemporalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(BaseRuleParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(BaseRuleParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(BaseRuleParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(BaseRuleParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(BaseRuleParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(BaseRuleParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(BaseRuleParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(BaseRuleParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(BaseRuleParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(BaseRuleParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(BaseRuleParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(BaseRuleParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsUnambiguous(BaseRuleParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsUnambiguous(BaseRuleParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous1RolesAndLabels(BaseRuleParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous1RolesAndLabels(BaseRuleParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous2Labels(BaseRuleParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous2Labels(BaseRuleParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous3Roles(BaseRuleParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous3Roles(BaseRuleParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous4SystemVariables(BaseRuleParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous4SystemVariables(BaseRuleParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTextOrIdentifier(BaseRuleParser.TextOrIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTextOrIdentifier(BaseRuleParser.TextOrIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#ipAddress}.
	 * @param ctx the parse tree
	 */
	void enterIpAddress(BaseRuleParser.IpAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#ipAddress}.
	 * @param ctx the parse tree
	 */
	void exitIpAddress(BaseRuleParser.IpAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(BaseRuleParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(BaseRuleParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void enterUserVariable(BaseRuleParser.UserVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void exitUserVariable(BaseRuleParser.UserVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSystemVariable(BaseRuleParser.SystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSystemVariable(BaseRuleParser.SystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 */
	void enterRvalueSystemVariable(BaseRuleParser.RvalueSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 */
	void exitRvalueSystemVariable(BaseRuleParser.RvalueSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#setSystemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetSystemVariable(BaseRuleParser.SetSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#setSystemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetSystemVariable(BaseRuleParser.SetSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#optionType}.
	 * @param ctx the parse tree
	 */
	void enterOptionType(BaseRuleParser.OptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#optionType}.
	 * @param ctx the parse tree
	 */
	void exitOptionType(BaseRuleParser.OptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#internalVariableName}.
	 * @param ctx the parse tree
	 */
	void enterInternalVariableName(BaseRuleParser.InternalVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#internalVariableName}.
	 * @param ctx the parse tree
	 */
	void exitInternalVariableName(BaseRuleParser.InternalVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterSetExprOrDefault(BaseRuleParser.SetExprOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitSetExprOrDefault(BaseRuleParser.SetExprOrDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 */
	void enterTransactionCharacteristics(BaseRuleParser.TransactionCharacteristicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 */
	void exitTransactionCharacteristics(BaseRuleParser.TransactionCharacteristicsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void enterIsolationLevel(BaseRuleParser.IsolationLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void exitIsolationLevel(BaseRuleParser.IsolationLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#isolationTypes}.
	 * @param ctx the parse tree
	 */
	void enterIsolationTypes(BaseRuleParser.IsolationTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#isolationTypes}.
	 * @param ctx the parse tree
	 */
	void exitIsolationTypes(BaseRuleParser.IsolationTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionAccessMode(BaseRuleParser.TransactionAccessModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionAccessMode(BaseRuleParser.TransactionAccessModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(BaseRuleParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(BaseRuleParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#schemaNames}.
	 * @param ctx the parse tree
	 */
	void enterSchemaNames(BaseRuleParser.SchemaNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#schemaNames}.
	 * @param ctx the parse tree
	 */
	void exitSchemaNames(BaseRuleParser.SchemaNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(BaseRuleParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(BaseRuleParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#schemaPairs}.
	 * @param ctx the parse tree
	 */
	void enterSchemaPairs(BaseRuleParser.SchemaPairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#schemaPairs}.
	 * @param ctx the parse tree
	 */
	void exitSchemaPairs(BaseRuleParser.SchemaPairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#schemaPair}.
	 * @param ctx the parse tree
	 */
	void enterSchemaPair(BaseRuleParser.SchemaPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#schemaPair}.
	 * @param ctx the parse tree
	 */
	void exitSchemaPair(BaseRuleParser.SchemaPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(BaseRuleParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(BaseRuleParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(BaseRuleParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(BaseRuleParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(BaseRuleParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(BaseRuleParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(BaseRuleParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(BaseRuleParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#oldColumn}.
	 * @param ctx the parse tree
	 */
	void enterOldColumn(BaseRuleParser.OldColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#oldColumn}.
	 * @param ctx the parse tree
	 */
	void exitOldColumn(BaseRuleParser.OldColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#newColumn}.
	 * @param ctx the parse tree
	 */
	void enterNewColumn(BaseRuleParser.NewColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#newColumn}.
	 * @param ctx the parse tree
	 */
	void exitNewColumn(BaseRuleParser.NewColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#delimiterName}.
	 * @param ctx the parse tree
	 */
	void enterDelimiterName(BaseRuleParser.DelimiterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#delimiterName}.
	 * @param ctx the parse tree
	 */
	void exitDelimiterName(BaseRuleParser.DelimiterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterUserIdentifierOrText(BaseRuleParser.UserIdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitUserIdentifierOrText(BaseRuleParser.UserIdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#username}.
	 * @param ctx the parse tree
	 */
	void enterUsername(BaseRuleParser.UsernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#username}.
	 * @param ctx the parse tree
	 */
	void exitUsername(BaseRuleParser.UsernameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterEventName(BaseRuleParser.EventNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitEventName(BaseRuleParser.EventNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#serverName}.
	 * @param ctx the parse tree
	 */
	void enterServerName(BaseRuleParser.ServerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#serverName}.
	 * @param ctx the parse tree
	 */
	void exitServerName(BaseRuleParser.ServerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void enterWrapperName(BaseRuleParser.WrapperNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void exitWrapperName(BaseRuleParser.WrapperNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(BaseRuleParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(BaseRuleParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(BaseRuleParser.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(BaseRuleParser.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(BaseRuleParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(BaseRuleParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(BaseRuleParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(BaseRuleParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(BaseRuleParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(BaseRuleParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(BaseRuleParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(BaseRuleParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#tableList}.
	 * @param ctx the parse tree
	 */
	void enterTableList(BaseRuleParser.TableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#tableList}.
	 * @param ctx the parse tree
	 */
	void exitTableList(BaseRuleParser.TableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#viewNames}.
	 * @param ctx the parse tree
	 */
	void enterViewNames(BaseRuleParser.ViewNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#viewNames}.
	 * @param ctx the parse tree
	 */
	void exitViewNames(BaseRuleParser.ViewNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(BaseRuleParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(BaseRuleParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#groupName}.
	 * @param ctx the parse tree
	 */
	void enterGroupName(BaseRuleParser.GroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#groupName}.
	 * @param ctx the parse tree
	 */
	void exitGroupName(BaseRuleParser.GroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#routineName}.
	 * @param ctx the parse tree
	 */
	void enterRoutineName(BaseRuleParser.RoutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#routineName}.
	 * @param ctx the parse tree
	 */
	void exitRoutineName(BaseRuleParser.RoutineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void enterShardLibraryName(BaseRuleParser.ShardLibraryNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void exitShardLibraryName(BaseRuleParser.ShardLibraryNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#componentName}.
	 * @param ctx the parse tree
	 */
	void enterComponentName(BaseRuleParser.ComponentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#componentName}.
	 * @param ctx the parse tree
	 */
	void exitComponentName(BaseRuleParser.ComponentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void enterPluginName(BaseRuleParser.PluginNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void exitPluginName(BaseRuleParser.PluginNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(BaseRuleParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(BaseRuleParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(BaseRuleParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(BaseRuleParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void enterCloneInstance(BaseRuleParser.CloneInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void exitCloneInstance(BaseRuleParser.CloneInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void enterCloneDir(BaseRuleParser.CloneDirContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void exitCloneDir(BaseRuleParser.CloneDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#channelName}.
	 * @param ctx the parse tree
	 */
	void enterChannelName(BaseRuleParser.ChannelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#channelName}.
	 * @param ctx the parse tree
	 */
	void exitChannelName(BaseRuleParser.ChannelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#logName}.
	 * @param ctx the parse tree
	 */
	void enterLogName(BaseRuleParser.LogNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#logName}.
	 * @param ctx the parse tree
	 */
	void exitLogName(BaseRuleParser.LogNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#roleName}.
	 * @param ctx the parse tree
	 */
	void enterRoleName(BaseRuleParser.RoleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#roleName}.
	 * @param ctx the parse tree
	 */
	void exitRoleName(BaseRuleParser.RoleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterRoleIdentifierOrText(BaseRuleParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitRoleIdentifierOrText(BaseRuleParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#engineRef}.
	 * @param ctx the parse tree
	 */
	void enterEngineRef(BaseRuleParser.EngineRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#engineRef}.
	 * @param ctx the parse tree
	 */
	void exitEngineRef(BaseRuleParser.EngineRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void enterTriggerName(BaseRuleParser.TriggerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void exitTriggerName(BaseRuleParser.TriggerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTime(BaseRuleParser.TriggerTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTime(BaseRuleParser.TriggerTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#tableOrTables}.
	 * @param ctx the parse tree
	 */
	void enterTableOrTables(BaseRuleParser.TableOrTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#tableOrTables}.
	 * @param ctx the parse tree
	 */
	void exitTableOrTables(BaseRuleParser.TableOrTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRole(BaseRuleParser.UserOrRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRole(BaseRuleParser.UserOrRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void enterPartitionName(BaseRuleParser.PartitionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void exitPartitionName(BaseRuleParser.PartitionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(BaseRuleParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(BaseRuleParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 */
	void enterAllOrPartitionNameList(BaseRuleParser.AllOrPartitionNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 */
	void exitAllOrPartitionNameList(BaseRuleParser.AllOrPartitionNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvent(BaseRuleParser.TriggerEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvent(BaseRuleParser.TriggerEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void enterTriggerOrder(BaseRuleParser.TriggerOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void exitTriggerOrder(BaseRuleParser.TriggerOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(BaseRuleParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(BaseRuleParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(BaseRuleParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(BaseRuleParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(BaseRuleParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(BaseRuleParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator(BaseRuleParser.NotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator(BaseRuleParser.NotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(BaseRuleParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(BaseRuleParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(BaseRuleParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(BaseRuleParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(BaseRuleParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(BaseRuleParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(BaseRuleParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(BaseRuleParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(BaseRuleParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(BaseRuleParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(BaseRuleParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(BaseRuleParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(BaseRuleParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(BaseRuleParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#onEmptyError}.
	 * @param ctx the parse tree
	 */
	void enterOnEmptyError(BaseRuleParser.OnEmptyErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#onEmptyError}.
	 * @param ctx the parse tree
	 */
	void exitOnEmptyError(BaseRuleParser.OnEmptyErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void enterColumnRef(BaseRuleParser.ColumnRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void exitColumnRef(BaseRuleParser.ColumnRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#columnRefList}.
	 * @param ctx the parse tree
	 */
	void enterColumnRefList(BaseRuleParser.ColumnRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#columnRefList}.
	 * @param ctx the parse tree
	 */
	void exitColumnRefList(BaseRuleParser.ColumnRefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(BaseRuleParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(BaseRuleParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#udfFunction}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunction(BaseRuleParser.UdfFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#udfFunction}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunction(BaseRuleParser.UdfFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(BaseRuleParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(BaseRuleParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunction(BaseRuleParser.JsonFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunction(BaseRuleParser.JsonFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunctionName(BaseRuleParser.JsonFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunctionName(BaseRuleParser.JsonFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(BaseRuleParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(BaseRuleParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(BaseRuleParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(BaseRuleParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(BaseRuleParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(BaseRuleParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpecification(BaseRuleParser.WindowSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpecification(BaseRuleParser.WindowSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(BaseRuleParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(BaseRuleParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void enterFrameStart(BaseRuleParser.FrameStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void exitFrameStart(BaseRuleParser.FrameStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void enterFrameEnd(BaseRuleParser.FrameEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void exitFrameEnd(BaseRuleParser.FrameEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void enterFrameBetween(BaseRuleParser.FrameBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void exitFrameBetween(BaseRuleParser.FrameBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(BaseRuleParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(BaseRuleParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#currentUserFunction}.
	 * @param ctx the parse tree
	 */
	void enterCurrentUserFunction(BaseRuleParser.CurrentUserFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#currentUserFunction}.
	 * @param ctx the parse tree
	 */
	void exitCurrentUserFunction(BaseRuleParser.CurrentUserFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#groupingFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupingFunction(BaseRuleParser.GroupingFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#groupingFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupingFunction(BaseRuleParser.GroupingFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupConcatFunction(BaseRuleParser.GroupConcatFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupConcatFunction(BaseRuleParser.GroupConcatFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunction(BaseRuleParser.WindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunction(BaseRuleParser.WindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowingClause(BaseRuleParser.WindowingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowingClause(BaseRuleParser.WindowingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#leadLagInfo}.
	 * @param ctx the parse tree
	 */
	void enterLeadLagInfo(BaseRuleParser.LeadLagInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#leadLagInfo}.
	 * @param ctx the parse tree
	 */
	void exitLeadLagInfo(BaseRuleParser.LeadLagInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void enterNullTreatment(BaseRuleParser.NullTreatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void exitNullTreatment(BaseRuleParser.NullTreatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#checkType}.
	 * @param ctx the parse tree
	 */
	void enterCheckType(BaseRuleParser.CheckTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#checkType}.
	 * @param ctx the parse tree
	 */
	void exitCheckType(BaseRuleParser.CheckTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#repairType}.
	 * @param ctx the parse tree
	 */
	void enterRepairType(BaseRuleParser.RepairTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#repairType}.
	 * @param ctx the parse tree
	 */
	void exitRepairType(BaseRuleParser.RepairTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(BaseRuleParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(BaseRuleParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void enterConvertFunction(BaseRuleParser.ConvertFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void exitConvertFunction(BaseRuleParser.ConvertFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#castType}.
	 * @param ctx the parse tree
	 */
	void enterCastType(BaseRuleParser.CastTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#castType}.
	 * @param ctx the parse tree
	 */
	void exitCastType(BaseRuleParser.CastTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunction(BaseRuleParser.PositionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunction(BaseRuleParser.PositionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstringFunction(BaseRuleParser.SubstringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstringFunction(BaseRuleParser.SubstringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(BaseRuleParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(BaseRuleParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(BaseRuleParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(BaseRuleParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunction(BaseRuleParser.TrimFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunction(BaseRuleParser.TrimFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#valuesFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunction(BaseRuleParser.ValuesFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#valuesFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunction(BaseRuleParser.ValuesFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightStringFunction(BaseRuleParser.WeightStringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightStringFunction(BaseRuleParser.WeightStringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#levelClause}.
	 * @param ctx the parse tree
	 */
	void enterLevelClause(BaseRuleParser.LevelClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#levelClause}.
	 * @param ctx the parse tree
	 */
	void exitLevelClause(BaseRuleParser.LevelClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(BaseRuleParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(BaseRuleParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(BaseRuleParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(BaseRuleParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 */
	void enterShorthandRegularFunction(BaseRuleParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 */
	void exitShorthandRegularFunction(BaseRuleParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 */
	void enterCompleteRegularFunction(BaseRuleParser.CompleteRegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 */
	void exitCompleteRegularFunction(BaseRuleParser.CompleteRegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName(BaseRuleParser.RegularFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName(BaseRuleParser.RegularFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression(BaseRuleParser.MatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression(BaseRuleParser.MatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 */
	void enterMatchSearchModifier(BaseRuleParser.MatchSearchModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 */
	void exitMatchSearchModifier(BaseRuleParser.MatchSearchModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(BaseRuleParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(BaseRuleParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#datetimeExpr}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeExpr(BaseRuleParser.DatetimeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#datetimeExpr}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeExpr(BaseRuleParser.DatetimeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogFileIndexNumber(BaseRuleParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogFileIndexNumber(BaseRuleParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen(BaseRuleParser.CaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen(BaseRuleParser.CaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse(BaseRuleParser.CaseElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse(BaseRuleParser.CaseElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(BaseRuleParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(BaseRuleParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(BaseRuleParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(BaseRuleParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit(BaseRuleParser.IntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit(BaseRuleParser.IntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(BaseRuleParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(BaseRuleParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(BaseRuleParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(BaseRuleParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(BaseRuleParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(BaseRuleParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(BaseRuleParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(BaseRuleParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(BaseRuleParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(BaseRuleParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#textString}.
	 * @param ctx the parse tree
	 */
	void enterTextString(BaseRuleParser.TextStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#textString}.
	 * @param ctx the parse tree
	 */
	void exitTextString(BaseRuleParser.TextStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#textStringHash}.
	 * @param ctx the parse tree
	 */
	void enterTextStringHash(BaseRuleParser.TextStringHashContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#textStringHash}.
	 * @param ctx the parse tree
	 */
	void exitTextStringHash(BaseRuleParser.TextStringHashContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void enterFieldOptions(BaseRuleParser.FieldOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void exitFieldOptions(BaseRuleParser.FieldOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(BaseRuleParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(BaseRuleParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 */
	void enterTypeDatetimePrecision(BaseRuleParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 */
	void exitTypeDatetimePrecision(BaseRuleParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 */
	void enterCharsetWithOptBinary(BaseRuleParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 */
	void exitCharsetWithOptBinary(BaseRuleParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#ascii}.
	 * @param ctx the parse tree
	 */
	void enterAscii(BaseRuleParser.AsciiContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#ascii}.
	 * @param ctx the parse tree
	 */
	void exitAscii(BaseRuleParser.AsciiContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#unicode}.
	 * @param ctx the parse tree
	 */
	void enterUnicode(BaseRuleParser.UnicodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#unicode}.
	 * @param ctx the parse tree
	 */
	void exitUnicode(BaseRuleParser.UnicodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#charset}.
	 * @param ctx the parse tree
	 */
	void enterCharset(BaseRuleParser.CharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#charset}.
	 * @param ctx the parse tree
	 */
	void exitCharset(BaseRuleParser.CharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#defaultCollation}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCollation(BaseRuleParser.DefaultCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#defaultCollation}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCollation(BaseRuleParser.DefaultCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#defaultEncryption}.
	 * @param ctx the parse tree
	 */
	void enterDefaultEncryption(BaseRuleParser.DefaultEncryptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#defaultEncryption}.
	 * @param ctx the parse tree
	 */
	void exitDefaultEncryption(BaseRuleParser.DefaultEncryptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#defaultCharset}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCharset(BaseRuleParser.DefaultCharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#defaultCharset}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCharset(BaseRuleParser.DefaultCharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#now}.
	 * @param ctx the parse tree
	 */
	void enterNow(BaseRuleParser.NowContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#now}.
	 * @param ctx the parse tree
	 */
	void exitNow(BaseRuleParser.NowContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#columnFormat}.
	 * @param ctx the parse tree
	 */
	void enterColumnFormat(BaseRuleParser.ColumnFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#columnFormat}.
	 * @param ctx the parse tree
	 */
	void exitColumnFormat(BaseRuleParser.ColumnFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#storageMedia}.
	 * @param ctx the parse tree
	 */
	void enterStorageMedia(BaseRuleParser.StorageMediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#storageMedia}.
	 * @param ctx the parse tree
	 */
	void exitStorageMedia(BaseRuleParser.StorageMediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(BaseRuleParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(BaseRuleParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#keyOrIndex}.
	 * @param ctx the parse tree
	 */
	void enterKeyOrIndex(BaseRuleParser.KeyOrIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#keyOrIndex}.
	 * @param ctx the parse tree
	 */
	void exitKeyOrIndex(BaseRuleParser.KeyOrIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void enterFieldLength(BaseRuleParser.FieldLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void exitFieldLength(BaseRuleParser.FieldLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet(BaseRuleParser.CharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet(BaseRuleParser.CharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause(BaseRuleParser.CollateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause(BaseRuleParser.CollateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 */
	void enterFieldOrVarSpec(BaseRuleParser.FieldOrVarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 */
	void exitFieldOrVarSpec(BaseRuleParser.FieldOrVarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(BaseRuleParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(BaseRuleParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(BaseRuleParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(BaseRuleParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#connectionId}.
	 * @param ctx the parse tree
	 */
	void enterConnectionId(BaseRuleParser.ConnectionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#connectionId}.
	 * @param ctx the parse tree
	 */
	void exitConnectionId(BaseRuleParser.ConnectionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(BaseRuleParser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(BaseRuleParser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(BaseRuleParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(BaseRuleParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void enterConditionName(BaseRuleParser.ConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void exitConditionName(BaseRuleParser.ConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#combineOption}.
	 * @param ctx the parse tree
	 */
	void enterCombineOption(BaseRuleParser.CombineOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#combineOption}.
	 * @param ctx the parse tree
	 */
	void exitCombineOption(BaseRuleParser.CombineOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 */
	void enterNoWriteToBinLog(BaseRuleParser.NoWriteToBinLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 */
	void exitNoWriteToBinLog(BaseRuleParser.NoWriteToBinLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link BaseRuleParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelOption(BaseRuleParser.ChannelOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link BaseRuleParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelOption(BaseRuleParser.ChannelOptionContext ctx);
}