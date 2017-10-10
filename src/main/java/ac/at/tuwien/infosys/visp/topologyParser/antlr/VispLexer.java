// Generated from /projects/dsg_practical/code/topologyParser/src/main/java/ac/at/tuwien/infosys/visp/topologyParser/antlr/Visp.g4 by ANTLR 4.7
package ac.at.tuwien.infosys.visp.topologyParser.antlr;
import org.antlr.v4.runtime.Lexer;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.Token;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.misc.*;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VispLexer extends Lexer {
	static { RuntimeMetaData.checkVersion("4.7", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		T__24=25, T__25=26, NUMBER=27, LOCATION=28, SLASH=29, STAR=30, BOOLEAN=31, 
		IP_ADDRESS=32, OCTET=33, DIGIT=34, SOURCE=35, OPERATOR=36, SINK=37, SPLIT=38, 
		JOIN=39, STRING=40, ID=41, RESOURCEPOOL=42, INT=43, PREPROC=44, WS=45;
	public static String[] channelNames = {
		"DEFAULT_TOKEN_CHANNEL", "HIDDEN"
	};

	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "T__14", "T__15", "T__16", 
		"T__17", "T__18", "T__19", "T__20", "T__21", "T__22", "T__23", "T__24", 
		"T__25", "NUMBER", "LOCATION", "SLASH", "STAR", "BOOLEAN", "IP_ADDRESS", 
		"OCTET", "DIGIT", "SOURCE", "OPERATOR", "SINK", "SPLIT", "JOIN", "STRING", 
		"ID", "RESOURCEPOOL", "LETTER", "INT", "DOUBLE", "PREPROC", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "'('", "','", "')'", "'allowedLocations'", 
		"'concreteLocation'", "'inputFormat'", "'mechanism'", "'type'", "'outputFormat'", 
		"'stateful'", "'size'", "'small'", "'medium'", "'large'", "'expectedDuration'", 
		"'scalingCPUThreshold'", "'scalingMemoryThreshold'", "'queueThreshold'", 
		"'replicationAllowed'", "'pinned'", "'pathOrder'", "'lazyDeployment'", 
		"'compensation'", null, null, "'/'", "'*'", null, null, null, null, "'Source'", 
		"'Operator'", "'Sink'", "'Split'", "'Join'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "NUMBER", "LOCATION", "SLASH", "STAR", "BOOLEAN", "IP_ADDRESS", 
		"OCTET", "DIGIT", "SOURCE", "OPERATOR", "SINK", "SPLIT", "JOIN", "STRING", 
		"ID", "RESOURCEPOOL", "INT", "PREPROC", "WS"
	};
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


	public VispLexer(CharStream input) {
		super(input);
		_interp = new LexerATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@Override
	public String getGrammarFileName() { return "Visp.g4"; }

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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2/\u01f1\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3"+
		"\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3"+
		"\21\3\21\3\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3"+
		"\30\3\30\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3"+
		"\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\33\3\34\3\34\5"+
		"\34\u0166\n\34\3\35\3\35\3\35\3\35\3\36\3\36\3\37\3\37\3 \3 \3 \3 \3 "+
		"\3 \3 \3 \3 \5 \u0179\n \3!\3!\3!\3!\3!\3!\3!\3!\3\"\3\"\3\"\3\"\3\"\3"+
		"\"\3\"\3\"\5\"\u018b\n\"\3#\3#\3$\3$\3$\3$\3$\3$\3$\3%\3%\3%\3%\3%\3%"+
		"\3%\3%\3%\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3\'\3(\3(\3(\3(\3(\3)\3)"+
		"\3)\3)\7)\u01b3\n)\f)\16)\u01b6\13)\3)\3)\3)\6)\u01bb\n)\r)\16)\u01bc"+
		"\5)\u01bf\n)\3*\3*\3*\3*\7*\u01c5\n*\f*\16*\u01c8\13*\3+\3+\5+\u01cc\n"+
		"+\3,\3,\3-\6-\u01d1\n-\r-\16-\u01d2\3.\6.\u01d6\n.\r.\16.\u01d7\3.\3."+
		"\6.\u01dc\n.\r.\16.\u01dd\3/\3/\7/\u01e2\n/\f/\16/\u01e5\13/\3/\3/\3/"+
		"\3/\3\60\6\60\u01ec\n\60\r\60\16\60\u01ed\3\60\3\60\4\u01b4\u01e3\2\61"+
		"\3\3\5\4\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20"+
		"\37\21!\22#\23%\24\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37"+
		"= ?!A\"C#E$G%I&K\'M(O)Q*S+U,W\2Y-[\2]._/\3\2\6\4\2\62;aa\4\2C\\c|\3\2"+
		"\62;\5\2\13\f\17\17\"\"\2\u01ff\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2"+
		"\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2"+
		"\2\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2"+
		"\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2"+
		"\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2"+
		"\2\2\67\3\2\2\2\29\3\2\2\2\2;\3\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2"+
		"\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O"+
		"\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2U\3\2\2\2\2Y\3\2\2\2\2]\3\2\2\2\2_\3\2"+
		"\2\2\3a\3\2\2\2\5c\3\2\2\2\7e\3\2\2\2\tg\3\2\2\2\13i\3\2\2\2\rk\3\2\2"+
		"\2\17m\3\2\2\2\21~\3\2\2\2\23\u008f\3\2\2\2\25\u009b\3\2\2\2\27\u00a5"+
		"\3\2\2\2\31\u00aa\3\2\2\2\33\u00b7\3\2\2\2\35\u00c0\3\2\2\2\37\u00c5\3"+
		"\2\2\2!\u00cb\3\2\2\2#\u00d2\3\2\2\2%\u00d8\3\2\2\2\'\u00e9\3\2\2\2)\u00fd"+
		"\3\2\2\2+\u0114\3\2\2\2-\u0123\3\2\2\2/\u0136\3\2\2\2\61\u013d\3\2\2\2"+
		"\63\u0147\3\2\2\2\65\u0156\3\2\2\2\67\u0165\3\2\2\29\u0167\3\2\2\2;\u016b"+
		"\3\2\2\2=\u016d\3\2\2\2?\u0178\3\2\2\2A\u017a\3\2\2\2C\u018a\3\2\2\2E"+
		"\u018c\3\2\2\2G\u018e\3\2\2\2I\u0195\3\2\2\2K\u019e\3\2\2\2M\u01a3\3\2"+
		"\2\2O\u01a9\3\2\2\2Q\u01be\3\2\2\2S\u01c0\3\2\2\2U\u01cb\3\2\2\2W\u01cd"+
		"\3\2\2\2Y\u01d0\3\2\2\2[\u01d5\3\2\2\2]\u01df\3\2\2\2_\u01eb\3\2\2\2a"+
		"b\7}\2\2b\4\3\2\2\2cd\7\177\2\2d\6\3\2\2\2ef\7?\2\2f\b\3\2\2\2gh\7*\2"+
		"\2h\n\3\2\2\2ij\7.\2\2j\f\3\2\2\2kl\7+\2\2l\16\3\2\2\2mn\7c\2\2no\7n\2"+
		"\2op\7n\2\2pq\7q\2\2qr\7y\2\2rs\7g\2\2st\7f\2\2tu\7N\2\2uv\7q\2\2vw\7"+
		"e\2\2wx\7c\2\2xy\7v\2\2yz\7k\2\2z{\7q\2\2{|\7p\2\2|}\7u\2\2}\20\3\2\2"+
		"\2~\177\7e\2\2\177\u0080\7q\2\2\u0080\u0081\7p\2\2\u0081\u0082\7e\2\2"+
		"\u0082\u0083\7t\2\2\u0083\u0084\7g\2\2\u0084\u0085\7v\2\2\u0085\u0086"+
		"\7g\2\2\u0086\u0087\7N\2\2\u0087\u0088\7q\2\2\u0088\u0089\7e\2\2\u0089"+
		"\u008a\7c\2\2\u008a\u008b\7v\2\2\u008b\u008c\7k\2\2\u008c\u008d\7q\2\2"+
		"\u008d\u008e\7p\2\2\u008e\22\3\2\2\2\u008f\u0090\7k\2\2\u0090\u0091\7"+
		"p\2\2\u0091\u0092\7r\2\2\u0092\u0093\7w\2\2\u0093\u0094\7v\2\2\u0094\u0095"+
		"\7H\2\2\u0095\u0096\7q\2\2\u0096\u0097\7t\2\2\u0097\u0098\7o\2\2\u0098"+
		"\u0099\7c\2\2\u0099\u009a\7v\2\2\u009a\24\3\2\2\2\u009b\u009c\7o\2\2\u009c"+
		"\u009d\7g\2\2\u009d\u009e\7e\2\2\u009e\u009f\7j\2\2\u009f\u00a0\7c\2\2"+
		"\u00a0\u00a1\7p\2\2\u00a1\u00a2\7k\2\2\u00a2\u00a3\7u\2\2\u00a3\u00a4"+
		"\7o\2\2\u00a4\26\3\2\2\2\u00a5\u00a6\7v\2\2\u00a6\u00a7\7{\2\2\u00a7\u00a8"+
		"\7r\2\2\u00a8\u00a9\7g\2\2\u00a9\30\3\2\2\2\u00aa\u00ab\7q\2\2\u00ab\u00ac"+
		"\7w\2\2\u00ac\u00ad\7v\2\2\u00ad\u00ae\7r\2\2\u00ae\u00af\7w\2\2\u00af"+
		"\u00b0\7v\2\2\u00b0\u00b1\7H\2\2\u00b1\u00b2\7q\2\2\u00b2\u00b3\7t\2\2"+
		"\u00b3\u00b4\7o\2\2\u00b4\u00b5\7c\2\2\u00b5\u00b6\7v\2\2\u00b6\32\3\2"+
		"\2\2\u00b7\u00b8\7u\2\2\u00b8\u00b9\7v\2\2\u00b9\u00ba\7c\2\2\u00ba\u00bb"+
		"\7v\2\2\u00bb\u00bc\7g\2\2\u00bc\u00bd\7h\2\2\u00bd\u00be\7w\2\2\u00be"+
		"\u00bf\7n\2\2\u00bf\34\3\2\2\2\u00c0\u00c1\7u\2\2\u00c1\u00c2\7k\2\2\u00c2"+
		"\u00c3\7|\2\2\u00c3\u00c4\7g\2\2\u00c4\36\3\2\2\2\u00c5\u00c6\7u\2\2\u00c6"+
		"\u00c7\7o\2\2\u00c7\u00c8\7c\2\2\u00c8\u00c9\7n\2\2\u00c9\u00ca\7n\2\2"+
		"\u00ca \3\2\2\2\u00cb\u00cc\7o\2\2\u00cc\u00cd\7g\2\2\u00cd\u00ce\7f\2"+
		"\2\u00ce\u00cf\7k\2\2\u00cf\u00d0\7w\2\2\u00d0\u00d1\7o\2\2\u00d1\"\3"+
		"\2\2\2\u00d2\u00d3\7n\2\2\u00d3\u00d4\7c\2\2\u00d4\u00d5\7t\2\2\u00d5"+
		"\u00d6\7i\2\2\u00d6\u00d7\7g\2\2\u00d7$\3\2\2\2\u00d8\u00d9\7g\2\2\u00d9"+
		"\u00da\7z\2\2\u00da\u00db\7r\2\2\u00db\u00dc\7g\2\2\u00dc\u00dd\7e\2\2"+
		"\u00dd\u00de\7v\2\2\u00de\u00df\7g\2\2\u00df\u00e0\7f\2\2\u00e0\u00e1"+
		"\7F\2\2\u00e1\u00e2\7w\2\2\u00e2\u00e3\7t\2\2\u00e3\u00e4\7c\2\2\u00e4"+
		"\u00e5\7v\2\2\u00e5\u00e6\7k\2\2\u00e6\u00e7\7q\2\2\u00e7\u00e8\7p\2\2"+
		"\u00e8&\3\2\2\2\u00e9\u00ea\7u\2\2\u00ea\u00eb\7e\2\2\u00eb\u00ec\7c\2"+
		"\2\u00ec\u00ed\7n\2\2\u00ed\u00ee\7k\2\2\u00ee\u00ef\7p\2\2\u00ef\u00f0"+
		"\7i\2\2\u00f0\u00f1\7E\2\2\u00f1\u00f2\7R\2\2\u00f2\u00f3\7W\2\2\u00f3"+
		"\u00f4\7V\2\2\u00f4\u00f5\7j\2\2\u00f5\u00f6\7t\2\2\u00f6\u00f7\7g\2\2"+
		"\u00f7\u00f8\7u\2\2\u00f8\u00f9\7j\2\2\u00f9\u00fa\7q\2\2\u00fa\u00fb"+
		"\7n\2\2\u00fb\u00fc\7f\2\2\u00fc(\3\2\2\2\u00fd\u00fe\7u\2\2\u00fe\u00ff"+
		"\7e\2\2\u00ff\u0100\7c\2\2\u0100\u0101\7n\2\2\u0101\u0102\7k\2\2\u0102"+
		"\u0103\7p\2\2\u0103\u0104\7i\2\2\u0104\u0105\7O\2\2\u0105\u0106\7g\2\2"+
		"\u0106\u0107\7o\2\2\u0107\u0108\7q\2\2\u0108\u0109\7t\2\2\u0109\u010a"+
		"\7{\2\2\u010a\u010b\7V\2\2\u010b\u010c\7j\2\2\u010c\u010d\7t\2\2\u010d"+
		"\u010e\7g\2\2\u010e\u010f\7u\2\2\u010f\u0110\7j\2\2\u0110\u0111\7q\2\2"+
		"\u0111\u0112\7n\2\2\u0112\u0113\7f\2\2\u0113*\3\2\2\2\u0114\u0115\7s\2"+
		"\2\u0115\u0116\7w\2\2\u0116\u0117\7g\2\2\u0117\u0118\7w\2\2\u0118\u0119"+
		"\7g\2\2\u0119\u011a\7V\2\2\u011a\u011b\7j\2\2\u011b\u011c\7t\2\2\u011c"+
		"\u011d\7g\2\2\u011d\u011e\7u\2\2\u011e\u011f\7j\2\2\u011f\u0120\7q\2\2"+
		"\u0120\u0121\7n\2\2\u0121\u0122\7f\2\2\u0122,\3\2\2\2\u0123\u0124\7t\2"+
		"\2\u0124\u0125\7g\2\2\u0125\u0126\7r\2\2\u0126\u0127\7n\2\2\u0127\u0128"+
		"\7k\2\2\u0128\u0129\7e\2\2\u0129\u012a\7c\2\2\u012a\u012b\7v\2\2\u012b"+
		"\u012c\7k\2\2\u012c\u012d\7q\2\2\u012d\u012e\7p\2\2\u012e\u012f\7C\2\2"+
		"\u012f\u0130\7n\2\2\u0130\u0131\7n\2\2\u0131\u0132\7q\2\2\u0132\u0133"+
		"\7y\2\2\u0133\u0134\7g\2\2\u0134\u0135\7f\2\2\u0135.\3\2\2\2\u0136\u0137"+
		"\7r\2\2\u0137\u0138\7k\2\2\u0138\u0139\7p\2\2\u0139\u013a\7p\2\2\u013a"+
		"\u013b\7g\2\2\u013b\u013c\7f\2\2\u013c\60\3\2\2\2\u013d\u013e\7r\2\2\u013e"+
		"\u013f\7c\2\2\u013f\u0140\7v\2\2\u0140\u0141\7j\2\2\u0141\u0142\7Q\2\2"+
		"\u0142\u0143\7t\2\2\u0143\u0144\7f\2\2\u0144\u0145\7g\2\2\u0145\u0146"+
		"\7t\2\2\u0146\62\3\2\2\2\u0147\u0148\7n\2\2\u0148\u0149\7c\2\2\u0149\u014a"+
		"\7|\2\2\u014a\u014b\7{\2\2\u014b\u014c\7F\2\2\u014c\u014d\7g\2\2\u014d"+
		"\u014e\7r\2\2\u014e\u014f\7n\2\2\u014f\u0150\7q\2\2\u0150\u0151\7{\2\2"+
		"\u0151\u0152\7o\2\2\u0152\u0153\7g\2\2\u0153\u0154\7p\2\2\u0154\u0155"+
		"\7v\2\2\u0155\64\3\2\2\2\u0156\u0157\7e\2\2\u0157\u0158\7q\2\2\u0158\u0159"+
		"\7o\2\2\u0159\u015a\7r\2\2\u015a\u015b\7g\2\2\u015b\u015c\7p\2\2\u015c"+
		"\u015d\7u\2\2\u015d\u015e\7c\2\2\u015e\u015f\7v\2\2\u015f\u0160\7k\2\2"+
		"\u0160\u0161\7q\2\2\u0161\u0162\7p\2\2\u0162\66\3\2\2\2\u0163\u0166\5"+
		"[.\2\u0164\u0166\5Y-\2\u0165\u0163\3\2\2\2\u0165\u0164\3\2\2\2\u01668"+
		"\3\2\2\2\u0167\u0168\5A!\2\u0168\u0169\5;\36\2\u0169\u016a\5U+\2\u016a"+
		":\3\2\2\2\u016b\u016c\7\61\2\2\u016c<\3\2\2\2\u016d\u016e\7,\2\2\u016e"+
		">\3\2\2\2\u016f\u0170\7v\2\2\u0170\u0171\7t\2\2\u0171\u0172\7w\2\2\u0172"+
		"\u0179\7g\2\2\u0173\u0174\7h\2\2\u0174\u0175\7c\2\2\u0175\u0176\7n\2\2"+
		"\u0176\u0177\7u\2\2\u0177\u0179\7g\2\2\u0178\u016f\3\2\2\2\u0178\u0173"+
		"\3\2\2\2\u0179@\3\2\2\2\u017a\u017b\5C\"\2\u017b\u017c\7\60\2\2\u017c"+
		"\u017d\5C\"\2\u017d\u017e\7\60\2\2\u017e\u017f\5C\"\2\u017f\u0180\7\60"+
		"\2\2\u0180\u0181\5C\"\2\u0181B\3\2\2\2\u0182\u0183\5E#\2\u0183\u0184\5"+
		"E#\2\u0184\u0185\5E#\2\u0185\u018b\3\2\2\2\u0186\u0187\5E#\2\u0187\u0188"+
		"\5E#\2\u0188\u018b\3\2\2\2\u0189\u018b\5E#\2\u018a\u0182\3\2\2\2\u018a"+
		"\u0186\3\2\2\2\u018a\u0189\3\2\2\2\u018bD\3\2\2\2\u018c\u018d\4\62;\2"+
		"\u018dF\3\2\2\2\u018e\u018f\7U\2\2\u018f\u0190\7q\2\2\u0190\u0191\7w\2"+
		"\2\u0191\u0192\7t\2\2\u0192\u0193\7e\2\2\u0193\u0194\7g\2\2\u0194H\3\2"+
		"\2\2\u0195\u0196\7Q\2\2\u0196\u0197\7r\2\2\u0197\u0198\7g\2\2\u0198\u0199"+
		"\7t\2\2\u0199\u019a\7c\2\2\u019a\u019b\7v\2\2\u019b\u019c\7q\2\2\u019c"+
		"\u019d\7t\2\2\u019dJ\3\2\2\2\u019e\u019f\7U\2\2\u019f\u01a0\7k\2\2\u01a0"+
		"\u01a1\7p\2\2\u01a1\u01a2\7m\2\2\u01a2L\3\2\2\2\u01a3\u01a4\7U\2\2\u01a4"+
		"\u01a5\7r\2\2\u01a5\u01a6\7n\2\2\u01a6\u01a7\7k\2\2\u01a7\u01a8\7v\2\2"+
		"\u01a8N\3\2\2\2\u01a9\u01aa\7L\2\2\u01aa\u01ab\7q\2\2\u01ab\u01ac\7k\2"+
		"\2\u01ac\u01ad\7p\2\2\u01adP\3\2\2\2\u01ae\u01b4\7$\2\2\u01af\u01b0\7"+
		"^\2\2\u01b0\u01b3\7$\2\2\u01b1\u01b3\13\2\2\2\u01b2\u01af\3\2\2\2\u01b2"+
		"\u01b1\3\2\2\2\u01b3\u01b6\3\2\2\2\u01b4\u01b5\3\2\2\2\u01b4\u01b2\3\2"+
		"\2\2\u01b5\u01b7\3\2\2\2\u01b6\u01b4\3\2\2\2\u01b7\u01bf\7$\2\2\u01b8"+
		"\u01bb\5W,\2\u01b9\u01bb\t\2\2\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2"+
		"\2\u01bb\u01bc\3\2\2\2\u01bc\u01ba\3\2\2\2\u01bc\u01bd\3\2\2\2\u01bd\u01bf"+
		"\3\2\2\2\u01be\u01ae\3\2\2\2\u01be\u01ba\3\2\2\2\u01bfR\3\2\2\2\u01c0"+
		"\u01c1\7&\2\2\u01c1\u01c6\5W,\2\u01c2\u01c5\5W,\2\u01c3\u01c5\t\2\2\2"+
		"\u01c4\u01c2\3\2\2\2\u01c4\u01c3\3\2\2\2\u01c5\u01c8\3\2\2\2\u01c6\u01c4"+
		"\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7T\3\2\2\2\u01c8\u01c6\3\2\2\2\u01c9"+
		"\u01cc\5Q)\2\u01ca\u01cc\5=\37\2\u01cb\u01c9\3\2\2\2\u01cb\u01ca\3\2\2"+
		"\2\u01ccV\3\2\2\2\u01cd\u01ce\t\3\2\2\u01ceX\3\2\2\2\u01cf\u01d1\t\4\2"+
		"\2\u01d0\u01cf\3\2\2\2\u01d1\u01d2\3\2\2\2\u01d2\u01d0\3\2\2\2\u01d2\u01d3"+
		"\3\2\2\2\u01d3Z\3\2\2\2\u01d4\u01d6\4\62;\2\u01d5\u01d4\3\2\2\2\u01d6"+
		"\u01d7\3\2\2\2\u01d7\u01d5\3\2\2\2\u01d7\u01d8\3\2\2\2\u01d8\u01d9\3\2"+
		"\2\2\u01d9\u01db\7\60\2\2\u01da\u01dc\4\62;\2\u01db\u01da\3\2\2\2\u01dc"+
		"\u01dd\3\2\2\2\u01dd\u01db\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\\\3\2\2\2"+
		"\u01df\u01e3\7%\2\2\u01e0\u01e2\13\2\2\2\u01e1\u01e0\3\2\2\2\u01e2\u01e5"+
		"\3\2\2\2\u01e3\u01e4\3\2\2\2\u01e3\u01e1\3\2\2\2\u01e4\u01e6\3\2\2\2\u01e5"+
		"\u01e3\3\2\2\2\u01e6\u01e7\7\f\2\2\u01e7\u01e8\3\2\2\2\u01e8\u01e9\b/"+
		"\2\2\u01e9^\3\2\2\2\u01ea\u01ec\t\5\2\2\u01eb\u01ea\3\2\2\2\u01ec\u01ed"+
		"\3\2\2\2\u01ed\u01eb\3\2\2\2\u01ed\u01ee\3\2\2\2\u01ee\u01ef\3\2\2\2\u01ef"+
		"\u01f0\b\60\2\2\u01f0`\3\2\2\2\23\2\u0165\u0178\u018a\u01b2\u01b4\u01ba"+
		"\u01bc\u01be\u01c4\u01c6\u01cb\u01d2\u01d7\u01dd\u01e3\u01ed\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}