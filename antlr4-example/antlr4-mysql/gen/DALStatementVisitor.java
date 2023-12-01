// Generated from /home/arvin/mywork/program-compilation/antlr4-example/antlr4-mysql/src/main/antlr4/imports/DALStatement.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link DALStatementParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface DALStatementVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#use}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUse(DALStatementParser.UseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#help}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHelp(DALStatementParser.HelpContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#explain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplain(DALStatementParser.ExplainContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#fromSchema}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromSchema(DALStatementParser.FromSchemaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#fromTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromTable(DALStatementParser.FromTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showLike}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowLike(DALStatementParser.ShowLikeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showWhereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowWhereClause(DALStatementParser.ShowWhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showFilter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFilter(DALStatementParser.ShowFilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfileType(DALStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#setVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetVariable(DALStatementParser.SetVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#optionValueList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionValueList(DALStatementParser.OptionValueListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#optionValueNoOptionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionValueNoOptionType(DALStatementParser.OptionValueNoOptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#equal}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEqual(DALStatementParser.EqualContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#optionValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionValue(DALStatementParser.OptionValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showBinaryLogs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowBinaryLogs(DALStatementParser.ShowBinaryLogsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showBinlogEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowBinlogEvents(DALStatementParser.ShowBinlogEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showCharacterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCharacterSet(DALStatementParser.ShowCharacterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCollation(DALStatementParser.ShowCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowColumns(DALStatementParser.ShowColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showCreateDatabase}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateDatabase(DALStatementParser.ShowCreateDatabaseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showCreateEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateEvent(DALStatementParser.ShowCreateEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showCreateFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateFunction(DALStatementParser.ShowCreateFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showCreateProcedure}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateProcedure(DALStatementParser.ShowCreateProcedureContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTable(DALStatementParser.ShowCreateTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showCreateTrigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateTrigger(DALStatementParser.ShowCreateTriggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showCreateUser}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateUser(DALStatementParser.ShowCreateUserContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showCreateView}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCreateView(DALStatementParser.ShowCreateViewContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showDatabases}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowDatabases(DALStatementParser.ShowDatabasesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showEngine}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEngine(DALStatementParser.ShowEngineContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showEngines}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEngines(DALStatementParser.ShowEnginesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showErrors}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowErrors(DALStatementParser.ShowErrorsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showEvents}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowEvents(DALStatementParser.ShowEventsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctionCode(DALStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showFunctionStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowFunctionStatus(DALStatementParser.ShowFunctionStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showGrants}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowGrants(DALStatementParser.ShowGrantsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowIndex(DALStatementParser.ShowIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showMasterStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowMasterStatus(DALStatementParser.ShowMasterStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showOpenTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowOpenTables(DALStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showPlugins}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPlugins(DALStatementParser.ShowPluginsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showPrivileges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowPrivileges(DALStatementParser.ShowPrivilegesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showProcedureCode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcedureCode(DALStatementParser.ShowProcedureCodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showProcedureStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcedureStatus(DALStatementParser.ShowProcedureStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showProcesslist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProcesslist(DALStatementParser.ShowProcesslistContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showProfile}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfile(DALStatementParser.ShowProfileContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showProfiles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowProfiles(DALStatementParser.ShowProfilesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showRelaylogEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowRelaylogEvent(DALStatementParser.ShowRelaylogEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showReplicas}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowReplicas(DALStatementParser.ShowReplicasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showSlaveHosts}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSlaveHosts(DALStatementParser.ShowSlaveHostsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showReplicaStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowReplicaStatus(DALStatementParser.ShowReplicaStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showSlaveStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowSlaveStatus(DALStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowStatus(DALStatementParser.ShowStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showTableStatus}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTableStatus(DALStatementParser.ShowTableStatusContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTables(DALStatementParser.ShowTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showTriggers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowTriggers(DALStatementParser.ShowTriggersContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowVariables(DALStatementParser.ShowVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showWarnings}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowWarnings(DALStatementParser.ShowWarningsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#showCharset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShowCharset(DALStatementParser.ShowCharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#setCharacter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetCharacter(DALStatementParser.SetCharacterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#clone}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitClone(DALStatementParser.CloneContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#cloneAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneAction(DALStatementParser.CloneActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#createLoadableFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateLoadableFunction(DALStatementParser.CreateLoadableFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#install}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstall(DALStatementParser.InstallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#uninstall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninstall(DALStatementParser.UninstallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#installComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstallComponent(DALStatementParser.InstallComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstallPlugin(DALStatementParser.InstallPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#uninstallComponent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninstallComponent(DALStatementParser.UninstallComponentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUninstallPlugin(DALStatementParser.UninstallPluginContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnalyzeTable(DALStatementParser.AnalyzeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#histogram}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHistogram(DALStatementParser.HistogramContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#checkTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTable(DALStatementParser.CheckTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#checkTableOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckTableOption(DALStatementParser.CheckTableOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChecksumTable(DALStatementParser.ChecksumTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptimizeTable(DALStatementParser.OptimizeTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#repairTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairTable(DALStatementParser.RepairTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#alterResourceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlterResourceGroup(DALStatementParser.AlterResourceGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#vcpuSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVcpuSpec(DALStatementParser.VcpuSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#createResourceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCreateResourceGroup(DALStatementParser.CreateResourceGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#dropResourceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDropResourceGroup(DALStatementParser.DropResourceGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#setResourceGroup}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetResourceGroup(DALStatementParser.SetResourceGroupContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#binlog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinlog(DALStatementParser.BinlogContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#cacheIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheIndex(DALStatementParser.CacheIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#cacheTableIndexList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCacheTableIndexList(DALStatementParser.CacheTableIndexListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#partitionList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionList(DALStatementParser.PartitionListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#flush}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlush(DALStatementParser.FlushContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#flushOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlushOption(DALStatementParser.FlushOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tablesOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTablesOption(DALStatementParser.TablesOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#kill}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKill(DALStatementParser.KillContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#loadIndexInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadIndexInfo(DALStatementParser.LoadIndexInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#loadTableIndexList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadTableIndexList(DALStatementParser.LoadTableIndexListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetStatement(DALStatementParser.ResetStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#resetOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetOption(DALStatementParser.ResetOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#resetPersist}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitResetPersist(DALStatementParser.ResetPersistContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#restart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRestart(DALStatementParser.RestartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#shutdown}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShutdown(DALStatementParser.ShutdownContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#explainType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainType(DALStatementParser.ExplainTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#explainableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExplainableStatement(DALStatementParser.ExplainableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#formatName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFormatName(DALStatementParser.FormatNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#delimiter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimiter(DALStatementParser.DelimiterContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#show}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShow(DALStatementParser.ShowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#insert}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsert(DALStatementParser.InsertContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSpecification(DALStatementParser.InsertSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertValuesClause(DALStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#fields}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFields(DALStatementParser.FieldsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertIdentifier(DALStatementParser.InsertIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tableWild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableWild(DALStatementParser.TableWildContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInsertSelectClause(DALStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnDuplicateKeyClause(DALStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#valueReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValueReference(DALStatementParser.ValueReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDerivedColumns(DALStatementParser.DerivedColumnsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#replace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplace(DALStatementParser.ReplaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#replaceSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceSpecification(DALStatementParser.ReplaceSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#replaceValuesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceValuesClause(DALStatementParser.ReplaceValuesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#replaceSelectClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitReplaceSelectClause(DALStatementParser.ReplaceSelectClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(DALStatementParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdateSpecification_(DALStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignment(DALStatementParser.AssignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetAssignmentsClause(DALStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValues(DALStatementParser.AssignmentValuesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentValue(DALStatementParser.AssignmentValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#blobValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlobValue(DALStatementParser.BlobValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#delete}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelete(DALStatementParser.DeleteContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDeleteSpecification(DALStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSingleTableClause(DALStatementParser.SingleTableClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultipleTablesClause(DALStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#select}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelect(DALStatementParser.SelectContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectWithInto(DALStatementParser.SelectWithIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpression(DALStatementParser.QueryExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpressionBody(DALStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#combineClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombineClause(DALStatementParser.CombineClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryExpressionParens(DALStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQueryPrimary(DALStatementParser.QueryPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuerySpecification(DALStatementParser.QuerySpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCall(DALStatementParser.CallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#doStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDoStatement(DALStatementParser.DoStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerStatement(DALStatementParser.HandlerStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerOpenStatement(DALStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerReadIndexStatement(DALStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerReadStatement(DALStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHandlerCloseStatement(DALStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#importStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitImportStatement(DALStatementParser.ImportStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#loadStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadStatement(DALStatementParser.LoadStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadDataStatement(DALStatementParser.LoadDataStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLoadXmlStatement(DALStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableStatement(DALStatementParser.TableStatementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableValueConstructor(DALStatementParser.TableValueConstructorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRowConstructorList(DALStatementParser.RowConstructorListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#withClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithClause(DALStatementParser.WithClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#cteClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCteClause(DALStatementParser.CteClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectSpecification(DALStatementParser.SelectSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDuplicateSpecification(DALStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#projections}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjections(DALStatementParser.ProjectionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#projection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProjection(DALStatementParser.ProjectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnqualifiedShorthand(DALStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQualifiedShorthand(DALStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#fromClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFromClause(DALStatementParser.FromClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReferences(DALStatementParser.TableReferencesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEscapedTableReference(DALStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tableReference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableReference(DALStatementParser.TableReferenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableFactor(DALStatementParser.TableFactorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionNames(DALStatementParser.PartitionNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHintList(DALStatementParser.IndexHintListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#indexHint}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexHint(DALStatementParser.IndexHintContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinedTable(DALStatementParser.JoinedTableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInnerJoinType(DALStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOuterJoinType(DALStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNaturalJoinType(DALStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoinSpecification(DALStatementParser.JoinSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#whereClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhereClause(DALStatementParser.WhereClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupByClause(DALStatementParser.GroupByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#havingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHavingClause(DALStatementParser.HavingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#limitClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitClause(DALStatementParser.LimitClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitRowCount(DALStatementParser.LimitRowCountContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimitOffset(DALStatementParser.LimitOffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#windowClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowClause(DALStatementParser.WindowClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#windowItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowItem(DALStatementParser.WindowItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#subquery}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubquery(DALStatementParser.SubqueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectLinesInto(DALStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectFieldsInto(DALStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSelectIntoExpression(DALStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#lockClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClause(DALStatementParser.LockClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockClauseList(DALStatementParser.LockClauseListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockStrength(DALStatementParser.LockStrengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLockedRowAction(DALStatementParser.LockedRowActionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableLockingList(DALStatementParser.TableLockingListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableIdentOptWild(DALStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableAliasRefList(DALStatementParser.TableAliasRefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParameterMarker(DALStatementParser.ParameterMarkerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCustomKeyword(DALStatementParser.CustomKeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#literals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLiterals(DALStatementParser.LiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#string_}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_(DALStatementParser.String_Context ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringLiterals(DALStatementParser.StringLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNumberLiterals(DALStatementParser.NumberLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTemporalLiterals(DALStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHexadecimalLiterals(DALStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitValueLiterals(DALStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanLiterals(DALStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullValueLiterals(DALStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#collationName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollationName(DALStatementParser.CollationNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#identifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifier(DALStatementParser.IdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsUnambiguous(DALStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous1RolesAndLabels(DALStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous2Labels(DALStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous3Roles(DALStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierKeywordsAmbiguous4SystemVariables(DALStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextOrIdentifier(DALStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIpAddress(DALStatementParser.IpAddressContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#variable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(DALStatementParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#userVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserVariable(DALStatementParser.UserVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSystemVariable(DALStatementParser.SystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRvalueSystemVariable(DALStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetSystemVariable(DALStatementParser.SetSystemVariableContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#optionType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOptionType(DALStatementParser.OptionTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalVariableName(DALStatementParser.InternalVariableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSetExprOrDefault(DALStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionCharacteristics(DALStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationLevel(DALStatementParser.IsolationLevelContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIsolationTypes(DALStatementParser.IsolationTypesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTransactionAccessMode(DALStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#schemaName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaName(DALStatementParser.SchemaNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#schemaNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaNames(DALStatementParser.SchemaNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#charsetName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetName(DALStatementParser.CharsetNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#schemaPairs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaPairs(DALStatementParser.SchemaPairsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#schemaPair}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSchemaPair(DALStatementParser.SchemaPairContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tableName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableName(DALStatementParser.TableNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#columnName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnName(DALStatementParser.ColumnNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#indexName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIndexName(DALStatementParser.IndexNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#constraintName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstraintName(DALStatementParser.ConstraintNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOldColumn(DALStatementParser.OldColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#newColumn}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNewColumn(DALStatementParser.NewColumnContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDelimiterName(DALStatementParser.DelimiterNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserIdentifierOrText(DALStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#username}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUsername(DALStatementParser.UsernameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#eventName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEventName(DALStatementParser.EventNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#serverName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitServerName(DALStatementParser.ServerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrapperName(DALStatementParser.WrapperNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#functionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionName(DALStatementParser.FunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#procedureName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProcedureName(DALStatementParser.ProcedureNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#viewName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewName(DALStatementParser.ViewNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#owner}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOwner(DALStatementParser.OwnerContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(DALStatementParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(DALStatementParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tableList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableList(DALStatementParser.TableListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#viewNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitViewNames(DALStatementParser.ViewNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#columnNames}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnNames(DALStatementParser.ColumnNamesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#groupName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupName(DALStatementParser.GroupNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#routineName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoutineName(DALStatementParser.RoutineNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShardLibraryName(DALStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#componentName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComponentName(DALStatementParser.ComponentNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#pluginName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPluginName(DALStatementParser.PluginNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#hostname}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHostname(DALStatementParser.HostnameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#port}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPort(DALStatementParser.PortContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneInstance(DALStatementParser.CloneInstanceContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCloneDir(DALStatementParser.CloneDirContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#channelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelName(DALStatementParser.ChannelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#logName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogName(DALStatementParser.LogNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#roleName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleName(DALStatementParser.RoleNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRoleIdentifierOrText(DALStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#engineRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEngineRef(DALStatementParser.EngineRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#triggerName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerName(DALStatementParser.TriggerNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerTime(DALStatementParser.TriggerTimeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTableOrTables(DALStatementParser.TableOrTablesContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUserOrRole(DALStatementParser.UserOrRoleContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#partitionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartitionName(DALStatementParser.PartitionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#identifierList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIdentifierList(DALStatementParser.IdentifierListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAllOrPartitionNameList(DALStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerEvent(DALStatementParser.TriggerEventContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTriggerOrder(DALStatementParser.TriggerOrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(DALStatementParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#andOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAndOperator(DALStatementParser.AndOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#orOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrOperator(DALStatementParser.OrOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#notOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNotOperator(DALStatementParser.NotOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBooleanPrimary(DALStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAssignmentOperator(DALStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonOperator(DALStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#predicate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPredicate(DALStatementParser.PredicateContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBitExpr(DALStatementParser.BitExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimpleExpr(DALStatementParser.SimpleExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#path}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPath(DALStatementParser.PathContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#onEmptyError}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOnEmptyError(DALStatementParser.OnEmptyErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#columnRef}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRef(DALStatementParser.ColumnRefContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnRefList(DALStatementParser.ColumnRefListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#functionCall}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunctionCall(DALStatementParser.FunctionCallContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUdfFunction(DALStatementParser.UdfFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunction(DALStatementParser.AggregationFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonFunction(DALStatementParser.JsonFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJsonFunctionName(DALStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregationFunctionName(DALStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#distinct}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDistinct(DALStatementParser.DistinctContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#overClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOverClause(DALStatementParser.OverClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowSpecification(DALStatementParser.WindowSpecificationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#frameClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameClause(DALStatementParser.FrameClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#frameStart}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameStart(DALStatementParser.FrameStartContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameEnd(DALStatementParser.FrameEndContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFrameBetween(DALStatementParser.FrameBetweenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSpecialFunction(DALStatementParser.SpecialFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCurrentUserFunction(DALStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#groupingFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupingFunction(DALStatementParser.GroupingFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroupConcatFunction(DALStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowFunction(DALStatementParser.WindowFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindowingClause(DALStatementParser.WindowingClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeadLagInfo(DALStatementParser.LeadLagInfoContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNullTreatment(DALStatementParser.NullTreatmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#checkType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCheckType(DALStatementParser.CheckTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#repairType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepairType(DALStatementParser.RepairTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#castFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastFunction(DALStatementParser.CastFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConvertFunction(DALStatementParser.ConvertFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#castType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCastType(DALStatementParser.CastTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPositionFunction(DALStatementParser.PositionFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSubstringFunction(DALStatementParser.SubstringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExtractFunction(DALStatementParser.ExtractFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#charFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharFunction(DALStatementParser.CharFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrimFunction(DALStatementParser.TrimFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitValuesFunction(DALStatementParser.ValuesFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeightStringFunction(DALStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#levelClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelClause(DALStatementParser.LevelClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLevelInWeightListElement(DALStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunction(DALStatementParser.RegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitShorthandRegularFunction(DALStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCompleteRegularFunction(DALStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRegularFunctionName(DALStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchExpression(DALStatementParser.MatchExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMatchSearchModifier(DALStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseExpression(DALStatementParser.CaseExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDatetimeExpr(DALStatementParser.DatetimeExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBinaryLogFileIndexNumber(DALStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseWhen(DALStatementParser.CaseWhenContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#caseElse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCaseElse(DALStatementParser.CaseElseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalExpression(DALStatementParser.IntervalExpressionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalValue(DALStatementParser.IntervalValueContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntervalUnit(DALStatementParser.IntervalUnitContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByClause(DALStatementParser.OrderByClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrderByItem(DALStatementParser.OrderByItemContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#dataType}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDataType(DALStatementParser.DataTypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#stringList}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStringList(DALStatementParser.StringListContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#textString}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextString(DALStatementParser.TextStringContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTextStringHash(DALStatementParser.TextStringHashContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOptions(DALStatementParser.FieldOptionsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#precision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrecision(DALStatementParser.PrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTypeDatetimePrecision(DALStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharsetWithOptBinary(DALStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#ascii}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAscii(DALStatementParser.AsciiContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#unicode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUnicode(DALStatementParser.UnicodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#charset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharset(DALStatementParser.CharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCollation(DALStatementParser.DefaultCollationContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultEncryption(DALStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefaultCharset(DALStatementParser.DefaultCharsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#now}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNow(DALStatementParser.NowContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitColumnFormat(DALStatementParser.ColumnFormatContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStorageMedia(DALStatementParser.StorageMediaContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#direction}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDirection(DALStatementParser.DirectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyOrIndex(DALStatementParser.KeyOrIndexContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldLength(DALStatementParser.FieldLengthContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#characterSet}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCharacterSet(DALStatementParser.CharacterSetContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#collateClause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollateClause(DALStatementParser.CollateClauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFieldOrVarSpec(DALStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfNotExists(DALStatementParser.IfNotExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#ifExists}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExists(DALStatementParser.IfExistsContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#connectionId}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConnectionId(DALStatementParser.ConnectionIdContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#labelName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLabelName(DALStatementParser.LabelNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#cursorName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCursorName(DALStatementParser.CursorNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#conditionName}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConditionName(DALStatementParser.ConditionNameContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#combineOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCombineOption(DALStatementParser.CombineOptionContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNoWriteToBinLog(DALStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Visit a parse tree produced by {@link DALStatementParser#channelOption}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitChannelOption(DALStatementParser.ChannelOptionContext ctx);
}