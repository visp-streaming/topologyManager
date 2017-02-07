// Generated from /projects/dsg_practical/code/VISP-Runtime-dev/src/main/java/at/tuwien/infosys/topology/antlr/Visp.g4 by ANTLR 4.5.3
package at.tuwien.infosys.parser.antlr;

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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BOOLEAN=15, IP_ADDRESS=16, 
		OCTET=17, DIGIT=18, SOURCE=19, OPERATOR=20, SINK=21, STRING=22, ID=23, 
		INT=24, PREPROC=25, WS=26;
	public static String[] modeNames = {
		"DEFAULT_MODE"
	};

	public static final String[] ruleNames = {
		"T__0", "T__1", "T__2", "T__3", "T__4", "T__5", "T__6", "T__7", "T__8", 
		"T__9", "T__10", "T__11", "T__12", "T__13", "BOOLEAN", "IP_ADDRESS", "OCTET", 
		"DIGIT", "SOURCE", "OPERATOR", "SINK", "STRING", "ID", "LETTER", "INT", 
		"PREPROC", "WS"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "'('", "','", "')'", "'allowedLocations'", 
		"'concreteLocation'", "'inputFormat'", "'source'", "'mechanism'", "'type'", 
		"'outputFormat'", "'stateful'", null, null, null, null, "'Source'", "'Operator'", 
		"'Sink'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, "BOOLEAN", "IP_ADDRESS", "OCTET", "DIGIT", "SOURCE", 
		"OPERATOR", "SINK", "STRING", "ID", "INT", "PREPROC", "WS"
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
	public String[] getModeNames() { return modeNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\2\34\u0107\b\1\4\2"+
		"\t\2\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4"+
		"\13\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22"+
		"\t\22\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31"+
		"\t\31\4\32\t\32\4\33\t\33\4\34\t\34\3\2\3\2\3\3\3\3\3\4\3\4\3\5\3\5\3"+
		"\6\3\6\3\7\3\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3"+
		"\t\3\t\3\t\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\n\3\13\3\13\3"+
		"\13\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\f\3\r\3"+
		"\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\20\3\20\3\20\3\20\3\20\5\20\u00a9\n\20\3\21\3\21\3\21\3\21\3\21"+
		"\3\21\3\21\3\21\3\22\3\22\3\22\3\22\3\22\3\22\3\22\3\22\5\22\u00bb\n\22"+
		"\3\23\3\23\3\24\3\24\3\24\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\25"+
		"\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\26\3\27\3\27\3\27\3\27\7\27"+
		"\u00d8\n\27\f\27\16\27\u00db\13\27\3\27\3\27\3\27\6\27\u00e0\n\27\r\27"+
		"\16\27\u00e1\5\27\u00e4\n\27\3\30\3\30\3\30\3\30\7\30\u00ea\n\30\f\30"+
		"\16\30\u00ed\13\30\3\31\3\31\3\32\6\32\u00f2\n\32\r\32\16\32\u00f3\3\33"+
		"\3\33\7\33\u00f8\n\33\f\33\16\33\u00fb\13\33\3\33\3\33\3\33\3\33\3\34"+
		"\6\34\u0102\n\34\r\34\16\34\u0103\3\34\3\34\4\u00d9\u00f9\2\35\3\3\5\4"+
		"\7\5\t\6\13\7\r\b\17\t\21\n\23\13\25\f\27\r\31\16\33\17\35\20\37\21!\22"+
		"#\23%\24\'\25)\26+\27-\30/\31\61\2\63\32\65\33\67\34\3\2\5\3\2\62;\4\2"+
		"C\\c|\5\2\13\f\17\17\"\"\u0112\2\3\3\2\2\2\2\5\3\2\2\2\2\7\3\2\2\2\2\t"+
		"\3\2\2\2\2\13\3\2\2\2\2\r\3\2\2\2\2\17\3\2\2\2\2\21\3\2\2\2\2\23\3\2\2"+
		"\2\2\25\3\2\2\2\2\27\3\2\2\2\2\31\3\2\2\2\2\33\3\2\2\2\2\35\3\2\2\2\2"+
		"\37\3\2\2\2\2!\3\2\2\2\2#\3\2\2\2\2%\3\2\2\2\2\'\3\2\2\2\2)\3\2\2\2\2"+
		"+\3\2\2\2\2-\3\2\2\2\2/\3\2\2\2\2\63\3\2\2\2\2\65\3\2\2\2\2\67\3\2\2\2"+
		"\39\3\2\2\2\5;\3\2\2\2\7=\3\2\2\2\t?\3\2\2\2\13A\3\2\2\2\rC\3\2\2\2\17"+
		"E\3\2\2\2\21V\3\2\2\2\23g\3\2\2\2\25s\3\2\2\2\27z\3\2\2\2\31\u0084\3\2"+
		"\2\2\33\u0089\3\2\2\2\35\u0096\3\2\2\2\37\u00a8\3\2\2\2!\u00aa\3\2\2\2"+
		"#\u00ba\3\2\2\2%\u00bc\3\2\2\2\'\u00be\3\2\2\2)\u00c5\3\2\2\2+\u00ce\3"+
		"\2\2\2-\u00e3\3\2\2\2/\u00e5\3\2\2\2\61\u00ee\3\2\2\2\63\u00f1\3\2\2\2"+
		"\65\u00f5\3\2\2\2\67\u0101\3\2\2\29:\7}\2\2:\4\3\2\2\2;<\7\177\2\2<\6"+
		"\3\2\2\2=>\7?\2\2>\b\3\2\2\2?@\7*\2\2@\n\3\2\2\2AB\7.\2\2B\f\3\2\2\2C"+
		"D\7+\2\2D\16\3\2\2\2EF\7c\2\2FG\7n\2\2GH\7n\2\2HI\7q\2\2IJ\7y\2\2JK\7"+
		"g\2\2KL\7f\2\2LM\7N\2\2MN\7q\2\2NO\7e\2\2OP\7c\2\2PQ\7v\2\2QR\7k\2\2R"+
		"S\7q\2\2ST\7p\2\2TU\7u\2\2U\20\3\2\2\2VW\7e\2\2WX\7q\2\2XY\7p\2\2YZ\7"+
		"e\2\2Z[\7t\2\2[\\\7g\2\2\\]\7v\2\2]^\7g\2\2^_\7N\2\2_`\7q\2\2`a\7e\2\2"+
		"ab\7c\2\2bc\7v\2\2cd\7k\2\2de\7q\2\2ef\7p\2\2f\22\3\2\2\2gh\7k\2\2hi\7"+
		"p\2\2ij\7r\2\2jk\7w\2\2kl\7v\2\2lm\7H\2\2mn\7q\2\2no\7t\2\2op\7o\2\2p"+
		"q\7c\2\2qr\7v\2\2r\24\3\2\2\2st\7u\2\2tu\7q\2\2uv\7w\2\2vw\7t\2\2wx\7"+
		"e\2\2xy\7g\2\2y\26\3\2\2\2z{\7o\2\2{|\7g\2\2|}\7e\2\2}~\7j\2\2~\177\7"+
		"c\2\2\177\u0080\7p\2\2\u0080\u0081\7k\2\2\u0081\u0082\7u\2\2\u0082\u0083"+
		"\7o\2\2\u0083\30\3\2\2\2\u0084\u0085\7v\2\2\u0085\u0086\7{\2\2\u0086\u0087"+
		"\7r\2\2\u0087\u0088\7g\2\2\u0088\32\3\2\2\2\u0089\u008a\7q\2\2\u008a\u008b"+
		"\7w\2\2\u008b\u008c\7v\2\2\u008c\u008d\7r\2\2\u008d\u008e\7w\2\2\u008e"+
		"\u008f\7v\2\2\u008f\u0090\7H\2\2\u0090\u0091\7q\2\2\u0091\u0092\7t\2\2"+
		"\u0092\u0093\7o\2\2\u0093\u0094\7c\2\2\u0094\u0095\7v\2\2\u0095\34\3\2"+
		"\2\2\u0096\u0097\7u\2\2\u0097\u0098\7v\2\2\u0098\u0099\7c\2\2\u0099\u009a"+
		"\7v\2\2\u009a\u009b\7g\2\2\u009b\u009c\7h\2\2\u009c\u009d\7w\2\2\u009d"+
		"\u009e\7n\2\2\u009e\36\3\2\2\2\u009f\u00a0\7v\2\2\u00a0\u00a1\7t\2\2\u00a1"+
		"\u00a2\7w\2\2\u00a2\u00a9\7g\2\2\u00a3\u00a4\7h\2\2\u00a4\u00a5\7c\2\2"+
		"\u00a5\u00a6\7n\2\2\u00a6\u00a7\7u\2\2\u00a7\u00a9\7g\2\2\u00a8\u009f"+
		"\3\2\2\2\u00a8\u00a3\3\2\2\2\u00a9 \3\2\2\2\u00aa\u00ab\5#\22\2\u00ab"+
		"\u00ac\7\60\2\2\u00ac\u00ad\5#\22\2\u00ad\u00ae\7\60\2\2\u00ae\u00af\5"+
		"#\22\2\u00af\u00b0\7\60\2\2\u00b0\u00b1\5#\22\2\u00b1\"\3\2\2\2\u00b2"+
		"\u00b3\5%\23\2\u00b3\u00b4\5%\23\2\u00b4\u00b5\5%\23\2\u00b5\u00bb\3\2"+
		"\2\2\u00b6\u00b7\5%\23\2\u00b7\u00b8\5%\23\2\u00b8\u00bb\3\2\2\2\u00b9"+
		"\u00bb\5%\23\2\u00ba\u00b2\3\2\2\2\u00ba\u00b6\3\2\2\2\u00ba\u00b9\3\2"+
		"\2\2\u00bb$\3\2\2\2\u00bc\u00bd\4\62;\2\u00bd&\3\2\2\2\u00be\u00bf\7U"+
		"\2\2\u00bf\u00c0\7q\2\2\u00c0\u00c1\7w\2\2\u00c1\u00c2\7t\2\2\u00c2\u00c3"+
		"\7e\2\2\u00c3\u00c4\7g\2\2\u00c4(\3\2\2\2\u00c5\u00c6\7Q\2\2\u00c6\u00c7"+
		"\7r\2\2\u00c7\u00c8\7g\2\2\u00c8\u00c9\7t\2\2\u00c9\u00ca\7c\2\2\u00ca"+
		"\u00cb\7v\2\2\u00cb\u00cc\7q\2\2\u00cc\u00cd\7t\2\2\u00cd*\3\2\2\2\u00ce"+
		"\u00cf\7U\2\2\u00cf\u00d0\7k\2\2\u00d0\u00d1\7p\2\2\u00d1\u00d2\7m\2\2"+
		"\u00d2,\3\2\2\2\u00d3\u00d9\7$\2\2\u00d4\u00d5\7^\2\2\u00d5\u00d8\7$\2"+
		"\2\u00d6\u00d8\13\2\2\2\u00d7\u00d4\3\2\2\2\u00d7\u00d6\3\2\2\2\u00d8"+
		"\u00db\3\2\2\2\u00d9\u00da\3\2\2\2\u00d9\u00d7\3\2\2\2\u00da\u00dc\3\2"+
		"\2\2\u00db\u00d9\3\2\2\2\u00dc\u00e4\7$\2\2\u00dd\u00e0\5\61\31\2\u00de"+
		"\u00e0\t\2\2\2\u00df\u00dd\3\2\2\2\u00df\u00de\3\2\2\2\u00e0\u00e1\3\2"+
		"\2\2\u00e1\u00df\3\2\2\2\u00e1\u00e2\3\2\2\2\u00e2\u00e4\3\2\2\2\u00e3"+
		"\u00d3\3\2\2\2\u00e3\u00df\3\2\2\2\u00e4.\3\2\2\2\u00e5\u00e6\7&\2\2\u00e6"+
		"\u00eb\5\61\31\2\u00e7\u00ea\5\61\31\2\u00e8\u00ea\t\2\2\2\u00e9\u00e7"+
		"\3\2\2\2\u00e9\u00e8\3\2\2\2\u00ea\u00ed\3\2\2\2\u00eb\u00e9\3\2\2\2\u00eb"+
		"\u00ec\3\2\2\2\u00ec\60\3\2\2\2\u00ed\u00eb\3\2\2\2\u00ee\u00ef\t\3\2"+
		"\2\u00ef\62\3\2\2\2\u00f0\u00f2\t\2\2\2\u00f1\u00f0\3\2\2\2\u00f2\u00f3"+
		"\3\2\2\2\u00f3\u00f1\3\2\2\2\u00f3\u00f4\3\2\2\2\u00f4\64\3\2\2\2\u00f5"+
		"\u00f9\7%\2\2\u00f6\u00f8\13\2\2\2\u00f7\u00f6\3\2\2\2\u00f8\u00fb\3\2"+
		"\2\2\u00f9\u00fa\3\2\2\2\u00f9\u00f7\3\2\2\2\u00fa\u00fc\3\2\2\2\u00fb"+
		"\u00f9\3\2\2\2\u00fc\u00fd\7\f\2\2\u00fd\u00fe\3\2\2\2\u00fe\u00ff\b\33"+
		"\2\2\u00ff\66\3\2\2\2\u0100\u0102\t\4\2\2\u0101\u0100\3\2\2\2\u0102\u0103"+
		"\3\2\2\2\u0103\u0101\3\2\2\2\u0103\u0104\3\2\2\2\u0104\u0105\3\2\2\2\u0105"+
		"\u0106\b\34\2\2\u01068\3\2\2\2\17\2\u00a8\u00ba\u00d7\u00d9\u00df\u00e1"+
		"\u00e3\u00e9\u00eb\u00f3\u00f9\u0103\3\b\2\2";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}