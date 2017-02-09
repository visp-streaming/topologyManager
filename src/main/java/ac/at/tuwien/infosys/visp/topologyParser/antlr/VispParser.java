package ac.at.tuwien.infosys.visp.topologyParser.antlr;
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
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, NUMBER=24, 
		LOCATION=25, SLASH=26, BOOLEAN=27, IP_ADDRESS=28, OCTET=29, DIGIT=30, 
		SOURCE=31, OPERATOR=32, SINK=33, STRING=34, ID=35, RESOURCEPOOL=36, INT=37, 
		PREPROC=38, WS=39;
	public static final int
		RULE_configfile = 0, RULE_nodeBlock = 1, RULE_nodeHead = 2, RULE_newNodeId = 3, 
		RULE_sourceNode = 4, RULE_nodeBody = 5, RULE_statement = 6, RULE_allowedLocationsStmt = 7, 
		RULE_concreteLocationStmt = 8, RULE_inputFormatStmt = 9, RULE_mechanismStmt = 10, 
		RULE_typeStmt = 11, RULE_outputFormatStmt = 12, RULE_statefulStmt = 13, 
		RULE_nodeType = 14, RULE_sizeStmt = 15, RULE_sizeType = 16, RULE_expectedDurationStmt = 17, 
		RULE_scalingCPUThresholdStmt = 18, RULE_scalingMemoryThresholdStmt = 19, 
		RULE_queueThreshold = 20, RULE_replicationAllowedStmt = 21, RULE_pinnedStmt = 22;
	public static final String[] ruleNames = {
		"configfile", "nodeBlock", "nodeHead", "newNodeId", "sourceNode", "nodeBody", 
		"statement", "allowedLocationsStmt", "concreteLocationStmt", "inputFormatStmt", 
		"mechanismStmt", "typeStmt", "outputFormatStmt", "statefulStmt", "nodeType", 
		"sizeStmt", "sizeType", "expectedDurationStmt", "scalingCPUThresholdStmt", 
		"scalingMemoryThresholdStmt", "queueThreshold", "replicationAllowedStmt", 
		"pinnedStmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "'('", "','", "')'", "'allowedLocations'", 
		"'concreteLocation'", "'inputFormat'", "'mechanism'", "'type'", "'outputFormat'", 
		"'stateful'", "'size'", "'small'", "'medium'", "'large'", "'expectedDuration'", 
		"'scalingCPUThreshold'", "'scalingMemoryThreshold'", "'queueThreshold'", 
		"'replicationAllowed'", "'pinned'", null, null, "'/'", null, null, null, 
		null, "'Source'", "'Operator'", "'Sink'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		"NUMBER", "LOCATION", "SLASH", "BOOLEAN", "IP_ADDRESS", "OCTET", "DIGIT", 
		"SOURCE", "OPERATOR", "SINK", "STRING", "ID", "RESOURCEPOOL", "INT", "PREPROC", 
		"WS"
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
			setState(47); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(46);
				nodeBlock();
				}
				}
				setState(49); 
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
			setState(51);
			nodeHead();
			setState(52);
			match(T__0);
			setState(53);
			nodeBody();
			setState(54);
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
			setState(56);
			newNodeId();
			setState(57);
			match(T__2);
			setState(58);
			nodeType();
			setState(59);
			match(T__3);
			setState(70);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(61);
				sourceNode();
				}
				break;
			case 3:
				{
				setState(62);
				sourceNode();
				setState(67);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(63);
					match(T__4);
					setState(64);
					sourceNode();
					}
					}
					setState(69);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(72);
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
			setState(74);
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
			setState(76);
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
			setState(91);
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
				setState(79);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(80);
				statement();
				setState(85);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(81);
						match(T__4);
						setState(82);
						statement();
						}
						} 
					}
					setState(87);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(89);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(88);
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
		public ExpectedDurationStmtContext expectedDurationStmt() {
			return getRuleContext(ExpectedDurationStmtContext.class,0);
		}
		public ScalingCPUThresholdStmtContext scalingCPUThresholdStmt() {
			return getRuleContext(ScalingCPUThresholdStmtContext.class,0);
		}
		public ScalingMemoryThresholdStmtContext scalingMemoryThresholdStmt() {
			return getRuleContext(ScalingMemoryThresholdStmtContext.class,0);
		}
		public QueueThresholdContext queueThreshold() {
			return getRuleContext(QueueThresholdContext.class,0);
		}
		public ReplicationAllowedStmtContext replicationAllowedStmt() {
			return getRuleContext(ReplicationAllowedStmtContext.class,0);
		}
		public PinnedStmtContext pinnedStmt() {
			return getRuleContext(PinnedStmtContext.class,0);
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
			setState(107);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(93);
				allowedLocationsStmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(94);
				inputFormatStmt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(95);
				mechanismStmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(96);
				typeStmt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(97);
				outputFormatStmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(98);
				statefulStmt();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(99);
				concreteLocationStmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(100);
				sizeStmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 9);
				{
				setState(101);
				expectedDurationStmt();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 10);
				{
				setState(102);
				scalingCPUThresholdStmt();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 11);
				{
				setState(103);
				scalingMemoryThresholdStmt();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 12);
				{
				setState(104);
				queueThreshold();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 13);
				{
				setState(105);
				replicationAllowedStmt();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 14);
				{
				setState(106);
				pinnedStmt();
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
			setState(109);
			match(T__6);
			setState(110);
			match(T__2);
			setState(114);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOCATION) {
				{
				{
				setState(111);
				match(LOCATION);
				}
				}
				setState(116);
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
			setState(117);
			match(T__7);
			setState(118);
			match(T__2);
			setState(119);
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
		public List<TerminalNode> STRING() { return getTokens(VispParser.STRING); }
		public TerminalNode STRING(int i) {
			return getToken(VispParser.STRING, i);
		}
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
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(121);
			match(T__8);
			setState(122);
			match(T__2);
			setState(124); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(123);
				match(STRING);
				}
				}
				setState(126); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==STRING );
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
		enterRule(_localctx, 20, RULE_mechanismStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(128);
			match(T__9);
			setState(129);
			match(T__2);
			setState(130);
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
		enterRule(_localctx, 22, RULE_typeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(132);
			match(T__10);
			setState(133);
			match(T__2);
			setState(134);
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
		enterRule(_localctx, 24, RULE_outputFormatStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(136);
			match(T__11);
			setState(137);
			match(T__2);
			setState(138);
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
		enterRule(_localctx, 26, RULE_statefulStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(140);
			match(T__12);
			setState(141);
			match(T__2);
			setState(142);
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
		enterRule(_localctx, 28, RULE_nodeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(144);
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
		enterRule(_localctx, 30, RULE_sizeStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(146);
			match(T__13);
			setState(147);
			match(T__2);
			setState(148);
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
		enterRule(_localctx, 32, RULE_sizeType);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(150);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__14) | (1L << T__15) | (1L << T__16))) != 0)) ) {
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

	public static class ExpectedDurationStmtContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VispParser.NUMBER, 0); }
		public ExpectedDurationStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expectedDurationStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterExpectedDurationStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitExpectedDurationStmt(this);
		}
	}

	public final ExpectedDurationStmtContext expectedDurationStmt() throws RecognitionException {
		ExpectedDurationStmtContext _localctx = new ExpectedDurationStmtContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_expectedDurationStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(152);
			match(T__17);
			setState(153);
			match(T__2);
			setState(154);
			match(NUMBER);
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

	public static class ScalingCPUThresholdStmtContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VispParser.NUMBER, 0); }
		public ScalingCPUThresholdStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalingCPUThresholdStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterScalingCPUThresholdStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitScalingCPUThresholdStmt(this);
		}
	}

	public final ScalingCPUThresholdStmtContext scalingCPUThresholdStmt() throws RecognitionException {
		ScalingCPUThresholdStmtContext _localctx = new ScalingCPUThresholdStmtContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_scalingCPUThresholdStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(156);
			match(T__18);
			setState(157);
			match(T__2);
			setState(158);
			match(NUMBER);
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

	public static class ScalingMemoryThresholdStmtContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VispParser.NUMBER, 0); }
		public ScalingMemoryThresholdStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_scalingMemoryThresholdStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterScalingMemoryThresholdStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitScalingMemoryThresholdStmt(this);
		}
	}

	public final ScalingMemoryThresholdStmtContext scalingMemoryThresholdStmt() throws RecognitionException {
		ScalingMemoryThresholdStmtContext _localctx = new ScalingMemoryThresholdStmtContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_scalingMemoryThresholdStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(160);
			match(T__19);
			setState(161);
			match(T__2);
			setState(162);
			match(NUMBER);
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

	public static class QueueThresholdContext extends ParserRuleContext {
		public TerminalNode NUMBER() { return getToken(VispParser.NUMBER, 0); }
		public QueueThresholdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_queueThreshold; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterQueueThreshold(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitQueueThreshold(this);
		}
	}

	public final QueueThresholdContext queueThreshold() throws RecognitionException {
		QueueThresholdContext _localctx = new QueueThresholdContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_queueThreshold);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(164);
			match(T__20);
			setState(165);
			match(T__2);
			setState(166);
			match(NUMBER);
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

	public static class ReplicationAllowedStmtContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(VispParser.BOOLEAN, 0); }
		public ReplicationAllowedStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_replicationAllowedStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterReplicationAllowedStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitReplicationAllowedStmt(this);
		}
	}

	public final ReplicationAllowedStmtContext replicationAllowedStmt() throws RecognitionException {
		ReplicationAllowedStmtContext _localctx = new ReplicationAllowedStmtContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_replicationAllowedStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(168);
			match(T__21);
			setState(169);
			match(T__2);
			setState(170);
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

	public static class PinnedStmtContext extends ParserRuleContext {
		public TerminalNode BOOLEAN() { return getToken(VispParser.BOOLEAN, 0); }
		public PinnedStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pinnedStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterPinnedStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitPinnedStmt(this);
		}
	}

	public final PinnedStmtContext pinnedStmt() throws RecognitionException {
		PinnedStmtContext _localctx = new PinnedStmtContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_pinnedStmt);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(172);
			match(T__22);
			setState(173);
			match(T__2);
			setState(174);
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3)\u00b3\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\3\2\6\2\62"+
		"\n\2\r\2\16\2\63\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4D\n\4\f\4\16\4G\13\4\5\4I\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7\3"+
		"\7\3\7\3\7\7\7V\n\7\f\7\16\7Y\13\7\3\7\5\7\\\n\7\5\7^\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bn\n\b\3\t\3\t\3\t\7\t"+
		"s\n\t\f\t\16\tv\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\6\13\177\n\13\r\13"+
		"\16\13\u0080\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16\3\16\3\16\3\17"+
		"\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22\3\23\3\23\3\23"+
		"\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26\3\26\3\26\3\27"+
		"\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\30\2\2\31\2\4\6\b\n\f\16\20\22\24"+
		"\26\30\32\34\36 \"$&(*,.\2\4\3\2!#\3\2\21\23\u00b2\2\61\3\2\2\2\4\65\3"+
		"\2\2\2\6:\3\2\2\2\bL\3\2\2\2\nN\3\2\2\2\f]\3\2\2\2\16m\3\2\2\2\20o\3\2"+
		"\2\2\22w\3\2\2\2\24{\3\2\2\2\26\u0082\3\2\2\2\30\u0086\3\2\2\2\32\u008a"+
		"\3\2\2\2\34\u008e\3\2\2\2\36\u0092\3\2\2\2 \u0094\3\2\2\2\"\u0098\3\2"+
		"\2\2$\u009a\3\2\2\2&\u009e\3\2\2\2(\u00a2\3\2\2\2*\u00a6\3\2\2\2,\u00aa"+
		"\3\2\2\2.\u00ae\3\2\2\2\60\62\5\4\3\2\61\60\3\2\2\2\62\63\3\2\2\2\63\61"+
		"\3\2\2\2\63\64\3\2\2\2\64\3\3\2\2\2\65\66\5\6\4\2\66\67\7\3\2\2\678\5"+
		"\f\7\289\7\4\2\29\5\3\2\2\2:;\5\b\5\2;<\7\5\2\2<=\5\36\20\2=H\7\6\2\2"+
		">I\3\2\2\2?I\5\n\6\2@E\5\n\6\2AB\7\7\2\2BD\5\n\6\2CA\3\2\2\2DG\3\2\2\2"+
		"EC\3\2\2\2EF\3\2\2\2FI\3\2\2\2GE\3\2\2\2H>\3\2\2\2H?\3\2\2\2H@\3\2\2\2"+
		"IJ\3\2\2\2JK\7\b\2\2K\7\3\2\2\2LM\7%\2\2M\t\3\2\2\2NO\7%\2\2O\13\3\2\2"+
		"\2P^\3\2\2\2Q^\5\16\b\2RW\5\16\b\2ST\7\7\2\2TV\5\16\b\2US\3\2\2\2VY\3"+
		"\2\2\2WU\3\2\2\2WX\3\2\2\2X[\3\2\2\2YW\3\2\2\2Z\\\7\7\2\2[Z\3\2\2\2[\\"+
		"\3\2\2\2\\^\3\2\2\2]P\3\2\2\2]Q\3\2\2\2]R\3\2\2\2^\r\3\2\2\2_n\5\20\t"+
		"\2`n\5\24\13\2an\5\26\f\2bn\5\30\r\2cn\5\32\16\2dn\5\34\17\2en\5\22\n"+
		"\2fn\5 \21\2gn\5$\23\2hn\5&\24\2in\5(\25\2jn\5*\26\2kn\5,\27\2ln\5.\30"+
		"\2m_\3\2\2\2m`\3\2\2\2ma\3\2\2\2mb\3\2\2\2mc\3\2\2\2md\3\2\2\2me\3\2\2"+
		"\2mf\3\2\2\2mg\3\2\2\2mh\3\2\2\2mi\3\2\2\2mj\3\2\2\2mk\3\2\2\2ml\3\2\2"+
		"\2n\17\3\2\2\2op\7\t\2\2pt\7\5\2\2qs\7\33\2\2rq\3\2\2\2sv\3\2\2\2tr\3"+
		"\2\2\2tu\3\2\2\2u\21\3\2\2\2vt\3\2\2\2wx\7\n\2\2xy\7\5\2\2yz\7\33\2\2"+
		"z\23\3\2\2\2{|\7\13\2\2|~\7\5\2\2}\177\7$\2\2~}\3\2\2\2\177\u0080\3\2"+
		"\2\2\u0080~\3\2\2\2\u0080\u0081\3\2\2\2\u0081\25\3\2\2\2\u0082\u0083\7"+
		"\f\2\2\u0083\u0084\7\5\2\2\u0084\u0085\7$\2\2\u0085\27\3\2\2\2\u0086\u0087"+
		"\7\r\2\2\u0087\u0088\7\5\2\2\u0088\u0089\7$\2\2\u0089\31\3\2\2\2\u008a"+
		"\u008b\7\16\2\2\u008b\u008c\7\5\2\2\u008c\u008d\7$\2\2\u008d\33\3\2\2"+
		"\2\u008e\u008f\7\17\2\2\u008f\u0090\7\5\2\2\u0090\u0091\7\35\2\2\u0091"+
		"\35\3\2\2\2\u0092\u0093\t\2\2\2\u0093\37\3\2\2\2\u0094\u0095\7\20\2\2"+
		"\u0095\u0096\7\5\2\2\u0096\u0097\5\"\22\2\u0097!\3\2\2\2\u0098\u0099\t"+
		"\3\2\2\u0099#\3\2\2\2\u009a\u009b\7\24\2\2\u009b\u009c\7\5\2\2\u009c\u009d"+
		"\7\32\2\2\u009d%\3\2\2\2\u009e\u009f\7\25\2\2\u009f\u00a0\7\5\2\2\u00a0"+
		"\u00a1\7\32\2\2\u00a1\'\3\2\2\2\u00a2\u00a3\7\26\2\2\u00a3\u00a4\7\5\2"+
		"\2\u00a4\u00a5\7\32\2\2\u00a5)\3\2\2\2\u00a6\u00a7\7\27\2\2\u00a7\u00a8"+
		"\7\5\2\2\u00a8\u00a9\7\32\2\2\u00a9+\3\2\2\2\u00aa\u00ab\7\30\2\2\u00ab"+
		"\u00ac\7\5\2\2\u00ac\u00ad\7\35\2\2\u00ad-\3\2\2\2\u00ae\u00af\7\31\2"+
		"\2\u00af\u00b0\7\5\2\2\u00b0\u00b1\7\35\2\2\u00b1/\3\2\2\2\13\63EHW[]"+
		"mt\u0080";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}