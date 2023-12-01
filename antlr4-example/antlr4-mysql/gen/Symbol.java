// Generated from /home/arvin/mywork/program-compilation/antlr4-example/antlr4-mysql/src/main/antlr4/imports/Symbol.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue", "this-escape"})
public class Symbol extends Lexer {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		AND_=1, OR_=2, NOT_=3, TILDE_=4, VERTICAL_BAR_=5, AMPERSAND_=6, SIGNED_LEFT_SHIFT_=7, 
		SIGNED_RIGHT_SHIFT_=8, CARET_=9, MOD_=10, COLON_=11, PLUS_=12, MINUS_=13, 
		ASTERISK_=14, SLASH_=15, BACKSLASH_=16, DOT_=17, DOT_ASTERISK_=18, SAFE_EQ_=19, 
		DEQ_=20, EQ_=21, NEQ_=22, GT_=23, GTE_=24, LT_=25, LTE_=26, POUND_=27, 
		LP_=28, RP_=29, LBE_=30, RBE_=31, LBT_=32, RBT_=33, COMMA_=34, DQ_=35, 
		SQ_=36, BQ_=37, QUESTION_=38, AT_=39, SEMI_=40, ASSIGNMENT_=41, JSON_SEPARATOR=42, 
		JSON_UNQUOTED_SEPARATOR=43;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	private static String[] makeRuleNames() {
		return new String[] {
			"AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", "SIGNED_LEFT_SHIFT_", 
			"SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", "PLUS_", "MINUS_", 
			"ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", "SAFE_EQ_", 
			"DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", "LP_", 
			"RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", "BQ_", 
			"QUESTION_", "AT_", "SEMI_", "ASSIGNMENT_", "JSON_SEPARATOR", "JSON_UNQUOTED_SEPARATOR"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'&&'", "'||'", "'!'", "'~'", "'|'", "'&'", "'<<'", "'>>'", "'^'", 
			"'%'", "':'", "'+'", "'-'", "'*'", "'/'", "'\\'", "'.'", "'.*'", "'<=>'", 
			"'=='", "'='", null, "'>'", "'>='", "'<'", "'<='", "'#'", "'('", "')'", 
			"'{'", "'}'", "'['", "']'", "','", "'\"'", "'''", "'`'", "'?'", "'@'", 
			"';'", "':='", "'->'", "'->>'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, "AND_", "OR_", "NOT_", "TILDE_", "VERTICAL_BAR_", "AMPERSAND_", 
			"SIGNED_LEFT_SHIFT_", "SIGNED_RIGHT_SHIFT_", "CARET_", "MOD_", "COLON_", 
			"PLUS_", "MINUS_", "ASTERISK_", "SLASH_", "BACKSLASH_", "DOT_", "DOT_ASTERISK_", 
			"SAFE_EQ_", "DEQ_", "EQ_", "NEQ_", "GT_", "GTE_", "LT_", "LTE_", "POUND_", 
			"LP_", "RP_", "LBE_", "RBE_", "LBT_", "RBT_", "COMMA_", "DQ_", "SQ_", 
			"BQ_", "QUESTION_", "AT_", "SEMI_", "ASSIGNMENT_", "JSON_SEPARATOR", 
			"JSON_UNQUOTED_SEPARATOR"
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


	public Symbol(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Symbol.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public String[] getChannelNames() { return channelNames; }

	@Override
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\u0004\u0000+\u00bf\u0006\uffff\uffff\u0002\u0000\u0007\u0000\u0002\u0001"+
		"\u0007\u0001\u0002\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004"+
		"\u0007\u0004\u0002\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007"+
		"\u0007\u0007\u0002\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b"+
		"\u0007\u000b\u0002\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002"+
		"\u000f\u0007\u000f\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002"+
		"\u0012\u0007\u0012\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002"+
		"\u0015\u0007\u0015\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002"+
		"\u0018\u0007\u0018\u0002\u0019\u0007\u0019\u0002\u001a\u0007\u001a\u0002"+
		"\u001b\u0007\u001b\u0002\u001c\u0007\u001c\u0002\u001d\u0007\u001d\u0002"+
		"\u001e\u0007\u001e\u0002\u001f\u0007\u001f\u0002 \u0007 \u0002!\u0007"+
		"!\u0002\"\u0007\"\u0002#\u0007#\u0002$\u0007$\u0002%\u0007%\u0002&\u0007"+
		"&\u0002\'\u0007\'\u0002(\u0007(\u0002)\u0007)\u0002*\u0007*\u0001\u0000"+
		"\u0001\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002"+
		"\u0001\u0002\u0001\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0005"+
		"\u0001\u0005\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\b\u0001\b\u0001\t\u0001\t\u0001\n\u0001\n\u0001\u000b"+
		"\u0001\u000b\u0001\f\u0001\f\u0001\r\u0001\r\u0001\u000e\u0001\u000e\u0001"+
		"\u000f\u0001\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001"+
		"\u0013\u0001\u0013\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0001"+
		"\u0015\u0001\u0015\u0003\u0015\u008e\b\u0015\u0001\u0016\u0001\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019\u0001"+
		"\u0019\u0001\u0019\u0001\u001a\u0001\u001a\u0001\u001b\u0001\u001b\u0001"+
		"\u001c\u0001\u001c\u0001\u001d\u0001\u001d\u0001\u001e\u0001\u001e\u0001"+
		"\u001f\u0001\u001f\u0001 \u0001 \u0001!\u0001!\u0001\"\u0001\"\u0001#"+
		"\u0001#\u0001$\u0001$\u0001%\u0001%\u0001&\u0001&\u0001\'\u0001\'\u0001"+
		"(\u0001(\u0001(\u0001)\u0001)\u0001)\u0001*\u0001*\u0001*\u0001*\u0000"+
		"\u0000+\u0001\u0001\u0003\u0002\u0005\u0003\u0007\u0004\t\u0005\u000b"+
		"\u0006\r\u0007\u000f\b\u0011\t\u0013\n\u0015\u000b\u0017\f\u0019\r\u001b"+
		"\u000e\u001d\u000f\u001f\u0010!\u0011#\u0012%\u0013\'\u0014)\u0015+\u0016"+
		"-\u0017/\u00181\u00193\u001a5\u001b7\u001c9\u001d;\u001e=\u001f? A!C\""+
		"E#G$I%K&M\'O(Q)S*U+\u0001\u0000\u0000\u00bf\u0000\u0001\u0001\u0000\u0000"+
		"\u0000\u0000\u0003\u0001\u0000\u0000\u0000\u0000\u0005\u0001\u0000\u0000"+
		"\u0000\u0000\u0007\u0001\u0000\u0000\u0000\u0000\t\u0001\u0000\u0000\u0000"+
		"\u0000\u000b\u0001\u0000\u0000\u0000\u0000\r\u0001\u0000\u0000\u0000\u0000"+
		"\u000f\u0001\u0000\u0000\u0000\u0000\u0011\u0001\u0000\u0000\u0000\u0000"+
		"\u0013\u0001\u0000\u0000\u0000\u0000\u0015\u0001\u0000\u0000\u0000\u0000"+
		"\u0017\u0001\u0000\u0000\u0000\u0000\u0019\u0001\u0000\u0000\u0000\u0000"+
		"\u001b\u0001\u0000\u0000\u0000\u0000\u001d\u0001\u0000\u0000\u0000\u0000"+
		"\u001f\u0001\u0000\u0000\u0000\u0000!\u0001\u0000\u0000\u0000\u0000#\u0001"+
		"\u0000\u0000\u0000\u0000%\u0001\u0000\u0000\u0000\u0000\'\u0001\u0000"+
		"\u0000\u0000\u0000)\u0001\u0000\u0000\u0000\u0000+\u0001\u0000\u0000\u0000"+
		"\u0000-\u0001\u0000\u0000\u0000\u0000/\u0001\u0000\u0000\u0000\u00001"+
		"\u0001\u0000\u0000\u0000\u00003\u0001\u0000\u0000\u0000\u00005\u0001\u0000"+
		"\u0000\u0000\u00007\u0001\u0000\u0000\u0000\u00009\u0001\u0000\u0000\u0000"+
		"\u0000;\u0001\u0000\u0000\u0000\u0000=\u0001\u0000\u0000\u0000\u0000?"+
		"\u0001\u0000\u0000\u0000\u0000A\u0001\u0000\u0000\u0000\u0000C\u0001\u0000"+
		"\u0000\u0000\u0000E\u0001\u0000\u0000\u0000\u0000G\u0001\u0000\u0000\u0000"+
		"\u0000I\u0001\u0000\u0000\u0000\u0000K\u0001\u0000\u0000\u0000\u0000M"+
		"\u0001\u0000\u0000\u0000\u0000O\u0001\u0000\u0000\u0000\u0000Q\u0001\u0000"+
		"\u0000\u0000\u0000S\u0001\u0000\u0000\u0000\u0000U\u0001\u0000\u0000\u0000"+
		"\u0001W\u0001\u0000\u0000\u0000\u0003Z\u0001\u0000\u0000\u0000\u0005]"+
		"\u0001\u0000\u0000\u0000\u0007_\u0001\u0000\u0000\u0000\ta\u0001\u0000"+
		"\u0000\u0000\u000bc\u0001\u0000\u0000\u0000\re\u0001\u0000\u0000\u0000"+
		"\u000fh\u0001\u0000\u0000\u0000\u0011k\u0001\u0000\u0000\u0000\u0013m"+
		"\u0001\u0000\u0000\u0000\u0015o\u0001\u0000\u0000\u0000\u0017q\u0001\u0000"+
		"\u0000\u0000\u0019s\u0001\u0000\u0000\u0000\u001bu\u0001\u0000\u0000\u0000"+
		"\u001dw\u0001\u0000\u0000\u0000\u001fy\u0001\u0000\u0000\u0000!{\u0001"+
		"\u0000\u0000\u0000#}\u0001\u0000\u0000\u0000%\u0080\u0001\u0000\u0000"+
		"\u0000\'\u0084\u0001\u0000\u0000\u0000)\u0087\u0001\u0000\u0000\u0000"+
		"+\u008d\u0001\u0000\u0000\u0000-\u008f\u0001\u0000\u0000\u0000/\u0091"+
		"\u0001\u0000\u0000\u00001\u0094\u0001\u0000\u0000\u00003\u0096\u0001\u0000"+
		"\u0000\u00005\u0099\u0001\u0000\u0000\u00007\u009b\u0001\u0000\u0000\u0000"+
		"9\u009d\u0001\u0000\u0000\u0000;\u009f\u0001\u0000\u0000\u0000=\u00a1"+
		"\u0001\u0000\u0000\u0000?\u00a3\u0001\u0000\u0000\u0000A\u00a5\u0001\u0000"+
		"\u0000\u0000C\u00a7\u0001\u0000\u0000\u0000E\u00a9\u0001\u0000\u0000\u0000"+
		"G\u00ab\u0001\u0000\u0000\u0000I\u00ad\u0001\u0000\u0000\u0000K\u00af"+
		"\u0001\u0000\u0000\u0000M\u00b1\u0001\u0000\u0000\u0000O\u00b3\u0001\u0000"+
		"\u0000\u0000Q\u00b5\u0001\u0000\u0000\u0000S\u00b8\u0001\u0000\u0000\u0000"+
		"U\u00bb\u0001\u0000\u0000\u0000WX\u0005&\u0000\u0000XY\u0005&\u0000\u0000"+
		"Y\u0002\u0001\u0000\u0000\u0000Z[\u0005|\u0000\u0000[\\\u0005|\u0000\u0000"+
		"\\\u0004\u0001\u0000\u0000\u0000]^\u0005!\u0000\u0000^\u0006\u0001\u0000"+
		"\u0000\u0000_`\u0005~\u0000\u0000`\b\u0001\u0000\u0000\u0000ab\u0005|"+
		"\u0000\u0000b\n\u0001\u0000\u0000\u0000cd\u0005&\u0000\u0000d\f\u0001"+
		"\u0000\u0000\u0000ef\u0005<\u0000\u0000fg\u0005<\u0000\u0000g\u000e\u0001"+
		"\u0000\u0000\u0000hi\u0005>\u0000\u0000ij\u0005>\u0000\u0000j\u0010\u0001"+
		"\u0000\u0000\u0000kl\u0005^\u0000\u0000l\u0012\u0001\u0000\u0000\u0000"+
		"mn\u0005%\u0000\u0000n\u0014\u0001\u0000\u0000\u0000op\u0005:\u0000\u0000"+
		"p\u0016\u0001\u0000\u0000\u0000qr\u0005+\u0000\u0000r\u0018\u0001\u0000"+
		"\u0000\u0000st\u0005-\u0000\u0000t\u001a\u0001\u0000\u0000\u0000uv\u0005"+
		"*\u0000\u0000v\u001c\u0001\u0000\u0000\u0000wx\u0005/\u0000\u0000x\u001e"+
		"\u0001\u0000\u0000\u0000yz\u0005\\\u0000\u0000z \u0001\u0000\u0000\u0000"+
		"{|\u0005.\u0000\u0000|\"\u0001\u0000\u0000\u0000}~\u0005.\u0000\u0000"+
		"~\u007f\u0005*\u0000\u0000\u007f$\u0001\u0000\u0000\u0000\u0080\u0081"+
		"\u0005<\u0000\u0000\u0081\u0082\u0005=\u0000\u0000\u0082\u0083\u0005>"+
		"\u0000\u0000\u0083&\u0001\u0000\u0000\u0000\u0084\u0085\u0005=\u0000\u0000"+
		"\u0085\u0086\u0005=\u0000\u0000\u0086(\u0001\u0000\u0000\u0000\u0087\u0088"+
		"\u0005=\u0000\u0000\u0088*\u0001\u0000\u0000\u0000\u0089\u008a\u0005<"+
		"\u0000\u0000\u008a\u008e\u0005>\u0000\u0000\u008b\u008c\u0005!\u0000\u0000"+
		"\u008c\u008e\u0005=\u0000\u0000\u008d\u0089\u0001\u0000\u0000\u0000\u008d"+
		"\u008b\u0001\u0000\u0000\u0000\u008e,\u0001\u0000\u0000\u0000\u008f\u0090"+
		"\u0005>\u0000\u0000\u0090.\u0001\u0000\u0000\u0000\u0091\u0092\u0005>"+
		"\u0000\u0000\u0092\u0093\u0005=\u0000\u0000\u00930\u0001\u0000\u0000\u0000"+
		"\u0094\u0095\u0005<\u0000\u0000\u00952\u0001\u0000\u0000\u0000\u0096\u0097"+
		"\u0005<\u0000\u0000\u0097\u0098\u0005=\u0000\u0000\u00984\u0001\u0000"+
		"\u0000\u0000\u0099\u009a\u0005#\u0000\u0000\u009a6\u0001\u0000\u0000\u0000"+
		"\u009b\u009c\u0005(\u0000\u0000\u009c8\u0001\u0000\u0000\u0000\u009d\u009e"+
		"\u0005)\u0000\u0000\u009e:\u0001\u0000\u0000\u0000\u009f\u00a0\u0005{"+
		"\u0000\u0000\u00a0<\u0001\u0000\u0000\u0000\u00a1\u00a2\u0005}\u0000\u0000"+
		"\u00a2>\u0001\u0000\u0000\u0000\u00a3\u00a4\u0005[\u0000\u0000\u00a4@"+
		"\u0001\u0000\u0000\u0000\u00a5\u00a6\u0005]\u0000\u0000\u00a6B\u0001\u0000"+
		"\u0000\u0000\u00a7\u00a8\u0005,\u0000\u0000\u00a8D\u0001\u0000\u0000\u0000"+
		"\u00a9\u00aa\u0005\"\u0000\u0000\u00aaF\u0001\u0000\u0000\u0000\u00ab"+
		"\u00ac\u0005\'\u0000\u0000\u00acH\u0001\u0000\u0000\u0000\u00ad\u00ae"+
		"\u0005`\u0000\u0000\u00aeJ\u0001\u0000\u0000\u0000\u00af\u00b0\u0005?"+
		"\u0000\u0000\u00b0L\u0001\u0000\u0000\u0000\u00b1\u00b2\u0005@\u0000\u0000"+
		"\u00b2N\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005;\u0000\u0000\u00b4P"+
		"\u0001\u0000\u0000\u0000\u00b5\u00b6\u0005:\u0000\u0000\u00b6\u00b7\u0005"+
		"=\u0000\u0000\u00b7R\u0001\u0000\u0000\u0000\u00b8\u00b9\u0005-\u0000"+
		"\u0000\u00b9\u00ba\u0005>\u0000\u0000\u00baT\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bc\u0005-\u0000\u0000\u00bc\u00bd\u0005>\u0000\u0000\u00bd\u00be\u0005"+
		">\u0000\u0000\u00beV\u0001\u0000\u0000\u0000\u0002\u0000\u008d\u0000";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}