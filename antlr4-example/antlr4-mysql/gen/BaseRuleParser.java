// Generated from /home/arvin/mywork/program-compilation/antlr4-example/antlr4-mysql/src/main/antlr4/imports/BaseRule.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class BaseRuleParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND_=2, OR_=3, NOT_=4, TILDE_=5, VERTICAL_BAR_=6, AMPERSAND_=7, 
		SIGNED_LEFT_SHIFT_=8, SIGNED_RIGHT_SHIFT_=9, CARET_=10, MOD_=11, COLON_=12, 
		PLUS_=13, MINUS_=14, ASTERISK_=15, SLASH_=16, BACKSLASH_=17, DOT_=18, 
		DOT_ASTERISK_=19, SAFE_EQ_=20, DEQ_=21, EQ_=22, NEQ_=23, GT_=24, GTE_=25, 
		LT_=26, LTE_=27, POUND_=28, LP_=29, RP_=30, LBE_=31, RBE_=32, LBT_=33, 
		RBT_=34, COMMA_=35, DQ_=36, SQ_=37, BQ_=38, QUESTION_=39, AT_=40, SEMI_=41, 
		ASSIGNMENT_=42, JSON_SEPARATOR=43, JSON_UNQUOTED_SEPARATOR=44, WS=45, 
		MAX=46, MIN=47, SUM=48, COUNT=49, GROUP_CONCAT=50, CAST=51, POSITION=52, 
		SUBSTRING=53, SUBSTR=54, EXTRACT=55, TRIM=56, LAST_DAY=57, TRADITIONAL=58, 
		TREE=59, MYSQL_MAIN=60, MYSQL_ADMIN=61, INSTANT=62, INPLACE=63, COPY=64, 
		UL_BINARY=65, AUTOCOMMIT=66, REDO_LOG=67, DELIMITER=68, ARCHIVE=69, BLACKHOLE=70, 
		CSV=71, FEDERATED=72, INNODB=73, MEMORY=74, MRG_MYISAM=75, MYISAM=76, 
		NDB=77, NDBCLUSTER=78, PERFORMANCE_SCHEMA=79, TOKUDB=80, FOR_GENERATOR=81, 
		ACCESSIBLE=82, ACCOUNT=83, ACTION=84, ACTIVE=85, ADD=86, ADMIN=87, AFTER=88, 
		AGAINST=89, AGGREGATE=90, ALGORITHM=91, ALL=92, ALTER=93, ALWAYS=94, ANALYZE=95, 
		AND=96, ANY=97, ARRAY=98, AS=99, ASC=100, ASCII=101, ASENSITIVE=102, AT=103, 
		ATTRIBUTE=104, AUTOEXTEND_SIZE=105, AUTO_INCREMENT=106, AVG=107, ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS=108, 
		BIT_XOR=109, AVG_ROW_LENGTH=110, BACKUP=111, BEFORE=112, BEGIN=113, BETWEEN=114, 
		BIGINT=115, BINARY=116, BINLOG=117, BIT=118, BLOB=119, BLOCK=120, BOOL=121, 
		BOOLEAN=122, BOTH=123, BTREE=124, BUCKETS=125, BY=126, BYTE=127, CACHE=128, 
		CALL=129, CASCADE=130, CASCADED=131, CASE=132, CATALOG_NAME=133, CHAIN=134, 
		CHANGE=135, CHANGED=136, CHANNEL=137, CHAR=138, CHAR_VARYING=139, CHARACTER=140, 
		CHARACTER_VARYING=141, CHARSET=142, CHECK=143, CHECKSUM=144, CIPHER=145, 
		CLASS_ORIGIN=146, CLIENT=147, CLONE=148, CLOSE=149, COALESCE=150, CODE=151, 
		COLLATE=152, COLLATION=153, COLUMN=154, COLUMNS=155, COLUMN_FORMAT=156, 
		COLUMN_NAME=157, COMMENT=158, COMMIT=159, COMMITTED=160, COMPACT=161, 
		COMPLETION=162, COMPONENT=163, COMPRESSED=164, COMPRESSION=165, CONCURRENT=166, 
		CONDITION=167, CONNECTION=168, CONSISTENT=169, CONSTRAINT=170, CONSTRAINT_CATALOG=171, 
		CONSTRAINT_NAME=172, CONSTRAINT_SCHEMA=173, CONTAINS=174, CONTEXT=175, 
		CONTINUE=176, CONVERT=177, CPU=178, CREATE=179, CROSS=180, CUBE=181, CUME_DIST=182, 
		CURRENT=183, CURRENT_DATE=184, CURRENT_TIME=185, CURRENT_TIMESTAMP=186, 
		CURRENT_USER=187, CURSOR=188, CURSOR_NAME=189, DATA=190, DATABASE=191, 
		DATABASES=192, DATAFILE=193, DATE=194, DATETIME=195, DAY=196, DAY_HOUR=197, 
		DAY_MICROSECOND=198, DAY_MINUTE=199, DAY_SECOND=200, DEALLOCATE=201, DEC=202, 
		DECIMAL=203, DECLARE=204, DEFAULT=205, DEFAULT_AUTH=206, DEFINER=207, 
		DEFINITION=208, DELAYED=209, DELAY_KEY_WRITE=210, DELETE=211, DENSE_RANK=212, 
		DESC=213, DESCRIBE=214, DESCRIPTION=215, DETERMINISTIC=216, DIAGNOSTICS=217, 
		DIRECTORY=218, DISABLE=219, DISCARD=220, DISK=221, DISTINCT=222, DISTINCTROW=223, 
		DIV=224, DO=225, DOUBLE=226, DROP=227, DUAL=228, DUMPFILE=229, DUPLICATE=230, 
		DYNAMIC=231, EACH=232, ELSE=233, ELSEIF=234, EMPTY=235, ENABLE=236, ENCLOSED=237, 
		ENCRYPTION=238, END=239, ENDS=240, ENFORCED=241, ENGINE=242, ENGINES=243, 
		ENGINE_ATTRIBUTE=244, ENUM=245, ERROR=246, ERRORS=247, ESCAPE=248, ESCAPED=249, 
		EVENT=250, EVENTS=251, EVERY=252, EXCEPT=253, EXCHANGE=254, EXCLUDE=255, 
		EXECUTE=256, EXISTS=257, EXIT=258, EXPANSION=259, EXPIRE=260, EXPLAIN=261, 
		EXPORT=262, EXTENDED=263, EXTENT_SIZE=264, FAILED_LOGIN_ATTEMPTS=265, 
		FALSE=266, FAST=267, FAULTS=268, FETCH=269, FILE=270, FILE_BLOCK_SIZE=271, 
		FILTER=272, FIRST=273, FIRST_VALUE=274, FIXED=275, FLOAT=276, FLOAT4=277, 
		FLOAT8=278, FLUSH=279, FOLLOWING=280, FOLLOWS=281, FOR=282, FORCE=283, 
		FOREIGN=284, FORMAT=285, FOUND=286, FROM=287, FULL=288, FULLTEXT=289, 
		FUNCTION=290, GENERAL=291, GENERATED=292, GEOMETRY=293, GEOMCOLLECTION=294, 
		GEOMETRYCOLLECTION=295, GET=296, GET_FORMAT=297, GET_MASTER_PUBLIC_KEY=298, 
		GLOBAL=299, GRANT=300, GRANTS=301, GROUP=302, GROUPING=303, GROUPS=304, 
		GROUP_REPLICATION=305, GET_SOURCE_PUBLIC_KEY=306, GTID_ONLY=307, GENERATE=308, 
		HANDLER=309, HASH=310, HAVING=311, HELP=312, HIGH_PRIORITY=313, HISTOGRAM=314, 
		HISTORY=315, HOST=316, HOSTS=317, HOUR=318, HOUR_MICROSECOND=319, HOUR_MINUTE=320, 
		HOUR_SECOND=321, IDENTIFIED=322, IF=323, IGNORE=324, IGNORE_SERVER_IDS=325, 
		IMPORT=326, IN=327, INACTIVE=328, INDEX=329, INDEXES=330, INFILE=331, 
		INITIAL_SIZE=332, INNER=333, INOUT=334, INSENSITIVE=335, INSERT=336, INSERT_METHOD=337, 
		INSTALL=338, INSTANCE=339, INT=340, INT1=341, INT2=342, INT3=343, INT4=344, 
		INT8=345, INTEGER=346, INTERVAL=347, INTO=348, INVISIBLE=349, INVOKER=350, 
		IO=351, IO_AFTER_GTIDS=352, IO_BEFORE_GTIDS=353, IPC=354, IS=355, ISOLATION=356, 
		ISSUER=357, ITERATE=358, JOIN=359, JSON=360, JSON_TABLE=361, JSON_VALUE=362, 
		KEY=363, KEYS=364, KEY_BLOCK_SIZE=365, KILL=366, LAG=367, LANGUAGE=368, 
		LAST=369, LAST_VALUE=370, LATERAL=371, LEAD=372, LEADING=373, LEAVE=374, 
		LEAVES=375, LEFT=376, LESS=377, LEVEL=378, LIKE=379, LIMIT=380, LINEAR=381, 
		LINES=382, LINESTRING=383, LIST=384, LOAD=385, LOCAL=386, LOCALTIME=387, 
		LOCALTIMESTAMP=388, LOCK=389, LOCKED=390, LOCKS=391, LOGFILE=392, LOGS=393, 
		LONG=394, LONGBLOB=395, LONGTEXT=396, LONG_CHAR_VARYING=397, LONG_VARCHAR=398, 
		LOOP=399, LOW_PRIORITY=400, MASTER=401, MASTER_AUTO_POSITION=402, MASTER_BIND=403, 
		MASTER_COMPRESSION_ALGORITHM=404, MASTER_CONNECT_RETRY=405, MASTER_DELAY=406, 
		MASTER_HEARTBEAT_PERIOD=407, MASTER_HOST=408, MASTER_LOG_FILE=409, MASTER_LOG_POS=410, 
		MASTER_PASSWORD=411, MASTER_PORT=412, MASTER_PUBLIC_KEY_PATH=413, MASTER_RETRY_COUNT=414, 
		MASTER_SERVER_ID=415, MASTER_SSL=416, MASTER_SSL_CA=417, MASTER_SSL_CAPATH=418, 
		MASTER_SSL_CERT=419, MASTER_SSL_CIPHER=420, MASTER_SSL_CRL=421, MASTER_SSL_CRLPATH=422, 
		MASTER_SSL_KEY=423, MASTER_SSL_VERIFY_SERVER_CERT=424, MASTER_TLS_CIPHERSUITES=425, 
		MASTER_TLS_VERSION=426, MASTER_USER=427, MASTER_ZSTD_COMPRESSION_LEVEL=428, 
		MATCH=429, MAXVALUE=430, MAX_CONNECTIONS_PER_HOUR=431, MAX_QUERIES_PER_HOUR=432, 
		MAX_ROWS=433, MAX_SIZE=434, MAX_UPDATES_PER_HOUR=435, MAX_USER_CONNECTIONS=436, 
		MEDIUM=437, MEDIUMBLOB=438, MEDIUMINT=439, MEDIUMTEXT=440, MEMBER=441, 
		MERGE=442, MESSAGE_TEXT=443, MICROSECOND=444, MIDDLEINT=445, MIGRATE=446, 
		MINUTE=447, MINUTE_MICROSECOND=448, MINUTE_SECOND=449, MIN_ROWS=450, MOD=451, 
		MODE=452, MODIFIES=453, MODIFY=454, MONTH=455, MULTILINESTRING=456, MULTIPOINT=457, 
		MULTIPOLYGON=458, MUTEX=459, MYSQL_ERRNO=460, NAME=461, NAMES=462, NATIONAL=463, 
		NATIONAL_CHAR=464, NATIONAL_CHAR_VARYING=465, NATURAL=466, NCHAR=467, 
		NESTED=468, NETWORK_NAMESPACE=469, NEVER=470, NEW=471, NEXT=472, NO=473, 
		NODEGROUP=474, NONE=475, SHARED=476, EXCLUSIVE=477, NOT=478, NOWAIT=479, 
		NO_WAIT=480, NO_WRITE_TO_BINLOG=481, NTH_VALUE=482, NTILE=483, NULL=484, 
		NULLS=485, NUMBER=486, NUMERIC=487, NVARCHAR=488, OF=489, OFF=490, OFFSET=491, 
		OJ=492, OLD=493, ON=494, ONE=495, ONLY=496, OPEN=497, OPTIMIZE=498, OPTIMIZER_COSTS=499, 
		OPTION=500, OPTIONAL=501, OPTIONALLY=502, OPTIONS=503, OR=504, ORDER=505, 
		ORDINALITY=506, ORGANIZATION=507, OTHERS=508, OUT=509, OUTER=510, OUTFILE=511, 
		OVER=512, OWNER=513, PACK_KEYS=514, PAGE=515, PARSER=516, PARTIAL=517, 
		PARTITION=518, PARTITIONING=519, PARTITIONS=520, PASSWORD=521, PASSWORD_LOCK_TIME=522, 
		PATH=523, PERCENT_RANK=524, PERSIST=525, PERSIST_ONLY=526, PHASE=527, 
		PLUGIN=528, PLUGINS=529, PLUGIN_DIR=530, POINT=531, POLYGON=532, PORT=533, 
		PRECEDES=534, PRECEDING=535, PRECISION=536, PREPARE=537, PRESERVE=538, 
		PREV=539, PRIMARY=540, PRIVILEGES=541, PRIVILEGE_CHECKS_USER=542, PROCEDURE=543, 
		PROCESS=544, PROCESSLIST=545, PROFILE=546, PROFILES=547, PROXY=548, PURGE=549, 
		QUARTER=550, QUERY=551, QUICK=552, RANDOM=553, RANGE=554, RANK=555, READ=556, 
		READS=557, READ_ONLY=558, READ_WRITE=559, REAL=560, REBUILD=561, RECOVER=562, 
		RECURSIVE=563, REDO_BUFFER_SIZE=564, REDUNDANT=565, REFERENCE=566, REFERENCES=567, 
		REGEXP=568, RELAY=569, RELAYLOG=570, RELAY_LOG_FILE=571, RELAY_LOG_POS=572, 
		RELAY_THREAD=573, RELEASE=574, RELOAD=575, REMOVE=576, RENAME=577, REORGANIZE=578, 
		REPAIR=579, REPEAT=580, REPEATABLE=581, REPLACE=582, REPLICA=583, REPLICAS=584, 
		REPLICATE_DO_DB=585, REPLICATE_DO_TABLE=586, REPLICATE_IGNORE_DB=587, 
		REPLICATE_IGNORE_TABLE=588, REPLICATE_REWRITE_DB=589, REPLICATE_WILD_DO_TABLE=590, 
		REPLICATE_WILD_IGNORE_TABLE=591, REPLICATION=592, REQUIRE=593, REQUIRE_ROW_FORMAT=594, 
		REQUIRE_TABLE_PRIMARY_KEY_CHECK=595, RESET=596, RESIGNAL=597, RESOURCE=598, 
		RESPECT=599, RESTART=600, RESTORE=601, RESTRICT=602, RESUME=603, RETAIN=604, 
		RETURN=605, RETURNED_SQLSTATE=606, RETURNING=607, RETURNS=608, REUSE=609, 
		REVERSE=610, REVOKE=611, RIGHT=612, RLIKE=613, ROLE=614, ROLLBACK=615, 
		ROLLUP=616, ROTATE=617, ROUTINE=618, ROW=619, ROWS=620, ROW_COUNT=621, 
		ROW_FORMAT=622, ROW_NUMBER=623, RTREE=624, SAVEPOINT=625, SCHEDULE=626, 
		SCHEMA=627, SCHEMAS=628, SCHEMA_NAME=629, SECOND=630, SECONDARY=631, SECONDARY_ENGINE=632, 
		SECONDARY_ENGINE_ATTRIBUTE=633, SECONDARY_LOAD=634, SECONDARY_UNLOAD=635, 
		SECOND_MICROSECOND=636, SECURITY=637, SELECT=638, SENSITIVE=639, SEPARATOR=640, 
		SERIAL=641, SERIALIZABLE=642, SERVER=643, SESSION=644, SET=645, SHARE=646, 
		SHOW=647, SHUTDOWN=648, SIGNAL=649, SIGNED=650, SIGNED_INT=651, SIGNED_INTEGER=652, 
		SIMPLE=653, SKIP_SYMBOL=654, SLAVE=655, SLOW=656, SMALLINT=657, SNAPSHOT=658, 
		SOCKET=659, SONAME=660, SOUNDS=661, SOURCE=662, SPATIAL=663, SPECIFIC=664, 
		SQL=665, SQLEXCEPTION=666, SQLSTATE=667, SQLWARNING=668, SQL_AFTER_GTIDS=669, 
		SQL_AFTER_MTS_GAPS=670, SQL_BEFORE_GTIDS=671, SQL_BIG_RESULT=672, SQL_BUFFER_RESULT=673, 
		SQL_CALC_FOUND_ROWS=674, SQL_NO_CACHE=675, SQL_SMALL_RESULT=676, SQL_THREAD=677, 
		SRID=678, SSL=679, STACKED=680, START=681, STARTING=682, STARTS=683, STATS_AUTO_RECALC=684, 
		STATS_PERSISTENT=685, STATS_SAMPLE_PAGES=686, STATUS=687, STOP=688, STORAGE=689, 
		STORED=690, STRAIGHT_JOIN=691, STREAM=692, STRING=693, SUBCLASS_ORIGIN=694, 
		SUBJECT=695, SUBPARTITION=696, SUBPARTITIONS=697, SUPER=698, SUSPEND=699, 
		SWAPS=700, SWITCHES=701, SYSTEM=702, SOURCE_BIND=703, SOURCE_HOST=704, 
		SOURCE_USER=705, SOURCE_PASSWORD=706, SOURCE_PORT=707, SOURCE_LOG_FILE=708, 
		SOURCE_LOG_POS=709, SOURCE_AUTO_POSITION=710, SOURCE_HEARTBEAT_PERIOD=711, 
		SOURCE_CONNECT_RETRY=712, SOURCE_RETRY_COUNT=713, SOURCE_CONNECTION_AUTO_FAILOVER=714, 
		SOURCE_DELAY=715, SOURCE_COMPRESSION_ALGORITHMS=716, SOURCE_ZSTD_COMPRESSION_LEVEL=717, 
		SOURCE_SSL=718, SOURCE_SSL_CA=719, SOURCE_SSL_CAPATH=720, SOURCE_SSL_CERT=721, 
		SOURCE_SSL_CRL=722, SOURCE_SSL_CRLPATH=723, SOURCE_SSL_KEY=724, SOURCE_SSL_CIPHER=725, 
		SOURCE_SSL_VERIFY_SERVER_CERT=726, SOURCE_TLS_VERSION=727, SOURCE_TLS_CIPHERSUITES=728, 
		SOURCE_PUBLIC_KEY_PATH=729, TABLE=730, TABLES=731, TABLESPACE=732, TABLE_CHECKSUM=733, 
		TABLE_NAME=734, TEMPORARY=735, TEMPTABLE=736, TERMINATED=737, TEXT=738, 
		THAN=739, THEN=740, THREAD_PRIORITY=741, TIES=742, TIME=743, TIMESTAMP=744, 
		TIMESTAMP_ADD=745, TIMESTAMP_DIFF=746, TINYBLOB=747, TINYINT=748, TINYTEXT=749, 
		TLS=750, TO=751, TRAILING=752, TRANSACTION=753, TRIGGER=754, TRIGGERS=755, 
		TRUE=756, TRUNCATE=757, TYPE=758, TYPES=759, UNBOUNDED=760, UNCOMMITTED=761, 
		UNDEFINED=762, UNDO=763, UNDOFILE=764, UNDO_BUFFER_SIZE=765, UNICODE=766, 
		UNINSTALL=767, UNION=768, UNIQUE=769, UNKNOWN=770, UNLOCK=771, UNSIGNED=772, 
		UNSIGNED_INT=773, UNSIGNED_INTEGER=774, UNTIL=775, UPDATE=776, UPGRADE=777, 
		USAGE=778, USE=779, USER=780, USER_RESOURCES=781, USE_FRM=782, USING=783, 
		UTC_DATE=784, UTC_TIME=785, UTC_TIMESTAMP=786, VALIDATION=787, VALUE=788, 
		VALUES=789, VARBINARY=790, VARCHAR=791, VARCHARACTER=792, VARIABLES=793, 
		VARYING=794, VCPU=795, VIEW=796, VIRTUAL=797, VISIBLE=798, WAIT=799, WARNINGS=800, 
		WEEK=801, WEIGHT_STRING=802, WHEN=803, WHERE=804, WHILE=805, WINDOW=806, 
		WITH=807, WITHOUT=808, WORK=809, WRAPPER=810, WRITE=811, X509=812, XA=813, 
		XID=814, XML=815, XOR=816, YEAR=817, YEAR_MONTH=818, ZEROFILL=819, JSON_ARRAY=820, 
		JSON_ARRAY_APPEND=821, JSON_ARRAY_INSERT=822, JSON_CONTAINS=823, JSON_CONTAINS_PATH=824, 
		JSON_DEPTH=825, JSON_EXTRACT=826, JSON_INSERT=827, JSON_KEYS=828, JSON_LENGTH=829, 
		JSON_MERGE=830, JSON_MERGE_PATCH=831, JSON_MERGE_PRESERVE=832, JSON_OBJECT=833, 
		JSON_OVERLAPS=834, JSON_PRETTY=835, JSON_QUOTE=836, JSON_REMOVE=837, JSON_REPLACE=838, 
		JSON_SCHEMA_VALID=839, JSON_SCHEMA_VALIDATION_REPORT=840, JSON_SEARCH=841, 
		JSON_SET=842, JSON_STORAGE_FREE=843, JSON_STORAGE_SIZE=844, JSON_TYPE=845, 
		JSON_UNQUOTE=846, JSON_VALID=847, ZONE=848, FILESIZE_LITERAL=849, SINGLE_QUOTED_TEXT=850, 
		DOUBLE_QUOTED_TEXT=851, BQUOTA_STRING=852, NCHAR_TEXT=853, UNDERSCORE_CHARSET=854, 
		NUMBER_=855, INT_NUM_=856, FLOAT_NUM_=857, DECIMAL_NUM_=858, HEX_DIGIT_=859, 
		BIT_NUM_=860, IDENTIFIER_=861, IP_ADDRESS=862, NOT_SUPPORT_=863;
	public static final int
		RULE_parameterMarker = 0, RULE_customKeyword = 1, RULE_literals = 2, RULE_string_ = 3, 
		RULE_stringLiterals = 4, RULE_numberLiterals = 5, RULE_temporalLiterals = 6, 
		RULE_hexadecimalLiterals = 7, RULE_bitValueLiterals = 8, RULE_booleanLiterals = 9, 
		RULE_nullValueLiterals = 10, RULE_collationName = 11, RULE_identifier = 12, 
		RULE_identifierKeywordsUnambiguous = 13, RULE_identifierKeywordsAmbiguous1RolesAndLabels = 14, 
		RULE_identifierKeywordsAmbiguous2Labels = 15, RULE_identifierKeywordsAmbiguous3Roles = 16, 
		RULE_identifierKeywordsAmbiguous4SystemVariables = 17, RULE_textOrIdentifier = 18, 
		RULE_ipAddress = 19, RULE_variable = 20, RULE_userVariable = 21, RULE_systemVariable = 22, 
		RULE_rvalueSystemVariable = 23, RULE_setSystemVariable = 24, RULE_optionType = 25, 
		RULE_internalVariableName = 26, RULE_setExprOrDefault = 27, RULE_transactionCharacteristics = 28, 
		RULE_isolationLevel = 29, RULE_isolationTypes = 30, RULE_transactionAccessMode = 31, 
		RULE_schemaName = 32, RULE_schemaNames = 33, RULE_charsetName = 34, RULE_schemaPairs = 35, 
		RULE_schemaPair = 36, RULE_tableName = 37, RULE_columnName = 38, RULE_indexName = 39, 
		RULE_constraintName = 40, RULE_oldColumn = 41, RULE_newColumn = 42, RULE_delimiterName = 43, 
		RULE_userIdentifierOrText = 44, RULE_username = 45, RULE_eventName = 46, 
		RULE_serverName = 47, RULE_wrapperName = 48, RULE_functionName = 49, RULE_procedureName = 50, 
		RULE_viewName = 51, RULE_owner = 52, RULE_alias = 53, RULE_name = 54, 
		RULE_tableList = 55, RULE_viewNames = 56, RULE_columnNames = 57, RULE_groupName = 58, 
		RULE_routineName = 59, RULE_shardLibraryName = 60, RULE_componentName = 61, 
		RULE_pluginName = 62, RULE_hostname = 63, RULE_port = 64, RULE_cloneInstance = 65, 
		RULE_cloneDir = 66, RULE_channelName = 67, RULE_logName = 68, RULE_roleName = 69, 
		RULE_roleIdentifierOrText = 70, RULE_engineRef = 71, RULE_triggerName = 72, 
		RULE_triggerTime = 73, RULE_tableOrTables = 74, RULE_userOrRole = 75, 
		RULE_partitionName = 76, RULE_identifierList = 77, RULE_allOrPartitionNameList = 78, 
		RULE_triggerEvent = 79, RULE_triggerOrder = 80, RULE_expr = 81, RULE_andOperator = 82, 
		RULE_orOperator = 83, RULE_notOperator = 84, RULE_booleanPrimary = 85, 
		RULE_assignmentOperator = 86, RULE_comparisonOperator = 87, RULE_predicate = 88, 
		RULE_bitExpr = 89, RULE_simpleExpr = 90, RULE_path = 91, RULE_onEmptyError = 92, 
		RULE_columnRef = 93, RULE_columnRefList = 94, RULE_functionCall = 95, 
		RULE_udfFunction = 96, RULE_aggregationFunction = 97, RULE_jsonFunction = 98, 
		RULE_jsonFunctionName = 99, RULE_aggregationFunctionName = 100, RULE_distinct = 101, 
		RULE_overClause = 102, RULE_windowSpecification = 103, RULE_frameClause = 104, 
		RULE_frameStart = 105, RULE_frameEnd = 106, RULE_frameBetween = 107, RULE_specialFunction = 108, 
		RULE_currentUserFunction = 109, RULE_groupingFunction = 110, RULE_groupConcatFunction = 111, 
		RULE_windowFunction = 112, RULE_windowingClause = 113, RULE_leadLagInfo = 114, 
		RULE_nullTreatment = 115, RULE_checkType = 116, RULE_repairType = 117, 
		RULE_castFunction = 118, RULE_convertFunction = 119, RULE_castType = 120, 
		RULE_positionFunction = 121, RULE_substringFunction = 122, RULE_extractFunction = 123, 
		RULE_charFunction = 124, RULE_trimFunction = 125, RULE_valuesFunction = 126, 
		RULE_weightStringFunction = 127, RULE_levelClause = 128, RULE_levelInWeightListElement = 129, 
		RULE_regularFunction = 130, RULE_shorthandRegularFunction = 131, RULE_completeRegularFunction = 132, 
		RULE_regularFunctionName = 133, RULE_matchExpression = 134, RULE_matchSearchModifier = 135, 
		RULE_caseExpression = 136, RULE_datetimeExpr = 137, RULE_binaryLogFileIndexNumber = 138, 
		RULE_caseWhen = 139, RULE_caseElse = 140, RULE_intervalExpression = 141, 
		RULE_intervalValue = 142, RULE_intervalUnit = 143, RULE_subquery = 144, 
		RULE_orderByClause = 145, RULE_orderByItem = 146, RULE_dataType = 147, 
		RULE_stringList = 148, RULE_textString = 149, RULE_textStringHash = 150, 
		RULE_fieldOptions = 151, RULE_precision = 152, RULE_typeDatetimePrecision = 153, 
		RULE_charsetWithOptBinary = 154, RULE_ascii = 155, RULE_unicode = 156, 
		RULE_charset = 157, RULE_defaultCollation = 158, RULE_defaultEncryption = 159, 
		RULE_defaultCharset = 160, RULE_now = 161, RULE_columnFormat = 162, RULE_storageMedia = 163, 
		RULE_direction = 164, RULE_keyOrIndex = 165, RULE_fieldLength = 166, RULE_characterSet = 167, 
		RULE_collateClause = 168, RULE_fieldOrVarSpec = 169, RULE_ifNotExists = 170, 
		RULE_ifExists = 171, RULE_connectionId = 172, RULE_labelName = 173, RULE_cursorName = 174, 
		RULE_conditionName = 175, RULE_combineOption = 176, RULE_noWriteToBinLog = 177, 
		RULE_channelOption = 178;
	private static String[] makeRuleNames() {
		return new String[] {
			"parameterMarker", "customKeyword", "literals", "string_", "stringLiterals", 
			"numberLiterals", "temporalLiterals", "hexadecimalLiterals", "bitValueLiterals", 
			"booleanLiterals", "nullValueLiterals", "collationName", "identifier", 
			"identifierKeywordsUnambiguous", "identifierKeywordsAmbiguous1RolesAndLabels", 
			"identifierKeywordsAmbiguous2Labels", "identifierKeywordsAmbiguous3Roles", 
			"identifierKeywordsAmbiguous4SystemVariables", "textOrIdentifier", "ipAddress", 
			"variable", "userVariable", "systemVariable", "rvalueSystemVariable", 
			"setSystemVariable", "optionType", "internalVariableName", "setExprOrDefault", 
			"transactionCharacteristics", "isolationLevel", "isolationTypes", "transactionAccessMode", 
			"schemaName", "schemaNames", "charsetName", "schemaPairs", "schemaPair", 
			"tableName", "columnName", "indexName", "constraintName", "oldColumn", 
			"newColumn", "delimiterName", "userIdentifierOrText", "username", "eventName", 
			"serverName", "wrapperName", "functionName", "procedureName", "viewName", 
			"owner", "alias", "name", "tableList", "viewNames", "columnNames", "groupName", 
			"routineName", "shardLibraryName", "componentName", "pluginName", "hostname", 
			"port", "cloneInstance", "cloneDir", "channelName", "logName", "roleName", 
			"roleIdentifierOrText", "engineRef", "triggerName", "triggerTime", "tableOrTables", 
			"userOrRole", "partitionName", "identifierList", "allOrPartitionNameList", 
			"triggerEvent", "triggerOrder", "expr", "andOperator", "orOperator", 
			"notOperator", "booleanPrimary", "assignmentOperator", "comparisonOperator", 
			"predicate", "bitExpr", "simpleExpr", "path", "onEmptyError", "columnRef", 
			"columnRefList", "functionCall", "udfFunction", "aggregationFunction", 
			"jsonFunction", "jsonFunctionName", "aggregationFunctionName", "distinct", 
			"overClause", "windowSpecification", "frameClause", "frameStart", "frameEnd", 
			"frameBetween", "specialFunction", "currentUserFunction", "groupingFunction", 
			"groupConcatFunction", "windowFunction", "windowingClause", "leadLagInfo", 
			"nullTreatment", "checkType", "repairType", "castFunction", "convertFunction", 
			"castType", "positionFunction", "substringFunction", "extractFunction", 
			"charFunction", "trimFunction", "valuesFunction", "weightStringFunction", 
			"levelClause", "levelInWeightListElement", "regularFunction", "shorthandRegularFunction", 
			"completeRegularFunction", "regularFunctionName", "matchExpression", 
			"matchSearchModifier", "caseExpression", "datetimeExpr", "binaryLogFileIndexNumber", 
			"caseWhen", "caseElse", "intervalExpression", "intervalValue", "intervalUnit", 
			"subquery", "orderByClause", "orderByItem", "dataType", "stringList", 
			"textString", "textStringHash", "fieldOptions", "precision", "typeDatetimePrecision", 
			"charsetWithOptBinary", "ascii", "unicode", "charset", "defaultCollation", 
			"defaultEncryption", "defaultCharset", "now", "columnFormat", "storageMedia", 
			"direction", "keyOrIndex", "fieldLength", "characterSet", "collateClause", 
			"fieldOrVarSpec", "ifNotExists", "ifExists", "connectionId", "labelName", 
			"cursorName", "conditionName", "combineOption", "noWriteToBinLog", "channelOption"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'refer subquery in DMStement.g4'", "'&&'", "'||'", "'!'", "'~'", 
			"'|'", "'&'", "'<<'", "'>>'", "'^'", "'%'", "':'", "'+'", "'-'", "'*'", 
			"'/'", "'\\'", "'.'", "'.*'", "'<=>'", "'=='", "'='", null, "'>'", "'>='", 
			"'<'", "'<='", "'#'", "'('", "')'", "'{'", "'}'", "'['", "']'", "','", 
			"'\"'", "'''", "'`'", "'?'", "'@'", "';'", "':='", "'->'", "'->>'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'REDO_LOG'", null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			"'DO NOT MATCH ANY THING, JUST FOR GENERATOR'", null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, null, null, null, 
			null, null, null, null, null, null, null, null, null, "'not support'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", 
			"SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", 
			"PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", 
			"SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", 
			"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", 
			"BQ_", "QUESTION_", "AT_", "SEMI_", "ASSIGNMENT_", "JSON_SEPARATOR", 
			"JSON_UNQUOTED_SEPARATOR", "WS", "MAX", "MIN", "SUM", "COUNT", "GROUP_CONCAT", 
			"CAST", "POSITION", "SUBSTRING", "SUBSTR", "EXTRACT", "TRIM", "LAST_DAY", 
			"TRADITIONAL", "TREE", "MYSQL_MAIN", "MYSQL_ADMIN", "INSTANT", "INPLACE", 
			"COPY", "UL_BINARY", "AUTOCOMMIT", "REDO_LOG", "DELIMITER", "ARCHIVE", 
			"BLACKHOLE", "CSV", "FEDERATED", "INNODB", "MEMORY", "MRG_MYISAM", "MYISAM", 
			"NDB", "NDBCLUSTER", "PERFORMANCE_SCHEMA", "TOKUDB", "FOR_GENERATOR", 
			"ACCESSIBLE", "ACCOUNT", "ACTION", "ACTIVE", "ADD", "ADMIN", "AFTER", 
			"AGAINST", "AGGREGATE", "ALGORITHM", "ALL", "ALTER", "ALWAYS", "ANALYZE", 
			"AND", "ANY", "ARRAY", "AS", "ASC", "ASCII", "ASENSITIVE", "AT", "ATTRIBUTE", 
			"AUTOEXTEND_SIZE", "AUTO_INCREMENT", "AVG", "ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS", 
			"BIT_XOR", "AVG_ROW_LENGTH", "BACKUP", "BEFORE", "BEGIN", "BETWEEN", 
			"BIGINT", "BINARY", "BINLOG", "BIT", "BLOB", "BLOCK", "BOOL", "BOOLEAN", 
			"BOTH", "BTREE", "BUCKETS", "BY", "BYTE", "CACHE", "CALL", "CASCADE", 
			"CASCADED", "CASE", "CATALOG_NAME", "CHAIN", "CHANGE", "CHANGED", "CHANNEL", 
			"CHAR", "CHAR_VARYING", "CHARACTER", "CHARACTER_VARYING", "CHARSET", 
			"CHECK", "CHECKSUM", "CIPHER", "CLASS_ORIGIN", "CLIENT", "CLONE", "CLOSE", 
			"COALESCE", "CODE", "COLLATE", "COLLATION", "COLUMN", "COLUMNS", "COLUMN_FORMAT", 
			"COLUMN_NAME", "COMMENT", "COMMIT", "COMMITTED", "COMPACT", "COMPLETION", 
			"COMPONENT", "COMPRESSED", "COMPRESSION", "CONCURRENT", "CONDITION", 
			"CONNECTION", "CONSISTENT", "CONSTRAINT", "CONSTRAINT_CATALOG", "CONSTRAINT_NAME", 
			"CONSTRAINT_SCHEMA", "CONTAINS", "CONTEXT", "CONTINUE", "CONVERT", "CPU", 
			"CREATE", "CROSS", "CUBE", "CUME_DIST", "CURRENT", "CURRENT_DATE", "CURRENT_TIME", 
			"CURRENT_TIMESTAMP", "CURRENT_USER", "CURSOR", "CURSOR_NAME", "DATA", 
			"DATABASE", "DATABASES", "DATAFILE", "DATE", "DATETIME", "DAY", "DAY_HOUR", 
			"DAY_MICROSECOND", "DAY_MINUTE", "DAY_SECOND", "DEALLOCATE", "DEC", "DECIMAL", 
			"DECLARE", "DEFAULT", "DEFAULT_AUTH", "DEFINER", "DEFINITION", "DELAYED", 
			"DELAY_KEY_WRITE", "DELETE", "DENSE_RANK", "DESC", "DESCRIBE", "DESCRIPTION", 
			"DETERMINISTIC", "DIAGNOSTICS", "DIRECTORY", "DISABLE", "DISCARD", "DISK", 
			"DISTINCT", "DISTINCTROW", "DIV", "DO", "DOUBLE", "DROP", "DUAL", "DUMPFILE", 
			"DUPLICATE", "DYNAMIC", "EACH", "ELSE", "ELSEIF", "EMPTY", "ENABLE", 
			"ENCLOSED", "ENCRYPTION", "END", "ENDS", "ENFORCED", "ENGINE", "ENGINES", 
			"ENGINE_ATTRIBUTE", "ENUM", "ERROR", "ERRORS", "ESCAPE", "ESCAPED", "EVENT", 
			"EVENTS", "EVERY", "EXCEPT", "EXCHANGE", "EXCLUDE", "EXECUTE", "EXISTS", 
			"EXIT", "EXPANSION", "EXPIRE", "EXPLAIN", "EXPORT", "EXTENDED", "EXTENT_SIZE", 
			"FAILED_LOGIN_ATTEMPTS", "FALSE", "FAST", "FAULTS", "FETCH", "FILE", 
			"FILE_BLOCK_SIZE", "FILTER", "FIRST", "FIRST_VALUE", "FIXED", "FLOAT", 
			"FLOAT4", "FLOAT8", "FLUSH", "FOLLOWING", "FOLLOWS", "FOR", "FORCE", 
			"FOREIGN", "FORMAT", "FOUND", "FROM", "FULL", "FULLTEXT", "FUNCTION", 
			"GENERAL", "GENERATED", "GEOMETRY", "GEOMCOLLECTION", "GEOMETRYCOLLECTION", 
			"GET", "GET_FORMAT", "GET_MASTER_PUBLIC_KEY", "GLOBAL", "GRANT", "GRANTS", 
			"GROUP", "GROUPING", "GROUPS", "GROUP_REPLICATION", "GET_SOURCE_PUBLIC_KEY", 
			"GTID_ONLY", "GENERATE", "HANDLER", "HASH", "HAVING", "HELP", "HIGH_PRIORITY", 
			"HISTOGRAM", "HISTORY", "HOST", "HOSTS", "HOUR", "HOUR_MICROSECOND", 
			"HOUR_MINUTE", "HOUR_SECOND", "IDENTIFIED", "IF", "IGNORE", "IGNORE_SERVER_IDS", 
			"IMPORT", "IN", "INACTIVE", "INDEX", "INDEXES", "INFILE", "INITIAL_SIZE", 
			"INNER", "INOUT", "INSENSITIVE", "INSERT", "INSERT_METHOD", "INSTALL", 
			"INSTANCE", "INT", "INT1", "INT2", "INT3", "INT4", "INT8", "INTEGER", 
			"INTERVAL", "INTO", "INVISIBLE", "INVOKER", "IO", "IO_AFTER_GTIDS", "IO_BEFORE_GTIDS", 
			"IPC", "IS", "ISOLATION", "ISSUER", "ITERATE", "JOIN", "JSON", "JSON_TABLE", 
			"JSON_VALUE", "KEY", "KEYS", "KEY_BLOCK_SIZE", "KILL", "LAG", "LANGUAGE", 
			"LAST", "LAST_VALUE", "LATERAL", "LEAD", "LEADING", "LEAVE", "LEAVES", 
			"LEFT", "LESS", "LEVEL", "LIKE", "LIMIT", "LINEAR", "LINES", "LINESTRING", 
			"LIST", "LOAD", "LOCAL", "LOCALTIME", "LOCALTIMESTAMP", "LOCK", "LOCKED", 
			"LOCKS", "LOGFILE", "LOGS", "LONG", "LONGBLOB", "LONGTEXT", "LONG_CHAR_VARYING", 
			"LONG_VARCHAR", "LOOP", "LOW_PRIORITY", "MASTER", "MASTER_AUTO_POSITION", 
			"MASTER_BIND", "MASTER_COMPRESSION_ALGORITHM", "MASTER_CONNECT_RETRY", 
			"MASTER_DELAY", "MASTER_HEARTBEAT_PERIOD", "MASTER_HOST", "MASTER_LOG_FILE", 
			"MASTER_LOG_POS", "MASTER_PASSWORD", "MASTER_PORT", "MASTER_PUBLIC_KEY_PATH", 
			"MASTER_RETRY_COUNT", "MASTER_SERVER_ID", "MASTER_SSL", "MASTER_SSL_CA", 
			"MASTER_SSL_CAPATH", "MASTER_SSL_CERT", "MASTER_SSL_CIPHER", "MASTER_SSL_CRL", 
			"MASTER_SSL_CRLPATH", "MASTER_SSL_KEY", "MASTER_SSL_VERIFY_SERVER_CERT", 
			"MASTER_TLS_CIPHERSUITES", "MASTER_TLS_VERSION", "MASTER_USER", "MASTER_ZSTD_COMPRESSION_LEVEL", 
			"MATCH", "MAXVALUE", "MAX_CONNECTIONS_PER_HOUR", "MAX_QUERIES_PER_HOUR", 
			"MAX_ROWS", "MAX_SIZE", "MAX_UPDATES_PER_HOUR", "MAX_USER_CONNECTIONS", 
			"MEDIUM", "MEDIUMBLOB", "MEDIUMINT", "MEDIUMTEXT", "MEMBER", "MERGE", 
			"MESSAGE_TEXT", "MICROSECOND", "MIDDLEINT", "MIGRATE", "MINUTE", "MINUTE_MICROSECOND", 
			"MINUTE_SECOND", "MIN_ROWS", "MOD", "MODE", "MODIFIES", "MODIFY", "MONTH", 
			"MULTILINESTRING", "MULTIPOINT", "MULTIPOLYGON", "MUTEX", "MYSQL_ERRNO", 
			"NAME", "NAMES", "NATIONAL", "NATIONAL_CHAR", "NATIONAL_CHAR_VARYING", 
			"NATURAL", "NCHAR", "NESTED", "NETWORK_NAMESPACE", "NEVER", "NEW", "NEXT", 
			"NO", "NODEGROUP", "NONE", "SHARED", "EXCLUSIVE", "NOT", "NOWAIT", "NO_WAIT", 
			"NO_WRITE_TO_BINLOG", "NTH_VALUE", "NTILE", "NULL", "NULLS", "NUMBER", 
			"NUMERIC", "NVARCHAR", "OF", "OFF", "OFFSET", "OJ", "OLD", "ON", "ONE", 
			"ONLY", "OPEN", "OPTIMIZE", "OPTIMIZER_COSTS", "OPTION", "OPTIONAL", 
			"OPTIONALLY", "OPTIONS", "OR", "ORDER", "ORDINALITY", "ORGANIZATION", 
			"OTHERS", "OUT", "OUTER", "OUTFILE", "OVER", "OWNER", "PACK_KEYS", "PAGE", 
			"PARSER", "PARTIAL", "PARTITION", "PARTITIONING", "PARTITIONS", "PASSWORD", 
			"PASSWORD_LOCK_TIME", "PATH", "PERCENT_RANK", "PERSIST", "PERSIST_ONLY", 
			"PHASE", "PLUGIN", "PLUGINS", "PLUGIN_DIR", "POINT", "POLYGON", "PORT", 
			"PRECEDES", "PRECEDING", "PRECISION", "PREPARE", "PRESERVE", "PREV", 
			"PRIMARY", "PRIVILEGES", "PRIVILEGE_CHECKS_USER", "PROCEDURE", "PROCESS", 
			"PROCESSLIST", "PROFILE", "PROFILES", "PROXY", "PURGE", "QUARTER", "QUERY", 
			"QUICK", "RANDOM", "RANGE", "RANK", "READ", "READS", "READ_ONLY", "READ_WRITE", 
			"REAL", "REBUILD", "RECOVER", "RECURSIVE", "REDO_BUFFER_SIZE", "REDUNDANT", 
			"REFERENCE", "REFERENCES", "REGEXP", "RELAY", "RELAYLOG", "RELAY_LOG_FILE", 
			"RELAY_LOG_POS", "RELAY_THREAD", "RELEASE", "RELOAD", "REMOVE", "RENAME", 
			"REORGANIZE", "REPAIR", "REPEAT", "REPEATABLE", "REPLACE", "REPLICA", 
			"REPLICAS", "REPLICATE_DO_DB", "REPLICATE_DO_TABLE", "REPLICATE_IGNORE_DB", 
			"REPLICATE_IGNORE_TABLE", "REPLICATE_REWRITE_DB", "REPLICATE_WILD_DO_TABLE", 
			"REPLICATE_WILD_IGNORE_TABLE", "REPLICATION", "REQUIRE", "REQUIRE_ROW_FORMAT", 
			"REQUIRE_TABLE_PRIMARY_KEY_CHECK", "RESET", "RESIGNAL", "RESOURCE", "RESPECT", 
			"RESTART", "RESTORE", "RESTRICT", "RESUME", "RETAIN", "RETURN", "RETURNED_SQLSTATE", 
			"RETURNING", "RETURNS", "REUSE", "REVERSE", "REVOKE", "RIGHT", "RLIKE", 
			"ROLE", "ROLLBACK", "ROLLUP", "ROTATE", "ROUTINE", "ROW", "ROWS", "ROW_COUNT", 
			"ROW_FORMAT", "ROW_NUMBER", "RTREE", "SAVEPOINT", "SCHEDULE", "SCHEMA", 
			"SCHEMAS", "SCHEMA_NAME", "SECOND", "SECONDARY", "SECONDARY_ENGINE", 
			"SECONDARY_ENGINE_ATTRIBUTE", "SECONDARY_LOAD", "SECONDARY_UNLOAD", "SECOND_MICROSECOND", 
			"SECURITY", "SELECT", "SENSITIVE", "SEPARATOR", "SERIAL", "SERIALIZABLE", 
			"SERVER", "SESSION", "SET", "SHARE", "SHOW", "SHUTDOWN", "SIGNAL", "SIGNED", 
			"SIGNED_INT", "SIGNED_INTEGER", "SIMPLE", "SKIP_SYMBOL", "SLAVE", "SLOW", 
			"SMALLINT", "SNAPSHOT", "SOCKET", "SONAME", "SOUNDS", "SOURCE", "SPATIAL", 
			"SPECIFIC", "SQL", "SQLEXCEPTION", "SQLSTATE", "SQLWARNING", "SQL_AFTER_GTIDS", 
			"SQL_AFTER_MTS_GAPS", "SQL_BEFORE_GTIDS", "SQL_BIG_RESULT", "SQL_BUFFER_RESULT", 
			"SQL_CALC_FOUND_ROWS", "SQL_NO_CACHE", "SQL_SMALL_RESULT", "SQL_THREAD", 
			"SRID", "SSL", "STACKED", "START", "STARTING", "STARTS", "STATS_AUTO_RECALC", 
			"STATS_PERSISTENT", "STATS_SAMPLE_PAGES", "STATUS", "STOP", "STORAGE", 
			"STORED", "STRAIGHT_JOIN", "STREAM", "STRING", "SUBCLASS_ORIGIN", "SUBJECT", 
			"SUBPARTITION", "SUBPARTITIONS", "SUPER", "SUSPEND", "SWAPS", "SWITCHES", 
			"SYSTEM", "SOURCE_BIND", "SOURCE_HOST", "SOURCE_USER", "SOURCE_PASSWORD", 
			"SOURCE_PORT", "SOURCE_LOG_FILE", "SOURCE_LOG_POS", "SOURCE_AUTO_POSITION", 
			"SOURCE_HEARTBEAT_PERIOD", "SOURCE_CONNECT_RETRY", "SOURCE_RETRY_COUNT", 
			"SOURCE_CONNECTION_AUTO_FAILOVER", "SOURCE_DELAY", "SOURCE_COMPRESSION_ALGORITHMS", 
			"SOURCE_ZSTD_COMPRESSION_LEVEL", "SOURCE_SSL", "SOURCE_SSL_CA", "SOURCE_SSL_CAPATH", 
			"SOURCE_SSL_CERT", "SOURCE_SSL_CRL", "SOURCE_SSL_CRLPATH", "SOURCE_SSL_KEY", 
			"SOURCE_SSL_CIPHER", "SOURCE_SSL_VERIFY_SERVER_CERT", "SOURCE_TLS_VERSION", 
			"SOURCE_TLS_CIPHERSUITES", "SOURCE_PUBLIC_KEY_PATH", "TABLE", "TABLES", 
			"TABLESPACE", "TABLE_CHECKSUM", "TABLE_NAME", "TEMPORARY", "TEMPTABLE", 
			"TERMINATED", "TEXT", "THAN", "THEN", "THREAD_PRIORITY", "TIES", "TIME", 
			"TIMESTAMP", "TIMESTAMP_ADD", "TIMESTAMP_DIFF", "TINYBLOB", "TINYINT", 
			"TINYTEXT", "TLS", "TO", "TRAILING", "TRANSACTION", "TRIGGER", "TRIGGERS", 
			"TRUE", "TRUNCATE", "TYPE", "TYPES", "UNBOUNDED", "UNCOMMITTED", "UNDEFINED", 
			"UNDO", "UNDOFILE", "UNDO_BUFFER_SIZE", "UNICODE", "UNINSTALL", "UNION", 
			"UNIQUE", "UNKNOWN", "UNLOCK", "UNSIGNED", "UNSIGNED_INT", "UNSIGNED_INTEGER", 
			"UNTIL", "UPDATE", "UPGRADE", "USAGE", "USE", "USER", "USER_RESOURCES", 
			"USE_FRM", "USING", "UTC_DATE", "UTC_TIME", "UTC_TIMESTAMP", "VALIDATION", 
			"VALUE", "VALUES", "VARBINARY", "VARCHAR", "VARCHARACTER", "VARIABLES", 
			"VARYING", "VCPU", "VIEW", "VIRTUAL", "VISIBLE", "WAIT", "WARNINGS", 
			"WEEK", "WEIGHT_STRING", "WHEN", "WHERE", "WHILE", "WINDOW", "WITH", 
			"WITHOUT", "WORK", "WRAPPER", "WRITE", "X509", "XA", "XID", "XML", "XOR", 
			"YEAR", "YEAR_MONTH", "ZEROFILL", "JSON_ARRAY", "JSON_ARRAY_APPEND", 
			"JSON_ARRAY_INSERT", "JSON_CONTAINS", "JSON_CONTAINS_PATH", "JSON_DEPTH", 
			"JSON_EXTRACT", "JSON_INSERT", "JSON_KEYS", "JSON_LENGTH", "JSON_MERGE", 
			"JSON_MERGE_PATCH", "JSON_MERGE_PRESERVE", "JSON_OBJECT", "JSON_OVERLAPS", 
			"JSON_PRETTY", "JSON_QUOTE", "JSON_REMOVE", "JSON_REPLACE", "JSON_SCHEMA_VALID", 
			"JSON_SCHEMA_VALIDATION_REPORT", "JSON_SEARCH", "JSON_SET", "JSON_STORAGE_FREE", 
			"JSON_STORAGE_SIZE", "JSON_TYPE", "JSON_UNQUOTE", "JSON_VALID", "ZONE", 
			"FILESIZE_LITERAL", "SINGLE_QUOTED_TEXT", "DOUBLE_QUOTED_TEXT", "BQUOTA_STRING", 
			"NCHAR_TEXT", "UNDERSCORE_CHARSET", "NUMBER_", "INT_NUM_", "FLOAT_NUM_", 
			"DECIMAL_NUM_", "HEX_DIGIT_", "BIT_NUM_", "IDENTIFIER_", "IP_ADDRESS", 
			"NOT_SUPPORT_"
		};
	}
	private static final String[] _SYMBOLIC_NAMES = makeSymbolicNames();
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "BaseRule.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public BaseRuleParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ParameterMarkerContext extends ParserRuleContext {
		public TerminalNode QUESTION_() { return getToken(BaseRuleParser.QUESTION_, 0); }
		public ParameterMarkerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parameterMarker; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterParameterMarker(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitParameterMarker(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitParameterMarker(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParameterMarkerContext parameterMarker() throws RecognitionException {
		ParameterMarkerContext _localctx = new ParameterMarkerContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parameterMarker);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(358);
			match(QUESTION_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CustomKeywordContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(BaseRuleParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(BaseRuleParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(BaseRuleParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(BaseRuleParser.COUNT, 0); }
		public TerminalNode GROUP_CONCAT() { return getToken(BaseRuleParser.GROUP_CONCAT, 0); }
		public TerminalNode CAST() { return getToken(BaseRuleParser.CAST, 0); }
		public TerminalNode POSITION() { return getToken(BaseRuleParser.POSITION, 0); }
		public TerminalNode SUBSTRING() { return getToken(BaseRuleParser.SUBSTRING, 0); }
		public TerminalNode SUBSTR() { return getToken(BaseRuleParser.SUBSTR, 0); }
		public TerminalNode EXTRACT() { return getToken(BaseRuleParser.EXTRACT, 0); }
		public TerminalNode TRIM() { return getToken(BaseRuleParser.TRIM, 0); }
		public TerminalNode LAST_DAY() { return getToken(BaseRuleParser.LAST_DAY, 0); }
		public TerminalNode TRADITIONAL() { return getToken(BaseRuleParser.TRADITIONAL, 0); }
		public TerminalNode TREE() { return getToken(BaseRuleParser.TREE, 0); }
		public TerminalNode MYSQL_ADMIN() { return getToken(BaseRuleParser.MYSQL_ADMIN, 0); }
		public TerminalNode INSTANT() { return getToken(BaseRuleParser.INSTANT, 0); }
		public TerminalNode INPLACE() { return getToken(BaseRuleParser.INPLACE, 0); }
		public TerminalNode COPY() { return getToken(BaseRuleParser.COPY, 0); }
		public TerminalNode UL_BINARY() { return getToken(BaseRuleParser.UL_BINARY, 0); }
		public TerminalNode AUTOCOMMIT() { return getToken(BaseRuleParser.AUTOCOMMIT, 0); }
		public TerminalNode ARCHIVE() { return getToken(BaseRuleParser.ARCHIVE, 0); }
		public TerminalNode BLACKHOLE() { return getToken(BaseRuleParser.BLACKHOLE, 0); }
		public TerminalNode CSV() { return getToken(BaseRuleParser.CSV, 0); }
		public TerminalNode FEDERATED() { return getToken(BaseRuleParser.FEDERATED, 0); }
		public TerminalNode INNODB() { return getToken(BaseRuleParser.INNODB, 0); }
		public TerminalNode MEMORY() { return getToken(BaseRuleParser.MEMORY, 0); }
		public TerminalNode MRG_MYISAM() { return getToken(BaseRuleParser.MRG_MYISAM, 0); }
		public TerminalNode MYISAM() { return getToken(BaseRuleParser.MYISAM, 0); }
		public TerminalNode NDB() { return getToken(BaseRuleParser.NDB, 0); }
		public TerminalNode NDBCLUSTER() { return getToken(BaseRuleParser.NDBCLUSTER, 0); }
		public TerminalNode PERFORMANCE_SCHEMA() { return getToken(BaseRuleParser.PERFORMANCE_SCHEMA, 0); }
		public TerminalNode TOKUDB() { return getToken(BaseRuleParser.TOKUDB, 0); }
		public TerminalNode REDO_LOG() { return getToken(BaseRuleParser.REDO_LOG, 0); }
		public TerminalNode LAST_VALUE() { return getToken(BaseRuleParser.LAST_VALUE, 0); }
		public TerminalNode PRIMARY() { return getToken(BaseRuleParser.PRIMARY, 0); }
		public TerminalNode MAXVALUE() { return getToken(BaseRuleParser.MAXVALUE, 0); }
		public TerminalNode BIT_XOR() { return getToken(BaseRuleParser.BIT_XOR, 0); }
		public TerminalNode MYSQL_MAIN() { return getToken(BaseRuleParser.MYSQL_MAIN, 0); }
		public TerminalNode UTC_DATE() { return getToken(BaseRuleParser.UTC_DATE, 0); }
		public TerminalNode UTC_TIME() { return getToken(BaseRuleParser.UTC_TIME, 0); }
		public TerminalNode UTC_TIMESTAMP() { return getToken(BaseRuleParser.UTC_TIMESTAMP, 0); }
		public CustomKeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_customKeyword; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCustomKeyword(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCustomKeyword(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCustomKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CustomKeywordContext customKeyword() throws RecognitionException {
		CustomKeywordContext _localctx = new CustomKeywordContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_customKeyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(360);
			_la = _input.LA(1);
			if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & -9223372002499231745L) != 0) || _la==LAST_VALUE || _la==MAXVALUE || _la==PRIMARY || ((((_la - 784)) & ~0x3f) == 0 && ((1L << (_la - 784)) & 7L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LiteralsContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public TemporalLiteralsContext temporalLiterals() {
			return getRuleContext(TemporalLiteralsContext.class,0);
		}
		public HexadecimalLiteralsContext hexadecimalLiterals() {
			return getRuleContext(HexadecimalLiteralsContext.class,0);
		}
		public BitValueLiteralsContext bitValueLiterals() {
			return getRuleContext(BitValueLiteralsContext.class,0);
		}
		public BooleanLiteralsContext booleanLiterals() {
			return getRuleContext(BooleanLiteralsContext.class,0);
		}
		public NullValueLiteralsContext nullValueLiterals() {
			return getRuleContext(NullValueLiteralsContext.class,0);
		}
		public LiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_literals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LiteralsContext literals() throws RecognitionException {
		LiteralsContext _localctx = new LiteralsContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_literals);
		try {
			setState(369);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,0,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(362);
				stringLiterals();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(363);
				numberLiterals();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(364);
				temporalLiterals();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(365);
				hexadecimalLiterals();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(366);
				bitValueLiterals();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(367);
				booleanLiterals();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(368);
				nullValueLiterals();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class String_Context extends ParserRuleContext {
		public TerminalNode DOUBLE_QUOTED_TEXT() { return getToken(BaseRuleParser.DOUBLE_QUOTED_TEXT, 0); }
		public TerminalNode SINGLE_QUOTED_TEXT() { return getToken(BaseRuleParser.SINGLE_QUOTED_TEXT, 0); }
		public String_Context(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterString_(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitString_(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitString_(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_Context string_() throws RecognitionException {
		String_Context _localctx = new String_Context(_ctx, getState());
		enterRule(_localctx, 6, RULE_string_);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(371);
			_la = _input.LA(1);
			if ( !(_la==SINGLE_QUOTED_TEXT || _la==DOUBLE_QUOTED_TEXT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringLiteralsContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public TerminalNode UNDERSCORE_CHARSET() { return getToken(BaseRuleParser.UNDERSCORE_CHARSET, 0); }
		public TerminalNode UL_BINARY() { return getToken(BaseRuleParser.UL_BINARY, 0); }
		public TerminalNode NCHAR_TEXT() { return getToken(BaseRuleParser.NCHAR_TEXT, 0); }
		public StringLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterStringLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitStringLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitStringLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringLiteralsContext stringLiterals() throws RecognitionException {
		StringLiteralsContext _localctx = new StringLiteralsContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_stringLiterals);
		int _la;
		try {
			setState(378);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UL_BINARY:
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
			case UNDERSCORE_CHARSET:
				enterOuterAlt(_localctx, 1);
				{
				setState(374);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UL_BINARY || _la==UNDERSCORE_CHARSET) {
					{
					setState(373);
					_la = _input.LA(1);
					if ( !(_la==UL_BINARY || _la==UNDERSCORE_CHARSET) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(376);
				string_();
				}
				break;
			case NCHAR_TEXT:
				enterOuterAlt(_localctx, 2);
				{
				setState(377);
				match(NCHAR_TEXT);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NumberLiteralsContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public TerminalNode PLUS_() { return getToken(BaseRuleParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(BaseRuleParser.MINUS_, 0); }
		public NumberLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_numberLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNumberLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNumberLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNumberLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NumberLiteralsContext numberLiterals() throws RecognitionException {
		NumberLiteralsContext _localctx = new NumberLiteralsContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_numberLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(381);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS_ || _la==MINUS_) {
				{
				setState(380);
				_la = _input.LA(1);
				if ( !(_la==PLUS_ || _la==MINUS_) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(383);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TemporalLiteralsContext extends ParserRuleContext {
		public TextStringContext textString() {
			return getRuleContext(TextStringContext.class,0);
		}
		public TerminalNode DATE() { return getToken(BaseRuleParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(BaseRuleParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(BaseRuleParser.TIMESTAMP, 0); }
		public TemporalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_temporalLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTemporalLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTemporalLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTemporalLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TemporalLiteralsContext temporalLiterals() throws RecognitionException {
		TemporalLiteralsContext _localctx = new TemporalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_temporalLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(385);
			_la = _input.LA(1);
			if ( !(_la==DATE || _la==TIME || _la==TIMESTAMP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(386);
			textString();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HexadecimalLiteralsContext extends ParserRuleContext {
		public TerminalNode HEX_DIGIT_() { return getToken(BaseRuleParser.HEX_DIGIT_, 0); }
		public TerminalNode UNDERSCORE_CHARSET() { return getToken(BaseRuleParser.UNDERSCORE_CHARSET, 0); }
		public TerminalNode UL_BINARY() { return getToken(BaseRuleParser.UL_BINARY, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public HexadecimalLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hexadecimalLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterHexadecimalLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitHexadecimalLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitHexadecimalLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HexadecimalLiteralsContext hexadecimalLiterals() throws RecognitionException {
		HexadecimalLiteralsContext _localctx = new HexadecimalLiteralsContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_hexadecimalLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(389);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDERSCORE_CHARSET) {
				{
				setState(388);
				match(UNDERSCORE_CHARSET);
				}
			}

			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UL_BINARY) {
				{
				setState(391);
				match(UL_BINARY);
				}
			}

			setState(394);
			match(HEX_DIGIT_);
			setState(396);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,6,_ctx) ) {
			case 1:
				{
				setState(395);
				collateClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitValueLiteralsContext extends ParserRuleContext {
		public TerminalNode BIT_NUM_() { return getToken(BaseRuleParser.BIT_NUM_, 0); }
		public TerminalNode UNDERSCORE_CHARSET() { return getToken(BaseRuleParser.UNDERSCORE_CHARSET, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public BitValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitValueLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterBitValueLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitBitValueLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitBitValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitValueLiteralsContext bitValueLiterals() throws RecognitionException {
		BitValueLiteralsContext _localctx = new BitValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_bitValueLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(399);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==UNDERSCORE_CHARSET) {
				{
				setState(398);
				match(UNDERSCORE_CHARSET);
				}
			}

			setState(401);
			match(BIT_NUM_);
			setState(403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				{
				setState(402);
				collateClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanLiteralsContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(BaseRuleParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BaseRuleParser.FALSE, 0); }
		public BooleanLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterBooleanLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitBooleanLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitBooleanLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanLiteralsContext booleanLiterals() throws RecognitionException {
		BooleanLiteralsContext _localctx = new BooleanLiteralsContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_booleanLiterals);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(405);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NullValueLiteralsContext extends ParserRuleContext {
		public TerminalNode NULL() { return getToken(BaseRuleParser.NULL, 0); }
		public NullValueLiteralsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullValueLiterals; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNullValueLiterals(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNullValueLiterals(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNullValueLiterals(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullValueLiteralsContext nullValueLiterals() throws RecognitionException {
		NullValueLiteralsContext _localctx = new NullValueLiteralsContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_nullValueLiterals);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(407);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CollationNameContext extends ParserRuleContext {
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(BaseRuleParser.BINARY, 0); }
		public CollationNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collationName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCollationName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCollationName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCollationName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollationNameContext collationName() throws RecognitionException {
		CollationNameContext _localctx = new CollationNameContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_collationName);
		try {
			setState(411);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GROUP_CONCAT:
			case CAST:
			case POSITION:
			case SUBSTRING:
			case SUBSTR:
			case EXTRACT:
			case TRIM:
			case LAST_DAY:
			case TRADITIONAL:
			case TREE:
			case MYSQL_MAIN:
			case MYSQL_ADMIN:
			case INSTANT:
			case INPLACE:
			case COPY:
			case UL_BINARY:
			case AUTOCOMMIT:
			case REDO_LOG:
			case ARCHIVE:
			case BLACKHOLE:
			case CSV:
			case FEDERATED:
			case INNODB:
			case MEMORY:
			case MRG_MYISAM:
			case MYISAM:
			case NDB:
			case NDBCLUSTER:
			case PERFORMANCE_SCHEMA:
			case TOKUDB:
			case ACCOUNT:
			case ACTION:
			case ACTIVE:
			case ADMIN:
			case AFTER:
			case AGAINST:
			case AGGREGATE:
			case ALGORITHM:
			case ALWAYS:
			case ANY:
			case ARRAY:
			case ASCII:
			case AT:
			case ATTRIBUTE:
			case AUTOEXTEND_SIZE:
			case AUTO_INCREMENT:
			case AVG:
			case BIT_XOR:
			case AVG_ROW_LENGTH:
			case BACKUP:
			case BEFORE:
			case BEGIN:
			case BINLOG:
			case BIT:
			case BLOCK:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BUCKETS:
			case BYTE:
			case CACHE:
			case CASCADED:
			case CATALOG_NAME:
			case CHAIN:
			case CHANGED:
			case CHANNEL:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLASS_ORIGIN:
			case CLIENT:
			case CLONE:
			case CLOSE:
			case COALESCE:
			case CODE:
			case COLLATION:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COLUMN_NAME:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETION:
			case COMPONENT:
			case COMPRESSED:
			case COMPRESSION:
			case CONCURRENT:
			case CONNECTION:
			case CONSISTENT:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONTAINS:
			case CONTEXT:
			case CPU:
			case CREATE:
			case CURRENT:
			case CURSOR_NAME:
			case DATA:
			case DATAFILE:
			case DATE:
			case DATETIME:
			case DAY:
			case DAY_MINUTE:
			case DEALLOCATE:
			case DEFAULT:
			case DEFAULT_AUTH:
			case DEFINER:
			case DEFINITION:
			case DELAY_KEY_WRITE:
			case DESCRIPTION:
			case DIAGNOSTICS:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DO:
			case DROP:
			case DUMPFILE:
			case DUPLICATE:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTION:
			case END:
			case ENDS:
			case ENFORCED:
			case ENGINE:
			case ENGINES:
			case ENGINE_ATTRIBUTE:
			case ENUM:
			case ERROR:
			case ERRORS:
			case ESCAPE:
			case EVENT:
			case EVENTS:
			case EVERY:
			case EXCHANGE:
			case EXCLUDE:
			case EXECUTE:
			case EXPANSION:
			case EXPIRE:
			case EXPORT:
			case EXTENDED:
			case EXTENT_SIZE:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FAULTS:
			case FILE:
			case FILE_BLOCK_SIZE:
			case FILTER:
			case FIRST:
			case FIXED:
			case FLUSH:
			case FOLLOWING:
			case FOLLOWS:
			case FORMAT:
			case FOUND:
			case FULL:
			case GENERAL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case GET_FORMAT:
			case GET_MASTER_PUBLIC_KEY:
			case GLOBAL:
			case GRANTS:
			case GROUPS:
			case GROUP_REPLICATION:
			case HANDLER:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HISTORY:
			case HOST:
			case HOSTS:
			case HOUR:
			case IDENTIFIED:
			case IGNORE_SERVER_IDS:
			case IMPORT:
			case INACTIVE:
			case INDEXES:
			case INITIAL_SIZE:
			case INSERT_METHOD:
			case INSTALL:
			case INSTANCE:
			case INVISIBLE:
			case INVOKER:
			case IO:
			case IPC:
			case ISOLATION:
			case ISSUER:
			case JSON:
			case JSON_VALUE:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LANGUAGE:
			case LAST:
			case LAST_VALUE:
			case LEAVES:
			case LESS:
			case LEVEL:
			case LINESTRING:
			case LIST:
			case LOCAL:
			case LOCKED:
			case LOCKS:
			case LOGFILE:
			case LOGS:
			case MASTER:
			case MASTER_AUTO_POSITION:
			case MASTER_COMPRESSION_ALGORITHM:
			case MASTER_CONNECT_RETRY:
			case MASTER_DELAY:
			case MASTER_HEARTBEAT_PERIOD:
			case MASTER_HOST:
			case MASTER_LOG_FILE:
			case MASTER_LOG_POS:
			case MASTER_PASSWORD:
			case MASTER_PORT:
			case MASTER_PUBLIC_KEY_PATH:
			case MASTER_RETRY_COUNT:
			case MASTER_SERVER_ID:
			case MASTER_SSL:
			case MASTER_SSL_CA:
			case MASTER_SSL_CAPATH:
			case MASTER_SSL_CERT:
			case MASTER_SSL_CIPHER:
			case MASTER_SSL_CRL:
			case MASTER_SSL_CRLPATH:
			case MASTER_SSL_KEY:
			case MASTER_TLS_CIPHERSUITES:
			case MASTER_TLS_VERSION:
			case MASTER_USER:
			case MASTER_ZSTD_COMPRESSION_LEVEL:
			case MAXVALUE:
			case MAX_CONNECTIONS_PER_HOUR:
			case MAX_QUERIES_PER_HOUR:
			case MAX_ROWS:
			case MAX_SIZE:
			case MAX_UPDATES_PER_HOUR:
			case MAX_USER_CONNECTIONS:
			case MEDIUM:
			case MEMBER:
			case MERGE:
			case MESSAGE_TEXT:
			case MICROSECOND:
			case MIGRATE:
			case MINUTE:
			case MIN_ROWS:
			case MODE:
			case MODIFY:
			case MONTH:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case MUTEX:
			case MYSQL_ERRNO:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NESTED:
			case NETWORK_NAMESPACE:
			case NEVER:
			case NEW:
			case NEXT:
			case NO:
			case NODEGROUP:
			case NONE:
			case NOWAIT:
			case NO_WAIT:
			case NULLS:
			case NUMBER:
			case NVARCHAR:
			case OFF:
			case OFFSET:
			case OJ:
			case OLD:
			case ONE:
			case ONLY:
			case OPEN:
			case OPTIONAL:
			case OPTIONS:
			case ORDINALITY:
			case ORGANIZATION:
			case OTHERS:
			case OWNER:
			case PACK_KEYS:
			case PAGE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_LOCK_TIME:
			case PATH:
			case PERSIST:
			case PERSIST_ONLY:
			case PHASE:
			case PLUGIN:
			case PLUGINS:
			case PLUGIN_DIR:
			case POINT:
			case POLYGON:
			case PORT:
			case PRECEDES:
			case PRECEDING:
			case PREPARE:
			case PRESERVE:
			case PREV:
			case PRIMARY:
			case PRIVILEGES:
			case PRIVILEGE_CHECKS_USER:
			case PROCESS:
			case PROCESSLIST:
			case PROFILE:
			case PROFILES:
			case PROXY:
			case QUARTER:
			case QUERY:
			case QUICK:
			case RANDOM:
			case RANK:
			case READ_ONLY:
			case REBUILD:
			case RECOVER:
			case REDO_BUFFER_SIZE:
			case REDUNDANT:
			case REFERENCE:
			case RELAY:
			case RELAYLOG:
			case RELAY_LOG_FILE:
			case RELAY_LOG_POS:
			case RELAY_THREAD:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPEATABLE:
			case REPLICATE_DO_DB:
			case REPLICATE_DO_TABLE:
			case REPLICATE_IGNORE_DB:
			case REPLICATE_IGNORE_TABLE:
			case REPLICATE_REWRITE_DB:
			case REPLICATE_WILD_DO_TABLE:
			case REPLICATE_WILD_IGNORE_TABLE:
			case REPLICATION:
			case REQUIRE_ROW_FORMAT:
			case RESET:
			case RESOURCE:
			case RESPECT:
			case RESTART:
			case RESTORE:
			case RESUME:
			case RETAIN:
			case RETURNED_SQLSTATE:
			case RETURNING:
			case RETURNS:
			case REUSE:
			case REVERSE:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROTATE:
			case ROUTINE:
			case ROW_COUNT:
			case ROW_FORMAT:
			case RTREE:
			case SAVEPOINT:
			case SCHEDULE:
			case SCHEMA_NAME:
			case SECOND:
			case SECONDARY:
			case SECONDARY_ENGINE:
			case SECONDARY_ENGINE_ATTRIBUTE:
			case SECONDARY_LOAD:
			case SECONDARY_UNLOAD:
			case SECURITY:
			case SERIAL:
			case SERIALIZABLE:
			case SERVER:
			case SESSION:
			case SHARE:
			case SHUTDOWN:
			case SIGNED:
			case SIMPLE:
			case SLAVE:
			case SLOW:
			case SNAPSHOT:
			case SOCKET:
			case SONAME:
			case SOUNDS:
			case SOURCE:
			case SQL_AFTER_GTIDS:
			case SQL_AFTER_MTS_GAPS:
			case SQL_BEFORE_GTIDS:
			case SQL_BUFFER_RESULT:
			case SQL_NO_CACHE:
			case SQL_THREAD:
			case SRID:
			case STACKED:
			case START:
			case STARTS:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STRING:
			case SUBCLASS_ORIGIN:
			case SUBJECT:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case SUPER:
			case SUSPEND:
			case SWAPS:
			case SWITCHES:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TABLESPACE:
			case TABLE_CHECKSUM:
			case TABLE_NAME:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case THAN:
			case THREAD_PRIORITY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMP_ADD:
			case TIMESTAMP_DIFF:
			case TLS:
			case TRANSACTION:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDEFINED:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case UNICODE:
			case UNINSTALL:
			case UNKNOWN:
			case UNTIL:
			case UPGRADE:
			case USER:
			case USER_RESOURCES:
			case USE_FRM:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case VALIDATION:
			case VALUE:
			case VARIABLES:
			case VCPU:
			case VIEW:
			case VISIBLE:
			case WAIT:
			case WARNINGS:
			case WEEK:
			case WEIGHT_STRING:
			case WITHOUT:
			case WORK:
			case WRAPPER:
			case X509:
			case XA:
			case XID:
			case XML:
			case YEAR:
			case YEAR_MONTH:
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
			case BQUOTA_STRING:
			case UNDERSCORE_CHARSET:
			case IDENTIFIER_:
			case IP_ADDRESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(409);
				textOrIdentifier();
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(410);
				match(BINARY);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierContext extends ParserRuleContext {
		public TerminalNode IDENTIFIER_() { return getToken(BaseRuleParser.IDENTIFIER_, 0); }
		public IdentifierKeywordsUnambiguousContext identifierKeywordsUnambiguous() {
			return getRuleContext(IdentifierKeywordsUnambiguousContext.class,0);
		}
		public IdentifierKeywordsAmbiguous1RolesAndLabelsContext identifierKeywordsAmbiguous1RolesAndLabels() {
			return getRuleContext(IdentifierKeywordsAmbiguous1RolesAndLabelsContext.class,0);
		}
		public IdentifierKeywordsAmbiguous2LabelsContext identifierKeywordsAmbiguous2Labels() {
			return getRuleContext(IdentifierKeywordsAmbiguous2LabelsContext.class,0);
		}
		public IdentifierKeywordsAmbiguous3RolesContext identifierKeywordsAmbiguous3Roles() {
			return getRuleContext(IdentifierKeywordsAmbiguous3RolesContext.class,0);
		}
		public IdentifierKeywordsAmbiguous4SystemVariablesContext identifierKeywordsAmbiguous4SystemVariables() {
			return getRuleContext(IdentifierKeywordsAmbiguous4SystemVariablesContext.class,0);
		}
		public CustomKeywordContext customKeyword() {
			return getRuleContext(CustomKeywordContext.class,0);
		}
		public TerminalNode DOUBLE_QUOTED_TEXT() { return getToken(BaseRuleParser.DOUBLE_QUOTED_TEXT, 0); }
		public TerminalNode UNDERSCORE_CHARSET() { return getToken(BaseRuleParser.UNDERSCORE_CHARSET, 0); }
		public TerminalNode BQUOTA_STRING() { return getToken(BaseRuleParser.BQUOTA_STRING, 0); }
		public IdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierContext identifier() throws RecognitionException {
		IdentifierContext _localctx = new IdentifierContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_identifier);
		try {
			setState(423);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,10,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(413);
				match(IDENTIFIER_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(414);
				identifierKeywordsUnambiguous();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(415);
				identifierKeywordsAmbiguous1RolesAndLabels();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(416);
				identifierKeywordsAmbiguous2Labels();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(417);
				identifierKeywordsAmbiguous3Roles();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(418);
				identifierKeywordsAmbiguous4SystemVariables();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(419);
				customKeyword();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(420);
				match(DOUBLE_QUOTED_TEXT);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(421);
				match(UNDERSCORE_CHARSET);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(422);
				match(BQUOTA_STRING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierKeywordsUnambiguousContext extends ParserRuleContext {
		public TerminalNode ACTION() { return getToken(BaseRuleParser.ACTION, 0); }
		public TerminalNode ACCOUNT() { return getToken(BaseRuleParser.ACCOUNT, 0); }
		public TerminalNode ACTIVE() { return getToken(BaseRuleParser.ACTIVE, 0); }
		public TerminalNode ADMIN() { return getToken(BaseRuleParser.ADMIN, 0); }
		public TerminalNode AFTER() { return getToken(BaseRuleParser.AFTER, 0); }
		public TerminalNode AGAINST() { return getToken(BaseRuleParser.AGAINST, 0); }
		public TerminalNode AGGREGATE() { return getToken(BaseRuleParser.AGGREGATE, 0); }
		public TerminalNode ALGORITHM() { return getToken(BaseRuleParser.ALGORITHM, 0); }
		public TerminalNode ALWAYS() { return getToken(BaseRuleParser.ALWAYS, 0); }
		public TerminalNode ANY() { return getToken(BaseRuleParser.ANY, 0); }
		public TerminalNode ARRAY() { return getToken(BaseRuleParser.ARRAY, 0); }
		public TerminalNode AT() { return getToken(BaseRuleParser.AT, 0); }
		public TerminalNode ATTRIBUTE() { return getToken(BaseRuleParser.ATTRIBUTE, 0); }
		public TerminalNode AUTOEXTEND_SIZE() { return getToken(BaseRuleParser.AUTOEXTEND_SIZE, 0); }
		public TerminalNode AUTO_INCREMENT() { return getToken(BaseRuleParser.AUTO_INCREMENT, 0); }
		public TerminalNode AVG_ROW_LENGTH() { return getToken(BaseRuleParser.AVG_ROW_LENGTH, 0); }
		public TerminalNode AVG() { return getToken(BaseRuleParser.AVG, 0); }
		public TerminalNode BACKUP() { return getToken(BaseRuleParser.BACKUP, 0); }
		public TerminalNode BEFORE() { return getToken(BaseRuleParser.BEFORE, 0); }
		public TerminalNode BINLOG() { return getToken(BaseRuleParser.BINLOG, 0); }
		public TerminalNode BIT() { return getToken(BaseRuleParser.BIT, 0); }
		public TerminalNode BLOCK() { return getToken(BaseRuleParser.BLOCK, 0); }
		public TerminalNode BOOLEAN() { return getToken(BaseRuleParser.BOOLEAN, 0); }
		public TerminalNode BOOL() { return getToken(BaseRuleParser.BOOL, 0); }
		public TerminalNode BTREE() { return getToken(BaseRuleParser.BTREE, 0); }
		public TerminalNode BUCKETS() { return getToken(BaseRuleParser.BUCKETS, 0); }
		public TerminalNode CASCADED() { return getToken(BaseRuleParser.CASCADED, 0); }
		public TerminalNode CATALOG_NAME() { return getToken(BaseRuleParser.CATALOG_NAME, 0); }
		public TerminalNode CHAIN() { return getToken(BaseRuleParser.CHAIN, 0); }
		public TerminalNode CHANGED() { return getToken(BaseRuleParser.CHANGED, 0); }
		public TerminalNode CHANNEL() { return getToken(BaseRuleParser.CHANNEL, 0); }
		public TerminalNode CIPHER() { return getToken(BaseRuleParser.CIPHER, 0); }
		public TerminalNode CLASS_ORIGIN() { return getToken(BaseRuleParser.CLASS_ORIGIN, 0); }
		public TerminalNode CLIENT() { return getToken(BaseRuleParser.CLIENT, 0); }
		public TerminalNode CLOSE() { return getToken(BaseRuleParser.CLOSE, 0); }
		public TerminalNode COALESCE() { return getToken(BaseRuleParser.COALESCE, 0); }
		public TerminalNode CODE() { return getToken(BaseRuleParser.CODE, 0); }
		public TerminalNode COLLATION() { return getToken(BaseRuleParser.COLLATION, 0); }
		public TerminalNode COLUMNS() { return getToken(BaseRuleParser.COLUMNS, 0); }
		public TerminalNode COLUMN_FORMAT() { return getToken(BaseRuleParser.COLUMN_FORMAT, 0); }
		public TerminalNode COLUMN_NAME() { return getToken(BaseRuleParser.COLUMN_NAME, 0); }
		public TerminalNode COMMITTED() { return getToken(BaseRuleParser.COMMITTED, 0); }
		public TerminalNode COMPACT() { return getToken(BaseRuleParser.COMPACT, 0); }
		public TerminalNode COMPLETION() { return getToken(BaseRuleParser.COMPLETION, 0); }
		public TerminalNode COMPONENT() { return getToken(BaseRuleParser.COMPONENT, 0); }
		public TerminalNode COMPRESSED() { return getToken(BaseRuleParser.COMPRESSED, 0); }
		public TerminalNode COMPRESSION() { return getToken(BaseRuleParser.COMPRESSION, 0); }
		public TerminalNode CONCURRENT() { return getToken(BaseRuleParser.CONCURRENT, 0); }
		public TerminalNode CONNECTION() { return getToken(BaseRuleParser.CONNECTION, 0); }
		public TerminalNode CONSISTENT() { return getToken(BaseRuleParser.CONSISTENT, 0); }
		public TerminalNode CONSTRAINT_CATALOG() { return getToken(BaseRuleParser.CONSTRAINT_CATALOG, 0); }
		public TerminalNode CONSTRAINT_NAME() { return getToken(BaseRuleParser.CONSTRAINT_NAME, 0); }
		public TerminalNode CONSTRAINT_SCHEMA() { return getToken(BaseRuleParser.CONSTRAINT_SCHEMA, 0); }
		public TerminalNode CONTEXT() { return getToken(BaseRuleParser.CONTEXT, 0); }
		public TerminalNode CPU() { return getToken(BaseRuleParser.CPU, 0); }
		public TerminalNode CREATE() { return getToken(BaseRuleParser.CREATE, 0); }
		public TerminalNode CURRENT() { return getToken(BaseRuleParser.CURRENT, 0); }
		public TerminalNode CURSOR_NAME() { return getToken(BaseRuleParser.CURSOR_NAME, 0); }
		public TerminalNode DATAFILE() { return getToken(BaseRuleParser.DATAFILE, 0); }
		public TerminalNode DATA() { return getToken(BaseRuleParser.DATA, 0); }
		public TerminalNode DATETIME() { return getToken(BaseRuleParser.DATETIME, 0); }
		public TerminalNode DATE() { return getToken(BaseRuleParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(BaseRuleParser.DAY, 0); }
		public TerminalNode DAY_MINUTE() { return getToken(BaseRuleParser.DAY_MINUTE, 0); }
		public TerminalNode DEFAULT_AUTH() { return getToken(BaseRuleParser.DEFAULT_AUTH, 0); }
		public TerminalNode DEFAULT() { return getToken(BaseRuleParser.DEFAULT, 0); }
		public TerminalNode DEFINER() { return getToken(BaseRuleParser.DEFINER, 0); }
		public TerminalNode DEFINITION() { return getToken(BaseRuleParser.DEFINITION, 0); }
		public TerminalNode DELAY_KEY_WRITE() { return getToken(BaseRuleParser.DELAY_KEY_WRITE, 0); }
		public TerminalNode DESCRIPTION() { return getToken(BaseRuleParser.DESCRIPTION, 0); }
		public TerminalNode DIAGNOSTICS() { return getToken(BaseRuleParser.DIAGNOSTICS, 0); }
		public TerminalNode DIRECTORY() { return getToken(BaseRuleParser.DIRECTORY, 0); }
		public TerminalNode DISABLE() { return getToken(BaseRuleParser.DISABLE, 0); }
		public TerminalNode DISCARD() { return getToken(BaseRuleParser.DISCARD, 0); }
		public TerminalNode DISK() { return getToken(BaseRuleParser.DISK, 0); }
		public TerminalNode DUMPFILE() { return getToken(BaseRuleParser.DUMPFILE, 0); }
		public TerminalNode DUPLICATE() { return getToken(BaseRuleParser.DUPLICATE, 0); }
		public TerminalNode DROP() { return getToken(BaseRuleParser.DROP, 0); }
		public TerminalNode DYNAMIC() { return getToken(BaseRuleParser.DYNAMIC, 0); }
		public TerminalNode ENABLE() { return getToken(BaseRuleParser.ENABLE, 0); }
		public TerminalNode ENCRYPTION() { return getToken(BaseRuleParser.ENCRYPTION, 0); }
		public TerminalNode ENDS() { return getToken(BaseRuleParser.ENDS, 0); }
		public TerminalNode ENFORCED() { return getToken(BaseRuleParser.ENFORCED, 0); }
		public TerminalNode ENGINES() { return getToken(BaseRuleParser.ENGINES, 0); }
		public TerminalNode ENGINE() { return getToken(BaseRuleParser.ENGINE, 0); }
		public TerminalNode ENGINE_ATTRIBUTE() { return getToken(BaseRuleParser.ENGINE_ATTRIBUTE, 0); }
		public TerminalNode ENUM() { return getToken(BaseRuleParser.ENUM, 0); }
		public TerminalNode ERRORS() { return getToken(BaseRuleParser.ERRORS, 0); }
		public TerminalNode ERROR() { return getToken(BaseRuleParser.ERROR, 0); }
		public TerminalNode ESCAPE() { return getToken(BaseRuleParser.ESCAPE, 0); }
		public TerminalNode EVENTS() { return getToken(BaseRuleParser.EVENTS, 0); }
		public TerminalNode EVERY() { return getToken(BaseRuleParser.EVERY, 0); }
		public TerminalNode EXCHANGE() { return getToken(BaseRuleParser.EXCHANGE, 0); }
		public TerminalNode EXCLUDE() { return getToken(BaseRuleParser.EXCLUDE, 0); }
		public TerminalNode EXPANSION() { return getToken(BaseRuleParser.EXPANSION, 0); }
		public TerminalNode EXPIRE() { return getToken(BaseRuleParser.EXPIRE, 0); }
		public TerminalNode EXPORT() { return getToken(BaseRuleParser.EXPORT, 0); }
		public TerminalNode EXTENDED() { return getToken(BaseRuleParser.EXTENDED, 0); }
		public TerminalNode EXTENT_SIZE() { return getToken(BaseRuleParser.EXTENT_SIZE, 0); }
		public TerminalNode FAILED_LOGIN_ATTEMPTS() { return getToken(BaseRuleParser.FAILED_LOGIN_ATTEMPTS, 0); }
		public TerminalNode FAST() { return getToken(BaseRuleParser.FAST, 0); }
		public TerminalNode FAULTS() { return getToken(BaseRuleParser.FAULTS, 0); }
		public TerminalNode FILE_BLOCK_SIZE() { return getToken(BaseRuleParser.FILE_BLOCK_SIZE, 0); }
		public TerminalNode FILTER() { return getToken(BaseRuleParser.FILTER, 0); }
		public TerminalNode FIRST() { return getToken(BaseRuleParser.FIRST, 0); }
		public TerminalNode FIXED() { return getToken(BaseRuleParser.FIXED, 0); }
		public TerminalNode FOLLOWING() { return getToken(BaseRuleParser.FOLLOWING, 0); }
		public TerminalNode FORMAT() { return getToken(BaseRuleParser.FORMAT, 0); }
		public TerminalNode FOUND() { return getToken(BaseRuleParser.FOUND, 0); }
		public TerminalNode FULL() { return getToken(BaseRuleParser.FULL, 0); }
		public TerminalNode GENERAL() { return getToken(BaseRuleParser.GENERAL, 0); }
		public TerminalNode GEOMETRYCOLLECTION() { return getToken(BaseRuleParser.GEOMETRYCOLLECTION, 0); }
		public TerminalNode GEOMETRY() { return getToken(BaseRuleParser.GEOMETRY, 0); }
		public TerminalNode GET_FORMAT() { return getToken(BaseRuleParser.GET_FORMAT, 0); }
		public TerminalNode GET_MASTER_PUBLIC_KEY() { return getToken(BaseRuleParser.GET_MASTER_PUBLIC_KEY, 0); }
		public TerminalNode GRANTS() { return getToken(BaseRuleParser.GRANTS, 0); }
		public TerminalNode GROUP_REPLICATION() { return getToken(BaseRuleParser.GROUP_REPLICATION, 0); }
		public TerminalNode GROUPS() { return getToken(BaseRuleParser.GROUPS, 0); }
		public TerminalNode HASH() { return getToken(BaseRuleParser.HASH, 0); }
		public TerminalNode HISTOGRAM() { return getToken(BaseRuleParser.HISTOGRAM, 0); }
		public TerminalNode HISTORY() { return getToken(BaseRuleParser.HISTORY, 0); }
		public TerminalNode HOSTS() { return getToken(BaseRuleParser.HOSTS, 0); }
		public TerminalNode HOST() { return getToken(BaseRuleParser.HOST, 0); }
		public TerminalNode HOUR() { return getToken(BaseRuleParser.HOUR, 0); }
		public TerminalNode IDENTIFIED() { return getToken(BaseRuleParser.IDENTIFIED, 0); }
		public TerminalNode IGNORE_SERVER_IDS() { return getToken(BaseRuleParser.IGNORE_SERVER_IDS, 0); }
		public TerminalNode INACTIVE() { return getToken(BaseRuleParser.INACTIVE, 0); }
		public TerminalNode INDEXES() { return getToken(BaseRuleParser.INDEXES, 0); }
		public TerminalNode INITIAL_SIZE() { return getToken(BaseRuleParser.INITIAL_SIZE, 0); }
		public TerminalNode INSERT_METHOD() { return getToken(BaseRuleParser.INSERT_METHOD, 0); }
		public TerminalNode INSTANCE() { return getToken(BaseRuleParser.INSTANCE, 0); }
		public TerminalNode INVISIBLE() { return getToken(BaseRuleParser.INVISIBLE, 0); }
		public TerminalNode INVOKER() { return getToken(BaseRuleParser.INVOKER, 0); }
		public TerminalNode IO() { return getToken(BaseRuleParser.IO, 0); }
		public TerminalNode IPC() { return getToken(BaseRuleParser.IPC, 0); }
		public TerminalNode ISOLATION() { return getToken(BaseRuleParser.ISOLATION, 0); }
		public TerminalNode ISSUER() { return getToken(BaseRuleParser.ISSUER, 0); }
		public TerminalNode JSON() { return getToken(BaseRuleParser.JSON, 0); }
		public TerminalNode JSON_VALUE() { return getToken(BaseRuleParser.JSON_VALUE, 0); }
		public TerminalNode KEY() { return getToken(BaseRuleParser.KEY, 0); }
		public TerminalNode KEYS() { return getToken(BaseRuleParser.KEYS, 0); }
		public TerminalNode KEY_BLOCK_SIZE() { return getToken(BaseRuleParser.KEY_BLOCK_SIZE, 0); }
		public TerminalNode LAST() { return getToken(BaseRuleParser.LAST, 0); }
		public TerminalNode LEAVES() { return getToken(BaseRuleParser.LEAVES, 0); }
		public TerminalNode LESS() { return getToken(BaseRuleParser.LESS, 0); }
		public TerminalNode LEVEL() { return getToken(BaseRuleParser.LEVEL, 0); }
		public TerminalNode LINESTRING() { return getToken(BaseRuleParser.LINESTRING, 0); }
		public TerminalNode LIST() { return getToken(BaseRuleParser.LIST, 0); }
		public TerminalNode LOCKED() { return getToken(BaseRuleParser.LOCKED, 0); }
		public TerminalNode LOCKS() { return getToken(BaseRuleParser.LOCKS, 0); }
		public TerminalNode LOGFILE() { return getToken(BaseRuleParser.LOGFILE, 0); }
		public TerminalNode LOGS() { return getToken(BaseRuleParser.LOGS, 0); }
		public TerminalNode MASTER_AUTO_POSITION() { return getToken(BaseRuleParser.MASTER_AUTO_POSITION, 0); }
		public TerminalNode MASTER_COMPRESSION_ALGORITHM() { return getToken(BaseRuleParser.MASTER_COMPRESSION_ALGORITHM, 0); }
		public TerminalNode MASTER_CONNECT_RETRY() { return getToken(BaseRuleParser.MASTER_CONNECT_RETRY, 0); }
		public TerminalNode MASTER_DELAY() { return getToken(BaseRuleParser.MASTER_DELAY, 0); }
		public TerminalNode MASTER_HEARTBEAT_PERIOD() { return getToken(BaseRuleParser.MASTER_HEARTBEAT_PERIOD, 0); }
		public TerminalNode MASTER_HOST() { return getToken(BaseRuleParser.MASTER_HOST, 0); }
		public TerminalNode NETWORK_NAMESPACE() { return getToken(BaseRuleParser.NETWORK_NAMESPACE, 0); }
		public TerminalNode MASTER_LOG_FILE() { return getToken(BaseRuleParser.MASTER_LOG_FILE, 0); }
		public TerminalNode MASTER_LOG_POS() { return getToken(BaseRuleParser.MASTER_LOG_POS, 0); }
		public TerminalNode MASTER_PASSWORD() { return getToken(BaseRuleParser.MASTER_PASSWORD, 0); }
		public TerminalNode MASTER_PORT() { return getToken(BaseRuleParser.MASTER_PORT, 0); }
		public TerminalNode MASTER_PUBLIC_KEY_PATH() { return getToken(BaseRuleParser.MASTER_PUBLIC_KEY_PATH, 0); }
		public TerminalNode MASTER_RETRY_COUNT() { return getToken(BaseRuleParser.MASTER_RETRY_COUNT, 0); }
		public TerminalNode MASTER_SERVER_ID() { return getToken(BaseRuleParser.MASTER_SERVER_ID, 0); }
		public TerminalNode MASTER_SSL_CAPATH() { return getToken(BaseRuleParser.MASTER_SSL_CAPATH, 0); }
		public TerminalNode MASTER_SSL_CA() { return getToken(BaseRuleParser.MASTER_SSL_CA, 0); }
		public TerminalNode MASTER_SSL_CERT() { return getToken(BaseRuleParser.MASTER_SSL_CERT, 0); }
		public TerminalNode MASTER_SSL_CIPHER() { return getToken(BaseRuleParser.MASTER_SSL_CIPHER, 0); }
		public TerminalNode MASTER_SSL_CRLPATH() { return getToken(BaseRuleParser.MASTER_SSL_CRLPATH, 0); }
		public TerminalNode MASTER_SSL_CRL() { return getToken(BaseRuleParser.MASTER_SSL_CRL, 0); }
		public TerminalNode MASTER_SSL_KEY() { return getToken(BaseRuleParser.MASTER_SSL_KEY, 0); }
		public TerminalNode MASTER_SSL() { return getToken(BaseRuleParser.MASTER_SSL, 0); }
		public TerminalNode MASTER() { return getToken(BaseRuleParser.MASTER, 0); }
		public TerminalNode MASTER_TLS_CIPHERSUITES() { return getToken(BaseRuleParser.MASTER_TLS_CIPHERSUITES, 0); }
		public TerminalNode MASTER_TLS_VERSION() { return getToken(BaseRuleParser.MASTER_TLS_VERSION, 0); }
		public TerminalNode MASTER_USER() { return getToken(BaseRuleParser.MASTER_USER, 0); }
		public TerminalNode MASTER_ZSTD_COMPRESSION_LEVEL() { return getToken(BaseRuleParser.MASTER_ZSTD_COMPRESSION_LEVEL, 0); }
		public TerminalNode MAX_CONNECTIONS_PER_HOUR() { return getToken(BaseRuleParser.MAX_CONNECTIONS_PER_HOUR, 0); }
		public TerminalNode MAX_QUERIES_PER_HOUR() { return getToken(BaseRuleParser.MAX_QUERIES_PER_HOUR, 0); }
		public TerminalNode MAX_ROWS() { return getToken(BaseRuleParser.MAX_ROWS, 0); }
		public TerminalNode MAX_SIZE() { return getToken(BaseRuleParser.MAX_SIZE, 0); }
		public TerminalNode MAX_UPDATES_PER_HOUR() { return getToken(BaseRuleParser.MAX_UPDATES_PER_HOUR, 0); }
		public TerminalNode MAX_USER_CONNECTIONS() { return getToken(BaseRuleParser.MAX_USER_CONNECTIONS, 0); }
		public TerminalNode MEDIUM() { return getToken(BaseRuleParser.MEDIUM, 0); }
		public TerminalNode MEMBER() { return getToken(BaseRuleParser.MEMBER, 0); }
		public TerminalNode MEMORY() { return getToken(BaseRuleParser.MEMORY, 0); }
		public TerminalNode MERGE() { return getToken(BaseRuleParser.MERGE, 0); }
		public TerminalNode MESSAGE_TEXT() { return getToken(BaseRuleParser.MESSAGE_TEXT, 0); }
		public TerminalNode MICROSECOND() { return getToken(BaseRuleParser.MICROSECOND, 0); }
		public TerminalNode MIGRATE() { return getToken(BaseRuleParser.MIGRATE, 0); }
		public TerminalNode MINUTE() { return getToken(BaseRuleParser.MINUTE, 0); }
		public TerminalNode MIN_ROWS() { return getToken(BaseRuleParser.MIN_ROWS, 0); }
		public TerminalNode MODE() { return getToken(BaseRuleParser.MODE, 0); }
		public TerminalNode MODIFY() { return getToken(BaseRuleParser.MODIFY, 0); }
		public TerminalNode MONTH() { return getToken(BaseRuleParser.MONTH, 0); }
		public TerminalNode MULTILINESTRING() { return getToken(BaseRuleParser.MULTILINESTRING, 0); }
		public TerminalNode MULTIPOINT() { return getToken(BaseRuleParser.MULTIPOINT, 0); }
		public TerminalNode MULTIPOLYGON() { return getToken(BaseRuleParser.MULTIPOLYGON, 0); }
		public TerminalNode MUTEX() { return getToken(BaseRuleParser.MUTEX, 0); }
		public TerminalNode MYSQL_ERRNO() { return getToken(BaseRuleParser.MYSQL_ERRNO, 0); }
		public TerminalNode NAMES() { return getToken(BaseRuleParser.NAMES, 0); }
		public TerminalNode NAME() { return getToken(BaseRuleParser.NAME, 0); }
		public TerminalNode NATIONAL() { return getToken(BaseRuleParser.NATIONAL, 0); }
		public TerminalNode NCHAR() { return getToken(BaseRuleParser.NCHAR, 0); }
		public TerminalNode NDBCLUSTER() { return getToken(BaseRuleParser.NDBCLUSTER, 0); }
		public TerminalNode NESTED() { return getToken(BaseRuleParser.NESTED, 0); }
		public TerminalNode NEVER() { return getToken(BaseRuleParser.NEVER, 0); }
		public TerminalNode NEW() { return getToken(BaseRuleParser.NEW, 0); }
		public TerminalNode NEXT() { return getToken(BaseRuleParser.NEXT, 0); }
		public TerminalNode NODEGROUP() { return getToken(BaseRuleParser.NODEGROUP, 0); }
		public TerminalNode NOWAIT() { return getToken(BaseRuleParser.NOWAIT, 0); }
		public TerminalNode NO_WAIT() { return getToken(BaseRuleParser.NO_WAIT, 0); }
		public TerminalNode NULLS() { return getToken(BaseRuleParser.NULLS, 0); }
		public TerminalNode NUMBER() { return getToken(BaseRuleParser.NUMBER, 0); }
		public TerminalNode NVARCHAR() { return getToken(BaseRuleParser.NVARCHAR, 0); }
		public TerminalNode OFF() { return getToken(BaseRuleParser.OFF, 0); }
		public TerminalNode OFFSET() { return getToken(BaseRuleParser.OFFSET, 0); }
		public TerminalNode OJ() { return getToken(BaseRuleParser.OJ, 0); }
		public TerminalNode OLD() { return getToken(BaseRuleParser.OLD, 0); }
		public TerminalNode ONE() { return getToken(BaseRuleParser.ONE, 0); }
		public TerminalNode ONLY() { return getToken(BaseRuleParser.ONLY, 0); }
		public TerminalNode OPEN() { return getToken(BaseRuleParser.OPEN, 0); }
		public TerminalNode OPTIONAL() { return getToken(BaseRuleParser.OPTIONAL, 0); }
		public TerminalNode OPTIONS() { return getToken(BaseRuleParser.OPTIONS, 0); }
		public TerminalNode ORDINALITY() { return getToken(BaseRuleParser.ORDINALITY, 0); }
		public TerminalNode ORGANIZATION() { return getToken(BaseRuleParser.ORGANIZATION, 0); }
		public TerminalNode OTHERS() { return getToken(BaseRuleParser.OTHERS, 0); }
		public TerminalNode OWNER() { return getToken(BaseRuleParser.OWNER, 0); }
		public TerminalNode PACK_KEYS() { return getToken(BaseRuleParser.PACK_KEYS, 0); }
		public TerminalNode PAGE() { return getToken(BaseRuleParser.PAGE, 0); }
		public TerminalNode PARSER() { return getToken(BaseRuleParser.PARSER, 0); }
		public TerminalNode PARTIAL() { return getToken(BaseRuleParser.PARTIAL, 0); }
		public TerminalNode PARTITIONING() { return getToken(BaseRuleParser.PARTITIONING, 0); }
		public TerminalNode PARTITIONS() { return getToken(BaseRuleParser.PARTITIONS, 0); }
		public TerminalNode PASSWORD() { return getToken(BaseRuleParser.PASSWORD, 0); }
		public TerminalNode PASSWORD_LOCK_TIME() { return getToken(BaseRuleParser.PASSWORD_LOCK_TIME, 0); }
		public TerminalNode PATH() { return getToken(BaseRuleParser.PATH, 0); }
		public TerminalNode PHASE() { return getToken(BaseRuleParser.PHASE, 0); }
		public TerminalNode PLUGINS() { return getToken(BaseRuleParser.PLUGINS, 0); }
		public TerminalNode PLUGIN_DIR() { return getToken(BaseRuleParser.PLUGIN_DIR, 0); }
		public TerminalNode PLUGIN() { return getToken(BaseRuleParser.PLUGIN, 0); }
		public TerminalNode POINT() { return getToken(BaseRuleParser.POINT, 0); }
		public TerminalNode POLYGON() { return getToken(BaseRuleParser.POLYGON, 0); }
		public TerminalNode PORT() { return getToken(BaseRuleParser.PORT, 0); }
		public TerminalNode PRECEDING() { return getToken(BaseRuleParser.PRECEDING, 0); }
		public TerminalNode PRESERVE() { return getToken(BaseRuleParser.PRESERVE, 0); }
		public TerminalNode PREV() { return getToken(BaseRuleParser.PREV, 0); }
		public TerminalNode PRIVILEGES() { return getToken(BaseRuleParser.PRIVILEGES, 0); }
		public TerminalNode PRIVILEGE_CHECKS_USER() { return getToken(BaseRuleParser.PRIVILEGE_CHECKS_USER, 0); }
		public TerminalNode PROCESSLIST() { return getToken(BaseRuleParser.PROCESSLIST, 0); }
		public TerminalNode PROFILES() { return getToken(BaseRuleParser.PROFILES, 0); }
		public TerminalNode PROFILE() { return getToken(BaseRuleParser.PROFILE, 0); }
		public TerminalNode QUARTER() { return getToken(BaseRuleParser.QUARTER, 0); }
		public TerminalNode QUERY() { return getToken(BaseRuleParser.QUERY, 0); }
		public TerminalNode QUICK() { return getToken(BaseRuleParser.QUICK, 0); }
		public TerminalNode RANDOM() { return getToken(BaseRuleParser.RANDOM, 0); }
		public TerminalNode RANK() { return getToken(BaseRuleParser.RANK, 0); }
		public TerminalNode READ_ONLY() { return getToken(BaseRuleParser.READ_ONLY, 0); }
		public TerminalNode REBUILD() { return getToken(BaseRuleParser.REBUILD, 0); }
		public TerminalNode RECOVER() { return getToken(BaseRuleParser.RECOVER, 0); }
		public TerminalNode REDO_BUFFER_SIZE() { return getToken(BaseRuleParser.REDO_BUFFER_SIZE, 0); }
		public TerminalNode REDUNDANT() { return getToken(BaseRuleParser.REDUNDANT, 0); }
		public TerminalNode REFERENCE() { return getToken(BaseRuleParser.REFERENCE, 0); }
		public TerminalNode RELAY() { return getToken(BaseRuleParser.RELAY, 0); }
		public TerminalNode RELAYLOG() { return getToken(BaseRuleParser.RELAYLOG, 0); }
		public TerminalNode RELAY_LOG_FILE() { return getToken(BaseRuleParser.RELAY_LOG_FILE, 0); }
		public TerminalNode RELAY_LOG_POS() { return getToken(BaseRuleParser.RELAY_LOG_POS, 0); }
		public TerminalNode RELAY_THREAD() { return getToken(BaseRuleParser.RELAY_THREAD, 0); }
		public TerminalNode REMOVE() { return getToken(BaseRuleParser.REMOVE, 0); }
		public TerminalNode REORGANIZE() { return getToken(BaseRuleParser.REORGANIZE, 0); }
		public TerminalNode REPEATABLE() { return getToken(BaseRuleParser.REPEATABLE, 0); }
		public TerminalNode REPLICATE_DO_DB() { return getToken(BaseRuleParser.REPLICATE_DO_DB, 0); }
		public TerminalNode REPLICATE_DO_TABLE() { return getToken(BaseRuleParser.REPLICATE_DO_TABLE, 0); }
		public TerminalNode REPLICATE_IGNORE_DB() { return getToken(BaseRuleParser.REPLICATE_IGNORE_DB, 0); }
		public TerminalNode REPLICATE_IGNORE_TABLE() { return getToken(BaseRuleParser.REPLICATE_IGNORE_TABLE, 0); }
		public TerminalNode REPLICATE_REWRITE_DB() { return getToken(BaseRuleParser.REPLICATE_REWRITE_DB, 0); }
		public TerminalNode REPLICATE_WILD_DO_TABLE() { return getToken(BaseRuleParser.REPLICATE_WILD_DO_TABLE, 0); }
		public TerminalNode REPLICATE_WILD_IGNORE_TABLE() { return getToken(BaseRuleParser.REPLICATE_WILD_IGNORE_TABLE, 0); }
		public TerminalNode REQUIRE_ROW_FORMAT() { return getToken(BaseRuleParser.REQUIRE_ROW_FORMAT, 0); }
		public TerminalNode USER_RESOURCES() { return getToken(BaseRuleParser.USER_RESOURCES, 0); }
		public TerminalNode RESPECT() { return getToken(BaseRuleParser.RESPECT, 0); }
		public TerminalNode RESTORE() { return getToken(BaseRuleParser.RESTORE, 0); }
		public TerminalNode RESUME() { return getToken(BaseRuleParser.RESUME, 0); }
		public TerminalNode RETAIN() { return getToken(BaseRuleParser.RETAIN, 0); }
		public TerminalNode RETURNED_SQLSTATE() { return getToken(BaseRuleParser.RETURNED_SQLSTATE, 0); }
		public TerminalNode RETURNING() { return getToken(BaseRuleParser.RETURNING, 0); }
		public TerminalNode RETURNS() { return getToken(BaseRuleParser.RETURNS, 0); }
		public TerminalNode REUSE() { return getToken(BaseRuleParser.REUSE, 0); }
		public TerminalNode REVERSE() { return getToken(BaseRuleParser.REVERSE, 0); }
		public TerminalNode ROLE() { return getToken(BaseRuleParser.ROLE, 0); }
		public TerminalNode ROLLUP() { return getToken(BaseRuleParser.ROLLUP, 0); }
		public TerminalNode ROTATE() { return getToken(BaseRuleParser.ROTATE, 0); }
		public TerminalNode ROUTINE() { return getToken(BaseRuleParser.ROUTINE, 0); }
		public TerminalNode ROW_COUNT() { return getToken(BaseRuleParser.ROW_COUNT, 0); }
		public TerminalNode ROW_FORMAT() { return getToken(BaseRuleParser.ROW_FORMAT, 0); }
		public TerminalNode RTREE() { return getToken(BaseRuleParser.RTREE, 0); }
		public TerminalNode SCHEDULE() { return getToken(BaseRuleParser.SCHEDULE, 0); }
		public TerminalNode SCHEMA_NAME() { return getToken(BaseRuleParser.SCHEMA_NAME, 0); }
		public TerminalNode SECONDARY_ENGINE() { return getToken(BaseRuleParser.SECONDARY_ENGINE, 0); }
		public TerminalNode SECONDARY_ENGINE_ATTRIBUTE() { return getToken(BaseRuleParser.SECONDARY_ENGINE_ATTRIBUTE, 0); }
		public TerminalNode SECONDARY_LOAD() { return getToken(BaseRuleParser.SECONDARY_LOAD, 0); }
		public TerminalNode SECONDARY() { return getToken(BaseRuleParser.SECONDARY, 0); }
		public TerminalNode SECONDARY_UNLOAD() { return getToken(BaseRuleParser.SECONDARY_UNLOAD, 0); }
		public TerminalNode SECOND() { return getToken(BaseRuleParser.SECOND, 0); }
		public TerminalNode SECURITY() { return getToken(BaseRuleParser.SECURITY, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(BaseRuleParser.SERIALIZABLE, 0); }
		public TerminalNode SERIAL() { return getToken(BaseRuleParser.SERIAL, 0); }
		public TerminalNode SERVER() { return getToken(BaseRuleParser.SERVER, 0); }
		public TerminalNode SHARE() { return getToken(BaseRuleParser.SHARE, 0); }
		public TerminalNode SIMPLE() { return getToken(BaseRuleParser.SIMPLE, 0); }
		public TerminalNode SLOW() { return getToken(BaseRuleParser.SLOW, 0); }
		public TerminalNode SNAPSHOT() { return getToken(BaseRuleParser.SNAPSHOT, 0); }
		public TerminalNode SOCKET() { return getToken(BaseRuleParser.SOCKET, 0); }
		public TerminalNode SONAME() { return getToken(BaseRuleParser.SONAME, 0); }
		public TerminalNode SOUNDS() { return getToken(BaseRuleParser.SOUNDS, 0); }
		public TerminalNode SOURCE() { return getToken(BaseRuleParser.SOURCE, 0); }
		public TerminalNode SQL_AFTER_GTIDS() { return getToken(BaseRuleParser.SQL_AFTER_GTIDS, 0); }
		public TerminalNode SQL_AFTER_MTS_GAPS() { return getToken(BaseRuleParser.SQL_AFTER_MTS_GAPS, 0); }
		public TerminalNode SQL_BEFORE_GTIDS() { return getToken(BaseRuleParser.SQL_BEFORE_GTIDS, 0); }
		public TerminalNode SQL_BUFFER_RESULT() { return getToken(BaseRuleParser.SQL_BUFFER_RESULT, 0); }
		public TerminalNode SQL_NO_CACHE() { return getToken(BaseRuleParser.SQL_NO_CACHE, 0); }
		public TerminalNode SQL_THREAD() { return getToken(BaseRuleParser.SQL_THREAD, 0); }
		public TerminalNode SRID() { return getToken(BaseRuleParser.SRID, 0); }
		public TerminalNode STACKED() { return getToken(BaseRuleParser.STACKED, 0); }
		public TerminalNode STARTS() { return getToken(BaseRuleParser.STARTS, 0); }
		public TerminalNode STATS_AUTO_RECALC() { return getToken(BaseRuleParser.STATS_AUTO_RECALC, 0); }
		public TerminalNode STATS_PERSISTENT() { return getToken(BaseRuleParser.STATS_PERSISTENT, 0); }
		public TerminalNode STATS_SAMPLE_PAGES() { return getToken(BaseRuleParser.STATS_SAMPLE_PAGES, 0); }
		public TerminalNode STATUS() { return getToken(BaseRuleParser.STATUS, 0); }
		public TerminalNode STORAGE() { return getToken(BaseRuleParser.STORAGE, 0); }
		public TerminalNode STREAM() { return getToken(BaseRuleParser.STREAM, 0); }
		public TerminalNode STRING() { return getToken(BaseRuleParser.STRING, 0); }
		public TerminalNode SUBCLASS_ORIGIN() { return getToken(BaseRuleParser.SUBCLASS_ORIGIN, 0); }
		public TerminalNode SUBJECT() { return getToken(BaseRuleParser.SUBJECT, 0); }
		public TerminalNode SUBPARTITIONS() { return getToken(BaseRuleParser.SUBPARTITIONS, 0); }
		public TerminalNode SUBPARTITION() { return getToken(BaseRuleParser.SUBPARTITION, 0); }
		public TerminalNode SUSPEND() { return getToken(BaseRuleParser.SUSPEND, 0); }
		public TerminalNode SWAPS() { return getToken(BaseRuleParser.SWAPS, 0); }
		public TerminalNode SWITCHES() { return getToken(BaseRuleParser.SWITCHES, 0); }
		public TerminalNode SYSTEM() { return getToken(BaseRuleParser.SYSTEM, 0); }
		public TerminalNode TABLE() { return getToken(BaseRuleParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(BaseRuleParser.TABLES, 0); }
		public TerminalNode TABLESPACE() { return getToken(BaseRuleParser.TABLESPACE, 0); }
		public TerminalNode TABLE_CHECKSUM() { return getToken(BaseRuleParser.TABLE_CHECKSUM, 0); }
		public TerminalNode TABLE_NAME() { return getToken(BaseRuleParser.TABLE_NAME, 0); }
		public TerminalNode TEMPORARY() { return getToken(BaseRuleParser.TEMPORARY, 0); }
		public TerminalNode TEMPTABLE() { return getToken(BaseRuleParser.TEMPTABLE, 0); }
		public TerminalNode TEXT() { return getToken(BaseRuleParser.TEXT, 0); }
		public TerminalNode THAN() { return getToken(BaseRuleParser.THAN, 0); }
		public TerminalNode THREAD_PRIORITY() { return getToken(BaseRuleParser.THREAD_PRIORITY, 0); }
		public TerminalNode TIES() { return getToken(BaseRuleParser.TIES, 0); }
		public TerminalNode TIMESTAMP_ADD() { return getToken(BaseRuleParser.TIMESTAMP_ADD, 0); }
		public TerminalNode TIMESTAMP_DIFF() { return getToken(BaseRuleParser.TIMESTAMP_DIFF, 0); }
		public TerminalNode TIMESTAMP() { return getToken(BaseRuleParser.TIMESTAMP, 0); }
		public TerminalNode TIME() { return getToken(BaseRuleParser.TIME, 0); }
		public TerminalNode TLS() { return getToken(BaseRuleParser.TLS, 0); }
		public TerminalNode TRANSACTION() { return getToken(BaseRuleParser.TRANSACTION, 0); }
		public TerminalNode TRIGGERS() { return getToken(BaseRuleParser.TRIGGERS, 0); }
		public TerminalNode TYPES() { return getToken(BaseRuleParser.TYPES, 0); }
		public TerminalNode TYPE() { return getToken(BaseRuleParser.TYPE, 0); }
		public TerminalNode UNBOUNDED() { return getToken(BaseRuleParser.UNBOUNDED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(BaseRuleParser.UNCOMMITTED, 0); }
		public TerminalNode UNDEFINED() { return getToken(BaseRuleParser.UNDEFINED, 0); }
		public TerminalNode UNDOFILE() { return getToken(BaseRuleParser.UNDOFILE, 0); }
		public TerminalNode UNDO_BUFFER_SIZE() { return getToken(BaseRuleParser.UNDO_BUFFER_SIZE, 0); }
		public TerminalNode UNKNOWN() { return getToken(BaseRuleParser.UNKNOWN, 0); }
		public TerminalNode UNTIL() { return getToken(BaseRuleParser.UNTIL, 0); }
		public TerminalNode UPGRADE() { return getToken(BaseRuleParser.UPGRADE, 0); }
		public TerminalNode USER() { return getToken(BaseRuleParser.USER, 0); }
		public TerminalNode USE_FRM() { return getToken(BaseRuleParser.USE_FRM, 0); }
		public TerminalNode VALIDATION() { return getToken(BaseRuleParser.VALIDATION, 0); }
		public TerminalNode VALUE() { return getToken(BaseRuleParser.VALUE, 0); }
		public TerminalNode VARIABLES() { return getToken(BaseRuleParser.VARIABLES, 0); }
		public TerminalNode VCPU() { return getToken(BaseRuleParser.VCPU, 0); }
		public TerminalNode VIEW() { return getToken(BaseRuleParser.VIEW, 0); }
		public TerminalNode VISIBLE() { return getToken(BaseRuleParser.VISIBLE, 0); }
		public TerminalNode WAIT() { return getToken(BaseRuleParser.WAIT, 0); }
		public TerminalNode WARNINGS() { return getToken(BaseRuleParser.WARNINGS, 0); }
		public TerminalNode WEEK() { return getToken(BaseRuleParser.WEEK, 0); }
		public TerminalNode WEIGHT_STRING() { return getToken(BaseRuleParser.WEIGHT_STRING, 0); }
		public TerminalNode WITHOUT() { return getToken(BaseRuleParser.WITHOUT, 0); }
		public TerminalNode WORK() { return getToken(BaseRuleParser.WORK, 0); }
		public TerminalNode WRAPPER() { return getToken(BaseRuleParser.WRAPPER, 0); }
		public TerminalNode X509() { return getToken(BaseRuleParser.X509, 0); }
		public TerminalNode XID() { return getToken(BaseRuleParser.XID, 0); }
		public TerminalNode XML() { return getToken(BaseRuleParser.XML, 0); }
		public TerminalNode YEAR() { return getToken(BaseRuleParser.YEAR, 0); }
		public TerminalNode YEAR_MONTH() { return getToken(BaseRuleParser.YEAR_MONTH, 0); }
		public IdentifierKeywordsUnambiguousContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierKeywordsUnambiguous; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIdentifierKeywordsUnambiguous(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIdentifierKeywordsUnambiguous(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIdentifierKeywordsUnambiguous(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierKeywordsUnambiguousContext identifierKeywordsUnambiguous() throws RecognitionException {
		IdentifierKeywordsUnambiguousContext _localctx = new IdentifierKeywordsUnambiguousContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_identifierKeywordsUnambiguous);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(425);
			_la = _input.LA(1);
			if ( !(((((_la - 74)) & ~0x3f) == 0 && ((1L << (_la - 74)) & -2734291406526616047L) != 0) || ((((_la - 145)) & ~0x3f) == 0 && ((1L << (_la - 145)) & -1130631902668022409L) != 0) || ((((_la - 210)) & ~0x3f) == 0 && ((1L << (_la - 210)) & -1804194678065983583L) != 0) || ((((_la - 275)) & ~0x3f) == 0 && ((1L << (_la - 275)) & 4802120918653807649L) != 0) || ((((_la - 339)) & ~0x3f) == 0 && ((1L << (_la - 339)) & -4577855350108677119L) != 0) || ((((_la - 404)) & ~0x3f) == 0 && ((1L << (_la - 404)) & -8071209315631890433L) != 0) || ((((_la - 468)) & ~0x3f) == 0 && ((1L << (_la - 468)) & -505562274445518753L) != 0) || ((((_la - 532)) & ~0x3f) == 0 && ((1L << (_la - 532)) & 5756255527025567435L) != 0) || ((((_la - 599)) & ~0x3f) == 0 && ((1L << (_la - 599)) & -414159230479724619L) != 0) || ((((_la - 669)) & ~0x3f) == 0 && ((1L << (_la - 669)) & -2305842992577524905L) != 0) || ((((_la - 733)) & ~0x3f) == 0 && ((1L << (_la - 733)) & -3403714020714070161L) != 0) || ((((_la - 798)) & ~0x3f) == 0 && ((1L << (_la - 798)) & 1793055L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierKeywordsAmbiguous1RolesAndLabelsContext extends ParserRuleContext {
		public TerminalNode EXECUTE() { return getToken(BaseRuleParser.EXECUTE, 0); }
		public TerminalNode RESTART() { return getToken(BaseRuleParser.RESTART, 0); }
		public TerminalNode SHUTDOWN() { return getToken(BaseRuleParser.SHUTDOWN, 0); }
		public IdentifierKeywordsAmbiguous1RolesAndLabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierKeywordsAmbiguous1RolesAndLabels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIdentifierKeywordsAmbiguous1RolesAndLabels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIdentifierKeywordsAmbiguous1RolesAndLabels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIdentifierKeywordsAmbiguous1RolesAndLabels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierKeywordsAmbiguous1RolesAndLabelsContext identifierKeywordsAmbiguous1RolesAndLabels() throws RecognitionException {
		IdentifierKeywordsAmbiguous1RolesAndLabelsContext _localctx = new IdentifierKeywordsAmbiguous1RolesAndLabelsContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_identifierKeywordsAmbiguous1RolesAndLabels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(427);
			_la = _input.LA(1);
			if ( !(_la==EXECUTE || _la==RESTART || _la==SHUTDOWN) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierKeywordsAmbiguous2LabelsContext extends ParserRuleContext {
		public TerminalNode ASCII() { return getToken(BaseRuleParser.ASCII, 0); }
		public TerminalNode BEGIN() { return getToken(BaseRuleParser.BEGIN, 0); }
		public TerminalNode BYTE() { return getToken(BaseRuleParser.BYTE, 0); }
		public TerminalNode CACHE() { return getToken(BaseRuleParser.CACHE, 0); }
		public TerminalNode CHARSET() { return getToken(BaseRuleParser.CHARSET, 0); }
		public TerminalNode CHECKSUM() { return getToken(BaseRuleParser.CHECKSUM, 0); }
		public TerminalNode CLONE() { return getToken(BaseRuleParser.CLONE, 0); }
		public TerminalNode COMMENT() { return getToken(BaseRuleParser.COMMENT, 0); }
		public TerminalNode COMMIT() { return getToken(BaseRuleParser.COMMIT, 0); }
		public TerminalNode CONTAINS() { return getToken(BaseRuleParser.CONTAINS, 0); }
		public TerminalNode DEALLOCATE() { return getToken(BaseRuleParser.DEALLOCATE, 0); }
		public TerminalNode DO() { return getToken(BaseRuleParser.DO, 0); }
		public TerminalNode END() { return getToken(BaseRuleParser.END, 0); }
		public TerminalNode FLUSH() { return getToken(BaseRuleParser.FLUSH, 0); }
		public TerminalNode FOLLOWS() { return getToken(BaseRuleParser.FOLLOWS, 0); }
		public TerminalNode HANDLER() { return getToken(BaseRuleParser.HANDLER, 0); }
		public TerminalNode HELP() { return getToken(BaseRuleParser.HELP, 0); }
		public TerminalNode IMPORT() { return getToken(BaseRuleParser.IMPORT, 0); }
		public TerminalNode INSTALL() { return getToken(BaseRuleParser.INSTALL, 0); }
		public TerminalNode LANGUAGE() { return getToken(BaseRuleParser.LANGUAGE, 0); }
		public TerminalNode NO() { return getToken(BaseRuleParser.NO, 0); }
		public TerminalNode PRECEDES() { return getToken(BaseRuleParser.PRECEDES, 0); }
		public TerminalNode PREPARE() { return getToken(BaseRuleParser.PREPARE, 0); }
		public TerminalNode REPAIR() { return getToken(BaseRuleParser.REPAIR, 0); }
		public TerminalNode RESET() { return getToken(BaseRuleParser.RESET, 0); }
		public TerminalNode ROLLBACK() { return getToken(BaseRuleParser.ROLLBACK, 0); }
		public TerminalNode SAVEPOINT() { return getToken(BaseRuleParser.SAVEPOINT, 0); }
		public TerminalNode SIGNED() { return getToken(BaseRuleParser.SIGNED, 0); }
		public TerminalNode SLAVE() { return getToken(BaseRuleParser.SLAVE, 0); }
		public TerminalNode START() { return getToken(BaseRuleParser.START, 0); }
		public TerminalNode STOP() { return getToken(BaseRuleParser.STOP, 0); }
		public TerminalNode TRUNCATE() { return getToken(BaseRuleParser.TRUNCATE, 0); }
		public TerminalNode UNICODE() { return getToken(BaseRuleParser.UNICODE, 0); }
		public TerminalNode UNINSTALL() { return getToken(BaseRuleParser.UNINSTALL, 0); }
		public TerminalNode XA() { return getToken(BaseRuleParser.XA, 0); }
		public IdentifierKeywordsAmbiguous2LabelsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierKeywordsAmbiguous2Labels; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIdentifierKeywordsAmbiguous2Labels(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIdentifierKeywordsAmbiguous2Labels(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIdentifierKeywordsAmbiguous2Labels(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierKeywordsAmbiguous2LabelsContext identifierKeywordsAmbiguous2Labels() throws RecognitionException {
		IdentifierKeywordsAmbiguous2LabelsContext _localctx = new IdentifierKeywordsAmbiguous2LabelsContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_identifierKeywordsAmbiguous2Labels);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 432497297033531393L) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & 2251799947902977L) != 0) || ((((_la - 239)) & ~0x3f) == 0 && ((1L << (_la - 239)) & 5497558138881L) != 0) || ((((_la - 309)) & ~0x3f) == 0 && ((1L << (_la - 309)) & 576460752840425481L) != 0) || _la==NO || _la==PRECEDES || ((((_la - 537)) & ~0x3f) == 0 && ((1L << (_la - 537)) & 576465150349934593L) != 0) || ((((_la - 615)) & ~0x3f) == 0 && ((1L << (_la - 615)) & 1133871367169L) != 0) || _la==START || _la==STOP || ((((_la - 757)) & ~0x3f) == 0 && ((1L << (_la - 757)) & 72057594037929473L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierKeywordsAmbiguous3RolesContext extends ParserRuleContext {
		public TerminalNode EVENT() { return getToken(BaseRuleParser.EVENT, 0); }
		public TerminalNode FILE() { return getToken(BaseRuleParser.FILE, 0); }
		public TerminalNode NONE() { return getToken(BaseRuleParser.NONE, 0); }
		public TerminalNode PROCESS() { return getToken(BaseRuleParser.PROCESS, 0); }
		public TerminalNode PROXY() { return getToken(BaseRuleParser.PROXY, 0); }
		public TerminalNode RELOAD() { return getToken(BaseRuleParser.RELOAD, 0); }
		public TerminalNode REPLICATION() { return getToken(BaseRuleParser.REPLICATION, 0); }
		public TerminalNode RESOURCE() { return getToken(BaseRuleParser.RESOURCE, 0); }
		public TerminalNode SUPER() { return getToken(BaseRuleParser.SUPER, 0); }
		public IdentifierKeywordsAmbiguous3RolesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierKeywordsAmbiguous3Roles; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIdentifierKeywordsAmbiguous3Roles(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIdentifierKeywordsAmbiguous3Roles(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIdentifierKeywordsAmbiguous3Roles(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierKeywordsAmbiguous3RolesContext identifierKeywordsAmbiguous3Roles() throws RecognitionException {
		IdentifierKeywordsAmbiguous3RolesContext _localctx = new IdentifierKeywordsAmbiguous3RolesContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_identifierKeywordsAmbiguous3Roles);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(431);
			_la = _input.LA(1);
			if ( !(_la==EVENT || _la==FILE || _la==NONE || ((((_la - 544)) & ~0x3f) == 0 && ((1L << (_la - 544)) & 18295875633676305L) != 0) || _la==SUPER) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierKeywordsAmbiguous4SystemVariablesContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(BaseRuleParser.GLOBAL, 0); }
		public TerminalNode LOCAL() { return getToken(BaseRuleParser.LOCAL, 0); }
		public TerminalNode PERSIST() { return getToken(BaseRuleParser.PERSIST, 0); }
		public TerminalNode PERSIST_ONLY() { return getToken(BaseRuleParser.PERSIST_ONLY, 0); }
		public TerminalNode SESSION() { return getToken(BaseRuleParser.SESSION, 0); }
		public IdentifierKeywordsAmbiguous4SystemVariablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierKeywordsAmbiguous4SystemVariables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIdentifierKeywordsAmbiguous4SystemVariables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIdentifierKeywordsAmbiguous4SystemVariables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIdentifierKeywordsAmbiguous4SystemVariables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierKeywordsAmbiguous4SystemVariablesContext identifierKeywordsAmbiguous4SystemVariables() throws RecognitionException {
		IdentifierKeywordsAmbiguous4SystemVariablesContext _localctx = new IdentifierKeywordsAmbiguous4SystemVariablesContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_identifierKeywordsAmbiguous4SystemVariables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(433);
			_la = _input.LA(1);
			if ( !(_la==GLOBAL || _la==LOCAL || _la==PERSIST || _la==PERSIST_ONLY || _la==SESSION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextOrIdentifierContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public IpAddressContext ipAddress() {
			return getRuleContext(IpAddressContext.class,0);
		}
		public TextOrIdentifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textOrIdentifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTextOrIdentifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTextOrIdentifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTextOrIdentifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextOrIdentifierContext textOrIdentifier() throws RecognitionException {
		TextOrIdentifierContext _localctx = new TextOrIdentifierContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_textOrIdentifier);
		try {
			setState(438);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,11,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(435);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(436);
				string_();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(437);
				ipAddress();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IpAddressContext extends ParserRuleContext {
		public TerminalNode IP_ADDRESS() { return getToken(BaseRuleParser.IP_ADDRESS, 0); }
		public IpAddressContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ipAddress; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIpAddress(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIpAddress(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIpAddress(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IpAddressContext ipAddress() throws RecognitionException {
		IpAddressContext _localctx = new IpAddressContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_ipAddress);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(440);
			match(IP_ADDRESS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class VariableContext extends ParserRuleContext {
		public UserVariableContext userVariable() {
			return getRuleContext(UserVariableContext.class,0);
		}
		public SystemVariableContext systemVariable() {
			return getRuleContext(SystemVariableContext.class,0);
		}
		public VariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_variable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final VariableContext variable() throws RecognitionException {
		VariableContext _localctx = new VariableContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_variable);
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,12,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(442);
				userVariable();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(443);
				systemVariable();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UserVariableContext extends ParserRuleContext {
		public TerminalNode AT_() { return getToken(BaseRuleParser.AT_, 0); }
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public UserVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterUserVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitUserVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitUserVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserVariableContext userVariable() throws RecognitionException {
		UserVariableContext _localctx = new UserVariableContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_userVariable);
		try {
			setState(449);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_:
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(AT_);
				setState(447);
				textOrIdentifier();
				}
				break;
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GROUP_CONCAT:
			case CAST:
			case POSITION:
			case SUBSTRING:
			case SUBSTR:
			case EXTRACT:
			case TRIM:
			case LAST_DAY:
			case TRADITIONAL:
			case TREE:
			case MYSQL_MAIN:
			case MYSQL_ADMIN:
			case INSTANT:
			case INPLACE:
			case COPY:
			case UL_BINARY:
			case AUTOCOMMIT:
			case REDO_LOG:
			case ARCHIVE:
			case BLACKHOLE:
			case CSV:
			case FEDERATED:
			case INNODB:
			case MEMORY:
			case MRG_MYISAM:
			case MYISAM:
			case NDB:
			case NDBCLUSTER:
			case PERFORMANCE_SCHEMA:
			case TOKUDB:
			case ACCOUNT:
			case ACTION:
			case ACTIVE:
			case ADMIN:
			case AFTER:
			case AGAINST:
			case AGGREGATE:
			case ALGORITHM:
			case ALWAYS:
			case ANY:
			case ARRAY:
			case ASCII:
			case AT:
			case ATTRIBUTE:
			case AUTOEXTEND_SIZE:
			case AUTO_INCREMENT:
			case AVG:
			case BIT_XOR:
			case AVG_ROW_LENGTH:
			case BACKUP:
			case BEFORE:
			case BEGIN:
			case BINLOG:
			case BIT:
			case BLOCK:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BUCKETS:
			case BYTE:
			case CACHE:
			case CASCADED:
			case CATALOG_NAME:
			case CHAIN:
			case CHANGED:
			case CHANNEL:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLASS_ORIGIN:
			case CLIENT:
			case CLONE:
			case CLOSE:
			case COALESCE:
			case CODE:
			case COLLATION:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COLUMN_NAME:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETION:
			case COMPONENT:
			case COMPRESSED:
			case COMPRESSION:
			case CONCURRENT:
			case CONNECTION:
			case CONSISTENT:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONTAINS:
			case CONTEXT:
			case CPU:
			case CREATE:
			case CURRENT:
			case CURSOR_NAME:
			case DATA:
			case DATAFILE:
			case DATE:
			case DATETIME:
			case DAY:
			case DAY_MINUTE:
			case DEALLOCATE:
			case DEFAULT:
			case DEFAULT_AUTH:
			case DEFINER:
			case DEFINITION:
			case DELAY_KEY_WRITE:
			case DESCRIPTION:
			case DIAGNOSTICS:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DO:
			case DROP:
			case DUMPFILE:
			case DUPLICATE:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTION:
			case END:
			case ENDS:
			case ENFORCED:
			case ENGINE:
			case ENGINES:
			case ENGINE_ATTRIBUTE:
			case ENUM:
			case ERROR:
			case ERRORS:
			case ESCAPE:
			case EVENT:
			case EVENTS:
			case EVERY:
			case EXCHANGE:
			case EXCLUDE:
			case EXECUTE:
			case EXPANSION:
			case EXPIRE:
			case EXPORT:
			case EXTENDED:
			case EXTENT_SIZE:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FAULTS:
			case FILE:
			case FILE_BLOCK_SIZE:
			case FILTER:
			case FIRST:
			case FIXED:
			case FLUSH:
			case FOLLOWING:
			case FOLLOWS:
			case FORMAT:
			case FOUND:
			case FULL:
			case GENERAL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case GET_FORMAT:
			case GET_MASTER_PUBLIC_KEY:
			case GLOBAL:
			case GRANTS:
			case GROUPS:
			case GROUP_REPLICATION:
			case HANDLER:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HISTORY:
			case HOST:
			case HOSTS:
			case HOUR:
			case IDENTIFIED:
			case IGNORE_SERVER_IDS:
			case IMPORT:
			case INACTIVE:
			case INDEXES:
			case INITIAL_SIZE:
			case INSERT_METHOD:
			case INSTALL:
			case INSTANCE:
			case INVISIBLE:
			case INVOKER:
			case IO:
			case IPC:
			case ISOLATION:
			case ISSUER:
			case JSON:
			case JSON_VALUE:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LANGUAGE:
			case LAST:
			case LAST_VALUE:
			case LEAVES:
			case LESS:
			case LEVEL:
			case LINESTRING:
			case LIST:
			case LOCAL:
			case LOCKED:
			case LOCKS:
			case LOGFILE:
			case LOGS:
			case MASTER:
			case MASTER_AUTO_POSITION:
			case MASTER_COMPRESSION_ALGORITHM:
			case MASTER_CONNECT_RETRY:
			case MASTER_DELAY:
			case MASTER_HEARTBEAT_PERIOD:
			case MASTER_HOST:
			case MASTER_LOG_FILE:
			case MASTER_LOG_POS:
			case MASTER_PASSWORD:
			case MASTER_PORT:
			case MASTER_PUBLIC_KEY_PATH:
			case MASTER_RETRY_COUNT:
			case MASTER_SERVER_ID:
			case MASTER_SSL:
			case MASTER_SSL_CA:
			case MASTER_SSL_CAPATH:
			case MASTER_SSL_CERT:
			case MASTER_SSL_CIPHER:
			case MASTER_SSL_CRL:
			case MASTER_SSL_CRLPATH:
			case MASTER_SSL_KEY:
			case MASTER_TLS_CIPHERSUITES:
			case MASTER_TLS_VERSION:
			case MASTER_USER:
			case MASTER_ZSTD_COMPRESSION_LEVEL:
			case MAXVALUE:
			case MAX_CONNECTIONS_PER_HOUR:
			case MAX_QUERIES_PER_HOUR:
			case MAX_ROWS:
			case MAX_SIZE:
			case MAX_UPDATES_PER_HOUR:
			case MAX_USER_CONNECTIONS:
			case MEDIUM:
			case MEMBER:
			case MERGE:
			case MESSAGE_TEXT:
			case MICROSECOND:
			case MIGRATE:
			case MINUTE:
			case MIN_ROWS:
			case MODE:
			case MODIFY:
			case MONTH:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case MUTEX:
			case MYSQL_ERRNO:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NESTED:
			case NETWORK_NAMESPACE:
			case NEVER:
			case NEW:
			case NEXT:
			case NO:
			case NODEGROUP:
			case NONE:
			case NOWAIT:
			case NO_WAIT:
			case NULLS:
			case NUMBER:
			case NVARCHAR:
			case OFF:
			case OFFSET:
			case OJ:
			case OLD:
			case ONE:
			case ONLY:
			case OPEN:
			case OPTIONAL:
			case OPTIONS:
			case ORDINALITY:
			case ORGANIZATION:
			case OTHERS:
			case OWNER:
			case PACK_KEYS:
			case PAGE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_LOCK_TIME:
			case PATH:
			case PERSIST:
			case PERSIST_ONLY:
			case PHASE:
			case PLUGIN:
			case PLUGINS:
			case PLUGIN_DIR:
			case POINT:
			case POLYGON:
			case PORT:
			case PRECEDES:
			case PRECEDING:
			case PREPARE:
			case PRESERVE:
			case PREV:
			case PRIMARY:
			case PRIVILEGES:
			case PRIVILEGE_CHECKS_USER:
			case PROCESS:
			case PROCESSLIST:
			case PROFILE:
			case PROFILES:
			case PROXY:
			case QUARTER:
			case QUERY:
			case QUICK:
			case RANDOM:
			case RANK:
			case READ_ONLY:
			case REBUILD:
			case RECOVER:
			case REDO_BUFFER_SIZE:
			case REDUNDANT:
			case REFERENCE:
			case RELAY:
			case RELAYLOG:
			case RELAY_LOG_FILE:
			case RELAY_LOG_POS:
			case RELAY_THREAD:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPEATABLE:
			case REPLICATE_DO_DB:
			case REPLICATE_DO_TABLE:
			case REPLICATE_IGNORE_DB:
			case REPLICATE_IGNORE_TABLE:
			case REPLICATE_REWRITE_DB:
			case REPLICATE_WILD_DO_TABLE:
			case REPLICATE_WILD_IGNORE_TABLE:
			case REPLICATION:
			case REQUIRE_ROW_FORMAT:
			case RESET:
			case RESOURCE:
			case RESPECT:
			case RESTART:
			case RESTORE:
			case RESUME:
			case RETAIN:
			case RETURNED_SQLSTATE:
			case RETURNING:
			case RETURNS:
			case REUSE:
			case REVERSE:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROTATE:
			case ROUTINE:
			case ROW_COUNT:
			case ROW_FORMAT:
			case RTREE:
			case SAVEPOINT:
			case SCHEDULE:
			case SCHEMA_NAME:
			case SECOND:
			case SECONDARY:
			case SECONDARY_ENGINE:
			case SECONDARY_ENGINE_ATTRIBUTE:
			case SECONDARY_LOAD:
			case SECONDARY_UNLOAD:
			case SECURITY:
			case SERIAL:
			case SERIALIZABLE:
			case SERVER:
			case SESSION:
			case SHARE:
			case SHUTDOWN:
			case SIGNED:
			case SIMPLE:
			case SLAVE:
			case SLOW:
			case SNAPSHOT:
			case SOCKET:
			case SONAME:
			case SOUNDS:
			case SOURCE:
			case SQL_AFTER_GTIDS:
			case SQL_AFTER_MTS_GAPS:
			case SQL_BEFORE_GTIDS:
			case SQL_BUFFER_RESULT:
			case SQL_NO_CACHE:
			case SQL_THREAD:
			case SRID:
			case STACKED:
			case START:
			case STARTS:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STRING:
			case SUBCLASS_ORIGIN:
			case SUBJECT:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case SUPER:
			case SUSPEND:
			case SWAPS:
			case SWITCHES:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TABLESPACE:
			case TABLE_CHECKSUM:
			case TABLE_NAME:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case THAN:
			case THREAD_PRIORITY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMP_ADD:
			case TIMESTAMP_DIFF:
			case TLS:
			case TRANSACTION:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDEFINED:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case UNICODE:
			case UNINSTALL:
			case UNKNOWN:
			case UNTIL:
			case UPGRADE:
			case USER:
			case USER_RESOURCES:
			case USE_FRM:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case VALIDATION:
			case VALUE:
			case VARIABLES:
			case VCPU:
			case VIEW:
			case VISIBLE:
			case WAIT:
			case WARNINGS:
			case WEEK:
			case WEIGHT_STRING:
			case WITHOUT:
			case WORK:
			case WRAPPER:
			case X509:
			case XA:
			case XID:
			case XML:
			case YEAR:
			case YEAR_MONTH:
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
			case BQUOTA_STRING:
			case UNDERSCORE_CHARSET:
			case IDENTIFIER_:
			case IP_ADDRESS:
				enterOuterAlt(_localctx, 2);
				{
				setState(448);
				textOrIdentifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SystemVariableContext extends ParserRuleContext {
		public Token systemVariableScope;
		public List<TerminalNode> AT_() { return getTokens(BaseRuleParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(BaseRuleParser.AT_, i);
		}
		public RvalueSystemVariableContext rvalueSystemVariable() {
			return getRuleContext(RvalueSystemVariableContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public TerminalNode GLOBAL() { return getToken(BaseRuleParser.GLOBAL, 0); }
		public TerminalNode SESSION() { return getToken(BaseRuleParser.SESSION, 0); }
		public TerminalNode LOCAL() { return getToken(BaseRuleParser.LOCAL, 0); }
		public SystemVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_systemVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSystemVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSystemVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSystemVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SystemVariableContext systemVariable() throws RecognitionException {
		SystemVariableContext _localctx = new SystemVariableContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_systemVariable);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(451);
			match(AT_);
			setState(452);
			match(AT_);
			setState(455);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				{
				setState(453);
				((SystemVariableContext)_localctx).systemVariableScope = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==GLOBAL || _la==LOCAL || _la==SESSION) ) {
					((SystemVariableContext)_localctx).systemVariableScope = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(454);
				match(DOT_);
				}
				break;
			}
			setState(457);
			rvalueSystemVariable();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RvalueSystemVariableContext extends ParserRuleContext {
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RvalueSystemVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_rvalueSystemVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterRvalueSystemVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitRvalueSystemVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitRvalueSystemVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RvalueSystemVariableContext rvalueSystemVariable() throws RecognitionException {
		RvalueSystemVariableContext _localctx = new RvalueSystemVariableContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_rvalueSystemVariable);
		try {
			setState(464);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(459);
				textOrIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(460);
				textOrIdentifier();
				setState(461);
				match(DOT_);
				setState(462);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetSystemVariableContext extends ParserRuleContext {
		public List<TerminalNode> AT_() { return getTokens(BaseRuleParser.AT_); }
		public TerminalNode AT_(int i) {
			return getToken(BaseRuleParser.AT_, i);
		}
		public InternalVariableNameContext internalVariableName() {
			return getRuleContext(InternalVariableNameContext.class,0);
		}
		public OptionTypeContext optionType() {
			return getRuleContext(OptionTypeContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public SetSystemVariableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setSystemVariable; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSetSystemVariable(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSetSystemVariable(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSetSystemVariable(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetSystemVariableContext setSystemVariable() throws RecognitionException {
		SetSystemVariableContext _localctx = new SetSystemVariableContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_setSystemVariable);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(466);
			match(AT_);
			setState(467);
			match(AT_);
			setState(471);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
			case 1:
				{
				setState(468);
				optionType();
				setState(469);
				match(DOT_);
				}
				break;
			}
			setState(473);
			internalVariableName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OptionTypeContext extends ParserRuleContext {
		public TerminalNode GLOBAL() { return getToken(BaseRuleParser.GLOBAL, 0); }
		public TerminalNode PERSIST() { return getToken(BaseRuleParser.PERSIST, 0); }
		public TerminalNode PERSIST_ONLY() { return getToken(BaseRuleParser.PERSIST_ONLY, 0); }
		public TerminalNode SESSION() { return getToken(BaseRuleParser.SESSION, 0); }
		public TerminalNode LOCAL() { return getToken(BaseRuleParser.LOCAL, 0); }
		public OptionTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_optionType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOptionType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOptionType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOptionType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OptionTypeContext optionType() throws RecognitionException {
		OptionTypeContext _localctx = new OptionTypeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_optionType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(475);
			_la = _input.LA(1);
			if ( !(_la==GLOBAL || _la==LOCAL || _la==PERSIST || _la==PERSIST_ONLY || _la==SESSION) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class InternalVariableNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DEFAULT() { return getToken(BaseRuleParser.DEFAULT, 0); }
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public InternalVariableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_internalVariableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterInternalVariableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitInternalVariableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitInternalVariableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InternalVariableNameContext internalVariableName() throws RecognitionException {
		InternalVariableNameContext _localctx = new InternalVariableNameContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_internalVariableName);
		try {
			setState(485);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,17,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(477);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(478);
				match(DEFAULT);
				setState(479);
				match(DOT_);
				setState(480);
				identifier();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(481);
				identifier();
				setState(482);
				match(DOT_);
				setState(483);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SetExprOrDefaultContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(BaseRuleParser.DEFAULT, 0); }
		public TerminalNode ALL() { return getToken(BaseRuleParser.ALL, 0); }
		public TerminalNode ON() { return getToken(BaseRuleParser.ON, 0); }
		public TerminalNode BINARY() { return getToken(BaseRuleParser.BINARY, 0); }
		public TerminalNode ROW() { return getToken(BaseRuleParser.ROW, 0); }
		public TerminalNode SYSTEM() { return getToken(BaseRuleParser.SYSTEM, 0); }
		public SetExprOrDefaultContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_setExprOrDefault; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSetExprOrDefault(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSetExprOrDefault(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSetExprOrDefault(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SetExprOrDefaultContext setExprOrDefault() throws RecognitionException {
		SetExprOrDefaultContext _localctx = new SetExprOrDefaultContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_setExprOrDefault);
		try {
			setState(494);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(487);
				expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(488);
				match(DEFAULT);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(489);
				match(ALL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(490);
				match(ON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(491);
				match(BINARY);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(492);
				match(ROW);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(493);
				match(SYSTEM);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransactionCharacteristicsContext extends ParserRuleContext {
		public TransactionAccessModeContext transactionAccessMode() {
			return getRuleContext(TransactionAccessModeContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(BaseRuleParser.COMMA_, 0); }
		public IsolationLevelContext isolationLevel() {
			return getRuleContext(IsolationLevelContext.class,0);
		}
		public TransactionCharacteristicsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionCharacteristics; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTransactionCharacteristics(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTransactionCharacteristics(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTransactionCharacteristics(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionCharacteristicsContext transactionCharacteristics() throws RecognitionException {
		TransactionCharacteristicsContext _localctx = new TransactionCharacteristicsContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_transactionCharacteristics);
		int _la;
		try {
			setState(506);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case READ:
				enterOuterAlt(_localctx, 1);
				{
				setState(496);
				transactionAccessMode();
				setState(499);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(497);
					match(COMMA_);
					setState(498);
					isolationLevel();
					}
				}

				}
				break;
			case ISOLATION:
				enterOuterAlt(_localctx, 2);
				{
				setState(501);
				isolationLevel();
				setState(504);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(502);
					match(COMMA_);
					setState(503);
					transactionAccessMode();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsolationLevelContext extends ParserRuleContext {
		public TerminalNode ISOLATION() { return getToken(BaseRuleParser.ISOLATION, 0); }
		public TerminalNode LEVEL() { return getToken(BaseRuleParser.LEVEL, 0); }
		public IsolationTypesContext isolationTypes() {
			return getRuleContext(IsolationTypesContext.class,0);
		}
		public IsolationLevelContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isolationLevel; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIsolationLevel(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIsolationLevel(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIsolationLevel(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsolationLevelContext isolationLevel() throws RecognitionException {
		IsolationLevelContext _localctx = new IsolationLevelContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_isolationLevel);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(508);
			match(ISOLATION);
			setState(509);
			match(LEVEL);
			setState(510);
			isolationTypes();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IsolationTypesContext extends ParserRuleContext {
		public TerminalNode REPEATABLE() { return getToken(BaseRuleParser.REPEATABLE, 0); }
		public TerminalNode READ() { return getToken(BaseRuleParser.READ, 0); }
		public TerminalNode COMMITTED() { return getToken(BaseRuleParser.COMMITTED, 0); }
		public TerminalNode UNCOMMITTED() { return getToken(BaseRuleParser.UNCOMMITTED, 0); }
		public TerminalNode SERIALIZABLE() { return getToken(BaseRuleParser.SERIALIZABLE, 0); }
		public IsolationTypesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_isolationTypes; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIsolationTypes(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIsolationTypes(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIsolationTypes(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IsolationTypesContext isolationTypes() throws RecognitionException {
		IsolationTypesContext _localctx = new IsolationTypesContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_isolationTypes);
		try {
			setState(519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,22,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(512);
				match(REPEATABLE);
				setState(513);
				match(READ);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(514);
				match(READ);
				setState(515);
				match(COMMITTED);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(516);
				match(READ);
				setState(517);
				match(UNCOMMITTED);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(518);
				match(SERIALIZABLE);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TransactionAccessModeContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(BaseRuleParser.READ, 0); }
		public TerminalNode WRITE() { return getToken(BaseRuleParser.WRITE, 0); }
		public TerminalNode ONLY() { return getToken(BaseRuleParser.ONLY, 0); }
		public TransactionAccessModeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_transactionAccessMode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTransactionAccessMode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTransactionAccessMode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTransactionAccessMode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TransactionAccessModeContext transactionAccessMode() throws RecognitionException {
		TransactionAccessModeContext _localctx = new TransactionAccessModeContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_transactionAccessMode);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(521);
			match(READ);
			setState(522);
			_la = _input.LA(1);
			if ( !(_la==ONLY || _la==WRITE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public SchemaNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSchemaName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSchemaName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSchemaName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNameContext schemaName() throws RecognitionException {
		SchemaNameContext _localctx = new SchemaNameContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_schemaName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaNamesContext extends ParserRuleContext {
		public List<SchemaNameContext> schemaName() {
			return getRuleContexts(SchemaNameContext.class);
		}
		public SchemaNameContext schemaName(int i) {
			return getRuleContext(SchemaNameContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public SchemaNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSchemaNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSchemaNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSchemaNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaNamesContext schemaNames() throws RecognitionException {
		SchemaNamesContext _localctx = new SchemaNamesContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_schemaNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(526);
			schemaName();
			setState(531);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(527);
				match(COMMA_);
				setState(528);
				schemaName();
				}
				}
				setState(533);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharsetNameContext extends ParserRuleContext {
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(BaseRuleParser.BINARY, 0); }
		public TerminalNode DEFAULT() { return getToken(BaseRuleParser.DEFAULT, 0); }
		public CharsetNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charsetName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCharsetName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCharsetName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCharsetName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharsetNameContext charsetName() throws RecognitionException {
		CharsetNameContext _localctx = new CharsetNameContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_charsetName);
		try {
			setState(537);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,24,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(534);
				textOrIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(535);
				match(BINARY);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(536);
				match(DEFAULT);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaPairsContext extends ParserRuleContext {
		public List<SchemaPairContext> schemaPair() {
			return getRuleContexts(SchemaPairContext.class);
		}
		public SchemaPairContext schemaPair(int i) {
			return getRuleContext(SchemaPairContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public SchemaPairsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaPairs; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSchemaPairs(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSchemaPairs(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSchemaPairs(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaPairsContext schemaPairs() throws RecognitionException {
		SchemaPairsContext _localctx = new SchemaPairsContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_schemaPairs);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(539);
			schemaPair();
			setState(544);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(540);
				match(COMMA_);
				setState(541);
				schemaPair();
				}
				}
				setState(546);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SchemaPairContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<SchemaNameContext> schemaName() {
			return getRuleContexts(SchemaNameContext.class);
		}
		public SchemaNameContext schemaName(int i) {
			return getRuleContext(SchemaNameContext.class,i);
		}
		public TerminalNode COMMA_() { return getToken(BaseRuleParser.COMMA_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public SchemaPairContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_schemaPair; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSchemaPair(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSchemaPair(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSchemaPair(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SchemaPairContext schemaPair() throws RecognitionException {
		SchemaPairContext _localctx = new SchemaPairContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_schemaPair);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(547);
			match(LP_);
			setState(548);
			schemaName();
			setState(549);
			match(COMMA_);
			setState(550);
			schemaName();
			setState(551);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableNameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public TableNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTableName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTableName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTableName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableNameContext tableName() throws RecognitionException {
		TableNameContext _localctx = new TableNameContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_tableName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(556);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				{
				setState(553);
				owner();
				setState(554);
				match(DOT_);
				}
				break;
			}
			setState(558);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ColumnNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterColumnName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitColumnName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitColumnName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNameContext columnName() throws RecognitionException {
		ColumnNameContext _localctx = new ColumnNameContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_columnName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(560);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IndexNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public IndexNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_indexName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIndexName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIndexName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIndexName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IndexNameContext indexName() throws RecognitionException {
		IndexNameContext _localctx = new IndexNameContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_indexName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(562);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConstraintNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConstraintNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constraintName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterConstraintName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitConstraintName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitConstraintName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConstraintNameContext constraintName() throws RecognitionException {
		ConstraintNameContext _localctx = new ConstraintNameContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_constraintName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(564);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OldColumnContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public OldColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_oldColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOldColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOldColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOldColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OldColumnContext oldColumn() throws RecognitionException {
		OldColumnContext _localctx = new OldColumnContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_oldColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(566);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NewColumnContext extends ParserRuleContext {
		public ColumnNameContext columnName() {
			return getRuleContext(ColumnNameContext.class,0);
		}
		public NewColumnContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newColumn; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNewColumn(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNewColumn(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNewColumn(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NewColumnContext newColumn() throws RecognitionException {
		NewColumnContext _localctx = new NewColumnContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_newColumn);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(568);
			columnName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DelimiterNameContext extends ParserRuleContext {
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public List<TerminalNode> BACKSLASH_() { return getTokens(BaseRuleParser.BACKSLASH_); }
		public TerminalNode BACKSLASH_(int i) {
			return getToken(BaseRuleParser.BACKSLASH_, i);
		}
		public List<TerminalNode> SQ_() { return getTokens(BaseRuleParser.SQ_); }
		public TerminalNode SQ_(int i) {
			return getToken(BaseRuleParser.SQ_, i);
		}
		public List<TerminalNode> DQ_() { return getTokens(BaseRuleParser.DQ_); }
		public TerminalNode DQ_(int i) {
			return getToken(BaseRuleParser.DQ_, i);
		}
		public List<TerminalNode> BQ_() { return getTokens(BaseRuleParser.BQ_); }
		public TerminalNode BQ_(int i) {
			return getToken(BaseRuleParser.BQ_, i);
		}
		public DelimiterNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_delimiterName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDelimiterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDelimiterName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDelimiterName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DelimiterNameContext delimiterName() throws RecognitionException {
		DelimiterNameContext _localctx = new DelimiterNameContext(_ctx, getState());
		enterRule(_localctx, 86, RULE_delimiterName);
		int _la;
		try {
			setState(578);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(570);
				textOrIdentifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(574); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					setState(574);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case BACKSLASH_:
						{
						setState(571);
						match(BACKSLASH_);
						setState(572);
						matchWildcard();
						}
						break;
					case T__0:
					case AND_:
					case OR_:
					case NOT_:
					case TILDE_:
					case VERTICAL_BAR_:
					case AMPERSAND_:
					case SIGNED_LEFT_SHIFT_:
					case SIGNED_RIGHT_SHIFT_:
					case CARET_:
					case MOD_:
					case COLON_:
					case PLUS_:
					case MINUS_:
					case ASTERISK_:
					case SLASH_:
					case DOT_:
					case DOT_ASTERISK_:
					case SAFE_EQ_:
					case DEQ_:
					case EQ_:
					case NEQ_:
					case GT_:
					case GTE_:
					case LT_:
					case LTE_:
					case POUND_:
					case LP_:
					case RP_:
					case LBE_:
					case RBE_:
					case LBT_:
					case RBT_:
					case COMMA_:
					case QUESTION_:
					case AT_:
					case SEMI_:
					case ASSIGNMENT_:
					case JSON_SEPARATOR:
					case JSON_UNQUOTED_SEPARATOR:
					case WS:
					case MAX:
					case MIN:
					case SUM:
					case COUNT:
					case GROUP_CONCAT:
					case CAST:
					case POSITION:
					case SUBSTRING:
					case SUBSTR:
					case EXTRACT:
					case TRIM:
					case LAST_DAY:
					case TRADITIONAL:
					case TREE:
					case MYSQL_MAIN:
					case MYSQL_ADMIN:
					case INSTANT:
					case INPLACE:
					case COPY:
					case UL_BINARY:
					case AUTOCOMMIT:
					case REDO_LOG:
					case DELIMITER:
					case ARCHIVE:
					case BLACKHOLE:
					case CSV:
					case FEDERATED:
					case INNODB:
					case MEMORY:
					case MRG_MYISAM:
					case MYISAM:
					case NDB:
					case NDBCLUSTER:
					case PERFORMANCE_SCHEMA:
					case TOKUDB:
					case FOR_GENERATOR:
					case ACCESSIBLE:
					case ACCOUNT:
					case ACTION:
					case ACTIVE:
					case ADD:
					case ADMIN:
					case AFTER:
					case AGAINST:
					case AGGREGATE:
					case ALGORITHM:
					case ALL:
					case ALTER:
					case ALWAYS:
					case ANALYZE:
					case AND:
					case ANY:
					case ARRAY:
					case AS:
					case ASC:
					case ASCII:
					case ASENSITIVE:
					case AT:
					case ATTRIBUTE:
					case AUTOEXTEND_SIZE:
					case AUTO_INCREMENT:
					case AVG:
					case ASSIGN_GTIDS_TO_ANONYMOUS_TRANSACTIONS:
					case BIT_XOR:
					case AVG_ROW_LENGTH:
					case BACKUP:
					case BEFORE:
					case BEGIN:
					case BETWEEN:
					case BIGINT:
					case BINARY:
					case BINLOG:
					case BIT:
					case BLOB:
					case BLOCK:
					case BOOL:
					case BOOLEAN:
					case BOTH:
					case BTREE:
					case BUCKETS:
					case BY:
					case BYTE:
					case CACHE:
					case CALL:
					case CASCADE:
					case CASCADED:
					case CASE:
					case CATALOG_NAME:
					case CHAIN:
					case CHANGE:
					case CHANGED:
					case CHANNEL:
					case CHAR:
					case CHAR_VARYING:
					case CHARACTER:
					case CHARACTER_VARYING:
					case CHARSET:
					case CHECK:
					case CHECKSUM:
					case CIPHER:
					case CLASS_ORIGIN:
					case CLIENT:
					case CLONE:
					case CLOSE:
					case COALESCE:
					case CODE:
					case COLLATE:
					case COLLATION:
					case COLUMN:
					case COLUMNS:
					case COLUMN_FORMAT:
					case COLUMN_NAME:
					case COMMENT:
					case COMMIT:
					case COMMITTED:
					case COMPACT:
					case COMPLETION:
					case COMPONENT:
					case COMPRESSED:
					case COMPRESSION:
					case CONCURRENT:
					case CONDITION:
					case CONNECTION:
					case CONSISTENT:
					case CONSTRAINT:
					case CONSTRAINT_CATALOG:
					case CONSTRAINT_NAME:
					case CONSTRAINT_SCHEMA:
					case CONTAINS:
					case CONTEXT:
					case CONTINUE:
					case CONVERT:
					case CPU:
					case CREATE:
					case CROSS:
					case CUBE:
					case CUME_DIST:
					case CURRENT:
					case CURRENT_DATE:
					case CURRENT_TIME:
					case CURRENT_TIMESTAMP:
					case CURRENT_USER:
					case CURSOR:
					case CURSOR_NAME:
					case DATA:
					case DATABASE:
					case DATABASES:
					case DATAFILE:
					case DATE:
					case DATETIME:
					case DAY:
					case DAY_HOUR:
					case DAY_MICROSECOND:
					case DAY_MINUTE:
					case DAY_SECOND:
					case DEALLOCATE:
					case DEC:
					case DECIMAL:
					case DECLARE:
					case DEFAULT:
					case DEFAULT_AUTH:
					case DEFINER:
					case DEFINITION:
					case DELAYED:
					case DELAY_KEY_WRITE:
					case DELETE:
					case DENSE_RANK:
					case DESC:
					case DESCRIBE:
					case DESCRIPTION:
					case DETERMINISTIC:
					case DIAGNOSTICS:
					case DIRECTORY:
					case DISABLE:
					case DISCARD:
					case DISK:
					case DISTINCT:
					case DISTINCTROW:
					case DIV:
					case DO:
					case DOUBLE:
					case DROP:
					case DUAL:
					case DUMPFILE:
					case DUPLICATE:
					case DYNAMIC:
					case EACH:
					case ELSE:
					case ELSEIF:
					case EMPTY:
					case ENABLE:
					case ENCLOSED:
					case ENCRYPTION:
					case END:
					case ENDS:
					case ENFORCED:
					case ENGINE:
					case ENGINES:
					case ENGINE_ATTRIBUTE:
					case ENUM:
					case ERROR:
					case ERRORS:
					case ESCAPE:
					case ESCAPED:
					case EVENT:
					case EVENTS:
					case EVERY:
					case EXCEPT:
					case EXCHANGE:
					case EXCLUDE:
					case EXECUTE:
					case EXISTS:
					case EXIT:
					case EXPANSION:
					case EXPIRE:
					case EXPLAIN:
					case EXPORT:
					case EXTENDED:
					case EXTENT_SIZE:
					case FAILED_LOGIN_ATTEMPTS:
					case FALSE:
					case FAST:
					case FAULTS:
					case FETCH:
					case FILE:
					case FILE_BLOCK_SIZE:
					case FILTER:
					case FIRST:
					case FIRST_VALUE:
					case FIXED:
					case FLOAT:
					case FLOAT4:
					case FLOAT8:
					case FLUSH:
					case FOLLOWING:
					case FOLLOWS:
					case FOR:
					case FORCE:
					case FOREIGN:
					case FORMAT:
					case FOUND:
					case FROM:
					case FULL:
					case FULLTEXT:
					case FUNCTION:
					case GENERAL:
					case GENERATED:
					case GEOMETRY:
					case GEOMCOLLECTION:
					case GEOMETRYCOLLECTION:
					case GET:
					case GET_FORMAT:
					case GET_MASTER_PUBLIC_KEY:
					case GLOBAL:
					case GRANT:
					case GRANTS:
					case GROUP:
					case GROUPING:
					case GROUPS:
					case GROUP_REPLICATION:
					case GET_SOURCE_PUBLIC_KEY:
					case GTID_ONLY:
					case GENERATE:
					case HANDLER:
					case HASH:
					case HAVING:
					case HELP:
					case HIGH_PRIORITY:
					case HISTOGRAM:
					case HISTORY:
					case HOST:
					case HOSTS:
					case HOUR:
					case HOUR_MICROSECOND:
					case HOUR_MINUTE:
					case HOUR_SECOND:
					case IDENTIFIED:
					case IF:
					case IGNORE:
					case IGNORE_SERVER_IDS:
					case IMPORT:
					case IN:
					case INACTIVE:
					case INDEX:
					case INDEXES:
					case INFILE:
					case INITIAL_SIZE:
					case INNER:
					case INOUT:
					case INSENSITIVE:
					case INSERT:
					case INSERT_METHOD:
					case INSTALL:
					case INSTANCE:
					case INT:
					case INT1:
					case INT2:
					case INT3:
					case INT4:
					case INT8:
					case INTEGER:
					case INTERVAL:
					case INTO:
					case INVISIBLE:
					case INVOKER:
					case IO:
					case IO_AFTER_GTIDS:
					case IO_BEFORE_GTIDS:
					case IPC:
					case IS:
					case ISOLATION:
					case ISSUER:
					case ITERATE:
					case JOIN:
					case JSON:
					case JSON_TABLE:
					case JSON_VALUE:
					case KEY:
					case KEYS:
					case KEY_BLOCK_SIZE:
					case KILL:
					case LAG:
					case LANGUAGE:
					case LAST:
					case LAST_VALUE:
					case LATERAL:
					case LEAD:
					case LEADING:
					case LEAVE:
					case LEAVES:
					case LEFT:
					case LESS:
					case LEVEL:
					case LIKE:
					case LIMIT:
					case LINEAR:
					case LINES:
					case LINESTRING:
					case LIST:
					case LOAD:
					case LOCAL:
					case LOCALTIME:
					case LOCALTIMESTAMP:
					case LOCK:
					case LOCKED:
					case LOCKS:
					case LOGFILE:
					case LOGS:
					case LONG:
					case LONGBLOB:
					case LONGTEXT:
					case LONG_CHAR_VARYING:
					case LONG_VARCHAR:
					case LOOP:
					case LOW_PRIORITY:
					case MASTER:
					case MASTER_AUTO_POSITION:
					case MASTER_BIND:
					case MASTER_COMPRESSION_ALGORITHM:
					case MASTER_CONNECT_RETRY:
					case MASTER_DELAY:
					case MASTER_HEARTBEAT_PERIOD:
					case MASTER_HOST:
					case MASTER_LOG_FILE:
					case MASTER_LOG_POS:
					case MASTER_PASSWORD:
					case MASTER_PORT:
					case MASTER_PUBLIC_KEY_PATH:
					case MASTER_RETRY_COUNT:
					case MASTER_SERVER_ID:
					case MASTER_SSL:
					case MASTER_SSL_CA:
					case MASTER_SSL_CAPATH:
					case MASTER_SSL_CERT:
					case MASTER_SSL_CIPHER:
					case MASTER_SSL_CRL:
					case MASTER_SSL_CRLPATH:
					case MASTER_SSL_KEY:
					case MASTER_SSL_VERIFY_SERVER_CERT:
					case MASTER_TLS_CIPHERSUITES:
					case MASTER_TLS_VERSION:
					case MASTER_USER:
					case MASTER_ZSTD_COMPRESSION_LEVEL:
					case MATCH:
					case MAXVALUE:
					case MAX_CONNECTIONS_PER_HOUR:
					case MAX_QUERIES_PER_HOUR:
					case MAX_ROWS:
					case MAX_SIZE:
					case MAX_UPDATES_PER_HOUR:
					case MAX_USER_CONNECTIONS:
					case MEDIUM:
					case MEDIUMBLOB:
					case MEDIUMINT:
					case MEDIUMTEXT:
					case MEMBER:
					case MERGE:
					case MESSAGE_TEXT:
					case MICROSECOND:
					case MIDDLEINT:
					case MIGRATE:
					case MINUTE:
					case MINUTE_MICROSECOND:
					case MINUTE_SECOND:
					case MIN_ROWS:
					case MOD:
					case MODE:
					case MODIFIES:
					case MODIFY:
					case MONTH:
					case MULTILINESTRING:
					case MULTIPOINT:
					case MULTIPOLYGON:
					case MUTEX:
					case MYSQL_ERRNO:
					case NAME:
					case NAMES:
					case NATIONAL:
					case NATIONAL_CHAR:
					case NATIONAL_CHAR_VARYING:
					case NATURAL:
					case NCHAR:
					case NESTED:
					case NETWORK_NAMESPACE:
					case NEVER:
					case NEW:
					case NEXT:
					case NO:
					case NODEGROUP:
					case NONE:
					case SHARED:
					case EXCLUSIVE:
					case NOT:
					case NOWAIT:
					case NO_WAIT:
					case NO_WRITE_TO_BINLOG:
					case NTH_VALUE:
					case NTILE:
					case NULL:
					case NULLS:
					case NUMBER:
					case NUMERIC:
					case NVARCHAR:
					case OF:
					case OFF:
					case OFFSET:
					case OJ:
					case OLD:
					case ON:
					case ONE:
					case ONLY:
					case OPEN:
					case OPTIMIZE:
					case OPTIMIZER_COSTS:
					case OPTION:
					case OPTIONAL:
					case OPTIONALLY:
					case OPTIONS:
					case OR:
					case ORDER:
					case ORDINALITY:
					case ORGANIZATION:
					case OTHERS:
					case OUT:
					case OUTER:
					case OUTFILE:
					case OVER:
					case OWNER:
					case PACK_KEYS:
					case PAGE:
					case PARSER:
					case PARTIAL:
					case PARTITION:
					case PARTITIONING:
					case PARTITIONS:
					case PASSWORD:
					case PASSWORD_LOCK_TIME:
					case PATH:
					case PERCENT_RANK:
					case PERSIST:
					case PERSIST_ONLY:
					case PHASE:
					case PLUGIN:
					case PLUGINS:
					case PLUGIN_DIR:
					case POINT:
					case POLYGON:
					case PORT:
					case PRECEDES:
					case PRECEDING:
					case PRECISION:
					case PREPARE:
					case PRESERVE:
					case PREV:
					case PRIMARY:
					case PRIVILEGES:
					case PRIVILEGE_CHECKS_USER:
					case PROCEDURE:
					case PROCESS:
					case PROCESSLIST:
					case PROFILE:
					case PROFILES:
					case PROXY:
					case PURGE:
					case QUARTER:
					case QUERY:
					case QUICK:
					case RANDOM:
					case RANGE:
					case RANK:
					case READ:
					case READS:
					case READ_ONLY:
					case READ_WRITE:
					case REAL:
					case REBUILD:
					case RECOVER:
					case RECURSIVE:
					case REDO_BUFFER_SIZE:
					case REDUNDANT:
					case REFERENCE:
					case REFERENCES:
					case REGEXP:
					case RELAY:
					case RELAYLOG:
					case RELAY_LOG_FILE:
					case RELAY_LOG_POS:
					case RELAY_THREAD:
					case RELEASE:
					case RELOAD:
					case REMOVE:
					case RENAME:
					case REORGANIZE:
					case REPAIR:
					case REPEAT:
					case REPEATABLE:
					case REPLACE:
					case REPLICA:
					case REPLICAS:
					case REPLICATE_DO_DB:
					case REPLICATE_DO_TABLE:
					case REPLICATE_IGNORE_DB:
					case REPLICATE_IGNORE_TABLE:
					case REPLICATE_REWRITE_DB:
					case REPLICATE_WILD_DO_TABLE:
					case REPLICATE_WILD_IGNORE_TABLE:
					case REPLICATION:
					case REQUIRE:
					case REQUIRE_ROW_FORMAT:
					case REQUIRE_TABLE_PRIMARY_KEY_CHECK:
					case RESET:
					case RESIGNAL:
					case RESOURCE:
					case RESPECT:
					case RESTART:
					case RESTORE:
					case RESTRICT:
					case RESUME:
					case RETAIN:
					case RETURN:
					case RETURNED_SQLSTATE:
					case RETURNING:
					case RETURNS:
					case REUSE:
					case REVERSE:
					case REVOKE:
					case RIGHT:
					case RLIKE:
					case ROLE:
					case ROLLBACK:
					case ROLLUP:
					case ROTATE:
					case ROUTINE:
					case ROW:
					case ROWS:
					case ROW_COUNT:
					case ROW_FORMAT:
					case ROW_NUMBER:
					case RTREE:
					case SAVEPOINT:
					case SCHEDULE:
					case SCHEMA:
					case SCHEMAS:
					case SCHEMA_NAME:
					case SECOND:
					case SECONDARY:
					case SECONDARY_ENGINE:
					case SECONDARY_ENGINE_ATTRIBUTE:
					case SECONDARY_LOAD:
					case SECONDARY_UNLOAD:
					case SECOND_MICROSECOND:
					case SECURITY:
					case SELECT:
					case SENSITIVE:
					case SEPARATOR:
					case SERIAL:
					case SERIALIZABLE:
					case SERVER:
					case SESSION:
					case SET:
					case SHARE:
					case SHOW:
					case SHUTDOWN:
					case SIGNAL:
					case SIGNED:
					case SIGNED_INT:
					case SIGNED_INTEGER:
					case SIMPLE:
					case SKIP_SYMBOL:
					case SLAVE:
					case SLOW:
					case SMALLINT:
					case SNAPSHOT:
					case SOCKET:
					case SONAME:
					case SOUNDS:
					case SOURCE:
					case SPATIAL:
					case SPECIFIC:
					case SQL:
					case SQLEXCEPTION:
					case SQLSTATE:
					case SQLWARNING:
					case SQL_AFTER_GTIDS:
					case SQL_AFTER_MTS_GAPS:
					case SQL_BEFORE_GTIDS:
					case SQL_BIG_RESULT:
					case SQL_BUFFER_RESULT:
					case SQL_CALC_FOUND_ROWS:
					case SQL_NO_CACHE:
					case SQL_SMALL_RESULT:
					case SQL_THREAD:
					case SRID:
					case SSL:
					case STACKED:
					case START:
					case STARTING:
					case STARTS:
					case STATS_AUTO_RECALC:
					case STATS_PERSISTENT:
					case STATS_SAMPLE_PAGES:
					case STATUS:
					case STOP:
					case STORAGE:
					case STORED:
					case STRAIGHT_JOIN:
					case STREAM:
					case STRING:
					case SUBCLASS_ORIGIN:
					case SUBJECT:
					case SUBPARTITION:
					case SUBPARTITIONS:
					case SUPER:
					case SUSPEND:
					case SWAPS:
					case SWITCHES:
					case SYSTEM:
					case SOURCE_BIND:
					case SOURCE_HOST:
					case SOURCE_USER:
					case SOURCE_PASSWORD:
					case SOURCE_PORT:
					case SOURCE_LOG_FILE:
					case SOURCE_LOG_POS:
					case SOURCE_AUTO_POSITION:
					case SOURCE_HEARTBEAT_PERIOD:
					case SOURCE_CONNECT_RETRY:
					case SOURCE_RETRY_COUNT:
					case SOURCE_CONNECTION_AUTO_FAILOVER:
					case SOURCE_DELAY:
					case SOURCE_COMPRESSION_ALGORITHMS:
					case SOURCE_ZSTD_COMPRESSION_LEVEL:
					case SOURCE_SSL:
					case SOURCE_SSL_CA:
					case SOURCE_SSL_CAPATH:
					case SOURCE_SSL_CERT:
					case SOURCE_SSL_CRL:
					case SOURCE_SSL_CRLPATH:
					case SOURCE_SSL_KEY:
					case SOURCE_SSL_CIPHER:
					case SOURCE_SSL_VERIFY_SERVER_CERT:
					case SOURCE_TLS_VERSION:
					case SOURCE_TLS_CIPHERSUITES:
					case SOURCE_PUBLIC_KEY_PATH:
					case TABLE:
					case TABLES:
					case TABLESPACE:
					case TABLE_CHECKSUM:
					case TABLE_NAME:
					case TEMPORARY:
					case TEMPTABLE:
					case TERMINATED:
					case TEXT:
					case THAN:
					case THEN:
					case THREAD_PRIORITY:
					case TIES:
					case TIME:
					case TIMESTAMP:
					case TIMESTAMP_ADD:
					case TIMESTAMP_DIFF:
					case TINYBLOB:
					case TINYINT:
					case TINYTEXT:
					case TLS:
					case TO:
					case TRAILING:
					case TRANSACTION:
					case TRIGGER:
					case TRIGGERS:
					case TRUE:
					case TRUNCATE:
					case TYPE:
					case TYPES:
					case UNBOUNDED:
					case UNCOMMITTED:
					case UNDEFINED:
					case UNDO:
					case UNDOFILE:
					case UNDO_BUFFER_SIZE:
					case UNICODE:
					case UNINSTALL:
					case UNION:
					case UNIQUE:
					case UNKNOWN:
					case UNLOCK:
					case UNSIGNED:
					case UNSIGNED_INT:
					case UNSIGNED_INTEGER:
					case UNTIL:
					case UPDATE:
					case UPGRADE:
					case USAGE:
					case USE:
					case USER:
					case USER_RESOURCES:
					case USE_FRM:
					case USING:
					case UTC_DATE:
					case UTC_TIME:
					case UTC_TIMESTAMP:
					case VALIDATION:
					case VALUE:
					case VALUES:
					case VARBINARY:
					case VARCHAR:
					case VARCHARACTER:
					case VARIABLES:
					case VARYING:
					case VCPU:
					case VIEW:
					case VIRTUAL:
					case VISIBLE:
					case WAIT:
					case WARNINGS:
					case WEEK:
					case WEIGHT_STRING:
					case WHEN:
					case WHERE:
					case WHILE:
					case WINDOW:
					case WITH:
					case WITHOUT:
					case WORK:
					case WRAPPER:
					case WRITE:
					case X509:
					case XA:
					case XID:
					case XML:
					case XOR:
					case YEAR:
					case YEAR_MONTH:
					case ZEROFILL:
					case JSON_ARRAY:
					case JSON_ARRAY_APPEND:
					case JSON_ARRAY_INSERT:
					case JSON_CONTAINS:
					case JSON_CONTAINS_PATH:
					case JSON_DEPTH:
					case JSON_EXTRACT:
					case JSON_INSERT:
					case JSON_KEYS:
					case JSON_LENGTH:
					case JSON_MERGE:
					case JSON_MERGE_PATCH:
					case JSON_MERGE_PRESERVE:
					case JSON_OBJECT:
					case JSON_OVERLAPS:
					case JSON_PRETTY:
					case JSON_QUOTE:
					case JSON_REMOVE:
					case JSON_REPLACE:
					case JSON_SCHEMA_VALID:
					case JSON_SCHEMA_VALIDATION_REPORT:
					case JSON_SEARCH:
					case JSON_SET:
					case JSON_STORAGE_FREE:
					case JSON_STORAGE_SIZE:
					case JSON_TYPE:
					case JSON_UNQUOTE:
					case JSON_VALID:
					case ZONE:
					case FILESIZE_LITERAL:
					case SINGLE_QUOTED_TEXT:
					case DOUBLE_QUOTED_TEXT:
					case BQUOTA_STRING:
					case NCHAR_TEXT:
					case UNDERSCORE_CHARSET:
					case NUMBER_:
					case INT_NUM_:
					case FLOAT_NUM_:
					case DECIMAL_NUM_:
					case HEX_DIGIT_:
					case BIT_NUM_:
					case IDENTIFIER_:
					case IP_ADDRESS:
					case NOT_SUPPORT_:
						{
						setState(573);
						_la = _input.LA(1);
						if ( _la <= 0 || ((((_la) & ~0x3f) == 0 && ((1L << _la) & 481036468224L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					setState(576); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & -481036337154L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -1L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -1L) != 0) || ((((_la - 192)) & ~0x3f) == 0 && ((1L << (_la - 192)) & -1L) != 0) || ((((_la - 256)) & ~0x3f) == 0 && ((1L << (_la - 256)) & -1L) != 0) || ((((_la - 320)) & ~0x3f) == 0 && ((1L << (_la - 320)) & -1L) != 0) || ((((_la - 384)) & ~0x3f) == 0 && ((1L << (_la - 384)) & -1L) != 0) || ((((_la - 448)) & ~0x3f) == 0 && ((1L << (_la - 448)) & -1L) != 0) || ((((_la - 512)) & ~0x3f) == 0 && ((1L << (_la - 512)) & -1L) != 0) || ((((_la - 576)) & ~0x3f) == 0 && ((1L << (_la - 576)) & -1L) != 0) || ((((_la - 640)) & ~0x3f) == 0 && ((1L << (_la - 640)) & -1L) != 0) || ((((_la - 704)) & ~0x3f) == 0 && ((1L << (_la - 704)) & -1L) != 0) || ((((_la - 768)) & ~0x3f) == 0 && ((1L << (_la - 768)) & -1L) != 0) || ((((_la - 832)) & ~0x3f) == 0 && ((1L << (_la - 832)) & 4294967295L) != 0) );
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UserIdentifierOrTextContext extends ParserRuleContext {
		public List<TextOrIdentifierContext> textOrIdentifier() {
			return getRuleContexts(TextOrIdentifierContext.class);
		}
		public TextOrIdentifierContext textOrIdentifier(int i) {
			return getRuleContext(TextOrIdentifierContext.class,i);
		}
		public TerminalNode AT_() { return getToken(BaseRuleParser.AT_, 0); }
		public UserIdentifierOrTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userIdentifierOrText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterUserIdentifierOrText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitUserIdentifierOrText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitUserIdentifierOrText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserIdentifierOrTextContext userIdentifierOrText() throws RecognitionException {
		UserIdentifierOrTextContext _localctx = new UserIdentifierOrTextContext(_ctx, getState());
		enterRule(_localctx, 88, RULE_userIdentifierOrText);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(580);
			textOrIdentifier();
			setState(583);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,30,_ctx) ) {
			case 1:
				{
				setState(581);
				match(AT_);
				setState(582);
				textOrIdentifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UsernameContext extends ParserRuleContext {
		public UserIdentifierOrTextContext userIdentifierOrText() {
			return getRuleContext(UserIdentifierOrTextContext.class,0);
		}
		public TerminalNode CURRENT_USER() { return getToken(BaseRuleParser.CURRENT_USER, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public UsernameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_username; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterUsername(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitUsername(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitUsername(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UsernameContext username() throws RecognitionException {
		UsernameContext _localctx = new UsernameContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_username);
		int _la;
		try {
			setState(591);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GROUP_CONCAT:
			case CAST:
			case POSITION:
			case SUBSTRING:
			case SUBSTR:
			case EXTRACT:
			case TRIM:
			case LAST_DAY:
			case TRADITIONAL:
			case TREE:
			case MYSQL_MAIN:
			case MYSQL_ADMIN:
			case INSTANT:
			case INPLACE:
			case COPY:
			case UL_BINARY:
			case AUTOCOMMIT:
			case REDO_LOG:
			case ARCHIVE:
			case BLACKHOLE:
			case CSV:
			case FEDERATED:
			case INNODB:
			case MEMORY:
			case MRG_MYISAM:
			case MYISAM:
			case NDB:
			case NDBCLUSTER:
			case PERFORMANCE_SCHEMA:
			case TOKUDB:
			case ACCOUNT:
			case ACTION:
			case ACTIVE:
			case ADMIN:
			case AFTER:
			case AGAINST:
			case AGGREGATE:
			case ALGORITHM:
			case ALWAYS:
			case ANY:
			case ARRAY:
			case ASCII:
			case AT:
			case ATTRIBUTE:
			case AUTOEXTEND_SIZE:
			case AUTO_INCREMENT:
			case AVG:
			case BIT_XOR:
			case AVG_ROW_LENGTH:
			case BACKUP:
			case BEFORE:
			case BEGIN:
			case BINLOG:
			case BIT:
			case BLOCK:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BUCKETS:
			case BYTE:
			case CACHE:
			case CASCADED:
			case CATALOG_NAME:
			case CHAIN:
			case CHANGED:
			case CHANNEL:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLASS_ORIGIN:
			case CLIENT:
			case CLONE:
			case CLOSE:
			case COALESCE:
			case CODE:
			case COLLATION:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COLUMN_NAME:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETION:
			case COMPONENT:
			case COMPRESSED:
			case COMPRESSION:
			case CONCURRENT:
			case CONNECTION:
			case CONSISTENT:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONTAINS:
			case CONTEXT:
			case CPU:
			case CREATE:
			case CURRENT:
			case CURSOR_NAME:
			case DATA:
			case DATAFILE:
			case DATE:
			case DATETIME:
			case DAY:
			case DAY_MINUTE:
			case DEALLOCATE:
			case DEFAULT:
			case DEFAULT_AUTH:
			case DEFINER:
			case DEFINITION:
			case DELAY_KEY_WRITE:
			case DESCRIPTION:
			case DIAGNOSTICS:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DO:
			case DROP:
			case DUMPFILE:
			case DUPLICATE:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTION:
			case END:
			case ENDS:
			case ENFORCED:
			case ENGINE:
			case ENGINES:
			case ENGINE_ATTRIBUTE:
			case ENUM:
			case ERROR:
			case ERRORS:
			case ESCAPE:
			case EVENT:
			case EVENTS:
			case EVERY:
			case EXCHANGE:
			case EXCLUDE:
			case EXECUTE:
			case EXPANSION:
			case EXPIRE:
			case EXPORT:
			case EXTENDED:
			case EXTENT_SIZE:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FAULTS:
			case FILE:
			case FILE_BLOCK_SIZE:
			case FILTER:
			case FIRST:
			case FIXED:
			case FLUSH:
			case FOLLOWING:
			case FOLLOWS:
			case FORMAT:
			case FOUND:
			case FULL:
			case GENERAL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case GET_FORMAT:
			case GET_MASTER_PUBLIC_KEY:
			case GLOBAL:
			case GRANTS:
			case GROUPS:
			case GROUP_REPLICATION:
			case HANDLER:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HISTORY:
			case HOST:
			case HOSTS:
			case HOUR:
			case IDENTIFIED:
			case IGNORE_SERVER_IDS:
			case IMPORT:
			case INACTIVE:
			case INDEXES:
			case INITIAL_SIZE:
			case INSERT_METHOD:
			case INSTALL:
			case INSTANCE:
			case INVISIBLE:
			case INVOKER:
			case IO:
			case IPC:
			case ISOLATION:
			case ISSUER:
			case JSON:
			case JSON_VALUE:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LANGUAGE:
			case LAST:
			case LAST_VALUE:
			case LEAVES:
			case LESS:
			case LEVEL:
			case LINESTRING:
			case LIST:
			case LOCAL:
			case LOCKED:
			case LOCKS:
			case LOGFILE:
			case LOGS:
			case MASTER:
			case MASTER_AUTO_POSITION:
			case MASTER_COMPRESSION_ALGORITHM:
			case MASTER_CONNECT_RETRY:
			case MASTER_DELAY:
			case MASTER_HEARTBEAT_PERIOD:
			case MASTER_HOST:
			case MASTER_LOG_FILE:
			case MASTER_LOG_POS:
			case MASTER_PASSWORD:
			case MASTER_PORT:
			case MASTER_PUBLIC_KEY_PATH:
			case MASTER_RETRY_COUNT:
			case MASTER_SERVER_ID:
			case MASTER_SSL:
			case MASTER_SSL_CA:
			case MASTER_SSL_CAPATH:
			case MASTER_SSL_CERT:
			case MASTER_SSL_CIPHER:
			case MASTER_SSL_CRL:
			case MASTER_SSL_CRLPATH:
			case MASTER_SSL_KEY:
			case MASTER_TLS_CIPHERSUITES:
			case MASTER_TLS_VERSION:
			case MASTER_USER:
			case MASTER_ZSTD_COMPRESSION_LEVEL:
			case MAXVALUE:
			case MAX_CONNECTIONS_PER_HOUR:
			case MAX_QUERIES_PER_HOUR:
			case MAX_ROWS:
			case MAX_SIZE:
			case MAX_UPDATES_PER_HOUR:
			case MAX_USER_CONNECTIONS:
			case MEDIUM:
			case MEMBER:
			case MERGE:
			case MESSAGE_TEXT:
			case MICROSECOND:
			case MIGRATE:
			case MINUTE:
			case MIN_ROWS:
			case MODE:
			case MODIFY:
			case MONTH:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case MUTEX:
			case MYSQL_ERRNO:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NESTED:
			case NETWORK_NAMESPACE:
			case NEVER:
			case NEW:
			case NEXT:
			case NO:
			case NODEGROUP:
			case NONE:
			case NOWAIT:
			case NO_WAIT:
			case NULLS:
			case NUMBER:
			case NVARCHAR:
			case OFF:
			case OFFSET:
			case OJ:
			case OLD:
			case ONE:
			case ONLY:
			case OPEN:
			case OPTIONAL:
			case OPTIONS:
			case ORDINALITY:
			case ORGANIZATION:
			case OTHERS:
			case OWNER:
			case PACK_KEYS:
			case PAGE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_LOCK_TIME:
			case PATH:
			case PERSIST:
			case PERSIST_ONLY:
			case PHASE:
			case PLUGIN:
			case PLUGINS:
			case PLUGIN_DIR:
			case POINT:
			case POLYGON:
			case PORT:
			case PRECEDES:
			case PRECEDING:
			case PREPARE:
			case PRESERVE:
			case PREV:
			case PRIMARY:
			case PRIVILEGES:
			case PRIVILEGE_CHECKS_USER:
			case PROCESS:
			case PROCESSLIST:
			case PROFILE:
			case PROFILES:
			case PROXY:
			case QUARTER:
			case QUERY:
			case QUICK:
			case RANDOM:
			case RANK:
			case READ_ONLY:
			case REBUILD:
			case RECOVER:
			case REDO_BUFFER_SIZE:
			case REDUNDANT:
			case REFERENCE:
			case RELAY:
			case RELAYLOG:
			case RELAY_LOG_FILE:
			case RELAY_LOG_POS:
			case RELAY_THREAD:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPEATABLE:
			case REPLICATE_DO_DB:
			case REPLICATE_DO_TABLE:
			case REPLICATE_IGNORE_DB:
			case REPLICATE_IGNORE_TABLE:
			case REPLICATE_REWRITE_DB:
			case REPLICATE_WILD_DO_TABLE:
			case REPLICATE_WILD_IGNORE_TABLE:
			case REPLICATION:
			case REQUIRE_ROW_FORMAT:
			case RESET:
			case RESOURCE:
			case RESPECT:
			case RESTART:
			case RESTORE:
			case RESUME:
			case RETAIN:
			case RETURNED_SQLSTATE:
			case RETURNING:
			case RETURNS:
			case REUSE:
			case REVERSE:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROTATE:
			case ROUTINE:
			case ROW_COUNT:
			case ROW_FORMAT:
			case RTREE:
			case SAVEPOINT:
			case SCHEDULE:
			case SCHEMA_NAME:
			case SECOND:
			case SECONDARY:
			case SECONDARY_ENGINE:
			case SECONDARY_ENGINE_ATTRIBUTE:
			case SECONDARY_LOAD:
			case SECONDARY_UNLOAD:
			case SECURITY:
			case SERIAL:
			case SERIALIZABLE:
			case SERVER:
			case SESSION:
			case SHARE:
			case SHUTDOWN:
			case SIGNED:
			case SIMPLE:
			case SLAVE:
			case SLOW:
			case SNAPSHOT:
			case SOCKET:
			case SONAME:
			case SOUNDS:
			case SOURCE:
			case SQL_AFTER_GTIDS:
			case SQL_AFTER_MTS_GAPS:
			case SQL_BEFORE_GTIDS:
			case SQL_BUFFER_RESULT:
			case SQL_NO_CACHE:
			case SQL_THREAD:
			case SRID:
			case STACKED:
			case START:
			case STARTS:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STRING:
			case SUBCLASS_ORIGIN:
			case SUBJECT:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case SUPER:
			case SUSPEND:
			case SWAPS:
			case SWITCHES:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TABLESPACE:
			case TABLE_CHECKSUM:
			case TABLE_NAME:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case THAN:
			case THREAD_PRIORITY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMP_ADD:
			case TIMESTAMP_DIFF:
			case TLS:
			case TRANSACTION:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDEFINED:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case UNICODE:
			case UNINSTALL:
			case UNKNOWN:
			case UNTIL:
			case UPGRADE:
			case USER:
			case USER_RESOURCES:
			case USE_FRM:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case VALIDATION:
			case VALUE:
			case VARIABLES:
			case VCPU:
			case VIEW:
			case VISIBLE:
			case WAIT:
			case WARNINGS:
			case WEEK:
			case WEIGHT_STRING:
			case WITHOUT:
			case WORK:
			case WRAPPER:
			case X509:
			case XA:
			case XID:
			case XML:
			case YEAR:
			case YEAR_MONTH:
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
			case BQUOTA_STRING:
			case UNDERSCORE_CHARSET:
			case IDENTIFIER_:
			case IP_ADDRESS:
				enterOuterAlt(_localctx, 1);
				{
				setState(585);
				userIdentifierOrText();
				}
				break;
			case CURRENT_USER:
				enterOuterAlt(_localctx, 2);
				{
				setState(586);
				match(CURRENT_USER);
				setState(589);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(587);
					match(LP_);
					setState(588);
					match(RP_);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EventNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public EventNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_eventName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterEventName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitEventName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitEventName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventNameContext eventName() throws RecognitionException {
		EventNameContext _localctx = new EventNameContext(_ctx, getState());
		enterRule(_localctx, 92, RULE_eventName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(596);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				{
				setState(593);
				owner();
				setState(594);
				match(DOT_);
				}
				break;
			}
			setState(598);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ServerNameContext extends ParserRuleContext {
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public ServerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_serverName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterServerName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitServerName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitServerName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ServerNameContext serverName() throws RecognitionException {
		ServerNameContext _localctx = new ServerNameContext(_ctx, getState());
		enterRule(_localctx, 94, RULE_serverName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(600);
			textOrIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WrapperNameContext extends ParserRuleContext {
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public WrapperNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_wrapperName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterWrapperName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitWrapperName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitWrapperName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WrapperNameContext wrapperName() throws RecognitionException {
		WrapperNameContext _localctx = new WrapperNameContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_wrapperName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(602);
			textOrIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public FunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionNameContext functionName() throws RecognitionException {
		FunctionNameContext _localctx = new FunctionNameContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_functionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(607);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,34,_ctx) ) {
			case 1:
				{
				setState(604);
				owner();
				setState(605);
				match(DOT_);
				}
				break;
			}
			setState(609);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProcedureNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public ProcedureNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_procedureName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterProcedureName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitProcedureName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitProcedureName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProcedureNameContext procedureName() throws RecognitionException {
		ProcedureNameContext _localctx = new ProcedureNameContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_procedureName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(614);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				{
				setState(611);
				owner();
				setState(612);
				match(DOT_);
				}
				break;
			}
			setState(616);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ViewNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext owner() {
			return getRuleContext(OwnerContext.class,0);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public ViewNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterViewName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitViewName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitViewName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewNameContext viewName() throws RecognitionException {
		ViewNameContext _localctx = new ViewNameContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_viewName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(621);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,36,_ctx) ) {
			case 1:
				{
				setState(618);
				owner();
				setState(619);
				match(DOT_);
				}
				break;
			}
			setState(623);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OwnerContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OwnerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_owner; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOwner(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOwner(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOwner(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OwnerContext owner() throws RecognitionException {
		OwnerContext _localctx = new OwnerContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_owner);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(625);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AliasContext extends ParserRuleContext {
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAlias(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAlias(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(627);
			textOrIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(629);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableListContext extends ParserRuleContext {
		public List<TableNameContext> tableName() {
			return getRuleContexts(TableNameContext.class);
		}
		public TableNameContext tableName(int i) {
			return getRuleContext(TableNameContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public TableListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTableList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTableList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTableList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableListContext tableList() throws RecognitionException {
		TableListContext _localctx = new TableListContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_tableList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(631);
			tableName();
			setState(636);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(632);
				match(COMMA_);
				setState(633);
				tableName();
				}
				}
				setState(638);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ViewNamesContext extends ParserRuleContext {
		public List<ViewNameContext> viewName() {
			return getRuleContexts(ViewNameContext.class);
		}
		public ViewNameContext viewName(int i) {
			return getRuleContext(ViewNameContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public ViewNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_viewNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterViewNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitViewNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitViewNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ViewNamesContext viewNames() throws RecognitionException {
		ViewNamesContext _localctx = new ViewNamesContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_viewNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(639);
			viewName();
			setState(644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(640);
				match(COMMA_);
				setState(641);
				viewName();
				}
				}
				setState(646);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnNamesContext extends ParserRuleContext {
		public List<ColumnNameContext> columnName() {
			return getRuleContexts(ColumnNameContext.class);
		}
		public ColumnNameContext columnName(int i) {
			return getRuleContext(ColumnNameContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public ColumnNamesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnNames; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterColumnNames(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitColumnNames(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitColumnNames(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnNamesContext columnNames() throws RecognitionException {
		ColumnNamesContext _localctx = new ColumnNamesContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_columnNames);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(647);
			columnName();
			setState(652);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(648);
				match(COMMA_);
				setState(649);
				columnName();
				}
				}
				setState(654);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public GroupNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterGroupName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitGroupName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitGroupName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupNameContext groupName() throws RecognitionException {
		GroupNameContext _localctx = new GroupNameContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_groupName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(655);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RoutineNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RoutineNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_routineName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterRoutineName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitRoutineName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitRoutineName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoutineNameContext routineName() throws RecognitionException {
		RoutineNameContext _localctx = new RoutineNameContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_routineName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(657);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShardLibraryNameContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public ShardLibraryNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shardLibraryName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterShardLibraryName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitShardLibraryName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitShardLibraryName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShardLibraryNameContext shardLibraryName() throws RecognitionException {
		ShardLibraryNameContext _localctx = new ShardLibraryNameContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_shardLibraryName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(659);
			stringLiterals();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComponentNameContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public ComponentNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_componentName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterComponentName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitComponentName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitComponentName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComponentNameContext componentName() throws RecognitionException {
		ComponentNameContext _localctx = new ComponentNameContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_componentName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(661);
			string_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PluginNameContext extends ParserRuleContext {
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public PluginNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pluginName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPluginName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPluginName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPluginName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PluginNameContext pluginName() throws RecognitionException {
		PluginNameContext _localctx = new PluginNameContext(_ctx, getState());
		enterRule(_localctx, 124, RULE_pluginName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(663);
			textOrIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class HostnameContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public HostnameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hostname; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterHostname(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitHostname(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitHostname(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HostnameContext hostname() throws RecognitionException {
		HostnameContext _localctx = new HostnameContext(_ctx, getState());
		enterRule(_localctx, 126, RULE_hostname);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(665);
			string_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PortContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public PortContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_port; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPort(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPort(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPort(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PortContext port() throws RecognitionException {
		PortContext _localctx = new PortContext(_ctx, getState());
		enterRule(_localctx, 128, RULE_port);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(667);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloneInstanceContext extends ParserRuleContext {
		public UsernameContext username() {
			return getRuleContext(UsernameContext.class,0);
		}
		public TerminalNode AT_() { return getToken(BaseRuleParser.AT_, 0); }
		public HostnameContext hostname() {
			return getRuleContext(HostnameContext.class,0);
		}
		public TerminalNode COLON_() { return getToken(BaseRuleParser.COLON_, 0); }
		public PortContext port() {
			return getRuleContext(PortContext.class,0);
		}
		public CloneInstanceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cloneInstance; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCloneInstance(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCloneInstance(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCloneInstance(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloneInstanceContext cloneInstance() throws RecognitionException {
		CloneInstanceContext _localctx = new CloneInstanceContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_cloneInstance);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			username();
			setState(670);
			match(AT_);
			setState(671);
			hostname();
			setState(672);
			match(COLON_);
			setState(673);
			port();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CloneDirContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public CloneDirContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cloneDir; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCloneDir(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCloneDir(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCloneDir(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CloneDirContext cloneDir() throws RecognitionException {
		CloneDirContext _localctx = new CloneDirContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_cloneDir);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(675);
			string_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChannelNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public ChannelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterChannelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitChannelName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitChannelName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelNameContext channelName() throws RecognitionException {
		ChannelNameContext _localctx = new ChannelNameContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_channelName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(677);
			identifier();
			setState(680);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(678);
				match(DOT_);
				setState(679);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LogNameContext extends ParserRuleContext {
		public StringLiteralsContext stringLiterals() {
			return getRuleContext(StringLiteralsContext.class,0);
		}
		public LogNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLogName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLogName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLogName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LogNameContext logName() throws RecognitionException {
		LogNameContext _localctx = new LogNameContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_logName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(682);
			stringLiterals();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RoleNameContext extends ParserRuleContext {
		public RoleIdentifierOrTextContext roleIdentifierOrText() {
			return getRuleContext(RoleIdentifierOrTextContext.class,0);
		}
		public TerminalNode AT_() { return getToken(BaseRuleParser.AT_, 0); }
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public RoleNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterRoleName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitRoleName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitRoleName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleNameContext roleName() throws RecognitionException {
		RoleNameContext _localctx = new RoleNameContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_roleName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(684);
			roleIdentifierOrText();
			setState(687);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AT_) {
				{
				setState(685);
				match(AT_);
				setState(686);
				textOrIdentifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RoleIdentifierOrTextContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public RoleIdentifierOrTextContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_roleIdentifierOrText; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterRoleIdentifierOrText(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitRoleIdentifierOrText(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitRoleIdentifierOrText(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RoleIdentifierOrTextContext roleIdentifierOrText() throws RecognitionException {
		RoleIdentifierOrTextContext _localctx = new RoleIdentifierOrTextContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_roleIdentifierOrText);
		try {
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(689);
				identifier();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(690);
				string_();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class EngineRefContext extends ParserRuleContext {
		public TextOrIdentifierContext textOrIdentifier() {
			return getRuleContext(TextOrIdentifierContext.class,0);
		}
		public EngineRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_engineRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterEngineRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitEngineRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitEngineRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EngineRefContext engineRef() throws RecognitionException {
		EngineRefContext _localctx = new EngineRefContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_engineRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(693);
			textOrIdentifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerNameContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public TerminalNode DOT_() { return getToken(BaseRuleParser.DOT_, 0); }
		public TriggerNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTriggerName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTriggerName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTriggerName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerNameContext triggerName() throws RecognitionException {
		TriggerNameContext _localctx = new TriggerNameContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_triggerName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(695);
			identifier();
			setState(698);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DOT_) {
				{
				setState(696);
				match(DOT_);
				setState(697);
				identifier();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerTimeContext extends ParserRuleContext {
		public TerminalNode BEFORE() { return getToken(BaseRuleParser.BEFORE, 0); }
		public TerminalNode AFTER() { return getToken(BaseRuleParser.AFTER, 0); }
		public TriggerTimeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerTime; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTriggerTime(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTriggerTime(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTriggerTime(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerTimeContext triggerTime() throws RecognitionException {
		TriggerTimeContext _localctx = new TriggerTimeContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_triggerTime);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(700);
			_la = _input.LA(1);
			if ( !(_la==AFTER || _la==BEFORE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TableOrTablesContext extends ParserRuleContext {
		public TerminalNode TABLE() { return getToken(BaseRuleParser.TABLE, 0); }
		public TerminalNode TABLES() { return getToken(BaseRuleParser.TABLES, 0); }
		public TableOrTablesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_tableOrTables; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTableOrTables(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTableOrTables(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTableOrTables(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TableOrTablesContext tableOrTables() throws RecognitionException {
		TableOrTablesContext _localctx = new TableOrTablesContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_tableOrTables);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(702);
			_la = _input.LA(1);
			if ( !(_la==TABLE || _la==TABLES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UserOrRoleContext extends ParserRuleContext {
		public UsernameContext username() {
			return getRuleContext(UsernameContext.class,0);
		}
		public RoleNameContext roleName() {
			return getRuleContext(RoleNameContext.class,0);
		}
		public UserOrRoleContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_userOrRole; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterUserOrRole(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitUserOrRole(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitUserOrRole(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UserOrRoleContext userOrRole() throws RecognitionException {
		UserOrRoleContext _localctx = new UserOrRoleContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_userOrRole);
		try {
			setState(706);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,44,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(704);
				username();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(705);
				roleName();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PartitionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public PartitionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partitionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPartitionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPartitionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPartitionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionNameContext partitionName() throws RecognitionException {
		PartitionNameContext _localctx = new PartitionNameContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_partitionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(708);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IdentifierListContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public IdentifierListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_identifierList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIdentifierList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIdentifierList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIdentifierList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdentifierListContext identifierList() throws RecognitionException {
		IdentifierListContext _localctx = new IdentifierListContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_identifierList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(710);
			identifier();
			setState(715);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(711);
				match(COMMA_);
				setState(712);
				identifier();
				}
				}
				setState(717);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AllOrPartitionNameListContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(BaseRuleParser.ALL, 0); }
		public IdentifierListContext identifierList() {
			return getRuleContext(IdentifierListContext.class,0);
		}
		public AllOrPartitionNameListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allOrPartitionNameList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAllOrPartitionNameList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAllOrPartitionNameList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAllOrPartitionNameList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AllOrPartitionNameListContext allOrPartitionNameList() throws RecognitionException {
		AllOrPartitionNameListContext _localctx = new AllOrPartitionNameListContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_allOrPartitionNameList);
		try {
			setState(720);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(718);
				match(ALL);
				}
				break;
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GROUP_CONCAT:
			case CAST:
			case POSITION:
			case SUBSTRING:
			case SUBSTR:
			case EXTRACT:
			case TRIM:
			case LAST_DAY:
			case TRADITIONAL:
			case TREE:
			case MYSQL_MAIN:
			case MYSQL_ADMIN:
			case INSTANT:
			case INPLACE:
			case COPY:
			case UL_BINARY:
			case AUTOCOMMIT:
			case REDO_LOG:
			case ARCHIVE:
			case BLACKHOLE:
			case CSV:
			case FEDERATED:
			case INNODB:
			case MEMORY:
			case MRG_MYISAM:
			case MYISAM:
			case NDB:
			case NDBCLUSTER:
			case PERFORMANCE_SCHEMA:
			case TOKUDB:
			case ACCOUNT:
			case ACTION:
			case ACTIVE:
			case ADMIN:
			case AFTER:
			case AGAINST:
			case AGGREGATE:
			case ALGORITHM:
			case ALWAYS:
			case ANY:
			case ARRAY:
			case ASCII:
			case AT:
			case ATTRIBUTE:
			case AUTOEXTEND_SIZE:
			case AUTO_INCREMENT:
			case AVG:
			case BIT_XOR:
			case AVG_ROW_LENGTH:
			case BACKUP:
			case BEFORE:
			case BEGIN:
			case BINLOG:
			case BIT:
			case BLOCK:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BUCKETS:
			case BYTE:
			case CACHE:
			case CASCADED:
			case CATALOG_NAME:
			case CHAIN:
			case CHANGED:
			case CHANNEL:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLASS_ORIGIN:
			case CLIENT:
			case CLONE:
			case CLOSE:
			case COALESCE:
			case CODE:
			case COLLATION:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COLUMN_NAME:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETION:
			case COMPONENT:
			case COMPRESSED:
			case COMPRESSION:
			case CONCURRENT:
			case CONNECTION:
			case CONSISTENT:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONTAINS:
			case CONTEXT:
			case CPU:
			case CREATE:
			case CURRENT:
			case CURSOR_NAME:
			case DATA:
			case DATAFILE:
			case DATE:
			case DATETIME:
			case DAY:
			case DAY_MINUTE:
			case DEALLOCATE:
			case DEFAULT:
			case DEFAULT_AUTH:
			case DEFINER:
			case DEFINITION:
			case DELAY_KEY_WRITE:
			case DESCRIPTION:
			case DIAGNOSTICS:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DO:
			case DROP:
			case DUMPFILE:
			case DUPLICATE:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTION:
			case END:
			case ENDS:
			case ENFORCED:
			case ENGINE:
			case ENGINES:
			case ENGINE_ATTRIBUTE:
			case ENUM:
			case ERROR:
			case ERRORS:
			case ESCAPE:
			case EVENT:
			case EVENTS:
			case EVERY:
			case EXCHANGE:
			case EXCLUDE:
			case EXECUTE:
			case EXPANSION:
			case EXPIRE:
			case EXPORT:
			case EXTENDED:
			case EXTENT_SIZE:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FAULTS:
			case FILE:
			case FILE_BLOCK_SIZE:
			case FILTER:
			case FIRST:
			case FIXED:
			case FLUSH:
			case FOLLOWING:
			case FOLLOWS:
			case FORMAT:
			case FOUND:
			case FULL:
			case GENERAL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case GET_FORMAT:
			case GET_MASTER_PUBLIC_KEY:
			case GLOBAL:
			case GRANTS:
			case GROUPS:
			case GROUP_REPLICATION:
			case HANDLER:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HISTORY:
			case HOST:
			case HOSTS:
			case HOUR:
			case IDENTIFIED:
			case IGNORE_SERVER_IDS:
			case IMPORT:
			case INACTIVE:
			case INDEXES:
			case INITIAL_SIZE:
			case INSERT_METHOD:
			case INSTALL:
			case INSTANCE:
			case INVISIBLE:
			case INVOKER:
			case IO:
			case IPC:
			case ISOLATION:
			case ISSUER:
			case JSON:
			case JSON_VALUE:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LANGUAGE:
			case LAST:
			case LAST_VALUE:
			case LEAVES:
			case LESS:
			case LEVEL:
			case LINESTRING:
			case LIST:
			case LOCAL:
			case LOCKED:
			case LOCKS:
			case LOGFILE:
			case LOGS:
			case MASTER:
			case MASTER_AUTO_POSITION:
			case MASTER_COMPRESSION_ALGORITHM:
			case MASTER_CONNECT_RETRY:
			case MASTER_DELAY:
			case MASTER_HEARTBEAT_PERIOD:
			case MASTER_HOST:
			case MASTER_LOG_FILE:
			case MASTER_LOG_POS:
			case MASTER_PASSWORD:
			case MASTER_PORT:
			case MASTER_PUBLIC_KEY_PATH:
			case MASTER_RETRY_COUNT:
			case MASTER_SERVER_ID:
			case MASTER_SSL:
			case MASTER_SSL_CA:
			case MASTER_SSL_CAPATH:
			case MASTER_SSL_CERT:
			case MASTER_SSL_CIPHER:
			case MASTER_SSL_CRL:
			case MASTER_SSL_CRLPATH:
			case MASTER_SSL_KEY:
			case MASTER_TLS_CIPHERSUITES:
			case MASTER_TLS_VERSION:
			case MASTER_USER:
			case MASTER_ZSTD_COMPRESSION_LEVEL:
			case MAXVALUE:
			case MAX_CONNECTIONS_PER_HOUR:
			case MAX_QUERIES_PER_HOUR:
			case MAX_ROWS:
			case MAX_SIZE:
			case MAX_UPDATES_PER_HOUR:
			case MAX_USER_CONNECTIONS:
			case MEDIUM:
			case MEMBER:
			case MERGE:
			case MESSAGE_TEXT:
			case MICROSECOND:
			case MIGRATE:
			case MINUTE:
			case MIN_ROWS:
			case MODE:
			case MODIFY:
			case MONTH:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case MUTEX:
			case MYSQL_ERRNO:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NESTED:
			case NETWORK_NAMESPACE:
			case NEVER:
			case NEW:
			case NEXT:
			case NO:
			case NODEGROUP:
			case NONE:
			case NOWAIT:
			case NO_WAIT:
			case NULLS:
			case NUMBER:
			case NVARCHAR:
			case OFF:
			case OFFSET:
			case OJ:
			case OLD:
			case ONE:
			case ONLY:
			case OPEN:
			case OPTIONAL:
			case OPTIONS:
			case ORDINALITY:
			case ORGANIZATION:
			case OTHERS:
			case OWNER:
			case PACK_KEYS:
			case PAGE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_LOCK_TIME:
			case PATH:
			case PERSIST:
			case PERSIST_ONLY:
			case PHASE:
			case PLUGIN:
			case PLUGINS:
			case PLUGIN_DIR:
			case POINT:
			case POLYGON:
			case PORT:
			case PRECEDES:
			case PRECEDING:
			case PREPARE:
			case PRESERVE:
			case PREV:
			case PRIMARY:
			case PRIVILEGES:
			case PRIVILEGE_CHECKS_USER:
			case PROCESS:
			case PROCESSLIST:
			case PROFILE:
			case PROFILES:
			case PROXY:
			case QUARTER:
			case QUERY:
			case QUICK:
			case RANDOM:
			case RANK:
			case READ_ONLY:
			case REBUILD:
			case RECOVER:
			case REDO_BUFFER_SIZE:
			case REDUNDANT:
			case REFERENCE:
			case RELAY:
			case RELAYLOG:
			case RELAY_LOG_FILE:
			case RELAY_LOG_POS:
			case RELAY_THREAD:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPEATABLE:
			case REPLICATE_DO_DB:
			case REPLICATE_DO_TABLE:
			case REPLICATE_IGNORE_DB:
			case REPLICATE_IGNORE_TABLE:
			case REPLICATE_REWRITE_DB:
			case REPLICATE_WILD_DO_TABLE:
			case REPLICATE_WILD_IGNORE_TABLE:
			case REPLICATION:
			case REQUIRE_ROW_FORMAT:
			case RESET:
			case RESOURCE:
			case RESPECT:
			case RESTART:
			case RESTORE:
			case RESUME:
			case RETAIN:
			case RETURNED_SQLSTATE:
			case RETURNING:
			case RETURNS:
			case REUSE:
			case REVERSE:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROTATE:
			case ROUTINE:
			case ROW_COUNT:
			case ROW_FORMAT:
			case RTREE:
			case SAVEPOINT:
			case SCHEDULE:
			case SCHEMA_NAME:
			case SECOND:
			case SECONDARY:
			case SECONDARY_ENGINE:
			case SECONDARY_ENGINE_ATTRIBUTE:
			case SECONDARY_LOAD:
			case SECONDARY_UNLOAD:
			case SECURITY:
			case SERIAL:
			case SERIALIZABLE:
			case SERVER:
			case SESSION:
			case SHARE:
			case SHUTDOWN:
			case SIGNED:
			case SIMPLE:
			case SLAVE:
			case SLOW:
			case SNAPSHOT:
			case SOCKET:
			case SONAME:
			case SOUNDS:
			case SOURCE:
			case SQL_AFTER_GTIDS:
			case SQL_AFTER_MTS_GAPS:
			case SQL_BEFORE_GTIDS:
			case SQL_BUFFER_RESULT:
			case SQL_NO_CACHE:
			case SQL_THREAD:
			case SRID:
			case STACKED:
			case START:
			case STARTS:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STRING:
			case SUBCLASS_ORIGIN:
			case SUBJECT:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case SUPER:
			case SUSPEND:
			case SWAPS:
			case SWITCHES:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TABLESPACE:
			case TABLE_CHECKSUM:
			case TABLE_NAME:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case THAN:
			case THREAD_PRIORITY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMP_ADD:
			case TIMESTAMP_DIFF:
			case TLS:
			case TRANSACTION:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDEFINED:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case UNICODE:
			case UNINSTALL:
			case UNKNOWN:
			case UNTIL:
			case UPGRADE:
			case USER:
			case USER_RESOURCES:
			case USE_FRM:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case VALIDATION:
			case VALUE:
			case VARIABLES:
			case VCPU:
			case VIEW:
			case VISIBLE:
			case WAIT:
			case WARNINGS:
			case WEEK:
			case WEIGHT_STRING:
			case WITHOUT:
			case WORK:
			case WRAPPER:
			case X509:
			case XA:
			case XID:
			case XML:
			case YEAR:
			case YEAR_MONTH:
			case DOUBLE_QUOTED_TEXT:
			case BQUOTA_STRING:
			case UNDERSCORE_CHARSET:
			case IDENTIFIER_:
				enterOuterAlt(_localctx, 2);
				{
				setState(719);
				identifierList();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerEventContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(BaseRuleParser.INSERT, 0); }
		public TerminalNode UPDATE() { return getToken(BaseRuleParser.UPDATE, 0); }
		public TerminalNode DELETE() { return getToken(BaseRuleParser.DELETE, 0); }
		public TriggerEventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerEvent; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTriggerEvent(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTriggerEvent(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTriggerEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerEventContext triggerEvent() throws RecognitionException {
		TriggerEventContext _localctx = new TriggerEventContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_triggerEvent);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(722);
			_la = _input.LA(1);
			if ( !(_la==DELETE || _la==INSERT || _la==UPDATE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TriggerOrderContext extends ParserRuleContext {
		public TriggerNameContext triggerName() {
			return getRuleContext(TriggerNameContext.class,0);
		}
		public TerminalNode FOLLOWS() { return getToken(BaseRuleParser.FOLLOWS, 0); }
		public TerminalNode PRECEDES() { return getToken(BaseRuleParser.PRECEDES, 0); }
		public TriggerOrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_triggerOrder; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTriggerOrder(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTriggerOrder(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTriggerOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TriggerOrderContext triggerOrder() throws RecognitionException {
		TriggerOrderContext _localctx = new TriggerOrderContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_triggerOrder);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(724);
			_la = _input.LA(1);
			if ( !(_la==FOLLOWS || _la==PRECEDES) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(725);
			triggerName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExprContext extends ParserRuleContext {
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public NotOperatorContext notOperator() {
			return getRuleContext(NotOperatorContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public AndOperatorContext andOperator() {
			return getRuleContext(AndOperatorContext.class,0);
		}
		public OrOperatorContext orOperator() {
			return getRuleContext(OrOperatorContext.class,0);
		}
		public TerminalNode XOR() { return getToken(BaseRuleParser.XOR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 162;
		enterRecursionRule(_localctx, 162, RULE_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(732);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,47,_ctx) ) {
			case 1:
				{
				setState(728);
				booleanPrimary(0);
				}
				break;
			case 2:
				{
				setState(729);
				notOperator();
				setState(730);
				expr(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(747);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(745);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,48,_ctx) ) {
					case 1:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(734);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(735);
						andOperator();
						setState(736);
						expr(5);
						}
						break;
					case 2:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(738);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(739);
						orOperator();
						setState(740);
						expr(4);
						}
						break;
					case 3:
						{
						_localctx = new ExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(742);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(743);
						match(XOR);
						setState(744);
						expr(3);
						}
						break;
					}
					} 
				}
				setState(749);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,49,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AndOperatorContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(BaseRuleParser.AND, 0); }
		public TerminalNode AND_() { return getToken(BaseRuleParser.AND_, 0); }
		public AndOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_andOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAndOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAndOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAndOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AndOperatorContext andOperator() throws RecognitionException {
		AndOperatorContext _localctx = new AndOperatorContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_andOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(750);
			_la = _input.LA(1);
			if ( !(_la==AND_ || _la==AND) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrOperatorContext extends ParserRuleContext {
		public TerminalNode OR() { return getToken(BaseRuleParser.OR, 0); }
		public TerminalNode OR_() { return getToken(BaseRuleParser.OR_, 0); }
		public OrOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOrOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOrOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOrOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrOperatorContext orOperator() throws RecognitionException {
		OrOperatorContext _localctx = new OrOperatorContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_orOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(752);
			_la = _input.LA(1);
			if ( !(_la==OR_ || _la==OR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NotOperatorContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(BaseRuleParser.NOT, 0); }
		public TerminalNode NOT_() { return getToken(BaseRuleParser.NOT_, 0); }
		public NotOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_notOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNotOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNotOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNotOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NotOperatorContext notOperator() throws RecognitionException {
		NotOperatorContext _localctx = new NotOperatorContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_notOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_la = _input.LA(1);
			if ( !(_la==NOT_ || _la==NOT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BooleanPrimaryContext extends ParserRuleContext {
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public BooleanPrimaryContext booleanPrimary() {
			return getRuleContext(BooleanPrimaryContext.class,0);
		}
		public TerminalNode IS() { return getToken(BaseRuleParser.IS, 0); }
		public TerminalNode TRUE() { return getToken(BaseRuleParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(BaseRuleParser.FALSE, 0); }
		public TerminalNode UNKNOWN() { return getToken(BaseRuleParser.UNKNOWN, 0); }
		public TerminalNode NULL() { return getToken(BaseRuleParser.NULL, 0); }
		public TerminalNode NOT() { return getToken(BaseRuleParser.NOT, 0); }
		public TerminalNode SAFE_EQ_() { return getToken(BaseRuleParser.SAFE_EQ_, 0); }
		public TerminalNode MEMBER() { return getToken(BaseRuleParser.MEMBER, 0); }
		public TerminalNode OF() { return getToken(BaseRuleParser.OF, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ComparisonOperatorContext comparisonOperator() {
			return getRuleContext(ComparisonOperatorContext.class,0);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode ALL() { return getToken(BaseRuleParser.ALL, 0); }
		public TerminalNode ANY() { return getToken(BaseRuleParser.ANY, 0); }
		public AssignmentOperatorContext assignmentOperator() {
			return getRuleContext(AssignmentOperatorContext.class,0);
		}
		public BooleanPrimaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_booleanPrimary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterBooleanPrimary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitBooleanPrimary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitBooleanPrimary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BooleanPrimaryContext booleanPrimary() throws RecognitionException {
		return booleanPrimary(0);
	}

	private BooleanPrimaryContext booleanPrimary(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BooleanPrimaryContext _localctx = new BooleanPrimaryContext(_ctx, _parentState);
		BooleanPrimaryContext _prevctx = _localctx;
		int _startState = 170;
		enterRecursionRule(_localctx, 170, RULE_booleanPrimary, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(757);
			predicate();
			}
			_ctx.stop = _input.LT(-1);
			setState(790);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(788);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(759);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(760);
						match(IS);
						setState(762);
						_errHandler.sync(this);
						_la = _input.LA(1);
						if (_la==NOT) {
							{
							setState(761);
							match(NOT);
							}
						}

						setState(764);
						_la = _input.LA(1);
						if ( !(_la==FALSE || _la==NULL || _la==TRUE || _la==UNKNOWN) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						}
						break;
					case 2:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(765);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(766);
						match(SAFE_EQ_);
						setState(767);
						predicate();
						}
						break;
					case 3:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(768);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(769);
						match(MEMBER);
						setState(770);
						match(OF);
						setState(771);
						match(LP_);
						{
						setState(772);
						expr(0);
						}
						setState(773);
						match(RP_);
						}
						break;
					case 4:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(775);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(776);
						comparisonOperator();
						setState(777);
						predicate();
						}
						break;
					case 5:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(779);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(780);
						comparisonOperator();
						setState(781);
						_la = _input.LA(1);
						if ( !(_la==ALL || _la==ANY) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(782);
						subquery();
						}
						break;
					case 6:
						{
						_localctx = new BooleanPrimaryContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_booleanPrimary);
						setState(784);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(785);
						assignmentOperator();
						setState(786);
						predicate();
						}
						break;
					}
					} 
				}
				setState(792);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AssignmentOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(BaseRuleParser.EQ_, 0); }
		public TerminalNode ASSIGNMENT_() { return getToken(BaseRuleParser.ASSIGNMENT_, 0); }
		public AssignmentOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_assignmentOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAssignmentOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAssignmentOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAssignmentOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AssignmentOperatorContext assignmentOperator() throws RecognitionException {
		AssignmentOperatorContext _localctx = new AssignmentOperatorContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_assignmentOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(793);
			_la = _input.LA(1);
			if ( !(_la==EQ_ || _la==ASSIGNMENT_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonOperatorContext extends ParserRuleContext {
		public TerminalNode EQ_() { return getToken(BaseRuleParser.EQ_, 0); }
		public TerminalNode GTE_() { return getToken(BaseRuleParser.GTE_, 0); }
		public TerminalNode GT_() { return getToken(BaseRuleParser.GT_, 0); }
		public TerminalNode LTE_() { return getToken(BaseRuleParser.LTE_, 0); }
		public TerminalNode LT_() { return getToken(BaseRuleParser.LT_, 0); }
		public TerminalNode NEQ_() { return getToken(BaseRuleParser.NEQ_, 0); }
		public ComparisonOperatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparisonOperator; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterComparisonOperator(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitComparisonOperator(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitComparisonOperator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonOperatorContext comparisonOperator() throws RecognitionException {
		ComparisonOperatorContext _localctx = new ComparisonOperatorContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_comparisonOperator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(795);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 264241152L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PredicateContext extends ParserRuleContext {
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(BaseRuleParser.IN, 0); }
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode NOT() { return getToken(BaseRuleParser.NOT, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public TerminalNode BETWEEN() { return getToken(BaseRuleParser.BETWEEN, 0); }
		public TerminalNode AND() { return getToken(BaseRuleParser.AND, 0); }
		public PredicateContext predicate() {
			return getRuleContext(PredicateContext.class,0);
		}
		public TerminalNode SOUNDS() { return getToken(BaseRuleParser.SOUNDS, 0); }
		public TerminalNode LIKE() { return getToken(BaseRuleParser.LIKE, 0); }
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode ESCAPE() { return getToken(BaseRuleParser.ESCAPE, 0); }
		public TerminalNode REGEXP() { return getToken(BaseRuleParser.REGEXP, 0); }
		public TerminalNode RLIKE() { return getToken(BaseRuleParser.RLIKE, 0); }
		public PredicateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_predicate; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPredicate(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPredicate(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPredicate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PredicateContext predicate() throws RecognitionException {
		PredicateContext _localctx = new PredicateContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_predicate);
		int _la;
		try {
			setState(852);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,60,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(797);
				bitExpr(0);
				setState(799);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(798);
					match(NOT);
					}
				}

				setState(801);
				match(IN);
				setState(802);
				subquery();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(804);
				bitExpr(0);
				setState(806);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(805);
					match(NOT);
					}
				}

				setState(808);
				match(IN);
				setState(809);
				match(LP_);
				setState(810);
				expr(0);
				setState(815);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(811);
					match(COMMA_);
					setState(812);
					expr(0);
					}
					}
					setState(817);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(818);
				match(RP_);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(820);
				bitExpr(0);
				setState(822);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(821);
					match(NOT);
					}
				}

				setState(824);
				match(BETWEEN);
				setState(825);
				bitExpr(0);
				setState(826);
				match(AND);
				setState(827);
				predicate();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(829);
				bitExpr(0);
				setState(830);
				match(SOUNDS);
				setState(831);
				match(LIKE);
				setState(832);
				bitExpr(0);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(834);
				bitExpr(0);
				setState(836);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(835);
					match(NOT);
					}
				}

				setState(838);
				match(LIKE);
				setState(839);
				simpleExpr(0);
				setState(842);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,58,_ctx) ) {
				case 1:
					{
					setState(840);
					match(ESCAPE);
					setState(841);
					simpleExpr(0);
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(844);
				bitExpr(0);
				setState(846);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NOT) {
					{
					setState(845);
					match(NOT);
					}
				}

				setState(848);
				_la = _input.LA(1);
				if ( !(_la==REGEXP || _la==RLIKE) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(849);
				bitExpr(0);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(851);
				bitExpr(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BitExprContext extends ParserRuleContext {
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public List<BitExprContext> bitExpr() {
			return getRuleContexts(BitExprContext.class);
		}
		public BitExprContext bitExpr(int i) {
			return getRuleContext(BitExprContext.class,i);
		}
		public TerminalNode VERTICAL_BAR_() { return getToken(BaseRuleParser.VERTICAL_BAR_, 0); }
		public TerminalNode AMPERSAND_() { return getToken(BaseRuleParser.AMPERSAND_, 0); }
		public TerminalNode SIGNED_LEFT_SHIFT_() { return getToken(BaseRuleParser.SIGNED_LEFT_SHIFT_, 0); }
		public TerminalNode SIGNED_RIGHT_SHIFT_() { return getToken(BaseRuleParser.SIGNED_RIGHT_SHIFT_, 0); }
		public TerminalNode PLUS_() { return getToken(BaseRuleParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(BaseRuleParser.MINUS_, 0); }
		public TerminalNode ASTERISK_() { return getToken(BaseRuleParser.ASTERISK_, 0); }
		public TerminalNode SLASH_() { return getToken(BaseRuleParser.SLASH_, 0); }
		public TerminalNode DIV() { return getToken(BaseRuleParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(BaseRuleParser.MOD, 0); }
		public TerminalNode MOD_() { return getToken(BaseRuleParser.MOD_, 0); }
		public TerminalNode CARET_() { return getToken(BaseRuleParser.CARET_, 0); }
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public BitExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bitExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterBitExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitBitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitBitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BitExprContext bitExpr() throws RecognitionException {
		return bitExpr(0);
	}

	private BitExprContext bitExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		BitExprContext _localctx = new BitExprContext(_ctx, _parentState);
		BitExprContext _prevctx = _localctx;
		int _startState = 178;
		enterRecursionRule(_localctx, 178, RULE_bitExpr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(855);
			simpleExpr(0);
			}
			_ctx.stop = _input.LT(-1);
			setState(901);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(899);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,61,_ctx) ) {
					case 1:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(857);
						if (!(precpred(_ctx, 15))) throw new FailedPredicateException(this, "precpred(_ctx, 15)");
						setState(858);
						match(VERTICAL_BAR_);
						setState(859);
						bitExpr(16);
						}
						break;
					case 2:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(860);
						if (!(precpred(_ctx, 14))) throw new FailedPredicateException(this, "precpred(_ctx, 14)");
						setState(861);
						match(AMPERSAND_);
						setState(862);
						bitExpr(15);
						}
						break;
					case 3:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(863);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(864);
						match(SIGNED_LEFT_SHIFT_);
						setState(865);
						bitExpr(14);
						}
						break;
					case 4:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(866);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(867);
						match(SIGNED_RIGHT_SHIFT_);
						setState(868);
						bitExpr(13);
						}
						break;
					case 5:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(869);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(870);
						match(PLUS_);
						setState(871);
						bitExpr(12);
						}
						break;
					case 6:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(872);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(873);
						match(MINUS_);
						setState(874);
						bitExpr(11);
						}
						break;
					case 7:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(875);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(876);
						match(ASTERISK_);
						setState(877);
						bitExpr(10);
						}
						break;
					case 8:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(878);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(879);
						match(SLASH_);
						setState(880);
						bitExpr(9);
						}
						break;
					case 9:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(881);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(882);
						match(DIV);
						setState(883);
						bitExpr(8);
						}
						break;
					case 10:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(884);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(885);
						match(MOD);
						setState(886);
						bitExpr(7);
						}
						break;
					case 11:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(887);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(888);
						match(MOD_);
						setState(889);
						bitExpr(6);
						}
						break;
					case 12:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(890);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(891);
						match(CARET_);
						setState(892);
						bitExpr(5);
						}
						break;
					case 13:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(893);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(894);
						match(PLUS_);
						setState(895);
						intervalExpression();
						}
						break;
					case 14:
						{
						_localctx = new BitExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bitExpr);
						setState(896);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(897);
						match(MINUS_);
						setState(898);
						intervalExpression();
						}
						break;
					}
					} 
				}
				setState(903);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,62,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SimpleExprContext extends ParserRuleContext {
		public FunctionCallContext functionCall() {
			return getRuleContext(FunctionCallContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public ColumnRefContext columnRef() {
			return getRuleContext(ColumnRefContext.class,0);
		}
		public VariableContext variable() {
			return getRuleContext(VariableContext.class,0);
		}
		public List<SimpleExprContext> simpleExpr() {
			return getRuleContexts(SimpleExprContext.class);
		}
		public SimpleExprContext simpleExpr(int i) {
			return getRuleContext(SimpleExprContext.class,i);
		}
		public TerminalNode PLUS_() { return getToken(BaseRuleParser.PLUS_, 0); }
		public TerminalNode MINUS_() { return getToken(BaseRuleParser.MINUS_, 0); }
		public TerminalNode TILDE_() { return getToken(BaseRuleParser.TILDE_, 0); }
		public NotOperatorContext notOperator() {
			return getRuleContext(NotOperatorContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(BaseRuleParser.BINARY, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TerminalNode ROW() { return getToken(BaseRuleParser.ROW, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public SubqueryContext subquery() {
			return getRuleContext(SubqueryContext.class,0);
		}
		public TerminalNode EXISTS() { return getToken(BaseRuleParser.EXISTS, 0); }
		public TerminalNode LBE_() { return getToken(BaseRuleParser.LBE_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode RBE_() { return getToken(BaseRuleParser.RBE_, 0); }
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public TerminalNode JSON_SEPARATOR() { return getToken(BaseRuleParser.JSON_SEPARATOR, 0); }
		public TerminalNode JSON_UNQUOTED_SEPARATOR() { return getToken(BaseRuleParser.JSON_UNQUOTED_SEPARATOR, 0); }
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode RETURNING() { return getToken(BaseRuleParser.RETURNING, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public OnEmptyErrorContext onEmptyError() {
			return getRuleContext(OnEmptyErrorContext.class,0);
		}
		public MatchExpressionContext matchExpression() {
			return getRuleContext(MatchExpressionContext.class,0);
		}
		public CaseExpressionContext caseExpression() {
			return getRuleContext(CaseExpressionContext.class,0);
		}
		public IntervalExpressionContext intervalExpression() {
			return getRuleContext(IntervalExpressionContext.class,0);
		}
		public List<TerminalNode> VERTICAL_BAR_() { return getTokens(BaseRuleParser.VERTICAL_BAR_); }
		public TerminalNode VERTICAL_BAR_(int i) {
			return getToken(BaseRuleParser.VERTICAL_BAR_, i);
		}
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public SimpleExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_simpleExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSimpleExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSimpleExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSimpleExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SimpleExprContext simpleExpr() throws RecognitionException {
		return simpleExpr(0);
	}

	private SimpleExprContext simpleExpr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		SimpleExprContext _localctx = new SimpleExprContext(_ctx, _parentState);
		SimpleExprContext _prevctx = _localctx;
		int _startState = 180;
		enterRecursionRule(_localctx, 180, RULE_simpleExpr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(956);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(905);
				functionCall();
				}
				break;
			case 2:
				{
				setState(906);
				parameterMarker();
				}
				break;
			case 3:
				{
				setState(907);
				literals();
				}
				break;
			case 4:
				{
				setState(908);
				columnRef();
				}
				break;
			case 5:
				{
				setState(909);
				variable();
				}
				break;
			case 6:
				{
				setState(915);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case PLUS_:
					{
					setState(910);
					match(PLUS_);
					}
					break;
				case MINUS_:
					{
					setState(911);
					match(MINUS_);
					}
					break;
				case TILDE_:
					{
					setState(912);
					match(TILDE_);
					}
					break;
				case NOT_:
				case NOT:
					{
					setState(913);
					notOperator();
					}
					break;
				case BINARY:
					{
					setState(914);
					match(BINARY);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(917);
				simpleExpr(9);
				}
				break;
			case 7:
				{
				setState(919);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ROW) {
					{
					setState(918);
					match(ROW);
					}
				}

				setState(921);
				match(LP_);
				setState(922);
				expr(0);
				setState(927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(923);
					match(COMMA_);
					setState(924);
					expr(0);
					}
					}
					setState(929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(930);
				match(RP_);
				}
				break;
			case 8:
				{
				setState(933);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EXISTS) {
					{
					setState(932);
					match(EXISTS);
					}
				}

				setState(935);
				subquery();
				}
				break;
			case 9:
				{
				setState(936);
				match(LBE_);
				setState(937);
				identifier();
				setState(938);
				expr(0);
				setState(939);
				match(RBE_);
				}
				break;
			case 10:
				{
				setState(941);
				identifier();
				setState(942);
				_la = _input.LA(1);
				if ( !(_la==JSON_SEPARATOR || _la==JSON_UNQUOTED_SEPARATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(943);
				string_();
				}
				break;
			case 11:
				{
				setState(945);
				path();
				setState(948);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,67,_ctx) ) {
				case 1:
					{
					setState(946);
					match(RETURNING);
					setState(947);
					dataType();
					}
					break;
				}
				setState(951);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
				case 1:
					{
					setState(950);
					onEmptyError();
					}
					break;
				}
				}
				break;
			case 12:
				{
				setState(953);
				matchExpression();
				}
				break;
			case 13:
				{
				setState(954);
				caseExpression();
				}
				break;
			case 14:
				{
				setState(955);
				intervalExpression();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(966);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(964);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,70,_ctx) ) {
					case 1:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(958);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(959);
						match(VERTICAL_BAR_);
						setState(960);
						match(VERTICAL_BAR_);
						setState(961);
						simpleExpr(11);
						}
						break;
					case 2:
						{
						_localctx = new SimpleExprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_simpleExpr);
						setState(962);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(963);
						collateClause();
						}
						break;
					}
					} 
				}
				setState(968);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,71,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PathContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public PathContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_path; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPath(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PathContext path() throws RecognitionException {
		PathContext _localctx = new PathContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_path);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(969);
			string_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OnEmptyErrorContext extends ParserRuleContext {
		public TerminalNode ON() { return getToken(BaseRuleParser.ON, 0); }
		public TerminalNode EMPTY() { return getToken(BaseRuleParser.EMPTY, 0); }
		public List<TerminalNode> ERROR() { return getTokens(BaseRuleParser.ERROR); }
		public TerminalNode ERROR(int i) {
			return getToken(BaseRuleParser.ERROR, i);
		}
		public TerminalNode NULL() { return getToken(BaseRuleParser.NULL, 0); }
		public TerminalNode DEFAULT() { return getToken(BaseRuleParser.DEFAULT, 0); }
		public LiteralsContext literals() {
			return getRuleContext(LiteralsContext.class,0);
		}
		public OnEmptyErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_onEmptyError; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOnEmptyError(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOnEmptyError(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOnEmptyError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OnEmptyErrorContext onEmptyError() throws RecognitionException {
		OnEmptyErrorContext _localctx = new OnEmptyErrorContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_onEmptyError);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(975);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case NULL:
				{
				setState(971);
				match(NULL);
				}
				break;
			case ERROR:
				{
				setState(972);
				match(ERROR);
				}
				break;
			case DEFAULT:
				{
				setState(973);
				match(DEFAULT);
				setState(974);
				literals();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(977);
			match(ON);
			setState(978);
			_la = _input.LA(1);
			if ( !(_la==EMPTY || _la==ERROR) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnRefContext extends ParserRuleContext {
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> DOT_() { return getTokens(BaseRuleParser.DOT_); }
		public TerminalNode DOT_(int i) {
			return getToken(BaseRuleParser.DOT_, i);
		}
		public ColumnRefContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnRef; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterColumnRef(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitColumnRef(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitColumnRef(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnRefContext columnRef() throws RecognitionException {
		ColumnRefContext _localctx = new ColumnRefContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_columnRef);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(980);
			identifier();
			setState(983);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,73,_ctx) ) {
			case 1:
				{
				setState(981);
				match(DOT_);
				setState(982);
				identifier();
				}
				break;
			}
			setState(987);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				{
				setState(985);
				match(DOT_);
				setState(986);
				identifier();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnRefListContext extends ParserRuleContext {
		public List<ColumnRefContext> columnRef() {
			return getRuleContexts(ColumnRefContext.class);
		}
		public ColumnRefContext columnRef(int i) {
			return getRuleContext(ColumnRefContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public ColumnRefListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnRefList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterColumnRefList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitColumnRefList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitColumnRefList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnRefListContext columnRefList() throws RecognitionException {
		ColumnRefListContext _localctx = new ColumnRefListContext(_ctx, getState());
		enterRule(_localctx, 188, RULE_columnRefList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(989);
			columnRef();
			setState(994);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(990);
				match(COMMA_);
				setState(991);
				columnRef();
				}
				}
				setState(996);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FunctionCallContext extends ParserRuleContext {
		public AggregationFunctionContext aggregationFunction() {
			return getRuleContext(AggregationFunctionContext.class,0);
		}
		public SpecialFunctionContext specialFunction() {
			return getRuleContext(SpecialFunctionContext.class,0);
		}
		public JsonFunctionContext jsonFunction() {
			return getRuleContext(JsonFunctionContext.class,0);
		}
		public RegularFunctionContext regularFunction() {
			return getRuleContext(RegularFunctionContext.class,0);
		}
		public UdfFunctionContext udfFunction() {
			return getRuleContext(UdfFunctionContext.class,0);
		}
		public FunctionCallContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_functionCall; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFunctionCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFunctionCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFunctionCall(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FunctionCallContext functionCall() throws RecognitionException {
		FunctionCallContext _localctx = new FunctionCallContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_functionCall);
		try {
			setState(1002);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(997);
				aggregationFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(998);
				specialFunction();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(999);
				jsonFunction();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1000);
				regularFunction();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1001);
				udfFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UdfFunctionContext extends ParserRuleContext {
		public FunctionNameContext functionName() {
			return getRuleContext(FunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public UdfFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_udfFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterUdfFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitUdfFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitUdfFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UdfFunctionContext udfFunction() throws RecognitionException {
		UdfFunctionContext _localctx = new UdfFunctionContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_udfFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1004);
			functionName();
			setState(1005);
			match(LP_);
			setState(1017);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,79,_ctx) ) {
			case 1:
				{
				setState(1007);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -68716792356814L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -5227571244865814545L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -1166718726351927431L) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & -1225004983887662769L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & 4517628659989213165L) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & 7054308056066409819L) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & 4003699793854300407L) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & -8707446686273880073L) != 0) || ((((_la - 514)) & ~0x3f) == 0 && ((1L << (_la - 514)) & 8042746102862053359L) != 0) || ((((_la - 578)) & ~0x3f) == 0 && ((1L << (_la - 578)) & -8359811249454350433L) != 0) || ((((_la - 642)) & ~0x3f) == 0 && ((1L << (_la - 642)) & 2304997324652243287L) != 0) || ((((_la - 730)) & ~0x3f) == 0 && ((1L << (_la - 730)) & -8080406343773455489L) != 0) || ((((_la - 795)) & ~0x3f) == 0 && ((1L << (_la - 795)) & 2278821411430523131L) != 0) || ((((_la - 859)) & ~0x3f) == 0 && ((1L << (_la - 859)) & 15L) != 0)) {
					{
					setState(1006);
					expr(0);
					}
				}

				}
				break;
			case 2:
				{
				setState(1009);
				expr(0);
				setState(1014);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1010);
					match(COMMA_);
					setState(1011);
					expr(0);
					}
					}
					setState(1016);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(1019);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationFunctionContext extends ParserRuleContext {
		public AggregationFunctionNameContext aggregationFunctionName() {
			return getRuleContext(AggregationFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(BaseRuleParser.ASTERISK_, 0); }
		public CollateClauseContext collateClause() {
			return getRuleContext(CollateClauseContext.class,0);
		}
		public OverClauseContext overClause() {
			return getRuleContext(OverClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public AggregationFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAggregationFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAggregationFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAggregationFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionContext aggregationFunction() throws RecognitionException {
		AggregationFunctionContext _localctx = new AggregationFunctionContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_aggregationFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			aggregationFunctionName();
			setState(1022);
			match(LP_);
			setState(1024);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1023);
				distinct();
				}
			}

			setState(1035);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GROUP_CONCAT:
			case CAST:
			case POSITION:
			case SUBSTRING:
			case SUBSTR:
			case EXTRACT:
			case TRIM:
			case LAST_DAY:
			case TRADITIONAL:
			case TREE:
			case MYSQL_MAIN:
			case MYSQL_ADMIN:
			case INSTANT:
			case INPLACE:
			case COPY:
			case UL_BINARY:
			case AUTOCOMMIT:
			case REDO_LOG:
			case ARCHIVE:
			case BLACKHOLE:
			case CSV:
			case FEDERATED:
			case INNODB:
			case MEMORY:
			case MRG_MYISAM:
			case MYISAM:
			case NDB:
			case NDBCLUSTER:
			case PERFORMANCE_SCHEMA:
			case TOKUDB:
			case ACCOUNT:
			case ACTION:
			case ACTIVE:
			case ADMIN:
			case AFTER:
			case AGAINST:
			case AGGREGATE:
			case ALGORITHM:
			case ALWAYS:
			case ANY:
			case ARRAY:
			case ASCII:
			case AT:
			case ATTRIBUTE:
			case AUTOEXTEND_SIZE:
			case AUTO_INCREMENT:
			case AVG:
			case BIT_XOR:
			case AVG_ROW_LENGTH:
			case BACKUP:
			case BEFORE:
			case BEGIN:
			case BINARY:
			case BINLOG:
			case BIT:
			case BLOCK:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BUCKETS:
			case BYTE:
			case CACHE:
			case CASCADED:
			case CASE:
			case CATALOG_NAME:
			case CHAIN:
			case CHANGED:
			case CHANNEL:
			case CHAR:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLASS_ORIGIN:
			case CLIENT:
			case CLONE:
			case CLOSE:
			case COALESCE:
			case CODE:
			case COLLATION:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COLUMN_NAME:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETION:
			case COMPONENT:
			case COMPRESSED:
			case COMPRESSION:
			case CONCURRENT:
			case CONNECTION:
			case CONSISTENT:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONTAINS:
			case CONTEXT:
			case CONVERT:
			case CPU:
			case CREATE:
			case CUME_DIST:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case CURSOR_NAME:
			case DATA:
			case DATABASE:
			case DATAFILE:
			case DATE:
			case DATETIME:
			case DAY:
			case DAY_MINUTE:
			case DEALLOCATE:
			case DEFAULT:
			case DEFAULT_AUTH:
			case DEFINER:
			case DEFINITION:
			case DELAY_KEY_WRITE:
			case DENSE_RANK:
			case DESCRIPTION:
			case DIAGNOSTICS:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DO:
			case DROP:
			case DUMPFILE:
			case DUPLICATE:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTION:
			case END:
			case ENDS:
			case ENFORCED:
			case ENGINE:
			case ENGINES:
			case ENGINE_ATTRIBUTE:
			case ENUM:
			case ERROR:
			case ERRORS:
			case ESCAPE:
			case EVENT:
			case EVENTS:
			case EVERY:
			case EXCHANGE:
			case EXCLUDE:
			case EXECUTE:
			case EXISTS:
			case EXPANSION:
			case EXPIRE:
			case EXPORT:
			case EXTENDED:
			case EXTENT_SIZE:
			case FAILED_LOGIN_ATTEMPTS:
			case FALSE:
			case FAST:
			case FAULTS:
			case FILE:
			case FILE_BLOCK_SIZE:
			case FILTER:
			case FIRST:
			case FIRST_VALUE:
			case FIXED:
			case FLUSH:
			case FOLLOWING:
			case FOLLOWS:
			case FORMAT:
			case FOUND:
			case FULL:
			case GENERAL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case GET_FORMAT:
			case GET_MASTER_PUBLIC_KEY:
			case GLOBAL:
			case GRANTS:
			case GROUPING:
			case GROUPS:
			case GROUP_REPLICATION:
			case HANDLER:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HISTORY:
			case HOST:
			case HOSTS:
			case HOUR:
			case IDENTIFIED:
			case IF:
			case IGNORE_SERVER_IDS:
			case IMPORT:
			case INACTIVE:
			case INDEXES:
			case INITIAL_SIZE:
			case INSERT:
			case INSERT_METHOD:
			case INSTALL:
			case INSTANCE:
			case INTERVAL:
			case INVISIBLE:
			case INVOKER:
			case IO:
			case IPC:
			case ISOLATION:
			case ISSUER:
			case JSON:
			case JSON_TABLE:
			case JSON_VALUE:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LAG:
			case LANGUAGE:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEAVES:
			case LEFT:
			case LESS:
			case LEVEL:
			case LINESTRING:
			case LIST:
			case LOCAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCKED:
			case LOCKS:
			case LOGFILE:
			case LOGS:
			case MASTER:
			case MASTER_AUTO_POSITION:
			case MASTER_COMPRESSION_ALGORITHM:
			case MASTER_CONNECT_RETRY:
			case MASTER_DELAY:
			case MASTER_HEARTBEAT_PERIOD:
			case MASTER_HOST:
			case MASTER_LOG_FILE:
			case MASTER_LOG_POS:
			case MASTER_PASSWORD:
			case MASTER_PORT:
			case MASTER_PUBLIC_KEY_PATH:
			case MASTER_RETRY_COUNT:
			case MASTER_SERVER_ID:
			case MASTER_SSL:
			case MASTER_SSL_CA:
			case MASTER_SSL_CAPATH:
			case MASTER_SSL_CERT:
			case MASTER_SSL_CIPHER:
			case MASTER_SSL_CRL:
			case MASTER_SSL_CRLPATH:
			case MASTER_SSL_KEY:
			case MASTER_TLS_CIPHERSUITES:
			case MASTER_TLS_VERSION:
			case MASTER_USER:
			case MASTER_ZSTD_COMPRESSION_LEVEL:
			case MATCH:
			case MAXVALUE:
			case MAX_CONNECTIONS_PER_HOUR:
			case MAX_QUERIES_PER_HOUR:
			case MAX_ROWS:
			case MAX_SIZE:
			case MAX_UPDATES_PER_HOUR:
			case MAX_USER_CONNECTIONS:
			case MEDIUM:
			case MEMBER:
			case MERGE:
			case MESSAGE_TEXT:
			case MICROSECOND:
			case MIGRATE:
			case MINUTE:
			case MIN_ROWS:
			case MOD:
			case MODE:
			case MODIFY:
			case MONTH:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case MUTEX:
			case MYSQL_ERRNO:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NESTED:
			case NETWORK_NAMESPACE:
			case NEVER:
			case NEW:
			case NEXT:
			case NO:
			case NODEGROUP:
			case NONE:
			case NOT:
			case NOWAIT:
			case NO_WAIT:
			case NTH_VALUE:
			case NTILE:
			case NULL:
			case NULLS:
			case NUMBER:
			case NVARCHAR:
			case OFF:
			case OFFSET:
			case OJ:
			case OLD:
			case ONE:
			case ONLY:
			case OPEN:
			case OPTIONAL:
			case OPTIONS:
			case ORDINALITY:
			case ORGANIZATION:
			case OTHERS:
			case OWNER:
			case PACK_KEYS:
			case PAGE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_LOCK_TIME:
			case PATH:
			case PERCENT_RANK:
			case PERSIST:
			case PERSIST_ONLY:
			case PHASE:
			case PLUGIN:
			case PLUGINS:
			case PLUGIN_DIR:
			case POINT:
			case POLYGON:
			case PORT:
			case PRECEDES:
			case PRECEDING:
			case PREPARE:
			case PRESERVE:
			case PREV:
			case PRIMARY:
			case PRIVILEGES:
			case PRIVILEGE_CHECKS_USER:
			case PROCESS:
			case PROCESSLIST:
			case PROFILE:
			case PROFILES:
			case PROXY:
			case QUARTER:
			case QUERY:
			case QUICK:
			case RANDOM:
			case RANK:
			case READ_ONLY:
			case REBUILD:
			case RECOVER:
			case REDO_BUFFER_SIZE:
			case REDUNDANT:
			case REFERENCE:
			case RELAY:
			case RELAYLOG:
			case RELAY_LOG_FILE:
			case RELAY_LOG_POS:
			case RELAY_THREAD:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPEAT:
			case REPEATABLE:
			case REPLACE:
			case REPLICATE_DO_DB:
			case REPLICATE_DO_TABLE:
			case REPLICATE_IGNORE_DB:
			case REPLICATE_IGNORE_TABLE:
			case REPLICATE_REWRITE_DB:
			case REPLICATE_WILD_DO_TABLE:
			case REPLICATE_WILD_IGNORE_TABLE:
			case REPLICATION:
			case REQUIRE_ROW_FORMAT:
			case RESET:
			case RESOURCE:
			case RESPECT:
			case RESTART:
			case RESTORE:
			case RESUME:
			case RETAIN:
			case RETURNED_SQLSTATE:
			case RETURNING:
			case RETURNS:
			case REUSE:
			case REVERSE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROTATE:
			case ROUTINE:
			case ROW:
			case ROW_COUNT:
			case ROW_FORMAT:
			case ROW_NUMBER:
			case RTREE:
			case SAVEPOINT:
			case SCHEDULE:
			case SCHEMA:
			case SCHEMA_NAME:
			case SECOND:
			case SECONDARY:
			case SECONDARY_ENGINE:
			case SECONDARY_ENGINE_ATTRIBUTE:
			case SECONDARY_LOAD:
			case SECONDARY_UNLOAD:
			case SECURITY:
			case SERIAL:
			case SERIALIZABLE:
			case SERVER:
			case SESSION:
			case SHARE:
			case SHUTDOWN:
			case SIGNED:
			case SIMPLE:
			case SLAVE:
			case SLOW:
			case SNAPSHOT:
			case SOCKET:
			case SONAME:
			case SOUNDS:
			case SOURCE:
			case SQL_AFTER_GTIDS:
			case SQL_AFTER_MTS_GAPS:
			case SQL_BEFORE_GTIDS:
			case SQL_BUFFER_RESULT:
			case SQL_NO_CACHE:
			case SQL_THREAD:
			case SRID:
			case STACKED:
			case START:
			case STARTS:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STRING:
			case SUBCLASS_ORIGIN:
			case SUBJECT:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case SUPER:
			case SUSPEND:
			case SWAPS:
			case SWITCHES:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TABLESPACE:
			case TABLE_CHECKSUM:
			case TABLE_NAME:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case THAN:
			case THREAD_PRIORITY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMP_ADD:
			case TIMESTAMP_DIFF:
			case TLS:
			case TRANSACTION:
			case TRIGGERS:
			case TRUE:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDEFINED:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case UNICODE:
			case UNINSTALL:
			case UNKNOWN:
			case UNTIL:
			case UPGRADE:
			case USER:
			case USER_RESOURCES:
			case USE_FRM:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case VALIDATION:
			case VALUE:
			case VALUES:
			case VARIABLES:
			case VCPU:
			case VIEW:
			case VISIBLE:
			case WAIT:
			case WARNINGS:
			case WEEK:
			case WEIGHT_STRING:
			case WITHOUT:
			case WORK:
			case WRAPPER:
			case X509:
			case XA:
			case XID:
			case XML:
			case YEAR:
			case YEAR_MONTH:
			case JSON_ARRAY:
			case JSON_ARRAY_APPEND:
			case JSON_ARRAY_INSERT:
			case JSON_CONTAINS:
			case JSON_CONTAINS_PATH:
			case JSON_DEPTH:
			case JSON_EXTRACT:
			case JSON_INSERT:
			case JSON_KEYS:
			case JSON_LENGTH:
			case JSON_MERGE:
			case JSON_MERGE_PATCH:
			case JSON_MERGE_PRESERVE:
			case JSON_OBJECT:
			case JSON_OVERLAPS:
			case JSON_PRETTY:
			case JSON_QUOTE:
			case JSON_REMOVE:
			case JSON_REPLACE:
			case JSON_SCHEMA_VALID:
			case JSON_SCHEMA_VALIDATION_REPORT:
			case JSON_SEARCH:
			case JSON_SET:
			case JSON_STORAGE_FREE:
			case JSON_STORAGE_SIZE:
			case JSON_TYPE:
			case JSON_UNQUOTE:
			case JSON_VALID:
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
			case BQUOTA_STRING:
			case NCHAR_TEXT:
			case UNDERSCORE_CHARSET:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
			case IDENTIFIER_:
			case IP_ADDRESS:
				{
				setState(1026);
				expr(0);
				setState(1031);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1027);
					match(COMMA_);
					setState(1028);
					expr(0);
					}
					}
					setState(1033);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1034);
				match(ASTERISK_);
				}
				break;
			case RP_:
			case COLLATE:
				break;
			default:
				break;
			}
			setState(1038);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COLLATE) {
				{
				setState(1037);
				collateClause();
				}
			}

			setState(1040);
			match(RP_);
			setState(1042);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				{
				setState(1041);
				overClause();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsonFunctionContext extends ParserRuleContext {
		public ColumnRefContext columnRef() {
			return getRuleContext(ColumnRefContext.class,0);
		}
		public PathContext path() {
			return getRuleContext(PathContext.class,0);
		}
		public TerminalNode JSON_SEPARATOR() { return getToken(BaseRuleParser.JSON_SEPARATOR, 0); }
		public TerminalNode JSON_UNQUOTED_SEPARATOR() { return getToken(BaseRuleParser.JSON_UNQUOTED_SEPARATOR, 0); }
		public JsonFunctionNameContext jsonFunctionName() {
			return getRuleContext(JsonFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public JsonFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterJsonFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitJsonFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitJsonFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonFunctionContext jsonFunction() throws RecognitionException {
		JsonFunctionContext _localctx = new JsonFunctionContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_jsonFunction);
		int _la;
		try {
			setState(1065);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1044);
				columnRef();
				setState(1045);
				_la = _input.LA(1);
				if ( !(_la==JSON_SEPARATOR || _la==JSON_UNQUOTED_SEPARATOR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1046);
				path();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1048);
				jsonFunctionName();
				setState(1049);
				match(LP_);
				setState(1061);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
				case 1:
					{
					setState(1051);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -68716792356814L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -5227571244865814545L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -1166718726351927431L) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & -1225004983887662769L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & 4517628659989213165L) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & 7054308056066409819L) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & 4003699793854300407L) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & -8707446686273880073L) != 0) || ((((_la - 514)) & ~0x3f) == 0 && ((1L << (_la - 514)) & 8042746102862053359L) != 0) || ((((_la - 578)) & ~0x3f) == 0 && ((1L << (_la - 578)) & -8359811249454350433L) != 0) || ((((_la - 642)) & ~0x3f) == 0 && ((1L << (_la - 642)) & 2304997324652243287L) != 0) || ((((_la - 730)) & ~0x3f) == 0 && ((1L << (_la - 730)) & -8080406343773455489L) != 0) || ((((_la - 795)) & ~0x3f) == 0 && ((1L << (_la - 795)) & 2278821411430523131L) != 0) || ((((_la - 859)) & ~0x3f) == 0 && ((1L << (_la - 859)) & 15L) != 0)) {
						{
						setState(1050);
						expr(0);
						}
					}

					}
					break;
				case 2:
					{
					setState(1053);
					expr(0);
					setState(1058);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==COMMA_) {
						{
						{
						setState(1054);
						match(COMMA_);
						setState(1055);
						expr(0);
						}
						}
						setState(1060);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
					break;
				}
				setState(1063);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class JsonFunctionNameContext extends ParserRuleContext {
		public TerminalNode JSON_ARRAY() { return getToken(BaseRuleParser.JSON_ARRAY, 0); }
		public TerminalNode JSON_ARRAY_APPEND() { return getToken(BaseRuleParser.JSON_ARRAY_APPEND, 0); }
		public TerminalNode JSON_ARRAY_INSERT() { return getToken(BaseRuleParser.JSON_ARRAY_INSERT, 0); }
		public TerminalNode JSON_CONTAINS() { return getToken(BaseRuleParser.JSON_CONTAINS, 0); }
		public TerminalNode JSON_CONTAINS_PATH() { return getToken(BaseRuleParser.JSON_CONTAINS_PATH, 0); }
		public TerminalNode JSON_DEPTH() { return getToken(BaseRuleParser.JSON_DEPTH, 0); }
		public TerminalNode JSON_EXTRACT() { return getToken(BaseRuleParser.JSON_EXTRACT, 0); }
		public TerminalNode JSON_INSERT() { return getToken(BaseRuleParser.JSON_INSERT, 0); }
		public TerminalNode JSON_KEYS() { return getToken(BaseRuleParser.JSON_KEYS, 0); }
		public TerminalNode JSON_LENGTH() { return getToken(BaseRuleParser.JSON_LENGTH, 0); }
		public TerminalNode JSON_MERGE() { return getToken(BaseRuleParser.JSON_MERGE, 0); }
		public TerminalNode JSON_MERGE_PATCH() { return getToken(BaseRuleParser.JSON_MERGE_PATCH, 0); }
		public TerminalNode JSON_MERGE_PRESERVE() { return getToken(BaseRuleParser.JSON_MERGE_PRESERVE, 0); }
		public TerminalNode JSON_OBJECT() { return getToken(BaseRuleParser.JSON_OBJECT, 0); }
		public TerminalNode JSON_OVERLAPS() { return getToken(BaseRuleParser.JSON_OVERLAPS, 0); }
		public TerminalNode JSON_PRETTY() { return getToken(BaseRuleParser.JSON_PRETTY, 0); }
		public TerminalNode JSON_QUOTE() { return getToken(BaseRuleParser.JSON_QUOTE, 0); }
		public TerminalNode JSON_REMOVE() { return getToken(BaseRuleParser.JSON_REMOVE, 0); }
		public TerminalNode JSON_REPLACE() { return getToken(BaseRuleParser.JSON_REPLACE, 0); }
		public TerminalNode JSON_SCHEMA_VALID() { return getToken(BaseRuleParser.JSON_SCHEMA_VALID, 0); }
		public TerminalNode JSON_SCHEMA_VALIDATION_REPORT() { return getToken(BaseRuleParser.JSON_SCHEMA_VALIDATION_REPORT, 0); }
		public TerminalNode JSON_SEARCH() { return getToken(BaseRuleParser.JSON_SEARCH, 0); }
		public TerminalNode JSON_SET() { return getToken(BaseRuleParser.JSON_SET, 0); }
		public TerminalNode JSON_STORAGE_FREE() { return getToken(BaseRuleParser.JSON_STORAGE_FREE, 0); }
		public TerminalNode JSON_STORAGE_SIZE() { return getToken(BaseRuleParser.JSON_STORAGE_SIZE, 0); }
		public TerminalNode JSON_TABLE() { return getToken(BaseRuleParser.JSON_TABLE, 0); }
		public TerminalNode JSON_TYPE() { return getToken(BaseRuleParser.JSON_TYPE, 0); }
		public TerminalNode JSON_UNQUOTE() { return getToken(BaseRuleParser.JSON_UNQUOTE, 0); }
		public TerminalNode JSON_VALID() { return getToken(BaseRuleParser.JSON_VALID, 0); }
		public TerminalNode JSON_VALUE() { return getToken(BaseRuleParser.JSON_VALUE, 0); }
		public TerminalNode MEMBER() { return getToken(BaseRuleParser.MEMBER, 0); }
		public TerminalNode OF() { return getToken(BaseRuleParser.OF, 0); }
		public JsonFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_jsonFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterJsonFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitJsonFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitJsonFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JsonFunctionNameContext jsonFunctionName() throws RecognitionException {
		JsonFunctionNameContext _localctx = new JsonFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_jsonFunctionName);
		try {
			setState(1099);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JSON_ARRAY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1067);
				match(JSON_ARRAY);
				}
				break;
			case JSON_ARRAY_APPEND:
				enterOuterAlt(_localctx, 2);
				{
				setState(1068);
				match(JSON_ARRAY_APPEND);
				}
				break;
			case JSON_ARRAY_INSERT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1069);
				match(JSON_ARRAY_INSERT);
				}
				break;
			case JSON_CONTAINS:
				enterOuterAlt(_localctx, 4);
				{
				setState(1070);
				match(JSON_CONTAINS);
				}
				break;
			case JSON_CONTAINS_PATH:
				enterOuterAlt(_localctx, 5);
				{
				setState(1071);
				match(JSON_CONTAINS_PATH);
				}
				break;
			case JSON_DEPTH:
				enterOuterAlt(_localctx, 6);
				{
				setState(1072);
				match(JSON_DEPTH);
				}
				break;
			case JSON_EXTRACT:
				enterOuterAlt(_localctx, 7);
				{
				setState(1073);
				match(JSON_EXTRACT);
				}
				break;
			case JSON_INSERT:
				enterOuterAlt(_localctx, 8);
				{
				setState(1074);
				match(JSON_INSERT);
				}
				break;
			case JSON_KEYS:
				enterOuterAlt(_localctx, 9);
				{
				setState(1075);
				match(JSON_KEYS);
				}
				break;
			case JSON_LENGTH:
				enterOuterAlt(_localctx, 10);
				{
				setState(1076);
				match(JSON_LENGTH);
				}
				break;
			case JSON_MERGE:
				enterOuterAlt(_localctx, 11);
				{
				setState(1077);
				match(JSON_MERGE);
				}
				break;
			case JSON_MERGE_PATCH:
				enterOuterAlt(_localctx, 12);
				{
				setState(1078);
				match(JSON_MERGE_PATCH);
				}
				break;
			case JSON_MERGE_PRESERVE:
				enterOuterAlt(_localctx, 13);
				{
				setState(1079);
				match(JSON_MERGE_PRESERVE);
				}
				break;
			case JSON_OBJECT:
				enterOuterAlt(_localctx, 14);
				{
				setState(1080);
				match(JSON_OBJECT);
				}
				break;
			case JSON_OVERLAPS:
				enterOuterAlt(_localctx, 15);
				{
				setState(1081);
				match(JSON_OVERLAPS);
				}
				break;
			case JSON_PRETTY:
				enterOuterAlt(_localctx, 16);
				{
				setState(1082);
				match(JSON_PRETTY);
				}
				break;
			case JSON_QUOTE:
				enterOuterAlt(_localctx, 17);
				{
				setState(1083);
				match(JSON_QUOTE);
				}
				break;
			case JSON_REMOVE:
				enterOuterAlt(_localctx, 18);
				{
				setState(1084);
				match(JSON_REMOVE);
				}
				break;
			case JSON_REPLACE:
				enterOuterAlt(_localctx, 19);
				{
				setState(1085);
				match(JSON_REPLACE);
				}
				break;
			case JSON_SCHEMA_VALID:
				enterOuterAlt(_localctx, 20);
				{
				setState(1086);
				match(JSON_SCHEMA_VALID);
				}
				break;
			case JSON_SCHEMA_VALIDATION_REPORT:
				enterOuterAlt(_localctx, 21);
				{
				setState(1087);
				match(JSON_SCHEMA_VALIDATION_REPORT);
				}
				break;
			case JSON_SEARCH:
				enterOuterAlt(_localctx, 22);
				{
				setState(1088);
				match(JSON_SEARCH);
				}
				break;
			case JSON_SET:
				enterOuterAlt(_localctx, 23);
				{
				setState(1089);
				match(JSON_SET);
				}
				break;
			case JSON_STORAGE_FREE:
				enterOuterAlt(_localctx, 24);
				{
				setState(1090);
				match(JSON_STORAGE_FREE);
				}
				break;
			case JSON_STORAGE_SIZE:
				enterOuterAlt(_localctx, 25);
				{
				setState(1091);
				match(JSON_STORAGE_SIZE);
				}
				break;
			case JSON_TABLE:
				enterOuterAlt(_localctx, 26);
				{
				setState(1092);
				match(JSON_TABLE);
				}
				break;
			case JSON_TYPE:
				enterOuterAlt(_localctx, 27);
				{
				setState(1093);
				match(JSON_TYPE);
				}
				break;
			case JSON_UNQUOTE:
				enterOuterAlt(_localctx, 28);
				{
				setState(1094);
				match(JSON_UNQUOTE);
				}
				break;
			case JSON_VALID:
				enterOuterAlt(_localctx, 29);
				{
				setState(1095);
				match(JSON_VALID);
				}
				break;
			case JSON_VALUE:
				enterOuterAlt(_localctx, 30);
				{
				setState(1096);
				match(JSON_VALUE);
				}
				break;
			case MEMBER:
				enterOuterAlt(_localctx, 31);
				{
				setState(1097);
				match(MEMBER);
				setState(1098);
				match(OF);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AggregationFunctionNameContext extends ParserRuleContext {
		public TerminalNode MAX() { return getToken(BaseRuleParser.MAX, 0); }
		public TerminalNode MIN() { return getToken(BaseRuleParser.MIN, 0); }
		public TerminalNode SUM() { return getToken(BaseRuleParser.SUM, 0); }
		public TerminalNode COUNT() { return getToken(BaseRuleParser.COUNT, 0); }
		public TerminalNode AVG() { return getToken(BaseRuleParser.AVG, 0); }
		public TerminalNode BIT_XOR() { return getToken(BaseRuleParser.BIT_XOR, 0); }
		public TerminalNode GROUP_CONCAT() { return getToken(BaseRuleParser.GROUP_CONCAT, 0); }
		public AggregationFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregationFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAggregationFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAggregationFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAggregationFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AggregationFunctionNameContext aggregationFunctionName() throws RecognitionException {
		AggregationFunctionNameContext _localctx = new AggregationFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_aggregationFunctionName);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1101);
			_la = _input.LA(1);
			if ( !(((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & -6917529027641081825L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DistinctContext extends ParserRuleContext {
		public TerminalNode DISTINCT() { return getToken(BaseRuleParser.DISTINCT, 0); }
		public DistinctContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_distinct; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDistinct(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDistinct(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDistinct(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DistinctContext distinct() throws RecognitionException {
		DistinctContext _localctx = new DistinctContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_distinct);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1103);
			match(DISTINCT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OverClauseContext extends ParserRuleContext {
		public TerminalNode OVER() { return getToken(BaseRuleParser.OVER, 0); }
		public WindowSpecificationContext windowSpecification() {
			return getRuleContext(WindowSpecificationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public OverClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_overClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOverClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOverClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOverClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OverClauseContext overClause() throws RecognitionException {
		OverClauseContext _localctx = new OverClauseContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_overClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1105);
			match(OVER);
			setState(1108);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LP_:
				{
				setState(1106);
				windowSpecification();
				}
				break;
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GROUP_CONCAT:
			case CAST:
			case POSITION:
			case SUBSTRING:
			case SUBSTR:
			case EXTRACT:
			case TRIM:
			case LAST_DAY:
			case TRADITIONAL:
			case TREE:
			case MYSQL_MAIN:
			case MYSQL_ADMIN:
			case INSTANT:
			case INPLACE:
			case COPY:
			case UL_BINARY:
			case AUTOCOMMIT:
			case REDO_LOG:
			case ARCHIVE:
			case BLACKHOLE:
			case CSV:
			case FEDERATED:
			case INNODB:
			case MEMORY:
			case MRG_MYISAM:
			case MYISAM:
			case NDB:
			case NDBCLUSTER:
			case PERFORMANCE_SCHEMA:
			case TOKUDB:
			case ACCOUNT:
			case ACTION:
			case ACTIVE:
			case ADMIN:
			case AFTER:
			case AGAINST:
			case AGGREGATE:
			case ALGORITHM:
			case ALWAYS:
			case ANY:
			case ARRAY:
			case ASCII:
			case AT:
			case ATTRIBUTE:
			case AUTOEXTEND_SIZE:
			case AUTO_INCREMENT:
			case AVG:
			case BIT_XOR:
			case AVG_ROW_LENGTH:
			case BACKUP:
			case BEFORE:
			case BEGIN:
			case BINLOG:
			case BIT:
			case BLOCK:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BUCKETS:
			case BYTE:
			case CACHE:
			case CASCADED:
			case CATALOG_NAME:
			case CHAIN:
			case CHANGED:
			case CHANNEL:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLASS_ORIGIN:
			case CLIENT:
			case CLONE:
			case CLOSE:
			case COALESCE:
			case CODE:
			case COLLATION:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COLUMN_NAME:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETION:
			case COMPONENT:
			case COMPRESSED:
			case COMPRESSION:
			case CONCURRENT:
			case CONNECTION:
			case CONSISTENT:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONTAINS:
			case CONTEXT:
			case CPU:
			case CREATE:
			case CURRENT:
			case CURSOR_NAME:
			case DATA:
			case DATAFILE:
			case DATE:
			case DATETIME:
			case DAY:
			case DAY_MINUTE:
			case DEALLOCATE:
			case DEFAULT:
			case DEFAULT_AUTH:
			case DEFINER:
			case DEFINITION:
			case DELAY_KEY_WRITE:
			case DESCRIPTION:
			case DIAGNOSTICS:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DO:
			case DROP:
			case DUMPFILE:
			case DUPLICATE:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTION:
			case END:
			case ENDS:
			case ENFORCED:
			case ENGINE:
			case ENGINES:
			case ENGINE_ATTRIBUTE:
			case ENUM:
			case ERROR:
			case ERRORS:
			case ESCAPE:
			case EVENT:
			case EVENTS:
			case EVERY:
			case EXCHANGE:
			case EXCLUDE:
			case EXECUTE:
			case EXPANSION:
			case EXPIRE:
			case EXPORT:
			case EXTENDED:
			case EXTENT_SIZE:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FAULTS:
			case FILE:
			case FILE_BLOCK_SIZE:
			case FILTER:
			case FIRST:
			case FIXED:
			case FLUSH:
			case FOLLOWING:
			case FOLLOWS:
			case FORMAT:
			case FOUND:
			case FULL:
			case GENERAL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case GET_FORMAT:
			case GET_MASTER_PUBLIC_KEY:
			case GLOBAL:
			case GRANTS:
			case GROUPS:
			case GROUP_REPLICATION:
			case HANDLER:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HISTORY:
			case HOST:
			case HOSTS:
			case HOUR:
			case IDENTIFIED:
			case IGNORE_SERVER_IDS:
			case IMPORT:
			case INACTIVE:
			case INDEXES:
			case INITIAL_SIZE:
			case INSERT_METHOD:
			case INSTALL:
			case INSTANCE:
			case INVISIBLE:
			case INVOKER:
			case IO:
			case IPC:
			case ISOLATION:
			case ISSUER:
			case JSON:
			case JSON_VALUE:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LANGUAGE:
			case LAST:
			case LAST_VALUE:
			case LEAVES:
			case LESS:
			case LEVEL:
			case LINESTRING:
			case LIST:
			case LOCAL:
			case LOCKED:
			case LOCKS:
			case LOGFILE:
			case LOGS:
			case MASTER:
			case MASTER_AUTO_POSITION:
			case MASTER_COMPRESSION_ALGORITHM:
			case MASTER_CONNECT_RETRY:
			case MASTER_DELAY:
			case MASTER_HEARTBEAT_PERIOD:
			case MASTER_HOST:
			case MASTER_LOG_FILE:
			case MASTER_LOG_POS:
			case MASTER_PASSWORD:
			case MASTER_PORT:
			case MASTER_PUBLIC_KEY_PATH:
			case MASTER_RETRY_COUNT:
			case MASTER_SERVER_ID:
			case MASTER_SSL:
			case MASTER_SSL_CA:
			case MASTER_SSL_CAPATH:
			case MASTER_SSL_CERT:
			case MASTER_SSL_CIPHER:
			case MASTER_SSL_CRL:
			case MASTER_SSL_CRLPATH:
			case MASTER_SSL_KEY:
			case MASTER_TLS_CIPHERSUITES:
			case MASTER_TLS_VERSION:
			case MASTER_USER:
			case MASTER_ZSTD_COMPRESSION_LEVEL:
			case MAXVALUE:
			case MAX_CONNECTIONS_PER_HOUR:
			case MAX_QUERIES_PER_HOUR:
			case MAX_ROWS:
			case MAX_SIZE:
			case MAX_UPDATES_PER_HOUR:
			case MAX_USER_CONNECTIONS:
			case MEDIUM:
			case MEMBER:
			case MERGE:
			case MESSAGE_TEXT:
			case MICROSECOND:
			case MIGRATE:
			case MINUTE:
			case MIN_ROWS:
			case MODE:
			case MODIFY:
			case MONTH:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case MUTEX:
			case MYSQL_ERRNO:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NESTED:
			case NETWORK_NAMESPACE:
			case NEVER:
			case NEW:
			case NEXT:
			case NO:
			case NODEGROUP:
			case NONE:
			case NOWAIT:
			case NO_WAIT:
			case NULLS:
			case NUMBER:
			case NVARCHAR:
			case OFF:
			case OFFSET:
			case OJ:
			case OLD:
			case ONE:
			case ONLY:
			case OPEN:
			case OPTIONAL:
			case OPTIONS:
			case ORDINALITY:
			case ORGANIZATION:
			case OTHERS:
			case OWNER:
			case PACK_KEYS:
			case PAGE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_LOCK_TIME:
			case PATH:
			case PERSIST:
			case PERSIST_ONLY:
			case PHASE:
			case PLUGIN:
			case PLUGINS:
			case PLUGIN_DIR:
			case POINT:
			case POLYGON:
			case PORT:
			case PRECEDES:
			case PRECEDING:
			case PREPARE:
			case PRESERVE:
			case PREV:
			case PRIMARY:
			case PRIVILEGES:
			case PRIVILEGE_CHECKS_USER:
			case PROCESS:
			case PROCESSLIST:
			case PROFILE:
			case PROFILES:
			case PROXY:
			case QUARTER:
			case QUERY:
			case QUICK:
			case RANDOM:
			case RANK:
			case READ_ONLY:
			case REBUILD:
			case RECOVER:
			case REDO_BUFFER_SIZE:
			case REDUNDANT:
			case REFERENCE:
			case RELAY:
			case RELAYLOG:
			case RELAY_LOG_FILE:
			case RELAY_LOG_POS:
			case RELAY_THREAD:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPEATABLE:
			case REPLICATE_DO_DB:
			case REPLICATE_DO_TABLE:
			case REPLICATE_IGNORE_DB:
			case REPLICATE_IGNORE_TABLE:
			case REPLICATE_REWRITE_DB:
			case REPLICATE_WILD_DO_TABLE:
			case REPLICATE_WILD_IGNORE_TABLE:
			case REPLICATION:
			case REQUIRE_ROW_FORMAT:
			case RESET:
			case RESOURCE:
			case RESPECT:
			case RESTART:
			case RESTORE:
			case RESUME:
			case RETAIN:
			case RETURNED_SQLSTATE:
			case RETURNING:
			case RETURNS:
			case REUSE:
			case REVERSE:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROTATE:
			case ROUTINE:
			case ROW_COUNT:
			case ROW_FORMAT:
			case RTREE:
			case SAVEPOINT:
			case SCHEDULE:
			case SCHEMA_NAME:
			case SECOND:
			case SECONDARY:
			case SECONDARY_ENGINE:
			case SECONDARY_ENGINE_ATTRIBUTE:
			case SECONDARY_LOAD:
			case SECONDARY_UNLOAD:
			case SECURITY:
			case SERIAL:
			case SERIALIZABLE:
			case SERVER:
			case SESSION:
			case SHARE:
			case SHUTDOWN:
			case SIGNED:
			case SIMPLE:
			case SLAVE:
			case SLOW:
			case SNAPSHOT:
			case SOCKET:
			case SONAME:
			case SOUNDS:
			case SOURCE:
			case SQL_AFTER_GTIDS:
			case SQL_AFTER_MTS_GAPS:
			case SQL_BEFORE_GTIDS:
			case SQL_BUFFER_RESULT:
			case SQL_NO_CACHE:
			case SQL_THREAD:
			case SRID:
			case STACKED:
			case START:
			case STARTS:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STRING:
			case SUBCLASS_ORIGIN:
			case SUBJECT:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case SUPER:
			case SUSPEND:
			case SWAPS:
			case SWITCHES:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TABLESPACE:
			case TABLE_CHECKSUM:
			case TABLE_NAME:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case THAN:
			case THREAD_PRIORITY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMP_ADD:
			case TIMESTAMP_DIFF:
			case TLS:
			case TRANSACTION:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDEFINED:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case UNICODE:
			case UNINSTALL:
			case UNKNOWN:
			case UNTIL:
			case UPGRADE:
			case USER:
			case USER_RESOURCES:
			case USE_FRM:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case VALIDATION:
			case VALUE:
			case VARIABLES:
			case VCPU:
			case VIEW:
			case VISIBLE:
			case WAIT:
			case WARNINGS:
			case WEEK:
			case WEIGHT_STRING:
			case WITHOUT:
			case WORK:
			case WRAPPER:
			case X509:
			case XA:
			case XID:
			case XML:
			case YEAR:
			case YEAR_MONTH:
			case DOUBLE_QUOTED_TEXT:
			case BQUOTA_STRING:
			case UNDERSCORE_CHARSET:
			case IDENTIFIER_:
				{
				setState(1107);
				identifier();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowSpecificationContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public TerminalNode PARTITION() { return getToken(BaseRuleParser.PARTITION, 0); }
		public TerminalNode BY() { return getToken(BaseRuleParser.BY, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public FrameClauseContext frameClause() {
			return getRuleContext(FrameClauseContext.class,0);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public WindowSpecificationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowSpecification; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterWindowSpecification(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitWindowSpecification(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitWindowSpecification(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowSpecificationContext windowSpecification() throws RecognitionException {
		WindowSpecificationContext _localctx = new WindowSpecificationContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_windowSpecification);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1110);
			match(LP_);
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & -4712666368917372929L) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & -1297058695571120753L) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & 4875421575642972723L) != 0) || ((((_la - 238)) & ~0x3f) == 0 && ((1L << (_la - 238)) & -4997431877114038273L) != 0) || ((((_la - 304)) & ~0x3f) == 0 && ((1L << (_la - 304)) & 4410396286195629411L) != 0) || ((((_la - 368)) & ~0x3f) == 0 && ((1L << (_la - 368)) & -2377900646138018169L) != 0) || ((((_la - 432)) & ~0x3f) == 0 && ((1L << (_la - 432)) & -4800397428193436097L) != 0) || ((((_la - 496)) & ~0x3f) == 0 && ((1L << (_la - 496)) & 5467228110355045539L) != 0) || ((((_la - 561)) & ~0x3f) == 0 && ((1L << (_la - 561)) & -5484278327649312965L) != 0) || ((((_la - 625)) & ~0x3f) == 0 && ((1L << (_la - 625)) & -165102396204181517L) != 0) || ((((_la - 689)) & ~0x3f) == 0 && ((1L << (_la - 689)) & 2591537911551770617L) != 0) || ((((_la - 753)) & ~0x3f) == 0 && ((1L << (_la - 753)) & 8900217940402666485L) != 0) || ((((_la - 817)) & ~0x3f) == 0 && ((1L << (_la - 817)) & 17781164605443L) != 0)) {
				{
				setState(1111);
				identifier();
				}
			}

			setState(1124);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PARTITION) {
				{
				setState(1114);
				match(PARTITION);
				setState(1115);
				match(BY);
				setState(1116);
				expr(0);
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1117);
					match(COMMA_);
					setState(1118);
					expr(0);
					}
					}
					setState(1123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1126);
				orderByClause();
				}
			}

			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==RANGE || _la==ROWS) {
				{
				setState(1129);
				frameClause();
				}
			}

			setState(1132);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FrameClauseContext extends ParserRuleContext {
		public TerminalNode ROWS() { return getToken(BaseRuleParser.ROWS, 0); }
		public TerminalNode RANGE() { return getToken(BaseRuleParser.RANGE, 0); }
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public FrameBetweenContext frameBetween() {
			return getRuleContext(FrameBetweenContext.class,0);
		}
		public FrameClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFrameClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFrameClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFrameClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameClauseContext frameClause() throws RecognitionException {
		FrameClauseContext _localctx = new FrameClauseContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_frameClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1134);
			_la = _input.LA(1);
			if ( !(_la==RANGE || _la==ROWS) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1137);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GROUP_CONCAT:
			case CAST:
			case POSITION:
			case SUBSTRING:
			case SUBSTR:
			case EXTRACT:
			case TRIM:
			case LAST_DAY:
			case TRADITIONAL:
			case TREE:
			case MYSQL_MAIN:
			case MYSQL_ADMIN:
			case INSTANT:
			case INPLACE:
			case COPY:
			case UL_BINARY:
			case AUTOCOMMIT:
			case REDO_LOG:
			case ARCHIVE:
			case BLACKHOLE:
			case CSV:
			case FEDERATED:
			case INNODB:
			case MEMORY:
			case MRG_MYISAM:
			case MYISAM:
			case NDB:
			case NDBCLUSTER:
			case PERFORMANCE_SCHEMA:
			case TOKUDB:
			case ACCOUNT:
			case ACTION:
			case ACTIVE:
			case ADMIN:
			case AFTER:
			case AGAINST:
			case AGGREGATE:
			case ALGORITHM:
			case ALWAYS:
			case ANY:
			case ARRAY:
			case ASCII:
			case AT:
			case ATTRIBUTE:
			case AUTOEXTEND_SIZE:
			case AUTO_INCREMENT:
			case AVG:
			case BIT_XOR:
			case AVG_ROW_LENGTH:
			case BACKUP:
			case BEFORE:
			case BEGIN:
			case BINARY:
			case BINLOG:
			case BIT:
			case BLOCK:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BUCKETS:
			case BYTE:
			case CACHE:
			case CASCADED:
			case CASE:
			case CATALOG_NAME:
			case CHAIN:
			case CHANGED:
			case CHANNEL:
			case CHAR:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLASS_ORIGIN:
			case CLIENT:
			case CLONE:
			case CLOSE:
			case COALESCE:
			case CODE:
			case COLLATION:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COLUMN_NAME:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETION:
			case COMPONENT:
			case COMPRESSED:
			case COMPRESSION:
			case CONCURRENT:
			case CONNECTION:
			case CONSISTENT:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONTAINS:
			case CONTEXT:
			case CONVERT:
			case CPU:
			case CREATE:
			case CUME_DIST:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case CURSOR_NAME:
			case DATA:
			case DATABASE:
			case DATAFILE:
			case DATE:
			case DATETIME:
			case DAY:
			case DAY_MINUTE:
			case DEALLOCATE:
			case DEFAULT:
			case DEFAULT_AUTH:
			case DEFINER:
			case DEFINITION:
			case DELAY_KEY_WRITE:
			case DENSE_RANK:
			case DESCRIPTION:
			case DIAGNOSTICS:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DO:
			case DROP:
			case DUMPFILE:
			case DUPLICATE:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTION:
			case END:
			case ENDS:
			case ENFORCED:
			case ENGINE:
			case ENGINES:
			case ENGINE_ATTRIBUTE:
			case ENUM:
			case ERROR:
			case ERRORS:
			case ESCAPE:
			case EVENT:
			case EVENTS:
			case EVERY:
			case EXCHANGE:
			case EXCLUDE:
			case EXECUTE:
			case EXISTS:
			case EXPANSION:
			case EXPIRE:
			case EXPORT:
			case EXTENDED:
			case EXTENT_SIZE:
			case FAILED_LOGIN_ATTEMPTS:
			case FALSE:
			case FAST:
			case FAULTS:
			case FILE:
			case FILE_BLOCK_SIZE:
			case FILTER:
			case FIRST:
			case FIRST_VALUE:
			case FIXED:
			case FLUSH:
			case FOLLOWING:
			case FOLLOWS:
			case FORMAT:
			case FOUND:
			case FULL:
			case GENERAL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case GET_FORMAT:
			case GET_MASTER_PUBLIC_KEY:
			case GLOBAL:
			case GRANTS:
			case GROUPING:
			case GROUPS:
			case GROUP_REPLICATION:
			case HANDLER:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HISTORY:
			case HOST:
			case HOSTS:
			case HOUR:
			case IDENTIFIED:
			case IF:
			case IGNORE_SERVER_IDS:
			case IMPORT:
			case INACTIVE:
			case INDEXES:
			case INITIAL_SIZE:
			case INSERT:
			case INSERT_METHOD:
			case INSTALL:
			case INSTANCE:
			case INTERVAL:
			case INVISIBLE:
			case INVOKER:
			case IO:
			case IPC:
			case ISOLATION:
			case ISSUER:
			case JSON:
			case JSON_TABLE:
			case JSON_VALUE:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LAG:
			case LANGUAGE:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEAVES:
			case LEFT:
			case LESS:
			case LEVEL:
			case LINESTRING:
			case LIST:
			case LOCAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCKED:
			case LOCKS:
			case LOGFILE:
			case LOGS:
			case MASTER:
			case MASTER_AUTO_POSITION:
			case MASTER_COMPRESSION_ALGORITHM:
			case MASTER_CONNECT_RETRY:
			case MASTER_DELAY:
			case MASTER_HEARTBEAT_PERIOD:
			case MASTER_HOST:
			case MASTER_LOG_FILE:
			case MASTER_LOG_POS:
			case MASTER_PASSWORD:
			case MASTER_PORT:
			case MASTER_PUBLIC_KEY_PATH:
			case MASTER_RETRY_COUNT:
			case MASTER_SERVER_ID:
			case MASTER_SSL:
			case MASTER_SSL_CA:
			case MASTER_SSL_CAPATH:
			case MASTER_SSL_CERT:
			case MASTER_SSL_CIPHER:
			case MASTER_SSL_CRL:
			case MASTER_SSL_CRLPATH:
			case MASTER_SSL_KEY:
			case MASTER_TLS_CIPHERSUITES:
			case MASTER_TLS_VERSION:
			case MASTER_USER:
			case MASTER_ZSTD_COMPRESSION_LEVEL:
			case MATCH:
			case MAXVALUE:
			case MAX_CONNECTIONS_PER_HOUR:
			case MAX_QUERIES_PER_HOUR:
			case MAX_ROWS:
			case MAX_SIZE:
			case MAX_UPDATES_PER_HOUR:
			case MAX_USER_CONNECTIONS:
			case MEDIUM:
			case MEMBER:
			case MERGE:
			case MESSAGE_TEXT:
			case MICROSECOND:
			case MIGRATE:
			case MINUTE:
			case MIN_ROWS:
			case MOD:
			case MODE:
			case MODIFY:
			case MONTH:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case MUTEX:
			case MYSQL_ERRNO:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NESTED:
			case NETWORK_NAMESPACE:
			case NEVER:
			case NEW:
			case NEXT:
			case NO:
			case NODEGROUP:
			case NONE:
			case NOT:
			case NOWAIT:
			case NO_WAIT:
			case NTH_VALUE:
			case NTILE:
			case NULL:
			case NULLS:
			case NUMBER:
			case NVARCHAR:
			case OFF:
			case OFFSET:
			case OJ:
			case OLD:
			case ONE:
			case ONLY:
			case OPEN:
			case OPTIONAL:
			case OPTIONS:
			case ORDINALITY:
			case ORGANIZATION:
			case OTHERS:
			case OWNER:
			case PACK_KEYS:
			case PAGE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_LOCK_TIME:
			case PATH:
			case PERCENT_RANK:
			case PERSIST:
			case PERSIST_ONLY:
			case PHASE:
			case PLUGIN:
			case PLUGINS:
			case PLUGIN_DIR:
			case POINT:
			case POLYGON:
			case PORT:
			case PRECEDES:
			case PRECEDING:
			case PREPARE:
			case PRESERVE:
			case PREV:
			case PRIMARY:
			case PRIVILEGES:
			case PRIVILEGE_CHECKS_USER:
			case PROCESS:
			case PROCESSLIST:
			case PROFILE:
			case PROFILES:
			case PROXY:
			case QUARTER:
			case QUERY:
			case QUICK:
			case RANDOM:
			case RANK:
			case READ_ONLY:
			case REBUILD:
			case RECOVER:
			case REDO_BUFFER_SIZE:
			case REDUNDANT:
			case REFERENCE:
			case RELAY:
			case RELAYLOG:
			case RELAY_LOG_FILE:
			case RELAY_LOG_POS:
			case RELAY_THREAD:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPEAT:
			case REPEATABLE:
			case REPLACE:
			case REPLICATE_DO_DB:
			case REPLICATE_DO_TABLE:
			case REPLICATE_IGNORE_DB:
			case REPLICATE_IGNORE_TABLE:
			case REPLICATE_REWRITE_DB:
			case REPLICATE_WILD_DO_TABLE:
			case REPLICATE_WILD_IGNORE_TABLE:
			case REPLICATION:
			case REQUIRE_ROW_FORMAT:
			case RESET:
			case RESOURCE:
			case RESPECT:
			case RESTART:
			case RESTORE:
			case RESUME:
			case RETAIN:
			case RETURNED_SQLSTATE:
			case RETURNING:
			case RETURNS:
			case REUSE:
			case REVERSE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROTATE:
			case ROUTINE:
			case ROW:
			case ROW_COUNT:
			case ROW_FORMAT:
			case ROW_NUMBER:
			case RTREE:
			case SAVEPOINT:
			case SCHEDULE:
			case SCHEMA:
			case SCHEMA_NAME:
			case SECOND:
			case SECONDARY:
			case SECONDARY_ENGINE:
			case SECONDARY_ENGINE_ATTRIBUTE:
			case SECONDARY_LOAD:
			case SECONDARY_UNLOAD:
			case SECURITY:
			case SERIAL:
			case SERIALIZABLE:
			case SERVER:
			case SESSION:
			case SHARE:
			case SHUTDOWN:
			case SIGNED:
			case SIMPLE:
			case SLAVE:
			case SLOW:
			case SNAPSHOT:
			case SOCKET:
			case SONAME:
			case SOUNDS:
			case SOURCE:
			case SQL_AFTER_GTIDS:
			case SQL_AFTER_MTS_GAPS:
			case SQL_BEFORE_GTIDS:
			case SQL_BUFFER_RESULT:
			case SQL_NO_CACHE:
			case SQL_THREAD:
			case SRID:
			case STACKED:
			case START:
			case STARTS:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STRING:
			case SUBCLASS_ORIGIN:
			case SUBJECT:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case SUPER:
			case SUSPEND:
			case SWAPS:
			case SWITCHES:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TABLESPACE:
			case TABLE_CHECKSUM:
			case TABLE_NAME:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case THAN:
			case THREAD_PRIORITY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMP_ADD:
			case TIMESTAMP_DIFF:
			case TLS:
			case TRANSACTION:
			case TRIGGERS:
			case TRUE:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDEFINED:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case UNICODE:
			case UNINSTALL:
			case UNKNOWN:
			case UNTIL:
			case UPGRADE:
			case USER:
			case USER_RESOURCES:
			case USE_FRM:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case VALIDATION:
			case VALUE:
			case VALUES:
			case VARIABLES:
			case VCPU:
			case VIEW:
			case VISIBLE:
			case WAIT:
			case WARNINGS:
			case WEEK:
			case WEIGHT_STRING:
			case WITHOUT:
			case WORK:
			case WRAPPER:
			case X509:
			case XA:
			case XID:
			case XML:
			case YEAR:
			case YEAR_MONTH:
			case JSON_ARRAY:
			case JSON_ARRAY_APPEND:
			case JSON_ARRAY_INSERT:
			case JSON_CONTAINS:
			case JSON_CONTAINS_PATH:
			case JSON_DEPTH:
			case JSON_EXTRACT:
			case JSON_INSERT:
			case JSON_KEYS:
			case JSON_LENGTH:
			case JSON_MERGE:
			case JSON_MERGE_PATCH:
			case JSON_MERGE_PRESERVE:
			case JSON_OBJECT:
			case JSON_OVERLAPS:
			case JSON_PRETTY:
			case JSON_QUOTE:
			case JSON_REMOVE:
			case JSON_REPLACE:
			case JSON_SCHEMA_VALID:
			case JSON_SCHEMA_VALIDATION_REPORT:
			case JSON_SEARCH:
			case JSON_SET:
			case JSON_STORAGE_FREE:
			case JSON_STORAGE_SIZE:
			case JSON_TYPE:
			case JSON_UNQUOTE:
			case JSON_VALID:
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
			case BQUOTA_STRING:
			case NCHAR_TEXT:
			case UNDERSCORE_CHARSET:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
			case IDENTIFIER_:
			case IP_ADDRESS:
				{
				setState(1135);
				frameStart();
				}
				break;
			case BETWEEN:
				{
				setState(1136);
				frameBetween();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FrameStartContext extends ParserRuleContext {
		public TerminalNode CURRENT() { return getToken(BaseRuleParser.CURRENT, 0); }
		public TerminalNode ROW() { return getToken(BaseRuleParser.ROW, 0); }
		public TerminalNode UNBOUNDED() { return getToken(BaseRuleParser.UNBOUNDED, 0); }
		public TerminalNode PRECEDING() { return getToken(BaseRuleParser.PRECEDING, 0); }
		public TerminalNode FOLLOWING() { return getToken(BaseRuleParser.FOLLOWING, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public FrameStartContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameStart; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFrameStart(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFrameStart(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFrameStart(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameStartContext frameStart() throws RecognitionException {
		FrameStartContext _localctx = new FrameStartContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_frameStart);
		try {
			setState(1151);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1139);
				match(CURRENT);
				setState(1140);
				match(ROW);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1141);
				match(UNBOUNDED);
				setState(1142);
				match(PRECEDING);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1143);
				match(UNBOUNDED);
				setState(1144);
				match(FOLLOWING);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1145);
				expr(0);
				setState(1146);
				match(PRECEDING);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1148);
				expr(0);
				setState(1149);
				match(FOLLOWING);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FrameEndContext extends ParserRuleContext {
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public FrameEndContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameEnd; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFrameEnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFrameEnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFrameEnd(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameEndContext frameEnd() throws RecognitionException {
		FrameEndContext _localctx = new FrameEndContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_frameEnd);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1153);
			frameStart();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FrameBetweenContext extends ParserRuleContext {
		public TerminalNode BETWEEN() { return getToken(BaseRuleParser.BETWEEN, 0); }
		public FrameStartContext frameStart() {
			return getRuleContext(FrameStartContext.class,0);
		}
		public TerminalNode AND() { return getToken(BaseRuleParser.AND, 0); }
		public FrameEndContext frameEnd() {
			return getRuleContext(FrameEndContext.class,0);
		}
		public FrameBetweenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_frameBetween; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFrameBetween(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFrameBetween(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFrameBetween(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FrameBetweenContext frameBetween() throws RecognitionException {
		FrameBetweenContext _localctx = new FrameBetweenContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_frameBetween);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1155);
			match(BETWEEN);
			setState(1156);
			frameStart();
			setState(1157);
			match(AND);
			setState(1158);
			frameEnd();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SpecialFunctionContext extends ParserRuleContext {
		public CastFunctionContext castFunction() {
			return getRuleContext(CastFunctionContext.class,0);
		}
		public ConvertFunctionContext convertFunction() {
			return getRuleContext(ConvertFunctionContext.class,0);
		}
		public CurrentUserFunctionContext currentUserFunction() {
			return getRuleContext(CurrentUserFunctionContext.class,0);
		}
		public CharFunctionContext charFunction() {
			return getRuleContext(CharFunctionContext.class,0);
		}
		public ExtractFunctionContext extractFunction() {
			return getRuleContext(ExtractFunctionContext.class,0);
		}
		public GroupConcatFunctionContext groupConcatFunction() {
			return getRuleContext(GroupConcatFunctionContext.class,0);
		}
		public PositionFunctionContext positionFunction() {
			return getRuleContext(PositionFunctionContext.class,0);
		}
		public SubstringFunctionContext substringFunction() {
			return getRuleContext(SubstringFunctionContext.class,0);
		}
		public TrimFunctionContext trimFunction() {
			return getRuleContext(TrimFunctionContext.class,0);
		}
		public ValuesFunctionContext valuesFunction() {
			return getRuleContext(ValuesFunctionContext.class,0);
		}
		public WeightStringFunctionContext weightStringFunction() {
			return getRuleContext(WeightStringFunctionContext.class,0);
		}
		public WindowFunctionContext windowFunction() {
			return getRuleContext(WindowFunctionContext.class,0);
		}
		public GroupingFunctionContext groupingFunction() {
			return getRuleContext(GroupingFunctionContext.class,0);
		}
		public SpecialFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_specialFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSpecialFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSpecialFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSpecialFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SpecialFunctionContext specialFunction() throws RecognitionException {
		SpecialFunctionContext _localctx = new SpecialFunctionContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_specialFunction);
		try {
			setState(1173);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CAST:
				enterOuterAlt(_localctx, 1);
				{
				setState(1160);
				castFunction();
				}
				break;
			case CONVERT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1161);
				convertFunction();
				}
				break;
			case CURRENT_USER:
				enterOuterAlt(_localctx, 3);
				{
				setState(1162);
				currentUserFunction();
				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 4);
				{
				setState(1163);
				charFunction();
				}
				break;
			case EXTRACT:
				enterOuterAlt(_localctx, 5);
				{
				setState(1164);
				extractFunction();
				}
				break;
			case GROUP_CONCAT:
				enterOuterAlt(_localctx, 6);
				{
				setState(1165);
				groupConcatFunction();
				}
				break;
			case POSITION:
				enterOuterAlt(_localctx, 7);
				{
				setState(1166);
				positionFunction();
				}
				break;
			case SUBSTRING:
			case SUBSTR:
				enterOuterAlt(_localctx, 8);
				{
				setState(1167);
				substringFunction();
				}
				break;
			case TRIM:
				enterOuterAlt(_localctx, 9);
				{
				setState(1168);
				trimFunction();
				}
				break;
			case VALUES:
				enterOuterAlt(_localctx, 10);
				{
				setState(1169);
				valuesFunction();
				}
				break;
			case WEIGHT_STRING:
				enterOuterAlt(_localctx, 11);
				{
				setState(1170);
				weightStringFunction();
				}
				break;
			case CUME_DIST:
			case DENSE_RANK:
			case FIRST_VALUE:
			case LAG:
			case LAST_VALUE:
			case LEAD:
			case NTH_VALUE:
			case NTILE:
			case PERCENT_RANK:
			case RANK:
			case ROW_NUMBER:
				enterOuterAlt(_localctx, 12);
				{
				setState(1171);
				windowFunction();
				}
				break;
			case GROUPING:
				enterOuterAlt(_localctx, 13);
				{
				setState(1172);
				groupingFunction();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CurrentUserFunctionContext extends ParserRuleContext {
		public TerminalNode CURRENT_USER() { return getToken(BaseRuleParser.CURRENT_USER, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public CurrentUserFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_currentUserFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCurrentUserFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCurrentUserFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCurrentUserFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CurrentUserFunctionContext currentUserFunction() throws RecognitionException {
		CurrentUserFunctionContext _localctx = new CurrentUserFunctionContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_currentUserFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1175);
			match(CURRENT_USER);
			setState(1178);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(1176);
				match(LP_);
				setState(1177);
				match(RP_);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupingFunctionContext extends ParserRuleContext {
		public TerminalNode GROUPING() { return getToken(BaseRuleParser.GROUPING, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public GroupingFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupingFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterGroupingFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitGroupingFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitGroupingFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupingFunctionContext groupingFunction() throws RecognitionException {
		GroupingFunctionContext _localctx = new GroupingFunctionContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_groupingFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1180);
			match(GROUPING);
			setState(1181);
			match(LP_);
			setState(1182);
			expr(0);
			setState(1187);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1183);
				match(COMMA_);
				setState(1184);
				expr(0);
				}
				}
				setState(1189);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1190);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class GroupConcatFunctionContext extends ParserRuleContext {
		public TerminalNode GROUP_CONCAT() { return getToken(BaseRuleParser.GROUP_CONCAT, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public DistinctContext distinct() {
			return getRuleContext(DistinctContext.class,0);
		}
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(BaseRuleParser.ASTERISK_, 0); }
		public OrderByClauseContext orderByClause() {
			return getRuleContext(OrderByClauseContext.class,0);
		}
		public TerminalNode SEPARATOR() { return getToken(BaseRuleParser.SEPARATOR, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public GroupConcatFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_groupConcatFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterGroupConcatFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitGroupConcatFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitGroupConcatFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final GroupConcatFunctionContext groupConcatFunction() throws RecognitionException {
		GroupConcatFunctionContext _localctx = new GroupConcatFunctionContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_groupConcatFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1192);
			match(GROUP_CONCAT);
			setState(1193);
			match(LP_);
			setState(1195);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DISTINCT) {
				{
				setState(1194);
				distinct();
				}
			}

			setState(1206);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GROUP_CONCAT:
			case CAST:
			case POSITION:
			case SUBSTRING:
			case SUBSTR:
			case EXTRACT:
			case TRIM:
			case LAST_DAY:
			case TRADITIONAL:
			case TREE:
			case MYSQL_MAIN:
			case MYSQL_ADMIN:
			case INSTANT:
			case INPLACE:
			case COPY:
			case UL_BINARY:
			case AUTOCOMMIT:
			case REDO_LOG:
			case ARCHIVE:
			case BLACKHOLE:
			case CSV:
			case FEDERATED:
			case INNODB:
			case MEMORY:
			case MRG_MYISAM:
			case MYISAM:
			case NDB:
			case NDBCLUSTER:
			case PERFORMANCE_SCHEMA:
			case TOKUDB:
			case ACCOUNT:
			case ACTION:
			case ACTIVE:
			case ADMIN:
			case AFTER:
			case AGAINST:
			case AGGREGATE:
			case ALGORITHM:
			case ALWAYS:
			case ANY:
			case ARRAY:
			case ASCII:
			case AT:
			case ATTRIBUTE:
			case AUTOEXTEND_SIZE:
			case AUTO_INCREMENT:
			case AVG:
			case BIT_XOR:
			case AVG_ROW_LENGTH:
			case BACKUP:
			case BEFORE:
			case BEGIN:
			case BINARY:
			case BINLOG:
			case BIT:
			case BLOCK:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BUCKETS:
			case BYTE:
			case CACHE:
			case CASCADED:
			case CASE:
			case CATALOG_NAME:
			case CHAIN:
			case CHANGED:
			case CHANNEL:
			case CHAR:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLASS_ORIGIN:
			case CLIENT:
			case CLONE:
			case CLOSE:
			case COALESCE:
			case CODE:
			case COLLATION:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COLUMN_NAME:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETION:
			case COMPONENT:
			case COMPRESSED:
			case COMPRESSION:
			case CONCURRENT:
			case CONNECTION:
			case CONSISTENT:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONTAINS:
			case CONTEXT:
			case CONVERT:
			case CPU:
			case CREATE:
			case CUME_DIST:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case CURSOR_NAME:
			case DATA:
			case DATABASE:
			case DATAFILE:
			case DATE:
			case DATETIME:
			case DAY:
			case DAY_MINUTE:
			case DEALLOCATE:
			case DEFAULT:
			case DEFAULT_AUTH:
			case DEFINER:
			case DEFINITION:
			case DELAY_KEY_WRITE:
			case DENSE_RANK:
			case DESCRIPTION:
			case DIAGNOSTICS:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DO:
			case DROP:
			case DUMPFILE:
			case DUPLICATE:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTION:
			case END:
			case ENDS:
			case ENFORCED:
			case ENGINE:
			case ENGINES:
			case ENGINE_ATTRIBUTE:
			case ENUM:
			case ERROR:
			case ERRORS:
			case ESCAPE:
			case EVENT:
			case EVENTS:
			case EVERY:
			case EXCHANGE:
			case EXCLUDE:
			case EXECUTE:
			case EXISTS:
			case EXPANSION:
			case EXPIRE:
			case EXPORT:
			case EXTENDED:
			case EXTENT_SIZE:
			case FAILED_LOGIN_ATTEMPTS:
			case FALSE:
			case FAST:
			case FAULTS:
			case FILE:
			case FILE_BLOCK_SIZE:
			case FILTER:
			case FIRST:
			case FIRST_VALUE:
			case FIXED:
			case FLUSH:
			case FOLLOWING:
			case FOLLOWS:
			case FORMAT:
			case FOUND:
			case FULL:
			case GENERAL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case GET_FORMAT:
			case GET_MASTER_PUBLIC_KEY:
			case GLOBAL:
			case GRANTS:
			case GROUPING:
			case GROUPS:
			case GROUP_REPLICATION:
			case HANDLER:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HISTORY:
			case HOST:
			case HOSTS:
			case HOUR:
			case IDENTIFIED:
			case IF:
			case IGNORE_SERVER_IDS:
			case IMPORT:
			case INACTIVE:
			case INDEXES:
			case INITIAL_SIZE:
			case INSERT:
			case INSERT_METHOD:
			case INSTALL:
			case INSTANCE:
			case INTERVAL:
			case INVISIBLE:
			case INVOKER:
			case IO:
			case IPC:
			case ISOLATION:
			case ISSUER:
			case JSON:
			case JSON_TABLE:
			case JSON_VALUE:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LAG:
			case LANGUAGE:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEAVES:
			case LEFT:
			case LESS:
			case LEVEL:
			case LINESTRING:
			case LIST:
			case LOCAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCKED:
			case LOCKS:
			case LOGFILE:
			case LOGS:
			case MASTER:
			case MASTER_AUTO_POSITION:
			case MASTER_COMPRESSION_ALGORITHM:
			case MASTER_CONNECT_RETRY:
			case MASTER_DELAY:
			case MASTER_HEARTBEAT_PERIOD:
			case MASTER_HOST:
			case MASTER_LOG_FILE:
			case MASTER_LOG_POS:
			case MASTER_PASSWORD:
			case MASTER_PORT:
			case MASTER_PUBLIC_KEY_PATH:
			case MASTER_RETRY_COUNT:
			case MASTER_SERVER_ID:
			case MASTER_SSL:
			case MASTER_SSL_CA:
			case MASTER_SSL_CAPATH:
			case MASTER_SSL_CERT:
			case MASTER_SSL_CIPHER:
			case MASTER_SSL_CRL:
			case MASTER_SSL_CRLPATH:
			case MASTER_SSL_KEY:
			case MASTER_TLS_CIPHERSUITES:
			case MASTER_TLS_VERSION:
			case MASTER_USER:
			case MASTER_ZSTD_COMPRESSION_LEVEL:
			case MATCH:
			case MAXVALUE:
			case MAX_CONNECTIONS_PER_HOUR:
			case MAX_QUERIES_PER_HOUR:
			case MAX_ROWS:
			case MAX_SIZE:
			case MAX_UPDATES_PER_HOUR:
			case MAX_USER_CONNECTIONS:
			case MEDIUM:
			case MEMBER:
			case MERGE:
			case MESSAGE_TEXT:
			case MICROSECOND:
			case MIGRATE:
			case MINUTE:
			case MIN_ROWS:
			case MOD:
			case MODE:
			case MODIFY:
			case MONTH:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case MUTEX:
			case MYSQL_ERRNO:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NESTED:
			case NETWORK_NAMESPACE:
			case NEVER:
			case NEW:
			case NEXT:
			case NO:
			case NODEGROUP:
			case NONE:
			case NOT:
			case NOWAIT:
			case NO_WAIT:
			case NTH_VALUE:
			case NTILE:
			case NULL:
			case NULLS:
			case NUMBER:
			case NVARCHAR:
			case OFF:
			case OFFSET:
			case OJ:
			case OLD:
			case ONE:
			case ONLY:
			case OPEN:
			case OPTIONAL:
			case OPTIONS:
			case ORDINALITY:
			case ORGANIZATION:
			case OTHERS:
			case OWNER:
			case PACK_KEYS:
			case PAGE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_LOCK_TIME:
			case PATH:
			case PERCENT_RANK:
			case PERSIST:
			case PERSIST_ONLY:
			case PHASE:
			case PLUGIN:
			case PLUGINS:
			case PLUGIN_DIR:
			case POINT:
			case POLYGON:
			case PORT:
			case PRECEDES:
			case PRECEDING:
			case PREPARE:
			case PRESERVE:
			case PREV:
			case PRIMARY:
			case PRIVILEGES:
			case PRIVILEGE_CHECKS_USER:
			case PROCESS:
			case PROCESSLIST:
			case PROFILE:
			case PROFILES:
			case PROXY:
			case QUARTER:
			case QUERY:
			case QUICK:
			case RANDOM:
			case RANK:
			case READ_ONLY:
			case REBUILD:
			case RECOVER:
			case REDO_BUFFER_SIZE:
			case REDUNDANT:
			case REFERENCE:
			case RELAY:
			case RELAYLOG:
			case RELAY_LOG_FILE:
			case RELAY_LOG_POS:
			case RELAY_THREAD:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPEAT:
			case REPEATABLE:
			case REPLACE:
			case REPLICATE_DO_DB:
			case REPLICATE_DO_TABLE:
			case REPLICATE_IGNORE_DB:
			case REPLICATE_IGNORE_TABLE:
			case REPLICATE_REWRITE_DB:
			case REPLICATE_WILD_DO_TABLE:
			case REPLICATE_WILD_IGNORE_TABLE:
			case REPLICATION:
			case REQUIRE_ROW_FORMAT:
			case RESET:
			case RESOURCE:
			case RESPECT:
			case RESTART:
			case RESTORE:
			case RESUME:
			case RETAIN:
			case RETURNED_SQLSTATE:
			case RETURNING:
			case RETURNS:
			case REUSE:
			case REVERSE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROTATE:
			case ROUTINE:
			case ROW:
			case ROW_COUNT:
			case ROW_FORMAT:
			case ROW_NUMBER:
			case RTREE:
			case SAVEPOINT:
			case SCHEDULE:
			case SCHEMA:
			case SCHEMA_NAME:
			case SECOND:
			case SECONDARY:
			case SECONDARY_ENGINE:
			case SECONDARY_ENGINE_ATTRIBUTE:
			case SECONDARY_LOAD:
			case SECONDARY_UNLOAD:
			case SECURITY:
			case SERIAL:
			case SERIALIZABLE:
			case SERVER:
			case SESSION:
			case SHARE:
			case SHUTDOWN:
			case SIGNED:
			case SIMPLE:
			case SLAVE:
			case SLOW:
			case SNAPSHOT:
			case SOCKET:
			case SONAME:
			case SOUNDS:
			case SOURCE:
			case SQL_AFTER_GTIDS:
			case SQL_AFTER_MTS_GAPS:
			case SQL_BEFORE_GTIDS:
			case SQL_BUFFER_RESULT:
			case SQL_NO_CACHE:
			case SQL_THREAD:
			case SRID:
			case STACKED:
			case START:
			case STARTS:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STRING:
			case SUBCLASS_ORIGIN:
			case SUBJECT:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case SUPER:
			case SUSPEND:
			case SWAPS:
			case SWITCHES:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TABLESPACE:
			case TABLE_CHECKSUM:
			case TABLE_NAME:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case THAN:
			case THREAD_PRIORITY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMP_ADD:
			case TIMESTAMP_DIFF:
			case TLS:
			case TRANSACTION:
			case TRIGGERS:
			case TRUE:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDEFINED:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case UNICODE:
			case UNINSTALL:
			case UNKNOWN:
			case UNTIL:
			case UPGRADE:
			case USER:
			case USER_RESOURCES:
			case USE_FRM:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case VALIDATION:
			case VALUE:
			case VALUES:
			case VARIABLES:
			case VCPU:
			case VIEW:
			case VISIBLE:
			case WAIT:
			case WARNINGS:
			case WEEK:
			case WEIGHT_STRING:
			case WITHOUT:
			case WORK:
			case WRAPPER:
			case X509:
			case XA:
			case XID:
			case XML:
			case YEAR:
			case YEAR_MONTH:
			case JSON_ARRAY:
			case JSON_ARRAY_APPEND:
			case JSON_ARRAY_INSERT:
			case JSON_CONTAINS:
			case JSON_CONTAINS_PATH:
			case JSON_DEPTH:
			case JSON_EXTRACT:
			case JSON_INSERT:
			case JSON_KEYS:
			case JSON_LENGTH:
			case JSON_MERGE:
			case JSON_MERGE_PATCH:
			case JSON_MERGE_PRESERVE:
			case JSON_OBJECT:
			case JSON_OVERLAPS:
			case JSON_PRETTY:
			case JSON_QUOTE:
			case JSON_REMOVE:
			case JSON_REPLACE:
			case JSON_SCHEMA_VALID:
			case JSON_SCHEMA_VALIDATION_REPORT:
			case JSON_SEARCH:
			case JSON_SET:
			case JSON_STORAGE_FREE:
			case JSON_STORAGE_SIZE:
			case JSON_TYPE:
			case JSON_UNQUOTE:
			case JSON_VALID:
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
			case BQUOTA_STRING:
			case NCHAR_TEXT:
			case UNDERSCORE_CHARSET:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
			case IDENTIFIER_:
			case IP_ADDRESS:
				{
				setState(1197);
				expr(0);
				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1198);
					match(COMMA_);
					setState(1199);
					expr(0);
					}
					}
					setState(1204);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1205);
				match(ASTERISK_);
				}
				break;
			case RP_:
			case ORDER:
			case SEPARATOR:
				break;
			default:
				break;
			}
			setState(1209);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1208);
				orderByClause();
				}
			}

			setState(1213);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SEPARATOR) {
				{
				setState(1211);
				match(SEPARATOR);
				setState(1212);
				expr(0);
				}
			}

			setState(1215);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowFunctionContext extends ParserRuleContext {
		public Token funcName;
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public WindowingClauseContext windowingClause() {
			return getRuleContext(WindowingClauseContext.class,0);
		}
		public TerminalNode ROW_NUMBER() { return getToken(BaseRuleParser.ROW_NUMBER, 0); }
		public TerminalNode RANK() { return getToken(BaseRuleParser.RANK, 0); }
		public TerminalNode DENSE_RANK() { return getToken(BaseRuleParser.DENSE_RANK, 0); }
		public TerminalNode CUME_DIST() { return getToken(BaseRuleParser.CUME_DIST, 0); }
		public TerminalNode PERCENT_RANK() { return getToken(BaseRuleParser.PERCENT_RANK, 0); }
		public TerminalNode NTILE() { return getToken(BaseRuleParser.NTILE, 0); }
		public SimpleExprContext simpleExpr() {
			return getRuleContext(SimpleExprContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode LEAD() { return getToken(BaseRuleParser.LEAD, 0); }
		public TerminalNode LAG() { return getToken(BaseRuleParser.LAG, 0); }
		public LeadLagInfoContext leadLagInfo() {
			return getRuleContext(LeadLagInfoContext.class,0);
		}
		public NullTreatmentContext nullTreatment() {
			return getRuleContext(NullTreatmentContext.class,0);
		}
		public TerminalNode FIRST_VALUE() { return getToken(BaseRuleParser.FIRST_VALUE, 0); }
		public TerminalNode LAST_VALUE() { return getToken(BaseRuleParser.LAST_VALUE, 0); }
		public TerminalNode COMMA_() { return getToken(BaseRuleParser.COMMA_, 0); }
		public TerminalNode NTH_VALUE() { return getToken(BaseRuleParser.NTH_VALUE, 0); }
		public TerminalNode FROM() { return getToken(BaseRuleParser.FROM, 0); }
		public TerminalNode FIRST() { return getToken(BaseRuleParser.FIRST, 0); }
		public TerminalNode LAST() { return getToken(BaseRuleParser.LAST, 0); }
		public WindowFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterWindowFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitWindowFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitWindowFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowFunctionContext windowFunction() throws RecognitionException {
		WindowFunctionContext _localctx = new WindowFunctionContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_windowFunction);
		int _la;
		try {
			setState(1261);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CUME_DIST:
			case DENSE_RANK:
			case PERCENT_RANK:
			case RANK:
			case ROW_NUMBER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1217);
				((WindowFunctionContext)_localctx).funcName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==CUME_DIST || _la==DENSE_RANK || _la==PERCENT_RANK || _la==RANK || _la==ROW_NUMBER) ) {
					((WindowFunctionContext)_localctx).funcName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1218);
				match(LP_);
				setState(1219);
				match(RP_);
				setState(1220);
				windowingClause();
				}
				break;
			case NTILE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1221);
				((WindowFunctionContext)_localctx).funcName = match(NTILE);
				{
				setState(1222);
				simpleExpr(0);
				}
				setState(1223);
				windowingClause();
				}
				break;
			case LAG:
			case LEAD:
				enterOuterAlt(_localctx, 3);
				{
				setState(1225);
				((WindowFunctionContext)_localctx).funcName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LAG || _la==LEAD) ) {
					((WindowFunctionContext)_localctx).funcName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1226);
				match(LP_);
				setState(1227);
				expr(0);
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(1228);
					leadLagInfo();
					}
				}

				setState(1231);
				match(RP_);
				setState(1233);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE || _la==RESPECT) {
					{
					setState(1232);
					nullTreatment();
					}
				}

				setState(1235);
				windowingClause();
				}
				break;
			case FIRST_VALUE:
			case LAST_VALUE:
				enterOuterAlt(_localctx, 4);
				{
				setState(1237);
				((WindowFunctionContext)_localctx).funcName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==FIRST_VALUE || _la==LAST_VALUE) ) {
					((WindowFunctionContext)_localctx).funcName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1238);
				match(LP_);
				setState(1239);
				expr(0);
				setState(1240);
				match(RP_);
				setState(1242);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE || _la==RESPECT) {
					{
					setState(1241);
					nullTreatment();
					}
				}

				setState(1244);
				windowingClause();
				}
				break;
			case NTH_VALUE:
				enterOuterAlt(_localctx, 5);
				{
				setState(1246);
				((WindowFunctionContext)_localctx).funcName = match(NTH_VALUE);
				setState(1247);
				match(LP_);
				setState(1248);
				expr(0);
				setState(1249);
				match(COMMA_);
				setState(1250);
				simpleExpr(0);
				setState(1251);
				match(RP_);
				setState(1254);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FROM) {
					{
					setState(1252);
					match(FROM);
					setState(1253);
					_la = _input.LA(1);
					if ( !(_la==FIRST || _la==LAST) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
				}

				setState(1257);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==IGNORE || _la==RESPECT) {
					{
					setState(1256);
					nullTreatment();
					}
				}

				setState(1259);
				windowingClause();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WindowingClauseContext extends ParserRuleContext {
		public IdentifierContext windowName;
		public TerminalNode OVER() { return getToken(BaseRuleParser.OVER, 0); }
		public WindowSpecificationContext windowSpecification() {
			return getRuleContext(WindowSpecificationContext.class,0);
		}
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public WindowingClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_windowingClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterWindowingClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitWindowingClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitWindowingClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowingClauseContext windowingClause() throws RecognitionException {
		WindowingClauseContext _localctx = new WindowingClauseContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_windowingClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1263);
			match(OVER);
			setState(1266);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GROUP_CONCAT:
			case CAST:
			case POSITION:
			case SUBSTRING:
			case SUBSTR:
			case EXTRACT:
			case TRIM:
			case LAST_DAY:
			case TRADITIONAL:
			case TREE:
			case MYSQL_MAIN:
			case MYSQL_ADMIN:
			case INSTANT:
			case INPLACE:
			case COPY:
			case UL_BINARY:
			case AUTOCOMMIT:
			case REDO_LOG:
			case ARCHIVE:
			case BLACKHOLE:
			case CSV:
			case FEDERATED:
			case INNODB:
			case MEMORY:
			case MRG_MYISAM:
			case MYISAM:
			case NDB:
			case NDBCLUSTER:
			case PERFORMANCE_SCHEMA:
			case TOKUDB:
			case ACCOUNT:
			case ACTION:
			case ACTIVE:
			case ADMIN:
			case AFTER:
			case AGAINST:
			case AGGREGATE:
			case ALGORITHM:
			case ALWAYS:
			case ANY:
			case ARRAY:
			case ASCII:
			case AT:
			case ATTRIBUTE:
			case AUTOEXTEND_SIZE:
			case AUTO_INCREMENT:
			case AVG:
			case BIT_XOR:
			case AVG_ROW_LENGTH:
			case BACKUP:
			case BEFORE:
			case BEGIN:
			case BINLOG:
			case BIT:
			case BLOCK:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BUCKETS:
			case BYTE:
			case CACHE:
			case CASCADED:
			case CATALOG_NAME:
			case CHAIN:
			case CHANGED:
			case CHANNEL:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLASS_ORIGIN:
			case CLIENT:
			case CLONE:
			case CLOSE:
			case COALESCE:
			case CODE:
			case COLLATION:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COLUMN_NAME:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETION:
			case COMPONENT:
			case COMPRESSED:
			case COMPRESSION:
			case CONCURRENT:
			case CONNECTION:
			case CONSISTENT:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONTAINS:
			case CONTEXT:
			case CPU:
			case CREATE:
			case CURRENT:
			case CURSOR_NAME:
			case DATA:
			case DATAFILE:
			case DATE:
			case DATETIME:
			case DAY:
			case DAY_MINUTE:
			case DEALLOCATE:
			case DEFAULT:
			case DEFAULT_AUTH:
			case DEFINER:
			case DEFINITION:
			case DELAY_KEY_WRITE:
			case DESCRIPTION:
			case DIAGNOSTICS:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DO:
			case DROP:
			case DUMPFILE:
			case DUPLICATE:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTION:
			case END:
			case ENDS:
			case ENFORCED:
			case ENGINE:
			case ENGINES:
			case ENGINE_ATTRIBUTE:
			case ENUM:
			case ERROR:
			case ERRORS:
			case ESCAPE:
			case EVENT:
			case EVENTS:
			case EVERY:
			case EXCHANGE:
			case EXCLUDE:
			case EXECUTE:
			case EXPANSION:
			case EXPIRE:
			case EXPORT:
			case EXTENDED:
			case EXTENT_SIZE:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FAULTS:
			case FILE:
			case FILE_BLOCK_SIZE:
			case FILTER:
			case FIRST:
			case FIXED:
			case FLUSH:
			case FOLLOWING:
			case FOLLOWS:
			case FORMAT:
			case FOUND:
			case FULL:
			case GENERAL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case GET_FORMAT:
			case GET_MASTER_PUBLIC_KEY:
			case GLOBAL:
			case GRANTS:
			case GROUPS:
			case GROUP_REPLICATION:
			case HANDLER:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HISTORY:
			case HOST:
			case HOSTS:
			case HOUR:
			case IDENTIFIED:
			case IGNORE_SERVER_IDS:
			case IMPORT:
			case INACTIVE:
			case INDEXES:
			case INITIAL_SIZE:
			case INSERT_METHOD:
			case INSTALL:
			case INSTANCE:
			case INVISIBLE:
			case INVOKER:
			case IO:
			case IPC:
			case ISOLATION:
			case ISSUER:
			case JSON:
			case JSON_VALUE:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LANGUAGE:
			case LAST:
			case LAST_VALUE:
			case LEAVES:
			case LESS:
			case LEVEL:
			case LINESTRING:
			case LIST:
			case LOCAL:
			case LOCKED:
			case LOCKS:
			case LOGFILE:
			case LOGS:
			case MASTER:
			case MASTER_AUTO_POSITION:
			case MASTER_COMPRESSION_ALGORITHM:
			case MASTER_CONNECT_RETRY:
			case MASTER_DELAY:
			case MASTER_HEARTBEAT_PERIOD:
			case MASTER_HOST:
			case MASTER_LOG_FILE:
			case MASTER_LOG_POS:
			case MASTER_PASSWORD:
			case MASTER_PORT:
			case MASTER_PUBLIC_KEY_PATH:
			case MASTER_RETRY_COUNT:
			case MASTER_SERVER_ID:
			case MASTER_SSL:
			case MASTER_SSL_CA:
			case MASTER_SSL_CAPATH:
			case MASTER_SSL_CERT:
			case MASTER_SSL_CIPHER:
			case MASTER_SSL_CRL:
			case MASTER_SSL_CRLPATH:
			case MASTER_SSL_KEY:
			case MASTER_TLS_CIPHERSUITES:
			case MASTER_TLS_VERSION:
			case MASTER_USER:
			case MASTER_ZSTD_COMPRESSION_LEVEL:
			case MAXVALUE:
			case MAX_CONNECTIONS_PER_HOUR:
			case MAX_QUERIES_PER_HOUR:
			case MAX_ROWS:
			case MAX_SIZE:
			case MAX_UPDATES_PER_HOUR:
			case MAX_USER_CONNECTIONS:
			case MEDIUM:
			case MEMBER:
			case MERGE:
			case MESSAGE_TEXT:
			case MICROSECOND:
			case MIGRATE:
			case MINUTE:
			case MIN_ROWS:
			case MODE:
			case MODIFY:
			case MONTH:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case MUTEX:
			case MYSQL_ERRNO:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NESTED:
			case NETWORK_NAMESPACE:
			case NEVER:
			case NEW:
			case NEXT:
			case NO:
			case NODEGROUP:
			case NONE:
			case NOWAIT:
			case NO_WAIT:
			case NULLS:
			case NUMBER:
			case NVARCHAR:
			case OFF:
			case OFFSET:
			case OJ:
			case OLD:
			case ONE:
			case ONLY:
			case OPEN:
			case OPTIONAL:
			case OPTIONS:
			case ORDINALITY:
			case ORGANIZATION:
			case OTHERS:
			case OWNER:
			case PACK_KEYS:
			case PAGE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_LOCK_TIME:
			case PATH:
			case PERSIST:
			case PERSIST_ONLY:
			case PHASE:
			case PLUGIN:
			case PLUGINS:
			case PLUGIN_DIR:
			case POINT:
			case POLYGON:
			case PORT:
			case PRECEDES:
			case PRECEDING:
			case PREPARE:
			case PRESERVE:
			case PREV:
			case PRIMARY:
			case PRIVILEGES:
			case PRIVILEGE_CHECKS_USER:
			case PROCESS:
			case PROCESSLIST:
			case PROFILE:
			case PROFILES:
			case PROXY:
			case QUARTER:
			case QUERY:
			case QUICK:
			case RANDOM:
			case RANK:
			case READ_ONLY:
			case REBUILD:
			case RECOVER:
			case REDO_BUFFER_SIZE:
			case REDUNDANT:
			case REFERENCE:
			case RELAY:
			case RELAYLOG:
			case RELAY_LOG_FILE:
			case RELAY_LOG_POS:
			case RELAY_THREAD:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPEATABLE:
			case REPLICATE_DO_DB:
			case REPLICATE_DO_TABLE:
			case REPLICATE_IGNORE_DB:
			case REPLICATE_IGNORE_TABLE:
			case REPLICATE_REWRITE_DB:
			case REPLICATE_WILD_DO_TABLE:
			case REPLICATE_WILD_IGNORE_TABLE:
			case REPLICATION:
			case REQUIRE_ROW_FORMAT:
			case RESET:
			case RESOURCE:
			case RESPECT:
			case RESTART:
			case RESTORE:
			case RESUME:
			case RETAIN:
			case RETURNED_SQLSTATE:
			case RETURNING:
			case RETURNS:
			case REUSE:
			case REVERSE:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROTATE:
			case ROUTINE:
			case ROW_COUNT:
			case ROW_FORMAT:
			case RTREE:
			case SAVEPOINT:
			case SCHEDULE:
			case SCHEMA_NAME:
			case SECOND:
			case SECONDARY:
			case SECONDARY_ENGINE:
			case SECONDARY_ENGINE_ATTRIBUTE:
			case SECONDARY_LOAD:
			case SECONDARY_UNLOAD:
			case SECURITY:
			case SERIAL:
			case SERIALIZABLE:
			case SERVER:
			case SESSION:
			case SHARE:
			case SHUTDOWN:
			case SIGNED:
			case SIMPLE:
			case SLAVE:
			case SLOW:
			case SNAPSHOT:
			case SOCKET:
			case SONAME:
			case SOUNDS:
			case SOURCE:
			case SQL_AFTER_GTIDS:
			case SQL_AFTER_MTS_GAPS:
			case SQL_BEFORE_GTIDS:
			case SQL_BUFFER_RESULT:
			case SQL_NO_CACHE:
			case SQL_THREAD:
			case SRID:
			case STACKED:
			case START:
			case STARTS:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STRING:
			case SUBCLASS_ORIGIN:
			case SUBJECT:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case SUPER:
			case SUSPEND:
			case SWAPS:
			case SWITCHES:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TABLESPACE:
			case TABLE_CHECKSUM:
			case TABLE_NAME:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case THAN:
			case THREAD_PRIORITY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMP_ADD:
			case TIMESTAMP_DIFF:
			case TLS:
			case TRANSACTION:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDEFINED:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case UNICODE:
			case UNINSTALL:
			case UNKNOWN:
			case UNTIL:
			case UPGRADE:
			case USER:
			case USER_RESOURCES:
			case USE_FRM:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case VALIDATION:
			case VALUE:
			case VARIABLES:
			case VCPU:
			case VIEW:
			case VISIBLE:
			case WAIT:
			case WARNINGS:
			case WEEK:
			case WEIGHT_STRING:
			case WITHOUT:
			case WORK:
			case WRAPPER:
			case X509:
			case XA:
			case XID:
			case XML:
			case YEAR:
			case YEAR_MONTH:
			case DOUBLE_QUOTED_TEXT:
			case BQUOTA_STRING:
			case UNDERSCORE_CHARSET:
			case IDENTIFIER_:
				{
				setState(1264);
				((WindowingClauseContext)_localctx).windowName = identifier();
				}
				break;
			case LP_:
				{
				setState(1265);
				windowSpecification();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LeadLagInfoContext extends ParserRuleContext {
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public TerminalNode QUESTION_() { return getToken(BaseRuleParser.QUESTION_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public LeadLagInfoContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_leadLagInfo; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLeadLagInfo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLeadLagInfo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLeadLagInfo(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LeadLagInfoContext leadLagInfo() throws RecognitionException {
		LeadLagInfoContext _localctx = new LeadLagInfoContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_leadLagInfo);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1268);
			match(COMMA_);
			setState(1269);
			_la = _input.LA(1);
			if ( !(_la==QUESTION_ || _la==NUMBER_) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1272);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA_) {
				{
				setState(1270);
				match(COMMA_);
				setState(1271);
				expr(0);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NullTreatmentContext extends ParserRuleContext {
		public TerminalNode NULLS() { return getToken(BaseRuleParser.NULLS, 0); }
		public TerminalNode RESPECT() { return getToken(BaseRuleParser.RESPECT, 0); }
		public TerminalNode IGNORE() { return getToken(BaseRuleParser.IGNORE, 0); }
		public NullTreatmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nullTreatment; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNullTreatment(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNullTreatment(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNullTreatment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NullTreatmentContext nullTreatment() throws RecognitionException {
		NullTreatmentContext _localctx = new NullTreatmentContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_nullTreatment);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1274);
			_la = _input.LA(1);
			if ( !(_la==IGNORE || _la==RESPECT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1275);
			match(NULLS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CheckTypeContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BaseRuleParser.FOR, 0); }
		public TerminalNode UPGRADE() { return getToken(BaseRuleParser.UPGRADE, 0); }
		public TerminalNode QUICK() { return getToken(BaseRuleParser.QUICK, 0); }
		public TerminalNode FAST() { return getToken(BaseRuleParser.FAST, 0); }
		public TerminalNode MEDIUM() { return getToken(BaseRuleParser.MEDIUM, 0); }
		public TerminalNode EXTENDED() { return getToken(BaseRuleParser.EXTENDED, 0); }
		public TerminalNode CHANGED() { return getToken(BaseRuleParser.CHANGED, 0); }
		public CheckTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_checkType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCheckType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCheckType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCheckType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CheckTypeContext checkType() throws RecognitionException {
		CheckTypeContext _localctx = new CheckTypeContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_checkType);
		try {
			setState(1284);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case FOR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1277);
				match(FOR);
				setState(1278);
				match(UPGRADE);
				}
				break;
			case QUICK:
				enterOuterAlt(_localctx, 2);
				{
				setState(1279);
				match(QUICK);
				}
				break;
			case FAST:
				enterOuterAlt(_localctx, 3);
				{
				setState(1280);
				match(FAST);
				}
				break;
			case MEDIUM:
				enterOuterAlt(_localctx, 4);
				{
				setState(1281);
				match(MEDIUM);
				}
				break;
			case EXTENDED:
				enterOuterAlt(_localctx, 5);
				{
				setState(1282);
				match(EXTENDED);
				}
				break;
			case CHANGED:
				enterOuterAlt(_localctx, 6);
				{
				setState(1283);
				match(CHANGED);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RepairTypeContext extends ParserRuleContext {
		public TerminalNode QUICK() { return getToken(BaseRuleParser.QUICK, 0); }
		public TerminalNode EXTENDED() { return getToken(BaseRuleParser.EXTENDED, 0); }
		public TerminalNode USE_FRM() { return getToken(BaseRuleParser.USE_FRM, 0); }
		public RepairTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repairType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterRepairType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitRepairType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitRepairType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RepairTypeContext repairType() throws RecognitionException {
		RepairTypeContext _localctx = new RepairTypeContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_repairType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1286);
			_la = _input.LA(1);
			if ( !(_la==EXTENDED || _la==QUICK || _la==USE_FRM) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CastFunctionContext extends ParserRuleContext {
		public TerminalNode CAST() { return getToken(BaseRuleParser.CAST, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode AS() { return getToken(BaseRuleParser.AS, 0); }
		public CastTypeContext castType() {
			return getRuleContext(CastTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TerminalNode ARRAY() { return getToken(BaseRuleParser.ARRAY, 0); }
		public TerminalNode AT() { return getToken(BaseRuleParser.AT, 0); }
		public TerminalNode TIME() { return getToken(BaseRuleParser.TIME, 0); }
		public TerminalNode ZONE() { return getToken(BaseRuleParser.ZONE, 0); }
		public TerminalNode DATETIME() { return getToken(BaseRuleParser.DATETIME, 0); }
		public TypeDatetimePrecisionContext typeDatetimePrecision() {
			return getRuleContext(TypeDatetimePrecisionContext.class,0);
		}
		public CastFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCastFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCastFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCastFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastFunctionContext castFunction() throws RecognitionException {
		CastFunctionContext _localctx = new CastFunctionContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_castFunction);
		int _la;
		try {
			setState(1312);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,117,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1288);
				match(CAST);
				setState(1289);
				match(LP_);
				setState(1290);
				expr(0);
				setState(1291);
				match(AS);
				setState(1292);
				castType();
				setState(1294);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ARRAY) {
					{
					setState(1293);
					match(ARRAY);
					}
				}

				setState(1296);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1298);
				match(CAST);
				setState(1299);
				match(LP_);
				setState(1300);
				expr(0);
				setState(1301);
				match(AT);
				setState(1302);
				match(TIME);
				setState(1303);
				match(ZONE);
				setState(1304);
				expr(0);
				setState(1305);
				match(AS);
				setState(1306);
				match(DATETIME);
				setState(1308);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1307);
					typeDatetimePrecision();
					}
				}

				setState(1310);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConvertFunctionContext extends ParserRuleContext {
		public TerminalNode CONVERT() { return getToken(BaseRuleParser.CONVERT, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode COMMA_() { return getToken(BaseRuleParser.COMMA_, 0); }
		public CastTypeContext castType() {
			return getRuleContext(CastTypeContext.class,0);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TerminalNode USING() { return getToken(BaseRuleParser.USING, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public ConvertFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_convertFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterConvertFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitConvertFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitConvertFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConvertFunctionContext convertFunction() throws RecognitionException {
		ConvertFunctionContext _localctx = new ConvertFunctionContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_convertFunction);
		try {
			setState(1328);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,118,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1314);
				match(CONVERT);
				setState(1315);
				match(LP_);
				setState(1316);
				expr(0);
				setState(1317);
				match(COMMA_);
				setState(1318);
				castType();
				setState(1319);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1321);
				match(CONVERT);
				setState(1322);
				match(LP_);
				setState(1323);
				expr(0);
				setState(1324);
				match(USING);
				setState(1325);
				charsetName();
				setState(1326);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CastTypeContext extends ParserRuleContext {
		public Token castTypeName;
		public TerminalNode BINARY() { return getToken(BaseRuleParser.BINARY, 0); }
		public FieldLengthContext fieldLength() {
			return getRuleContext(FieldLengthContext.class,0);
		}
		public TerminalNode CHAR() { return getToken(BaseRuleParser.CHAR, 0); }
		public CharsetWithOptBinaryContext charsetWithOptBinary() {
			return getRuleContext(CharsetWithOptBinaryContext.class,0);
		}
		public TerminalNode NCHAR() { return getToken(BaseRuleParser.NCHAR, 0); }
		public TerminalNode NATIONAL_CHAR() { return getToken(BaseRuleParser.NATIONAL_CHAR, 0); }
		public TerminalNode SIGNED() { return getToken(BaseRuleParser.SIGNED, 0); }
		public TerminalNode SIGNED_INT() { return getToken(BaseRuleParser.SIGNED_INT, 0); }
		public TerminalNode SIGNED_INTEGER() { return getToken(BaseRuleParser.SIGNED_INTEGER, 0); }
		public TerminalNode UNSIGNED() { return getToken(BaseRuleParser.UNSIGNED, 0); }
		public TerminalNode UNSIGNED_INT() { return getToken(BaseRuleParser.UNSIGNED_INT, 0); }
		public TerminalNode UNSIGNED_INTEGER() { return getToken(BaseRuleParser.UNSIGNED_INTEGER, 0); }
		public TerminalNode DATE() { return getToken(BaseRuleParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(BaseRuleParser.TIME, 0); }
		public TypeDatetimePrecisionContext typeDatetimePrecision() {
			return getRuleContext(TypeDatetimePrecisionContext.class,0);
		}
		public TerminalNode DATETIME() { return getToken(BaseRuleParser.DATETIME, 0); }
		public TerminalNode DECIMAL() { return getToken(BaseRuleParser.DECIMAL, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public TerminalNode JSON() { return getToken(BaseRuleParser.JSON, 0); }
		public TerminalNode REAL() { return getToken(BaseRuleParser.REAL, 0); }
		public TerminalNode PRECISION() { return getToken(BaseRuleParser.PRECISION, 0); }
		public TerminalNode DOUBLE() { return getToken(BaseRuleParser.DOUBLE, 0); }
		public TerminalNode FLOAT() { return getToken(BaseRuleParser.FLOAT, 0); }
		public CastTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_castType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCastType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCastType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCastType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CastTypeContext castType() throws RecognitionException {
		CastTypeContext _localctx = new CastTypeContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_castType);
		int _la;
		try {
			setState(1372);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case BINARY:
				enterOuterAlt(_localctx, 1);
				{
				setState(1330);
				((CastTypeContext)_localctx).castTypeName = match(BINARY);
				setState(1332);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1331);
					fieldLength();
					}
				}

				}
				break;
			case CHAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1334);
				((CastTypeContext)_localctx).castTypeName = match(CHAR);
				setState(1336);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1335);
					fieldLength();
					}
				}

				setState(1339);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 101)) & ~0x3f) == 0 && ((1L << (_la - 101)) & 2886285164545L) != 0) || _la==UNICODE) {
					{
					setState(1338);
					charsetWithOptBinary();
					}
				}

				}
				break;
			case NATIONAL_CHAR:
			case NCHAR:
				enterOuterAlt(_localctx, 3);
				{
				setState(1343);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NCHAR:
					{
					setState(1341);
					((CastTypeContext)_localctx).castTypeName = match(NCHAR);
					}
					break;
				case NATIONAL_CHAR:
					{
					setState(1342);
					((CastTypeContext)_localctx).castTypeName = match(NATIONAL_CHAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1346);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1345);
					fieldLength();
					}
				}

				}
				break;
			case SIGNED:
			case SIGNED_INT:
			case SIGNED_INTEGER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1348);
				((CastTypeContext)_localctx).castTypeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 650)) & ~0x3f) == 0 && ((1L << (_la - 650)) & 7L) != 0)) ) {
					((CastTypeContext)_localctx).castTypeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case UNSIGNED:
			case UNSIGNED_INT:
			case UNSIGNED_INTEGER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1349);
				((CastTypeContext)_localctx).castTypeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 772)) & ~0x3f) == 0 && ((1L << (_la - 772)) & 7L) != 0)) ) {
					((CastTypeContext)_localctx).castTypeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case DATE:
				enterOuterAlt(_localctx, 6);
				{
				setState(1350);
				((CastTypeContext)_localctx).castTypeName = match(DATE);
				}
				break;
			case TIME:
				enterOuterAlt(_localctx, 7);
				{
				setState(1351);
				((CastTypeContext)_localctx).castTypeName = match(TIME);
				setState(1353);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1352);
					typeDatetimePrecision();
					}
				}

				}
				break;
			case DATETIME:
				enterOuterAlt(_localctx, 8);
				{
				setState(1355);
				((CastTypeContext)_localctx).castTypeName = match(DATETIME);
				setState(1357);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1356);
					typeDatetimePrecision();
					}
				}

				}
				break;
			case DECIMAL:
				enterOuterAlt(_localctx, 9);
				{
				setState(1359);
				((CastTypeContext)_localctx).castTypeName = match(DECIMAL);
				setState(1362);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,126,_ctx) ) {
				case 1:
					{
					setState(1360);
					fieldLength();
					}
					break;
				case 2:
					{
					setState(1361);
					precision();
					}
					break;
				}
				}
				break;
			case JSON:
				enterOuterAlt(_localctx, 10);
				{
				setState(1364);
				((CastTypeContext)_localctx).castTypeName = match(JSON);
				}
				break;
			case REAL:
				enterOuterAlt(_localctx, 11);
				{
				setState(1365);
				((CastTypeContext)_localctx).castTypeName = match(REAL);
				}
				break;
			case DOUBLE:
				enterOuterAlt(_localctx, 12);
				{
				setState(1366);
				((CastTypeContext)_localctx).castTypeName = match(DOUBLE);
				setState(1367);
				match(PRECISION);
				}
				break;
			case FLOAT:
				enterOuterAlt(_localctx, 13);
				{
				setState(1368);
				((CastTypeContext)_localctx).castTypeName = match(FLOAT);
				setState(1370);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==LP_) {
					{
					setState(1369);
					precision();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PositionFunctionContext extends ParserRuleContext {
		public TerminalNode POSITION() { return getToken(BaseRuleParser.POSITION, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode IN() { return getToken(BaseRuleParser.IN, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public PositionFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_positionFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPositionFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPositionFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPositionFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PositionFunctionContext positionFunction() throws RecognitionException {
		PositionFunctionContext _localctx = new PositionFunctionContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_positionFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1374);
			match(POSITION);
			setState(1375);
			match(LP_);
			setState(1376);
			expr(0);
			setState(1377);
			match(IN);
			setState(1378);
			expr(0);
			setState(1379);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubstringFunctionContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode FROM() { return getToken(BaseRuleParser.FROM, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(BaseRuleParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(BaseRuleParser.NUMBER_, i);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TerminalNode SUBSTRING() { return getToken(BaseRuleParser.SUBSTRING, 0); }
		public TerminalNode SUBSTR() { return getToken(BaseRuleParser.SUBSTR, 0); }
		public TerminalNode FOR() { return getToken(BaseRuleParser.FOR, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public SubstringFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_substringFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSubstringFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSubstringFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSubstringFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubstringFunctionContext substringFunction() throws RecognitionException {
		SubstringFunctionContext _localctx = new SubstringFunctionContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_substringFunction);
		int _la;
		try {
			setState(1403);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,131,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1381);
				_la = _input.LA(1);
				if ( !(_la==SUBSTRING || _la==SUBSTR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1382);
				match(LP_);
				setState(1383);
				expr(0);
				setState(1384);
				match(FROM);
				setState(1385);
				match(NUMBER_);
				setState(1388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1386);
					match(FOR);
					setState(1387);
					match(NUMBER_);
					}
				}

				setState(1390);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1392);
				_la = _input.LA(1);
				if ( !(_la==SUBSTRING || _la==SUBSTR) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1393);
				match(LP_);
				setState(1394);
				expr(0);
				setState(1395);
				match(COMMA_);
				setState(1396);
				match(NUMBER_);
				setState(1399);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA_) {
					{
					setState(1397);
					match(COMMA_);
					setState(1398);
					match(NUMBER_);
					}
				}

				setState(1401);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ExtractFunctionContext extends ParserRuleContext {
		public TerminalNode EXTRACT() { return getToken(BaseRuleParser.EXTRACT, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public IntervalUnitContext intervalUnit() {
			return getRuleContext(IntervalUnitContext.class,0);
		}
		public TerminalNode FROM() { return getToken(BaseRuleParser.FROM, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public ExtractFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_extractFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterExtractFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitExtractFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitExtractFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExtractFunctionContext extractFunction() throws RecognitionException {
		ExtractFunctionContext _localctx = new ExtractFunctionContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_extractFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1405);
			match(EXTRACT);
			setState(1406);
			match(LP_);
			setState(1407);
			intervalUnit();
			setState(1408);
			match(FROM);
			setState(1409);
			expr(0);
			setState(1410);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharFunctionContext extends ParserRuleContext {
		public TerminalNode CHAR() { return getToken(BaseRuleParser.CHAR, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public TerminalNode USING() { return getToken(BaseRuleParser.USING, 0); }
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public CharFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCharFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCharFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCharFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharFunctionContext charFunction() throws RecognitionException {
		CharFunctionContext _localctx = new CharFunctionContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_charFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1412);
			match(CHAR);
			setState(1413);
			match(LP_);
			setState(1414);
			expr(0);
			setState(1419);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1415);
				match(COMMA_);
				setState(1416);
				expr(0);
				}
				}
				setState(1421);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1424);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==USING) {
				{
				setState(1422);
				match(USING);
				setState(1423);
				charsetName();
				}
			}

			setState(1426);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TrimFunctionContext extends ParserRuleContext {
		public TerminalNode TRIM() { return getToken(BaseRuleParser.TRIM, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TerminalNode FROM() { return getToken(BaseRuleParser.FROM, 0); }
		public TerminalNode LEADING() { return getToken(BaseRuleParser.LEADING, 0); }
		public TerminalNode BOTH() { return getToken(BaseRuleParser.BOTH, 0); }
		public TerminalNode TRAILING() { return getToken(BaseRuleParser.TRAILING, 0); }
		public TrimFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trimFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTrimFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTrimFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTrimFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TrimFunctionContext trimFunction() throws RecognitionException {
		TrimFunctionContext _localctx = new TrimFunctionContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_trimFunction);
		int _la;
		try {
			setState(1450);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,137,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1428);
				match(TRIM);
				setState(1429);
				match(LP_);
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==BOTH || _la==LEADING || _la==TRAILING) {
					{
					setState(1430);
					_la = _input.LA(1);
					if ( !(_la==BOTH || _la==LEADING || _la==TRAILING) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					setState(1432);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -68716792356814L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -5227571244865814545L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -1166718726351927431L) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & -1225004983887662769L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & 4517628659989213165L) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & 7054308056066409819L) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & 4003699793854300407L) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & -8707446686273880073L) != 0) || ((((_la - 514)) & ~0x3f) == 0 && ((1L << (_la - 514)) & 8042746102862053359L) != 0) || ((((_la - 578)) & ~0x3f) == 0 && ((1L << (_la - 578)) & -8359811249454350433L) != 0) || ((((_la - 642)) & ~0x3f) == 0 && ((1L << (_la - 642)) & 2304997324652243287L) != 0) || ((((_la - 730)) & ~0x3f) == 0 && ((1L << (_la - 730)) & -8080406343773455489L) != 0) || ((((_la - 795)) & ~0x3f) == 0 && ((1L << (_la - 795)) & 2278821411430523131L) != 0) || ((((_la - 859)) & ~0x3f) == 0 && ((1L << (_la - 859)) & 15L) != 0)) {
						{
						setState(1431);
						expr(0);
						}
					}

					setState(1434);
					match(FROM);
					}
				}

				setState(1437);
				expr(0);
				setState(1438);
				match(RP_);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1440);
				match(TRIM);
				setState(1441);
				match(LP_);
				setState(1445);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,136,_ctx) ) {
				case 1:
					{
					setState(1442);
					expr(0);
					setState(1443);
					match(FROM);
					}
					break;
				}
				setState(1447);
				expr(0);
				setState(1448);
				match(RP_);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ValuesFunctionContext extends ParserRuleContext {
		public TerminalNode VALUES() { return getToken(BaseRuleParser.VALUES, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public ColumnRefListContext columnRefList() {
			return getRuleContext(ColumnRefListContext.class,0);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public ValuesFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_valuesFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterValuesFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitValuesFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitValuesFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ValuesFunctionContext valuesFunction() throws RecognitionException {
		ValuesFunctionContext _localctx = new ValuesFunctionContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_valuesFunction);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1452);
			match(VALUES);
			setState(1453);
			match(LP_);
			setState(1454);
			columnRefList();
			setState(1455);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class WeightStringFunctionContext extends ParserRuleContext {
		public TerminalNode WEIGHT_STRING() { return getToken(BaseRuleParser.WEIGHT_STRING, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TerminalNode AS() { return getToken(BaseRuleParser.AS, 0); }
		public DataTypeContext dataType() {
			return getRuleContext(DataTypeContext.class,0);
		}
		public LevelClauseContext levelClause() {
			return getRuleContext(LevelClauseContext.class,0);
		}
		public WeightStringFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weightStringFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterWeightStringFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitWeightStringFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitWeightStringFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WeightStringFunctionContext weightStringFunction() throws RecognitionException {
		WeightStringFunctionContext _localctx = new WeightStringFunctionContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_weightStringFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1457);
			match(WEIGHT_STRING);
			setState(1458);
			match(LP_);
			setState(1459);
			expr(0);
			setState(1462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(1460);
				match(AS);
				setState(1461);
				dataType();
				}
			}

			setState(1465);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LEVEL) {
				{
				setState(1464);
				levelClause();
				}
			}

			setState(1467);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LevelClauseContext extends ParserRuleContext {
		public TerminalNode LEVEL() { return getToken(BaseRuleParser.LEVEL, 0); }
		public List<LevelInWeightListElementContext> levelInWeightListElement() {
			return getRuleContexts(LevelInWeightListElementContext.class);
		}
		public LevelInWeightListElementContext levelInWeightListElement(int i) {
			return getRuleContext(LevelInWeightListElementContext.class,i);
		}
		public List<TerminalNode> NUMBER_() { return getTokens(BaseRuleParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(BaseRuleParser.NUMBER_, i);
		}
		public TerminalNode MINUS_() { return getToken(BaseRuleParser.MINUS_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public LevelClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLevelClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLevelClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLevelClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelClauseContext levelClause() throws RecognitionException {
		LevelClauseContext _localctx = new LevelClauseContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_levelClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1469);
			match(LEVEL);
			setState(1481);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,141,_ctx) ) {
			case 1:
				{
				setState(1470);
				levelInWeightListElement();
				setState(1475);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1471);
					match(COMMA_);
					setState(1472);
					levelInWeightListElement();
					}
					}
					setState(1477);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case 2:
				{
				setState(1478);
				match(NUMBER_);
				setState(1479);
				match(MINUS_);
				setState(1480);
				match(NUMBER_);
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LevelInWeightListElementContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public TerminalNode REVERSE() { return getToken(BaseRuleParser.REVERSE, 0); }
		public LevelInWeightListElementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_levelInWeightListElement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLevelInWeightListElement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLevelInWeightListElement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLevelInWeightListElement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LevelInWeightListElementContext levelInWeightListElement() throws RecognitionException {
		LevelInWeightListElementContext _localctx = new LevelInWeightListElementContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_levelInWeightListElement);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1483);
			match(NUMBER_);
			setState(1485);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1484);
				direction();
				}
			}

			setState(1488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==REVERSE) {
				{
				setState(1487);
				match(REVERSE);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegularFunctionContext extends ParserRuleContext {
		public CompleteRegularFunctionContext completeRegularFunction() {
			return getRuleContext(CompleteRegularFunctionContext.class,0);
		}
		public ShorthandRegularFunctionContext shorthandRegularFunction() {
			return getRuleContext(ShorthandRegularFunctionContext.class,0);
		}
		public RegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterRegularFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitRegularFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionContext regularFunction() throws RecognitionException {
		RegularFunctionContext _localctx = new RegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_regularFunction);
		try {
			setState(1492);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1490);
				completeRegularFunction();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1491);
				shorthandRegularFunction();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ShorthandRegularFunctionContext extends ParserRuleContext {
		public TerminalNode CURRENT_DATE() { return getToken(BaseRuleParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(BaseRuleParser.CURRENT_TIME, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(BaseRuleParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LAST_DAY() { return getToken(BaseRuleParser.LAST_DAY, 0); }
		public TerminalNode LOCALTIME() { return getToken(BaseRuleParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(BaseRuleParser.LOCALTIMESTAMP, 0); }
		public ShorthandRegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_shorthandRegularFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterShorthandRegularFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitShorthandRegularFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitShorthandRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ShorthandRegularFunctionContext shorthandRegularFunction() throws RecognitionException {
		ShorthandRegularFunctionContext _localctx = new ShorthandRegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_shorthandRegularFunction);
		int _la;
		try {
			setState(1507);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CURRENT_DATE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1494);
				match(CURRENT_DATE);
				}
				break;
			case CURRENT_TIME:
				enterOuterAlt(_localctx, 2);
				{
				setState(1495);
				match(CURRENT_TIME);
				setState(1501);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
				case 1:
					{
					setState(1496);
					match(LP_);
					setState(1498);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==NUMBER_) {
						{
						setState(1497);
						match(NUMBER_);
						}
					}

					setState(1500);
					match(RP_);
					}
					break;
				}
				}
				break;
			case CURRENT_TIMESTAMP:
				enterOuterAlt(_localctx, 3);
				{
				setState(1503);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case LAST_DAY:
				enterOuterAlt(_localctx, 4);
				{
				setState(1504);
				match(LAST_DAY);
				}
				break;
			case LOCALTIME:
				enterOuterAlt(_localctx, 5);
				{
				setState(1505);
				match(LOCALTIME);
				}
				break;
			case LOCALTIMESTAMP:
				enterOuterAlt(_localctx, 6);
				{
				setState(1506);
				match(LOCALTIMESTAMP);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CompleteRegularFunctionContext extends ParserRuleContext {
		public RegularFunctionNameContext regularFunctionName() {
			return getRuleContext(RegularFunctionNameContext.class,0);
		}
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK_() { return getToken(BaseRuleParser.ASTERISK_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public CompleteRegularFunctionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_completeRegularFunction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCompleteRegularFunction(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCompleteRegularFunction(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCompleteRegularFunction(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CompleteRegularFunctionContext completeRegularFunction() throws RecognitionException {
		CompleteRegularFunctionContext _localctx = new CompleteRegularFunctionContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_completeRegularFunction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1509);
			regularFunctionName();
			{
			setState(1510);
			match(LP_);
			setState(1520);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case NOT_:
			case TILDE_:
			case PLUS_:
			case MINUS_:
			case LP_:
			case LBE_:
			case QUESTION_:
			case AT_:
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GROUP_CONCAT:
			case CAST:
			case POSITION:
			case SUBSTRING:
			case SUBSTR:
			case EXTRACT:
			case TRIM:
			case LAST_DAY:
			case TRADITIONAL:
			case TREE:
			case MYSQL_MAIN:
			case MYSQL_ADMIN:
			case INSTANT:
			case INPLACE:
			case COPY:
			case UL_BINARY:
			case AUTOCOMMIT:
			case REDO_LOG:
			case ARCHIVE:
			case BLACKHOLE:
			case CSV:
			case FEDERATED:
			case INNODB:
			case MEMORY:
			case MRG_MYISAM:
			case MYISAM:
			case NDB:
			case NDBCLUSTER:
			case PERFORMANCE_SCHEMA:
			case TOKUDB:
			case ACCOUNT:
			case ACTION:
			case ACTIVE:
			case ADMIN:
			case AFTER:
			case AGAINST:
			case AGGREGATE:
			case ALGORITHM:
			case ALWAYS:
			case ANY:
			case ARRAY:
			case ASCII:
			case AT:
			case ATTRIBUTE:
			case AUTOEXTEND_SIZE:
			case AUTO_INCREMENT:
			case AVG:
			case BIT_XOR:
			case AVG_ROW_LENGTH:
			case BACKUP:
			case BEFORE:
			case BEGIN:
			case BINARY:
			case BINLOG:
			case BIT:
			case BLOCK:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BUCKETS:
			case BYTE:
			case CACHE:
			case CASCADED:
			case CASE:
			case CATALOG_NAME:
			case CHAIN:
			case CHANGED:
			case CHANNEL:
			case CHAR:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLASS_ORIGIN:
			case CLIENT:
			case CLONE:
			case CLOSE:
			case COALESCE:
			case CODE:
			case COLLATION:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COLUMN_NAME:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETION:
			case COMPONENT:
			case COMPRESSED:
			case COMPRESSION:
			case CONCURRENT:
			case CONNECTION:
			case CONSISTENT:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONTAINS:
			case CONTEXT:
			case CONVERT:
			case CPU:
			case CREATE:
			case CUME_DIST:
			case CURRENT:
			case CURRENT_DATE:
			case CURRENT_TIME:
			case CURRENT_TIMESTAMP:
			case CURRENT_USER:
			case CURSOR_NAME:
			case DATA:
			case DATABASE:
			case DATAFILE:
			case DATE:
			case DATETIME:
			case DAY:
			case DAY_MINUTE:
			case DEALLOCATE:
			case DEFAULT:
			case DEFAULT_AUTH:
			case DEFINER:
			case DEFINITION:
			case DELAY_KEY_WRITE:
			case DENSE_RANK:
			case DESCRIPTION:
			case DIAGNOSTICS:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DO:
			case DROP:
			case DUMPFILE:
			case DUPLICATE:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTION:
			case END:
			case ENDS:
			case ENFORCED:
			case ENGINE:
			case ENGINES:
			case ENGINE_ATTRIBUTE:
			case ENUM:
			case ERROR:
			case ERRORS:
			case ESCAPE:
			case EVENT:
			case EVENTS:
			case EVERY:
			case EXCHANGE:
			case EXCLUDE:
			case EXECUTE:
			case EXISTS:
			case EXPANSION:
			case EXPIRE:
			case EXPORT:
			case EXTENDED:
			case EXTENT_SIZE:
			case FAILED_LOGIN_ATTEMPTS:
			case FALSE:
			case FAST:
			case FAULTS:
			case FILE:
			case FILE_BLOCK_SIZE:
			case FILTER:
			case FIRST:
			case FIRST_VALUE:
			case FIXED:
			case FLUSH:
			case FOLLOWING:
			case FOLLOWS:
			case FORMAT:
			case FOUND:
			case FULL:
			case GENERAL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case GET_FORMAT:
			case GET_MASTER_PUBLIC_KEY:
			case GLOBAL:
			case GRANTS:
			case GROUPING:
			case GROUPS:
			case GROUP_REPLICATION:
			case HANDLER:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HISTORY:
			case HOST:
			case HOSTS:
			case HOUR:
			case IDENTIFIED:
			case IF:
			case IGNORE_SERVER_IDS:
			case IMPORT:
			case INACTIVE:
			case INDEXES:
			case INITIAL_SIZE:
			case INSERT:
			case INSERT_METHOD:
			case INSTALL:
			case INSTANCE:
			case INTERVAL:
			case INVISIBLE:
			case INVOKER:
			case IO:
			case IPC:
			case ISOLATION:
			case ISSUER:
			case JSON:
			case JSON_TABLE:
			case JSON_VALUE:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LAG:
			case LANGUAGE:
			case LAST:
			case LAST_VALUE:
			case LEAD:
			case LEAVES:
			case LEFT:
			case LESS:
			case LEVEL:
			case LINESTRING:
			case LIST:
			case LOCAL:
			case LOCALTIME:
			case LOCALTIMESTAMP:
			case LOCKED:
			case LOCKS:
			case LOGFILE:
			case LOGS:
			case MASTER:
			case MASTER_AUTO_POSITION:
			case MASTER_COMPRESSION_ALGORITHM:
			case MASTER_CONNECT_RETRY:
			case MASTER_DELAY:
			case MASTER_HEARTBEAT_PERIOD:
			case MASTER_HOST:
			case MASTER_LOG_FILE:
			case MASTER_LOG_POS:
			case MASTER_PASSWORD:
			case MASTER_PORT:
			case MASTER_PUBLIC_KEY_PATH:
			case MASTER_RETRY_COUNT:
			case MASTER_SERVER_ID:
			case MASTER_SSL:
			case MASTER_SSL_CA:
			case MASTER_SSL_CAPATH:
			case MASTER_SSL_CERT:
			case MASTER_SSL_CIPHER:
			case MASTER_SSL_CRL:
			case MASTER_SSL_CRLPATH:
			case MASTER_SSL_KEY:
			case MASTER_TLS_CIPHERSUITES:
			case MASTER_TLS_VERSION:
			case MASTER_USER:
			case MASTER_ZSTD_COMPRESSION_LEVEL:
			case MATCH:
			case MAXVALUE:
			case MAX_CONNECTIONS_PER_HOUR:
			case MAX_QUERIES_PER_HOUR:
			case MAX_ROWS:
			case MAX_SIZE:
			case MAX_UPDATES_PER_HOUR:
			case MAX_USER_CONNECTIONS:
			case MEDIUM:
			case MEMBER:
			case MERGE:
			case MESSAGE_TEXT:
			case MICROSECOND:
			case MIGRATE:
			case MINUTE:
			case MIN_ROWS:
			case MOD:
			case MODE:
			case MODIFY:
			case MONTH:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case MUTEX:
			case MYSQL_ERRNO:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NESTED:
			case NETWORK_NAMESPACE:
			case NEVER:
			case NEW:
			case NEXT:
			case NO:
			case NODEGROUP:
			case NONE:
			case NOT:
			case NOWAIT:
			case NO_WAIT:
			case NTH_VALUE:
			case NTILE:
			case NULL:
			case NULLS:
			case NUMBER:
			case NVARCHAR:
			case OFF:
			case OFFSET:
			case OJ:
			case OLD:
			case ONE:
			case ONLY:
			case OPEN:
			case OPTIONAL:
			case OPTIONS:
			case ORDINALITY:
			case ORGANIZATION:
			case OTHERS:
			case OWNER:
			case PACK_KEYS:
			case PAGE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_LOCK_TIME:
			case PATH:
			case PERCENT_RANK:
			case PERSIST:
			case PERSIST_ONLY:
			case PHASE:
			case PLUGIN:
			case PLUGINS:
			case PLUGIN_DIR:
			case POINT:
			case POLYGON:
			case PORT:
			case PRECEDES:
			case PRECEDING:
			case PREPARE:
			case PRESERVE:
			case PREV:
			case PRIMARY:
			case PRIVILEGES:
			case PRIVILEGE_CHECKS_USER:
			case PROCESS:
			case PROCESSLIST:
			case PROFILE:
			case PROFILES:
			case PROXY:
			case QUARTER:
			case QUERY:
			case QUICK:
			case RANDOM:
			case RANK:
			case READ_ONLY:
			case REBUILD:
			case RECOVER:
			case REDO_BUFFER_SIZE:
			case REDUNDANT:
			case REFERENCE:
			case RELAY:
			case RELAYLOG:
			case RELAY_LOG_FILE:
			case RELAY_LOG_POS:
			case RELAY_THREAD:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPEAT:
			case REPEATABLE:
			case REPLACE:
			case REPLICATE_DO_DB:
			case REPLICATE_DO_TABLE:
			case REPLICATE_IGNORE_DB:
			case REPLICATE_IGNORE_TABLE:
			case REPLICATE_REWRITE_DB:
			case REPLICATE_WILD_DO_TABLE:
			case REPLICATE_WILD_IGNORE_TABLE:
			case REPLICATION:
			case REQUIRE_ROW_FORMAT:
			case RESET:
			case RESOURCE:
			case RESPECT:
			case RESTART:
			case RESTORE:
			case RESUME:
			case RETAIN:
			case RETURNED_SQLSTATE:
			case RETURNING:
			case RETURNS:
			case REUSE:
			case REVERSE:
			case RIGHT:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROTATE:
			case ROUTINE:
			case ROW:
			case ROW_COUNT:
			case ROW_FORMAT:
			case ROW_NUMBER:
			case RTREE:
			case SAVEPOINT:
			case SCHEDULE:
			case SCHEMA:
			case SCHEMA_NAME:
			case SECOND:
			case SECONDARY:
			case SECONDARY_ENGINE:
			case SECONDARY_ENGINE_ATTRIBUTE:
			case SECONDARY_LOAD:
			case SECONDARY_UNLOAD:
			case SECURITY:
			case SERIAL:
			case SERIALIZABLE:
			case SERVER:
			case SESSION:
			case SHARE:
			case SHUTDOWN:
			case SIGNED:
			case SIMPLE:
			case SLAVE:
			case SLOW:
			case SNAPSHOT:
			case SOCKET:
			case SONAME:
			case SOUNDS:
			case SOURCE:
			case SQL_AFTER_GTIDS:
			case SQL_AFTER_MTS_GAPS:
			case SQL_BEFORE_GTIDS:
			case SQL_BUFFER_RESULT:
			case SQL_NO_CACHE:
			case SQL_THREAD:
			case SRID:
			case STACKED:
			case START:
			case STARTS:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STRING:
			case SUBCLASS_ORIGIN:
			case SUBJECT:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case SUPER:
			case SUSPEND:
			case SWAPS:
			case SWITCHES:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TABLESPACE:
			case TABLE_CHECKSUM:
			case TABLE_NAME:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case THAN:
			case THREAD_PRIORITY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMP_ADD:
			case TIMESTAMP_DIFF:
			case TLS:
			case TRANSACTION:
			case TRIGGERS:
			case TRUE:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDEFINED:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case UNICODE:
			case UNINSTALL:
			case UNKNOWN:
			case UNTIL:
			case UPGRADE:
			case USER:
			case USER_RESOURCES:
			case USE_FRM:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case VALIDATION:
			case VALUE:
			case VALUES:
			case VARIABLES:
			case VCPU:
			case VIEW:
			case VISIBLE:
			case WAIT:
			case WARNINGS:
			case WEEK:
			case WEIGHT_STRING:
			case WITHOUT:
			case WORK:
			case WRAPPER:
			case X509:
			case XA:
			case XID:
			case XML:
			case YEAR:
			case YEAR_MONTH:
			case JSON_ARRAY:
			case JSON_ARRAY_APPEND:
			case JSON_ARRAY_INSERT:
			case JSON_CONTAINS:
			case JSON_CONTAINS_PATH:
			case JSON_DEPTH:
			case JSON_EXTRACT:
			case JSON_INSERT:
			case JSON_KEYS:
			case JSON_LENGTH:
			case JSON_MERGE:
			case JSON_MERGE_PATCH:
			case JSON_MERGE_PRESERVE:
			case JSON_OBJECT:
			case JSON_OVERLAPS:
			case JSON_PRETTY:
			case JSON_QUOTE:
			case JSON_REMOVE:
			case JSON_REPLACE:
			case JSON_SCHEMA_VALID:
			case JSON_SCHEMA_VALIDATION_REPORT:
			case JSON_SEARCH:
			case JSON_SET:
			case JSON_STORAGE_FREE:
			case JSON_STORAGE_SIZE:
			case JSON_TYPE:
			case JSON_UNQUOTE:
			case JSON_VALID:
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
			case BQUOTA_STRING:
			case NCHAR_TEXT:
			case UNDERSCORE_CHARSET:
			case NUMBER_:
			case HEX_DIGIT_:
			case BIT_NUM_:
			case IDENTIFIER_:
			case IP_ADDRESS:
				{
				setState(1511);
				expr(0);
				setState(1516);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1512);
					match(COMMA_);
					setState(1513);
					expr(0);
					}
					}
					setState(1518);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case ASTERISK_:
				{
				setState(1519);
				match(ASTERISK_);
				}
				break;
			case RP_:
				break;
			default:
				break;
			}
			setState(1522);
			match(RP_);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class RegularFunctionNameContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BaseRuleParser.IF, 0); }
		public TerminalNode LOCALTIME() { return getToken(BaseRuleParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(BaseRuleParser.LOCALTIMESTAMP, 0); }
		public TerminalNode REPLACE() { return getToken(BaseRuleParser.REPLACE, 0); }
		public TerminalNode INSERT() { return getToken(BaseRuleParser.INSERT, 0); }
		public TerminalNode INTERVAL() { return getToken(BaseRuleParser.INTERVAL, 0); }
		public TerminalNode MOD() { return getToken(BaseRuleParser.MOD, 0); }
		public TerminalNode DATABASE() { return getToken(BaseRuleParser.DATABASE, 0); }
		public TerminalNode SCHEMA() { return getToken(BaseRuleParser.SCHEMA, 0); }
		public TerminalNode LEFT() { return getToken(BaseRuleParser.LEFT, 0); }
		public TerminalNode RIGHT() { return getToken(BaseRuleParser.RIGHT, 0); }
		public TerminalNode DATE() { return getToken(BaseRuleParser.DATE, 0); }
		public TerminalNode DAY() { return getToken(BaseRuleParser.DAY, 0); }
		public TerminalNode GEOMETRYCOLLECTION() { return getToken(BaseRuleParser.GEOMETRYCOLLECTION, 0); }
		public TerminalNode REPEAT() { return getToken(BaseRuleParser.REPEAT, 0); }
		public TerminalNode LINESTRING() { return getToken(BaseRuleParser.LINESTRING, 0); }
		public TerminalNode MULTILINESTRING() { return getToken(BaseRuleParser.MULTILINESTRING, 0); }
		public TerminalNode MULTIPOINT() { return getToken(BaseRuleParser.MULTIPOINT, 0); }
		public TerminalNode MULTIPOLYGON() { return getToken(BaseRuleParser.MULTIPOLYGON, 0); }
		public TerminalNode POINT() { return getToken(BaseRuleParser.POINT, 0); }
		public TerminalNode POLYGON() { return getToken(BaseRuleParser.POLYGON, 0); }
		public TerminalNode TIME() { return getToken(BaseRuleParser.TIME, 0); }
		public TerminalNode TIMESTAMP() { return getToken(BaseRuleParser.TIMESTAMP, 0); }
		public TerminalNode TIMESTAMP_ADD() { return getToken(BaseRuleParser.TIMESTAMP_ADD, 0); }
		public TerminalNode TIMESTAMP_DIFF() { return getToken(BaseRuleParser.TIMESTAMP_DIFF, 0); }
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(BaseRuleParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode CURRENT_DATE() { return getToken(BaseRuleParser.CURRENT_DATE, 0); }
		public TerminalNode CURRENT_TIME() { return getToken(BaseRuleParser.CURRENT_TIME, 0); }
		public TerminalNode UTC_TIMESTAMP() { return getToken(BaseRuleParser.UTC_TIMESTAMP, 0); }
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public RegularFunctionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_regularFunctionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterRegularFunctionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitRegularFunctionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitRegularFunctionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final RegularFunctionNameContext regularFunctionName() throws RecognitionException {
		RegularFunctionNameContext _localctx = new RegularFunctionNameContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_regularFunctionName);
		try {
			setState(1555);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,150,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1524);
				match(IF);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1525);
				match(LOCALTIME);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1526);
				match(LOCALTIMESTAMP);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1527);
				match(REPLACE);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1528);
				match(INSERT);
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1529);
				match(INTERVAL);
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1530);
				match(MOD);
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1531);
				match(DATABASE);
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1532);
				match(SCHEMA);
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1533);
				match(LEFT);
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1534);
				match(RIGHT);
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1535);
				match(DATE);
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1536);
				match(DAY);
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1537);
				match(GEOMETRYCOLLECTION);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1538);
				match(REPEAT);
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1539);
				match(LINESTRING);
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1540);
				match(MULTILINESTRING);
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1541);
				match(MULTIPOINT);
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1542);
				match(MULTIPOLYGON);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1543);
				match(POINT);
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1544);
				match(POLYGON);
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1545);
				match(TIME);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1546);
				match(TIMESTAMP);
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1547);
				match(TIMESTAMP_ADD);
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1548);
				match(TIMESTAMP_DIFF);
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1549);
				match(DATE);
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1550);
				match(CURRENT_TIMESTAMP);
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1551);
				match(CURRENT_DATE);
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1552);
				match(CURRENT_TIME);
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1553);
				match(UTC_TIMESTAMP);
				}
				break;
			case 31:
				enterOuterAlt(_localctx, 31);
				{
				setState(1554);
				identifier();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchExpressionContext extends ParserRuleContext {
		public TerminalNode MATCH() { return getToken(BaseRuleParser.MATCH, 0); }
		public TerminalNode AGAINST() { return getToken(BaseRuleParser.AGAINST, 0); }
		public List<TerminalNode> LP_() { return getTokens(BaseRuleParser.LP_); }
		public TerminalNode LP_(int i) {
			return getToken(BaseRuleParser.LP_, i);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<TerminalNode> RP_() { return getTokens(BaseRuleParser.RP_); }
		public TerminalNode RP_(int i) {
			return getToken(BaseRuleParser.RP_, i);
		}
		public ColumnRefListContext columnRefList() {
			return getRuleContext(ColumnRefListContext.class,0);
		}
		public MatchSearchModifierContext matchSearchModifier() {
			return getRuleContext(MatchSearchModifierContext.class,0);
		}
		public MatchExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterMatchExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitMatchExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitMatchExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchExpressionContext matchExpression() throws RecognitionException {
		MatchExpressionContext _localctx = new MatchExpressionContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_matchExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1557);
			match(MATCH);
			setState(1563);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GROUP_CONCAT:
			case CAST:
			case POSITION:
			case SUBSTRING:
			case SUBSTR:
			case EXTRACT:
			case TRIM:
			case LAST_DAY:
			case TRADITIONAL:
			case TREE:
			case MYSQL_MAIN:
			case MYSQL_ADMIN:
			case INSTANT:
			case INPLACE:
			case COPY:
			case UL_BINARY:
			case AUTOCOMMIT:
			case REDO_LOG:
			case ARCHIVE:
			case BLACKHOLE:
			case CSV:
			case FEDERATED:
			case INNODB:
			case MEMORY:
			case MRG_MYISAM:
			case MYISAM:
			case NDB:
			case NDBCLUSTER:
			case PERFORMANCE_SCHEMA:
			case TOKUDB:
			case ACCOUNT:
			case ACTION:
			case ACTIVE:
			case ADMIN:
			case AFTER:
			case AGAINST:
			case AGGREGATE:
			case ALGORITHM:
			case ALWAYS:
			case ANY:
			case ARRAY:
			case ASCII:
			case AT:
			case ATTRIBUTE:
			case AUTOEXTEND_SIZE:
			case AUTO_INCREMENT:
			case AVG:
			case BIT_XOR:
			case AVG_ROW_LENGTH:
			case BACKUP:
			case BEFORE:
			case BEGIN:
			case BINLOG:
			case BIT:
			case BLOCK:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BUCKETS:
			case BYTE:
			case CACHE:
			case CASCADED:
			case CATALOG_NAME:
			case CHAIN:
			case CHANGED:
			case CHANNEL:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLASS_ORIGIN:
			case CLIENT:
			case CLONE:
			case CLOSE:
			case COALESCE:
			case CODE:
			case COLLATION:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COLUMN_NAME:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETION:
			case COMPONENT:
			case COMPRESSED:
			case COMPRESSION:
			case CONCURRENT:
			case CONNECTION:
			case CONSISTENT:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONTAINS:
			case CONTEXT:
			case CPU:
			case CREATE:
			case CURRENT:
			case CURSOR_NAME:
			case DATA:
			case DATAFILE:
			case DATE:
			case DATETIME:
			case DAY:
			case DAY_MINUTE:
			case DEALLOCATE:
			case DEFAULT:
			case DEFAULT_AUTH:
			case DEFINER:
			case DEFINITION:
			case DELAY_KEY_WRITE:
			case DESCRIPTION:
			case DIAGNOSTICS:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DO:
			case DROP:
			case DUMPFILE:
			case DUPLICATE:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTION:
			case END:
			case ENDS:
			case ENFORCED:
			case ENGINE:
			case ENGINES:
			case ENGINE_ATTRIBUTE:
			case ENUM:
			case ERROR:
			case ERRORS:
			case ESCAPE:
			case EVENT:
			case EVENTS:
			case EVERY:
			case EXCHANGE:
			case EXCLUDE:
			case EXECUTE:
			case EXPANSION:
			case EXPIRE:
			case EXPORT:
			case EXTENDED:
			case EXTENT_SIZE:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FAULTS:
			case FILE:
			case FILE_BLOCK_SIZE:
			case FILTER:
			case FIRST:
			case FIXED:
			case FLUSH:
			case FOLLOWING:
			case FOLLOWS:
			case FORMAT:
			case FOUND:
			case FULL:
			case GENERAL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case GET_FORMAT:
			case GET_MASTER_PUBLIC_KEY:
			case GLOBAL:
			case GRANTS:
			case GROUPS:
			case GROUP_REPLICATION:
			case HANDLER:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HISTORY:
			case HOST:
			case HOSTS:
			case HOUR:
			case IDENTIFIED:
			case IGNORE_SERVER_IDS:
			case IMPORT:
			case INACTIVE:
			case INDEXES:
			case INITIAL_SIZE:
			case INSERT_METHOD:
			case INSTALL:
			case INSTANCE:
			case INVISIBLE:
			case INVOKER:
			case IO:
			case IPC:
			case ISOLATION:
			case ISSUER:
			case JSON:
			case JSON_VALUE:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LANGUAGE:
			case LAST:
			case LAST_VALUE:
			case LEAVES:
			case LESS:
			case LEVEL:
			case LINESTRING:
			case LIST:
			case LOCAL:
			case LOCKED:
			case LOCKS:
			case LOGFILE:
			case LOGS:
			case MASTER:
			case MASTER_AUTO_POSITION:
			case MASTER_COMPRESSION_ALGORITHM:
			case MASTER_CONNECT_RETRY:
			case MASTER_DELAY:
			case MASTER_HEARTBEAT_PERIOD:
			case MASTER_HOST:
			case MASTER_LOG_FILE:
			case MASTER_LOG_POS:
			case MASTER_PASSWORD:
			case MASTER_PORT:
			case MASTER_PUBLIC_KEY_PATH:
			case MASTER_RETRY_COUNT:
			case MASTER_SERVER_ID:
			case MASTER_SSL:
			case MASTER_SSL_CA:
			case MASTER_SSL_CAPATH:
			case MASTER_SSL_CERT:
			case MASTER_SSL_CIPHER:
			case MASTER_SSL_CRL:
			case MASTER_SSL_CRLPATH:
			case MASTER_SSL_KEY:
			case MASTER_TLS_CIPHERSUITES:
			case MASTER_TLS_VERSION:
			case MASTER_USER:
			case MASTER_ZSTD_COMPRESSION_LEVEL:
			case MAXVALUE:
			case MAX_CONNECTIONS_PER_HOUR:
			case MAX_QUERIES_PER_HOUR:
			case MAX_ROWS:
			case MAX_SIZE:
			case MAX_UPDATES_PER_HOUR:
			case MAX_USER_CONNECTIONS:
			case MEDIUM:
			case MEMBER:
			case MERGE:
			case MESSAGE_TEXT:
			case MICROSECOND:
			case MIGRATE:
			case MINUTE:
			case MIN_ROWS:
			case MODE:
			case MODIFY:
			case MONTH:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case MUTEX:
			case MYSQL_ERRNO:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NESTED:
			case NETWORK_NAMESPACE:
			case NEVER:
			case NEW:
			case NEXT:
			case NO:
			case NODEGROUP:
			case NONE:
			case NOWAIT:
			case NO_WAIT:
			case NULLS:
			case NUMBER:
			case NVARCHAR:
			case OFF:
			case OFFSET:
			case OJ:
			case OLD:
			case ONE:
			case ONLY:
			case OPEN:
			case OPTIONAL:
			case OPTIONS:
			case ORDINALITY:
			case ORGANIZATION:
			case OTHERS:
			case OWNER:
			case PACK_KEYS:
			case PAGE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_LOCK_TIME:
			case PATH:
			case PERSIST:
			case PERSIST_ONLY:
			case PHASE:
			case PLUGIN:
			case PLUGINS:
			case PLUGIN_DIR:
			case POINT:
			case POLYGON:
			case PORT:
			case PRECEDES:
			case PRECEDING:
			case PREPARE:
			case PRESERVE:
			case PREV:
			case PRIMARY:
			case PRIVILEGES:
			case PRIVILEGE_CHECKS_USER:
			case PROCESS:
			case PROCESSLIST:
			case PROFILE:
			case PROFILES:
			case PROXY:
			case QUARTER:
			case QUERY:
			case QUICK:
			case RANDOM:
			case RANK:
			case READ_ONLY:
			case REBUILD:
			case RECOVER:
			case REDO_BUFFER_SIZE:
			case REDUNDANT:
			case REFERENCE:
			case RELAY:
			case RELAYLOG:
			case RELAY_LOG_FILE:
			case RELAY_LOG_POS:
			case RELAY_THREAD:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPEATABLE:
			case REPLICATE_DO_DB:
			case REPLICATE_DO_TABLE:
			case REPLICATE_IGNORE_DB:
			case REPLICATE_IGNORE_TABLE:
			case REPLICATE_REWRITE_DB:
			case REPLICATE_WILD_DO_TABLE:
			case REPLICATE_WILD_IGNORE_TABLE:
			case REPLICATION:
			case REQUIRE_ROW_FORMAT:
			case RESET:
			case RESOURCE:
			case RESPECT:
			case RESTART:
			case RESTORE:
			case RESUME:
			case RETAIN:
			case RETURNED_SQLSTATE:
			case RETURNING:
			case RETURNS:
			case REUSE:
			case REVERSE:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROTATE:
			case ROUTINE:
			case ROW_COUNT:
			case ROW_FORMAT:
			case RTREE:
			case SAVEPOINT:
			case SCHEDULE:
			case SCHEMA_NAME:
			case SECOND:
			case SECONDARY:
			case SECONDARY_ENGINE:
			case SECONDARY_ENGINE_ATTRIBUTE:
			case SECONDARY_LOAD:
			case SECONDARY_UNLOAD:
			case SECURITY:
			case SERIAL:
			case SERIALIZABLE:
			case SERVER:
			case SESSION:
			case SHARE:
			case SHUTDOWN:
			case SIGNED:
			case SIMPLE:
			case SLAVE:
			case SLOW:
			case SNAPSHOT:
			case SOCKET:
			case SONAME:
			case SOUNDS:
			case SOURCE:
			case SQL_AFTER_GTIDS:
			case SQL_AFTER_MTS_GAPS:
			case SQL_BEFORE_GTIDS:
			case SQL_BUFFER_RESULT:
			case SQL_NO_CACHE:
			case SQL_THREAD:
			case SRID:
			case STACKED:
			case START:
			case STARTS:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STRING:
			case SUBCLASS_ORIGIN:
			case SUBJECT:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case SUPER:
			case SUSPEND:
			case SWAPS:
			case SWITCHES:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TABLESPACE:
			case TABLE_CHECKSUM:
			case TABLE_NAME:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case THAN:
			case THREAD_PRIORITY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMP_ADD:
			case TIMESTAMP_DIFF:
			case TLS:
			case TRANSACTION:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDEFINED:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case UNICODE:
			case UNINSTALL:
			case UNKNOWN:
			case UNTIL:
			case UPGRADE:
			case USER:
			case USER_RESOURCES:
			case USE_FRM:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case VALIDATION:
			case VALUE:
			case VARIABLES:
			case VCPU:
			case VIEW:
			case VISIBLE:
			case WAIT:
			case WARNINGS:
			case WEEK:
			case WEIGHT_STRING:
			case WITHOUT:
			case WORK:
			case WRAPPER:
			case X509:
			case XA:
			case XID:
			case XML:
			case YEAR:
			case YEAR_MONTH:
			case DOUBLE_QUOTED_TEXT:
			case BQUOTA_STRING:
			case UNDERSCORE_CHARSET:
			case IDENTIFIER_:
				{
				setState(1558);
				columnRefList();
				}
				break;
			case LP_:
				{
				setState(1559);
				match(LP_);
				setState(1560);
				columnRefList();
				setState(1561);
				match(RP_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(1565);
			match(AGAINST);
			setState(1566);
			match(LP_);
			setState(1567);
			expr(0);
			setState(1569);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==IN || _la==WITH) {
				{
				setState(1568);
				matchSearchModifier();
				}
			}

			setState(1571);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class MatchSearchModifierContext extends ParserRuleContext {
		public TerminalNode IN() { return getToken(BaseRuleParser.IN, 0); }
		public TerminalNode NATURAL() { return getToken(BaseRuleParser.NATURAL, 0); }
		public TerminalNode LANGUAGE() { return getToken(BaseRuleParser.LANGUAGE, 0); }
		public TerminalNode MODE() { return getToken(BaseRuleParser.MODE, 0); }
		public TerminalNode WITH() { return getToken(BaseRuleParser.WITH, 0); }
		public TerminalNode QUERY() { return getToken(BaseRuleParser.QUERY, 0); }
		public TerminalNode EXPANSION() { return getToken(BaseRuleParser.EXPANSION, 0); }
		public TerminalNode BOOLEAN() { return getToken(BaseRuleParser.BOOLEAN, 0); }
		public MatchSearchModifierContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_matchSearchModifier; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterMatchSearchModifier(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitMatchSearchModifier(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitMatchSearchModifier(this);
			else return visitor.visitChildren(this);
		}
	}

	public final MatchSearchModifierContext matchSearchModifier() throws RecognitionException {
		MatchSearchModifierContext _localctx = new MatchSearchModifierContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_matchSearchModifier);
		try {
			setState(1590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,153,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1573);
				match(IN);
				setState(1574);
				match(NATURAL);
				setState(1575);
				match(LANGUAGE);
				setState(1576);
				match(MODE);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1577);
				match(IN);
				setState(1578);
				match(NATURAL);
				setState(1579);
				match(LANGUAGE);
				setState(1580);
				match(MODE);
				setState(1581);
				match(WITH);
				setState(1582);
				match(QUERY);
				setState(1583);
				match(EXPANSION);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1584);
				match(IN);
				setState(1585);
				match(BOOLEAN);
				setState(1586);
				match(MODE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1587);
				match(WITH);
				setState(1588);
				match(QUERY);
				setState(1589);
				match(EXPANSION);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseExpressionContext extends ParserRuleContext {
		public TerminalNode CASE() { return getToken(BaseRuleParser.CASE, 0); }
		public TerminalNode END() { return getToken(BaseRuleParser.END, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public List<CaseWhenContext> caseWhen() {
			return getRuleContexts(CaseWhenContext.class);
		}
		public CaseWhenContext caseWhen(int i) {
			return getRuleContext(CaseWhenContext.class,i);
		}
		public CaseElseContext caseElse() {
			return getRuleContext(CaseElseContext.class,0);
		}
		public CaseExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCaseExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCaseExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCaseExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseExpressionContext caseExpression() throws RecognitionException {
		CaseExpressionContext _localctx = new CaseExpressionContext(_ctx, getState());
		enterRule(_localctx, 272, RULE_caseExpression);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1592);
			match(CASE);
			setState(1594);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & -68716792356814L) != 0) || ((((_la - 64)) & ~0x3f) == 0 && ((1L << (_la - 64)) & -5227571244865814545L) != 0) || ((((_la - 128)) & ~0x3f) == 0 && ((1L << (_la - 128)) & -1166718726351927431L) != 0) || ((((_la - 193)) & ~0x3f) == 0 && ((1L << (_la - 193)) & -1225004983887662769L) != 0) || ((((_la - 257)) & ~0x3f) == 0 && ((1L << (_la - 257)) & 4517628659989213165L) != 0) || ((((_la - 322)) & ~0x3f) == 0 && ((1L << (_la - 322)) & 7054308056066409819L) != 0) || ((((_la - 386)) & ~0x3f) == 0 && ((1L << (_la - 386)) & 4003699793854300407L) != 0) || ((((_la - 450)) & ~0x3f) == 0 && ((1L << (_la - 450)) & -8707446686273880073L) != 0) || ((((_la - 514)) & ~0x3f) == 0 && ((1L << (_la - 514)) & 8042746102862053359L) != 0) || ((((_la - 578)) & ~0x3f) == 0 && ((1L << (_la - 578)) & -8359811249454350433L) != 0) || ((((_la - 642)) & ~0x3f) == 0 && ((1L << (_la - 642)) & 2304997324652243287L) != 0) || ((((_la - 730)) & ~0x3f) == 0 && ((1L << (_la - 730)) & -8080406343773455489L) != 0) || ((((_la - 795)) & ~0x3f) == 0 && ((1L << (_la - 795)) & 2278821411430523131L) != 0) || ((((_la - 859)) & ~0x3f) == 0 && ((1L << (_la - 859)) & 15L) != 0)) {
				{
				setState(1593);
				expr(0);
				}
			}

			setState(1597); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(1596);
				caseWhen();
				}
				}
				setState(1599); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==WHEN );
			setState(1602);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ELSE) {
				{
				setState(1601);
				caseElse();
				}
			}

			setState(1604);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DatetimeExprContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DatetimeExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_datetimeExpr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDatetimeExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDatetimeExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDatetimeExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DatetimeExprContext datetimeExpr() throws RecognitionException {
		DatetimeExprContext _localctx = new DatetimeExprContext(_ctx, getState());
		enterRule(_localctx, 274, RULE_datetimeExpr);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1606);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class BinaryLogFileIndexNumberContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public BinaryLogFileIndexNumberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_binaryLogFileIndexNumber; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterBinaryLogFileIndexNumber(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitBinaryLogFileIndexNumber(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitBinaryLogFileIndexNumber(this);
			else return visitor.visitChildren(this);
		}
	}

	public final BinaryLogFileIndexNumberContext binaryLogFileIndexNumber() throws RecognitionException {
		BinaryLogFileIndexNumberContext _localctx = new BinaryLogFileIndexNumberContext(_ctx, getState());
		enterRule(_localctx, 276, RULE_binaryLogFileIndexNumber);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1608);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseWhenContext extends ParserRuleContext {
		public TerminalNode WHEN() { return getToken(BaseRuleParser.WHEN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode THEN() { return getToken(BaseRuleParser.THEN, 0); }
		public CaseWhenContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseWhen; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCaseWhen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCaseWhen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCaseWhen(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseWhenContext caseWhen() throws RecognitionException {
		CaseWhenContext _localctx = new CaseWhenContext(_ctx, getState());
		enterRule(_localctx, 278, RULE_caseWhen);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1610);
			match(WHEN);
			setState(1611);
			expr(0);
			setState(1612);
			match(THEN);
			setState(1613);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CaseElseContext extends ParserRuleContext {
		public TerminalNode ELSE() { return getToken(BaseRuleParser.ELSE, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public CaseElseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_caseElse; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCaseElse(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCaseElse(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCaseElse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CaseElseContext caseElse() throws RecognitionException {
		CaseElseContext _localctx = new CaseElseContext(_ctx, getState());
		enterRule(_localctx, 280, RULE_caseElse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1615);
			match(ELSE);
			setState(1616);
			expr(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalExpressionContext extends ParserRuleContext {
		public TerminalNode INTERVAL() { return getToken(BaseRuleParser.INTERVAL, 0); }
		public IntervalValueContext intervalValue() {
			return getRuleContext(IntervalValueContext.class,0);
		}
		public IntervalExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalExpression; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIntervalExpression(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIntervalExpression(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIntervalExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalExpressionContext intervalExpression() throws RecognitionException {
		IntervalExpressionContext _localctx = new IntervalExpressionContext(_ctx, getState());
		enterRule(_localctx, 282, RULE_intervalExpression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1618);
			match(INTERVAL);
			setState(1619);
			intervalValue();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalValueContext extends ParserRuleContext {
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public IntervalUnitContext intervalUnit() {
			return getRuleContext(IntervalUnitContext.class,0);
		}
		public IntervalValueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalValue; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIntervalValue(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIntervalValue(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIntervalValue(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalValueContext intervalValue() throws RecognitionException {
		IntervalValueContext _localctx = new IntervalValueContext(_ctx, getState());
		enterRule(_localctx, 284, RULE_intervalValue);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1621);
			expr(0);
			setState(1622);
			intervalUnit();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IntervalUnitContext extends ParserRuleContext {
		public TerminalNode MICROSECOND() { return getToken(BaseRuleParser.MICROSECOND, 0); }
		public TerminalNode SECOND() { return getToken(BaseRuleParser.SECOND, 0); }
		public TerminalNode MINUTE() { return getToken(BaseRuleParser.MINUTE, 0); }
		public TerminalNode HOUR() { return getToken(BaseRuleParser.HOUR, 0); }
		public TerminalNode DAY() { return getToken(BaseRuleParser.DAY, 0); }
		public TerminalNode WEEK() { return getToken(BaseRuleParser.WEEK, 0); }
		public TerminalNode MONTH() { return getToken(BaseRuleParser.MONTH, 0); }
		public TerminalNode QUARTER() { return getToken(BaseRuleParser.QUARTER, 0); }
		public TerminalNode YEAR() { return getToken(BaseRuleParser.YEAR, 0); }
		public TerminalNode SECOND_MICROSECOND() { return getToken(BaseRuleParser.SECOND_MICROSECOND, 0); }
		public TerminalNode MINUTE_MICROSECOND() { return getToken(BaseRuleParser.MINUTE_MICROSECOND, 0); }
		public TerminalNode MINUTE_SECOND() { return getToken(BaseRuleParser.MINUTE_SECOND, 0); }
		public TerminalNode HOUR_MICROSECOND() { return getToken(BaseRuleParser.HOUR_MICROSECOND, 0); }
		public TerminalNode HOUR_SECOND() { return getToken(BaseRuleParser.HOUR_SECOND, 0); }
		public TerminalNode HOUR_MINUTE() { return getToken(BaseRuleParser.HOUR_MINUTE, 0); }
		public TerminalNode DAY_MICROSECOND() { return getToken(BaseRuleParser.DAY_MICROSECOND, 0); }
		public TerminalNode DAY_SECOND() { return getToken(BaseRuleParser.DAY_SECOND, 0); }
		public TerminalNode DAY_MINUTE() { return getToken(BaseRuleParser.DAY_MINUTE, 0); }
		public TerminalNode DAY_HOUR() { return getToken(BaseRuleParser.DAY_HOUR, 0); }
		public TerminalNode YEAR_MONTH() { return getToken(BaseRuleParser.YEAR_MONTH, 0); }
		public IntervalUnitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_intervalUnit; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIntervalUnit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIntervalUnit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIntervalUnit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IntervalUnitContext intervalUnit() throws RecognitionException {
		IntervalUnitContext _localctx = new IntervalUnitContext(_ctx, getState());
		enterRule(_localctx, 286, RULE_intervalUnit);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1624);
			_la = _input.LA(1);
			if ( !(((((_la - 196)) & ~0x3f) == 0 && ((1L << (_la - 196)) & 31L) != 0) || ((((_la - 318)) & ~0x3f) == 0 && ((1L << (_la - 318)) & 15L) != 0) || ((((_la - 444)) & ~0x3f) == 0 && ((1L << (_la - 444)) & 2105L) != 0) || _la==QUARTER || _la==SECOND || _la==SECOND_MICROSECOND || ((((_la - 801)) & ~0x3f) == 0 && ((1L << (_la - 801)) & 196609L) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class SubqueryContext extends ParserRuleContext {
		public SubqueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_subquery; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterSubquery(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitSubquery(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitSubquery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SubqueryContext subquery() throws RecognitionException {
		SubqueryContext _localctx = new SubqueryContext(_ctx, getState());
		enterRule(_localctx, 288, RULE_subquery);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1626);
			match(T__0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByClauseContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(BaseRuleParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(BaseRuleParser.BY, 0); }
		public List<OrderByItemContext> orderByItem() {
			return getRuleContexts(OrderByItemContext.class);
		}
		public OrderByItemContext orderByItem(int i) {
			return getRuleContext(OrderByItemContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public OrderByClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOrderByClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOrderByClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOrderByClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByClauseContext orderByClause() throws RecognitionException {
		OrderByClauseContext _localctx = new OrderByClauseContext(_ctx, getState());
		enterRule(_localctx, 290, RULE_orderByClause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			match(ORDER);
			setState(1629);
			match(BY);
			setState(1630);
			orderByItem();
			setState(1635);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1631);
				match(COMMA_);
				setState(1632);
				orderByItem();
				}
				}
				setState(1637);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class OrderByItemContext extends ParserRuleContext {
		public NumberLiteralsContext numberLiterals() {
			return getRuleContext(NumberLiteralsContext.class,0);
		}
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public DirectionContext direction() {
			return getRuleContext(DirectionContext.class,0);
		}
		public OrderByItemContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_orderByItem; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterOrderByItem(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitOrderByItem(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitOrderByItem(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderByItemContext orderByItem() throws RecognitionException {
		OrderByItemContext _localctx = new OrderByItemContext(_ctx, getState());
		enterRule(_localctx, 292, RULE_orderByItem);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1638);
				numberLiterals();
				}
				break;
			case 2:
				{
				setState(1639);
				expr(0);
				}
				break;
			}
			setState(1643);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1642);
				direction();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DataTypeContext extends ParserRuleContext {
		public Token dataTypeName;
		public TerminalNode INTEGER() { return getToken(BaseRuleParser.INTEGER, 0); }
		public TerminalNode INT() { return getToken(BaseRuleParser.INT, 0); }
		public TerminalNode TINYINT() { return getToken(BaseRuleParser.TINYINT, 0); }
		public TerminalNode SMALLINT() { return getToken(BaseRuleParser.SMALLINT, 0); }
		public TerminalNode MIDDLEINT() { return getToken(BaseRuleParser.MIDDLEINT, 0); }
		public TerminalNode MEDIUMINT() { return getToken(BaseRuleParser.MEDIUMINT, 0); }
		public TerminalNode BIGINT() { return getToken(BaseRuleParser.BIGINT, 0); }
		public FieldLengthContext fieldLength() {
			return getRuleContext(FieldLengthContext.class,0);
		}
		public FieldOptionsContext fieldOptions() {
			return getRuleContext(FieldOptionsContext.class,0);
		}
		public TerminalNode REAL() { return getToken(BaseRuleParser.REAL, 0); }
		public TerminalNode DOUBLE() { return getToken(BaseRuleParser.DOUBLE, 0); }
		public PrecisionContext precision() {
			return getRuleContext(PrecisionContext.class,0);
		}
		public TerminalNode PRECISION() { return getToken(BaseRuleParser.PRECISION, 0); }
		public TerminalNode FLOAT() { return getToken(BaseRuleParser.FLOAT, 0); }
		public TerminalNode DECIMAL() { return getToken(BaseRuleParser.DECIMAL, 0); }
		public TerminalNode DEC() { return getToken(BaseRuleParser.DEC, 0); }
		public TerminalNode NUMERIC() { return getToken(BaseRuleParser.NUMERIC, 0); }
		public TerminalNode FIXED() { return getToken(BaseRuleParser.FIXED, 0); }
		public TerminalNode BIT() { return getToken(BaseRuleParser.BIT, 0); }
		public TerminalNode BOOL() { return getToken(BaseRuleParser.BOOL, 0); }
		public TerminalNode BOOLEAN() { return getToken(BaseRuleParser.BOOLEAN, 0); }
		public TerminalNode CHAR() { return getToken(BaseRuleParser.CHAR, 0); }
		public CharsetWithOptBinaryContext charsetWithOptBinary() {
			return getRuleContext(CharsetWithOptBinaryContext.class,0);
		}
		public TerminalNode NCHAR() { return getToken(BaseRuleParser.NCHAR, 0); }
		public TerminalNode NATIONAL_CHAR() { return getToken(BaseRuleParser.NATIONAL_CHAR, 0); }
		public TerminalNode BINARY() { return getToken(BaseRuleParser.BINARY, 0); }
		public TerminalNode SIGNED() { return getToken(BaseRuleParser.SIGNED, 0); }
		public TerminalNode SIGNED_INT() { return getToken(BaseRuleParser.SIGNED_INT, 0); }
		public TerminalNode SIGNED_INTEGER() { return getToken(BaseRuleParser.SIGNED_INTEGER, 0); }
		public TerminalNode CHAR_VARYING() { return getToken(BaseRuleParser.CHAR_VARYING, 0); }
		public TerminalNode CHARACTER_VARYING() { return getToken(BaseRuleParser.CHARACTER_VARYING, 0); }
		public TerminalNode VARCHAR() { return getToken(BaseRuleParser.VARCHAR, 0); }
		public TerminalNode VARYING() { return getToken(BaseRuleParser.VARYING, 0); }
		public TerminalNode NATIONAL() { return getToken(BaseRuleParser.NATIONAL, 0); }
		public TerminalNode NVARCHAR() { return getToken(BaseRuleParser.NVARCHAR, 0); }
		public TerminalNode NATIONAL_CHAR_VARYING() { return getToken(BaseRuleParser.NATIONAL_CHAR_VARYING, 0); }
		public TerminalNode VARBINARY() { return getToken(BaseRuleParser.VARBINARY, 0); }
		public TerminalNode YEAR() { return getToken(BaseRuleParser.YEAR, 0); }
		public TerminalNode DATE() { return getToken(BaseRuleParser.DATE, 0); }
		public TerminalNode TIME() { return getToken(BaseRuleParser.TIME, 0); }
		public TypeDatetimePrecisionContext typeDatetimePrecision() {
			return getRuleContext(TypeDatetimePrecisionContext.class,0);
		}
		public TerminalNode UNSIGNED() { return getToken(BaseRuleParser.UNSIGNED, 0); }
		public TerminalNode UNSIGNED_INT() { return getToken(BaseRuleParser.UNSIGNED_INT, 0); }
		public TerminalNode UNSIGNED_INTEGER() { return getToken(BaseRuleParser.UNSIGNED_INTEGER, 0); }
		public TerminalNode TIMESTAMP() { return getToken(BaseRuleParser.TIMESTAMP, 0); }
		public TerminalNode DATETIME() { return getToken(BaseRuleParser.DATETIME, 0); }
		public TerminalNode TINYBLOB() { return getToken(BaseRuleParser.TINYBLOB, 0); }
		public TerminalNode BLOB() { return getToken(BaseRuleParser.BLOB, 0); }
		public TerminalNode MEDIUMBLOB() { return getToken(BaseRuleParser.MEDIUMBLOB, 0); }
		public TerminalNode LONGBLOB() { return getToken(BaseRuleParser.LONGBLOB, 0); }
		public TerminalNode LONG() { return getToken(BaseRuleParser.LONG, 0); }
		public TerminalNode LONG_CHAR_VARYING() { return getToken(BaseRuleParser.LONG_CHAR_VARYING, 0); }
		public TerminalNode LONG_VARCHAR() { return getToken(BaseRuleParser.LONG_VARCHAR, 0); }
		public TerminalNode TINYTEXT() { return getToken(BaseRuleParser.TINYTEXT, 0); }
		public TerminalNode TEXT() { return getToken(BaseRuleParser.TEXT, 0); }
		public TerminalNode MEDIUMTEXT() { return getToken(BaseRuleParser.MEDIUMTEXT, 0); }
		public TerminalNode LONGTEXT() { return getToken(BaseRuleParser.LONGTEXT, 0); }
		public StringListContext stringList() {
			return getRuleContext(StringListContext.class,0);
		}
		public TerminalNode ENUM() { return getToken(BaseRuleParser.ENUM, 0); }
		public TerminalNode SET() { return getToken(BaseRuleParser.SET, 0); }
		public TerminalNode SERIAL() { return getToken(BaseRuleParser.SERIAL, 0); }
		public TerminalNode JSON() { return getToken(BaseRuleParser.JSON, 0); }
		public TerminalNode GEOMETRY() { return getToken(BaseRuleParser.GEOMETRY, 0); }
		public TerminalNode GEOMCOLLECTION() { return getToken(BaseRuleParser.GEOMCOLLECTION, 0); }
		public TerminalNode GEOMETRYCOLLECTION() { return getToken(BaseRuleParser.GEOMETRYCOLLECTION, 0); }
		public TerminalNode POINT() { return getToken(BaseRuleParser.POINT, 0); }
		public TerminalNode MULTIPOINT() { return getToken(BaseRuleParser.MULTIPOINT, 0); }
		public TerminalNode LINESTRING() { return getToken(BaseRuleParser.LINESTRING, 0); }
		public TerminalNode MULTILINESTRING() { return getToken(BaseRuleParser.MULTILINESTRING, 0); }
		public TerminalNode POLYGON() { return getToken(BaseRuleParser.POLYGON, 0); }
		public TerminalNode MULTIPOLYGON() { return getToken(BaseRuleParser.MULTIPOLYGON, 0); }
		public DataTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_dataType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDataType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDataType(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDataType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DataTypeContext dataType() throws RecognitionException {
		DataTypeContext _localctx = new DataTypeContext(_ctx, getState());
		enterRule(_localctx, 294, RULE_dataType);
		int _la;
		try {
			setState(1792);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1645);
				((DataTypeContext)_localctx).dataTypeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BIGINT || _la==INT || _la==INTEGER || _la==MEDIUMINT || _la==MIDDLEINT || _la==SMALLINT || _la==TINYINT) ) {
					((DataTypeContext)_localctx).dataTypeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1647);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,160,_ctx) ) {
				case 1:
					{
					setState(1646);
					fieldLength();
					}
					break;
				}
				setState(1650);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,161,_ctx) ) {
				case 1:
					{
					setState(1649);
					fieldOptions();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1657);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case REAL:
					{
					setState(1652);
					((DataTypeContext)_localctx).dataTypeName = match(REAL);
					}
					break;
				case DOUBLE:
					{
					setState(1653);
					((DataTypeContext)_localctx).dataTypeName = match(DOUBLE);
					setState(1655);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,162,_ctx) ) {
					case 1:
						{
						setState(1654);
						match(PRECISION);
						}
						break;
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1660);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,164,_ctx) ) {
				case 1:
					{
					setState(1659);
					precision();
					}
					break;
				}
				setState(1663);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
				case 1:
					{
					setState(1662);
					fieldOptions();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1665);
				((DataTypeContext)_localctx).dataTypeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==DEC || _la==DECIMAL || _la==FIXED || _la==FLOAT || _la==NUMERIC) ) {
					((DataTypeContext)_localctx).dataTypeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1668);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,166,_ctx) ) {
				case 1:
					{
					setState(1666);
					fieldLength();
					}
					break;
				case 2:
					{
					setState(1667);
					precision();
					}
					break;
				}
				setState(1671);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,167,_ctx) ) {
				case 1:
					{
					setState(1670);
					fieldOptions();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1673);
				((DataTypeContext)_localctx).dataTypeName = match(BIT);
				setState(1675);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,168,_ctx) ) {
				case 1:
					{
					setState(1674);
					fieldLength();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1677);
				((DataTypeContext)_localctx).dataTypeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==BOOL || _la==BOOLEAN) ) {
					((DataTypeContext)_localctx).dataTypeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1678);
				((DataTypeContext)_localctx).dataTypeName = match(CHAR);
				setState(1680);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,169,_ctx) ) {
				case 1:
					{
					setState(1679);
					fieldLength();
					}
					break;
				}
				setState(1683);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,170,_ctx) ) {
				case 1:
					{
					setState(1682);
					charsetWithOptBinary();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1687);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case NCHAR:
					{
					setState(1685);
					((DataTypeContext)_localctx).dataTypeName = match(NCHAR);
					}
					break;
				case NATIONAL_CHAR:
					{
					setState(1686);
					((DataTypeContext)_localctx).dataTypeName = match(NATIONAL_CHAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1690);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
				case 1:
					{
					setState(1689);
					fieldLength();
					}
					break;
				}
				setState(1693);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,173,_ctx) ) {
				case 1:
					{
					setState(1692);
					match(BINARY);
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1695);
				((DataTypeContext)_localctx).dataTypeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 650)) & ~0x3f) == 0 && ((1L << (_la - 650)) & 7L) != 0)) ) {
					((DataTypeContext)_localctx).dataTypeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(1696);
				((DataTypeContext)_localctx).dataTypeName = match(BINARY);
				setState(1698);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,174,_ctx) ) {
				case 1:
					{
					setState(1697);
					fieldLength();
					}
					break;
				}
				}
				break;
			case 10:
				enterOuterAlt(_localctx, 10);
				{
				setState(1703);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case CHAR_VARYING:
					{
					setState(1700);
					((DataTypeContext)_localctx).dataTypeName = match(CHAR_VARYING);
					}
					break;
				case CHARACTER_VARYING:
					{
					setState(1701);
					((DataTypeContext)_localctx).dataTypeName = match(CHARACTER_VARYING);
					}
					break;
				case VARCHAR:
					{
					setState(1702);
					((DataTypeContext)_localctx).dataTypeName = match(VARCHAR);
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1705);
				fieldLength();
				setState(1707);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1706);
					charsetWithOptBinary();
					}
					break;
				}
				}
				break;
			case 11:
				enterOuterAlt(_localctx, 11);
				{
				setState(1717);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1709);
					((DataTypeContext)_localctx).dataTypeName = match(NATIONAL);
					setState(1710);
					match(VARCHAR);
					}
					break;
				case 2:
					{
					setState(1711);
					((DataTypeContext)_localctx).dataTypeName = match(NVARCHAR);
					}
					break;
				case 3:
					{
					setState(1712);
					((DataTypeContext)_localctx).dataTypeName = match(NCHAR);
					setState(1713);
					match(VARCHAR);
					}
					break;
				case 4:
					{
					setState(1714);
					((DataTypeContext)_localctx).dataTypeName = match(NATIONAL_CHAR_VARYING);
					}
					break;
				case 5:
					{
					setState(1715);
					((DataTypeContext)_localctx).dataTypeName = match(NCHAR);
					setState(1716);
					match(VARYING);
					}
					break;
				}
				setState(1719);
				fieldLength();
				setState(1721);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1720);
					match(BINARY);
					}
					break;
				}
				}
				break;
			case 12:
				enterOuterAlt(_localctx, 12);
				{
				setState(1723);
				((DataTypeContext)_localctx).dataTypeName = match(VARBINARY);
				setState(1725);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1724);
					fieldLength();
					}
					break;
				}
				}
				break;
			case 13:
				enterOuterAlt(_localctx, 13);
				{
				setState(1727);
				((DataTypeContext)_localctx).dataTypeName = match(YEAR);
				setState(1729);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1728);
					fieldLength();
					}
					break;
				}
				setState(1732);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1731);
					fieldOptions();
					}
					break;
				}
				}
				break;
			case 14:
				enterOuterAlt(_localctx, 14);
				{
				setState(1734);
				((DataTypeContext)_localctx).dataTypeName = match(DATE);
				}
				break;
			case 15:
				enterOuterAlt(_localctx, 15);
				{
				setState(1735);
				((DataTypeContext)_localctx).dataTypeName = match(TIME);
				setState(1737);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1736);
					typeDatetimePrecision();
					}
					break;
				}
				}
				break;
			case 16:
				enterOuterAlt(_localctx, 16);
				{
				setState(1739);
				((DataTypeContext)_localctx).dataTypeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 772)) & ~0x3f) == 0 && ((1L << (_la - 772)) & 7L) != 0)) ) {
					((DataTypeContext)_localctx).dataTypeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 17:
				enterOuterAlt(_localctx, 17);
				{
				setState(1740);
				((DataTypeContext)_localctx).dataTypeName = match(TIMESTAMP);
				setState(1742);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1741);
					typeDatetimePrecision();
					}
					break;
				}
				}
				break;
			case 18:
				enterOuterAlt(_localctx, 18);
				{
				setState(1744);
				((DataTypeContext)_localctx).dataTypeName = match(DATETIME);
				setState(1746);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1745);
					typeDatetimePrecision();
					}
					break;
				}
				}
				break;
			case 19:
				enterOuterAlt(_localctx, 19);
				{
				setState(1748);
				((DataTypeContext)_localctx).dataTypeName = match(TINYBLOB);
				}
				break;
			case 20:
				enterOuterAlt(_localctx, 20);
				{
				setState(1749);
				((DataTypeContext)_localctx).dataTypeName = match(BLOB);
				setState(1751);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1750);
					fieldLength();
					}
					break;
				}
				}
				break;
			case 21:
				enterOuterAlt(_localctx, 21);
				{
				setState(1753);
				((DataTypeContext)_localctx).dataTypeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(_la==LONGBLOB || _la==MEDIUMBLOB) ) {
					((DataTypeContext)_localctx).dataTypeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			case 22:
				enterOuterAlt(_localctx, 22);
				{
				setState(1754);
				((DataTypeContext)_localctx).dataTypeName = match(LONG);
				setState(1755);
				match(VARBINARY);
				}
				break;
			case 23:
				enterOuterAlt(_localctx, 23);
				{
				setState(1757);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1756);
					((DataTypeContext)_localctx).dataTypeName = _input.LT(1);
					_la = _input.LA(1);
					if ( !(_la==LONG_CHAR_VARYING || _la==LONG_VARCHAR) ) {
						((DataTypeContext)_localctx).dataTypeName = (Token)_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					break;
				}
				setState(1760);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1759);
					charsetWithOptBinary();
					}
					break;
				}
				}
				break;
			case 24:
				enterOuterAlt(_localctx, 24);
				{
				setState(1762);
				((DataTypeContext)_localctx).dataTypeName = match(TINYTEXT);
				setState(1764);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1763);
					charsetWithOptBinary();
					}
					break;
				}
				}
				break;
			case 25:
				enterOuterAlt(_localctx, 25);
				{
				setState(1766);
				((DataTypeContext)_localctx).dataTypeName = match(TEXT);
				setState(1768);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1767);
					fieldLength();
					}
					break;
				}
				setState(1771);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1770);
					charsetWithOptBinary();
					}
					break;
				}
				}
				break;
			case 26:
				enterOuterAlt(_localctx, 26);
				{
				setState(1773);
				((DataTypeContext)_localctx).dataTypeName = match(MEDIUMTEXT);
				setState(1775);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1774);
					charsetWithOptBinary();
					}
					break;
				}
				}
				break;
			case 27:
				enterOuterAlt(_localctx, 27);
				{
				setState(1777);
				((DataTypeContext)_localctx).dataTypeName = match(LONGTEXT);
				setState(1779);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1778);
					charsetWithOptBinary();
					}
					break;
				}
				}
				break;
			case 28:
				enterOuterAlt(_localctx, 28);
				{
				setState(1781);
				((DataTypeContext)_localctx).dataTypeName = match(ENUM);
				setState(1782);
				stringList();
				setState(1784);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1783);
					charsetWithOptBinary();
					}
					break;
				}
				}
				break;
			case 29:
				enterOuterAlt(_localctx, 29);
				{
				setState(1786);
				((DataTypeContext)_localctx).dataTypeName = match(SET);
				setState(1787);
				stringList();
				setState(1789);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1788);
					charsetWithOptBinary();
					}
					break;
				}
				}
				break;
			case 30:
				enterOuterAlt(_localctx, 30);
				{
				setState(1791);
				((DataTypeContext)_localctx).dataTypeName = _input.LT(1);
				_la = _input.LA(1);
				if ( !(((((_la - 293)) & ~0x3f) == 0 && ((1L << (_la - 293)) & 7L) != 0) || _la==JSON || _la==LINESTRING || ((((_la - 456)) & ~0x3f) == 0 && ((1L << (_la - 456)) & 7L) != 0) || _la==POINT || _la==POLYGON || _la==SERIAL) ) {
					((DataTypeContext)_localctx).dataTypeName = (Token)_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StringListContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<TextStringContext> textString() {
			return getRuleContexts(TextStringContext.class);
		}
		public TextStringContext textString(int i) {
			return getRuleContext(TextStringContext.class,i);
		}
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public StringListContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stringList; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterStringList(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitStringList(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitStringList(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StringListContext stringList() throws RecognitionException {
		StringListContext _localctx = new StringListContext(_ctx, getState());
		enterRule(_localctx, 296, RULE_stringList);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1794);
			match(LP_);
			setState(1795);
			textString();
			setState(1800);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA_) {
				{
				{
				setState(1796);
				match(COMMA_);
				setState(1797);
				textString();
				}
				}
				setState(1802);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(1803);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextStringContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public TerminalNode HEX_DIGIT_() { return getToken(BaseRuleParser.HEX_DIGIT_, 0); }
		public TerminalNode BIT_NUM_() { return getToken(BaseRuleParser.BIT_NUM_, 0); }
		public TextStringContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textString; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTextString(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTextString(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTextString(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextStringContext textString() throws RecognitionException {
		TextStringContext _localctx = new TextStringContext(_ctx, getState());
		enterRule(_localctx, 298, RULE_textString);
		try {
			setState(1808);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1805);
				string_();
				}
				break;
			case HEX_DIGIT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1806);
				match(HEX_DIGIT_);
				}
				break;
			case BIT_NUM_:
				enterOuterAlt(_localctx, 3);
				{
				setState(1807);
				match(BIT_NUM_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TextStringHashContext extends ParserRuleContext {
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public TerminalNode HEX_DIGIT_() { return getToken(BaseRuleParser.HEX_DIGIT_, 0); }
		public TextStringHashContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_textStringHash; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTextStringHash(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTextStringHash(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTextStringHash(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TextStringHashContext textStringHash() throws RecognitionException {
		TextStringHashContext _localctx = new TextStringHashContext(_ctx, getState());
		enterRule(_localctx, 300, RULE_textStringHash);
		try {
			setState(1812);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1810);
				string_();
				}
				break;
			case HEX_DIGIT_:
				enterOuterAlt(_localctx, 2);
				{
				setState(1811);
				match(HEX_DIGIT_);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldOptionsContext extends ParserRuleContext {
		public List<TerminalNode> UNSIGNED() { return getTokens(BaseRuleParser.UNSIGNED); }
		public TerminalNode UNSIGNED(int i) {
			return getToken(BaseRuleParser.UNSIGNED, i);
		}
		public List<TerminalNode> SIGNED() { return getTokens(BaseRuleParser.SIGNED); }
		public TerminalNode SIGNED(int i) {
			return getToken(BaseRuleParser.SIGNED, i);
		}
		public List<TerminalNode> ZEROFILL() { return getTokens(BaseRuleParser.ZEROFILL); }
		public TerminalNode ZEROFILL(int i) {
			return getToken(BaseRuleParser.ZEROFILL, i);
		}
		public FieldOptionsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOptions; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFieldOptions(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFieldOptions(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFieldOptions(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldOptionsContext fieldOptions() throws RecognitionException {
		FieldOptionsContext _localctx = new FieldOptionsContext(_ctx, getState());
		enterRule(_localctx, 302, RULE_fieldOptions);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1815); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(1814);
					_la = _input.LA(1);
					if ( !(_la==SIGNED || _la==UNSIGNED || _la==ZEROFILL) ) {
					_errHandler.recoverInline(this);
					}
					else {
						if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
						_errHandler.reportMatch(this);
						consume();
					}
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(1817); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,199,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class PrecisionContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public List<TerminalNode> NUMBER_() { return getTokens(BaseRuleParser.NUMBER_); }
		public TerminalNode NUMBER_(int i) {
			return getToken(BaseRuleParser.NUMBER_, i);
		}
		public TerminalNode COMMA_() { return getToken(BaseRuleParser.COMMA_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public PrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_precision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterPrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitPrecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitPrecision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PrecisionContext precision() throws RecognitionException {
		PrecisionContext _localctx = new PrecisionContext(_ctx, getState());
		enterRule(_localctx, 304, RULE_precision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1819);
			match(LP_);
			setState(1820);
			match(NUMBER_);
			setState(1821);
			match(COMMA_);
			setState(1822);
			match(NUMBER_);
			setState(1823);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class TypeDatetimePrecisionContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TypeDatetimePrecisionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeDatetimePrecision; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterTypeDatetimePrecision(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitTypeDatetimePrecision(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitTypeDatetimePrecision(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeDatetimePrecisionContext typeDatetimePrecision() throws RecognitionException {
		TypeDatetimePrecisionContext _localctx = new TypeDatetimePrecisionContext(_ctx, getState());
		enterRule(_localctx, 306, RULE_typeDatetimePrecision);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1825);
			match(LP_);
			setState(1826);
			match(NUMBER_);
			setState(1827);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharsetWithOptBinaryContext extends ParserRuleContext {
		public AsciiContext ascii() {
			return getRuleContext(AsciiContext.class,0);
		}
		public UnicodeContext unicode() {
			return getRuleContext(UnicodeContext.class,0);
		}
		public TerminalNode BYTE() { return getToken(BaseRuleParser.BYTE, 0); }
		public CharsetContext charset() {
			return getRuleContext(CharsetContext.class,0);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode BINARY() { return getToken(BaseRuleParser.BINARY, 0); }
		public CharsetWithOptBinaryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charsetWithOptBinary; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCharsetWithOptBinary(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCharsetWithOptBinary(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCharsetWithOptBinary(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharsetWithOptBinaryContext charsetWithOptBinary() throws RecognitionException {
		CharsetWithOptBinaryContext _localctx = new CharsetWithOptBinaryContext(_ctx, getState());
		enterRule(_localctx, 308, RULE_charsetWithOptBinary);
		try {
			setState(1843);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1829);
				ascii();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1830);
				unicode();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1831);
				match(BYTE);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1832);
				charset();
				setState(1833);
				charsetName();
				setState(1835);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1834);
					match(BINARY);
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1837);
				match(BINARY);
				setState(1841);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1838);
					charset();
					setState(1839);
					charsetName();
					}
					break;
				}
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class AsciiContext extends ParserRuleContext {
		public TerminalNode ASCII() { return getToken(BaseRuleParser.ASCII, 0); }
		public TerminalNode BINARY() { return getToken(BaseRuleParser.BINARY, 0); }
		public AsciiContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ascii; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterAscii(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitAscii(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitAscii(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AsciiContext ascii() throws RecognitionException {
		AsciiContext _localctx = new AsciiContext(_ctx, getState());
		enterRule(_localctx, 310, RULE_ascii);
		try {
			setState(1851);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ASCII:
				enterOuterAlt(_localctx, 1);
				{
				setState(1845);
				match(ASCII);
				setState(1847);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1846);
					match(BINARY);
					}
					break;
				}
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1849);
				match(BINARY);
				setState(1850);
				match(ASCII);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class UnicodeContext extends ParserRuleContext {
		public TerminalNode UNICODE() { return getToken(BaseRuleParser.UNICODE, 0); }
		public TerminalNode BINARY() { return getToken(BaseRuleParser.BINARY, 0); }
		public UnicodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_unicode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterUnicode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitUnicode(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitUnicode(this);
			else return visitor.visitChildren(this);
		}
	}

	public final UnicodeContext unicode() throws RecognitionException {
		UnicodeContext _localctx = new UnicodeContext(_ctx, getState());
		enterRule(_localctx, 312, RULE_unicode);
		try {
			setState(1859);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case UNICODE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1853);
				match(UNICODE);
				setState(1855);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,205,_ctx) ) {
				case 1:
					{
					setState(1854);
					match(BINARY);
					}
					break;
				}
				}
				break;
			case BINARY:
				enterOuterAlt(_localctx, 2);
				{
				setState(1857);
				match(BINARY);
				setState(1858);
				match(UNICODE);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharsetContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(BaseRuleParser.SET, 0); }
		public TerminalNode CHAR() { return getToken(BaseRuleParser.CHAR, 0); }
		public TerminalNode CHARACTER() { return getToken(BaseRuleParser.CHARACTER, 0); }
		public TerminalNode CHARSET() { return getToken(BaseRuleParser.CHARSET, 0); }
		public CharsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_charset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCharset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCharset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCharset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharsetContext charset() throws RecognitionException {
		CharsetContext _localctx = new CharsetContext(_ctx, getState());
		enterRule(_localctx, 314, RULE_charset);
		int _la;
		try {
			setState(1864);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CHAR:
			case CHARACTER:
				enterOuterAlt(_localctx, 1);
				{
				setState(1861);
				_la = _input.LA(1);
				if ( !(_la==CHAR || _la==CHARACTER) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				setState(1862);
				match(SET);
				}
				break;
			case CHARSET:
				enterOuterAlt(_localctx, 2);
				{
				setState(1863);
				match(CHARSET);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultCollationContext extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(BaseRuleParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(BaseRuleParser.DEFAULT, 0); }
		public TerminalNode EQ_() { return getToken(BaseRuleParser.EQ_, 0); }
		public DefaultCollationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCollation; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDefaultCollation(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDefaultCollation(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDefaultCollation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCollationContext defaultCollation() throws RecognitionException {
		DefaultCollationContext _localctx = new DefaultCollationContext(_ctx, getState());
		enterRule(_localctx, 316, RULE_defaultCollation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1867);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1866);
				match(DEFAULT);
				}
			}

			setState(1869);
			match(COLLATE);
			setState(1871);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1870);
				match(EQ_);
				}
			}

			setState(1873);
			collationName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultEncryptionContext extends ParserRuleContext {
		public TerminalNode ENCRYPTION() { return getToken(BaseRuleParser.ENCRYPTION, 0); }
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(BaseRuleParser.DEFAULT, 0); }
		public TerminalNode EQ_() { return getToken(BaseRuleParser.EQ_, 0); }
		public DefaultEncryptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultEncryption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDefaultEncryption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDefaultEncryption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDefaultEncryption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultEncryptionContext defaultEncryption() throws RecognitionException {
		DefaultEncryptionContext _localctx = new DefaultEncryptionContext(_ctx, getState());
		enterRule(_localctx, 318, RULE_defaultEncryption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1876);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1875);
				match(DEFAULT);
				}
			}

			setState(1878);
			match(ENCRYPTION);
			setState(1880);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1879);
				match(EQ_);
				}
			}

			setState(1882);
			string_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DefaultCharsetContext extends ParserRuleContext {
		public CharsetContext charset() {
			return getRuleContext(CharsetContext.class,0);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public TerminalNode DEFAULT() { return getToken(BaseRuleParser.DEFAULT, 0); }
		public TerminalNode EQ_() { return getToken(BaseRuleParser.EQ_, 0); }
		public DefaultCharsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_defaultCharset; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDefaultCharset(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDefaultCharset(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDefaultCharset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DefaultCharsetContext defaultCharset() throws RecognitionException {
		DefaultCharsetContext _localctx = new DefaultCharsetContext(_ctx, getState());
		enterRule(_localctx, 320, RULE_defaultCharset);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1885);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==DEFAULT) {
				{
				setState(1884);
				match(DEFAULT);
				}
			}

			setState(1887);
			charset();
			setState(1889);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EQ_) {
				{
				setState(1888);
				match(EQ_);
				}
			}

			setState(1891);
			charsetName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NowContext extends ParserRuleContext {
		public TerminalNode CURRENT_TIMESTAMP() { return getToken(BaseRuleParser.CURRENT_TIMESTAMP, 0); }
		public TerminalNode LOCALTIME() { return getToken(BaseRuleParser.LOCALTIME, 0); }
		public TerminalNode LOCALTIMESTAMP() { return getToken(BaseRuleParser.LOCALTIMESTAMP, 0); }
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public NowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_now; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNow(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNow(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NowContext now() throws RecognitionException {
		NowContext _localctx = new NowContext(_ctx, getState());
		enterRule(_localctx, 322, RULE_now);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1893);
			_la = _input.LA(1);
			if ( !(_la==CURRENT_TIMESTAMP || _la==LOCALTIME || _la==LOCALTIMESTAMP) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			setState(1899);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LP_) {
				{
				setState(1894);
				match(LP_);
				setState(1896);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==NUMBER_) {
					{
					setState(1895);
					match(NUMBER_);
					}
				}

				setState(1898);
				match(RP_);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ColumnFormatContext extends ParserRuleContext {
		public TerminalNode FIXED() { return getToken(BaseRuleParser.FIXED, 0); }
		public TerminalNode DYNAMIC() { return getToken(BaseRuleParser.DYNAMIC, 0); }
		public TerminalNode DEFAULT() { return getToken(BaseRuleParser.DEFAULT, 0); }
		public ColumnFormatContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_columnFormat; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterColumnFormat(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitColumnFormat(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitColumnFormat(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ColumnFormatContext columnFormat() throws RecognitionException {
		ColumnFormatContext _localctx = new ColumnFormatContext(_ctx, getState());
		enterRule(_localctx, 324, RULE_columnFormat);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1901);
			_la = _input.LA(1);
			if ( !(_la==DEFAULT || _la==DYNAMIC || _la==FIXED) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class StorageMediaContext extends ParserRuleContext {
		public TerminalNode DISK() { return getToken(BaseRuleParser.DISK, 0); }
		public TerminalNode MEMORY() { return getToken(BaseRuleParser.MEMORY, 0); }
		public TerminalNode DEFAULT() { return getToken(BaseRuleParser.DEFAULT, 0); }
		public StorageMediaContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_storageMedia; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterStorageMedia(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitStorageMedia(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitStorageMedia(this);
			else return visitor.visitChildren(this);
		}
	}

	public final StorageMediaContext storageMedia() throws RecognitionException {
		StorageMediaContext _localctx = new StorageMediaContext(_ctx, getState());
		enterRule(_localctx, 326, RULE_storageMedia);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1903);
			_la = _input.LA(1);
			if ( !(_la==MEMORY || _la==DEFAULT || _la==DISK) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class DirectionContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(BaseRuleParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(BaseRuleParser.DESC, 0); }
		public DirectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_direction; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterDirection(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitDirection(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitDirection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final DirectionContext direction() throws RecognitionException {
		DirectionContext _localctx = new DirectionContext(_ctx, getState());
		enterRule(_localctx, 328, RULE_direction);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1905);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class KeyOrIndexContext extends ParserRuleContext {
		public TerminalNode KEY() { return getToken(BaseRuleParser.KEY, 0); }
		public TerminalNode INDEX() { return getToken(BaseRuleParser.INDEX, 0); }
		public KeyOrIndexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyOrIndex; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterKeyOrIndex(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitKeyOrIndex(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitKeyOrIndex(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeyOrIndexContext keyOrIndex() throws RecognitionException {
		KeyOrIndexContext _localctx = new KeyOrIndexContext(_ctx, getState());
		enterRule(_localctx, 330, RULE_keyOrIndex);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1907);
			_la = _input.LA(1);
			if ( !(_la==INDEX || _la==KEY) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldLengthContext extends ParserRuleContext {
		public Token length;
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public FieldLengthContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldLength; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFieldLength(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFieldLength(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFieldLength(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldLengthContext fieldLength() throws RecognitionException {
		FieldLengthContext _localctx = new FieldLengthContext(_ctx, getState());
		enterRule(_localctx, 332, RULE_fieldLength);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1909);
			match(LP_);
			setState(1910);
			((FieldLengthContext)_localctx).length = match(NUMBER_);
			setState(1911);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CharacterSetContext extends ParserRuleContext {
		public CharsetContext charset() {
			return getRuleContext(CharsetContext.class,0);
		}
		public CharsetNameContext charsetName() {
			return getRuleContext(CharsetNameContext.class,0);
		}
		public CharacterSetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_characterSet; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCharacterSet(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCharacterSet(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCharacterSet(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CharacterSetContext characterSet() throws RecognitionException {
		CharacterSetContext _localctx = new CharacterSetContext(_ctx, getState());
		enterRule(_localctx, 334, RULE_characterSet);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1913);
			charset();
			setState(1914);
			charsetName();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CollateClauseContext extends ParserRuleContext {
		public TerminalNode COLLATE() { return getToken(BaseRuleParser.COLLATE, 0); }
		public CollationNameContext collationName() {
			return getRuleContext(CollationNameContext.class,0);
		}
		public ParameterMarkerContext parameterMarker() {
			return getRuleContext(ParameterMarkerContext.class,0);
		}
		public CollateClauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collateClause; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCollateClause(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCollateClause(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCollateClause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollateClauseContext collateClause() throws RecognitionException {
		CollateClauseContext _localctx = new CollateClauseContext(_ctx, getState());
		enterRule(_localctx, 336, RULE_collateClause);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1916);
			match(COLLATE);
			setState(1919);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAX:
			case MIN:
			case SUM:
			case COUNT:
			case GROUP_CONCAT:
			case CAST:
			case POSITION:
			case SUBSTRING:
			case SUBSTR:
			case EXTRACT:
			case TRIM:
			case LAST_DAY:
			case TRADITIONAL:
			case TREE:
			case MYSQL_MAIN:
			case MYSQL_ADMIN:
			case INSTANT:
			case INPLACE:
			case COPY:
			case UL_BINARY:
			case AUTOCOMMIT:
			case REDO_LOG:
			case ARCHIVE:
			case BLACKHOLE:
			case CSV:
			case FEDERATED:
			case INNODB:
			case MEMORY:
			case MRG_MYISAM:
			case MYISAM:
			case NDB:
			case NDBCLUSTER:
			case PERFORMANCE_SCHEMA:
			case TOKUDB:
			case ACCOUNT:
			case ACTION:
			case ACTIVE:
			case ADMIN:
			case AFTER:
			case AGAINST:
			case AGGREGATE:
			case ALGORITHM:
			case ALWAYS:
			case ANY:
			case ARRAY:
			case ASCII:
			case AT:
			case ATTRIBUTE:
			case AUTOEXTEND_SIZE:
			case AUTO_INCREMENT:
			case AVG:
			case BIT_XOR:
			case AVG_ROW_LENGTH:
			case BACKUP:
			case BEFORE:
			case BEGIN:
			case BINARY:
			case BINLOG:
			case BIT:
			case BLOCK:
			case BOOL:
			case BOOLEAN:
			case BTREE:
			case BUCKETS:
			case BYTE:
			case CACHE:
			case CASCADED:
			case CATALOG_NAME:
			case CHAIN:
			case CHANGED:
			case CHANNEL:
			case CHARSET:
			case CHECKSUM:
			case CIPHER:
			case CLASS_ORIGIN:
			case CLIENT:
			case CLONE:
			case CLOSE:
			case COALESCE:
			case CODE:
			case COLLATION:
			case COLUMNS:
			case COLUMN_FORMAT:
			case COLUMN_NAME:
			case COMMENT:
			case COMMIT:
			case COMMITTED:
			case COMPACT:
			case COMPLETION:
			case COMPONENT:
			case COMPRESSED:
			case COMPRESSION:
			case CONCURRENT:
			case CONNECTION:
			case CONSISTENT:
			case CONSTRAINT_CATALOG:
			case CONSTRAINT_NAME:
			case CONSTRAINT_SCHEMA:
			case CONTAINS:
			case CONTEXT:
			case CPU:
			case CREATE:
			case CURRENT:
			case CURSOR_NAME:
			case DATA:
			case DATAFILE:
			case DATE:
			case DATETIME:
			case DAY:
			case DAY_MINUTE:
			case DEALLOCATE:
			case DEFAULT:
			case DEFAULT_AUTH:
			case DEFINER:
			case DEFINITION:
			case DELAY_KEY_WRITE:
			case DESCRIPTION:
			case DIAGNOSTICS:
			case DIRECTORY:
			case DISABLE:
			case DISCARD:
			case DISK:
			case DO:
			case DROP:
			case DUMPFILE:
			case DUPLICATE:
			case DYNAMIC:
			case ENABLE:
			case ENCRYPTION:
			case END:
			case ENDS:
			case ENFORCED:
			case ENGINE:
			case ENGINES:
			case ENGINE_ATTRIBUTE:
			case ENUM:
			case ERROR:
			case ERRORS:
			case ESCAPE:
			case EVENT:
			case EVENTS:
			case EVERY:
			case EXCHANGE:
			case EXCLUDE:
			case EXECUTE:
			case EXPANSION:
			case EXPIRE:
			case EXPORT:
			case EXTENDED:
			case EXTENT_SIZE:
			case FAILED_LOGIN_ATTEMPTS:
			case FAST:
			case FAULTS:
			case FILE:
			case FILE_BLOCK_SIZE:
			case FILTER:
			case FIRST:
			case FIXED:
			case FLUSH:
			case FOLLOWING:
			case FOLLOWS:
			case FORMAT:
			case FOUND:
			case FULL:
			case GENERAL:
			case GEOMETRY:
			case GEOMETRYCOLLECTION:
			case GET_FORMAT:
			case GET_MASTER_PUBLIC_KEY:
			case GLOBAL:
			case GRANTS:
			case GROUPS:
			case GROUP_REPLICATION:
			case HANDLER:
			case HASH:
			case HELP:
			case HISTOGRAM:
			case HISTORY:
			case HOST:
			case HOSTS:
			case HOUR:
			case IDENTIFIED:
			case IGNORE_SERVER_IDS:
			case IMPORT:
			case INACTIVE:
			case INDEXES:
			case INITIAL_SIZE:
			case INSERT_METHOD:
			case INSTALL:
			case INSTANCE:
			case INVISIBLE:
			case INVOKER:
			case IO:
			case IPC:
			case ISOLATION:
			case ISSUER:
			case JSON:
			case JSON_VALUE:
			case KEY:
			case KEYS:
			case KEY_BLOCK_SIZE:
			case LANGUAGE:
			case LAST:
			case LAST_VALUE:
			case LEAVES:
			case LESS:
			case LEVEL:
			case LINESTRING:
			case LIST:
			case LOCAL:
			case LOCKED:
			case LOCKS:
			case LOGFILE:
			case LOGS:
			case MASTER:
			case MASTER_AUTO_POSITION:
			case MASTER_COMPRESSION_ALGORITHM:
			case MASTER_CONNECT_RETRY:
			case MASTER_DELAY:
			case MASTER_HEARTBEAT_PERIOD:
			case MASTER_HOST:
			case MASTER_LOG_FILE:
			case MASTER_LOG_POS:
			case MASTER_PASSWORD:
			case MASTER_PORT:
			case MASTER_PUBLIC_KEY_PATH:
			case MASTER_RETRY_COUNT:
			case MASTER_SERVER_ID:
			case MASTER_SSL:
			case MASTER_SSL_CA:
			case MASTER_SSL_CAPATH:
			case MASTER_SSL_CERT:
			case MASTER_SSL_CIPHER:
			case MASTER_SSL_CRL:
			case MASTER_SSL_CRLPATH:
			case MASTER_SSL_KEY:
			case MASTER_TLS_CIPHERSUITES:
			case MASTER_TLS_VERSION:
			case MASTER_USER:
			case MASTER_ZSTD_COMPRESSION_LEVEL:
			case MAXVALUE:
			case MAX_CONNECTIONS_PER_HOUR:
			case MAX_QUERIES_PER_HOUR:
			case MAX_ROWS:
			case MAX_SIZE:
			case MAX_UPDATES_PER_HOUR:
			case MAX_USER_CONNECTIONS:
			case MEDIUM:
			case MEMBER:
			case MERGE:
			case MESSAGE_TEXT:
			case MICROSECOND:
			case MIGRATE:
			case MINUTE:
			case MIN_ROWS:
			case MODE:
			case MODIFY:
			case MONTH:
			case MULTILINESTRING:
			case MULTIPOINT:
			case MULTIPOLYGON:
			case MUTEX:
			case MYSQL_ERRNO:
			case NAME:
			case NAMES:
			case NATIONAL:
			case NCHAR:
			case NESTED:
			case NETWORK_NAMESPACE:
			case NEVER:
			case NEW:
			case NEXT:
			case NO:
			case NODEGROUP:
			case NONE:
			case NOWAIT:
			case NO_WAIT:
			case NULLS:
			case NUMBER:
			case NVARCHAR:
			case OFF:
			case OFFSET:
			case OJ:
			case OLD:
			case ONE:
			case ONLY:
			case OPEN:
			case OPTIONAL:
			case OPTIONS:
			case ORDINALITY:
			case ORGANIZATION:
			case OTHERS:
			case OWNER:
			case PACK_KEYS:
			case PAGE:
			case PARSER:
			case PARTIAL:
			case PARTITIONING:
			case PARTITIONS:
			case PASSWORD:
			case PASSWORD_LOCK_TIME:
			case PATH:
			case PERSIST:
			case PERSIST_ONLY:
			case PHASE:
			case PLUGIN:
			case PLUGINS:
			case PLUGIN_DIR:
			case POINT:
			case POLYGON:
			case PORT:
			case PRECEDES:
			case PRECEDING:
			case PREPARE:
			case PRESERVE:
			case PREV:
			case PRIMARY:
			case PRIVILEGES:
			case PRIVILEGE_CHECKS_USER:
			case PROCESS:
			case PROCESSLIST:
			case PROFILE:
			case PROFILES:
			case PROXY:
			case QUARTER:
			case QUERY:
			case QUICK:
			case RANDOM:
			case RANK:
			case READ_ONLY:
			case REBUILD:
			case RECOVER:
			case REDO_BUFFER_SIZE:
			case REDUNDANT:
			case REFERENCE:
			case RELAY:
			case RELAYLOG:
			case RELAY_LOG_FILE:
			case RELAY_LOG_POS:
			case RELAY_THREAD:
			case RELOAD:
			case REMOVE:
			case REORGANIZE:
			case REPAIR:
			case REPEATABLE:
			case REPLICATE_DO_DB:
			case REPLICATE_DO_TABLE:
			case REPLICATE_IGNORE_DB:
			case REPLICATE_IGNORE_TABLE:
			case REPLICATE_REWRITE_DB:
			case REPLICATE_WILD_DO_TABLE:
			case REPLICATE_WILD_IGNORE_TABLE:
			case REPLICATION:
			case REQUIRE_ROW_FORMAT:
			case RESET:
			case RESOURCE:
			case RESPECT:
			case RESTART:
			case RESTORE:
			case RESUME:
			case RETAIN:
			case RETURNED_SQLSTATE:
			case RETURNING:
			case RETURNS:
			case REUSE:
			case REVERSE:
			case ROLE:
			case ROLLBACK:
			case ROLLUP:
			case ROTATE:
			case ROUTINE:
			case ROW_COUNT:
			case ROW_FORMAT:
			case RTREE:
			case SAVEPOINT:
			case SCHEDULE:
			case SCHEMA_NAME:
			case SECOND:
			case SECONDARY:
			case SECONDARY_ENGINE:
			case SECONDARY_ENGINE_ATTRIBUTE:
			case SECONDARY_LOAD:
			case SECONDARY_UNLOAD:
			case SECURITY:
			case SERIAL:
			case SERIALIZABLE:
			case SERVER:
			case SESSION:
			case SHARE:
			case SHUTDOWN:
			case SIGNED:
			case SIMPLE:
			case SLAVE:
			case SLOW:
			case SNAPSHOT:
			case SOCKET:
			case SONAME:
			case SOUNDS:
			case SOURCE:
			case SQL_AFTER_GTIDS:
			case SQL_AFTER_MTS_GAPS:
			case SQL_BEFORE_GTIDS:
			case SQL_BUFFER_RESULT:
			case SQL_NO_CACHE:
			case SQL_THREAD:
			case SRID:
			case STACKED:
			case START:
			case STARTS:
			case STATS_AUTO_RECALC:
			case STATS_PERSISTENT:
			case STATS_SAMPLE_PAGES:
			case STATUS:
			case STOP:
			case STORAGE:
			case STREAM:
			case STRING:
			case SUBCLASS_ORIGIN:
			case SUBJECT:
			case SUBPARTITION:
			case SUBPARTITIONS:
			case SUPER:
			case SUSPEND:
			case SWAPS:
			case SWITCHES:
			case SYSTEM:
			case TABLE:
			case TABLES:
			case TABLESPACE:
			case TABLE_CHECKSUM:
			case TABLE_NAME:
			case TEMPORARY:
			case TEMPTABLE:
			case TEXT:
			case THAN:
			case THREAD_PRIORITY:
			case TIES:
			case TIME:
			case TIMESTAMP:
			case TIMESTAMP_ADD:
			case TIMESTAMP_DIFF:
			case TLS:
			case TRANSACTION:
			case TRIGGERS:
			case TRUNCATE:
			case TYPE:
			case TYPES:
			case UNBOUNDED:
			case UNCOMMITTED:
			case UNDEFINED:
			case UNDOFILE:
			case UNDO_BUFFER_SIZE:
			case UNICODE:
			case UNINSTALL:
			case UNKNOWN:
			case UNTIL:
			case UPGRADE:
			case USER:
			case USER_RESOURCES:
			case USE_FRM:
			case UTC_DATE:
			case UTC_TIME:
			case UTC_TIMESTAMP:
			case VALIDATION:
			case VALUE:
			case VARIABLES:
			case VCPU:
			case VIEW:
			case VISIBLE:
			case WAIT:
			case WARNINGS:
			case WEEK:
			case WEIGHT_STRING:
			case WITHOUT:
			case WORK:
			case WRAPPER:
			case X509:
			case XA:
			case XID:
			case XML:
			case YEAR:
			case YEAR_MONTH:
			case SINGLE_QUOTED_TEXT:
			case DOUBLE_QUOTED_TEXT:
			case BQUOTA_STRING:
			case UNDERSCORE_CHARSET:
			case IDENTIFIER_:
			case IP_ADDRESS:
				{
				setState(1917);
				collationName();
				}
				break;
			case QUESTION_:
				{
				setState(1918);
				parameterMarker();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class FieldOrVarSpecContext extends ParserRuleContext {
		public TerminalNode LP_() { return getToken(BaseRuleParser.LP_, 0); }
		public TerminalNode RP_() { return getToken(BaseRuleParser.RP_, 0); }
		public List<IdentifierContext> identifier() {
			return getRuleContexts(IdentifierContext.class);
		}
		public IdentifierContext identifier(int i) {
			return getRuleContext(IdentifierContext.class,i);
		}
		public List<TerminalNode> COMMA_() { return getTokens(BaseRuleParser.COMMA_); }
		public TerminalNode COMMA_(int i) {
			return getToken(BaseRuleParser.COMMA_, i);
		}
		public FieldOrVarSpecContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_fieldOrVarSpec; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterFieldOrVarSpec(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitFieldOrVarSpec(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitFieldOrVarSpec(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FieldOrVarSpecContext fieldOrVarSpec() throws RecognitionException {
		FieldOrVarSpecContext _localctx = new FieldOrVarSpecContext(_ctx, getState());
		enterRule(_localctx, 338, RULE_fieldOrVarSpec);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1921);
			match(LP_);
			setState(1930);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 46)) & ~0x3f) == 0 && ((1L << (_la - 46)) & -4712666368917372929L) != 0) || ((((_la - 110)) & ~0x3f) == 0 && ((1L << (_la - 110)) & -1297058695571120753L) != 0) || ((((_la - 174)) & ~0x3f) == 0 && ((1L << (_la - 174)) & 4875421575642972723L) != 0) || ((((_la - 238)) & ~0x3f) == 0 && ((1L << (_la - 238)) & -4997431877114038273L) != 0) || ((((_la - 304)) & ~0x3f) == 0 && ((1L << (_la - 304)) & 4410396286195629411L) != 0) || ((((_la - 368)) & ~0x3f) == 0 && ((1L << (_la - 368)) & -2377900646138018169L) != 0) || ((((_la - 432)) & ~0x3f) == 0 && ((1L << (_la - 432)) & -4800397428193436097L) != 0) || ((((_la - 496)) & ~0x3f) == 0 && ((1L << (_la - 496)) & 5467228110355045539L) != 0) || ((((_la - 561)) & ~0x3f) == 0 && ((1L << (_la - 561)) & -5484278327649312965L) != 0) || ((((_la - 625)) & ~0x3f) == 0 && ((1L << (_la - 625)) & -165102396204181517L) != 0) || ((((_la - 689)) & ~0x3f) == 0 && ((1L << (_la - 689)) & 2591537911551770617L) != 0) || ((((_la - 753)) & ~0x3f) == 0 && ((1L << (_la - 753)) & 8900217940402666485L) != 0) || ((((_la - 817)) & ~0x3f) == 0 && ((1L << (_la - 817)) & 17781164605443L) != 0)) {
				{
				setState(1922);
				identifier();
				setState(1927);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA_) {
					{
					{
					setState(1923);
					match(COMMA_);
					setState(1924);
					identifier();
					}
					}
					setState(1929);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(1932);
			match(RP_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfNotExistsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BaseRuleParser.IF, 0); }
		public TerminalNode NOT() { return getToken(BaseRuleParser.NOT, 0); }
		public TerminalNode EXISTS() { return getToken(BaseRuleParser.EXISTS, 0); }
		public IfNotExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifNotExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIfNotExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIfNotExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIfNotExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfNotExistsContext ifNotExists() throws RecognitionException {
		IfNotExistsContext _localctx = new IfNotExistsContext(_ctx, getState());
		enterRule(_localctx, 340, RULE_ifNotExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1934);
			match(IF);
			setState(1935);
			match(NOT);
			setState(1936);
			match(EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class IfExistsContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(BaseRuleParser.IF, 0); }
		public TerminalNode EXISTS() { return getToken(BaseRuleParser.EXISTS, 0); }
		public IfExistsContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_ifExists; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterIfExists(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitIfExists(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitIfExists(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IfExistsContext ifExists() throws RecognitionException {
		IfExistsContext _localctx = new IfExistsContext(_ctx, getState());
		enterRule(_localctx, 342, RULE_ifExists);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1938);
			match(IF);
			setState(1939);
			match(EXISTS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConnectionIdContext extends ParserRuleContext {
		public TerminalNode NUMBER_() { return getToken(BaseRuleParser.NUMBER_, 0); }
		public ConnectionIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_connectionId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterConnectionId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitConnectionId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitConnectionId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConnectionIdContext connectionId() throws RecognitionException {
		ConnectionIdContext _localctx = new ConnectionIdContext(_ctx, getState());
		enterRule(_localctx, 344, RULE_connectionId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1941);
			match(NUMBER_);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class LabelNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public LabelNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_labelName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterLabelName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitLabelName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitLabelName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LabelNameContext labelName() throws RecognitionException {
		LabelNameContext _localctx = new LabelNameContext(_ctx, getState());
		enterRule(_localctx, 346, RULE_labelName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1943);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CursorNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public CursorNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_cursorName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCursorName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCursorName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCursorName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CursorNameContext cursorName() throws RecognitionException {
		CursorNameContext _localctx = new CursorNameContext(_ctx, getState());
		enterRule(_localctx, 348, RULE_cursorName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1945);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ConditionNameContext extends ParserRuleContext {
		public IdentifierContext identifier() {
			return getRuleContext(IdentifierContext.class,0);
		}
		public ConditionNameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_conditionName; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterConditionName(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitConditionName(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitConditionName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ConditionNameContext conditionName() throws RecognitionException {
		ConditionNameContext _localctx = new ConditionNameContext(_ctx, getState());
		enterRule(_localctx, 350, RULE_conditionName);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1947);
			identifier();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class CombineOptionContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(BaseRuleParser.ALL, 0); }
		public TerminalNode DISTINCT() { return getToken(BaseRuleParser.DISTINCT, 0); }
		public CombineOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_combineOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterCombineOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitCombineOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitCombineOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CombineOptionContext combineOption() throws RecognitionException {
		CombineOptionContext _localctx = new CombineOptionContext(_ctx, getState());
		enterRule(_localctx, 352, RULE_combineOption);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1949);
			_la = _input.LA(1);
			if ( !(_la==ALL || _la==DISTINCT) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class NoWriteToBinLogContext extends ParserRuleContext {
		public TerminalNode LOCAL() { return getToken(BaseRuleParser.LOCAL, 0); }
		public TerminalNode NO_WRITE_TO_BINLOG() { return getToken(BaseRuleParser.NO_WRITE_TO_BINLOG, 0); }
		public NoWriteToBinLogContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_noWriteToBinLog; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterNoWriteToBinLog(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitNoWriteToBinLog(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitNoWriteToBinLog(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NoWriteToBinLogContext noWriteToBinLog() throws RecognitionException {
		NoWriteToBinLogContext _localctx = new NoWriteToBinLogContext(_ctx, getState());
		enterRule(_localctx, 354, RULE_noWriteToBinLog);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1951);
			_la = _input.LA(1);
			if ( !(_la==LOCAL || _la==NO_WRITE_TO_BINLOG) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ChannelOptionContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(BaseRuleParser.FOR, 0); }
		public TerminalNode CHANNEL() { return getToken(BaseRuleParser.CHANNEL, 0); }
		public String_Context string_() {
			return getRuleContext(String_Context.class,0);
		}
		public ChannelOptionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_channelOption; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).enterChannelOption(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof BaseRuleListener ) ((BaseRuleListener)listener).exitChannelOption(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof BaseRuleVisitor ) return ((BaseRuleVisitor<? extends T>)visitor).visitChannelOption(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ChannelOptionContext channelOption() throws RecognitionException {
		ChannelOptionContext _localctx = new ChannelOptionContext(_ctx, getState());
		enterRule(_localctx, 356, RULE_channelOption);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1953);
			match(FOR);
			setState(1954);
			match(CHANNEL);
			setState(1955);
			string_();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 81:
			return expr_sempred((ExprContext)_localctx, predIndex);
		case 85:
			return booleanPrimary_sempred((BooleanPrimaryContext)_localctx, predIndex);
		case 89:
			return bitExpr_sempred((BitExprContext)_localctx, predIndex);
		case 90:
			return simpleExpr_sempred((SimpleExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 4);
		case 1:
			return precpred(_ctx, 3);
		case 2:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean booleanPrimary_sempred(BooleanPrimaryContext _localctx, int predIndex) {
		switch (predIndex) {
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		case 6:
			return precpred(_ctx, 4);
		case 7:
			return precpred(_ctx, 3);
		case 8:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean bitExpr_sempred(BitExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 9:
			return precpred(_ctx, 15);
		case 10:
			return precpred(_ctx, 14);
		case 11:
			return precpred(_ctx, 13);
		case 12:
			return precpred(_ctx, 12);
		case 13:
			return precpred(_ctx, 11);
		case 14:
			return precpred(_ctx, 10);
		case 15:
			return precpred(_ctx, 9);
		case 16:
			return precpred(_ctx, 8);
		case 17:
			return precpred(_ctx, 7);
		case 18:
			return precpred(_ctx, 6);
		case 19:
			return precpred(_ctx, 5);
		case 20:
			return precpred(_ctx, 4);
		case 21:
			return precpred(_ctx, 3);
		case 22:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean simpleExpr_sempred(SimpleExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 23:
			return precpred(_ctx, 10);
		case 24:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001\u035f\u07a6\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001"+
		"\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004"+
		"\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007"+
		"\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b"+
		"\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007"+
		"\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007"+
		"\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007"+
		"\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007"+
		"\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002\u001b\u0007"+
		"\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002\u001e\u0007"+
		"\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007!\u0002\"\u0007"+
		"\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007&\u0002\'\u0007"+
		"\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0002+\u0007+\u0002,\u0007"+
		",\u0002-\u0007-\u0002.\u0007.\u0002/\u0007/\u00020\u00070\u00021\u0007"+
		"1\u00022\u00072\u00023\u00073\u00024\u00074\u00025\u00075\u00026\u0007"+
		"6\u00027\u00077\u00028\u00078\u00029\u00079\u0002:\u0007:\u0002;\u0007"+
		";\u0002<\u0007<\u0002=\u0007=\u0002>\u0007>\u0002?\u0007?\u0002@\u0007"+
		"@\u0002A\u0007A\u0002B\u0007B\u0002C\u0007C\u0002D\u0007D\u0002E\u0007"+
		"E\u0002F\u0007F\u0002G\u0007G\u0002H\u0007H\u0002I\u0007I\u0002J\u0007"+
		"J\u0002K\u0007K\u0002L\u0007L\u0002M\u0007M\u0002N\u0007N\u0002O\u0007"+
		"O\u0002P\u0007P\u0002Q\u0007Q\u0002R\u0007R\u0002S\u0007S\u0002T\u0007"+
		"T\u0002U\u0007U\u0002V\u0007V\u0002W\u0007W\u0002X\u0007X\u0002Y\u0007"+
		"Y\u0002Z\u0007Z\u0002[\u0007[\u0002\\\u0007\\\u0002]\u0007]\u0002^\u0007"+
		"^\u0002_\u0007_\u0002`\u0007`\u0002a\u0007a\u0002b\u0007b\u0002c\u0007"+
		"c\u0002d\u0007d\u0002e\u0007e\u0002f\u0007f\u0002g\u0007g\u0002h\u0007"+
		"h\u0002i\u0007i\u0002j\u0007j\u0002k\u0007k\u0002l\u0007l\u0002m\u0007"+
		"m\u0002n\u0007n\u0002o\u0007o\u0002p\u0007p\u0002q\u0007q\u0002r\u0007"+
		"r\u0002s\u0007s\u0002t\u0007t\u0002u\u0007u\u0002v\u0007v\u0002w\u0007"+
		"w\u0002x\u0007x\u0002y\u0007y\u0002z\u0007z\u0002{\u0007{\u0002|\u0007"+
		"|\u0002}\u0007}\u0002~\u0007~\u0002\u007f\u0007\u007f\u0002\u0080\u0007"+
		"\u0080\u0002\u0081\u0007\u0081\u0002\u0082\u0007\u0082\u0002\u0083\u0007"+
		"\u0083\u0002\u0084\u0007\u0084\u0002\u0085\u0007\u0085\u0002\u0086\u0007"+
		"\u0086\u0002\u0087\u0007\u0087\u0002\u0088\u0007\u0088\u0002\u0089\u0007"+
		"\u0089\u0002\u008a\u0007\u008a\u0002\u008b\u0007\u008b\u0002\u008c\u0007"+
		"\u008c\u0002\u008d\u0007\u008d\u0002\u008e\u0007\u008e\u0002\u008f\u0007"+
		"\u008f\u0002\u0090\u0007\u0090\u0002\u0091\u0007\u0091\u0002\u0092\u0007"+
		"\u0092\u0002\u0093\u0007\u0093\u0002\u0094\u0007\u0094\u0002\u0095\u0007"+
		"\u0095\u0002\u0096\u0007\u0096\u0002\u0097\u0007\u0097\u0002\u0098\u0007"+
		"\u0098\u0002\u0099\u0007\u0099\u0002\u009a\u0007\u009a\u0002\u009b\u0007"+
		"\u009b\u0002\u009c\u0007\u009c\u0002\u009d\u0007\u009d\u0002\u009e\u0007"+
		"\u009e\u0002\u009f\u0007\u009f\u0002\u00a0\u0007\u00a0\u0002\u00a1\u0007"+
		"\u00a1\u0002\u00a2\u0007\u00a2\u0002\u00a3\u0007\u00a3\u0002\u00a4\u0007"+
		"\u00a4\u0002\u00a5\u0007\u00a5\u0002\u00a6\u0007\u00a6\u0002\u00a7\u0007"+
		"\u00a7\u0002\u00a8\u0007\u00a8\u0002\u00a9\u0007\u00a9\u0002\u00aa\u0007"+
		"\u00aa\u0002\u00ab\u0007\u00ab\u0002\u00ac\u0007\u00ac\u0002\u00ad\u0007"+
		"\u00ad\u0002\u00ae\u0007\u00ae\u0002\u00af\u0007\u00af\u0002\u00b0\u0007"+
		"\u00b0\u0002\u00b1\u0007\u00b1\u0002\u00b2\u0007\u00b2\u0001\u0000\u0001"+
		"\u0000\u0001\u0001\u0001\u0001\u0001\u0002\u0001\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\u0172\b\u0002\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0003\u0004\u0177\b\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u017b\b\u0004\u0001\u0005\u0003\u0005\u017e\b\u0005"+
		"\u0001\u0005\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007"+
		"\u0003\u0007\u0186\b\u0007\u0001\u0007\u0003\u0007\u0189\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u018d\b\u0007\u0001\b\u0003\b\u0190\b\b"+
		"\u0001\b\u0001\b\u0003\b\u0194\b\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001"+
		"\u000b\u0001\u000b\u0003\u000b\u019c\b\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0003\f\u01a8\b\f\u0001"+
		"\r\u0001\r\u0001\u000e\u0001\u000e\u0001\u000f\u0001\u000f\u0001\u0010"+
		"\u0001\u0010\u0001\u0011\u0001\u0011\u0001\u0012\u0001\u0012\u0001\u0012"+
		"\u0003\u0012\u01b7\b\u0012\u0001\u0013\u0001\u0013\u0001\u0014\u0001\u0014"+
		"\u0003\u0014\u01bd\b\u0014\u0001\u0015\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01c2\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016"+
		"\u01c8\b\u0016\u0001\u0016\u0001\u0016\u0001\u0017\u0001\u0017\u0001\u0017"+
		"\u0001\u0017\u0001\u0017\u0003\u0017\u01d1\b\u0017\u0001\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u01d8\b\u0018\u0001\u0018"+
		"\u0001\u0018\u0001\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001a"+
		"\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0001\u001a\u0003\u001a"+
		"\u01e6\b\u001a\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b\u0001\u001b"+
		"\u0001\u001b\u0001\u001b\u0003\u001b\u01ef\b\u001b\u0001\u001c\u0001\u001c"+
		"\u0001\u001c\u0003\u001c\u01f4\b\u001c\u0001\u001c\u0001\u001c\u0001\u001c"+
		"\u0003\u001c\u01f9\b\u001c\u0003\u001c\u01fb\b\u001c\u0001\u001d\u0001"+
		"\u001d\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001\u001e\u0001"+
		"\u001e\u0001\u001e\u0001\u001e\u0001\u001e\u0003\u001e\u0208\b\u001e\u0001"+
		"\u001f\u0001\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001!\u0005"+
		"!\u0212\b!\n!\f!\u0215\t!\u0001\"\u0001\"\u0001\"\u0003\"\u021a\b\"\u0001"+
		"#\u0001#\u0001#\u0005#\u021f\b#\n#\f#\u0222\t#\u0001$\u0001$\u0001$\u0001"+
		"$\u0001$\u0001$\u0001%\u0001%\u0001%\u0003%\u022d\b%\u0001%\u0001%\u0001"+
		"&\u0001&\u0001\'\u0001\'\u0001(\u0001(\u0001)\u0001)\u0001*\u0001*\u0001"+
		"+\u0001+\u0001+\u0001+\u0004+\u023f\b+\u000b+\f+\u0240\u0003+\u0243\b"+
		"+\u0001,\u0001,\u0001,\u0003,\u0248\b,\u0001-\u0001-\u0001-\u0001-\u0003"+
		"-\u024e\b-\u0003-\u0250\b-\u0001.\u0001.\u0001.\u0003.\u0255\b.\u0001"+
		".\u0001.\u0001/\u0001/\u00010\u00010\u00011\u00011\u00011\u00031\u0260"+
		"\b1\u00011\u00011\u00012\u00012\u00012\u00032\u0267\b2\u00012\u00012\u0001"+
		"3\u00013\u00013\u00033\u026e\b3\u00013\u00013\u00014\u00014\u00015\u0001"+
		"5\u00016\u00016\u00017\u00017\u00017\u00057\u027b\b7\n7\f7\u027e\t7\u0001"+
		"8\u00018\u00018\u00058\u0283\b8\n8\f8\u0286\t8\u00019\u00019\u00019\u0005"+
		"9\u028b\b9\n9\f9\u028e\t9\u0001:\u0001:\u0001;\u0001;\u0001<\u0001<\u0001"+
		"=\u0001=\u0001>\u0001>\u0001?\u0001?\u0001@\u0001@\u0001A\u0001A\u0001"+
		"A\u0001A\u0001A\u0001A\u0001B\u0001B\u0001C\u0001C\u0001C\u0003C\u02a9"+
		"\bC\u0001D\u0001D\u0001E\u0001E\u0001E\u0003E\u02b0\bE\u0001F\u0001F\u0003"+
		"F\u02b4\bF\u0001G\u0001G\u0001H\u0001H\u0001H\u0003H\u02bb\bH\u0001I\u0001"+
		"I\u0001J\u0001J\u0001K\u0001K\u0003K\u02c3\bK\u0001L\u0001L\u0001M\u0001"+
		"M\u0001M\u0005M\u02ca\bM\nM\fM\u02cd\tM\u0001N\u0001N\u0003N\u02d1\bN"+
		"\u0001O\u0001O\u0001P\u0001P\u0001P\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0003Q\u02dd\bQ\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001Q\u0001"+
		"Q\u0001Q\u0001Q\u0001Q\u0005Q\u02ea\bQ\nQ\fQ\u02ed\tQ\u0001R\u0001R\u0001"+
		"S\u0001S\u0001T\u0001T\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0003"+
		"U\u02fb\bU\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001U\u0001"+
		"U\u0001U\u0001U\u0001U\u0001U\u0001U\u0005U\u0315\bU\nU\fU\u0318\tU\u0001"+
		"V\u0001V\u0001W\u0001W\u0001X\u0001X\u0003X\u0320\bX\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0003X\u0327\bX\u0001X\u0001X\u0001X\u0001X\u0001X\u0005"+
		"X\u032e\bX\nX\fX\u0331\tX\u0001X\u0001X\u0001X\u0001X\u0003X\u0337\bX"+
		"\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001X\u0001"+
		"X\u0001X\u0001X\u0003X\u0345\bX\u0001X\u0001X\u0001X\u0001X\u0003X\u034b"+
		"\bX\u0001X\u0001X\u0003X\u034f\bX\u0001X\u0001X\u0001X\u0001X\u0003X\u0355"+
		"\bX\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001"+
		"Y\u0001Y\u0001Y\u0001Y\u0001Y\u0001Y\u0005Y\u0384\bY\nY\fY\u0387\tY\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0003Z\u0394\bZ\u0001Z\u0001Z\u0003Z\u0398\bZ\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0005Z\u039e\bZ\nZ\fZ\u03a1\tZ\u0001Z\u0001Z\u0001Z\u0003Z\u03a6\bZ"+
		"\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001"+
		"Z\u0001Z\u0001Z\u0001Z\u0003Z\u03b5\bZ\u0001Z\u0003Z\u03b8\bZ\u0001Z\u0001"+
		"Z\u0001Z\u0003Z\u03bd\bZ\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0001Z\u0005"+
		"Z\u03c5\bZ\nZ\fZ\u03c8\tZ\u0001[\u0001[\u0001\\\u0001\\\u0001\\\u0001"+
		"\\\u0003\\\u03d0\b\\\u0001\\\u0001\\\u0001\\\u0001]\u0001]\u0001]\u0003"+
		"]\u03d8\b]\u0001]\u0001]\u0003]\u03dc\b]\u0001^\u0001^\u0001^\u0005^\u03e1"+
		"\b^\n^\f^\u03e4\t^\u0001_\u0001_\u0001_\u0001_\u0001_\u0003_\u03eb\b_"+
		"\u0001`\u0001`\u0001`\u0003`\u03f0\b`\u0001`\u0001`\u0001`\u0005`\u03f5"+
		"\b`\n`\f`\u03f8\t`\u0003`\u03fa\b`\u0001`\u0001`\u0001a\u0001a\u0001a"+
		"\u0003a\u0401\ba\u0001a\u0001a\u0001a\u0005a\u0406\ba\na\fa\u0409\ta\u0001"+
		"a\u0003a\u040c\ba\u0001a\u0003a\u040f\ba\u0001a\u0001a\u0003a\u0413\b"+
		"a\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0001b\u0003b\u041c\bb\u0001"+
		"b\u0001b\u0001b\u0005b\u0421\bb\nb\fb\u0424\tb\u0003b\u0426\bb\u0001b"+
		"\u0001b\u0003b\u042a\bb\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001c\u0001"+
		"c\u0001c\u0001c\u0001c\u0001c\u0001c\u0003c\u044c\bc\u0001d\u0001d\u0001"+
		"e\u0001e\u0001f\u0001f\u0001f\u0003f\u0455\bf\u0001g\u0001g\u0003g\u0459"+
		"\bg\u0001g\u0001g\u0001g\u0001g\u0001g\u0005g\u0460\bg\ng\fg\u0463\tg"+
		"\u0003g\u0465\bg\u0001g\u0003g\u0468\bg\u0001g\u0003g\u046b\bg\u0001g"+
		"\u0001g\u0001h\u0001h\u0001h\u0003h\u0472\bh\u0001i\u0001i\u0001i\u0001"+
		"i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0001i\u0003i\u0480"+
		"\bi\u0001j\u0001j\u0001k\u0001k\u0001k\u0001k\u0001k\u0001l\u0001l\u0001"+
		"l\u0001l\u0001l\u0001l\u0001l\u0001l\u0001l\u0001l\u0001l\u0001l\u0001"+
		"l\u0003l\u0496\bl\u0001m\u0001m\u0001m\u0003m\u049b\bm\u0001n\u0001n\u0001"+
		"n\u0001n\u0001n\u0005n\u04a2\bn\nn\fn\u04a5\tn\u0001n\u0001n\u0001o\u0001"+
		"o\u0001o\u0003o\u04ac\bo\u0001o\u0001o\u0001o\u0005o\u04b1\bo\no\fo\u04b4"+
		"\to\u0001o\u0003o\u04b7\bo\u0001o\u0003o\u04ba\bo\u0001o\u0001o\u0003"+
		"o\u04be\bo\u0001o\u0001o\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001"+
		"p\u0001p\u0001p\u0001p\u0001p\u0001p\u0003p\u04ce\bp\u0001p\u0001p\u0003"+
		"p\u04d2\bp\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0003p\u04db"+
		"\bp\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001p\u0001"+
		"p\u0003p\u04e7\bp\u0001p\u0003p\u04ea\bp\u0001p\u0001p\u0003p\u04ee\b"+
		"p\u0001q\u0001q\u0001q\u0003q\u04f3\bq\u0001r\u0001r\u0001r\u0001r\u0003"+
		"r\u04f9\br\u0001s\u0001s\u0001s\u0001t\u0001t\u0001t\u0001t\u0001t\u0001"+
		"t\u0001t\u0003t\u0505\bt\u0001u\u0001u\u0001v\u0001v\u0001v\u0001v\u0001"+
		"v\u0001v\u0003v\u050f\bv\u0001v\u0001v\u0001v\u0001v\u0001v\u0001v\u0001"+
		"v\u0001v\u0001v\u0001v\u0001v\u0001v\u0003v\u051d\bv\u0001v\u0001v\u0003"+
		"v\u0521\bv\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001w\u0001"+
		"w\u0001w\u0001w\u0001w\u0001w\u0001w\u0003w\u0531\bw\u0001x\u0001x\u0003"+
		"x\u0535\bx\u0001x\u0001x\u0003x\u0539\bx\u0001x\u0003x\u053c\bx\u0001"+
		"x\u0001x\u0003x\u0540\bx\u0001x\u0003x\u0543\bx\u0001x\u0001x\u0001x\u0001"+
		"x\u0001x\u0003x\u054a\bx\u0001x\u0001x\u0003x\u054e\bx\u0001x\u0001x\u0001"+
		"x\u0003x\u0553\bx\u0001x\u0001x\u0001x\u0001x\u0001x\u0001x\u0003x\u055b"+
		"\bx\u0003x\u055d\bx\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001y\u0001"+
		"z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0003z\u056d\bz\u0001z\u0001"+
		"z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0001z\u0003z\u0578\bz\u0001"+
		"z\u0001z\u0003z\u057c\bz\u0001{\u0001{\u0001{\u0001{\u0001{\u0001{\u0001"+
		"{\u0001|\u0001|\u0001|\u0001|\u0001|\u0005|\u058a\b|\n|\f|\u058d\t|\u0001"+
		"|\u0001|\u0003|\u0591\b|\u0001|\u0001|\u0001}\u0001}\u0001}\u0001}\u0003"+
		"}\u0599\b}\u0001}\u0003}\u059c\b}\u0001}\u0001}\u0001}\u0001}\u0001}\u0001"+
		"}\u0001}\u0001}\u0003}\u05a6\b}\u0001}\u0001}\u0001}\u0003}\u05ab\b}\u0001"+
		"~\u0001~\u0001~\u0001~\u0001~\u0001\u007f\u0001\u007f\u0001\u007f\u0001"+
		"\u007f\u0001\u007f\u0003\u007f\u05b7\b\u007f\u0001\u007f\u0003\u007f\u05ba"+
		"\b\u007f\u0001\u007f\u0001\u007f\u0001\u0080\u0001\u0080\u0001\u0080\u0001"+
		"\u0080\u0005\u0080\u05c2\b\u0080\n\u0080\f\u0080\u05c5\t\u0080\u0001\u0080"+
		"\u0001\u0080\u0001\u0080\u0003\u0080\u05ca\b\u0080\u0001\u0081\u0001\u0081"+
		"\u0003\u0081\u05ce\b\u0081\u0001\u0081\u0003\u0081\u05d1\b\u0081\u0001"+
		"\u0082\u0001\u0082\u0003\u0082\u05d5\b\u0082\u0001\u0083\u0001\u0083\u0001"+
		"\u0083\u0001\u0083\u0003\u0083\u05db\b\u0083\u0001\u0083\u0003\u0083\u05de"+
		"\b\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0001\u0083\u0003\u0083\u05e4"+
		"\b\u0083\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0001\u0084\u0005"+
		"\u0084\u05eb\b\u0084\n\u0084\f\u0084\u05ee\t\u0084\u0001\u0084\u0003\u0084"+
		"\u05f1\b\u0084\u0001\u0084\u0001\u0084\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085"+
		"\u0001\u0085\u0001\u0085\u0001\u0085\u0001\u0085\u0003\u0085\u0614\b\u0085"+
		"\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0003\u0086\u061c\b\u0086\u0001\u0086\u0001\u0086\u0001\u0086\u0001\u0086"+
		"\u0003\u0086\u0622\b\u0086\u0001\u0086\u0001\u0086\u0001\u0087\u0001\u0087"+
		"\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087"+
		"\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087\u0001\u0087"+
		"\u0001\u0087\u0001\u0087\u0001\u0087\u0003\u0087\u0637\b\u0087\u0001\u0088"+
		"\u0001\u0088\u0003\u0088\u063b\b\u0088\u0001\u0088\u0004\u0088\u063e\b"+
		"\u0088\u000b\u0088\f\u0088\u063f\u0001\u0088\u0003\u0088\u0643\b\u0088"+
		"\u0001\u0088\u0001\u0088\u0001\u0089\u0001\u0089\u0001\u008a\u0001\u008a"+
		"\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008b\u0001\u008c"+
		"\u0001\u008c\u0001\u008c\u0001\u008d\u0001\u008d\u0001\u008d\u0001\u008e"+
		"\u0001\u008e\u0001\u008e\u0001\u008f\u0001\u008f\u0001\u0090\u0001\u0090"+
		"\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0001\u0091\u0005\u0091"+
		"\u0662\b\u0091\n\u0091\f\u0091\u0665\t\u0091\u0001\u0092\u0001\u0092\u0003"+
		"\u0092\u0669\b\u0092\u0001\u0092\u0003\u0092\u066c\b\u0092\u0001\u0093"+
		"\u0001\u0093\u0003\u0093\u0670\b\u0093\u0001\u0093\u0003\u0093\u0673\b"+
		"\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u0678\b\u0093\u0003"+
		"\u0093\u067a\b\u0093\u0001\u0093\u0003\u0093\u067d\b\u0093\u0001\u0093"+
		"\u0003\u0093\u0680\b\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093"+
		"\u0685\b\u0093\u0001\u0093\u0003\u0093\u0688\b\u0093\u0001\u0093\u0001"+
		"\u0093\u0003\u0093\u068c\b\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003"+
		"\u0093\u0691\b\u0093\u0001\u0093\u0003\u0093\u0694\b\u0093\u0001\u0093"+
		"\u0001\u0093\u0003\u0093\u0698\b\u0093\u0001\u0093\u0003\u0093\u069b\b"+
		"\u0093\u0001\u0093\u0003\u0093\u069e\b\u0093\u0001\u0093\u0001\u0093\u0001"+
		"\u0093\u0003\u0093\u06a3\b\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003"+
		"\u0093\u06a8\b\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u06ac\b\u0093"+
		"\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0001\u0093"+
		"\u0001\u0093\u0001\u0093\u0003\u0093\u06b6\b\u0093\u0001\u0093\u0001\u0093"+
		"\u0003\u0093\u06ba\b\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u06be\b"+
		"\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u06c2\b\u0093\u0001\u0093\u0003"+
		"\u0093\u06c5\b\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u06ca"+
		"\b\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u06cf\b\u0093"+
		"\u0001\u0093\u0001\u0093\u0003\u0093\u06d3\b\u0093\u0001\u0093\u0001\u0093"+
		"\u0001\u0093\u0003\u0093\u06d8\b\u0093\u0001\u0093\u0001\u0093\u0001\u0093"+
		"\u0001\u0093\u0003\u0093\u06de\b\u0093\u0001\u0093\u0003\u0093\u06e1\b"+
		"\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u06e5\b\u0093\u0001\u0093\u0001"+
		"\u0093\u0003\u0093\u06e9\b\u0093\u0001\u0093\u0003\u0093\u06ec\b\u0093"+
		"\u0001\u0093\u0001\u0093\u0003\u0093\u06f0\b\u0093\u0001\u0093\u0001\u0093"+
		"\u0003\u0093\u06f4\b\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093"+
		"\u06f9\b\u0093\u0001\u0093\u0001\u0093\u0001\u0093\u0003\u0093\u06fe\b"+
		"\u0093\u0001\u0093\u0003\u0093\u0701\b\u0093\u0001\u0094\u0001\u0094\u0001"+
		"\u0094\u0001\u0094\u0005\u0094\u0707\b\u0094\n\u0094\f\u0094\u070a\t\u0094"+
		"\u0001\u0094\u0001\u0094\u0001\u0095\u0001\u0095\u0001\u0095\u0003\u0095"+
		"\u0711\b\u0095\u0001\u0096\u0001\u0096\u0003\u0096\u0715\b\u0096\u0001"+
		"\u0097\u0004\u0097\u0718\b\u0097\u000b\u0097\f\u0097\u0719\u0001\u0098"+
		"\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0098\u0001\u0099"+
		"\u0001\u0099\u0001\u0099\u0001\u0099\u0001\u009a\u0001\u009a\u0001\u009a"+
		"\u0001\u009a\u0001\u009a\u0001\u009a\u0003\u009a\u072c\b\u009a\u0001\u009a"+
		"\u0001\u009a\u0001\u009a\u0001\u009a\u0003\u009a\u0732\b\u009a\u0003\u009a"+
		"\u0734\b\u009a\u0001\u009b\u0001\u009b\u0003\u009b\u0738\b\u009b\u0001"+
		"\u009b\u0001\u009b\u0003\u009b\u073c\b\u009b\u0001\u009c\u0001\u009c\u0003"+
		"\u009c\u0740\b\u009c\u0001\u009c\u0001\u009c\u0003\u009c\u0744\b\u009c"+
		"\u0001\u009d\u0001\u009d\u0001\u009d\u0003\u009d\u0749\b\u009d\u0001\u009e"+
		"\u0003\u009e\u074c\b\u009e\u0001\u009e\u0001\u009e\u0003\u009e\u0750\b"+
		"\u009e\u0001\u009e\u0001\u009e\u0001\u009f\u0003\u009f\u0755\b\u009f\u0001"+
		"\u009f\u0001\u009f\u0003\u009f\u0759\b\u009f\u0001\u009f\u0001\u009f\u0001"+
		"\u00a0\u0003\u00a0\u075e\b\u00a0\u0001\u00a0\u0001\u00a0\u0003\u00a0\u0762"+
		"\b\u00a0\u0001\u00a0\u0001\u00a0\u0001\u00a1\u0001\u00a1\u0001\u00a1\u0003"+
		"\u00a1\u0769\b\u00a1\u0001\u00a1\u0003\u00a1\u076c\b\u00a1\u0001\u00a2"+
		"\u0001\u00a2\u0001\u00a3\u0001\u00a3\u0001\u00a4\u0001\u00a4\u0001\u00a5"+
		"\u0001\u00a5\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a6\u0001\u00a7"+
		"\u0001\u00a7\u0001\u00a7\u0001\u00a8\u0001\u00a8\u0001\u00a8\u0003\u00a8"+
		"\u0780\b\u00a8\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0001\u00a9\u0005\u00a9"+
		"\u0786\b\u00a9\n\u00a9\f\u00a9\u0789\t\u00a9\u0003\u00a9\u078b\b\u00a9"+
		"\u0001\u00a9\u0001\u00a9\u0001\u00aa\u0001\u00aa\u0001\u00aa\u0001\u00aa"+
		"\u0001\u00ab\u0001\u00ab\u0001\u00ab\u0001\u00ac\u0001\u00ac\u0001\u00ad"+
		"\u0001\u00ad\u0001\u00ae\u0001\u00ae\u0001\u00af\u0001\u00af\u0001\u00b0"+
		"\u0001\u00b0\u0001\u00b1\u0001\u00b1\u0001\u00b2\u0001\u00b2\u0001\u00b2"+
		"\u0001\u00b2\u0001\u00b2\u0000\u0004\u00a2\u00aa\u00b2\u00b4\u00b3\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02468:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084"+
		"\u0086\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c"+
		"\u009e\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4"+
		"\u00b6\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc"+
		"\u00ce\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4"+
		"\u00e6\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc"+
		"\u00fe\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\u0112\u0114"+
		"\u0116\u0118\u011a\u011c\u011e\u0120\u0122\u0124\u0126\u0128\u012a\u012c"+
		"\u012e\u0130\u0132\u0134\u0136\u0138\u013a\u013c\u013e\u0140\u0142\u0144"+
		"\u0146\u0148\u014a\u014c\u014e\u0150\u0152\u0154\u0156\u0158\u015a\u015c"+
		"\u015e\u0160\u0162\u0164\u00009\u0007\u0000.CEPmm\u0172\u0172\u01ae\u01ae"+
		"\u021c\u021c\u0310\u0312\u0001\u0000\u0352\u0353\u0002\u0000AA\u0356\u0356"+
		"\u0001\u0000\r\u000e\u0002\u0000\u00c2\u00c2\u02e7\u02e8\u0002\u0000\u010a"+
		"\u010a\u02f4\u02f4\u0099\u0000JJNNSUW[^^abgknpuvxz|}\u0083\u0083\u0085"+
		"\u0086\u0088\u0089\u0091\u0093\u0095\u0097\u0099\u0099\u009b\u009d\u00a0"+
		"\u00a6\u00a8\u00a9\u00ab\u00ad\u00af\u00af\u00b2\u00b3\u00b7\u00b7\u00bd"+
		"\u00be\u00c1\u00c4\u00c7\u00c7\u00cd\u00d0\u00d2\u00d2\u00d7\u00d7\u00d9"+
		"\u00dd\u00e3\u00e3\u00e5\u00e7\u00ec\u00ec\u00ee\u00ee\u00f0\u00f8\u00fb"+
		"\u00fc\u00fe\u00ff\u0103\u0104\u0106\u0109\u010b\u010c\u010f\u0111\u0113"+
		"\u0113\u0118\u0118\u011d\u011e\u0120\u0120\u0123\u0123\u0125\u0125\u0127"+
		"\u0127\u0129\u012a\u012d\u012d\u0130\u0131\u0136\u0136\u013a\u013e\u0142"+
		"\u0142\u0145\u0145\u0148\u0148\u014a\u014a\u014c\u014c\u0151\u0151\u0153"+
		"\u0153\u015d\u015f\u0162\u0162\u0164\u0165\u0168\u0168\u016a\u016d\u0171"+
		"\u0171\u0177\u0177\u0179\u017a\u017f\u0180\u0186\u0189\u0191\u0192\u0194"+
		"\u01a7\u01a9\u01ac\u01af\u01b5\u01b9\u01bc\u01be\u01bf\u01c2\u01c2\u01c4"+
		"\u01c4\u01c6\u01cf\u01d3\u01d8\u01da\u01da\u01df\u01e0\u01e5\u01e6\u01e8"+
		"\u01e8\u01ea\u01ed\u01ef\u01f1\u01f5\u01f5\u01f7\u01f7\u01fa\u01fc\u0201"+
		"\u0205\u0207\u020b\u020f\u0215\u0217\u0217\u021a\u021b\u021d\u021e\u0221"+
		"\u0223\u0226\u0229\u022b\u022b\u022e\u022e\u0231\u0232\u0234\u0236\u0239"+
		"\u023d\u0240\u0240\u0242\u0242\u0245\u0245\u0249\u024f\u0252\u0252\u0257"+
		"\u0257\u0259\u0259\u025b\u025c\u025e\u0262\u0266\u0266\u0268\u026a\u026d"+
		"\u026e\u0270\u0270\u0272\u0272\u0275\u027b\u027d\u027d\u0281\u0283\u0286"+
		"\u0286\u028d\u028d\u0290\u0290\u0292\u0296\u029d\u029f\u02a1\u02a1\u02a3"+
		"\u02a3\u02a5\u02a6\u02a8\u02a8\u02ab\u02af\u02b1\u02b1\u02b4\u02b9\u02bb"+
		"\u02be\u02da\u02e0\u02e2\u02e3\u02e5\u02ea\u02ee\u02ee\u02f1\u02f1\u02f3"+
		"\u02f3\u02f6\u02fa\u02fc\u02fd\u0302\u0302\u0307\u0307\u0309\u0309\u030c"+
		"\u030e\u0313\u0314\u0319\u0319\u031b\u031c\u031e\u0322\u0328\u032a\u032c"+
		"\u032c\u032e\u032f\u0331\u0332\u0003\u0000\u0100\u0100\u0258\u0258\u0288"+
		"\u0288 \u0000eeqq\u007f\u0080\u008e\u008e\u0090\u0090\u0094\u0094\u009e"+
		"\u009f\u00ae\u00ae\u00c9\u00c9\u00e1\u00e1\u00ef\u00ef\u0117\u0117\u0119"+
		"\u0119\u0135\u0135\u0138\u0138\u0146\u0146\u0152\u0152\u0170\u0170\u01d9"+
		"\u01d9\u0216\u0216\u0219\u0219\u0243\u0243\u0254\u0254\u0267\u0267\u0271"+
		"\u0271\u028a\u028a\u028f\u028f\u02a9\u02a9\u02b0\u02b0\u02f5\u02f5\u02fe"+
		"\u02ff\u032d\u032d\t\u0000\u00fa\u00fa\u010e\u010e\u01db\u01db\u0220\u0220"+
		"\u0224\u0224\u023f\u023f\u0250\u0250\u0256\u0256\u02ba\u02ba\u0004\u0000"+
		"\u012b\u012b\u0182\u0182\u020d\u020e\u0284\u0284\u0003\u0000\u012b\u012b"+
		"\u0182\u0182\u0284\u0284\u0002\u0000\u01f0\u01f0\u032b\u032b\u0002\u0000"+
		"\u0011\u0011$&\u0002\u0000XXpp\u0001\u0000\u02da\u02db\u0003\u0000\u00d3"+
		"\u00d3\u0150\u0150\u0308\u0308\u0002\u0000\u0119\u0119\u0216\u0216\u0002"+
		"\u0000\u0002\u0002``\u0002\u0000\u0003\u0003\u01f8\u01f8\u0002\u0000\u0004"+
		"\u0004\u01de\u01de\u0004\u0000\u010a\u010a\u01e4\u01e4\u02f4\u02f4\u0302"+
		"\u0302\u0002\u0000\\\\aa\u0002\u0000\u0016\u0016**\u0001\u0000\u0016\u001b"+
		"\u0002\u0000\u0238\u0238\u0265\u0265\u0001\u0000+,\u0002\u0000\u00eb\u00eb"+
		"\u00f6\u00f6\u0003\u0000.2kkmm\u0002\u0000\u022a\u022a\u026c\u026c\u0005"+
		"\u0000\u00b6\u00b6\u00d4\u00d4\u020c\u020c\u022b\u022b\u026f\u026f\u0002"+
		"\u0000\u016f\u016f\u0174\u0174\u0002\u0000\u0112\u0112\u0172\u0172\u0002"+
		"\u0000\u0111\u0111\u0171\u0171\u0002\u0000\'\'\u0357\u0357\u0002\u0000"+
		"\u0144\u0144\u0257\u0257\u0003\u0000\u0107\u0107\u0228\u0228\u030e\u030e"+
		"\u0001\u0000\u028a\u028c\u0001\u0000\u0304\u0306\u0001\u000056\u0003\u0000"+
		"{{\u0175\u0175\u02f0\u02f0\n\u0000\u00c4\u00c8\u013e\u0141\u01bc\u01bc"+
		"\u01bf\u01c1\u01c7\u01c7\u0226\u0226\u0276\u0276\u027c\u027c\u0321\u0321"+
		"\u0331\u0332\u0007\u0000ss\u0154\u0154\u015a\u015a\u01b7\u01b7\u01bd\u01bd"+
		"\u0291\u0291\u02ec\u02ec\u0003\u0000\u00ca\u00cb\u0113\u0114\u01e7\u01e7"+
		"\u0001\u0000yz\u0002\u0000\u018b\u018b\u01b6\u01b6\u0001\u0000\u018d\u018e"+
		"\u0006\u0000\u0125\u0127\u0168\u0168\u017f\u017f\u01c8\u01ca\u0213\u0214"+
		"\u0281\u0281\u0003\u0000\u028a\u028a\u0304\u0304\u0333\u0333\u0002\u0000"+
		"\u008a\u008a\u008c\u008c\u0002\u0000\u00ba\u00ba\u0183\u0184\u0003\u0000"+
		"\u00cd\u00cd\u00e7\u00e7\u0113\u0113\u0003\u0000JJ\u00cd\u00cd\u00dd\u00dd"+
		"\u0002\u0000dd\u00d5\u00d5\u0002\u0000\u0149\u0149\u016b\u016b\u0002\u0000"+
		"\\\\\u00de\u00de\u0002\u0000\u0182\u0182\u01e1\u01e1\u0896\u0000\u0166"+
		"\u0001\u0000\u0000\u0000\u0002\u0168\u0001\u0000\u0000\u0000\u0004\u0171"+
		"\u0001\u0000\u0000\u0000\u0006\u0173\u0001\u0000\u0000\u0000\b\u017a\u0001"+
		"\u0000\u0000\u0000\n\u017d\u0001\u0000\u0000\u0000\f\u0181\u0001\u0000"+
		"\u0000\u0000\u000e\u0185\u0001\u0000\u0000\u0000\u0010\u018f\u0001\u0000"+
		"\u0000\u0000\u0012\u0195\u0001\u0000\u0000\u0000\u0014\u0197\u0001\u0000"+
		"\u0000\u0000\u0016\u019b\u0001\u0000\u0000\u0000\u0018\u01a7\u0001\u0000"+
		"\u0000\u0000\u001a\u01a9\u0001\u0000\u0000\u0000\u001c\u01ab\u0001\u0000"+
		"\u0000\u0000\u001e\u01ad\u0001\u0000\u0000\u0000 \u01af\u0001\u0000\u0000"+
		"\u0000\"\u01b1\u0001\u0000\u0000\u0000$\u01b6\u0001\u0000\u0000\u0000"+
		"&\u01b8\u0001\u0000\u0000\u0000(\u01bc\u0001\u0000\u0000\u0000*\u01c1"+
		"\u0001\u0000\u0000\u0000,\u01c3\u0001\u0000\u0000\u0000.\u01d0\u0001\u0000"+
		"\u0000\u00000\u01d2\u0001\u0000\u0000\u00002\u01db\u0001\u0000\u0000\u0000"+
		"4\u01e5\u0001\u0000\u0000\u00006\u01ee\u0001\u0000\u0000\u00008\u01fa"+
		"\u0001\u0000\u0000\u0000:\u01fc\u0001\u0000\u0000\u0000<\u0207\u0001\u0000"+
		"\u0000\u0000>\u0209\u0001\u0000\u0000\u0000@\u020c\u0001\u0000\u0000\u0000"+
		"B\u020e\u0001\u0000\u0000\u0000D\u0219\u0001\u0000\u0000\u0000F\u021b"+
		"\u0001\u0000\u0000\u0000H\u0223\u0001\u0000\u0000\u0000J\u022c\u0001\u0000"+
		"\u0000\u0000L\u0230\u0001\u0000\u0000\u0000N\u0232\u0001\u0000\u0000\u0000"+
		"P\u0234\u0001\u0000\u0000\u0000R\u0236\u0001\u0000\u0000\u0000T\u0238"+
		"\u0001\u0000\u0000\u0000V\u0242\u0001\u0000\u0000\u0000X\u0244\u0001\u0000"+
		"\u0000\u0000Z\u024f\u0001\u0000\u0000\u0000\\\u0254\u0001\u0000\u0000"+
		"\u0000^\u0258\u0001\u0000\u0000\u0000`\u025a\u0001\u0000\u0000\u0000b"+
		"\u025f\u0001\u0000\u0000\u0000d\u0266\u0001\u0000\u0000\u0000f\u026d\u0001"+
		"\u0000\u0000\u0000h\u0271\u0001\u0000\u0000\u0000j\u0273\u0001\u0000\u0000"+
		"\u0000l\u0275\u0001\u0000\u0000\u0000n\u0277\u0001\u0000\u0000\u0000p"+
		"\u027f\u0001\u0000\u0000\u0000r\u0287\u0001\u0000\u0000\u0000t\u028f\u0001"+
		"\u0000\u0000\u0000v\u0291\u0001\u0000\u0000\u0000x\u0293\u0001\u0000\u0000"+
		"\u0000z\u0295\u0001\u0000\u0000\u0000|\u0297\u0001\u0000\u0000\u0000~"+
		"\u0299\u0001\u0000\u0000\u0000\u0080\u029b\u0001\u0000\u0000\u0000\u0082"+
		"\u029d\u0001\u0000\u0000\u0000\u0084\u02a3\u0001\u0000\u0000\u0000\u0086"+
		"\u02a5\u0001\u0000\u0000\u0000\u0088\u02aa\u0001\u0000\u0000\u0000\u008a"+
		"\u02ac\u0001\u0000\u0000\u0000\u008c\u02b3\u0001\u0000\u0000\u0000\u008e"+
		"\u02b5\u0001\u0000\u0000\u0000\u0090\u02b7\u0001\u0000\u0000\u0000\u0092"+
		"\u02bc\u0001\u0000\u0000\u0000\u0094\u02be\u0001\u0000\u0000\u0000\u0096"+
		"\u02c2\u0001\u0000\u0000\u0000\u0098\u02c4\u0001\u0000\u0000\u0000\u009a"+
		"\u02c6\u0001\u0000\u0000\u0000\u009c\u02d0\u0001\u0000\u0000\u0000\u009e"+
		"\u02d2\u0001\u0000\u0000\u0000\u00a0\u02d4\u0001\u0000\u0000\u0000\u00a2"+
		"\u02dc\u0001\u0000\u0000\u0000\u00a4\u02ee\u0001\u0000\u0000\u0000\u00a6"+
		"\u02f0\u0001\u0000\u0000\u0000\u00a8\u02f2\u0001\u0000\u0000\u0000\u00aa"+
		"\u02f4\u0001\u0000\u0000\u0000\u00ac\u0319\u0001\u0000\u0000\u0000\u00ae"+
		"\u031b\u0001\u0000\u0000\u0000\u00b0\u0354\u0001\u0000\u0000\u0000\u00b2"+
		"\u0356\u0001\u0000\u0000\u0000\u00b4\u03bc\u0001\u0000\u0000\u0000\u00b6"+
		"\u03c9\u0001\u0000\u0000\u0000\u00b8\u03cf\u0001\u0000\u0000\u0000\u00ba"+
		"\u03d4\u0001\u0000\u0000\u0000\u00bc\u03dd\u0001\u0000\u0000\u0000\u00be"+
		"\u03ea\u0001\u0000\u0000\u0000\u00c0\u03ec\u0001\u0000\u0000\u0000\u00c2"+
		"\u03fd\u0001\u0000\u0000\u0000\u00c4\u0429\u0001\u0000\u0000\u0000\u00c6"+
		"\u044b\u0001\u0000\u0000\u0000\u00c8\u044d\u0001\u0000\u0000\u0000\u00ca"+
		"\u044f\u0001\u0000\u0000\u0000\u00cc\u0451\u0001\u0000\u0000\u0000\u00ce"+
		"\u0456\u0001\u0000\u0000\u0000\u00d0\u046e\u0001\u0000\u0000\u0000\u00d2"+
		"\u047f\u0001\u0000\u0000\u0000\u00d4\u0481\u0001\u0000\u0000\u0000\u00d6"+
		"\u0483\u0001\u0000\u0000\u0000\u00d8\u0495\u0001\u0000\u0000\u0000\u00da"+
		"\u0497\u0001\u0000\u0000\u0000\u00dc\u049c\u0001\u0000\u0000\u0000\u00de"+
		"\u04a8\u0001\u0000\u0000\u0000\u00e0\u04ed\u0001\u0000\u0000\u0000\u00e2"+
		"\u04ef\u0001\u0000\u0000\u0000\u00e4\u04f4\u0001\u0000\u0000\u0000\u00e6"+
		"\u04fa\u0001\u0000\u0000\u0000\u00e8\u0504\u0001\u0000\u0000\u0000\u00ea"+
		"\u0506\u0001\u0000\u0000\u0000\u00ec\u0520\u0001\u0000\u0000\u0000\u00ee"+
		"\u0530\u0001\u0000\u0000\u0000\u00f0\u055c\u0001\u0000\u0000\u0000\u00f2"+
		"\u055e\u0001\u0000\u0000\u0000\u00f4\u057b\u0001\u0000\u0000\u0000\u00f6"+
		"\u057d\u0001\u0000\u0000\u0000\u00f8\u0584\u0001\u0000\u0000\u0000\u00fa"+
		"\u05aa\u0001\u0000\u0000\u0000\u00fc\u05ac\u0001\u0000\u0000\u0000\u00fe"+
		"\u05b1\u0001\u0000\u0000\u0000\u0100\u05bd\u0001\u0000\u0000\u0000\u0102"+
		"\u05cb\u0001\u0000\u0000\u0000\u0104\u05d4\u0001\u0000\u0000\u0000\u0106"+
		"\u05e3\u0001\u0000\u0000\u0000\u0108\u05e5\u0001\u0000\u0000\u0000\u010a"+
		"\u0613\u0001\u0000\u0000\u0000\u010c\u0615\u0001\u0000\u0000\u0000\u010e"+
		"\u0636\u0001\u0000\u0000\u0000\u0110\u0638\u0001\u0000\u0000\u0000\u0112"+
		"\u0646\u0001\u0000\u0000\u0000\u0114\u0648\u0001\u0000\u0000\u0000\u0116"+
		"\u064a\u0001\u0000\u0000\u0000\u0118\u064f\u0001\u0000\u0000\u0000\u011a"+
		"\u0652\u0001\u0000\u0000\u0000\u011c\u0655\u0001\u0000\u0000\u0000\u011e"+
		"\u0658\u0001\u0000\u0000\u0000\u0120\u065a\u0001\u0000\u0000\u0000\u0122"+
		"\u065c\u0001\u0000\u0000\u0000\u0124\u0668\u0001\u0000\u0000\u0000\u0126"+
		"\u0700\u0001\u0000\u0000\u0000\u0128\u0702\u0001\u0000\u0000\u0000\u012a"+
		"\u0710\u0001\u0000\u0000\u0000\u012c\u0714\u0001\u0000\u0000\u0000\u012e"+
		"\u0717\u0001\u0000\u0000\u0000\u0130\u071b\u0001\u0000\u0000\u0000\u0132"+
		"\u0721\u0001\u0000\u0000\u0000\u0134\u0733\u0001\u0000\u0000\u0000\u0136"+
		"\u073b\u0001\u0000\u0000\u0000\u0138\u0743\u0001\u0000\u0000\u0000\u013a"+
		"\u0748\u0001\u0000\u0000\u0000\u013c\u074b\u0001\u0000\u0000\u0000\u013e"+
		"\u0754\u0001\u0000\u0000\u0000\u0140\u075d\u0001\u0000\u0000\u0000\u0142"+
		"\u0765\u0001\u0000\u0000\u0000\u0144\u076d\u0001\u0000\u0000\u0000\u0146"+
		"\u076f\u0001\u0000\u0000\u0000\u0148\u0771\u0001\u0000\u0000\u0000\u014a"+
		"\u0773\u0001\u0000\u0000\u0000\u014c\u0775\u0001\u0000\u0000\u0000\u014e"+
		"\u0779\u0001\u0000\u0000\u0000\u0150\u077c\u0001\u0000\u0000\u0000\u0152"+
		"\u0781\u0001\u0000\u0000\u0000\u0154\u078e\u0001\u0000\u0000\u0000\u0156"+
		"\u0792\u0001\u0000\u0000\u0000\u0158\u0795\u0001\u0000\u0000\u0000\u015a"+
		"\u0797\u0001\u0000\u0000\u0000\u015c\u0799\u0001\u0000\u0000\u0000\u015e"+
		"\u079b\u0001\u0000\u0000\u0000\u0160\u079d\u0001\u0000\u0000\u0000\u0162"+
		"\u079f\u0001\u0000\u0000\u0000\u0164\u07a1\u0001\u0000\u0000\u0000\u0166"+
		"\u0167\u0005\'\u0000\u0000\u0167\u0001\u0001\u0000\u0000\u0000\u0168\u0169"+
		"\u0007\u0000\u0000\u0000\u0169\u0003\u0001\u0000\u0000\u0000\u016a\u0172"+
		"\u0003\b\u0004\u0000\u016b\u0172\u0003\n\u0005\u0000\u016c\u0172\u0003"+
		"\f\u0006\u0000\u016d\u0172\u0003\u000e\u0007\u0000\u016e\u0172\u0003\u0010"+
		"\b\u0000\u016f\u0172\u0003\u0012\t\u0000\u0170\u0172\u0003\u0014\n\u0000"+
		"\u0171\u016a\u0001\u0000\u0000\u0000\u0171\u016b\u0001\u0000\u0000\u0000"+
		"\u0171\u016c\u0001\u0000\u0000\u0000\u0171\u016d\u0001\u0000\u0000\u0000"+
		"\u0171\u016e\u0001\u0000\u0000\u0000\u0171\u016f\u0001\u0000\u0000\u0000"+
		"\u0171\u0170\u0001\u0000\u0000\u0000\u0172\u0005\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0007\u0001\u0000\u0000\u0174\u0007\u0001\u0000\u0000\u0000"+
		"\u0175\u0177\u0007\u0002\u0000\u0000\u0176\u0175\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0001\u0000\u0000\u0000\u0177\u0178\u0001\u0000\u0000\u0000"+
		"\u0178\u017b\u0003\u0006\u0003\u0000\u0179\u017b\u0005\u0355\u0000\u0000"+
		"\u017a\u0176\u0001\u0000\u0000\u0000\u017a\u0179\u0001\u0000\u0000\u0000"+
		"\u017b\t\u0001\u0000\u0000\u0000\u017c\u017e\u0007\u0003\u0000\u0000\u017d"+
		"\u017c\u0001\u0000\u0000\u0000\u017d\u017e\u0001\u0000\u0000\u0000\u017e"+
		"\u017f\u0001\u0000\u0000\u0000\u017f\u0180\u0005\u0357\u0000\u0000\u0180"+
		"\u000b\u0001\u0000\u0000\u0000\u0181\u0182\u0007\u0004\u0000\u0000\u0182"+
		"\u0183\u0003\u012a\u0095\u0000\u0183\r\u0001\u0000\u0000\u0000\u0184\u0186"+
		"\u0005\u0356\u0000\u0000\u0185\u0184\u0001\u0000\u0000\u0000\u0185\u0186"+
		"\u0001\u0000\u0000\u0000\u0186\u0188\u0001\u0000\u0000\u0000\u0187\u0189"+
		"\u0005A\u0000\u0000\u0188\u0187\u0001\u0000\u0000\u0000\u0188\u0189\u0001"+
		"\u0000\u0000\u0000\u0189\u018a\u0001\u0000\u0000\u0000\u018a\u018c\u0005"+
		"\u035b\u0000\u0000\u018b\u018d\u0003\u0150\u00a8\u0000\u018c\u018b\u0001"+
		"\u0000\u0000\u0000\u018c\u018d\u0001\u0000\u0000\u0000\u018d\u000f\u0001"+
		"\u0000\u0000\u0000\u018e\u0190\u0005\u0356\u0000\u0000\u018f\u018e\u0001"+
		"\u0000\u0000\u0000\u018f\u0190\u0001\u0000\u0000\u0000\u0190\u0191\u0001"+
		"\u0000\u0000\u0000\u0191\u0193\u0005\u035c\u0000\u0000\u0192\u0194\u0003"+
		"\u0150\u00a8\u0000\u0193\u0192\u0001\u0000\u0000\u0000\u0193\u0194\u0001"+
		"\u0000\u0000\u0000\u0194\u0011\u0001\u0000\u0000\u0000\u0195\u0196\u0007"+
		"\u0005\u0000\u0000\u0196\u0013\u0001\u0000\u0000\u0000\u0197\u0198\u0005"+
		"\u01e4\u0000\u0000\u0198\u0015\u0001\u0000\u0000\u0000\u0199\u019c\u0003"+
		"$\u0012\u0000\u019a\u019c\u0005t\u0000\u0000\u019b\u0199\u0001\u0000\u0000"+
		"\u0000\u019b\u019a\u0001\u0000\u0000\u0000\u019c\u0017\u0001\u0000\u0000"+
		"\u0000\u019d\u01a8\u0005\u035d\u0000\u0000\u019e\u01a8\u0003\u001a\r\u0000"+
		"\u019f\u01a8\u0003\u001c\u000e\u0000\u01a0\u01a8\u0003\u001e\u000f\u0000"+
		"\u01a1\u01a8\u0003 \u0010\u0000\u01a2\u01a8\u0003\"\u0011\u0000\u01a3"+
		"\u01a8\u0003\u0002\u0001\u0000\u01a4\u01a8\u0005\u0353\u0000\u0000\u01a5"+
		"\u01a8\u0005\u0356\u0000\u0000\u01a6\u01a8\u0005\u0354\u0000\u0000\u01a7"+
		"\u019d\u0001\u0000\u0000\u0000\u01a7\u019e\u0001\u0000\u0000\u0000\u01a7"+
		"\u019f\u0001\u0000\u0000\u0000\u01a7\u01a0\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a1\u0001\u0000\u0000\u0000\u01a7\u01a2\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a3\u0001\u0000\u0000\u0000\u01a7\u01a4\u0001\u0000\u0000\u0000\u01a7"+
		"\u01a5\u0001\u0000\u0000\u0000\u01a7\u01a6\u0001\u0000\u0000\u0000\u01a8"+
		"\u0019\u0001\u0000\u0000\u0000\u01a9\u01aa\u0007\u0006\u0000\u0000\u01aa"+
		"\u001b\u0001\u0000\u0000\u0000\u01ab\u01ac\u0007\u0007\u0000\u0000\u01ac"+
		"\u001d\u0001\u0000\u0000\u0000\u01ad\u01ae\u0007\b\u0000\u0000\u01ae\u001f"+
		"\u0001\u0000\u0000\u0000\u01af\u01b0\u0007\t\u0000\u0000\u01b0!\u0001"+
		"\u0000\u0000\u0000\u01b1\u01b2\u0007\n\u0000\u0000\u01b2#\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b7\u0003\u0018\f\u0000\u01b4\u01b7\u0003\u0006\u0003"+
		"\u0000\u01b5\u01b7\u0003&\u0013\u0000\u01b6\u01b3\u0001\u0000\u0000\u0000"+
		"\u01b6\u01b4\u0001\u0000\u0000\u0000\u01b6\u01b5\u0001\u0000\u0000\u0000"+
		"\u01b7%\u0001\u0000\u0000\u0000\u01b8\u01b9\u0005\u035e\u0000\u0000\u01b9"+
		"\'\u0001\u0000\u0000\u0000\u01ba\u01bd\u0003*\u0015\u0000\u01bb\u01bd"+
		"\u0003,\u0016\u0000\u01bc\u01ba\u0001\u0000\u0000\u0000\u01bc\u01bb\u0001"+
		"\u0000\u0000\u0000\u01bd)\u0001\u0000\u0000\u0000\u01be\u01bf\u0005(\u0000"+
		"\u0000\u01bf\u01c2\u0003$\u0012\u0000\u01c0\u01c2\u0003$\u0012\u0000\u01c1"+
		"\u01be\u0001\u0000\u0000\u0000\u01c1\u01c0\u0001\u0000\u0000\u0000\u01c2"+
		"+\u0001\u0000\u0000\u0000\u01c3\u01c4\u0005(\u0000\u0000\u01c4\u01c7\u0005"+
		"(\u0000\u0000\u01c5\u01c6\u0007\u000b\u0000\u0000\u01c6\u01c8\u0005\u0012"+
		"\u0000\u0000\u01c7\u01c5\u0001\u0000\u0000\u0000\u01c7\u01c8\u0001\u0000"+
		"\u0000\u0000\u01c8\u01c9\u0001\u0000\u0000\u0000\u01c9\u01ca\u0003.\u0017"+
		"\u0000\u01ca-\u0001\u0000\u0000\u0000\u01cb\u01d1\u0003$\u0012\u0000\u01cc"+
		"\u01cd\u0003$\u0012\u0000\u01cd\u01ce\u0005\u0012\u0000\u0000\u01ce\u01cf"+
		"\u0003\u0018\f\u0000\u01cf\u01d1\u0001\u0000\u0000\u0000\u01d0\u01cb\u0001"+
		"\u0000\u0000\u0000\u01d0\u01cc\u0001\u0000\u0000\u0000\u01d1/\u0001\u0000"+
		"\u0000\u0000\u01d2\u01d3\u0005(\u0000\u0000\u01d3\u01d7\u0005(\u0000\u0000"+
		"\u01d4\u01d5\u00032\u0019\u0000\u01d5\u01d6\u0005\u0012\u0000\u0000\u01d6"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d7\u01d4\u0001\u0000\u0000\u0000\u01d7"+
		"\u01d8\u0001\u0000\u0000\u0000\u01d8\u01d9\u0001\u0000\u0000\u0000\u01d9"+
		"\u01da\u00034\u001a\u0000\u01da1\u0001\u0000\u0000\u0000\u01db\u01dc\u0007"+
		"\n\u0000\u0000\u01dc3\u0001\u0000\u0000\u0000\u01dd\u01e6\u0003\u0018"+
		"\f\u0000\u01de\u01df\u0005\u00cd\u0000\u0000\u01df\u01e0\u0005\u0012\u0000"+
		"\u0000\u01e0\u01e6\u0003\u0018\f\u0000\u01e1\u01e2\u0003\u0018\f\u0000"+
		"\u01e2\u01e3\u0005\u0012\u0000\u0000\u01e3\u01e4\u0003\u0018\f\u0000\u01e4"+
		"\u01e6\u0001\u0000\u0000\u0000\u01e5\u01dd\u0001\u0000\u0000\u0000\u01e5"+
		"\u01de\u0001\u0000\u0000\u0000\u01e5\u01e1\u0001\u0000\u0000\u0000\u01e6"+
		"5\u0001\u0000\u0000\u0000\u01e7\u01ef\u0003\u00a2Q\u0000\u01e8\u01ef\u0005"+
		"\u00cd\u0000\u0000\u01e9\u01ef\u0005\\\u0000\u0000\u01ea\u01ef\u0005\u01ee"+
		"\u0000\u0000\u01eb\u01ef\u0005t\u0000\u0000\u01ec\u01ef\u0005\u026b\u0000"+
		"\u0000\u01ed\u01ef\u0005\u02be\u0000\u0000\u01ee\u01e7\u0001\u0000\u0000"+
		"\u0000\u01ee\u01e8\u0001\u0000\u0000\u0000\u01ee\u01e9\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ea\u0001\u0000\u0000\u0000\u01ee\u01eb\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ec\u0001\u0000\u0000\u0000\u01ee\u01ed\u0001\u0000\u0000"+
		"\u0000\u01ef7\u0001\u0000\u0000\u0000\u01f0\u01f3\u0003>\u001f\u0000\u01f1"+
		"\u01f2\u0005#\u0000\u0000\u01f2\u01f4\u0003:\u001d\u0000\u01f3\u01f1\u0001"+
		"\u0000\u0000\u0000\u01f3\u01f4\u0001\u0000\u0000\u0000\u01f4\u01fb\u0001"+
		"\u0000\u0000\u0000\u01f5\u01f8\u0003:\u001d\u0000\u01f6\u01f7\u0005#\u0000"+
		"\u0000\u01f7\u01f9\u0003>\u001f\u0000\u01f8\u01f6\u0001\u0000\u0000\u0000"+
		"\u01f8\u01f9\u0001\u0000\u0000\u0000\u01f9\u01fb\u0001\u0000\u0000\u0000"+
		"\u01fa\u01f0\u0001\u0000\u0000\u0000\u01fa\u01f5\u0001\u0000\u0000\u0000"+
		"\u01fb9\u0001\u0000\u0000\u0000\u01fc\u01fd\u0005\u0164\u0000\u0000\u01fd"+
		"\u01fe\u0005\u017a\u0000\u0000\u01fe\u01ff\u0003<\u001e\u0000\u01ff;\u0001"+
		"\u0000\u0000\u0000\u0200\u0201\u0005\u0245\u0000\u0000\u0201\u0208\u0005"+
		"\u022c\u0000\u0000\u0202\u0203\u0005\u022c\u0000\u0000\u0203\u0208\u0005"+
		"\u00a0\u0000\u0000\u0204\u0205\u0005\u022c\u0000\u0000\u0205\u0208\u0005"+
		"\u02f9\u0000\u0000\u0206\u0208\u0005\u0282\u0000\u0000\u0207\u0200\u0001"+
		"\u0000\u0000\u0000\u0207\u0202\u0001\u0000\u0000\u0000\u0207\u0204\u0001"+
		"\u0000\u0000\u0000\u0207\u0206\u0001\u0000\u0000\u0000\u0208=\u0001\u0000"+
		"\u0000\u0000\u0209\u020a\u0005\u022c\u0000\u0000\u020a\u020b\u0007\f\u0000"+
		"\u0000\u020b?\u0001\u0000\u0000\u0000\u020c\u020d\u0003\u0018\f\u0000"+
		"\u020dA\u0001\u0000\u0000\u0000\u020e\u0213\u0003@ \u0000\u020f\u0210"+
		"\u0005#\u0000\u0000\u0210\u0212\u0003@ \u0000\u0211\u020f\u0001\u0000"+
		"\u0000\u0000\u0212\u0215\u0001\u0000\u0000\u0000\u0213\u0211\u0001\u0000"+
		"\u0000\u0000\u0213\u0214\u0001\u0000\u0000\u0000\u0214C\u0001\u0000\u0000"+
		"\u0000\u0215\u0213\u0001\u0000\u0000\u0000\u0216\u021a\u0003$\u0012\u0000"+
		"\u0217\u021a\u0005t\u0000\u0000\u0218\u021a\u0005\u00cd\u0000\u0000\u0219"+
		"\u0216\u0001\u0000\u0000\u0000\u0219\u0217\u0001\u0000\u0000\u0000\u0219"+
		"\u0218\u0001\u0000\u0000\u0000\u021aE\u0001\u0000\u0000\u0000\u021b\u0220"+
		"\u0003H$\u0000\u021c\u021d\u0005#\u0000\u0000\u021d\u021f\u0003H$\u0000"+
		"\u021e\u021c\u0001\u0000\u0000\u0000\u021f\u0222\u0001\u0000\u0000\u0000"+
		"\u0220\u021e\u0001\u0000\u0000\u0000\u0220\u0221\u0001\u0000\u0000\u0000"+
		"\u0221G\u0001\u0000\u0000\u0000\u0222\u0220\u0001\u0000\u0000\u0000\u0223"+
		"\u0224\u0005\u001d\u0000\u0000\u0224\u0225\u0003@ \u0000\u0225\u0226\u0005"+
		"#\u0000\u0000\u0226\u0227\u0003@ \u0000\u0227\u0228\u0005\u001e\u0000"+
		"\u0000\u0228I\u0001\u0000\u0000\u0000\u0229\u022a\u0003h4\u0000\u022a"+
		"\u022b\u0005\u0012\u0000\u0000\u022b\u022d\u0001\u0000\u0000\u0000\u022c"+
		"\u0229\u0001\u0000\u0000\u0000\u022c\u022d\u0001\u0000\u0000\u0000\u022d"+
		"\u022e\u0001\u0000\u0000\u0000\u022e\u022f\u0003l6\u0000\u022fK\u0001"+
		"\u0000\u0000\u0000\u0230\u0231\u0003\u0018\f\u0000\u0231M\u0001\u0000"+
		"\u0000\u0000\u0232\u0233\u0003\u0018\f\u0000\u0233O\u0001\u0000\u0000"+
		"\u0000\u0234\u0235\u0003\u0018\f\u0000\u0235Q\u0001\u0000\u0000\u0000"+
		"\u0236\u0237\u0003L&\u0000\u0237S\u0001\u0000\u0000\u0000\u0238\u0239"+
		"\u0003L&\u0000\u0239U\u0001\u0000\u0000\u0000\u023a\u0243\u0003$\u0012"+
		"\u0000\u023b\u023c\u0005\u0011\u0000\u0000\u023c\u023f\t\u0000\u0000\u0000"+
		"\u023d\u023f\b\r\u0000\u0000\u023e\u023b\u0001\u0000\u0000\u0000\u023e"+
		"\u023d\u0001\u0000\u0000\u0000\u023f\u0240\u0001\u0000\u0000\u0000\u0240"+
		"\u023e\u0001\u0000\u0000\u0000\u0240\u0241\u0001\u0000\u0000\u0000\u0241"+
		"\u0243\u0001\u0000\u0000\u0000\u0242\u023a\u0001\u0000\u0000\u0000\u0242"+
		"\u023e\u0001\u0000\u0000\u0000\u0243W\u0001\u0000\u0000\u0000\u0244\u0247"+
		"\u0003$\u0012\u0000\u0245\u0246\u0005(\u0000\u0000\u0246\u0248\u0003$"+
		"\u0012\u0000\u0247\u0245\u0001\u0000\u0000\u0000\u0247\u0248\u0001\u0000"+
		"\u0000\u0000\u0248Y\u0001\u0000\u0000\u0000\u0249\u0250\u0003X,\u0000"+
		"\u024a\u024d\u0005\u00bb\u0000\u0000\u024b\u024c\u0005\u001d\u0000\u0000"+
		"\u024c\u024e\u0005\u001e\u0000\u0000\u024d\u024b\u0001\u0000\u0000\u0000"+
		"\u024d\u024e\u0001\u0000\u0000\u0000\u024e\u0250\u0001\u0000\u0000\u0000"+
		"\u024f\u0249\u0001\u0000\u0000\u0000\u024f\u024a\u0001\u0000\u0000\u0000"+
		"\u0250[\u0001\u0000\u0000\u0000\u0251\u0252\u0003h4\u0000\u0252\u0253"+
		"\u0005\u0012\u0000\u0000\u0253\u0255\u0001\u0000\u0000\u0000\u0254\u0251"+
		"\u0001\u0000\u0000\u0000\u0254\u0255\u0001\u0000\u0000\u0000\u0255\u0256"+
		"\u0001\u0000\u0000\u0000\u0256\u0257\u0003\u0018\f\u0000\u0257]\u0001"+
		"\u0000\u0000\u0000\u0258\u0259\u0003$\u0012\u0000\u0259_\u0001\u0000\u0000"+
		"\u0000\u025a\u025b\u0003$\u0012\u0000\u025ba\u0001\u0000\u0000\u0000\u025c"+
		"\u025d\u0003h4\u0000\u025d\u025e\u0005\u0012\u0000\u0000\u025e\u0260\u0001"+
		"\u0000\u0000\u0000\u025f\u025c\u0001\u0000\u0000\u0000\u025f\u0260\u0001"+
		"\u0000\u0000\u0000\u0260\u0261\u0001\u0000\u0000\u0000\u0261\u0262\u0003"+
		"\u0018\f\u0000\u0262c\u0001\u0000\u0000\u0000\u0263\u0264\u0003h4\u0000"+
		"\u0264\u0265\u0005\u0012\u0000\u0000\u0265\u0267\u0001\u0000\u0000\u0000"+
		"\u0266\u0263\u0001\u0000\u0000\u0000\u0266\u0267\u0001\u0000\u0000\u0000"+
		"\u0267\u0268\u0001\u0000\u0000\u0000\u0268\u0269\u0003\u0018\f\u0000\u0269"+
		"e\u0001\u0000\u0000\u0000\u026a\u026b\u0003h4\u0000\u026b\u026c\u0005"+
		"\u0012\u0000\u0000\u026c\u026e\u0001\u0000\u0000\u0000\u026d\u026a\u0001"+
		"\u0000\u0000\u0000\u026d\u026e\u0001\u0000\u0000\u0000\u026e\u026f\u0001"+
		"\u0000\u0000\u0000\u026f\u0270\u0003\u0018\f\u0000\u0270g\u0001\u0000"+
		"\u0000\u0000\u0271\u0272\u0003\u0018\f\u0000\u0272i\u0001\u0000\u0000"+
		"\u0000\u0273\u0274\u0003$\u0012\u0000\u0274k\u0001\u0000\u0000\u0000\u0275"+
		"\u0276\u0003\u0018\f\u0000\u0276m\u0001\u0000\u0000\u0000\u0277\u027c"+
		"\u0003J%\u0000\u0278\u0279\u0005#\u0000\u0000\u0279\u027b\u0003J%\u0000"+
		"\u027a\u0278\u0001\u0000\u0000\u0000\u027b\u027e\u0001\u0000\u0000\u0000"+
		"\u027c\u027a\u0001\u0000\u0000\u0000\u027c\u027d\u0001\u0000\u0000\u0000"+
		"\u027do\u0001\u0000\u0000\u0000\u027e\u027c\u0001\u0000\u0000\u0000\u027f"+
		"\u0284\u0003f3\u0000\u0280\u0281\u0005#\u0000\u0000\u0281\u0283\u0003"+
		"f3\u0000\u0282\u0280\u0001\u0000\u0000\u0000\u0283\u0286\u0001\u0000\u0000"+
		"\u0000\u0284\u0282\u0001\u0000\u0000\u0000\u0284\u0285\u0001\u0000\u0000"+
		"\u0000\u0285q\u0001\u0000\u0000\u0000\u0286\u0284\u0001\u0000\u0000\u0000"+
		"\u0287\u028c\u0003L&\u0000\u0288\u0289\u0005#\u0000\u0000\u0289\u028b"+
		"\u0003L&\u0000\u028a\u0288\u0001\u0000\u0000\u0000\u028b\u028e\u0001\u0000"+
		"\u0000\u0000\u028c\u028a\u0001\u0000\u0000\u0000\u028c\u028d\u0001\u0000"+
		"\u0000\u0000\u028ds\u0001\u0000\u0000\u0000\u028e\u028c\u0001\u0000\u0000"+
		"\u0000\u028f\u0290\u0003\u0018\f\u0000\u0290u\u0001\u0000\u0000\u0000"+
		"\u0291\u0292\u0003\u0018\f\u0000\u0292w\u0001\u0000\u0000\u0000\u0293"+
		"\u0294\u0003\b\u0004\u0000\u0294y\u0001\u0000\u0000\u0000\u0295\u0296"+
		"\u0003\u0006\u0003\u0000\u0296{\u0001\u0000\u0000\u0000\u0297\u0298\u0003"+
		"$\u0012\u0000\u0298}\u0001\u0000\u0000\u0000\u0299\u029a\u0003\u0006\u0003"+
		"\u0000\u029a\u007f\u0001\u0000\u0000\u0000\u029b\u029c\u0005\u0357\u0000"+
		"\u0000\u029c\u0081\u0001\u0000\u0000\u0000\u029d\u029e\u0003Z-\u0000\u029e"+
		"\u029f\u0005(\u0000\u0000\u029f\u02a0\u0003~?\u0000\u02a0\u02a1\u0005"+
		"\f\u0000\u0000\u02a1\u02a2\u0003\u0080@\u0000\u02a2\u0083\u0001\u0000"+
		"\u0000\u0000\u02a3\u02a4\u0003\u0006\u0003\u0000\u02a4\u0085\u0001\u0000"+
		"\u0000\u0000\u02a5\u02a8\u0003\u0018\f\u0000\u02a6\u02a7\u0005\u0012\u0000"+
		"\u0000\u02a7\u02a9\u0003\u0018\f\u0000\u02a8\u02a6\u0001\u0000\u0000\u0000"+
		"\u02a8\u02a9\u0001\u0000\u0000\u0000\u02a9\u0087\u0001\u0000\u0000\u0000"+
		"\u02aa\u02ab\u0003\b\u0004\u0000\u02ab\u0089\u0001\u0000\u0000\u0000\u02ac"+
		"\u02af\u0003\u008cF\u0000\u02ad\u02ae\u0005(\u0000\u0000\u02ae\u02b0\u0003"+
		"$\u0012\u0000\u02af\u02ad\u0001\u0000\u0000\u0000\u02af\u02b0\u0001\u0000"+
		"\u0000\u0000\u02b0\u008b\u0001\u0000\u0000\u0000\u02b1\u02b4\u0003\u0018"+
		"\f\u0000\u02b2\u02b4\u0003\u0006\u0003\u0000\u02b3\u02b1\u0001\u0000\u0000"+
		"\u0000\u02b3\u02b2\u0001\u0000\u0000\u0000\u02b4\u008d\u0001\u0000\u0000"+
		"\u0000\u02b5\u02b6\u0003$\u0012\u0000\u02b6\u008f\u0001\u0000\u0000\u0000"+
		"\u02b7\u02ba\u0003\u0018\f\u0000\u02b8\u02b9\u0005\u0012\u0000\u0000\u02b9"+
		"\u02bb\u0003\u0018\f\u0000\u02ba\u02b8\u0001\u0000\u0000\u0000\u02ba\u02bb"+
		"\u0001\u0000\u0000\u0000\u02bb\u0091\u0001\u0000\u0000\u0000\u02bc\u02bd"+
		"\u0007\u000e\u0000\u0000\u02bd\u0093\u0001\u0000\u0000\u0000\u02be\u02bf"+
		"\u0007\u000f\u0000\u0000\u02bf\u0095\u0001\u0000\u0000\u0000\u02c0\u02c3"+
		"\u0003Z-\u0000\u02c1\u02c3\u0003\u008aE\u0000\u02c2\u02c0\u0001\u0000"+
		"\u0000\u0000\u02c2\u02c1\u0001\u0000\u0000\u0000\u02c3\u0097\u0001\u0000"+
		"\u0000\u0000\u02c4\u02c5\u0003\u0018\f\u0000\u02c5\u0099\u0001\u0000\u0000"+
		"\u0000\u02c6\u02cb\u0003\u0018\f\u0000\u02c7\u02c8\u0005#\u0000\u0000"+
		"\u02c8\u02ca\u0003\u0018\f\u0000\u02c9\u02c7\u0001\u0000\u0000\u0000\u02ca"+
		"\u02cd\u0001\u0000\u0000\u0000\u02cb\u02c9\u0001\u0000\u0000\u0000\u02cb"+
		"\u02cc\u0001\u0000\u0000\u0000\u02cc\u009b\u0001\u0000\u0000\u0000\u02cd"+
		"\u02cb\u0001\u0000\u0000\u0000\u02ce\u02d1\u0005\\\u0000\u0000\u02cf\u02d1"+
		"\u0003\u009aM\u0000\u02d0\u02ce\u0001\u0000\u0000\u0000\u02d0\u02cf\u0001"+
		"\u0000\u0000\u0000\u02d1\u009d\u0001\u0000\u0000\u0000\u02d2\u02d3\u0007"+
		"\u0010\u0000\u0000\u02d3\u009f\u0001\u0000\u0000\u0000\u02d4\u02d5\u0007"+
		"\u0011\u0000\u0000\u02d5\u02d6\u0003\u0090H\u0000\u02d6\u00a1\u0001\u0000"+
		"\u0000\u0000\u02d7\u02d8\u0006Q\uffff\uffff\u0000\u02d8\u02dd\u0003\u00aa"+
		"U\u0000\u02d9\u02da\u0003\u00a8T\u0000\u02da\u02db\u0003\u00a2Q\u0001"+
		"\u02db\u02dd\u0001\u0000\u0000\u0000\u02dc\u02d7\u0001\u0000\u0000\u0000"+
		"\u02dc\u02d9\u0001\u0000\u0000\u0000\u02dd\u02eb\u0001\u0000\u0000\u0000"+
		"\u02de\u02df\n\u0004\u0000\u0000\u02df\u02e0\u0003\u00a4R\u0000\u02e0"+
		"\u02e1\u0003\u00a2Q\u0005\u02e1\u02ea\u0001\u0000\u0000\u0000\u02e2\u02e3"+
		"\n\u0003\u0000\u0000\u02e3\u02e4\u0003\u00a6S\u0000\u02e4\u02e5\u0003"+
		"\u00a2Q\u0004\u02e5\u02ea\u0001\u0000\u0000\u0000\u02e6\u02e7\n\u0002"+
		"\u0000\u0000\u02e7\u02e8\u0005\u0330\u0000\u0000\u02e8\u02ea\u0003\u00a2"+
		"Q\u0003\u02e9\u02de\u0001\u0000\u0000\u0000\u02e9\u02e2\u0001\u0000\u0000"+
		"\u0000\u02e9\u02e6\u0001\u0000\u0000\u0000\u02ea\u02ed\u0001\u0000\u0000"+
		"\u0000\u02eb\u02e9\u0001\u0000\u0000\u0000\u02eb\u02ec\u0001\u0000\u0000"+
		"\u0000\u02ec\u00a3\u0001\u0000\u0000\u0000\u02ed\u02eb\u0001\u0000\u0000"+
		"\u0000\u02ee\u02ef\u0007\u0012\u0000\u0000\u02ef\u00a5\u0001\u0000\u0000"+
		"\u0000\u02f0\u02f1\u0007\u0013\u0000\u0000\u02f1\u00a7\u0001\u0000\u0000"+
		"\u0000\u02f2\u02f3\u0007\u0014\u0000\u0000\u02f3\u00a9\u0001\u0000\u0000"+
		"\u0000\u02f4\u02f5\u0006U\uffff\uffff\u0000\u02f5\u02f6\u0003\u00b0X\u0000"+
		"\u02f6\u0316\u0001\u0000\u0000\u0000\u02f7\u02f8\n\u0007\u0000\u0000\u02f8"+
		"\u02fa\u0005\u0163\u0000\u0000\u02f9\u02fb\u0005\u01de\u0000\u0000\u02fa"+
		"\u02f9\u0001\u0000\u0000\u0000\u02fa\u02fb\u0001\u0000\u0000\u0000\u02fb"+
		"\u02fc\u0001\u0000\u0000\u0000\u02fc\u0315\u0007\u0015\u0000\u0000\u02fd"+
		"\u02fe\n\u0006\u0000\u0000\u02fe\u02ff\u0005\u0014\u0000\u0000\u02ff\u0315"+
		"\u0003\u00b0X\u0000\u0300\u0301\n\u0005\u0000\u0000\u0301\u0302\u0005"+
		"\u01b9\u0000\u0000\u0302\u0303\u0005\u01e9\u0000\u0000\u0303\u0304\u0005"+
		"\u001d\u0000\u0000\u0304\u0305\u0003\u00a2Q\u0000\u0305\u0306\u0005\u001e"+
		"\u0000\u0000\u0306\u0315\u0001\u0000\u0000\u0000\u0307\u0308\n\u0004\u0000"+
		"\u0000\u0308\u0309\u0003\u00aeW\u0000\u0309\u030a\u0003\u00b0X\u0000\u030a"+
		"\u0315\u0001\u0000\u0000\u0000\u030b\u030c\n\u0003\u0000\u0000\u030c\u030d"+
		"\u0003\u00aeW\u0000\u030d\u030e\u0007\u0016\u0000\u0000\u030e\u030f\u0003"+
		"\u0120\u0090\u0000\u030f\u0315\u0001\u0000\u0000\u0000\u0310\u0311\n\u0002"+
		"\u0000\u0000\u0311\u0312\u0003\u00acV\u0000\u0312\u0313\u0003\u00b0X\u0000"+
		"\u0313\u0315\u0001\u0000\u0000\u0000\u0314\u02f7\u0001\u0000\u0000\u0000"+
		"\u0314\u02fd\u0001\u0000\u0000\u0000\u0314\u0300\u0001\u0000\u0000\u0000"+
		"\u0314\u0307\u0001\u0000\u0000\u0000\u0314\u030b\u0001\u0000\u0000\u0000"+
		"\u0314\u0310\u0001\u0000\u0000\u0000\u0315\u0318\u0001\u0000\u0000\u0000"+
		"\u0316\u0314\u0001\u0000\u0000\u0000\u0316\u0317\u0001\u0000\u0000\u0000"+
		"\u0317\u00ab\u0001\u0000\u0000\u0000\u0318\u0316\u0001\u0000\u0000\u0000"+
		"\u0319\u031a\u0007\u0017\u0000\u0000\u031a\u00ad\u0001\u0000\u0000\u0000"+
		"\u031b\u031c\u0007\u0018\u0000\u0000\u031c\u00af\u0001\u0000\u0000\u0000"+
		"\u031d\u031f\u0003\u00b2Y\u0000\u031e\u0320\u0005\u01de\u0000\u0000\u031f"+
		"\u031e\u0001\u0000\u0000\u0000\u031f\u0320\u0001\u0000\u0000\u0000\u0320"+
		"\u0321\u0001\u0000\u0000\u0000\u0321\u0322\u0005\u0147\u0000\u0000\u0322"+
		"\u0323\u0003\u0120\u0090\u0000\u0323\u0355\u0001\u0000\u0000\u0000\u0324"+
		"\u0326\u0003\u00b2Y\u0000\u0325\u0327\u0005\u01de\u0000\u0000\u0326\u0325"+
		"\u0001\u0000\u0000\u0000\u0326\u0327\u0001\u0000\u0000\u0000\u0327\u0328"+
		"\u0001\u0000\u0000\u0000\u0328\u0329\u0005\u0147\u0000\u0000\u0329\u032a"+
		"\u0005\u001d\u0000\u0000\u032a\u032f\u0003\u00a2Q\u0000\u032b\u032c\u0005"+
		"#\u0000\u0000\u032c\u032e\u0003\u00a2Q\u0000\u032d\u032b\u0001\u0000\u0000"+
		"\u0000\u032e\u0331\u0001\u0000\u0000\u0000\u032f\u032d\u0001\u0000\u0000"+
		"\u0000\u032f\u0330\u0001\u0000\u0000\u0000\u0330\u0332\u0001\u0000\u0000"+
		"\u0000\u0331\u032f\u0001\u0000\u0000\u0000\u0332\u0333\u0005\u001e\u0000"+
		"\u0000\u0333\u0355\u0001\u0000\u0000\u0000\u0334\u0336\u0003\u00b2Y\u0000"+
		"\u0335\u0337\u0005\u01de\u0000\u0000\u0336\u0335\u0001\u0000\u0000\u0000"+
		"\u0336\u0337\u0001\u0000\u0000\u0000\u0337\u0338\u0001\u0000\u0000\u0000"+
		"\u0338\u0339\u0005r\u0000\u0000\u0339\u033a\u0003\u00b2Y\u0000\u033a\u033b"+
		"\u0005`\u0000\u0000\u033b\u033c\u0003\u00b0X\u0000\u033c\u0355\u0001\u0000"+
		"\u0000\u0000\u033d\u033e\u0003\u00b2Y\u0000\u033e\u033f\u0005\u0295\u0000"+
		"\u0000\u033f\u0340\u0005\u017b\u0000\u0000\u0340\u0341\u0003\u00b2Y\u0000"+
		"\u0341\u0355\u0001\u0000\u0000\u0000\u0342\u0344\u0003\u00b2Y\u0000\u0343"+
		"\u0345\u0005\u01de\u0000\u0000\u0344\u0343\u0001\u0000\u0000\u0000\u0344"+
		"\u0345\u0001\u0000\u0000\u0000\u0345\u0346\u0001\u0000\u0000\u0000\u0346"+
		"\u0347\u0005\u017b\u0000\u0000\u0347\u034a\u0003\u00b4Z\u0000\u0348\u0349"+
		"\u0005\u00f8\u0000\u0000\u0349\u034b\u0003\u00b4Z\u0000\u034a\u0348\u0001"+
		"\u0000\u0000\u0000\u034a\u034b\u0001\u0000\u0000\u0000\u034b\u0355\u0001"+
		"\u0000\u0000\u0000\u034c\u034e\u0003\u00b2Y\u0000\u034d\u034f\u0005\u01de"+
		"\u0000\u0000\u034e\u034d\u0001\u0000\u0000\u0000\u034e\u034f\u0001\u0000"+
		"\u0000\u0000\u034f\u0350\u0001\u0000\u0000\u0000\u0350\u0351\u0007\u0019"+
		"\u0000\u0000\u0351\u0352\u0003\u00b2Y\u0000\u0352\u0355\u0001\u0000\u0000"+
		"\u0000\u0353\u0355\u0003\u00b2Y\u0000\u0354\u031d\u0001\u0000\u0000\u0000"+
		"\u0354\u0324\u0001\u0000\u0000\u0000\u0354\u0334\u0001\u0000\u0000\u0000"+
		"\u0354\u033d\u0001\u0000\u0000\u0000\u0354\u0342\u0001\u0000\u0000\u0000"+
		"\u0354\u034c\u0001\u0000\u0000\u0000\u0354\u0353\u0001\u0000\u0000\u0000"+
		"\u0355\u00b1\u0001\u0000\u0000\u0000\u0356\u0357\u0006Y\uffff\uffff\u0000"+
		"\u0357\u0358\u0003\u00b4Z\u0000\u0358\u0385\u0001\u0000\u0000\u0000\u0359"+
		"\u035a\n\u000f\u0000\u0000\u035a\u035b\u0005\u0006\u0000\u0000\u035b\u0384"+
		"\u0003\u00b2Y\u0010\u035c\u035d\n\u000e\u0000\u0000\u035d\u035e\u0005"+
		"\u0007\u0000\u0000\u035e\u0384\u0003\u00b2Y\u000f\u035f\u0360\n\r\u0000"+
		"\u0000\u0360\u0361\u0005\b\u0000\u0000\u0361\u0384\u0003\u00b2Y\u000e"+
		"\u0362\u0363\n\f\u0000\u0000\u0363\u0364\u0005\t\u0000\u0000\u0364\u0384"+
		"\u0003\u00b2Y\r\u0365\u0366\n\u000b\u0000\u0000\u0366\u0367\u0005\r\u0000"+
		"\u0000\u0367\u0384\u0003\u00b2Y\f\u0368\u0369\n\n\u0000\u0000\u0369\u036a"+
		"\u0005\u000e\u0000\u0000\u036a\u0384\u0003\u00b2Y\u000b\u036b\u036c\n"+
		"\t\u0000\u0000\u036c\u036d\u0005\u000f\u0000\u0000\u036d\u0384\u0003\u00b2"+
		"Y\n\u036e\u036f\n\b\u0000\u0000\u036f\u0370\u0005\u0010\u0000\u0000\u0370"+
		"\u0384\u0003\u00b2Y\t\u0371\u0372\n\u0007\u0000\u0000\u0372\u0373\u0005"+
		"\u00e0\u0000\u0000\u0373\u0384\u0003\u00b2Y\b\u0374\u0375\n\u0006\u0000"+
		"\u0000\u0375\u0376\u0005\u01c3\u0000\u0000\u0376\u0384\u0003\u00b2Y\u0007"+
		"\u0377\u0378\n\u0005\u0000\u0000\u0378\u0379\u0005\u000b\u0000\u0000\u0379"+
		"\u0384\u0003\u00b2Y\u0006\u037a\u037b\n\u0004\u0000\u0000\u037b\u037c"+
		"\u0005\n\u0000\u0000\u037c\u0384\u0003\u00b2Y\u0005\u037d\u037e\n\u0003"+
		"\u0000\u0000\u037e\u037f\u0005\r\u0000\u0000\u037f\u0384\u0003\u011a\u008d"+
		"\u0000\u0380\u0381\n\u0002\u0000\u0000\u0381\u0382\u0005\u000e\u0000\u0000"+
		"\u0382\u0384\u0003\u011a\u008d\u0000\u0383\u0359\u0001\u0000\u0000\u0000"+
		"\u0383\u035c\u0001\u0000\u0000\u0000\u0383\u035f\u0001\u0000\u0000\u0000"+
		"\u0383\u0362\u0001\u0000\u0000\u0000\u0383\u0365\u0001\u0000\u0000\u0000"+
		"\u0383\u0368\u0001\u0000\u0000\u0000\u0383\u036b\u0001\u0000\u0000\u0000"+
		"\u0383\u036e\u0001\u0000\u0000\u0000\u0383\u0371\u0001\u0000\u0000\u0000"+
		"\u0383\u0374\u0001\u0000\u0000\u0000\u0383\u0377\u0001\u0000\u0000\u0000"+
		"\u0383\u037a\u0001\u0000\u0000\u0000\u0383\u037d\u0001\u0000\u0000\u0000"+
		"\u0383\u0380\u0001\u0000\u0000\u0000\u0384\u0387\u0001\u0000\u0000\u0000"+
		"\u0385\u0383\u0001\u0000\u0000\u0000\u0385\u0386\u0001\u0000\u0000\u0000"+
		"\u0386\u00b3\u0001\u0000\u0000\u0000\u0387\u0385\u0001\u0000\u0000\u0000"+
		"\u0388\u0389\u0006Z\uffff\uffff\u0000\u0389\u03bd\u0003\u00be_\u0000\u038a"+
		"\u03bd\u0003\u0000\u0000\u0000\u038b\u03bd\u0003\u0004\u0002\u0000\u038c"+
		"\u03bd\u0003\u00ba]\u0000\u038d\u03bd\u0003(\u0014\u0000\u038e\u0394\u0005"+
		"\r\u0000\u0000\u038f\u0394\u0005\u000e\u0000\u0000\u0390\u0394\u0005\u0005"+
		"\u0000\u0000\u0391\u0394\u0003\u00a8T\u0000\u0392\u0394\u0005t\u0000\u0000"+
		"\u0393\u038e\u0001\u0000\u0000\u0000\u0393\u038f\u0001\u0000\u0000\u0000"+
		"\u0393\u0390\u0001\u0000\u0000\u0000\u0393\u0391\u0001\u0000\u0000\u0000"+
		"\u0393\u0392\u0001\u0000\u0000\u0000\u0394\u0395\u0001\u0000\u0000\u0000"+
		"\u0395\u03bd\u0003\u00b4Z\t\u0396\u0398\u0005\u026b\u0000\u0000\u0397"+
		"\u0396\u0001\u0000\u0000\u0000\u0397\u0398\u0001\u0000\u0000\u0000\u0398"+
		"\u0399\u0001\u0000\u0000\u0000\u0399\u039a\u0005\u001d\u0000\u0000\u039a"+
		"\u039f\u0003\u00a2Q\u0000\u039b\u039c\u0005#\u0000\u0000\u039c\u039e\u0003"+
		"\u00a2Q\u0000\u039d\u039b\u0001\u0000\u0000\u0000\u039e\u03a1\u0001\u0000"+
		"\u0000\u0000\u039f\u039d\u0001\u0000\u0000\u0000\u039f\u03a0\u0001\u0000"+
		"\u0000\u0000\u03a0\u03a2\u0001\u0000\u0000\u0000\u03a1\u039f\u0001\u0000"+
		"\u0000\u0000\u03a2\u03a3\u0005\u001e\u0000\u0000\u03a3\u03bd\u0001\u0000"+
		"\u0000\u0000\u03a4\u03a6\u0005\u0101\u0000\u0000\u03a5\u03a4\u0001\u0000"+
		"\u0000\u0000\u03a5\u03a6\u0001\u0000\u0000\u0000\u03a6\u03a7\u0001\u0000"+
		"\u0000\u0000\u03a7\u03bd\u0003\u0120\u0090\u0000\u03a8\u03a9\u0005\u001f"+
		"\u0000\u0000\u03a9\u03aa\u0003\u0018\f\u0000\u03aa\u03ab\u0003\u00a2Q"+
		"\u0000\u03ab\u03ac\u0005 \u0000\u0000\u03ac\u03bd\u0001\u0000\u0000\u0000"+
		"\u03ad\u03ae\u0003\u0018\f\u0000\u03ae\u03af\u0007\u001a\u0000\u0000\u03af"+
		"\u03b0\u0003\u0006\u0003\u0000\u03b0\u03bd\u0001\u0000\u0000\u0000\u03b1"+
		"\u03b4\u0003\u00b6[\u0000\u03b2\u03b3\u0005\u025f\u0000\u0000\u03b3\u03b5"+
		"\u0003\u0126\u0093\u0000\u03b4\u03b2\u0001\u0000\u0000\u0000\u03b4\u03b5"+
		"\u0001\u0000\u0000\u0000\u03b5\u03b7\u0001\u0000\u0000\u0000\u03b6\u03b8"+
		"\u0003\u00b8\\\u0000\u03b7\u03b6\u0001\u0000\u0000\u0000\u03b7\u03b8\u0001"+
		"\u0000\u0000\u0000\u03b8\u03bd\u0001\u0000\u0000\u0000\u03b9\u03bd\u0003"+
		"\u010c\u0086\u0000\u03ba\u03bd\u0003\u0110\u0088\u0000\u03bb\u03bd\u0003"+
		"\u011a\u008d\u0000\u03bc\u0388\u0001\u0000\u0000\u0000\u03bc\u038a\u0001"+
		"\u0000\u0000\u0000\u03bc\u038b\u0001\u0000\u0000\u0000\u03bc\u038c\u0001"+
		"\u0000\u0000\u0000\u03bc\u038d\u0001\u0000\u0000\u0000\u03bc\u0393\u0001"+
		"\u0000\u0000\u0000\u03bc\u0397\u0001\u0000\u0000\u0000\u03bc\u03a5\u0001"+
		"\u0000\u0000\u0000\u03bc\u03a8\u0001\u0000\u0000\u0000\u03bc\u03ad\u0001"+
		"\u0000\u0000\u0000\u03bc\u03b1\u0001\u0000\u0000\u0000\u03bc\u03b9\u0001"+
		"\u0000\u0000\u0000\u03bc\u03ba\u0001\u0000\u0000\u0000\u03bc\u03bb\u0001"+
		"\u0000\u0000\u0000\u03bd\u03c6\u0001\u0000\u0000\u0000\u03be\u03bf\n\n"+
		"\u0000\u0000\u03bf\u03c0\u0005\u0006\u0000\u0000\u03c0\u03c1\u0005\u0006"+
		"\u0000\u0000\u03c1\u03c5\u0003\u00b4Z\u000b\u03c2\u03c3\n\f\u0000\u0000"+
		"\u03c3\u03c5\u0003\u0150\u00a8\u0000\u03c4\u03be\u0001\u0000\u0000\u0000"+
		"\u03c4\u03c2\u0001\u0000\u0000\u0000\u03c5\u03c8\u0001\u0000\u0000\u0000"+
		"\u03c6\u03c4\u0001\u0000\u0000\u0000\u03c6\u03c7\u0001\u0000\u0000\u0000"+
		"\u03c7\u00b5\u0001\u0000\u0000\u0000\u03c8\u03c6\u0001\u0000\u0000\u0000"+
		"\u03c9\u03ca\u0003\u0006\u0003\u0000\u03ca\u00b7\u0001\u0000\u0000\u0000"+
		"\u03cb\u03d0\u0005\u01e4\u0000\u0000\u03cc\u03d0\u0005\u00f6\u0000\u0000"+
		"\u03cd\u03ce\u0005\u00cd\u0000\u0000\u03ce\u03d0\u0003\u0004\u0002\u0000"+
		"\u03cf\u03cb\u0001\u0000\u0000\u0000\u03cf\u03cc\u0001\u0000\u0000\u0000"+
		"\u03cf\u03cd\u0001\u0000\u0000\u0000\u03d0\u03d1\u0001\u0000\u0000\u0000"+
		"\u03d1\u03d2\u0005\u01ee\u0000\u0000\u03d2\u03d3\u0007\u001b\u0000\u0000"+
		"\u03d3\u00b9\u0001\u0000\u0000\u0000\u03d4\u03d7\u0003\u0018\f\u0000\u03d5"+
		"\u03d6\u0005\u0012\u0000\u0000\u03d6\u03d8\u0003\u0018\f\u0000\u03d7\u03d5"+
		"\u0001\u0000\u0000\u0000\u03d7\u03d8\u0001\u0000\u0000\u0000\u03d8\u03db"+
		"\u0001\u0000\u0000\u0000\u03d9\u03da\u0005\u0012\u0000\u0000\u03da\u03dc"+
		"\u0003\u0018\f\u0000\u03db\u03d9\u0001\u0000\u0000\u0000\u03db\u03dc\u0001"+
		"\u0000\u0000\u0000\u03dc\u00bb\u0001\u0000\u0000\u0000\u03dd\u03e2\u0003"+
		"\u00ba]\u0000\u03de\u03df\u0005#\u0000\u0000\u03df\u03e1\u0003\u00ba]"+
		"\u0000\u03e0\u03de\u0001\u0000\u0000\u0000\u03e1\u03e4\u0001\u0000\u0000"+
		"\u0000\u03e2\u03e0\u0001\u0000\u0000\u0000\u03e2\u03e3\u0001\u0000\u0000"+
		"\u0000\u03e3\u00bd\u0001\u0000\u0000\u0000\u03e4\u03e2\u0001\u0000\u0000"+
		"\u0000\u03e5\u03eb\u0003\u00c2a\u0000\u03e6\u03eb\u0003\u00d8l\u0000\u03e7"+
		"\u03eb\u0003\u00c4b\u0000\u03e8\u03eb\u0003\u0104\u0082\u0000\u03e9\u03eb"+
		"\u0003\u00c0`\u0000\u03ea\u03e5\u0001\u0000\u0000\u0000\u03ea\u03e6\u0001"+
		"\u0000\u0000\u0000\u03ea\u03e7\u0001\u0000\u0000\u0000\u03ea\u03e8\u0001"+
		"\u0000\u0000\u0000\u03ea\u03e9\u0001\u0000\u0000\u0000\u03eb\u00bf\u0001"+
		"\u0000\u0000\u0000\u03ec\u03ed\u0003b1\u0000\u03ed\u03f9\u0005\u001d\u0000"+
		"\u0000\u03ee\u03f0\u0003\u00a2Q\u0000\u03ef\u03ee\u0001\u0000\u0000\u0000"+
		"\u03ef\u03f0\u0001\u0000\u0000\u0000\u03f0\u03fa\u0001\u0000\u0000\u0000"+
		"\u03f1\u03f6\u0003\u00a2Q\u0000\u03f2\u03f3\u0005#\u0000\u0000\u03f3\u03f5"+
		"\u0003\u00a2Q\u0000\u03f4\u03f2\u0001\u0000\u0000\u0000\u03f5\u03f8\u0001"+
		"\u0000\u0000\u0000\u03f6\u03f4\u0001\u0000\u0000\u0000\u03f6\u03f7\u0001"+
		"\u0000\u0000\u0000\u03f7\u03fa\u0001\u0000\u0000\u0000\u03f8\u03f6\u0001"+
		"\u0000\u0000\u0000\u03f9\u03ef\u0001\u0000\u0000\u0000\u03f9\u03f1\u0001"+
		"\u0000\u0000\u0000\u03fa\u03fb\u0001\u0000\u0000\u0000\u03fb\u03fc\u0005"+
		"\u001e\u0000\u0000\u03fc\u00c1\u0001\u0000\u0000\u0000\u03fd\u03fe\u0003"+
		"\u00c8d\u0000\u03fe\u0400\u0005\u001d\u0000\u0000\u03ff\u0401\u0003\u00ca"+
		"e\u0000\u0400\u03ff\u0001\u0000\u0000\u0000\u0400\u0401\u0001\u0000\u0000"+
		"\u0000\u0401\u040b\u0001\u0000\u0000\u0000\u0402\u0407\u0003\u00a2Q\u0000"+
		"\u0403\u0404\u0005#\u0000\u0000\u0404\u0406\u0003\u00a2Q\u0000\u0405\u0403"+
		"\u0001\u0000\u0000\u0000\u0406\u0409\u0001\u0000\u0000\u0000\u0407\u0405"+
		"\u0001\u0000\u0000\u0000\u0407\u0408\u0001\u0000\u0000\u0000\u0408\u040c"+
		"\u0001\u0000\u0000\u0000\u0409\u0407\u0001\u0000\u0000\u0000\u040a\u040c"+
		"\u0005\u000f\u0000\u0000\u040b\u0402\u0001\u0000\u0000\u0000\u040b\u040a"+
		"\u0001\u0000\u0000\u0000\u040b\u040c\u0001\u0000\u0000\u0000\u040c\u040e"+
		"\u0001\u0000\u0000\u0000\u040d\u040f\u0003\u0150\u00a8\u0000\u040e\u040d"+
		"\u0001\u0000\u0000\u0000\u040e\u040f\u0001\u0000\u0000\u0000\u040f\u0410"+
		"\u0001\u0000\u0000\u0000\u0410\u0412\u0005\u001e\u0000\u0000\u0411\u0413"+
		"\u0003\u00ccf\u0000\u0412\u0411\u0001\u0000\u0000\u0000\u0412\u0413\u0001"+
		"\u0000\u0000\u0000\u0413\u00c3\u0001\u0000\u0000\u0000\u0414\u0415\u0003"+
		"\u00ba]\u0000\u0415\u0416\u0007\u001a\u0000\u0000\u0416\u0417\u0003\u00b6"+
		"[\u0000\u0417\u042a\u0001\u0000\u0000\u0000\u0418\u0419\u0003\u00c6c\u0000"+
		"\u0419\u0425\u0005\u001d\u0000\u0000\u041a\u041c\u0003\u00a2Q\u0000\u041b"+
		"\u041a\u0001\u0000\u0000\u0000\u041b\u041c\u0001\u0000\u0000\u0000\u041c"+
		"\u0426\u0001\u0000\u0000\u0000\u041d\u0422\u0003\u00a2Q\u0000\u041e\u041f"+
		"\u0005#\u0000\u0000\u041f\u0421\u0003\u00a2Q\u0000\u0420\u041e\u0001\u0000"+
		"\u0000\u0000\u0421\u0424\u0001\u0000\u0000\u0000\u0422\u0420\u0001\u0000"+
		"\u0000\u0000\u0422\u0423\u0001\u0000\u0000\u0000\u0423\u0426\u0001\u0000"+
		"\u0000\u0000\u0424\u0422\u0001\u0000\u0000\u0000\u0425\u041b\u0001\u0000"+
		"\u0000\u0000\u0425\u041d\u0001\u0000\u0000\u0000\u0426\u0427\u0001\u0000"+
		"\u0000\u0000\u0427\u0428\u0005\u001e\u0000\u0000\u0428\u042a\u0001\u0000"+
		"\u0000\u0000\u0429\u0414\u0001\u0000\u0000\u0000\u0429\u0418\u0001\u0000"+
		"\u0000\u0000\u042a\u00c5\u0001\u0000\u0000\u0000\u042b\u044c\u0005\u0334"+
		"\u0000\u0000\u042c\u044c\u0005\u0335\u0000\u0000\u042d\u044c\u0005\u0336"+
		"\u0000\u0000\u042e\u044c\u0005\u0337\u0000\u0000\u042f\u044c\u0005\u0338"+
		"\u0000\u0000\u0430\u044c\u0005\u0339\u0000\u0000\u0431\u044c\u0005\u033a"+
		"\u0000\u0000\u0432\u044c\u0005\u033b\u0000\u0000\u0433\u044c\u0005\u033c"+
		"\u0000\u0000\u0434\u044c\u0005\u033d\u0000\u0000\u0435\u044c\u0005\u033e"+
		"\u0000\u0000\u0436\u044c\u0005\u033f\u0000\u0000\u0437\u044c\u0005\u0340"+
		"\u0000\u0000\u0438\u044c\u0005\u0341\u0000\u0000\u0439\u044c\u0005\u0342"+
		"\u0000\u0000\u043a\u044c\u0005\u0343\u0000\u0000\u043b\u044c\u0005\u0344"+
		"\u0000\u0000\u043c\u044c\u0005\u0345\u0000\u0000\u043d\u044c\u0005\u0346"+
		"\u0000\u0000\u043e\u044c\u0005\u0347\u0000\u0000\u043f\u044c\u0005\u0348"+
		"\u0000\u0000\u0440\u044c\u0005\u0349\u0000\u0000\u0441\u044c\u0005\u034a"+
		"\u0000\u0000\u0442\u044c\u0005\u034b\u0000\u0000\u0443\u044c\u0005\u034c"+
		"\u0000\u0000\u0444\u044c\u0005\u0169\u0000\u0000\u0445\u044c\u0005\u034d"+
		"\u0000\u0000\u0446\u044c\u0005\u034e\u0000\u0000\u0447\u044c\u0005\u034f"+
		"\u0000\u0000\u0448\u044c\u0005\u016a\u0000\u0000\u0449\u044a\u0005\u01b9"+
		"\u0000\u0000\u044a\u044c\u0005\u01e9\u0000\u0000\u044b\u042b\u0001\u0000"+
		"\u0000\u0000\u044b\u042c\u0001\u0000\u0000\u0000\u044b\u042d\u0001\u0000"+
		"\u0000\u0000\u044b\u042e\u0001\u0000\u0000\u0000\u044b\u042f\u0001\u0000"+
		"\u0000\u0000\u044b\u0430\u0001\u0000\u0000\u0000\u044b\u0431\u0001\u0000"+
		"\u0000\u0000\u044b\u0432\u0001\u0000\u0000\u0000\u044b\u0433\u0001\u0000"+
		"\u0000\u0000\u044b\u0434\u0001\u0000\u0000\u0000\u044b\u0435\u0001\u0000"+
		"\u0000\u0000\u044b\u0436\u0001\u0000\u0000\u0000\u044b\u0437\u0001\u0000"+
		"\u0000\u0000\u044b\u0438\u0001\u0000\u0000\u0000\u044b\u0439\u0001\u0000"+
		"\u0000\u0000\u044b\u043a\u0001\u0000\u0000\u0000\u044b\u043b\u0001\u0000"+
		"\u0000\u0000\u044b\u043c\u0001\u0000\u0000\u0000\u044b\u043d\u0001\u0000"+
		"\u0000\u0000\u044b\u043e\u0001\u0000\u0000\u0000\u044b\u043f\u0001\u0000"+
		"\u0000\u0000\u044b\u0440\u0001\u0000\u0000\u0000\u044b\u0441\u0001\u0000"+
		"\u0000\u0000\u044b\u0442\u0001\u0000\u0000\u0000\u044b\u0443\u0001\u0000"+
		"\u0000\u0000\u044b\u0444\u0001\u0000\u0000\u0000\u044b\u0445\u0001\u0000"+
		"\u0000\u0000\u044b\u0446\u0001\u0000\u0000\u0000\u044b\u0447\u0001\u0000"+
		"\u0000\u0000\u044b\u0448\u0001\u0000\u0000\u0000\u044b\u0449\u0001\u0000"+
		"\u0000\u0000\u044c\u00c7\u0001\u0000\u0000\u0000\u044d\u044e\u0007\u001c"+
		"\u0000\u0000\u044e\u00c9\u0001\u0000\u0000\u0000\u044f\u0450\u0005\u00de"+
		"\u0000\u0000\u0450\u00cb\u0001\u0000\u0000\u0000\u0451\u0454\u0005\u0200"+
		"\u0000\u0000\u0452\u0455\u0003\u00ceg\u0000\u0453\u0455\u0003\u0018\f"+
		"\u0000\u0454\u0452\u0001\u0000\u0000\u0000\u0454\u0453\u0001\u0000\u0000"+
		"\u0000\u0455\u00cd\u0001\u0000\u0000\u0000\u0456\u0458\u0005\u001d\u0000"+
		"\u0000\u0457\u0459\u0003\u0018\f\u0000\u0458\u0457\u0001\u0000\u0000\u0000"+
		"\u0458\u0459\u0001\u0000\u0000\u0000\u0459\u0464\u0001\u0000\u0000\u0000"+
		"\u045a\u045b\u0005\u0206\u0000\u0000\u045b\u045c\u0005~\u0000\u0000\u045c"+
		"\u0461\u0003\u00a2Q\u0000\u045d\u045e\u0005#\u0000\u0000\u045e\u0460\u0003"+
		"\u00a2Q\u0000\u045f\u045d\u0001\u0000\u0000\u0000\u0460\u0463\u0001\u0000"+
		"\u0000\u0000\u0461\u045f\u0001\u0000\u0000\u0000\u0461\u0462\u0001\u0000"+
		"\u0000\u0000\u0462\u0465\u0001\u0000\u0000\u0000\u0463\u0461\u0001\u0000"+
		"\u0000\u0000\u0464\u045a\u0001\u0000\u0000\u0000\u0464\u0465\u0001\u0000"+
		"\u0000\u0000\u0465\u0467\u0001\u0000\u0000\u0000\u0466\u0468\u0003\u0122"+
		"\u0091\u0000\u0467\u0466\u0001\u0000\u0000\u0000\u0467\u0468\u0001\u0000"+
		"\u0000\u0000\u0468\u046a\u0001\u0000\u0000\u0000\u0469\u046b\u0003\u00d0"+
		"h\u0000\u046a\u0469\u0001\u0000\u0000\u0000\u046a\u046b\u0001\u0000\u0000"+
		"\u0000\u046b\u046c\u0001\u0000\u0000\u0000\u046c\u046d\u0005\u001e\u0000"+
		"\u0000\u046d\u00cf\u0001\u0000\u0000\u0000\u046e\u0471\u0007\u001d\u0000"+
		"\u0000\u046f\u0472\u0003\u00d2i\u0000\u0470\u0472\u0003\u00d6k\u0000\u0471"+
		"\u046f\u0001\u0000\u0000\u0000\u0471\u0470\u0001\u0000\u0000\u0000\u0472"+
		"\u00d1\u0001\u0000\u0000\u0000\u0473\u0474\u0005\u00b7\u0000\u0000\u0474"+
		"\u0480\u0005\u026b\u0000\u0000\u0475\u0476\u0005\u02f8\u0000\u0000\u0476"+
		"\u0480\u0005\u0217\u0000\u0000\u0477\u0478\u0005\u02f8\u0000\u0000\u0478"+
		"\u0480\u0005\u0118\u0000\u0000\u0479\u047a\u0003\u00a2Q\u0000\u047a\u047b"+
		"\u0005\u0217\u0000\u0000\u047b\u0480\u0001\u0000\u0000\u0000\u047c\u047d"+
		"\u0003\u00a2Q\u0000\u047d\u047e\u0005\u0118\u0000\u0000\u047e\u0480\u0001"+
		"\u0000\u0000\u0000\u047f\u0473\u0001\u0000\u0000\u0000\u047f\u0475\u0001"+
		"\u0000\u0000\u0000\u047f\u0477\u0001\u0000\u0000\u0000\u047f\u0479\u0001"+
		"\u0000\u0000\u0000\u047f\u047c\u0001\u0000\u0000\u0000\u0480\u00d3\u0001"+
		"\u0000\u0000\u0000\u0481\u0482\u0003\u00d2i\u0000\u0482\u00d5\u0001\u0000"+
		"\u0000\u0000\u0483\u0484\u0005r\u0000\u0000\u0484\u0485\u0003\u00d2i\u0000"+
		"\u0485\u0486\u0005`\u0000\u0000\u0486\u0487\u0003\u00d4j\u0000\u0487\u00d7"+
		"\u0001\u0000\u0000\u0000\u0488\u0496\u0003\u00ecv\u0000\u0489\u0496\u0003"+
		"\u00eew\u0000\u048a\u0496\u0003\u00dam\u0000\u048b\u0496\u0003\u00f8|"+
		"\u0000\u048c\u0496\u0003\u00f6{\u0000\u048d\u0496\u0003\u00deo\u0000\u048e"+
		"\u0496\u0003\u00f2y\u0000\u048f\u0496\u0003\u00f4z\u0000\u0490\u0496\u0003"+
		"\u00fa}\u0000\u0491\u0496\u0003\u00fc~\u0000\u0492\u0496\u0003\u00fe\u007f"+
		"\u0000\u0493\u0496\u0003\u00e0p\u0000\u0494\u0496\u0003\u00dcn\u0000\u0495"+
		"\u0488\u0001\u0000\u0000\u0000\u0495\u0489\u0001\u0000\u0000\u0000\u0495"+
		"\u048a\u0001\u0000\u0000\u0000\u0495\u048b\u0001\u0000\u0000\u0000\u0495"+
		"\u048c\u0001\u0000\u0000\u0000\u0495\u048d\u0001\u0000\u0000\u0000\u0495"+
		"\u048e\u0001\u0000\u0000\u0000\u0495\u048f\u0001\u0000\u0000\u0000\u0495"+
		"\u0490\u0001\u0000\u0000\u0000\u0495\u0491\u0001\u0000\u0000\u0000\u0495"+
		"\u0492\u0001\u0000\u0000\u0000\u0495\u0493\u0001\u0000\u0000\u0000\u0495"+
		"\u0494\u0001\u0000\u0000\u0000\u0496\u00d9\u0001\u0000\u0000\u0000\u0497"+
		"\u049a\u0005\u00bb\u0000\u0000\u0498\u0499\u0005\u001d\u0000\u0000\u0499"+
		"\u049b\u0005\u001e\u0000\u0000\u049a\u0498\u0001\u0000\u0000\u0000\u049a"+
		"\u049b\u0001\u0000\u0000\u0000\u049b\u00db\u0001\u0000\u0000\u0000\u049c"+
		"\u049d\u0005\u012f\u0000\u0000\u049d\u049e\u0005\u001d\u0000\u0000\u049e"+
		"\u04a3\u0003\u00a2Q\u0000\u049f\u04a0\u0005#\u0000\u0000\u04a0\u04a2\u0003"+
		"\u00a2Q\u0000\u04a1\u049f\u0001\u0000\u0000\u0000\u04a2\u04a5\u0001\u0000"+
		"\u0000\u0000\u04a3\u04a1\u0001\u0000\u0000\u0000\u04a3\u04a4\u0001\u0000"+
		"\u0000\u0000\u04a4\u04a6\u0001\u0000\u0000\u0000\u04a5\u04a3\u0001\u0000"+
		"\u0000\u0000\u04a6\u04a7\u0005\u001e\u0000\u0000\u04a7\u00dd\u0001\u0000"+
		"\u0000\u0000\u04a8\u04a9\u00052\u0000\u0000\u04a9\u04ab\u0005\u001d\u0000"+
		"\u0000\u04aa\u04ac\u0003\u00cae\u0000\u04ab\u04aa\u0001\u0000\u0000\u0000"+
		"\u04ab\u04ac\u0001\u0000\u0000\u0000\u04ac\u04b6\u0001\u0000\u0000\u0000"+
		"\u04ad\u04b2\u0003\u00a2Q\u0000\u04ae\u04af\u0005#\u0000\u0000\u04af\u04b1"+
		"\u0003\u00a2Q\u0000\u04b0\u04ae\u0001\u0000\u0000\u0000\u04b1\u04b4\u0001"+
		"\u0000\u0000\u0000\u04b2\u04b0\u0001\u0000\u0000\u0000\u04b2\u04b3\u0001"+
		"\u0000\u0000\u0000\u04b3\u04b7\u0001\u0000\u0000\u0000\u04b4\u04b2\u0001"+
		"\u0000\u0000\u0000\u04b5\u04b7\u0005\u000f\u0000\u0000\u04b6\u04ad\u0001"+
		"\u0000\u0000\u0000\u04b6\u04b5\u0001\u0000\u0000\u0000\u04b6\u04b7\u0001"+
		"\u0000\u0000\u0000\u04b7\u04b9\u0001\u0000\u0000\u0000\u04b8\u04ba\u0003"+
		"\u0122\u0091\u0000\u04b9\u04b8\u0001\u0000\u0000\u0000\u04b9\u04ba\u0001"+
		"\u0000\u0000\u0000\u04ba\u04bd\u0001\u0000\u0000\u0000\u04bb\u04bc\u0005"+
		"\u0280\u0000\u0000\u04bc\u04be\u0003\u00a2Q\u0000\u04bd\u04bb\u0001\u0000"+
		"\u0000\u0000\u04bd\u04be\u0001\u0000\u0000\u0000\u04be\u04bf\u0001\u0000"+
		"\u0000\u0000\u04bf\u04c0\u0005\u001e\u0000\u0000\u04c0\u00df\u0001\u0000"+
		"\u0000\u0000\u04c1\u04c2\u0007\u001e\u0000\u0000\u04c2\u04c3\u0005\u001d"+
		"\u0000\u0000\u04c3\u04c4\u0005\u001e\u0000\u0000\u04c4\u04ee\u0003\u00e2"+
		"q\u0000\u04c5\u04c6\u0005\u01e3\u0000\u0000\u04c6\u04c7\u0003\u00b4Z\u0000"+
		"\u04c7\u04c8\u0003\u00e2q\u0000\u04c8\u04ee\u0001\u0000\u0000\u0000\u04c9"+
		"\u04ca\u0007\u001f\u0000\u0000\u04ca\u04cb\u0005\u001d\u0000\u0000\u04cb"+
		"\u04cd\u0003\u00a2Q\u0000\u04cc\u04ce\u0003\u00e4r\u0000\u04cd\u04cc\u0001"+
		"\u0000\u0000\u0000\u04cd\u04ce\u0001\u0000\u0000\u0000\u04ce\u04cf\u0001"+
		"\u0000\u0000\u0000\u04cf\u04d1\u0005\u001e\u0000\u0000\u04d0\u04d2\u0003"+
		"\u00e6s\u0000\u04d1\u04d0\u0001\u0000\u0000\u0000\u04d1\u04d2\u0001\u0000"+
		"\u0000\u0000\u04d2\u04d3\u0001\u0000\u0000\u0000\u04d3\u04d4\u0003\u00e2"+
		"q\u0000\u04d4\u04ee\u0001\u0000\u0000\u0000\u04d5\u04d6\u0007 \u0000\u0000"+
		"\u04d6\u04d7\u0005\u001d\u0000\u0000\u04d7\u04d8\u0003\u00a2Q\u0000\u04d8"+
		"\u04da\u0005\u001e\u0000\u0000\u04d9\u04db\u0003\u00e6s\u0000\u04da\u04d9"+
		"\u0001\u0000\u0000\u0000\u04da\u04db\u0001\u0000\u0000\u0000\u04db\u04dc"+
		"\u0001\u0000\u0000\u0000\u04dc\u04dd\u0003\u00e2q\u0000\u04dd\u04ee\u0001"+
		"\u0000\u0000\u0000\u04de\u04df\u0005\u01e2\u0000\u0000\u04df\u04e0\u0005"+
		"\u001d\u0000\u0000\u04e0\u04e1\u0003\u00a2Q\u0000\u04e1\u04e2\u0005#\u0000"+
		"\u0000\u04e2\u04e3\u0003\u00b4Z\u0000\u04e3\u04e6\u0005\u001e\u0000\u0000"+
		"\u04e4\u04e5\u0005\u011f\u0000\u0000\u04e5\u04e7\u0007!\u0000\u0000\u04e6"+
		"\u04e4\u0001\u0000\u0000\u0000\u04e6\u04e7\u0001\u0000\u0000\u0000\u04e7"+
		"\u04e9\u0001\u0000\u0000\u0000\u04e8\u04ea\u0003\u00e6s\u0000\u04e9\u04e8"+
		"\u0001\u0000\u0000\u0000\u04e9\u04ea\u0001\u0000\u0000\u0000\u04ea\u04eb"+
		"\u0001\u0000\u0000\u0000\u04eb\u04ec\u0003\u00e2q\u0000\u04ec\u04ee\u0001"+
		"\u0000\u0000\u0000\u04ed\u04c1\u0001\u0000\u0000\u0000\u04ed\u04c5\u0001"+
		"\u0000\u0000\u0000\u04ed\u04c9\u0001\u0000\u0000\u0000\u04ed\u04d5\u0001"+
		"\u0000\u0000\u0000\u04ed\u04de\u0001\u0000\u0000\u0000\u04ee\u00e1\u0001"+
		"\u0000\u0000\u0000\u04ef\u04f2\u0005\u0200\u0000\u0000\u04f0\u04f3\u0003"+
		"\u0018\f\u0000\u04f1\u04f3\u0003\u00ceg\u0000\u04f2\u04f0\u0001\u0000"+
		"\u0000\u0000\u04f2\u04f1\u0001\u0000\u0000\u0000\u04f3\u00e3\u0001\u0000"+
		"\u0000\u0000\u04f4\u04f5\u0005#\u0000\u0000\u04f5\u04f8\u0007\"\u0000"+
		"\u0000\u04f6\u04f7\u0005#\u0000\u0000\u04f7\u04f9\u0003\u00a2Q\u0000\u04f8"+
		"\u04f6\u0001\u0000\u0000\u0000\u04f8\u04f9\u0001\u0000\u0000\u0000\u04f9"+
		"\u00e5\u0001\u0000\u0000\u0000\u04fa\u04fb\u0007#\u0000\u0000\u04fb\u04fc"+
		"\u0005\u01e5\u0000\u0000\u04fc\u00e7\u0001\u0000\u0000\u0000\u04fd\u04fe"+
		"\u0005\u011a\u0000\u0000\u04fe\u0505\u0005\u0309\u0000\u0000\u04ff\u0505"+
		"\u0005\u0228\u0000\u0000\u0500\u0505\u0005\u010b\u0000\u0000\u0501\u0505"+
		"\u0005\u01b5\u0000\u0000\u0502\u0505\u0005\u0107\u0000\u0000\u0503\u0505"+
		"\u0005\u0088\u0000\u0000\u0504\u04fd\u0001\u0000\u0000\u0000\u0504\u04ff"+
		"\u0001\u0000\u0000\u0000\u0504\u0500\u0001\u0000\u0000\u0000\u0504\u0501"+
		"\u0001\u0000\u0000\u0000\u0504\u0502\u0001\u0000\u0000\u0000\u0504\u0503"+
		"\u0001\u0000\u0000\u0000\u0505\u00e9\u0001\u0000\u0000\u0000\u0506\u0507"+
		"\u0007$\u0000\u0000\u0507\u00eb\u0001\u0000\u0000\u0000\u0508\u0509\u0005"+
		"3\u0000\u0000\u0509\u050a\u0005\u001d\u0000\u0000\u050a\u050b\u0003\u00a2"+
		"Q\u0000\u050b\u050c\u0005c\u0000\u0000\u050c\u050e\u0003\u00f0x\u0000"+
		"\u050d\u050f\u0005b\u0000\u0000\u050e\u050d\u0001\u0000\u0000\u0000\u050e"+
		"\u050f\u0001\u0000\u0000\u0000\u050f\u0510\u0001\u0000\u0000\u0000\u0510"+
		"\u0511\u0005\u001e\u0000\u0000\u0511\u0521\u0001\u0000\u0000\u0000\u0512"+
		"\u0513\u00053\u0000\u0000\u0513\u0514\u0005\u001d\u0000\u0000\u0514\u0515"+
		"\u0003\u00a2Q\u0000\u0515\u0516\u0005g\u0000\u0000\u0516\u0517\u0005\u02e7"+
		"\u0000\u0000\u0517\u0518\u0005\u0350\u0000\u0000\u0518\u0519\u0003\u00a2"+
		"Q\u0000\u0519\u051a\u0005c\u0000\u0000\u051a\u051c\u0005\u00c3\u0000\u0000"+
		"\u051b\u051d\u0003\u0132\u0099\u0000\u051c\u051b\u0001\u0000\u0000\u0000"+
		"\u051c\u051d\u0001\u0000\u0000\u0000\u051d\u051e\u0001\u0000\u0000\u0000"+
		"\u051e\u051f\u0005\u001e\u0000\u0000\u051f\u0521\u0001\u0000\u0000\u0000"+
		"\u0520\u0508\u0001\u0000\u0000\u0000\u0520\u0512\u0001\u0000\u0000\u0000"+
		"\u0521\u00ed\u0001\u0000\u0000\u0000\u0522\u0523\u0005\u00b1\u0000\u0000"+
		"\u0523\u0524\u0005\u001d\u0000\u0000\u0524\u0525\u0003\u00a2Q\u0000\u0525"+
		"\u0526\u0005#\u0000\u0000\u0526\u0527\u0003\u00f0x\u0000\u0527\u0528\u0005"+
		"\u001e\u0000\u0000\u0528\u0531\u0001\u0000\u0000\u0000\u0529\u052a\u0005"+
		"\u00b1\u0000\u0000\u052a\u052b\u0005\u001d\u0000\u0000\u052b\u052c\u0003"+
		"\u00a2Q\u0000\u052c\u052d\u0005\u030f\u0000\u0000\u052d\u052e\u0003D\""+
		"\u0000\u052e\u052f\u0005\u001e\u0000\u0000\u052f\u0531\u0001\u0000\u0000"+
		"\u0000\u0530\u0522\u0001\u0000\u0000\u0000\u0530\u0529\u0001\u0000\u0000"+
		"\u0000\u0531\u00ef\u0001\u0000\u0000\u0000\u0532\u0534\u0005t\u0000\u0000"+
		"\u0533\u0535\u0003\u014c\u00a6\u0000\u0534\u0533\u0001\u0000\u0000\u0000"+
		"\u0534\u0535\u0001\u0000\u0000\u0000\u0535\u055d\u0001\u0000\u0000\u0000"+
		"\u0536\u0538\u0005\u008a\u0000\u0000\u0537\u0539\u0003\u014c\u00a6\u0000"+
		"\u0538\u0537\u0001\u0000\u0000\u0000\u0538\u0539\u0001\u0000\u0000\u0000"+
		"\u0539\u053b\u0001\u0000\u0000\u0000\u053a\u053c\u0003\u0134\u009a\u0000"+
		"\u053b\u053a\u0001\u0000\u0000\u0000\u053b\u053c\u0001\u0000\u0000\u0000"+
		"\u053c\u055d\u0001\u0000\u0000\u0000\u053d\u0540\u0005\u01d3\u0000\u0000"+
		"\u053e\u0540\u0005\u01d0\u0000\u0000\u053f\u053d\u0001\u0000\u0000\u0000"+
		"\u053f\u053e\u0001\u0000\u0000\u0000\u0540\u0542\u0001\u0000\u0000\u0000"+
		"\u0541\u0543\u0003\u014c\u00a6\u0000\u0542\u0541\u0001\u0000\u0000\u0000"+
		"\u0542\u0543\u0001\u0000\u0000\u0000\u0543\u055d\u0001\u0000\u0000\u0000"+
		"\u0544\u055d\u0007%\u0000\u0000\u0545\u055d\u0007&\u0000\u0000\u0546\u055d"+
		"\u0005\u00c2\u0000\u0000\u0547\u0549\u0005\u02e7\u0000\u0000\u0548\u054a"+
		"\u0003\u0132\u0099\u0000\u0549\u0548\u0001\u0000\u0000\u0000\u0549\u054a"+
		"\u0001\u0000\u0000\u0000\u054a\u055d\u0001\u0000\u0000\u0000\u054b\u054d"+
		"\u0005\u00c3\u0000\u0000\u054c\u054e\u0003\u0132\u0099\u0000\u054d\u054c"+
		"\u0001\u0000\u0000\u0000\u054d\u054e\u0001\u0000\u0000\u0000\u054e\u055d"+
		"\u0001\u0000\u0000\u0000\u054f\u0552\u0005\u00cb\u0000\u0000\u0550\u0553"+
		"\u0003\u014c\u00a6\u0000\u0551\u0553\u0003\u0130\u0098\u0000\u0552\u0550"+
		"\u0001\u0000\u0000\u0000\u0552\u0551\u0001\u0000\u0000\u0000\u0552\u0553"+
		"\u0001\u0000\u0000\u0000\u0553\u055d\u0001\u0000\u0000\u0000\u0554\u055d"+
		"\u0005\u0168\u0000\u0000\u0555\u055d\u0005\u0230\u0000\u0000\u0556\u0557"+
		"\u0005\u00e2\u0000\u0000\u0557\u055d\u0005\u0218\u0000\u0000\u0558\u055a"+
		"\u0005\u0114\u0000\u0000\u0559\u055b\u0003\u0130\u0098\u0000\u055a\u0559"+
		"\u0001\u0000\u0000\u0000\u055a\u055b\u0001\u0000\u0000\u0000\u055b\u055d"+
		"\u0001\u0000\u0000\u0000\u055c\u0532\u0001\u0000\u0000\u0000\u055c\u0536"+
		"\u0001\u0000\u0000\u0000\u055c\u053f\u0001\u0000\u0000\u0000\u055c\u0544"+
		"\u0001\u0000\u0000\u0000\u055c\u0545\u0001\u0000\u0000\u0000\u055c\u0546"+
		"\u0001\u0000\u0000\u0000\u055c\u0547\u0001\u0000\u0000\u0000\u055c\u054b"+
		"\u0001\u0000\u0000\u0000\u055c\u054f\u0001\u0000\u0000\u0000\u055c\u0554"+
		"\u0001\u0000\u0000\u0000\u055c\u0555\u0001\u0000\u0000\u0000\u055c\u0556"+
		"\u0001\u0000\u0000\u0000\u055c\u0558\u0001\u0000\u0000\u0000\u055d\u00f1"+
		"\u0001\u0000\u0000\u0000\u055e\u055f\u00054\u0000\u0000\u055f\u0560\u0005"+
		"\u001d\u0000\u0000\u0560\u0561\u0003\u00a2Q\u0000\u0561\u0562\u0005\u0147"+
		"\u0000\u0000\u0562\u0563\u0003\u00a2Q\u0000\u0563\u0564\u0005\u001e\u0000"+
		"\u0000\u0564\u00f3\u0001\u0000\u0000\u0000\u0565\u0566\u0007\'\u0000\u0000"+
		"\u0566\u0567\u0005\u001d\u0000\u0000\u0567\u0568\u0003\u00a2Q\u0000\u0568"+
		"\u0569\u0005\u011f\u0000\u0000\u0569\u056c\u0005\u0357\u0000\u0000\u056a"+
		"\u056b\u0005\u011a\u0000\u0000\u056b\u056d\u0005\u0357\u0000\u0000\u056c"+
		"\u056a\u0001\u0000\u0000\u0000\u056c\u056d\u0001\u0000\u0000\u0000\u056d"+
		"\u056e\u0001\u0000\u0000\u0000\u056e\u056f\u0005\u001e\u0000\u0000\u056f"+
		"\u057c\u0001\u0000\u0000\u0000\u0570\u0571\u0007\'\u0000\u0000\u0571\u0572"+
		"\u0005\u001d\u0000\u0000\u0572\u0573\u0003\u00a2Q\u0000\u0573\u0574\u0005"+
		"#\u0000\u0000\u0574\u0577\u0005\u0357\u0000\u0000\u0575\u0576\u0005#\u0000"+
		"\u0000\u0576\u0578\u0005\u0357\u0000\u0000\u0577\u0575\u0001\u0000\u0000"+
		"\u0000\u0577\u0578\u0001\u0000\u0000\u0000\u0578\u0579\u0001\u0000\u0000"+
		"\u0000\u0579\u057a\u0005\u001e\u0000\u0000\u057a\u057c\u0001\u0000\u0000"+
		"\u0000\u057b\u0565\u0001\u0000\u0000\u0000\u057b\u0570\u0001\u0000\u0000"+
		"\u0000\u057c\u00f5\u0001\u0000\u0000\u0000\u057d\u057e\u00057\u0000\u0000"+
		"\u057e\u057f\u0005\u001d\u0000\u0000\u057f\u0580\u0003\u011e\u008f\u0000"+
		"\u0580\u0581\u0005\u011f\u0000\u0000\u0581\u0582\u0003\u00a2Q\u0000\u0582"+
		"\u0583\u0005\u001e\u0000\u0000\u0583\u00f7\u0001\u0000\u0000\u0000\u0584"+
		"\u0585\u0005\u008a\u0000\u0000\u0585\u0586\u0005\u001d\u0000\u0000\u0586"+
		"\u058b\u0003\u00a2Q\u0000\u0587\u0588\u0005#\u0000\u0000\u0588\u058a\u0003"+
		"\u00a2Q\u0000\u0589\u0587\u0001\u0000\u0000\u0000\u058a\u058d\u0001\u0000"+
		"\u0000\u0000\u058b\u0589\u0001\u0000\u0000\u0000\u058b\u058c\u0001\u0000"+
		"\u0000\u0000\u058c\u0590\u0001\u0000\u0000\u0000\u058d\u058b\u0001\u0000"+
		"\u0000\u0000\u058e\u058f\u0005\u030f\u0000\u0000\u058f\u0591\u0003D\""+
		"\u0000\u0590\u058e\u0001\u0000\u0000\u0000\u0590\u0591\u0001\u0000\u0000"+
		"\u0000\u0591\u0592\u0001\u0000\u0000\u0000\u0592\u0593\u0005\u001e\u0000"+
		"\u0000\u0593\u00f9\u0001\u0000\u0000\u0000\u0594\u0595\u00058\u0000\u0000"+
		"\u0595\u059b\u0005\u001d\u0000\u0000\u0596\u0598\u0007(\u0000\u0000\u0597"+
		"\u0599\u0003\u00a2Q\u0000\u0598\u0597\u0001\u0000\u0000\u0000\u0598\u0599"+
		"\u0001\u0000\u0000\u0000\u0599\u059a\u0001\u0000\u0000\u0000\u059a\u059c"+
		"\u0005\u011f\u0000\u0000\u059b\u0596\u0001\u0000\u0000\u0000\u059b\u059c"+
		"\u0001\u0000\u0000\u0000\u059c\u059d\u0001\u0000\u0000\u0000\u059d\u059e"+
		"\u0003\u00a2Q\u0000\u059e\u059f\u0005\u001e\u0000\u0000\u059f\u05ab\u0001"+
		"\u0000\u0000\u0000\u05a0\u05a1\u00058\u0000\u0000\u05a1\u05a5\u0005\u001d"+
		"\u0000\u0000\u05a2\u05a3\u0003\u00a2Q\u0000\u05a3\u05a4\u0005\u011f\u0000"+
		"\u0000\u05a4\u05a6\u0001\u0000\u0000\u0000\u05a5\u05a2\u0001\u0000\u0000"+
		"\u0000\u05a5\u05a6\u0001\u0000\u0000\u0000\u05a6\u05a7\u0001\u0000\u0000"+
		"\u0000\u05a7\u05a8\u0003\u00a2Q\u0000\u05a8\u05a9\u0005\u001e\u0000\u0000"+
		"\u05a9\u05ab\u0001\u0000\u0000\u0000\u05aa\u0594\u0001\u0000\u0000\u0000"+
		"\u05aa\u05a0\u0001\u0000\u0000\u0000\u05ab\u00fb\u0001\u0000\u0000\u0000"+
		"\u05ac\u05ad\u0005\u0315\u0000\u0000\u05ad\u05ae\u0005\u001d\u0000\u0000"+
		"\u05ae\u05af\u0003\u00bc^\u0000\u05af\u05b0\u0005\u001e\u0000\u0000\u05b0"+
		"\u00fd\u0001\u0000\u0000\u0000\u05b1\u05b2\u0005\u0322\u0000\u0000\u05b2"+
		"\u05b3\u0005\u001d\u0000\u0000\u05b3\u05b6\u0003\u00a2Q\u0000\u05b4\u05b5"+
		"\u0005c\u0000\u0000\u05b5\u05b7\u0003\u0126\u0093\u0000\u05b6\u05b4\u0001"+
		"\u0000\u0000\u0000\u05b6\u05b7\u0001\u0000\u0000\u0000\u05b7\u05b9\u0001"+
		"\u0000\u0000\u0000\u05b8\u05ba\u0003\u0100\u0080\u0000\u05b9\u05b8\u0001"+
		"\u0000\u0000\u0000\u05b9\u05ba\u0001\u0000\u0000\u0000\u05ba\u05bb\u0001"+
		"\u0000\u0000\u0000\u05bb\u05bc\u0005\u001e\u0000\u0000\u05bc\u00ff\u0001"+
		"\u0000\u0000\u0000\u05bd\u05c9\u0005\u017a\u0000\u0000\u05be\u05c3\u0003"+
		"\u0102\u0081\u0000\u05bf\u05c0\u0005#\u0000\u0000\u05c0\u05c2\u0003\u0102"+
		"\u0081\u0000\u05c1\u05bf\u0001\u0000\u0000\u0000\u05c2\u05c5\u0001\u0000"+
		"\u0000\u0000\u05c3\u05c1\u0001\u0000\u0000\u0000\u05c3\u05c4\u0001\u0000"+
		"\u0000\u0000\u05c4\u05ca\u0001\u0000\u0000\u0000\u05c5\u05c3\u0001\u0000"+
		"\u0000\u0000\u05c6\u05c7\u0005\u0357\u0000\u0000\u05c7\u05c8\u0005\u000e"+
		"\u0000\u0000\u05c8\u05ca\u0005\u0357\u0000\u0000\u05c9\u05be\u0001\u0000"+
		"\u0000\u0000\u05c9\u05c6\u0001\u0000\u0000\u0000\u05ca\u0101\u0001\u0000"+
		"\u0000\u0000\u05cb\u05cd\u0005\u0357\u0000\u0000\u05cc\u05ce\u0003\u0148"+
		"\u00a4\u0000\u05cd\u05cc\u0001\u0000\u0000\u0000\u05cd\u05ce\u0001\u0000"+
		"\u0000\u0000\u05ce\u05d0\u0001\u0000\u0000\u0000\u05cf\u05d1\u0005\u0262"+
		"\u0000\u0000\u05d0\u05cf\u0001\u0000\u0000\u0000\u05d0\u05d1\u0001\u0000"+
		"\u0000\u0000\u05d1\u0103\u0001\u0000\u0000\u0000\u05d2\u05d5\u0003\u0108"+
		"\u0084\u0000\u05d3\u05d5\u0003\u0106\u0083\u0000\u05d4\u05d2\u0001\u0000"+
		"\u0000\u0000\u05d4\u05d3\u0001\u0000\u0000\u0000\u05d5\u0105\u0001\u0000"+
		"\u0000\u0000\u05d6\u05e4\u0005\u00b8\u0000\u0000\u05d7\u05dd\u0005\u00b9"+
		"\u0000\u0000\u05d8\u05da\u0005\u001d\u0000\u0000\u05d9\u05db\u0005\u0357"+
		"\u0000\u0000\u05da\u05d9\u0001\u0000\u0000\u0000\u05da\u05db\u0001\u0000"+
		"\u0000\u0000\u05db\u05dc\u0001\u0000\u0000\u0000\u05dc\u05de\u0005\u001e"+
		"\u0000\u0000\u05dd\u05d8\u0001\u0000\u0000\u0000\u05dd\u05de\u0001\u0000"+
		"\u0000\u0000\u05de\u05e4\u0001\u0000\u0000\u0000\u05df\u05e4\u0005\u00ba"+
		"\u0000\u0000\u05e0\u05e4\u00059\u0000\u0000\u05e1\u05e4\u0005\u0183\u0000"+
		"\u0000\u05e2\u05e4\u0005\u0184\u0000\u0000\u05e3\u05d6\u0001\u0000\u0000"+
		"\u0000\u05e3\u05d7\u0001\u0000\u0000\u0000\u05e3\u05df\u0001\u0000\u0000"+
		"\u0000\u05e3\u05e0\u0001\u0000\u0000\u0000\u05e3\u05e1\u0001\u0000\u0000"+
		"\u0000\u05e3\u05e2\u0001\u0000\u0000\u0000\u05e4\u0107\u0001\u0000\u0000"+
		"\u0000\u05e5\u05e6\u0003\u010a\u0085\u0000\u05e6\u05f0\u0005\u001d\u0000"+
		"\u0000\u05e7\u05ec\u0003\u00a2Q\u0000\u05e8\u05e9\u0005#\u0000\u0000\u05e9"+
		"\u05eb\u0003\u00a2Q\u0000\u05ea\u05e8\u0001\u0000\u0000\u0000\u05eb\u05ee"+
		"\u0001\u0000\u0000\u0000\u05ec\u05ea\u0001\u0000\u0000\u0000\u05ec\u05ed"+
		"\u0001\u0000\u0000\u0000\u05ed\u05f1\u0001\u0000\u0000\u0000\u05ee\u05ec"+
		"\u0001\u0000\u0000\u0000\u05ef\u05f1\u0005\u000f\u0000\u0000\u05f0\u05e7"+
		"\u0001\u0000\u0000\u0000\u05f0\u05ef\u0001\u0000\u0000\u0000\u05f0\u05f1"+
		"\u0001\u0000\u0000\u0000\u05f1\u05f2\u0001\u0000\u0000\u0000\u05f2\u05f3"+
		"\u0005\u001e\u0000\u0000\u05f3\u0109\u0001\u0000\u0000\u0000\u05f4\u0614"+
		"\u0005\u0143\u0000\u0000\u05f5\u0614\u0005\u0183\u0000\u0000\u05f6\u0614"+
		"\u0005\u0184\u0000\u0000\u05f7\u0614\u0005\u0246\u0000\u0000\u05f8\u0614"+
		"\u0005\u0150\u0000\u0000\u05f9\u0614\u0005\u015b\u0000\u0000\u05fa\u0614"+
		"\u0005\u01c3\u0000\u0000\u05fb\u0614\u0005\u00bf\u0000\u0000\u05fc\u0614"+
		"\u0005\u0273\u0000\u0000\u05fd\u0614\u0005\u0178\u0000\u0000\u05fe\u0614"+
		"\u0005\u0264\u0000\u0000\u05ff\u0614\u0005\u00c2\u0000\u0000\u0600\u0614"+
		"\u0005\u00c4\u0000\u0000\u0601\u0614\u0005\u0127\u0000\u0000\u0602\u0614"+
		"\u0005\u0244\u0000\u0000\u0603\u0614\u0005\u017f\u0000\u0000\u0604\u0614"+
		"\u0005\u01c8\u0000\u0000\u0605\u0614\u0005\u01c9\u0000\u0000\u0606\u0614"+
		"\u0005\u01ca\u0000\u0000\u0607\u0614\u0005\u0213\u0000\u0000\u0608\u0614"+
		"\u0005\u0214\u0000\u0000\u0609\u0614\u0005\u02e7\u0000\u0000\u060a\u0614"+
		"\u0005\u02e8\u0000\u0000\u060b\u0614\u0005\u02e9\u0000\u0000\u060c\u0614"+
		"\u0005\u02ea\u0000\u0000\u060d\u0614\u0005\u00c2\u0000\u0000\u060e\u0614"+
		"\u0005\u00ba\u0000\u0000\u060f\u0614\u0005\u00b8\u0000\u0000\u0610\u0614"+
		"\u0005\u00b9\u0000\u0000\u0611\u0614\u0005\u0312\u0000\u0000\u0612\u0614"+
		"\u0003\u0018\f\u0000\u0613\u05f4\u0001\u0000\u0000\u0000\u0613\u05f5\u0001"+
		"\u0000\u0000\u0000\u0613\u05f6\u0001\u0000\u0000\u0000\u0613\u05f7\u0001"+
		"\u0000\u0000\u0000\u0613\u05f8\u0001\u0000\u0000\u0000\u0613\u05f9\u0001"+
		"\u0000\u0000\u0000\u0613\u05fa\u0001\u0000\u0000\u0000\u0613\u05fb\u0001"+
		"\u0000\u0000\u0000\u0613\u05fc\u0001\u0000\u0000\u0000\u0613\u05fd\u0001"+
		"\u0000\u0000\u0000\u0613\u05fe\u0001\u0000\u0000\u0000\u0613\u05ff\u0001"+
		"\u0000\u0000\u0000\u0613\u0600\u0001\u0000\u0000\u0000\u0613\u0601\u0001"+
		"\u0000\u0000\u0000\u0613\u0602\u0001\u0000\u0000\u0000\u0613\u0603\u0001"+
		"\u0000\u0000\u0000\u0613\u0604\u0001\u0000\u0000\u0000\u0613\u0605\u0001"+
		"\u0000\u0000\u0000\u0613\u0606\u0001\u0000\u0000\u0000\u0613\u0607\u0001"+
		"\u0000\u0000\u0000\u0613\u0608\u0001\u0000\u0000\u0000\u0613\u0609\u0001"+
		"\u0000\u0000\u0000\u0613\u060a\u0001\u0000\u0000\u0000\u0613\u060b\u0001"+
		"\u0000\u0000\u0000\u0613\u060c\u0001\u0000\u0000\u0000\u0613\u060d\u0001"+
		"\u0000\u0000\u0000\u0613\u060e\u0001\u0000\u0000\u0000\u0613\u060f\u0001"+
		"\u0000\u0000\u0000\u0613\u0610\u0001\u0000\u0000\u0000\u0613\u0611\u0001"+
		"\u0000\u0000\u0000\u0613\u0612\u0001\u0000\u0000\u0000\u0614\u010b\u0001"+
		"\u0000\u0000\u0000\u0615\u061b\u0005\u01ad\u0000\u0000\u0616\u061c\u0003"+
		"\u00bc^\u0000\u0617\u0618\u0005\u001d\u0000\u0000\u0618\u0619\u0003\u00bc"+
		"^\u0000\u0619\u061a\u0005\u001e\u0000\u0000\u061a\u061c\u0001\u0000\u0000"+
		"\u0000\u061b\u0616\u0001\u0000\u0000\u0000\u061b\u0617\u0001\u0000\u0000"+
		"\u0000\u061c\u061d\u0001\u0000\u0000\u0000\u061d\u061e\u0005Y\u0000\u0000"+
		"\u061e\u061f\u0005\u001d\u0000\u0000\u061f\u0621\u0003\u00a2Q\u0000\u0620"+
		"\u0622\u0003\u010e\u0087\u0000\u0621\u0620\u0001\u0000\u0000\u0000\u0621"+
		"\u0622\u0001\u0000\u0000\u0000\u0622\u0623\u0001\u0000\u0000\u0000\u0623"+
		"\u0624\u0005\u001e\u0000\u0000\u0624\u010d\u0001\u0000\u0000\u0000\u0625"+
		"\u0626\u0005\u0147\u0000\u0000\u0626\u0627\u0005\u01d2\u0000\u0000\u0627"+
		"\u0628\u0005\u0170\u0000\u0000\u0628\u0637\u0005\u01c4\u0000\u0000\u0629"+
		"\u062a\u0005\u0147\u0000\u0000\u062a\u062b\u0005\u01d2\u0000\u0000\u062b"+
		"\u062c\u0005\u0170\u0000\u0000\u062c\u062d\u0005\u01c4\u0000\u0000\u062d"+
		"\u062e\u0005\u0327\u0000\u0000\u062e\u062f\u0005\u0227\u0000\u0000\u062f"+
		"\u0637\u0005\u0103\u0000\u0000\u0630\u0631\u0005\u0147\u0000\u0000\u0631"+
		"\u0632\u0005z\u0000\u0000\u0632\u0637\u0005\u01c4\u0000\u0000\u0633\u0634"+
		"\u0005\u0327\u0000\u0000\u0634\u0635\u0005\u0227\u0000\u0000\u0635\u0637"+
		"\u0005\u0103\u0000\u0000\u0636\u0625\u0001\u0000\u0000\u0000\u0636\u0629"+
		"\u0001\u0000\u0000\u0000\u0636\u0630\u0001\u0000\u0000\u0000\u0636\u0633"+
		"\u0001\u0000\u0000\u0000\u0637\u010f\u0001\u0000\u0000\u0000\u0638\u063a"+
		"\u0005\u0084\u0000\u0000\u0639\u063b\u0003\u00a2Q\u0000\u063a\u0639\u0001"+
		"\u0000\u0000\u0000\u063a\u063b\u0001\u0000\u0000\u0000\u063b\u063d\u0001"+
		"\u0000\u0000\u0000\u063c\u063e\u0003\u0116\u008b\u0000\u063d\u063c\u0001"+
		"\u0000\u0000\u0000\u063e\u063f\u0001\u0000\u0000\u0000\u063f\u063d\u0001"+
		"\u0000\u0000\u0000\u063f\u0640\u0001\u0000\u0000\u0000\u0640\u0642\u0001"+
		"\u0000\u0000\u0000\u0641\u0643\u0003\u0118\u008c\u0000\u0642\u0641\u0001"+
		"\u0000\u0000\u0000\u0642\u0643\u0001\u0000\u0000\u0000\u0643\u0644\u0001"+
		"\u0000\u0000\u0000\u0644\u0645\u0005\u00ef\u0000\u0000\u0645\u0111\u0001"+
		"\u0000\u0000\u0000\u0646\u0647\u0003\u00a2Q\u0000\u0647\u0113\u0001\u0000"+
		"\u0000\u0000\u0648\u0649\u0005\u0357\u0000\u0000\u0649\u0115\u0001\u0000"+
		"\u0000\u0000\u064a\u064b\u0005\u0323\u0000\u0000\u064b\u064c\u0003\u00a2"+
		"Q\u0000\u064c\u064d\u0005\u02e4\u0000\u0000\u064d\u064e\u0003\u00a2Q\u0000"+
		"\u064e\u0117\u0001\u0000\u0000\u0000\u064f\u0650\u0005\u00e9\u0000\u0000"+
		"\u0650\u0651\u0003\u00a2Q\u0000\u0651\u0119\u0001\u0000\u0000\u0000\u0652"+
		"\u0653\u0005\u015b\u0000\u0000\u0653\u0654\u0003\u011c\u008e\u0000\u0654"+
		"\u011b\u0001\u0000\u0000\u0000\u0655\u0656\u0003\u00a2Q\u0000\u0656\u0657"+
		"\u0003\u011e\u008f\u0000\u0657\u011d\u0001\u0000\u0000\u0000\u0658\u0659"+
		"\u0007)\u0000\u0000\u0659\u011f\u0001\u0000\u0000\u0000\u065a\u065b\u0005"+
		"\u0001\u0000\u0000\u065b\u0121\u0001\u0000\u0000\u0000\u065c\u065d\u0005"+
		"\u01f9\u0000\u0000\u065d\u065e\u0005~\u0000\u0000\u065e\u0663\u0003\u0124"+
		"\u0092\u0000\u065f\u0660\u0005#\u0000\u0000\u0660\u0662\u0003\u0124\u0092"+
		"\u0000\u0661\u065f\u0001\u0000\u0000\u0000\u0662\u0665\u0001\u0000\u0000"+
		"\u0000\u0663\u0661\u0001\u0000\u0000\u0000\u0663\u0664\u0001\u0000\u0000"+
		"\u0000\u0664\u0123\u0001\u0000\u0000\u0000\u0665\u0663\u0001\u0000\u0000"+
		"\u0000\u0666\u0669\u0003\n\u0005\u0000\u0667\u0669\u0003\u00a2Q\u0000"+
		"\u0668\u0666\u0001\u0000\u0000\u0000\u0668\u0667\u0001\u0000\u0000\u0000"+
		"\u0669\u066b\u0001\u0000\u0000\u0000\u066a\u066c\u0003\u0148\u00a4\u0000"+
		"\u066b\u066a\u0001\u0000\u0000\u0000\u066b\u066c\u0001\u0000\u0000\u0000"+
		"\u066c\u0125\u0001\u0000\u0000\u0000\u066d\u066f\u0007*\u0000\u0000\u066e"+
		"\u0670\u0003\u014c\u00a6\u0000\u066f\u066e\u0001\u0000\u0000\u0000\u066f"+
		"\u0670\u0001\u0000\u0000\u0000\u0670\u0672\u0001\u0000\u0000\u0000\u0671"+
		"\u0673\u0003\u012e\u0097\u0000\u0672\u0671\u0001\u0000\u0000\u0000\u0672"+
		"\u0673\u0001\u0000\u0000\u0000\u0673\u0701\u0001\u0000\u0000\u0000\u0674"+
		"\u067a\u0005\u0230\u0000\u0000\u0675\u0677\u0005\u00e2\u0000\u0000\u0676"+
		"\u0678\u0005\u0218\u0000\u0000\u0677\u0676\u0001\u0000\u0000\u0000\u0677"+
		"\u0678\u0001\u0000\u0000\u0000\u0678\u067a\u0001\u0000\u0000\u0000\u0679"+
		"\u0674\u0001\u0000\u0000\u0000\u0679\u0675\u0001\u0000\u0000\u0000\u067a"+
		"\u067c\u0001\u0000\u0000\u0000\u067b\u067d\u0003\u0130\u0098\u0000\u067c"+
		"\u067b\u0001\u0000\u0000\u0000\u067c\u067d\u0001\u0000\u0000\u0000\u067d"+
		"\u067f\u0001\u0000\u0000\u0000\u067e\u0680\u0003\u012e\u0097\u0000\u067f"+
		"\u067e\u0001\u0000\u0000\u0000\u067f\u0680\u0001\u0000\u0000\u0000\u0680"+
		"\u0701\u0001\u0000\u0000\u0000\u0681\u0684\u0007+\u0000\u0000\u0682\u0685"+
		"\u0003\u014c\u00a6\u0000\u0683\u0685\u0003\u0130\u0098\u0000\u0684\u0682"+
		"\u0001\u0000\u0000\u0000\u0684\u0683\u0001\u0000\u0000\u0000\u0684\u0685"+
		"\u0001\u0000\u0000\u0000\u0685\u0687\u0001\u0000\u0000\u0000\u0686\u0688"+
		"\u0003\u012e\u0097\u0000\u0687\u0686\u0001\u0000\u0000\u0000\u0687\u0688"+
		"\u0001\u0000\u0000\u0000\u0688\u0701\u0001\u0000\u0000\u0000\u0689\u068b"+
		"\u0005v\u0000\u0000\u068a\u068c\u0003\u014c\u00a6\u0000\u068b\u068a\u0001"+
		"\u0000\u0000\u0000\u068b\u068c\u0001\u0000\u0000\u0000\u068c\u0701\u0001"+
		"\u0000\u0000\u0000\u068d\u0701\u0007,\u0000\u0000\u068e\u0690\u0005\u008a"+
		"\u0000\u0000\u068f\u0691\u0003\u014c\u00a6\u0000\u0690\u068f\u0001\u0000"+
		"\u0000\u0000\u0690\u0691\u0001\u0000\u0000\u0000\u0691\u0693\u0001\u0000"+
		"\u0000\u0000\u0692\u0694\u0003\u0134\u009a\u0000\u0693\u0692\u0001\u0000"+
		"\u0000\u0000\u0693\u0694\u0001\u0000\u0000\u0000\u0694\u0701\u0001\u0000"+
		"\u0000\u0000\u0695\u0698\u0005\u01d3\u0000\u0000\u0696\u0698\u0005\u01d0"+
		"\u0000\u0000\u0697\u0695\u0001\u0000\u0000\u0000\u0697\u0696\u0001\u0000"+
		"\u0000\u0000\u0698\u069a\u0001\u0000\u0000\u0000\u0699\u069b\u0003\u014c"+
		"\u00a6\u0000\u069a\u0699\u0001\u0000\u0000\u0000\u069a\u069b\u0001\u0000"+
		"\u0000\u0000\u069b\u069d\u0001\u0000\u0000\u0000\u069c\u069e\u0005t\u0000"+
		"\u0000\u069d\u069c\u0001\u0000\u0000\u0000\u069d\u069e\u0001\u0000\u0000"+
		"\u0000\u069e\u0701\u0001\u0000\u0000\u0000\u069f\u0701\u0007%\u0000\u0000"+
		"\u06a0\u06a2\u0005t\u0000\u0000\u06a1\u06a3\u0003\u014c\u00a6\u0000\u06a2"+
		"\u06a1\u0001\u0000\u0000\u0000\u06a2\u06a3\u0001\u0000\u0000\u0000\u06a3"+
		"\u0701\u0001\u0000\u0000\u0000\u06a4\u06a8\u0005\u008b\u0000\u0000\u06a5"+
		"\u06a8\u0005\u008d\u0000\u0000\u06a6\u06a8\u0005\u0317\u0000\u0000\u06a7"+
		"\u06a4\u0001\u0000\u0000\u0000\u06a7\u06a5\u0001\u0000\u0000\u0000\u06a7"+
		"\u06a6\u0001\u0000\u0000\u0000\u06a8\u06a9\u0001\u0000\u0000\u0000\u06a9"+
		"\u06ab\u0003\u014c\u00a6\u0000\u06aa\u06ac\u0003\u0134\u009a\u0000\u06ab"+
		"\u06aa\u0001\u0000\u0000\u0000\u06ab\u06ac\u0001\u0000\u0000\u0000\u06ac"+
		"\u0701\u0001\u0000\u0000\u0000\u06ad\u06ae\u0005\u01cf\u0000\u0000\u06ae"+
		"\u06b6\u0005\u0317\u0000\u0000\u06af\u06b6\u0005\u01e8\u0000\u0000\u06b0"+
		"\u06b1\u0005\u01d3\u0000\u0000\u06b1\u06b6\u0005\u0317\u0000\u0000\u06b2"+
		"\u06b6\u0005\u01d1\u0000\u0000\u06b3\u06b4\u0005\u01d3\u0000\u0000\u06b4"+
		"\u06b6\u0005\u031a\u0000\u0000\u06b5\u06ad\u0001\u0000\u0000\u0000\u06b5"+
		"\u06af\u0001\u0000\u0000\u0000\u06b5\u06b0\u0001\u0000\u0000\u0000\u06b5"+
		"\u06b2\u0001\u0000\u0000\u0000\u06b5\u06b3\u0001\u0000\u0000\u0000\u06b6"+
		"\u06b7\u0001\u0000\u0000\u0000\u06b7\u06b9\u0003\u014c\u00a6\u0000\u06b8"+
		"\u06ba\u0005t\u0000\u0000\u06b9\u06b8\u0001\u0000\u0000\u0000\u06b9\u06ba"+
		"\u0001\u0000\u0000\u0000\u06ba\u0701\u0001\u0000\u0000\u0000\u06bb\u06bd"+
		"\u0005\u0316\u0000\u0000\u06bc\u06be\u0003\u014c\u00a6\u0000\u06bd\u06bc"+
		"\u0001\u0000\u0000\u0000\u06bd\u06be\u0001\u0000\u0000\u0000\u06be\u0701"+
		"\u0001\u0000\u0000\u0000\u06bf\u06c1\u0005\u0331\u0000\u0000\u06c0\u06c2"+
		"\u0003\u014c\u00a6\u0000\u06c1\u06c0\u0001\u0000\u0000\u0000\u06c1\u06c2"+
		"\u0001\u0000\u0000\u0000\u06c2\u06c4\u0001\u0000\u0000\u0000\u06c3\u06c5"+
		"\u0003\u012e\u0097\u0000\u06c4\u06c3\u0001\u0000\u0000\u0000\u06c4\u06c5"+
		"\u0001\u0000\u0000\u0000\u06c5\u0701\u0001\u0000\u0000\u0000\u06c6\u0701"+
		"\u0005\u00c2\u0000\u0000\u06c7\u06c9\u0005\u02e7\u0000\u0000\u06c8\u06ca"+
		"\u0003\u0132\u0099\u0000\u06c9\u06c8\u0001\u0000\u0000\u0000\u06c9\u06ca"+
		"\u0001\u0000\u0000\u0000\u06ca\u0701\u0001\u0000\u0000\u0000\u06cb\u0701"+
		"\u0007&\u0000\u0000\u06cc\u06ce\u0005\u02e8\u0000\u0000\u06cd\u06cf\u0003"+
		"\u0132\u0099\u0000\u06ce\u06cd\u0001\u0000\u0000\u0000\u06ce\u06cf\u0001"+
		"\u0000\u0000\u0000\u06cf\u0701\u0001\u0000\u0000\u0000\u06d0\u06d2\u0005"+
		"\u00c3\u0000\u0000\u06d1\u06d3\u0003\u0132\u0099\u0000\u06d2\u06d1\u0001"+
		"\u0000\u0000\u0000\u06d2\u06d3\u0001\u0000\u0000\u0000\u06d3\u0701\u0001"+
		"\u0000\u0000\u0000\u06d4\u0701\u0005\u02eb\u0000\u0000\u06d5\u06d7\u0005"+
		"w\u0000\u0000\u06d6\u06d8\u0003\u014c\u00a6\u0000\u06d7\u06d6\u0001\u0000"+
		"\u0000\u0000\u06d7\u06d8\u0001\u0000\u0000\u0000\u06d8\u0701\u0001\u0000"+
		"\u0000\u0000\u06d9\u0701\u0007-\u0000\u0000\u06da\u06db\u0005\u018a\u0000"+
		"\u0000\u06db\u0701\u0005\u0316\u0000\u0000\u06dc\u06de\u0007.\u0000\u0000"+
		"\u06dd\u06dc\u0001\u0000\u0000\u0000\u06dd\u06de\u0001\u0000\u0000\u0000"+
		"\u06de\u06e0\u0001\u0000\u0000\u0000\u06df\u06e1\u0003\u0134\u009a\u0000"+
		"\u06e0\u06df\u0001\u0000\u0000\u0000\u06e0\u06e1\u0001\u0000\u0000\u0000"+
		"\u06e1\u0701\u0001\u0000\u0000\u0000\u06e2\u06e4\u0005\u02ed\u0000\u0000"+
		"\u06e3\u06e5\u0003\u0134\u009a\u0000\u06e4\u06e3\u0001\u0000\u0000\u0000"+
		"\u06e4\u06e5\u0001\u0000\u0000\u0000\u06e5\u0701\u0001\u0000\u0000\u0000"+
		"\u06e6\u06e8\u0005\u02e2\u0000\u0000\u06e7\u06e9\u0003\u014c\u00a6\u0000"+
		"\u06e8\u06e7\u0001\u0000\u0000\u0000\u06e8\u06e9\u0001\u0000\u0000\u0000"+
		"\u06e9\u06eb\u0001\u0000\u0000\u0000\u06ea\u06ec\u0003\u0134\u009a\u0000"+
		"\u06eb\u06ea\u0001\u0000\u0000\u0000\u06eb\u06ec\u0001\u0000\u0000\u0000"+
		"\u06ec\u0701\u0001\u0000\u0000\u0000\u06ed\u06ef\u0005\u01b8\u0000\u0000"+
		"\u06ee\u06f0\u0003\u0134\u009a\u0000\u06ef\u06ee\u0001\u0000\u0000\u0000"+
		"\u06ef\u06f0\u0001\u0000\u0000\u0000\u06f0\u0701\u0001\u0000\u0000\u0000"+
		"\u06f1\u06f3\u0005\u018c\u0000\u0000\u06f2\u06f4\u0003\u0134\u009a\u0000"+
		"\u06f3\u06f2\u0001\u0000\u0000\u0000\u06f3\u06f4\u0001\u0000\u0000\u0000"+
		"\u06f4\u0701\u0001\u0000\u0000\u0000\u06f5\u06f6\u0005\u00f5\u0000\u0000"+
		"\u06f6\u06f8\u0003\u0128\u0094\u0000\u06f7\u06f9\u0003\u0134\u009a\u0000"+
		"\u06f8\u06f7\u0001\u0000\u0000\u0000\u06f8\u06f9\u0001\u0000\u0000\u0000"+
		"\u06f9\u0701\u0001\u0000\u0000\u0000\u06fa\u06fb\u0005\u0285\u0000\u0000"+
		"\u06fb\u06fd\u0003\u0128\u0094\u0000\u06fc\u06fe\u0003\u0134\u009a\u0000"+
		"\u06fd\u06fc\u0001\u0000\u0000\u0000\u06fd\u06fe\u0001\u0000\u0000\u0000"+
		"\u06fe\u0701\u0001\u0000\u0000\u0000\u06ff\u0701\u0007/\u0000\u0000\u0700"+
		"\u066d\u0001\u0000\u0000\u0000\u0700\u0679\u0001\u0000\u0000\u0000\u0700"+
		"\u0681\u0001\u0000\u0000\u0000\u0700\u0689\u0001\u0000\u0000\u0000\u0700"+
		"\u068d\u0001\u0000\u0000\u0000\u0700\u068e\u0001\u0000\u0000\u0000\u0700"+
		"\u0697\u0001\u0000\u0000\u0000\u0700\u069f\u0001\u0000\u0000\u0000\u0700"+
		"\u06a0\u0001\u0000\u0000\u0000\u0700\u06a7\u0001\u0000\u0000\u0000\u0700"+
		"\u06b5\u0001\u0000\u0000\u0000\u0700\u06bb\u0001\u0000\u0000\u0000\u0700"+
		"\u06bf\u0001\u0000\u0000\u0000\u0700\u06c6\u0001\u0000\u0000\u0000\u0700"+
		"\u06c7\u0001\u0000\u0000\u0000\u0700\u06cb\u0001\u0000\u0000\u0000\u0700"+
		"\u06cc\u0001\u0000\u0000\u0000\u0700\u06d0\u0001\u0000\u0000\u0000\u0700"+
		"\u06d4\u0001\u0000\u0000\u0000\u0700\u06d5\u0001\u0000\u0000\u0000\u0700"+
		"\u06d9\u0001\u0000\u0000\u0000\u0700\u06da\u0001\u0000\u0000\u0000\u0700"+
		"\u06dd\u0001\u0000\u0000\u0000\u0700\u06e2\u0001\u0000\u0000\u0000\u0700"+
		"\u06e6\u0001\u0000\u0000\u0000\u0700\u06ed\u0001\u0000\u0000\u0000\u0700"+
		"\u06f1\u0001\u0000\u0000\u0000\u0700\u06f5\u0001\u0000\u0000\u0000\u0700"+
		"\u06fa\u0001\u0000\u0000\u0000\u0700\u06ff\u0001\u0000\u0000\u0000\u0701"+
		"\u0127\u0001\u0000\u0000\u0000\u0702\u0703\u0005\u001d\u0000\u0000\u0703"+
		"\u0708\u0003\u012a\u0095\u0000\u0704\u0705\u0005#\u0000\u0000\u0705\u0707"+
		"\u0003\u012a\u0095\u0000\u0706\u0704\u0001\u0000\u0000\u0000\u0707\u070a"+
		"\u0001\u0000\u0000\u0000\u0708\u0706\u0001\u0000\u0000\u0000\u0708\u0709"+
		"\u0001\u0000\u0000\u0000\u0709\u070b\u0001\u0000\u0000\u0000\u070a\u0708"+
		"\u0001\u0000\u0000\u0000\u070b\u070c\u0005\u001e\u0000\u0000\u070c\u0129"+
		"\u0001\u0000\u0000\u0000\u070d\u0711\u0003\u0006\u0003\u0000\u070e\u0711"+
		"\u0005\u035b\u0000\u0000\u070f\u0711\u0005\u035c\u0000\u0000\u0710\u070d"+
		"\u0001\u0000\u0000\u0000\u0710\u070e\u0001\u0000\u0000\u0000\u0710\u070f"+
		"\u0001\u0000\u0000\u0000\u0711\u012b\u0001\u0000\u0000\u0000\u0712\u0715"+
		"\u0003\u0006\u0003\u0000\u0713\u0715\u0005\u035b\u0000\u0000\u0714\u0712"+
		"\u0001\u0000\u0000\u0000\u0714\u0713\u0001\u0000\u0000\u0000\u0715\u012d"+
		"\u0001\u0000\u0000\u0000\u0716\u0718\u00070\u0000\u0000\u0717\u0716\u0001"+
		"\u0000\u0000\u0000\u0718\u0719\u0001\u0000\u0000\u0000\u0719\u0717\u0001"+
		"\u0000\u0000\u0000\u0719\u071a\u0001\u0000\u0000\u0000\u071a\u012f\u0001"+
		"\u0000\u0000\u0000\u071b\u071c\u0005\u001d\u0000\u0000\u071c\u071d\u0005"+
		"\u0357\u0000\u0000\u071d\u071e\u0005#\u0000\u0000\u071e\u071f\u0005\u0357"+
		"\u0000\u0000\u071f\u0720\u0005\u001e\u0000\u0000\u0720\u0131\u0001\u0000"+
		"\u0000\u0000\u0721\u0722\u0005\u001d\u0000\u0000\u0722\u0723\u0005\u0357"+
		"\u0000\u0000\u0723\u0724\u0005\u001e\u0000\u0000\u0724\u0133\u0001\u0000"+
		"\u0000\u0000\u0725\u0734\u0003\u0136\u009b\u0000\u0726\u0734\u0003\u0138"+
		"\u009c\u0000\u0727\u0734\u0005\u007f\u0000\u0000\u0728\u0729\u0003\u013a"+
		"\u009d\u0000\u0729\u072b\u0003D\"\u0000\u072a\u072c\u0005t\u0000\u0000"+
		"\u072b\u072a\u0001\u0000\u0000\u0000\u072b\u072c\u0001\u0000\u0000\u0000"+
		"\u072c\u0734\u0001\u0000\u0000\u0000\u072d\u0731\u0005t\u0000\u0000\u072e"+
		"\u072f\u0003\u013a\u009d\u0000\u072f\u0730\u0003D\"\u0000\u0730\u0732"+
		"\u0001\u0000\u0000\u0000\u0731\u072e\u0001\u0000\u0000\u0000\u0731\u0732"+
		"\u0001\u0000\u0000\u0000\u0732\u0734\u0001\u0000\u0000\u0000\u0733\u0725"+
		"\u0001\u0000\u0000\u0000\u0733\u0726\u0001\u0000\u0000\u0000\u0733\u0727"+
		"\u0001\u0000\u0000\u0000\u0733\u0728\u0001\u0000\u0000\u0000\u0733\u072d"+
		"\u0001\u0000\u0000\u0000\u0734\u0135\u0001\u0000\u0000\u0000\u0735\u0737"+
		"\u0005e\u0000\u0000\u0736\u0738\u0005t\u0000\u0000\u0737\u0736\u0001\u0000"+
		"\u0000\u0000\u0737\u0738\u0001\u0000\u0000\u0000\u0738\u073c\u0001\u0000"+
		"\u0000\u0000\u0739\u073a\u0005t\u0000\u0000\u073a\u073c\u0005e\u0000\u0000"+
		"\u073b\u0735\u0001\u0000\u0000\u0000\u073b\u0739\u0001\u0000\u0000\u0000"+
		"\u073c\u0137\u0001\u0000\u0000\u0000\u073d\u073f\u0005\u02fe\u0000\u0000"+
		"\u073e\u0740\u0005t\u0000\u0000\u073f\u073e\u0001\u0000\u0000\u0000\u073f"+
		"\u0740\u0001\u0000\u0000\u0000\u0740\u0744\u0001\u0000\u0000\u0000\u0741"+
		"\u0742\u0005t\u0000\u0000\u0742\u0744\u0005\u02fe\u0000\u0000\u0743\u073d"+
		"\u0001\u0000\u0000\u0000\u0743\u0741\u0001\u0000\u0000\u0000\u0744\u0139"+
		"\u0001\u0000\u0000\u0000\u0745\u0746\u00071\u0000\u0000\u0746\u0749\u0005"+
		"\u0285\u0000\u0000\u0747\u0749\u0005\u008e\u0000\u0000\u0748\u0745\u0001"+
		"\u0000\u0000\u0000\u0748\u0747\u0001\u0000\u0000\u0000\u0749\u013b\u0001"+
		"\u0000\u0000\u0000\u074a\u074c\u0005\u00cd\u0000\u0000\u074b\u074a\u0001"+
		"\u0000\u0000\u0000\u074b\u074c\u0001\u0000\u0000\u0000\u074c\u074d\u0001"+
		"\u0000\u0000\u0000\u074d\u074f\u0005\u0098\u0000\u0000\u074e\u0750\u0005"+
		"\u0016\u0000\u0000\u074f\u074e\u0001\u0000\u0000\u0000\u074f\u0750\u0001"+
		"\u0000\u0000\u0000\u0750\u0751\u0001\u0000\u0000\u0000\u0751\u0752\u0003"+
		"\u0016\u000b\u0000\u0752\u013d\u0001\u0000\u0000\u0000\u0753\u0755\u0005"+
		"\u00cd\u0000\u0000\u0754\u0753\u0001\u0000\u0000\u0000\u0754\u0755\u0001"+
		"\u0000\u0000\u0000\u0755\u0756\u0001\u0000\u0000\u0000\u0756\u0758\u0005"+
		"\u00ee\u0000\u0000\u0757\u0759\u0005\u0016\u0000\u0000\u0758\u0757\u0001"+
		"\u0000\u0000\u0000\u0758\u0759\u0001\u0000\u0000\u0000\u0759\u075a\u0001"+
		"\u0000\u0000\u0000\u075a\u075b\u0003\u0006\u0003\u0000\u075b\u013f\u0001"+
		"\u0000\u0000\u0000\u075c\u075e\u0005\u00cd\u0000\u0000\u075d\u075c\u0001"+
		"\u0000\u0000\u0000\u075d\u075e\u0001\u0000\u0000\u0000\u075e\u075f\u0001"+
		"\u0000\u0000\u0000\u075f\u0761\u0003\u013a\u009d\u0000\u0760\u0762\u0005"+
		"\u0016\u0000\u0000\u0761\u0760\u0001\u0000\u0000\u0000\u0761\u0762\u0001"+
		"\u0000\u0000\u0000\u0762\u0763\u0001\u0000\u0000\u0000\u0763\u0764\u0003"+
		"D\"\u0000\u0764\u0141\u0001\u0000\u0000\u0000\u0765\u076b\u00072\u0000"+
		"\u0000\u0766\u0768\u0005\u001d\u0000\u0000\u0767\u0769\u0005\u0357\u0000"+
		"\u0000\u0768\u0767\u0001\u0000\u0000\u0000\u0768\u0769\u0001\u0000\u0000"+
		"\u0000\u0769\u076a\u0001\u0000\u0000\u0000\u076a\u076c\u0005\u001e\u0000"+
		"\u0000\u076b\u0766\u0001\u0000\u0000\u0000\u076b\u076c\u0001\u0000\u0000"+
		"\u0000\u076c\u0143\u0001\u0000\u0000\u0000\u076d\u076e\u00073\u0000\u0000"+
		"\u076e\u0145\u0001\u0000\u0000\u0000\u076f\u0770\u00074\u0000\u0000\u0770"+
		"\u0147\u0001\u0000\u0000\u0000\u0771\u0772\u00075\u0000\u0000\u0772\u0149"+
		"\u0001\u0000\u0000\u0000\u0773\u0774\u00076\u0000\u0000\u0774\u014b\u0001"+
		"\u0000\u0000\u0000\u0775\u0776\u0005\u001d\u0000\u0000\u0776\u0777\u0005"+
		"\u0357\u0000\u0000\u0777\u0778\u0005\u001e\u0000\u0000\u0778\u014d\u0001"+
		"\u0000\u0000\u0000\u0779\u077a\u0003\u013a\u009d\u0000\u077a\u077b\u0003"+
		"D\"\u0000\u077b\u014f\u0001\u0000\u0000\u0000\u077c\u077f\u0005\u0098"+
		"\u0000\u0000\u077d\u0780\u0003\u0016\u000b\u0000\u077e\u0780\u0003\u0000"+
		"\u0000\u0000\u077f\u077d\u0001\u0000\u0000\u0000\u077f\u077e\u0001\u0000"+
		"\u0000\u0000\u0780\u0151\u0001\u0000\u0000\u0000\u0781\u078a\u0005\u001d"+
		"\u0000\u0000\u0782\u0787\u0003\u0018\f\u0000\u0783\u0784\u0005#\u0000"+
		"\u0000\u0784\u0786\u0003\u0018\f\u0000\u0785\u0783\u0001\u0000\u0000\u0000"+
		"\u0786\u0789\u0001\u0000\u0000\u0000\u0787\u0785\u0001\u0000\u0000\u0000"+
		"\u0787\u0788\u0001\u0000\u0000\u0000\u0788\u078b\u0001\u0000\u0000\u0000"+
		"\u0789\u0787\u0001\u0000\u0000\u0000\u078a\u0782\u0001\u0000\u0000\u0000"+
		"\u078a\u078b\u0001\u0000\u0000\u0000\u078b\u078c\u0001\u0000\u0000\u0000"+
		"\u078c\u078d\u0005\u001e\u0000\u0000\u078d\u0153\u0001\u0000\u0000\u0000"+
		"\u078e\u078f\u0005\u0143\u0000\u0000\u078f\u0790\u0005\u01de\u0000\u0000"+
		"\u0790\u0791\u0005\u0101\u0000\u0000\u0791\u0155\u0001\u0000\u0000\u0000"+
		"\u0792\u0793\u0005\u0143\u0000\u0000\u0793\u0794\u0005\u0101\u0000\u0000"+
		"\u0794\u0157\u0001\u0000\u0000\u0000\u0795\u0796\u0005\u0357\u0000\u0000"+
		"\u0796\u0159\u0001\u0000\u0000\u0000\u0797\u0798\u0003\u0018\f\u0000\u0798"+
		"\u015b\u0001\u0000\u0000\u0000\u0799\u079a\u0003\u0018\f\u0000\u079a\u015d"+
		"\u0001\u0000\u0000\u0000\u079b\u079c\u0003\u0018\f\u0000\u079c\u015f\u0001"+
		"\u0000\u0000\u0000\u079d\u079e\u00077\u0000\u0000\u079e\u0161\u0001\u0000"+
		"\u0000\u0000\u079f\u07a0\u00078\u0000\u0000\u07a0\u0163\u0001\u0000\u0000"+
		"\u0000\u07a1\u07a2\u0005\u011a\u0000\u0000\u07a2\u07a3\u0005\u0089\u0000"+
		"\u0000\u07a3\u07a4\u0003\u0006\u0003\u0000\u07a4\u0165\u0001\u0000\u0000"+
		"\u0000\u00db\u0171\u0176\u017a\u017d\u0185\u0188\u018c\u018f\u0193\u019b"+
		"\u01a7\u01b6\u01bc\u01c1\u01c7\u01d0\u01d7\u01e5\u01ee\u01f3\u01f8\u01fa"+
		"\u0207\u0213\u0219\u0220\u022c\u023e\u0240\u0242\u0247\u024d\u024f\u0254"+
		"\u025f\u0266\u026d\u027c\u0284\u028c\u02a8\u02af\u02b3\u02ba\u02c2\u02cb"+
		"\u02d0\u02dc\u02e9\u02eb\u02fa\u0314\u0316\u031f\u0326\u032f\u0336\u0344"+
		"\u034a\u034e\u0354\u0383\u0385\u0393\u0397\u039f\u03a5\u03b4\u03b7\u03bc"+
		"\u03c4\u03c6\u03cf\u03d7\u03db\u03e2\u03ea\u03ef\u03f6\u03f9\u0400\u0407"+
		"\u040b\u040e\u0412\u041b\u0422\u0425\u0429\u044b\u0454\u0458\u0461\u0464"+
		"\u0467\u046a\u0471\u047f\u0495\u049a\u04a3\u04ab\u04b2\u04b6\u04b9\u04bd"+
		"\u04cd\u04d1\u04da\u04e6\u04e9\u04ed\u04f2\u04f8\u0504\u050e\u051c\u0520"+
		"\u0530\u0534\u0538\u053b\u053f\u0542\u0549\u054d\u0552\u055a\u055c\u056c"+
		"\u0577\u057b\u058b\u0590\u0598\u059b\u05a5\u05aa\u05b6\u05b9\u05c3\u05c9"+
		"\u05cd\u05d0\u05d4\u05da\u05dd\u05e3\u05ec\u05f0\u0613\u061b\u0621\u0636"+
		"\u063a\u063f\u0642\u0663\u0668\u066b\u066f\u0672\u0677\u0679\u067c\u067f"+
		"\u0684\u0687\u068b\u0690\u0693\u0697\u069a\u069d\u06a2\u06a7\u06ab\u06b5"+
		"\u06b9\u06bd\u06c1\u06c4\u06c9\u06ce\u06d2\u06d7\u06dd\u06e0\u06e4\u06e8"+
		"\u06eb\u06ef\u06f3\u06f8\u06fd\u0700\u0708\u0710\u0714\u0719\u072b\u0731"+
		"\u0733\u0737\u073b\u073f\u0743\u0748\u074b\u074f\u0754\u0758\u075d\u0761"+
		"\u0768\u076b\u077f\u0787\u078a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}