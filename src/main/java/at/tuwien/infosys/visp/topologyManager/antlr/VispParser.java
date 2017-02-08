// Generated from /projects/dsg_practical/code/VISP-TopologyManager/src/main/java/at/tuwien/infosys/parser/antlr/Visp.g4 by ANTLR 4.6
package at.tuwien.infosys.visp.topologyManager.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VispParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, LOCATION=19, SLASH=20, BOOLEAN=21, IP_ADDRESS=22, OCTET=23, 
		DIGIT=24, SOURCE=25, OPERATOR=26, SINK=27, STRING=28, ID=29, RESOURCEPOOL=30, 
		QUOTELESSSTRING=31, INT=32, PREPROC=33, WS=34;
	public static final int
		RULE_configfile = 0, RULE_nodeBlock = 1, RULE_nodeHead = 2, RULE_newNodeId = 3, 
		RULE_sourceNode = 4, RULE_nodeBody = 5, RULE_statement = 6, RULE_allowedLocationsStmt = 7, 
		RULE_concreteLocationStmt = 8, RULE_inputFormatStmt = 9, RULE_sourceStmt = 10, 
		RULE_mechanismStmt = 11, RULE_typeStmt = 12, RULE_outputFormatStmt = 13, 
		RULE_statefulStmt = 14, RULE_nodeType = 15, RULE_sizeStmt = 16, RULE_sizeType = 17;
	public static final String[] ruleNames = {
		"configfile", "nodeBlock", "nodeHead", "newNodeId", "sourceNode", "nodeBody", 
		"statement", "allowedLocationsStmt", "concreteLocationStmt", "inputFormatStmt", 
		"sourceStmt", "mechanismStmt", "typeStmt", "outputFormatStmt", "statefulStmt", 
		"nodeType", "sizeStmt", "sizeType"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "'('", "','", "')'", "'allowedLocations'", 
		"'concreteLocation'", "'inputFormat'", "'source'", "'mechanism'", "'type'", 
		"'outputFormat'", "'stateful'", "'size'", "'small'", "'medium'", "'large'", 
		null, "'/'", null, null, null, null, "'Source'", "'Operator'", "'Sink'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, "LOCATION", "SLASH", "BOOLEAN", 
		"IP_ADDRESS", "OCTET", "DIGIT", "SOURCE", "OPERATOR", "SINK", "STRING", 
		"ID", "RESOURCEPOOL", "QUOTELESSSTRING", "INT", "PREPROC", "WS"
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

	@Override
	public String getGrammarFileName() { return "Visp.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public VispParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ConfigfileContext extends ParserRuleContext {
		public List<NodeBlockContext> nodeBlock() {
			return getRuleContexts(NodeBlockContext.class);
		}
		public NodeBlockContext nodeBlock(int i) {
			return getRuleContext(NodeBlockContext.class,i);
		}
		public ConfigfileContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_configfile; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterConfigfile(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitConfigfile(this);
		}
	}

	public final ConfigfileContext configfile() throws RecognitionException {
		ConfigfileContext _localctx = new ConfigfileContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_configfile);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(37); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(36);
				nodeBlock();
				}
				}
				setState(39); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==ID );
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

	public static class NodeBlockContext extends ParserRuleContext {
		public NodeHeadContext nodeHead() {
			return getRuleContext(NodeHeadContext.class,0);
		}
		public NodeBodyContext nodeBody() {
			return getRuleContext(NodeBodyContext.class,0);
		}
		public NodeBlockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeBlock; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterNodeBlock(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitNodeBlock(this);
		}
	}

	public final NodeBlockContext nodeBlock() throws RecognitionException {
		NodeBlockContext _localctx = new NodeBlockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_nodeBlock);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(41);
			nodeHead();
			setState(42);
			match(T__0);
			setState(43);
			nodeBody();
			setState(44);
			match(T__1);
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

	public static class NodeHeadContext extends ParserRuleContext {
		public NewNodeIdContext newNodeId() {
			return getRuleContext(NewNodeIdContext.class,0);
		}
		public NodeTypeContext nodeType() {
			return getRuleContext(NodeTypeContext.class,0);
		}
		public List<SourceNodeContext> sourceNode() {
			return getRuleContexts(SourceNodeContext.class);
		}
		public SourceNodeContext sourceNode(int i) {
			return getRuleContext(SourceNodeContext.class,i);
		}
		public NodeHeadContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeHead; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterNodeHead(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitNodeHead(this);
		}
	}

	public final NodeHeadContext nodeHead() throws RecognitionException {
		NodeHeadContext _localctx = new NodeHeadContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_nodeHead);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(46);
			newNodeId();
			setState(47);
			match(T__2);
			setState(48);
			nodeType();
			setState(49);
			match(T__3);
			setState(60);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(51);
				sourceNode();
				}
				break;
			case 3:
				{
				setState(52);
				sourceNode();
				setState(57);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(53);
					match(T__4);
					setState(54);
					sourceNode();
					}
					}
					setState(59);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(62);
			match(T__5);
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

	public static class NewNodeIdContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VispParser.ID, 0); }
		public NewNodeIdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_newNodeId; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterNewNodeId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitNewNodeId(this);
		}
	}

	public final NewNodeIdContext newNodeId() throws RecognitionException {
		NewNodeIdContext _localctx = new NewNodeIdContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_newNodeId);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(64);
			match(ID);
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

	public static class SourceNodeContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(VispParser.ID, 0); }
		public SourceNodeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceNode; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterSourceNode(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitSourceNode(this);
		}
	}

	public final SourceNodeContext sourceNode() throws RecognitionException {
		SourceNodeContext _localctx = new SourceNodeContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_sourceNode);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(66);
			match(ID);
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

	public static class NodeBodyContext extends ParserRuleContext {
		public List<StatementContext> statement() {
			return getRuleContexts(StatementContext.class);
		}
		public StatementContext statement(int i) {
			return getRuleContext(StatementContext.class,i);
		}
		public NodeBodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeBody; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterNodeBody(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitNodeBody(this);
		}
	}

	public final NodeBodyContext nodeBody() throws RecognitionException {
		NodeBodyContext _localctx = new NodeBodyContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_nodeBody);
		int _la;
		try {
			int _alt;
			setState(81);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,5,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(69);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(70);
				statement();
				setState(75);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(71);
						match(T__4);
						setState(72);
						statement();
						}
						} 
					}
					setState(77);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(79);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(78);
					match(T__4);
					}
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

	public static class StatementContext extends ParserRuleContext {
		public AllowedLocationsStmtContext allowedLocationsStmt() {
			return getRuleContext(AllowedLocationsStmtContext.class,0);
		}
		public InputFormatStmtContext inputFormatStmt() {
			return getRuleContext(InputFormatStmtContext.class,0);
		}
		public SourceStmtContext sourceStmt() {
			return getRuleContext(SourceStmtContext.class,0);
		}
		public MechanismStmtContext mechanismStmt() {
			return getRuleContext(MechanismStmtContext.class,0);
		}
		public TypeStmtContext typeStmt() {
			return getRuleContext(TypeStmtContext.class,0);
		}
		public OutputFormatStmtContext outputFormatStmt() {
			return getRuleContext(OutputFormatStmtContext.class,0);
		}
		public StatefulStmtContext statefulStmt() {
			return getRuleContext(StatefulStmtContext.class,0);
		}
		public ConcreteLocationStmtContext concreteLocationStmt() {
			return getRuleContext(ConcreteLocationStmtContext.class,0);
		}
		public SizeStmtContext sizeStmt() {
			return getRuleContext(SizeStmtContext.class,0);
		}
		public StatementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterStatement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitStatement(this);
		}
	}

	public final StatementContext statement() throws RecognitionException {
		StatementContext _localctx = new StatementContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_statement);
		try {
			setState(92);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(83);
				allowedLocationsStmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(84);
				inputFormatStmt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(85);
				sourceStmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(86);
				mechanismStmt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(87);
				typeStmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(88);
				outputFormatStmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(89);
				statefulStmt();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 8);
				{
				setState(90);
				concreteLocationStmt();
				}
				break;
			case T__14:
				enterOuterAlt(_localctx, 9);
				{
				setState(91);
				sizeStmt();
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

	public static class AllowedLocationsStmtContext extends ParserRuleContext {
		public List<TerminalNode> LOCATION() { return getTokens(VispParser.LOCATION); }
		public TerminalNode LOCATION(int i) {
			return getToken(VispParser.LOCATION, i);
		}
		public AllowedLocationsStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_allowedLocationsStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterAllowedLocationsStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitAllowedLocationsStmt(this);
		}
	}

	public final AllowedLocationsStmtContext allowedLocationsStmt() throws RecognitionException {
		AllowedLocationsStmtContext _localctx = new AllowedLocationsStmtContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_allowedLocationsStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(94);
			match(T__6);
			setState(95);
			match(T__2);
			setState(99);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOCATION) {
				{
				{
				setState(96);
				match(LOCATION);
				}
				}
				setState(101);
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

	public static class ConcreteLocationStmtContext extends ParserRuleContext {
		public TerminalNode LOCATION() { return getToken(VispParser.LOCATION, 0); }
		public ConcreteLocationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_concreteLocationStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterConcreteLocationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitConcreteLocationStmt(this);
		}
	}

	public final ConcreteLocationStmtContext concreteLocationStmt() throws RecognitionException {
		ConcreteLocationStmtContext _localctx = new ConcreteLocationStmtContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_concreteLocationStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102);
			match(T__7);
			setState(103);
			match(T__2);
			setState(104);
			match(LOCATION);
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

	public static class InputFormatStmtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VispParser.STRING, 0); }
		public InputFormatStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_inputFormatStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterInputFormatStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitInputFormatStmt(this);
		}
	}

	public final InputFormatStmtContext inputFormatStmt() throws RecognitionException {
		InputFormatStmtContext _localctx = new InputFormatStmtContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_inputFormatStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(T__8);
			setState(107);
			match(T__2);
			setState(108);
			match(STRING);
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

	public static class SourceStmtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VispParser.STRING, 0); }
		public SourceStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sourceStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterSourceStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitSourceStmt(this);
		}
	}

	public final SourceStmtContext sourceStmt() throws RecognitionException {
		SourceStmtContext _localctx = new SourceStmtContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_sourceStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(110);
			match(T__9);
			setState(111);
			match(T__2);
			setState(112);
			match(STRING);
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

	public static class MechanismStmtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VispParser.STRING, 0); }
		public MechanismStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_mechanismStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterMechanismStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitMechanismStmt(this);
		}
	}

	public final MechanismStmtContext mechanismStmt() throws RecognitionException {
		MechanismStmtContext _localctx = new MechanismStmtContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_mechanismStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(114);
			match(T__10);
			setState(115);
			match(T__2);
			setState(116);
			match(STRING);
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

	public static class TypeStmtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VispParser.STRING, 0); }
		public TypeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_typeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterTypeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitTypeStmt(this);
		}
	}

	public final TypeStmtContext typeStmt() throws RecognitionException {
		TypeStmtContext _localctx = new TypeStmtContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_typeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(118);
			match(T__11);
			setState(119);
			match(T__2);
			setState(120);
			match(STRING);
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

	public static class OutputFormatStmtContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(VispParser.STRING, 0); }
		public OutputFormatStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_outputFormatStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterOutputFormatStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitOutputFormatStmt(this);
		}
	}

	public final OutputFormatStmtContext outputFormatStmt() throws RecognitionException {
		OutputFormatStmtContext _localctx = new OutputFormatStmtContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_outputFormatStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(122);
			match(T__12);
			setState(123);
			match(T__2);
			setState(124);
			match(STRING);
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

	public static class StatefulStmtContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(VispParser.BOOLEAN, 0); }
		public StatefulStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_statefulStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterStatefulStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitStatefulStmt(this);
		}
	}

	public final StatefulStmtContext statefulStmt() throws RecognitionException {
		StatefulStmtContext _localctx = new StatefulStmtContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_statefulStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(126);
			match(T__13);
			setState(127);
			match(T__2);
			setState(128);
			match(BOOLEAN);
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

	public static class NodeTypeContext extends ParserRuleContext {
		public TerminalNode SOURCE() { return getToken(VispParser.SOURCE, 0); }
		public TerminalNode OPERATOR() { return getToken(VispParser.OPERATOR, 0); }
		public TerminalNode SINK() { return getToken(VispParser.SINK, 0); }
		public NodeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_nodeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterNodeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitNodeType(this);
		}
	}

	public final NodeTypeContext nodeType() throws RecognitionException {
		NodeTypeContext _localctx = new NodeTypeContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_nodeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(130);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOURCE) | (1L << OPERATOR) | (1L << SINK))) != 0)) ) {
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

	public static class SizeStmtContext extends ParserRuleContext {
		public SizeTypeContext sizeType() {
			return getRuleContext(SizeTypeContext.class,0);
		}
		public SizeStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterSizeStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitSizeStmt(this);
		}
	}

	public final SizeStmtContext sizeStmt() throws RecognitionException {
		SizeStmtContext _localctx = new SizeStmtContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_sizeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__14);
			setState(133);
			match(T__2);
			setState(134);
			sizeType();
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

	public static class SizeTypeContext extends ParserRuleContext {
		public SizeTypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sizeType; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterSizeType(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitSizeType(this);
		}
	}

	public final SizeTypeContext sizeType() throws RecognitionException {
		SizeTypeContext _localctx = new SizeTypeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_sizeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__15) | (1L << T__16) | (1L << T__17))) != 0)) ) {
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3$\u008d\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\3\2\6\2(\n\2\r\2\16\2)\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\7\4:\n\4\f\4\16\4=\13\4\5\4?\n\4\3\4\3\4\3\5\3\5"+
		"\3\6\3\6\3\7\3\7\3\7\3\7\3\7\7\7L\n\7\f\7\16\7O\13\7\3\7\5\7R\n\7\5\7"+
		"T\n\7\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\b_\n\b\3\t\3\t\3\t\7\td\n"+
		"\t\f\t\16\tg\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f"+
		"\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\22\3\22\3\23\3\23\3\23\2\2\24\2\4\6\b\n\f"+
		"\16\20\22\24\26\30\32\34\36 \"$\2\4\3\2\33\35\3\2\22\24\u008b\2\'\3\2"+
		"\2\2\4+\3\2\2\2\6\60\3\2\2\2\bB\3\2\2\2\nD\3\2\2\2\fS\3\2\2\2\16^\3\2"+
		"\2\2\20`\3\2\2\2\22h\3\2\2\2\24l\3\2\2\2\26p\3\2\2\2\30t\3\2\2\2\32x\3"+
		"\2\2\2\34|\3\2\2\2\36\u0080\3\2\2\2 \u0084\3\2\2\2\"\u0086\3\2\2\2$\u008a"+
		"\3\2\2\2&(\5\4\3\2\'&\3\2\2\2()\3\2\2\2)\'\3\2\2\2)*\3\2\2\2*\3\3\2\2"+
		"\2+,\5\6\4\2,-\7\3\2\2-.\5\f\7\2./\7\4\2\2/\5\3\2\2\2\60\61\5\b\5\2\61"+
		"\62\7\5\2\2\62\63\5 \21\2\63>\7\6\2\2\64?\3\2\2\2\65?\5\n\6\2\66;\5\n"+
		"\6\2\678\7\7\2\28:\5\n\6\29\67\3\2\2\2:=\3\2\2\2;9\3\2\2\2;<\3\2\2\2<"+
		"?\3\2\2\2=;\3\2\2\2>\64\3\2\2\2>\65\3\2\2\2>\66\3\2\2\2?@\3\2\2\2@A\7"+
		"\b\2\2A\7\3\2\2\2BC\7\37\2\2C\t\3\2\2\2DE\7\37\2\2E\13\3\2\2\2FT\3\2\2"+
		"\2GT\5\16\b\2HM\5\16\b\2IJ\7\7\2\2JL\5\16\b\2KI\3\2\2\2LO\3\2\2\2MK\3"+
		"\2\2\2MN\3\2\2\2NQ\3\2\2\2OM\3\2\2\2PR\7\7\2\2QP\3\2\2\2QR\3\2\2\2RT\3"+
		"\2\2\2SF\3\2\2\2SG\3\2\2\2SH\3\2\2\2T\r\3\2\2\2U_\5\20\t\2V_\5\24\13\2"+
		"W_\5\26\f\2X_\5\30\r\2Y_\5\32\16\2Z_\5\34\17\2[_\5\36\20\2\\_\5\22\n\2"+
		"]_\5\"\22\2^U\3\2\2\2^V\3\2\2\2^W\3\2\2\2^X\3\2\2\2^Y\3\2\2\2^Z\3\2\2"+
		"\2^[\3\2\2\2^\\\3\2\2\2^]\3\2\2\2_\17\3\2\2\2`a\7\t\2\2ae\7\5\2\2bd\7"+
		"\25\2\2cb\3\2\2\2dg\3\2\2\2ec\3\2\2\2ef\3\2\2\2f\21\3\2\2\2ge\3\2\2\2"+
		"hi\7\n\2\2ij\7\5\2\2jk\7\25\2\2k\23\3\2\2\2lm\7\13\2\2mn\7\5\2\2no\7\36"+
		"\2\2o\25\3\2\2\2pq\7\f\2\2qr\7\5\2\2rs\7\36\2\2s\27\3\2\2\2tu\7\r\2\2"+
		"uv\7\5\2\2vw\7\36\2\2w\31\3\2\2\2xy\7\16\2\2yz\7\5\2\2z{\7\36\2\2{\33"+
		"\3\2\2\2|}\7\17\2\2}~\7\5\2\2~\177\7\36\2\2\177\35\3\2\2\2\u0080\u0081"+
		"\7\20\2\2\u0081\u0082\7\5\2\2\u0082\u0083\7\27\2\2\u0083\37\3\2\2\2\u0084"+
		"\u0085\t\2\2\2\u0085!\3\2\2\2\u0086\u0087\7\21\2\2\u0087\u0088\7\5\2\2"+
		"\u0088\u0089\5$\23\2\u0089#\3\2\2\2\u008a\u008b\t\3\2\2\u008b%\3\2\2\2"+
		"\n);>MQS^e";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}