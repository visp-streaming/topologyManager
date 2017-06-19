// Generated from /projects/dsg_practical/code/VISP-TopologyParser/src/main/java/ac/at/tuwien/infosys/visp/topologyParser/antlr/Visp.g4 by ANTLR 4.7
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
		T__24=25, NUMBER=26, LOCATION=27, SLASH=28, STAR=29, BOOLEAN=30, IP_ADDRESS=31, 
		OCTET=32, DIGIT=33, SOURCE=34, OPERATOR=35, SINK=36, SPLIT=37, JOIN=38, 
		STRING=39, ID=40, RESOURCEPOOL=41, INT=42, PREPROC=43, WS=44;
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
		"NUMBER", "LOCATION", "SLASH", "STAR", "BOOLEAN", "IP_ADDRESS", "OCTET", 
		"DIGIT", "SOURCE", "OPERATOR", "SINK", "SPLIT", "JOIN", "STRING", "ID", 
		"RESOURCEPOOL", "LETTER", "INT", "DOUBLE", "PREPROC", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "'('", "','", "')'", "'allowedLocations'", 
		"'concreteLocation'", "'inputFormat'", "'mechanism'", "'type'", "'outputFormat'", 
		"'stateful'", "'size'", "'small'", "'medium'", "'large'", "'expectedDuration'", 
		"'scalingCPUThreshold'", "'scalingMemoryThreshold'", "'queueThreshold'", 
		"'replicationAllowed'", "'pinned'", "'pathOrder'", "'compensation'", null, 
		null, "'/'", "'*'", null, null, null, null, "'Source'", "'Operator'", 
		"'Sink'", "'Split'", "'Join'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, "NUMBER", "LOCATION", "SLASH", "STAR", "BOOLEAN", "IP_ADDRESS", 
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
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\2.\u01e0\b\1\4\2\t"+
		"\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3"+
		"\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\n"+
		"\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\13"+
		"\3\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\r\3\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3"+
		"\16\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\21\3\21\3"+
		"\21\3\21\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\23\3\23\3\23\3"+
		"\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3\23\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3"+
		"\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3\25\3"+
		"\25\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3\26\3"+
		"\26\3\26\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3\27\3"+
		"\27\3\27\3\27\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3"+
		"\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\31\3\32\3\32\3\32\3\32\3"+
		"\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\32\3\33\3\33\5\33\u0155\n\33"+
		"\3\34\3\34\3\34\3\34\3\35\3\35\3\36\3\36\3\37\3\37\3\37\3\37\3\37\3\37"+
		"\3\37\3\37\3\37\5\37\u0168\n\37\3 \3 \3 \3 \3 \3 \3 \3 \3!\3!\3!\3!\3"+
		"!\3!\3!\3!\5!\u017a\n!\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3$\3$\3$\3$\3$\3$"+
		"\3$\3$\3$\3%\3%\3%\3%\3%\3&\3&\3&\3&\3&\3&\3\'\3\'\3\'\3\'\3\'\3(\3(\3"+
		"(\3(\7(\u01a2\n(\f(\16(\u01a5\13(\3(\3(\3(\6(\u01aa\n(\r(\16(\u01ab\5"+
		"(\u01ae\n(\3)\3)\3)\3)\7)\u01b4\n)\f)\16)\u01b7\13)\3*\3*\5*\u01bb\n*"+
		"\3+\3+\3,\6,\u01c0\n,\r,\16,\u01c1\3-\6-\u01c5\n-\r-\16-\u01c6\3-\3-\6"+
		"-\u01cb\n-\r-\16-\u01cc\3.\3.\7.\u01d1\n.\f.\16.\u01d4\13.\3.\3.\3.\3"+
		".\3/\6/\u01db\n/\r/\16/\u01dc\3/\3/\4\u01a3\u01d2\2\60\3\3\5\4\7\5\t\6"+
		"\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22#\23%\24"+
		"\'\25)\26+\27-\30/\31\61\32\63\33\65\34\67\359\36;\37= ?!A\"C#E$G%I&K"+
		"\'M(O)Q*S+U\2W,Y\2[-].\3\2\5\3\2\62;\4\2C\\c|\5\2\13\f\17\17\"\"\2\u01ee"+
		"\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t\3\2\2\2\2\13\3\2\2\2\2\r\3\2"+
		"\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2\2\2\25\3\2\2\2\2\27\3\2\2\2"+
		"\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2\37\3\2\2\2\2!\3\2\2\2\2#\3\2"+
		"\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2+\3\2\2\2\2-\3\2\2\2\2/\3\2\2"+
		"\2\2\61\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2\29\3\2\2\2\2;\3"+
		"\2\2\2\2=\3\2\2\2\2?\3\2\2\2\2A\3\2\2\2\2C\3\2\2\2\2E\3\2\2\2\2G\3\2\2"+
		"\2\2I\3\2\2\2\2K\3\2\2\2\2M\3\2\2\2\2O\3\2\2\2\2Q\3\2\2\2\2S\3\2\2\2\2"+
		"W\3\2\2\2\2[\3\2\2\2\2]\3\2\2\2\3_\3\2\2\2\5a\3\2\2\2\7c\3\2\2\2\te\3"+
		"\2\2\2\13g\3\2\2\2\ri\3\2\2\2\17k\3\2\2\2\21|\3\2\2\2\23\u008d\3\2\2\2"+
		"\25\u0099\3\2\2\2\27\u00a3\3\2\2\2\31\u00a8\3\2\2\2\33\u00b5\3\2\2\2\35"+
		"\u00be\3\2\2\2\37\u00c3\3\2\2\2!\u00c9\3\2\2\2#\u00d0\3\2\2\2%\u00d6\3"+
		"\2\2\2\'\u00e7\3\2\2\2)\u00fb\3\2\2\2+\u0112\3\2\2\2-\u0121\3\2\2\2/\u0134"+
		"\3\2\2\2\61\u013b\3\2\2\2\63\u0145\3\2\2\2\65\u0154\3\2\2\2\67\u0156\3"+
		"\2\2\29\u015a\3\2\2\2;\u015c\3\2\2\2=\u0167\3\2\2\2?\u0169\3\2\2\2A\u0179"+
		"\3\2\2\2C\u017b\3\2\2\2E\u017d\3\2\2\2G\u0184\3\2\2\2I\u018d\3\2\2\2K"+
		"\u0192\3\2\2\2M\u0198\3\2\2\2O\u01ad\3\2\2\2Q\u01af\3\2\2\2S\u01ba\3\2"+
		"\2\2U\u01bc\3\2\2\2W\u01bf\3\2\2\2Y\u01c4\3\2\2\2[\u01ce\3\2\2\2]\u01da"+
		"\3\2\2\2_`\7}\2\2`\4\3\2\2\2ab\7\177\2\2b\6\3\2\2\2cd\7?\2\2d\b\3\2\2"+
		"\2ef\7*\2\2f\n\3\2\2\2gh\7.\2\2h\f\3\2\2\2ij\7+\2\2j\16\3\2\2\2kl\7c\2"+
		"\2lm\7n\2\2mn\7n\2\2no\7q\2\2op\7y\2\2pq\7g\2\2qr\7f\2\2rs\7N\2\2st\7"+
		"q\2\2tu\7e\2\2uv\7c\2\2vw\7v\2\2wx\7k\2\2xy\7q\2\2yz\7p\2\2z{\7u\2\2{"+
		"\20\3\2\2\2|}\7e\2\2}~\7q\2\2~\177\7p\2\2\177\u0080\7e\2\2\u0080\u0081"+
		"\7t\2\2\u0081\u0082\7g\2\2\u0082\u0083\7v\2\2\u0083\u0084\7g\2\2\u0084"+
		"\u0085\7N\2\2\u0085\u0086\7q\2\2\u0086\u0087\7e\2\2\u0087\u0088\7c\2\2"+
		"\u0088\u0089\7v\2\2\u0089\u008a\7k\2\2\u008a\u008b\7q\2\2\u008b\u008c"+
		"\7p\2\2\u008c\22\3\2\2\2\u008d\u008e\7k\2\2\u008e\u008f\7p\2\2\u008f\u0090"+
		"\7r\2\2\u0090\u0091\7w\2\2\u0091\u0092\7v\2\2\u0092\u0093\7H\2\2\u0093"+
		"\u0094\7q\2\2\u0094\u0095\7t\2\2\u0095\u0096\7o\2\2\u0096\u0097\7c\2\2"+
		"\u0097\u0098\7v\2\2\u0098\24\3\2\2\2\u0099\u009a\7o\2\2\u009a\u009b\7"+
		"g\2\2\u009b\u009c\7e\2\2\u009c\u009d\7j\2\2\u009d\u009e\7c\2\2\u009e\u009f"+
		"\7p\2\2\u009f\u00a0\7k\2\2\u00a0\u00a1\7u\2\2\u00a1\u00a2\7o\2\2\u00a2"+
		"\26\3\2\2\2\u00a3\u00a4\7v\2\2\u00a4\u00a5\7{\2\2\u00a5\u00a6\7r\2\2\u00a6"+
		"\u00a7\7g\2\2\u00a7\30\3\2\2\2\u00a8\u00a9\7q\2\2\u00a9\u00aa\7w\2\2\u00aa"+
		"\u00ab\7v\2\2\u00ab\u00ac\7r\2\2\u00ac\u00ad\7w\2\2\u00ad\u00ae\7v\2\2"+
		"\u00ae\u00af\7H\2\2\u00af\u00b0\7q\2\2\u00b0\u00b1\7t\2\2\u00b1\u00b2"+
		"\7o\2\2\u00b2\u00b3\7c\2\2\u00b3\u00b4\7v\2\2\u00b4\32\3\2\2\2\u00b5\u00b6"+
		"\7u\2\2\u00b6\u00b7\7v\2\2\u00b7\u00b8\7c\2\2\u00b8\u00b9\7v\2\2\u00b9"+
		"\u00ba\7g\2\2\u00ba\u00bb\7h\2\2\u00bb\u00bc\7w\2\2\u00bc\u00bd\7n\2\2"+
		"\u00bd\34\3\2\2\2\u00be\u00bf\7u\2\2\u00bf\u00c0\7k\2\2\u00c0\u00c1\7"+
		"|\2\2\u00c1\u00c2\7g\2\2\u00c2\36\3\2\2\2\u00c3\u00c4\7u\2\2\u00c4\u00c5"+
		"\7o\2\2\u00c5\u00c6\7c\2\2\u00c6\u00c7\7n\2\2\u00c7\u00c8\7n\2\2\u00c8"+
		" \3\2\2\2\u00c9\u00ca\7o\2\2\u00ca\u00cb\7g\2\2\u00cb\u00cc\7f\2\2\u00cc"+
		"\u00cd\7k\2\2\u00cd\u00ce\7w\2\2\u00ce\u00cf\7o\2\2\u00cf\"\3\2\2\2\u00d0"+
		"\u00d1\7n\2\2\u00d1\u00d2\7c\2\2\u00d2\u00d3\7t\2\2\u00d3\u00d4\7i\2\2"+
		"\u00d4\u00d5\7g\2\2\u00d5$\3\2\2\2\u00d6\u00d7\7g\2\2\u00d7\u00d8\7z\2"+
		"\2\u00d8\u00d9\7r\2\2\u00d9\u00da\7g\2\2\u00da\u00db\7e\2\2\u00db\u00dc"+
		"\7v\2\2\u00dc\u00dd\7g\2\2\u00dd\u00de\7f\2\2\u00de\u00df\7F\2\2\u00df"+
		"\u00e0\7w\2\2\u00e0\u00e1\7t\2\2\u00e1\u00e2\7c\2\2\u00e2\u00e3\7v\2\2"+
		"\u00e3\u00e4\7k\2\2\u00e4\u00e5\7q\2\2\u00e5\u00e6\7p\2\2\u00e6&\3\2\2"+
		"\2\u00e7\u00e8\7u\2\2\u00e8\u00e9\7e\2\2\u00e9\u00ea\7c\2\2\u00ea\u00eb"+
		"\7n\2\2\u00eb\u00ec\7k\2\2\u00ec\u00ed\7p\2\2\u00ed\u00ee\7i\2\2\u00ee"+
		"\u00ef\7E\2\2\u00ef\u00f0\7R\2\2\u00f0\u00f1\7W\2\2\u00f1\u00f2\7V\2\2"+
		"\u00f2\u00f3\7j\2\2\u00f3\u00f4\7t\2\2\u00f4\u00f5\7g\2\2\u00f5\u00f6"+
		"\7u\2\2\u00f6\u00f7\7j\2\2\u00f7\u00f8\7q\2\2\u00f8\u00f9\7n\2\2\u00f9"+
		"\u00fa\7f\2\2\u00fa(\3\2\2\2\u00fb\u00fc\7u\2\2\u00fc\u00fd\7e\2\2\u00fd"+
		"\u00fe\7c\2\2\u00fe\u00ff\7n\2\2\u00ff\u0100\7k\2\2\u0100\u0101\7p\2\2"+
		"\u0101\u0102\7i\2\2\u0102\u0103\7O\2\2\u0103\u0104\7g\2\2\u0104\u0105"+
		"\7o\2\2\u0105\u0106\7q\2\2\u0106\u0107\7t\2\2\u0107\u0108\7{\2\2\u0108"+
		"\u0109\7V\2\2\u0109\u010a\7j\2\2\u010a\u010b\7t\2\2\u010b\u010c\7g\2\2"+
		"\u010c\u010d\7u\2\2\u010d\u010e\7j\2\2\u010e\u010f\7q\2\2\u010f\u0110"+
		"\7n\2\2\u0110\u0111\7f\2\2\u0111*\3\2\2\2\u0112\u0113\7s\2\2\u0113\u0114"+
		"\7w\2\2\u0114\u0115\7g\2\2\u0115\u0116\7w\2\2\u0116\u0117\7g\2\2\u0117"+
		"\u0118\7V\2\2\u0118\u0119\7j\2\2\u0119\u011a\7t\2\2\u011a\u011b\7g\2\2"+
		"\u011b\u011c\7u\2\2\u011c\u011d\7j\2\2\u011d\u011e\7q\2\2\u011e\u011f"+
		"\7n\2\2\u011f\u0120\7f\2\2\u0120,\3\2\2\2\u0121\u0122\7t\2\2\u0122\u0123"+
		"\7g\2\2\u0123\u0124\7r\2\2\u0124\u0125\7n\2\2\u0125\u0126\7k\2\2\u0126"+
		"\u0127\7e\2\2\u0127\u0128\7c\2\2\u0128\u0129\7v\2\2\u0129\u012a\7k\2\2"+
		"\u012a\u012b\7q\2\2\u012b\u012c\7p\2\2\u012c\u012d\7C\2\2\u012d\u012e"+
		"\7n\2\2\u012e\u012f\7n\2\2\u012f\u0130\7q\2\2\u0130\u0131\7y\2\2\u0131"+
		"\u0132\7g\2\2\u0132\u0133\7f\2\2\u0133.\3\2\2\2\u0134\u0135\7r\2\2\u0135"+
		"\u0136\7k\2\2\u0136\u0137\7p\2\2\u0137\u0138\7p\2\2\u0138\u0139\7g\2\2"+
		"\u0139\u013a\7f\2\2\u013a\60\3\2\2\2\u013b\u013c\7r\2\2\u013c\u013d\7"+
		"c\2\2\u013d\u013e\7v\2\2\u013e\u013f\7j\2\2\u013f\u0140\7Q\2\2\u0140\u0141"+
		"\7t\2\2\u0141\u0142\7f\2\2\u0142\u0143\7g\2\2\u0143\u0144\7t\2\2\u0144"+
		"\62\3\2\2\2\u0145\u0146\7e\2\2\u0146\u0147\7q\2\2\u0147\u0148\7o\2\2\u0148"+
		"\u0149\7r\2\2\u0149\u014a\7g\2\2\u014a\u014b\7p\2\2\u014b\u014c\7u\2\2"+
		"\u014c\u014d\7c\2\2\u014d\u014e\7v\2\2\u014e\u014f\7k\2\2\u014f\u0150"+
		"\7q\2\2\u0150\u0151\7p\2\2\u0151\64\3\2\2\2\u0152\u0155\5Y-\2\u0153\u0155"+
		"\5W,\2\u0154\u0152\3\2\2\2\u0154\u0153\3\2\2\2\u0155\66\3\2\2\2\u0156"+
		"\u0157\5? \2\u0157\u0158\59\35\2\u0158\u0159\5S*\2\u01598\3\2\2\2\u015a"+
		"\u015b\7\61\2\2\u015b:\3\2\2\2\u015c\u015d\7,\2\2\u015d<\3\2\2\2\u015e"+
		"\u015f\7v\2\2\u015f\u0160\7t\2\2\u0160\u0161\7w\2\2\u0161\u0168\7g\2\2"+
		"\u0162\u0163\7h\2\2\u0163\u0164\7c\2\2\u0164\u0165\7n\2\2\u0165\u0166"+
		"\7u\2\2\u0166\u0168\7g\2\2\u0167\u015e\3\2\2\2\u0167\u0162\3\2\2\2\u0168"+
		">\3\2\2\2\u0169\u016a\5A!\2\u016a\u016b\7\60\2\2\u016b\u016c\5A!\2\u016c"+
		"\u016d\7\60\2\2\u016d\u016e\5A!\2\u016e\u016f\7\60\2\2\u016f\u0170\5A"+
		"!\2\u0170@\3\2\2\2\u0171\u0172\5C\"\2\u0172\u0173\5C\"\2\u0173\u0174\5"+
		"C\"\2\u0174\u017a\3\2\2\2\u0175\u0176\5C\"\2\u0176\u0177\5C\"\2\u0177"+
		"\u017a\3\2\2\2\u0178\u017a\5C\"\2\u0179\u0171\3\2\2\2\u0179\u0175\3\2"+
		"\2\2\u0179\u0178\3\2\2\2\u017aB\3\2\2\2\u017b\u017c\4\62;\2\u017cD\3\2"+
		"\2\2\u017d\u017e\7U\2\2\u017e\u017f\7q\2\2\u017f\u0180\7w\2\2\u0180\u0181"+
		"\7t\2\2\u0181\u0182\7e\2\2\u0182\u0183\7g\2\2\u0183F\3\2\2\2\u0184\u0185"+
		"\7Q\2\2\u0185\u0186\7r\2\2\u0186\u0187\7g\2\2\u0187\u0188\7t\2\2\u0188"+
		"\u0189\7c\2\2\u0189\u018a\7v\2\2\u018a\u018b\7q\2\2\u018b\u018c\7t\2\2"+
		"\u018cH\3\2\2\2\u018d\u018e\7U\2\2\u018e\u018f\7k\2\2\u018f\u0190\7p\2"+
		"\2\u0190\u0191\7m\2\2\u0191J\3\2\2\2\u0192\u0193\7U\2\2\u0193\u0194\7"+
		"r\2\2\u0194\u0195\7n\2\2\u0195\u0196\7k\2\2\u0196\u0197\7v\2\2\u0197L"+
		"\3\2\2\2\u0198\u0199\7L\2\2\u0199\u019a\7q\2\2\u019a\u019b\7k\2\2\u019b"+
		"\u019c\7p\2\2\u019cN\3\2\2\2\u019d\u01a3\7$\2\2\u019e\u019f\7^\2\2\u019f"+
		"\u01a2\7$\2\2\u01a0\u01a2\13\2\2\2\u01a1\u019e\3\2\2\2\u01a1\u01a0\3\2"+
		"\2\2\u01a2\u01a5\3\2\2\2\u01a3\u01a4\3\2\2\2\u01a3\u01a1\3\2\2\2\u01a4"+
		"\u01a6\3\2\2\2\u01a5\u01a3\3\2\2\2\u01a6\u01ae\7$\2\2\u01a7\u01aa\5U+"+
		"\2\u01a8\u01aa\t\2\2\2\u01a9\u01a7\3\2\2\2\u01a9\u01a8\3\2\2\2\u01aa\u01ab"+
		"\3\2\2\2\u01ab\u01a9\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01ae\3\2\2\2\u01ad"+
		"\u019d\3\2\2\2\u01ad\u01a9\3\2\2\2\u01aeP\3\2\2\2\u01af\u01b0\7&\2\2\u01b0"+
		"\u01b5\5U+\2\u01b1\u01b4\5U+\2\u01b2\u01b4\t\2\2\2\u01b3\u01b1\3\2\2\2"+
		"\u01b3\u01b2\3\2\2\2\u01b4\u01b7\3\2\2\2\u01b5\u01b3\3\2\2\2\u01b5\u01b6"+
		"\3\2\2\2\u01b6R\3\2\2\2\u01b7\u01b5\3\2\2\2\u01b8\u01bb\5O(\2\u01b9\u01bb"+
		"\5;\36\2\u01ba\u01b8\3\2\2\2\u01ba\u01b9\3\2\2\2\u01bbT\3\2\2\2\u01bc"+
		"\u01bd\t\3\2\2\u01bdV\3\2\2\2\u01be\u01c0\t\2\2\2\u01bf\u01be\3\2\2\2"+
		"\u01c0\u01c1\3\2\2\2\u01c1\u01bf\3\2\2\2\u01c1\u01c2\3\2\2\2\u01c2X\3"+
		"\2\2\2\u01c3\u01c5\4\62;\2\u01c4\u01c3\3\2\2\2\u01c5\u01c6\3\2\2\2\u01c6"+
		"\u01c4\3\2\2\2\u01c6\u01c7\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01ca\7\60"+
		"\2\2\u01c9\u01cb\4\62;\2\u01ca\u01c9\3\2\2\2\u01cb\u01cc\3\2\2\2\u01cc"+
		"\u01ca\3\2\2\2\u01cc\u01cd\3\2\2\2\u01cdZ\3\2\2\2\u01ce\u01d2\7%\2\2\u01cf"+
		"\u01d1\13\2\2\2\u01d0\u01cf\3\2\2\2\u01d1\u01d4\3\2\2\2\u01d2\u01d3\3"+
		"\2\2\2\u01d2\u01d0\3\2\2\2\u01d3\u01d5\3\2\2\2\u01d4\u01d2\3\2\2\2\u01d5"+
		"\u01d6\7\f\2\2\u01d6\u01d7\3\2\2\2\u01d7\u01d8\b.\2\2\u01d8\\\3\2\2\2"+
		"\u01d9\u01db\t\4\2\2\u01da\u01d9\3\2\2\2\u01db\u01dc\3\2\2\2\u01dc\u01da"+
		"\3\2\2\2\u01dc\u01dd\3\2\2\2\u01dd\u01de\3\2\2\2\u01de\u01df\b/\2\2\u01df"+
		"^\3\2\2\2\23\2\u0154\u0167\u0179\u01a1\u01a3\u01a9\u01ab\u01ad\u01b3\u01b5"+
		"\u01ba\u01c1\u01c6\u01cc\u01d2\u01dc\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}