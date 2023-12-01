// Generated from /home/arvin/mywork/program-compilation/antlr4-example/antlr4-mysql/src/main/antlr4/imports/DALStatement.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DALStatementParser}.
 */
public interface DALStatementListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#use}.
	 * @param ctx the parse tree
	 */
	void enterUse(DALStatementParser.UseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#use}.
	 * @param ctx the parse tree
	 */
	void exitUse(DALStatementParser.UseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#help}.
	 * @param ctx the parse tree
	 */
	void enterHelp(DALStatementParser.HelpContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#help}.
	 * @param ctx the parse tree
	 */
	void exitHelp(DALStatementParser.HelpContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void enterExplain(DALStatementParser.ExplainContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#explain}.
	 * @param ctx the parse tree
	 */
	void exitExplain(DALStatementParser.ExplainContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#fromSchema}.
	 * @param ctx the parse tree
	 */
	void enterFromSchema(DALStatementParser.FromSchemaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#fromSchema}.
	 * @param ctx the parse tree
	 */
	void exitFromSchema(DALStatementParser.FromSchemaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void enterFromTable(DALStatementParser.FromTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#fromTable}.
	 * @param ctx the parse tree
	 */
	void exitFromTable(DALStatementParser.FromTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void enterShowLike(DALStatementParser.ShowLikeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showLike}.
	 * @param ctx the parse tree
	 */
	void exitShowLike(DALStatementParser.ShowLikeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showWhereClause}.
	 * @param ctx the parse tree
	 */
	void enterShowWhereClause(DALStatementParser.ShowWhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showWhereClause}.
	 * @param ctx the parse tree
	 */
	void exitShowWhereClause(DALStatementParser.ShowWhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void enterShowFilter(DALStatementParser.ShowFilterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showFilter}.
	 * @param ctx the parse tree
	 */
	void exitShowFilter(DALStatementParser.ShowFilterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void enterShowProfileType(DALStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showProfileType}.
	 * @param ctx the parse tree
	 */
	void exitShowProfileType(DALStatementParser.ShowProfileTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetVariable(DALStatementParser.SetVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#setVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetVariable(DALStatementParser.SetVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#optionValueList}.
	 * @param ctx the parse tree
	 */
	void enterOptionValueList(DALStatementParser.OptionValueListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#optionValueList}.
	 * @param ctx the parse tree
	 */
	void exitOptionValueList(DALStatementParser.OptionValueListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#optionValueNoOptionType}.
	 * @param ctx the parse tree
	 */
	void enterOptionValueNoOptionType(DALStatementParser.OptionValueNoOptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#optionValueNoOptionType}.
	 * @param ctx the parse tree
	 */
	void exitOptionValueNoOptionType(DALStatementParser.OptionValueNoOptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#equal}.
	 * @param ctx the parse tree
	 */
	void enterEqual(DALStatementParser.EqualContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#equal}.
	 * @param ctx the parse tree
	 */
	void exitEqual(DALStatementParser.EqualContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#optionValue}.
	 * @param ctx the parse tree
	 */
	void enterOptionValue(DALStatementParser.OptionValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#optionValue}.
	 * @param ctx the parse tree
	 */
	void exitOptionValue(DALStatementParser.OptionValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void enterShowBinaryLogs(DALStatementParser.ShowBinaryLogsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showBinaryLogs}.
	 * @param ctx the parse tree
	 */
	void exitShowBinaryLogs(DALStatementParser.ShowBinaryLogsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showBinlogEvents}.
	 * @param ctx the parse tree
	 */
	void enterShowBinlogEvents(DALStatementParser.ShowBinlogEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showBinlogEvents}.
	 * @param ctx the parse tree
	 */
	void exitShowBinlogEvents(DALStatementParser.ShowBinlogEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showCharacterSet}.
	 * @param ctx the parse tree
	 */
	void enterShowCharacterSet(DALStatementParser.ShowCharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showCharacterSet}.
	 * @param ctx the parse tree
	 */
	void exitShowCharacterSet(DALStatementParser.ShowCharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showCollation}.
	 * @param ctx the parse tree
	 */
	void enterShowCollation(DALStatementParser.ShowCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showCollation}.
	 * @param ctx the parse tree
	 */
	void exitShowCollation(DALStatementParser.ShowCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void enterShowColumns(DALStatementParser.ShowColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showColumns}.
	 * @param ctx the parse tree
	 */
	void exitShowColumns(DALStatementParser.ShowColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showCreateDatabase}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateDatabase(DALStatementParser.ShowCreateDatabaseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showCreateDatabase}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateDatabase(DALStatementParser.ShowCreateDatabaseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showCreateEvent}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateEvent(DALStatementParser.ShowCreateEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showCreateEvent}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateEvent(DALStatementParser.ShowCreateEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showCreateFunction}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateFunction(DALStatementParser.ShowCreateFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showCreateFunction}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateFunction(DALStatementParser.ShowCreateFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showCreateProcedure}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateProcedure(DALStatementParser.ShowCreateProcedureContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showCreateProcedure}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateProcedure(DALStatementParser.ShowCreateProcedureContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTable(DALStatementParser.ShowCreateTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showCreateTable}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTable(DALStatementParser.ShowCreateTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showCreateTrigger}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateTrigger(DALStatementParser.ShowCreateTriggerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showCreateTrigger}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateTrigger(DALStatementParser.ShowCreateTriggerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showCreateUser}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateUser(DALStatementParser.ShowCreateUserContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showCreateUser}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateUser(DALStatementParser.ShowCreateUserContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showCreateView}.
	 * @param ctx the parse tree
	 */
	void enterShowCreateView(DALStatementParser.ShowCreateViewContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showCreateView}.
	 * @param ctx the parse tree
	 */
	void exitShowCreateView(DALStatementParser.ShowCreateViewContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showDatabases}.
	 * @param ctx the parse tree
	 */
	void enterShowDatabases(DALStatementParser.ShowDatabasesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showDatabases}.
	 * @param ctx the parse tree
	 */
	void exitShowDatabases(DALStatementParser.ShowDatabasesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showEngine}.
	 * @param ctx the parse tree
	 */
	void enterShowEngine(DALStatementParser.ShowEngineContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showEngine}.
	 * @param ctx the parse tree
	 */
	void exitShowEngine(DALStatementParser.ShowEngineContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showEngines}.
	 * @param ctx the parse tree
	 */
	void enterShowEngines(DALStatementParser.ShowEnginesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showEngines}.
	 * @param ctx the parse tree
	 */
	void exitShowEngines(DALStatementParser.ShowEnginesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showErrors}.
	 * @param ctx the parse tree
	 */
	void enterShowErrors(DALStatementParser.ShowErrorsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showErrors}.
	 * @param ctx the parse tree
	 */
	void exitShowErrors(DALStatementParser.ShowErrorsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showEvents}.
	 * @param ctx the parse tree
	 */
	void enterShowEvents(DALStatementParser.ShowEventsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showEvents}.
	 * @param ctx the parse tree
	 */
	void exitShowEvents(DALStatementParser.ShowEventsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctionCode(DALStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showFunctionCode}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctionCode(DALStatementParser.ShowFunctionCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showFunctionStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowFunctionStatus(DALStatementParser.ShowFunctionStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showFunctionStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowFunctionStatus(DALStatementParser.ShowFunctionStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showGrants}.
	 * @param ctx the parse tree
	 */
	void enterShowGrants(DALStatementParser.ShowGrantsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showGrants}.
	 * @param ctx the parse tree
	 */
	void exitShowGrants(DALStatementParser.ShowGrantsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showIndex}.
	 * @param ctx the parse tree
	 */
	void enterShowIndex(DALStatementParser.ShowIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showIndex}.
	 * @param ctx the parse tree
	 */
	void exitShowIndex(DALStatementParser.ShowIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showMasterStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowMasterStatus(DALStatementParser.ShowMasterStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showMasterStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowMasterStatus(DALStatementParser.ShowMasterStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showOpenTables}.
	 * @param ctx the parse tree
	 */
	void enterShowOpenTables(DALStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showOpenTables}.
	 * @param ctx the parse tree
	 */
	void exitShowOpenTables(DALStatementParser.ShowOpenTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showPlugins}.
	 * @param ctx the parse tree
	 */
	void enterShowPlugins(DALStatementParser.ShowPluginsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showPlugins}.
	 * @param ctx the parse tree
	 */
	void exitShowPlugins(DALStatementParser.ShowPluginsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showPrivileges}.
	 * @param ctx the parse tree
	 */
	void enterShowPrivileges(DALStatementParser.ShowPrivilegesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showPrivileges}.
	 * @param ctx the parse tree
	 */
	void exitShowPrivileges(DALStatementParser.ShowPrivilegesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showProcedureCode}.
	 * @param ctx the parse tree
	 */
	void enterShowProcedureCode(DALStatementParser.ShowProcedureCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showProcedureCode}.
	 * @param ctx the parse tree
	 */
	void exitShowProcedureCode(DALStatementParser.ShowProcedureCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showProcedureStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowProcedureStatus(DALStatementParser.ShowProcedureStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showProcedureStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowProcedureStatus(DALStatementParser.ShowProcedureStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showProcesslist}.
	 * @param ctx the parse tree
	 */
	void enterShowProcesslist(DALStatementParser.ShowProcesslistContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showProcesslist}.
	 * @param ctx the parse tree
	 */
	void exitShowProcesslist(DALStatementParser.ShowProcesslistContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showProfile}.
	 * @param ctx the parse tree
	 */
	void enterShowProfile(DALStatementParser.ShowProfileContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showProfile}.
	 * @param ctx the parse tree
	 */
	void exitShowProfile(DALStatementParser.ShowProfileContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showProfiles}.
	 * @param ctx the parse tree
	 */
	void enterShowProfiles(DALStatementParser.ShowProfilesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showProfiles}.
	 * @param ctx the parse tree
	 */
	void exitShowProfiles(DALStatementParser.ShowProfilesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showRelaylogEvent}.
	 * @param ctx the parse tree
	 */
	void enterShowRelaylogEvent(DALStatementParser.ShowRelaylogEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showRelaylogEvent}.
	 * @param ctx the parse tree
	 */
	void exitShowRelaylogEvent(DALStatementParser.ShowRelaylogEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showReplicas}.
	 * @param ctx the parse tree
	 */
	void enterShowReplicas(DALStatementParser.ShowReplicasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showReplicas}.
	 * @param ctx the parse tree
	 */
	void exitShowReplicas(DALStatementParser.ShowReplicasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showSlaveHosts}.
	 * @param ctx the parse tree
	 */
	void enterShowSlaveHosts(DALStatementParser.ShowSlaveHostsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showSlaveHosts}.
	 * @param ctx the parse tree
	 */
	void exitShowSlaveHosts(DALStatementParser.ShowSlaveHostsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showReplicaStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowReplicaStatus(DALStatementParser.ShowReplicaStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showReplicaStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowReplicaStatus(DALStatementParser.ShowReplicaStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showSlaveStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowSlaveStatus(DALStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showSlaveStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowSlaveStatus(DALStatementParser.ShowSlaveStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowStatus(DALStatementParser.ShowStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowStatus(DALStatementParser.ShowStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showTableStatus}.
	 * @param ctx the parse tree
	 */
	void enterShowTableStatus(DALStatementParser.ShowTableStatusContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showTableStatus}.
	 * @param ctx the parse tree
	 */
	void exitShowTableStatus(DALStatementParser.ShowTableStatusContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showTables}.
	 * @param ctx the parse tree
	 */
	void enterShowTables(DALStatementParser.ShowTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showTables}.
	 * @param ctx the parse tree
	 */
	void exitShowTables(DALStatementParser.ShowTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showTriggers}.
	 * @param ctx the parse tree
	 */
	void enterShowTriggers(DALStatementParser.ShowTriggersContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showTriggers}.
	 * @param ctx the parse tree
	 */
	void exitShowTriggers(DALStatementParser.ShowTriggersContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showVariables}.
	 * @param ctx the parse tree
	 */
	void enterShowVariables(DALStatementParser.ShowVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showVariables}.
	 * @param ctx the parse tree
	 */
	void exitShowVariables(DALStatementParser.ShowVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showWarnings}.
	 * @param ctx the parse tree
	 */
	void enterShowWarnings(DALStatementParser.ShowWarningsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showWarnings}.
	 * @param ctx the parse tree
	 */
	void exitShowWarnings(DALStatementParser.ShowWarningsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#showCharset}.
	 * @param ctx the parse tree
	 */
	void enterShowCharset(DALStatementParser.ShowCharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#showCharset}.
	 * @param ctx the parse tree
	 */
	void exitShowCharset(DALStatementParser.ShowCharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#setCharacter}.
	 * @param ctx the parse tree
	 */
	void enterSetCharacter(DALStatementParser.SetCharacterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#setCharacter}.
	 * @param ctx the parse tree
	 */
	void exitSetCharacter(DALStatementParser.SetCharacterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#clone}.
	 * @param ctx the parse tree
	 */
	void enterClone(DALStatementParser.CloneContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#clone}.
	 * @param ctx the parse tree
	 */
	void exitClone(DALStatementParser.CloneContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#cloneAction}.
	 * @param ctx the parse tree
	 */
	void enterCloneAction(DALStatementParser.CloneActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#cloneAction}.
	 * @param ctx the parse tree
	 */
	void exitCloneAction(DALStatementParser.CloneActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#createLoadableFunction}.
	 * @param ctx the parse tree
	 */
	void enterCreateLoadableFunction(DALStatementParser.CreateLoadableFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#createLoadableFunction}.
	 * @param ctx the parse tree
	 */
	void exitCreateLoadableFunction(DALStatementParser.CreateLoadableFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#install}.
	 * @param ctx the parse tree
	 */
	void enterInstall(DALStatementParser.InstallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#install}.
	 * @param ctx the parse tree
	 */
	void exitInstall(DALStatementParser.InstallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#uninstall}.
	 * @param ctx the parse tree
	 */
	void enterUninstall(DALStatementParser.UninstallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#uninstall}.
	 * @param ctx the parse tree
	 */
	void exitUninstall(DALStatementParser.UninstallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#installComponent}.
	 * @param ctx the parse tree
	 */
	void enterInstallComponent(DALStatementParser.InstallComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#installComponent}.
	 * @param ctx the parse tree
	 */
	void exitInstallComponent(DALStatementParser.InstallComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void enterInstallPlugin(DALStatementParser.InstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#installPlugin}.
	 * @param ctx the parse tree
	 */
	void exitInstallPlugin(DALStatementParser.InstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#uninstallComponent}.
	 * @param ctx the parse tree
	 */
	void enterUninstallComponent(DALStatementParser.UninstallComponentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#uninstallComponent}.
	 * @param ctx the parse tree
	 */
	void exitUninstallComponent(DALStatementParser.UninstallComponentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void enterUninstallPlugin(DALStatementParser.UninstallPluginContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#uninstallPlugin}.
	 * @param ctx the parse tree
	 */
	void exitUninstallPlugin(DALStatementParser.UninstallPluginContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void enterAnalyzeTable(DALStatementParser.AnalyzeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#analyzeTable}.
	 * @param ctx the parse tree
	 */
	void exitAnalyzeTable(DALStatementParser.AnalyzeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#histogram}.
	 * @param ctx the parse tree
	 */
	void enterHistogram(DALStatementParser.HistogramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#histogram}.
	 * @param ctx the parse tree
	 */
	void exitHistogram(DALStatementParser.HistogramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void enterCheckTable(DALStatementParser.CheckTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#checkTable}.
	 * @param ctx the parse tree
	 */
	void exitCheckTable(DALStatementParser.CheckTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void enterCheckTableOption(DALStatementParser.CheckTableOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#checkTableOption}.
	 * @param ctx the parse tree
	 */
	void exitCheckTableOption(DALStatementParser.CheckTableOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void enterChecksumTable(DALStatementParser.ChecksumTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#checksumTable}.
	 * @param ctx the parse tree
	 */
	void exitChecksumTable(DALStatementParser.ChecksumTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void enterOptimizeTable(DALStatementParser.OptimizeTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#optimizeTable}.
	 * @param ctx the parse tree
	 */
	void exitOptimizeTable(DALStatementParser.OptimizeTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void enterRepairTable(DALStatementParser.RepairTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#repairTable}.
	 * @param ctx the parse tree
	 */
	void exitRepairTable(DALStatementParser.RepairTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#alterResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterAlterResourceGroup(DALStatementParser.AlterResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#alterResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitAlterResourceGroup(DALStatementParser.AlterResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#vcpuSpec}.
	 * @param ctx the parse tree
	 */
	void enterVcpuSpec(DALStatementParser.VcpuSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#vcpuSpec}.
	 * @param ctx the parse tree
	 */
	void exitVcpuSpec(DALStatementParser.VcpuSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#createResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterCreateResourceGroup(DALStatementParser.CreateResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#createResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitCreateResourceGroup(DALStatementParser.CreateResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#dropResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterDropResourceGroup(DALStatementParser.DropResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#dropResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitDropResourceGroup(DALStatementParser.DropResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#setResourceGroup}.
	 * @param ctx the parse tree
	 */
	void enterSetResourceGroup(DALStatementParser.SetResourceGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#setResourceGroup}.
	 * @param ctx the parse tree
	 */
	void exitSetResourceGroup(DALStatementParser.SetResourceGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#binlog}.
	 * @param ctx the parse tree
	 */
	void enterBinlog(DALStatementParser.BinlogContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#binlog}.
	 * @param ctx the parse tree
	 */
	void exitBinlog(DALStatementParser.BinlogContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#cacheIndex}.
	 * @param ctx the parse tree
	 */
	void enterCacheIndex(DALStatementParser.CacheIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#cacheIndex}.
	 * @param ctx the parse tree
	 */
	void exitCacheIndex(DALStatementParser.CacheIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#cacheTableIndexList}.
	 * @param ctx the parse tree
	 */
	void enterCacheTableIndexList(DALStatementParser.CacheTableIndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#cacheTableIndexList}.
	 * @param ctx the parse tree
	 */
	void exitCacheTableIndexList(DALStatementParser.CacheTableIndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#partitionList}.
	 * @param ctx the parse tree
	 */
	void enterPartitionList(DALStatementParser.PartitionListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#partitionList}.
	 * @param ctx the parse tree
	 */
	void exitPartitionList(DALStatementParser.PartitionListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#flush}.
	 * @param ctx the parse tree
	 */
	void enterFlush(DALStatementParser.FlushContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#flush}.
	 * @param ctx the parse tree
	 */
	void exitFlush(DALStatementParser.FlushContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void enterFlushOption(DALStatementParser.FlushOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#flushOption}.
	 * @param ctx the parse tree
	 */
	void exitFlushOption(DALStatementParser.FlushOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tablesOption}.
	 * @param ctx the parse tree
	 */
	void enterTablesOption(DALStatementParser.TablesOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tablesOption}.
	 * @param ctx the parse tree
	 */
	void exitTablesOption(DALStatementParser.TablesOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#kill}.
	 * @param ctx the parse tree
	 */
	void enterKill(DALStatementParser.KillContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#kill}.
	 * @param ctx the parse tree
	 */
	void exitKill(DALStatementParser.KillContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#loadIndexInfo}.
	 * @param ctx the parse tree
	 */
	void enterLoadIndexInfo(DALStatementParser.LoadIndexInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#loadIndexInfo}.
	 * @param ctx the parse tree
	 */
	void exitLoadIndexInfo(DALStatementParser.LoadIndexInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#loadTableIndexList}.
	 * @param ctx the parse tree
	 */
	void enterLoadTableIndexList(DALStatementParser.LoadTableIndexListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#loadTableIndexList}.
	 * @param ctx the parse tree
	 */
	void exitLoadTableIndexList(DALStatementParser.LoadTableIndexListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void enterResetStatement(DALStatementParser.ResetStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#resetStatement}.
	 * @param ctx the parse tree
	 */
	void exitResetStatement(DALStatementParser.ResetStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#resetOption}.
	 * @param ctx the parse tree
	 */
	void enterResetOption(DALStatementParser.ResetOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#resetOption}.
	 * @param ctx the parse tree
	 */
	void exitResetOption(DALStatementParser.ResetOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#resetPersist}.
	 * @param ctx the parse tree
	 */
	void enterResetPersist(DALStatementParser.ResetPersistContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#resetPersist}.
	 * @param ctx the parse tree
	 */
	void exitResetPersist(DALStatementParser.ResetPersistContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#restart}.
	 * @param ctx the parse tree
	 */
	void enterRestart(DALStatementParser.RestartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#restart}.
	 * @param ctx the parse tree
	 */
	void exitRestart(DALStatementParser.RestartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#shutdown}.
	 * @param ctx the parse tree
	 */
	void enterShutdown(DALStatementParser.ShutdownContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#shutdown}.
	 * @param ctx the parse tree
	 */
	void exitShutdown(DALStatementParser.ShutdownContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#explainType}.
	 * @param ctx the parse tree
	 */
	void enterExplainType(DALStatementParser.ExplainTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#explainType}.
	 * @param ctx the parse tree
	 */
	void exitExplainType(DALStatementParser.ExplainTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#explainableStatement}.
	 * @param ctx the parse tree
	 */
	void enterExplainableStatement(DALStatementParser.ExplainableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#explainableStatement}.
	 * @param ctx the parse tree
	 */
	void exitExplainableStatement(DALStatementParser.ExplainableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#formatName}.
	 * @param ctx the parse tree
	 */
	void enterFormatName(DALStatementParser.FormatNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#formatName}.
	 * @param ctx the parse tree
	 */
	void exitFormatName(DALStatementParser.FormatNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void enterDelimiter(DALStatementParser.DelimiterContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#delimiter}.
	 * @param ctx the parse tree
	 */
	void exitDelimiter(DALStatementParser.DelimiterContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void enterShow(DALStatementParser.ShowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#show}.
	 * @param ctx the parse tree
	 */
	void exitShow(DALStatementParser.ShowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(DALStatementParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(DALStatementParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 */
	void enterInsertSpecification(DALStatementParser.InsertSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#insertSpecification}.
	 * @param ctx the parse tree
	 */
	void exitInsertSpecification(DALStatementParser.InsertSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertValuesClause(DALStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#insertValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertValuesClause(DALStatementParser.InsertValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#fields}.
	 * @param ctx the parse tree
	 */
	void enterFields(DALStatementParser.FieldsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#fields}.
	 * @param ctx the parse tree
	 */
	void exitFields(DALStatementParser.FieldsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterInsertIdentifier(DALStatementParser.InsertIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#insertIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitInsertIdentifier(DALStatementParser.InsertIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tableWild}.
	 * @param ctx the parse tree
	 */
	void enterTableWild(DALStatementParser.TableWildContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tableWild}.
	 * @param ctx the parse tree
	 */
	void exitTableWild(DALStatementParser.TableWildContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterInsertSelectClause(DALStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#insertSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitInsertSelectClause(DALStatementParser.InsertSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 */
	void enterOnDuplicateKeyClause(DALStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#onDuplicateKeyClause}.
	 * @param ctx the parse tree
	 */
	void exitOnDuplicateKeyClause(DALStatementParser.OnDuplicateKeyClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#valueReference}.
	 * @param ctx the parse tree
	 */
	void enterValueReference(DALStatementParser.ValueReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#valueReference}.
	 * @param ctx the parse tree
	 */
	void exitValueReference(DALStatementParser.ValueReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 */
	void enterDerivedColumns(DALStatementParser.DerivedColumnsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#derivedColumns}.
	 * @param ctx the parse tree
	 */
	void exitDerivedColumns(DALStatementParser.DerivedColumnsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#replace}.
	 * @param ctx the parse tree
	 */
	void enterReplace(DALStatementParser.ReplaceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#replace}.
	 * @param ctx the parse tree
	 */
	void exitReplace(DALStatementParser.ReplaceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#replaceSpecification}.
	 * @param ctx the parse tree
	 */
	void enterReplaceSpecification(DALStatementParser.ReplaceSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#replaceSpecification}.
	 * @param ctx the parse tree
	 */
	void exitReplaceSpecification(DALStatementParser.ReplaceSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#replaceValuesClause}.
	 * @param ctx the parse tree
	 */
	void enterReplaceValuesClause(DALStatementParser.ReplaceValuesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#replaceValuesClause}.
	 * @param ctx the parse tree
	 */
	void exitReplaceValuesClause(DALStatementParser.ReplaceValuesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#replaceSelectClause}.
	 * @param ctx the parse tree
	 */
	void enterReplaceSelectClause(DALStatementParser.ReplaceSelectClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#replaceSelectClause}.
	 * @param ctx the parse tree
	 */
	void exitReplaceSelectClause(DALStatementParser.ReplaceSelectClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(DALStatementParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(DALStatementParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void enterUpdateSpecification_(DALStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#updateSpecification_}.
	 * @param ctx the parse tree
	 */
	void exitUpdateSpecification_(DALStatementParser.UpdateSpecification_Context ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(DALStatementParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(DALStatementParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void enterSetAssignmentsClause(DALStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#setAssignmentsClause}.
	 * @param ctx the parse tree
	 */
	void exitSetAssignmentsClause(DALStatementParser.SetAssignmentsClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValues(DALStatementParser.AssignmentValuesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#assignmentValues}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValues(DALStatementParser.AssignmentValuesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentValue(DALStatementParser.AssignmentValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#assignmentValue}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentValue(DALStatementParser.AssignmentValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void enterBlobValue(DALStatementParser.BlobValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#blobValue}.
	 * @param ctx the parse tree
	 */
	void exitBlobValue(DALStatementParser.BlobValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(DALStatementParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(DALStatementParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDeleteSpecification(DALStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#deleteSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDeleteSpecification(DALStatementParser.DeleteSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void enterSingleTableClause(DALStatementParser.SingleTableClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#singleTableClause}.
	 * @param ctx the parse tree
	 */
	void exitSingleTableClause(DALStatementParser.SingleTableClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void enterMultipleTablesClause(DALStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#multipleTablesClause}.
	 * @param ctx the parse tree
	 */
	void exitMultipleTablesClause(DALStatementParser.MultipleTablesClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void enterSelect(DALStatementParser.SelectContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#select}.
	 * @param ctx the parse tree
	 */
	void exitSelect(DALStatementParser.SelectContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectWithInto(DALStatementParser.SelectWithIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#selectWithInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectWithInto(DALStatementParser.SelectWithIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpression(DALStatementParser.QueryExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#queryExpression}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpression(DALStatementParser.QueryExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionBody(DALStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#queryExpressionBody}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionBody(DALStatementParser.QueryExpressionBodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void enterCombineClause(DALStatementParser.CombineClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#combineClause}.
	 * @param ctx the parse tree
	 */
	void exitCombineClause(DALStatementParser.CombineClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 */
	void enterQueryExpressionParens(DALStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#queryExpressionParens}.
	 * @param ctx the parse tree
	 */
	void exitQueryExpressionParens(DALStatementParser.QueryExpressionParensContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void enterQueryPrimary(DALStatementParser.QueryPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#queryPrimary}.
	 * @param ctx the parse tree
	 */
	void exitQueryPrimary(DALStatementParser.QueryPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void enterQuerySpecification(DALStatementParser.QuerySpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#querySpecification}.
	 * @param ctx the parse tree
	 */
	void exitQuerySpecification(DALStatementParser.QuerySpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void enterCall(DALStatementParser.CallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#call}.
	 * @param ctx the parse tree
	 */
	void exitCall(DALStatementParser.CallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void enterDoStatement(DALStatementParser.DoStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#doStatement}.
	 * @param ctx the parse tree
	 */
	void exitDoStatement(DALStatementParser.DoStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerStatement(DALStatementParser.HandlerStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#handlerStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerStatement(DALStatementParser.HandlerStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerOpenStatement(DALStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#handlerOpenStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerOpenStatement(DALStatementParser.HandlerOpenStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadIndexStatement(DALStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#handlerReadIndexStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadIndexStatement(DALStatementParser.HandlerReadIndexStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerReadStatement(DALStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#handlerReadStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerReadStatement(DALStatementParser.HandlerReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void enterHandlerCloseStatement(DALStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#handlerCloseStatement}.
	 * @param ctx the parse tree
	 */
	void exitHandlerCloseStatement(DALStatementParser.HandlerCloseStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void enterImportStatement(DALStatementParser.ImportStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#importStatement}.
	 * @param ctx the parse tree
	 */
	void exitImportStatement(DALStatementParser.ImportStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#loadStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadStatement(DALStatementParser.LoadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#loadStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadStatement(DALStatementParser.LoadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadDataStatement(DALStatementParser.LoadDataStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#loadDataStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadDataStatement(DALStatementParser.LoadDataStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void enterLoadXmlStatement(DALStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#loadXmlStatement}.
	 * @param ctx the parse tree
	 */
	void exitLoadXmlStatement(DALStatementParser.LoadXmlStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 */
	void enterTableStatement(DALStatementParser.TableStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tableStatement}.
	 * @param ctx the parse tree
	 */
	void exitTableStatement(DALStatementParser.TableStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 */
	void enterTableValueConstructor(DALStatementParser.TableValueConstructorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tableValueConstructor}.
	 * @param ctx the parse tree
	 */
	void exitTableValueConstructor(DALStatementParser.TableValueConstructorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 */
	void enterRowConstructorList(DALStatementParser.RowConstructorListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#rowConstructorList}.
	 * @param ctx the parse tree
	 */
	void exitRowConstructorList(DALStatementParser.RowConstructorListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void enterWithClause(DALStatementParser.WithClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#withClause}.
	 * @param ctx the parse tree
	 */
	void exitWithClause(DALStatementParser.WithClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void enterCteClause(DALStatementParser.CteClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#cteClause}.
	 * @param ctx the parse tree
	 */
	void exitCteClause(DALStatementParser.CteClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void enterSelectSpecification(DALStatementParser.SelectSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#selectSpecification}.
	 * @param ctx the parse tree
	 */
	void exitSelectSpecification(DALStatementParser.SelectSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void enterDuplicateSpecification(DALStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#duplicateSpecification}.
	 * @param ctx the parse tree
	 */
	void exitDuplicateSpecification(DALStatementParser.DuplicateSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void enterProjections(DALStatementParser.ProjectionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#projections}.
	 * @param ctx the parse tree
	 */
	void exitProjections(DALStatementParser.ProjectionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void enterProjection(DALStatementParser.ProjectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#projection}.
	 * @param ctx the parse tree
	 */
	void exitProjection(DALStatementParser.ProjectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterUnqualifiedShorthand(DALStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#unqualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitUnqualifiedShorthand(DALStatementParser.UnqualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void enterQualifiedShorthand(DALStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#qualifiedShorthand}.
	 * @param ctx the parse tree
	 */
	void exitQualifiedShorthand(DALStatementParser.QualifiedShorthandContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void enterFromClause(DALStatementParser.FromClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#fromClause}.
	 * @param ctx the parse tree
	 */
	void exitFromClause(DALStatementParser.FromClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void enterTableReferences(DALStatementParser.TableReferencesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tableReferences}.
	 * @param ctx the parse tree
	 */
	void exitTableReferences(DALStatementParser.TableReferencesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void enterEscapedTableReference(DALStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#escapedTableReference}.
	 * @param ctx the parse tree
	 */
	void exitEscapedTableReference(DALStatementParser.EscapedTableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void enterTableReference(DALStatementParser.TableReferenceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tableReference}.
	 * @param ctx the parse tree
	 */
	void exitTableReference(DALStatementParser.TableReferenceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void enterTableFactor(DALStatementParser.TableFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tableFactor}.
	 * @param ctx the parse tree
	 */
	void exitTableFactor(DALStatementParser.TableFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void enterPartitionNames(DALStatementParser.PartitionNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#partitionNames}.
	 * @param ctx the parse tree
	 */
	void exitPartitionNames(DALStatementParser.PartitionNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 */
	void enterIndexHintList(DALStatementParser.IndexHintListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#indexHintList}.
	 * @param ctx the parse tree
	 */
	void exitIndexHintList(DALStatementParser.IndexHintListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void enterIndexHint(DALStatementParser.IndexHintContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#indexHint}.
	 * @param ctx the parse tree
	 */
	void exitIndexHint(DALStatementParser.IndexHintContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void enterJoinedTable(DALStatementParser.JoinedTableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#joinedTable}.
	 * @param ctx the parse tree
	 */
	void exitJoinedTable(DALStatementParser.JoinedTableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterInnerJoinType(DALStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#innerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitInnerJoinType(DALStatementParser.InnerJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void enterOuterJoinType(DALStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#outerJoinType}.
	 * @param ctx the parse tree
	 */
	void exitOuterJoinType(DALStatementParser.OuterJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void enterNaturalJoinType(DALStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#naturalJoinType}.
	 * @param ctx the parse tree
	 */
	void exitNaturalJoinType(DALStatementParser.NaturalJoinTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void enterJoinSpecification(DALStatementParser.JoinSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#joinSpecification}.
	 * @param ctx the parse tree
	 */
	void exitJoinSpecification(DALStatementParser.JoinSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void enterWhereClause(DALStatementParser.WhereClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#whereClause}.
	 * @param ctx the parse tree
	 */
	void exitWhereClause(DALStatementParser.WhereClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void enterGroupByClause(DALStatementParser.GroupByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#groupByClause}.
	 * @param ctx the parse tree
	 */
	void exitGroupByClause(DALStatementParser.GroupByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void enterHavingClause(DALStatementParser.HavingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#havingClause}.
	 * @param ctx the parse tree
	 */
	void exitHavingClause(DALStatementParser.HavingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void enterLimitClause(DALStatementParser.LimitClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#limitClause}.
	 * @param ctx the parse tree
	 */
	void exitLimitClause(DALStatementParser.LimitClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void enterLimitRowCount(DALStatementParser.LimitRowCountContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#limitRowCount}.
	 * @param ctx the parse tree
	 */
	void exitLimitRowCount(DALStatementParser.LimitRowCountContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void enterLimitOffset(DALStatementParser.LimitOffsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#limitOffset}.
	 * @param ctx the parse tree
	 */
	void exitLimitOffset(DALStatementParser.LimitOffsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowClause(DALStatementParser.WindowClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#windowClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowClause(DALStatementParser.WindowClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#windowItem}.
	 * @param ctx the parse tree
	 */
	void enterWindowItem(DALStatementParser.WindowItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#windowItem}.
	 * @param ctx the parse tree
	 */
	void exitWindowItem(DALStatementParser.WindowItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void enterSubquery(DALStatementParser.SubqueryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#subquery}.
	 * @param ctx the parse tree
	 */
	void exitSubquery(DALStatementParser.SubqueryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectLinesInto(DALStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#selectLinesInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectLinesInto(DALStatementParser.SelectLinesIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void enterSelectFieldsInto(DALStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#selectFieldsInto}.
	 * @param ctx the parse tree
	 */
	void exitSelectFieldsInto(DALStatementParser.SelectFieldsIntoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void enterSelectIntoExpression(DALStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#selectIntoExpression}.
	 * @param ctx the parse tree
	 */
	void exitSelectIntoExpression(DALStatementParser.SelectIntoExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void enterLockClause(DALStatementParser.LockClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#lockClause}.
	 * @param ctx the parse tree
	 */
	void exitLockClause(DALStatementParser.LockClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 */
	void enterLockClauseList(DALStatementParser.LockClauseListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#lockClauseList}.
	 * @param ctx the parse tree
	 */
	void exitLockClauseList(DALStatementParser.LockClauseListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 */
	void enterLockStrength(DALStatementParser.LockStrengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#lockStrength}.
	 * @param ctx the parse tree
	 */
	void exitLockStrength(DALStatementParser.LockStrengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 */
	void enterLockedRowAction(DALStatementParser.LockedRowActionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#lockedRowAction}.
	 * @param ctx the parse tree
	 */
	void exitLockedRowAction(DALStatementParser.LockedRowActionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 */
	void enterTableLockingList(DALStatementParser.TableLockingListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tableLockingList}.
	 * @param ctx the parse tree
	 */
	void exitTableLockingList(DALStatementParser.TableLockingListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 */
	void enterTableIdentOptWild(DALStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tableIdentOptWild}.
	 * @param ctx the parse tree
	 */
	void exitTableIdentOptWild(DALStatementParser.TableIdentOptWildContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 */
	void enterTableAliasRefList(DALStatementParser.TableAliasRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tableAliasRefList}.
	 * @param ctx the parse tree
	 */
	void exitTableAliasRefList(DALStatementParser.TableAliasRefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void enterParameterMarker(DALStatementParser.ParameterMarkerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#parameterMarker}.
	 * @param ctx the parse tree
	 */
	void exitParameterMarker(DALStatementParser.ParameterMarkerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 */
	void enterCustomKeyword(DALStatementParser.CustomKeywordContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#customKeyword}.
	 * @param ctx the parse tree
	 */
	void exitCustomKeyword(DALStatementParser.CustomKeywordContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void enterLiterals(DALStatementParser.LiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#literals}.
	 * @param ctx the parse tree
	 */
	void exitLiterals(DALStatementParser.LiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#string_}.
	 * @param ctx the parse tree
	 */
	void enterString_(DALStatementParser.String_Context ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#string_}.
	 * @param ctx the parse tree
	 */
	void exitString_(DALStatementParser.String_Context ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void enterStringLiterals(DALStatementParser.StringLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#stringLiterals}.
	 * @param ctx the parse tree
	 */
	void exitStringLiterals(DALStatementParser.StringLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNumberLiterals(DALStatementParser.NumberLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#numberLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNumberLiterals(DALStatementParser.NumberLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterTemporalLiterals(DALStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#temporalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitTemporalLiterals(DALStatementParser.TemporalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void enterHexadecimalLiterals(DALStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#hexadecimalLiterals}.
	 * @param ctx the parse tree
	 */
	void exitHexadecimalLiterals(DALStatementParser.HexadecimalLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBitValueLiterals(DALStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#bitValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBitValueLiterals(DALStatementParser.BitValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void enterBooleanLiterals(DALStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#booleanLiterals}.
	 * @param ctx the parse tree
	 */
	void exitBooleanLiterals(DALStatementParser.BooleanLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void enterNullValueLiterals(DALStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#nullValueLiterals}.
	 * @param ctx the parse tree
	 */
	void exitNullValueLiterals(DALStatementParser.NullValueLiteralsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void enterCollationName(DALStatementParser.CollationNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#collationName}.
	 * @param ctx the parse tree
	 */
	void exitCollationName(DALStatementParser.CollationNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(DALStatementParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(DALStatementParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsUnambiguous(DALStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#identifierKeywordsUnambiguous}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsUnambiguous(DALStatementParser.IdentifierKeywordsUnambiguousContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous1RolesAndLabels(DALStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#identifierKeywordsAmbiguous1RolesAndLabels}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous1RolesAndLabels(DALStatementParser.IdentifierKeywordsAmbiguous1RolesAndLabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous2Labels(DALStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#identifierKeywordsAmbiguous2Labels}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous2Labels(DALStatementParser.IdentifierKeywordsAmbiguous2LabelsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous3Roles(DALStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#identifierKeywordsAmbiguous3Roles}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous3Roles(DALStatementParser.IdentifierKeywordsAmbiguous3RolesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierKeywordsAmbiguous4SystemVariables(DALStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#identifierKeywordsAmbiguous4SystemVariables}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierKeywordsAmbiguous4SystemVariables(DALStatementParser.IdentifierKeywordsAmbiguous4SystemVariablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTextOrIdentifier(DALStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#textOrIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTextOrIdentifier(DALStatementParser.TextOrIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 */
	void enterIpAddress(DALStatementParser.IpAddressContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#ipAddress}.
	 * @param ctx the parse tree
	 */
	void exitIpAddress(DALStatementParser.IpAddressContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(DALStatementParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(DALStatementParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void enterUserVariable(DALStatementParser.UserVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#userVariable}.
	 * @param ctx the parse tree
	 */
	void exitUserVariable(DALStatementParser.UserVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSystemVariable(DALStatementParser.SystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#systemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSystemVariable(DALStatementParser.SystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 */
	void enterRvalueSystemVariable(DALStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#rvalueSystemVariable}.
	 * @param ctx the parse tree
	 */
	void exitRvalueSystemVariable(DALStatementParser.RvalueSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 */
	void enterSetSystemVariable(DALStatementParser.SetSystemVariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#setSystemVariable}.
	 * @param ctx the parse tree
	 */
	void exitSetSystemVariable(DALStatementParser.SetSystemVariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#optionType}.
	 * @param ctx the parse tree
	 */
	void enterOptionType(DALStatementParser.OptionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#optionType}.
	 * @param ctx the parse tree
	 */
	void exitOptionType(DALStatementParser.OptionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 */
	void enterInternalVariableName(DALStatementParser.InternalVariableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#internalVariableName}.
	 * @param ctx the parse tree
	 */
	void exitInternalVariableName(DALStatementParser.InternalVariableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 */
	void enterSetExprOrDefault(DALStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#setExprOrDefault}.
	 * @param ctx the parse tree
	 */
	void exitSetExprOrDefault(DALStatementParser.SetExprOrDefaultContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 */
	void enterTransactionCharacteristics(DALStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#transactionCharacteristics}.
	 * @param ctx the parse tree
	 */
	void exitTransactionCharacteristics(DALStatementParser.TransactionCharacteristicsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void enterIsolationLevel(DALStatementParser.IsolationLevelContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#isolationLevel}.
	 * @param ctx the parse tree
	 */
	void exitIsolationLevel(DALStatementParser.IsolationLevelContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 */
	void enterIsolationTypes(DALStatementParser.IsolationTypesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#isolationTypes}.
	 * @param ctx the parse tree
	 */
	void exitIsolationTypes(DALStatementParser.IsolationTypesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void enterTransactionAccessMode(DALStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#transactionAccessMode}.
	 * @param ctx the parse tree
	 */
	void exitTransactionAccessMode(DALStatementParser.TransactionAccessModeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void enterSchemaName(DALStatementParser.SchemaNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#schemaName}.
	 * @param ctx the parse tree
	 */
	void exitSchemaName(DALStatementParser.SchemaNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#schemaNames}.
	 * @param ctx the parse tree
	 */
	void enterSchemaNames(DALStatementParser.SchemaNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#schemaNames}.
	 * @param ctx the parse tree
	 */
	void exitSchemaNames(DALStatementParser.SchemaNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void enterCharsetName(DALStatementParser.CharsetNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#charsetName}.
	 * @param ctx the parse tree
	 */
	void exitCharsetName(DALStatementParser.CharsetNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#schemaPairs}.
	 * @param ctx the parse tree
	 */
	void enterSchemaPairs(DALStatementParser.SchemaPairsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#schemaPairs}.
	 * @param ctx the parse tree
	 */
	void exitSchemaPairs(DALStatementParser.SchemaPairsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#schemaPair}.
	 * @param ctx the parse tree
	 */
	void enterSchemaPair(DALStatementParser.SchemaPairContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#schemaPair}.
	 * @param ctx the parse tree
	 */
	void exitSchemaPair(DALStatementParser.SchemaPairContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void enterTableName(DALStatementParser.TableNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tableName}.
	 * @param ctx the parse tree
	 */
	void exitTableName(DALStatementParser.TableNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void enterColumnName(DALStatementParser.ColumnNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#columnName}.
	 * @param ctx the parse tree
	 */
	void exitColumnName(DALStatementParser.ColumnNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void enterIndexName(DALStatementParser.IndexNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#indexName}.
	 * @param ctx the parse tree
	 */
	void exitIndexName(DALStatementParser.IndexNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void enterConstraintName(DALStatementParser.ConstraintNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#constraintName}.
	 * @param ctx the parse tree
	 */
	void exitConstraintName(DALStatementParser.ConstraintNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 */
	void enterOldColumn(DALStatementParser.OldColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#oldColumn}.
	 * @param ctx the parse tree
	 */
	void exitOldColumn(DALStatementParser.OldColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#newColumn}.
	 * @param ctx the parse tree
	 */
	void enterNewColumn(DALStatementParser.NewColumnContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#newColumn}.
	 * @param ctx the parse tree
	 */
	void exitNewColumn(DALStatementParser.NewColumnContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 */
	void enterDelimiterName(DALStatementParser.DelimiterNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#delimiterName}.
	 * @param ctx the parse tree
	 */
	void exitDelimiterName(DALStatementParser.DelimiterNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterUserIdentifierOrText(DALStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#userIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitUserIdentifierOrText(DALStatementParser.UserIdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#username}.
	 * @param ctx the parse tree
	 */
	void enterUsername(DALStatementParser.UsernameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#username}.
	 * @param ctx the parse tree
	 */
	void exitUsername(DALStatementParser.UsernameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#eventName}.
	 * @param ctx the parse tree
	 */
	void enterEventName(DALStatementParser.EventNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#eventName}.
	 * @param ctx the parse tree
	 */
	void exitEventName(DALStatementParser.EventNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#serverName}.
	 * @param ctx the parse tree
	 */
	void enterServerName(DALStatementParser.ServerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#serverName}.
	 * @param ctx the parse tree
	 */
	void exitServerName(DALStatementParser.ServerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void enterWrapperName(DALStatementParser.WrapperNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#wrapperName}.
	 * @param ctx the parse tree
	 */
	void exitWrapperName(DALStatementParser.WrapperNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void enterFunctionName(DALStatementParser.FunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#functionName}.
	 * @param ctx the parse tree
	 */
	void exitFunctionName(DALStatementParser.FunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void enterProcedureName(DALStatementParser.ProcedureNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#procedureName}.
	 * @param ctx the parse tree
	 */
	void exitProcedureName(DALStatementParser.ProcedureNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void enterViewName(DALStatementParser.ViewNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#viewName}.
	 * @param ctx the parse tree
	 */
	void exitViewName(DALStatementParser.ViewNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void enterOwner(DALStatementParser.OwnerContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#owner}.
	 * @param ctx the parse tree
	 */
	void exitOwner(DALStatementParser.OwnerContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void enterAlias(DALStatementParser.AliasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#alias}.
	 * @param ctx the parse tree
	 */
	void exitAlias(DALStatementParser.AliasContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void enterName(DALStatementParser.NameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#name}.
	 * @param ctx the parse tree
	 */
	void exitName(DALStatementParser.NameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tableList}.
	 * @param ctx the parse tree
	 */
	void enterTableList(DALStatementParser.TableListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tableList}.
	 * @param ctx the parse tree
	 */
	void exitTableList(DALStatementParser.TableListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#viewNames}.
	 * @param ctx the parse tree
	 */
	void enterViewNames(DALStatementParser.ViewNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#viewNames}.
	 * @param ctx the parse tree
	 */
	void exitViewNames(DALStatementParser.ViewNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void enterColumnNames(DALStatementParser.ColumnNamesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#columnNames}.
	 * @param ctx the parse tree
	 */
	void exitColumnNames(DALStatementParser.ColumnNamesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#groupName}.
	 * @param ctx the parse tree
	 */
	void enterGroupName(DALStatementParser.GroupNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#groupName}.
	 * @param ctx the parse tree
	 */
	void exitGroupName(DALStatementParser.GroupNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void enterRoutineName(DALStatementParser.RoutineNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#routineName}.
	 * @param ctx the parse tree
	 */
	void exitRoutineName(DALStatementParser.RoutineNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void enterShardLibraryName(DALStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#shardLibraryName}.
	 * @param ctx the parse tree
	 */
	void exitShardLibraryName(DALStatementParser.ShardLibraryNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#componentName}.
	 * @param ctx the parse tree
	 */
	void enterComponentName(DALStatementParser.ComponentNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#componentName}.
	 * @param ctx the parse tree
	 */
	void exitComponentName(DALStatementParser.ComponentNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void enterPluginName(DALStatementParser.PluginNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#pluginName}.
	 * @param ctx the parse tree
	 */
	void exitPluginName(DALStatementParser.PluginNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void enterHostname(DALStatementParser.HostnameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#hostname}.
	 * @param ctx the parse tree
	 */
	void exitHostname(DALStatementParser.HostnameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void enterPort(DALStatementParser.PortContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#port}.
	 * @param ctx the parse tree
	 */
	void exitPort(DALStatementParser.PortContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void enterCloneInstance(DALStatementParser.CloneInstanceContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#cloneInstance}.
	 * @param ctx the parse tree
	 */
	void exitCloneInstance(DALStatementParser.CloneInstanceContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void enterCloneDir(DALStatementParser.CloneDirContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#cloneDir}.
	 * @param ctx the parse tree
	 */
	void exitCloneDir(DALStatementParser.CloneDirContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void enterChannelName(DALStatementParser.ChannelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#channelName}.
	 * @param ctx the parse tree
	 */
	void exitChannelName(DALStatementParser.ChannelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#logName}.
	 * @param ctx the parse tree
	 */
	void enterLogName(DALStatementParser.LogNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#logName}.
	 * @param ctx the parse tree
	 */
	void exitLogName(DALStatementParser.LogNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void enterRoleName(DALStatementParser.RoleNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#roleName}.
	 * @param ctx the parse tree
	 */
	void exitRoleName(DALStatementParser.RoleNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void enterRoleIdentifierOrText(DALStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#roleIdentifierOrText}.
	 * @param ctx the parse tree
	 */
	void exitRoleIdentifierOrText(DALStatementParser.RoleIdentifierOrTextContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#engineRef}.
	 * @param ctx the parse tree
	 */
	void enterEngineRef(DALStatementParser.EngineRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#engineRef}.
	 * @param ctx the parse tree
	 */
	void exitEngineRef(DALStatementParser.EngineRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void enterTriggerName(DALStatementParser.TriggerNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#triggerName}.
	 * @param ctx the parse tree
	 */
	void exitTriggerName(DALStatementParser.TriggerNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void enterTriggerTime(DALStatementParser.TriggerTimeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#triggerTime}.
	 * @param ctx the parse tree
	 */
	void exitTriggerTime(DALStatementParser.TriggerTimeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 */
	void enterTableOrTables(DALStatementParser.TableOrTablesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#tableOrTables}.
	 * @param ctx the parse tree
	 */
	void exitTableOrTables(DALStatementParser.TableOrTablesContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void enterUserOrRole(DALStatementParser.UserOrRoleContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#userOrRole}.
	 * @param ctx the parse tree
	 */
	void exitUserOrRole(DALStatementParser.UserOrRoleContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void enterPartitionName(DALStatementParser.PartitionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#partitionName}.
	 * @param ctx the parse tree
	 */
	void exitPartitionName(DALStatementParser.PartitionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(DALStatementParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(DALStatementParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 */
	void enterAllOrPartitionNameList(DALStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#allOrPartitionNameList}.
	 * @param ctx the parse tree
	 */
	void exitAllOrPartitionNameList(DALStatementParser.AllOrPartitionNameListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void enterTriggerEvent(DALStatementParser.TriggerEventContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#triggerEvent}.
	 * @param ctx the parse tree
	 */
	void exitTriggerEvent(DALStatementParser.TriggerEventContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void enterTriggerOrder(DALStatementParser.TriggerOrderContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#triggerOrder}.
	 * @param ctx the parse tree
	 */
	void exitTriggerOrder(DALStatementParser.TriggerOrderContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(DALStatementParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(DALStatementParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void enterAndOperator(DALStatementParser.AndOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#andOperator}.
	 * @param ctx the parse tree
	 */
	void exitAndOperator(DALStatementParser.AndOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void enterOrOperator(DALStatementParser.OrOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#orOperator}.
	 * @param ctx the parse tree
	 */
	void exitOrOperator(DALStatementParser.OrOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void enterNotOperator(DALStatementParser.NotOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#notOperator}.
	 * @param ctx the parse tree
	 */
	void exitNotOperator(DALStatementParser.NotOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void enterBooleanPrimary(DALStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#booleanPrimary}.
	 * @param ctx the parse tree
	 */
	void exitBooleanPrimary(DALStatementParser.BooleanPrimaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentOperator(DALStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#assignmentOperator}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentOperator(DALStatementParser.AssignmentOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void enterComparisonOperator(DALStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#comparisonOperator}.
	 * @param ctx the parse tree
	 */
	void exitComparisonOperator(DALStatementParser.ComparisonOperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void enterPredicate(DALStatementParser.PredicateContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#predicate}.
	 * @param ctx the parse tree
	 */
	void exitPredicate(DALStatementParser.PredicateContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void enterBitExpr(DALStatementParser.BitExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#bitExpr}.
	 * @param ctx the parse tree
	 */
	void exitBitExpr(DALStatementParser.BitExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpr(DALStatementParser.SimpleExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#simpleExpr}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpr(DALStatementParser.SimpleExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#path}.
	 * @param ctx the parse tree
	 */
	void enterPath(DALStatementParser.PathContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#path}.
	 * @param ctx the parse tree
	 */
	void exitPath(DALStatementParser.PathContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#onEmptyError}.
	 * @param ctx the parse tree
	 */
	void enterOnEmptyError(DALStatementParser.OnEmptyErrorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#onEmptyError}.
	 * @param ctx the parse tree
	 */
	void exitOnEmptyError(DALStatementParser.OnEmptyErrorContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void enterColumnRef(DALStatementParser.ColumnRefContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#columnRef}.
	 * @param ctx the parse tree
	 */
	void exitColumnRef(DALStatementParser.ColumnRefContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 */
	void enterColumnRefList(DALStatementParser.ColumnRefListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#columnRefList}.
	 * @param ctx the parse tree
	 */
	void exitColumnRefList(DALStatementParser.ColumnRefListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void enterFunctionCall(DALStatementParser.FunctionCallContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#functionCall}.
	 * @param ctx the parse tree
	 */
	void exitFunctionCall(DALStatementParser.FunctionCallContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 */
	void enterUdfFunction(DALStatementParser.UdfFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#udfFunction}.
	 * @param ctx the parse tree
	 */
	void exitUdfFunction(DALStatementParser.UdfFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunction(DALStatementParser.AggregationFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#aggregationFunction}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunction(DALStatementParser.AggregationFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunction(DALStatementParser.JsonFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#jsonFunction}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunction(DALStatementParser.JsonFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterJsonFunctionName(DALStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#jsonFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitJsonFunctionName(DALStatementParser.JsonFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterAggregationFunctionName(DALStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#aggregationFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitAggregationFunctionName(DALStatementParser.AggregationFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void enterDistinct(DALStatementParser.DistinctContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#distinct}.
	 * @param ctx the parse tree
	 */
	void exitDistinct(DALStatementParser.DistinctContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void enterOverClause(DALStatementParser.OverClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#overClause}.
	 * @param ctx the parse tree
	 */
	void exitOverClause(DALStatementParser.OverClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void enterWindowSpecification(DALStatementParser.WindowSpecificationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#windowSpecification}.
	 * @param ctx the parse tree
	 */
	void exitWindowSpecification(DALStatementParser.WindowSpecificationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void enterFrameClause(DALStatementParser.FrameClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#frameClause}.
	 * @param ctx the parse tree
	 */
	void exitFrameClause(DALStatementParser.FrameClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void enterFrameStart(DALStatementParser.FrameStartContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#frameStart}.
	 * @param ctx the parse tree
	 */
	void exitFrameStart(DALStatementParser.FrameStartContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void enterFrameEnd(DALStatementParser.FrameEndContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#frameEnd}.
	 * @param ctx the parse tree
	 */
	void exitFrameEnd(DALStatementParser.FrameEndContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void enterFrameBetween(DALStatementParser.FrameBetweenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#frameBetween}.
	 * @param ctx the parse tree
	 */
	void exitFrameBetween(DALStatementParser.FrameBetweenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void enterSpecialFunction(DALStatementParser.SpecialFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#specialFunction}.
	 * @param ctx the parse tree
	 */
	void exitSpecialFunction(DALStatementParser.SpecialFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 */
	void enterCurrentUserFunction(DALStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#currentUserFunction}.
	 * @param ctx the parse tree
	 */
	void exitCurrentUserFunction(DALStatementParser.CurrentUserFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#groupingFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupingFunction(DALStatementParser.GroupingFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#groupingFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupingFunction(DALStatementParser.GroupingFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void enterGroupConcatFunction(DALStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#groupConcatFunction}.
	 * @param ctx the parse tree
	 */
	void exitGroupConcatFunction(DALStatementParser.GroupConcatFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void enterWindowFunction(DALStatementParser.WindowFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#windowFunction}.
	 * @param ctx the parse tree
	 */
	void exitWindowFunction(DALStatementParser.WindowFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void enterWindowingClause(DALStatementParser.WindowingClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#windowingClause}.
	 * @param ctx the parse tree
	 */
	void exitWindowingClause(DALStatementParser.WindowingClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 */
	void enterLeadLagInfo(DALStatementParser.LeadLagInfoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#leadLagInfo}.
	 * @param ctx the parse tree
	 */
	void exitLeadLagInfo(DALStatementParser.LeadLagInfoContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void enterNullTreatment(DALStatementParser.NullTreatmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#nullTreatment}.
	 * @param ctx the parse tree
	 */
	void exitNullTreatment(DALStatementParser.NullTreatmentContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#checkType}.
	 * @param ctx the parse tree
	 */
	void enterCheckType(DALStatementParser.CheckTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#checkType}.
	 * @param ctx the parse tree
	 */
	void exitCheckType(DALStatementParser.CheckTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#repairType}.
	 * @param ctx the parse tree
	 */
	void enterRepairType(DALStatementParser.RepairTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#repairType}.
	 * @param ctx the parse tree
	 */
	void exitRepairType(DALStatementParser.RepairTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void enterCastFunction(DALStatementParser.CastFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#castFunction}.
	 * @param ctx the parse tree
	 */
	void exitCastFunction(DALStatementParser.CastFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void enterConvertFunction(DALStatementParser.ConvertFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#convertFunction}.
	 * @param ctx the parse tree
	 */
	void exitConvertFunction(DALStatementParser.ConvertFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#castType}.
	 * @param ctx the parse tree
	 */
	void enterCastType(DALStatementParser.CastTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#castType}.
	 * @param ctx the parse tree
	 */
	void exitCastType(DALStatementParser.CastTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void enterPositionFunction(DALStatementParser.PositionFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#positionFunction}.
	 * @param ctx the parse tree
	 */
	void exitPositionFunction(DALStatementParser.PositionFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void enterSubstringFunction(DALStatementParser.SubstringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#substringFunction}.
	 * @param ctx the parse tree
	 */
	void exitSubstringFunction(DALStatementParser.SubstringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void enterExtractFunction(DALStatementParser.ExtractFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#extractFunction}.
	 * @param ctx the parse tree
	 */
	void exitExtractFunction(DALStatementParser.ExtractFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void enterCharFunction(DALStatementParser.CharFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#charFunction}.
	 * @param ctx the parse tree
	 */
	void exitCharFunction(DALStatementParser.CharFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void enterTrimFunction(DALStatementParser.TrimFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#trimFunction}.
	 * @param ctx the parse tree
	 */
	void exitTrimFunction(DALStatementParser.TrimFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 */
	void enterValuesFunction(DALStatementParser.ValuesFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#valuesFunction}.
	 * @param ctx the parse tree
	 */
	void exitValuesFunction(DALStatementParser.ValuesFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void enterWeightStringFunction(DALStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#weightStringFunction}.
	 * @param ctx the parse tree
	 */
	void exitWeightStringFunction(DALStatementParser.WeightStringFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#levelClause}.
	 * @param ctx the parse tree
	 */
	void enterLevelClause(DALStatementParser.LevelClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#levelClause}.
	 * @param ctx the parse tree
	 */
	void exitLevelClause(DALStatementParser.LevelClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void enterLevelInWeightListElement(DALStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#levelInWeightListElement}.
	 * @param ctx the parse tree
	 */
	void exitLevelInWeightListElement(DALStatementParser.LevelInWeightListElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunction(DALStatementParser.RegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#regularFunction}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunction(DALStatementParser.RegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 */
	void enterShorthandRegularFunction(DALStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#shorthandRegularFunction}.
	 * @param ctx the parse tree
	 */
	void exitShorthandRegularFunction(DALStatementParser.ShorthandRegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 */
	void enterCompleteRegularFunction(DALStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#completeRegularFunction}.
	 * @param ctx the parse tree
	 */
	void exitCompleteRegularFunction(DALStatementParser.CompleteRegularFunctionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void enterRegularFunctionName(DALStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#regularFunctionName}.
	 * @param ctx the parse tree
	 */
	void exitRegularFunctionName(DALStatementParser.RegularFunctionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void enterMatchExpression(DALStatementParser.MatchExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#matchExpression}.
	 * @param ctx the parse tree
	 */
	void exitMatchExpression(DALStatementParser.MatchExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 */
	void enterMatchSearchModifier(DALStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#matchSearchModifier}.
	 * @param ctx the parse tree
	 */
	void exitMatchSearchModifier(DALStatementParser.MatchSearchModifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void enterCaseExpression(DALStatementParser.CaseExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#caseExpression}.
	 * @param ctx the parse tree
	 */
	void exitCaseExpression(DALStatementParser.CaseExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 */
	void enterDatetimeExpr(DALStatementParser.DatetimeExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#datetimeExpr}.
	 * @param ctx the parse tree
	 */
	void exitDatetimeExpr(DALStatementParser.DatetimeExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 */
	void enterBinaryLogFileIndexNumber(DALStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#binaryLogFileIndexNumber}.
	 * @param ctx the parse tree
	 */
	void exitBinaryLogFileIndexNumber(DALStatementParser.BinaryLogFileIndexNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void enterCaseWhen(DALStatementParser.CaseWhenContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#caseWhen}.
	 * @param ctx the parse tree
	 */
	void exitCaseWhen(DALStatementParser.CaseWhenContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void enterCaseElse(DALStatementParser.CaseElseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#caseElse}.
	 * @param ctx the parse tree
	 */
	void exitCaseElse(DALStatementParser.CaseElseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void enterIntervalExpression(DALStatementParser.IntervalExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#intervalExpression}.
	 * @param ctx the parse tree
	 */
	void exitIntervalExpression(DALStatementParser.IntervalExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void enterIntervalValue(DALStatementParser.IntervalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#intervalValue}.
	 * @param ctx the parse tree
	 */
	void exitIntervalValue(DALStatementParser.IntervalValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void enterIntervalUnit(DALStatementParser.IntervalUnitContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#intervalUnit}.
	 * @param ctx the parse tree
	 */
	void exitIntervalUnit(DALStatementParser.IntervalUnitContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void enterOrderByClause(DALStatementParser.OrderByClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#orderByClause}.
	 * @param ctx the parse tree
	 */
	void exitOrderByClause(DALStatementParser.OrderByClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void enterOrderByItem(DALStatementParser.OrderByItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#orderByItem}.
	 * @param ctx the parse tree
	 */
	void exitOrderByItem(DALStatementParser.OrderByItemContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void enterDataType(DALStatementParser.DataTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#dataType}.
	 * @param ctx the parse tree
	 */
	void exitDataType(DALStatementParser.DataTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#stringList}.
	 * @param ctx the parse tree
	 */
	void enterStringList(DALStatementParser.StringListContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#stringList}.
	 * @param ctx the parse tree
	 */
	void exitStringList(DALStatementParser.StringListContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#textString}.
	 * @param ctx the parse tree
	 */
	void enterTextString(DALStatementParser.TextStringContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#textString}.
	 * @param ctx the parse tree
	 */
	void exitTextString(DALStatementParser.TextStringContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 */
	void enterTextStringHash(DALStatementParser.TextStringHashContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#textStringHash}.
	 * @param ctx the parse tree
	 */
	void exitTextStringHash(DALStatementParser.TextStringHashContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void enterFieldOptions(DALStatementParser.FieldOptionsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#fieldOptions}.
	 * @param ctx the parse tree
	 */
	void exitFieldOptions(DALStatementParser.FieldOptionsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#precision}.
	 * @param ctx the parse tree
	 */
	void enterPrecision(DALStatementParser.PrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#precision}.
	 * @param ctx the parse tree
	 */
	void exitPrecision(DALStatementParser.PrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 */
	void enterTypeDatetimePrecision(DALStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#typeDatetimePrecision}.
	 * @param ctx the parse tree
	 */
	void exitTypeDatetimePrecision(DALStatementParser.TypeDatetimePrecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 */
	void enterCharsetWithOptBinary(DALStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#charsetWithOptBinary}.
	 * @param ctx the parse tree
	 */
	void exitCharsetWithOptBinary(DALStatementParser.CharsetWithOptBinaryContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#ascii}.
	 * @param ctx the parse tree
	 */
	void enterAscii(DALStatementParser.AsciiContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#ascii}.
	 * @param ctx the parse tree
	 */
	void exitAscii(DALStatementParser.AsciiContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#unicode}.
	 * @param ctx the parse tree
	 */
	void enterUnicode(DALStatementParser.UnicodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#unicode}.
	 * @param ctx the parse tree
	 */
	void exitUnicode(DALStatementParser.UnicodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#charset}.
	 * @param ctx the parse tree
	 */
	void enterCharset(DALStatementParser.CharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#charset}.
	 * @param ctx the parse tree
	 */
	void exitCharset(DALStatementParser.CharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCollation(DALStatementParser.DefaultCollationContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#defaultCollation}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCollation(DALStatementParser.DefaultCollationContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 */
	void enterDefaultEncryption(DALStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#defaultEncryption}.
	 * @param ctx the parse tree
	 */
	void exitDefaultEncryption(DALStatementParser.DefaultEncryptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 */
	void enterDefaultCharset(DALStatementParser.DefaultCharsetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#defaultCharset}.
	 * @param ctx the parse tree
	 */
	void exitDefaultCharset(DALStatementParser.DefaultCharsetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#now}.
	 * @param ctx the parse tree
	 */
	void enterNow(DALStatementParser.NowContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#now}.
	 * @param ctx the parse tree
	 */
	void exitNow(DALStatementParser.NowContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 */
	void enterColumnFormat(DALStatementParser.ColumnFormatContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#columnFormat}.
	 * @param ctx the parse tree
	 */
	void exitColumnFormat(DALStatementParser.ColumnFormatContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 */
	void enterStorageMedia(DALStatementParser.StorageMediaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#storageMedia}.
	 * @param ctx the parse tree
	 */
	void exitStorageMedia(DALStatementParser.StorageMediaContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void enterDirection(DALStatementParser.DirectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#direction}.
	 * @param ctx the parse tree
	 */
	void exitDirection(DALStatementParser.DirectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 */
	void enterKeyOrIndex(DALStatementParser.KeyOrIndexContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#keyOrIndex}.
	 * @param ctx the parse tree
	 */
	void exitKeyOrIndex(DALStatementParser.KeyOrIndexContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void enterFieldLength(DALStatementParser.FieldLengthContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#fieldLength}.
	 * @param ctx the parse tree
	 */
	void exitFieldLength(DALStatementParser.FieldLengthContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void enterCharacterSet(DALStatementParser.CharacterSetContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#characterSet}.
	 * @param ctx the parse tree
	 */
	void exitCharacterSet(DALStatementParser.CharacterSetContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void enterCollateClause(DALStatementParser.CollateClauseContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#collateClause}.
	 * @param ctx the parse tree
	 */
	void exitCollateClause(DALStatementParser.CollateClauseContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 */
	void enterFieldOrVarSpec(DALStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#fieldOrVarSpec}.
	 * @param ctx the parse tree
	 */
	void exitFieldOrVarSpec(DALStatementParser.FieldOrVarSpecContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void enterIfNotExists(DALStatementParser.IfNotExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#ifNotExists}.
	 * @param ctx the parse tree
	 */
	void exitIfNotExists(DALStatementParser.IfNotExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void enterIfExists(DALStatementParser.IfExistsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#ifExists}.
	 * @param ctx the parse tree
	 */
	void exitIfExists(DALStatementParser.IfExistsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#connectionId}.
	 * @param ctx the parse tree
	 */
	void enterConnectionId(DALStatementParser.ConnectionIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#connectionId}.
	 * @param ctx the parse tree
	 */
	void exitConnectionId(DALStatementParser.ConnectionIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#labelName}.
	 * @param ctx the parse tree
	 */
	void enterLabelName(DALStatementParser.LabelNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#labelName}.
	 * @param ctx the parse tree
	 */
	void exitLabelName(DALStatementParser.LabelNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void enterCursorName(DALStatementParser.CursorNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#cursorName}.
	 * @param ctx the parse tree
	 */
	void exitCursorName(DALStatementParser.CursorNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void enterConditionName(DALStatementParser.ConditionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#conditionName}.
	 * @param ctx the parse tree
	 */
	void exitConditionName(DALStatementParser.ConditionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#combineOption}.
	 * @param ctx the parse tree
	 */
	void enterCombineOption(DALStatementParser.CombineOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#combineOption}.
	 * @param ctx the parse tree
	 */
	void exitCombineOption(DALStatementParser.CombineOptionContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 */
	void enterNoWriteToBinLog(DALStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#noWriteToBinLog}.
	 * @param ctx the parse tree
	 */
	void exitNoWriteToBinLog(DALStatementParser.NoWriteToBinLogContext ctx);
	/**
	 * Enter a parse tree produced by {@link DALStatementParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void enterChannelOption(DALStatementParser.ChannelOptionContext ctx);
	/**
	 * Exit a parse tree produced by {@link DALStatementParser#channelOption}.
	 * @param ctx the parse tree
	 */
	void exitChannelOption(DALStatementParser.ChannelOptionContext ctx);
}