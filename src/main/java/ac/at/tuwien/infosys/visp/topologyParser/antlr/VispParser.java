// Generated from /projects/dsg_practical/code/VISP-TopologyParser/src/main/java/ac/at/tuwien/infosys/visp/topologyParser/antlr/Visp.g4 by ANTLR 4.6
package ac.at.tuwien.infosys.visp.topologyParser.antlr;
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class VispParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.6", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, T__14=15, T__15=16, T__16=17, 
		T__17=18, T__18=19, T__19=20, T__20=21, T__21=22, T__22=23, T__23=24, 
		NUMBER=25, LOCATION=26, SLASH=27, STAR=28, BOOLEAN=29, IP_ADDRESS=30, 
		OCTET=31, DIGIT=32, SOURCE=33, OPERATOR=34, SINK=35, SPLIT=36, JOIN=37, 
		STRING=38, ID=39, RESOURCEPOOL=40, INT=41, PREPROC=42, WS=43;
	public static final int
		RULE_configfile = 0, RULE_nodeBlock = 1, RULE_nodeHead = 2, RULE_newNodeId = 3, 
		RULE_sourceNode = 4, RULE_nodeBody = 5, RULE_statement = 6, RULE_allowedLocationsStmt = 7, 
		RULE_concreteLocationStmt = 8, RULE_inputFormatStmt = 9, RULE_mechanismStmt = 10, 
		RULE_typeStmt = 11, RULE_outputFormatStmt = 12, RULE_statefulStmt = 13, 
		RULE_nodeType = 14, RULE_sizeStmt = 15, RULE_sizeType = 16, RULE_expectedDurationStmt = 17, 
		RULE_scalingCPUThresholdStmt = 18, RULE_scalingMemoryThresholdStmt = 19, 
		RULE_queueThreshold = 20, RULE_replicationAllowedStmt = 21, RULE_pinnedStmt = 22, 
		RULE_pathOrderStmt = 23;
	public static final String[] ruleNames = {
		"configfile", "nodeBlock", "nodeHead", "newNodeId", "sourceNode", "nodeBody", 
		"statement", "allowedLocationsStmt", "concreteLocationStmt", "inputFormatStmt", 
		"mechanismStmt", "typeStmt", "outputFormatStmt", "statefulStmt", "nodeType", 
		"sizeStmt", "sizeType", "expectedDurationStmt", "scalingCPUThresholdStmt", 
		"scalingMemoryThresholdStmt", "queueThreshold", "replicationAllowedStmt", 
		"pinnedStmt", "pathOrderStmt"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'{'", "'}'", "'='", "'('", "','", "')'", "'allowedLocations'", 
		"'concreteLocation'", "'inputFormat'", "'mechanism'", "'type'", "'outputFormat'", 
		"'stateful'", "'size'", "'small'", "'medium'", "'large'", "'expectedDuration'", 
		"'scalingCPUThreshold'", "'scalingMemoryThreshold'", "'queueThreshold'", 
		"'replicationAllowed'", "'pinned'", "'pathOrder'", null, null, "'/'", 
		"'*'", null, null, null, null, "'Source'", "'Operator'", "'Sink'", "'Split'", 
		"'Join'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, null, null, null, null, null, null, null, null, null, null, null, 
		null, "NUMBER", "LOCATION", "SLASH", "STAR", "BOOLEAN", "IP_ADDRESS", 
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
			setState(49); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(48);
				nodeBlock();
				}
				}
				setState(51); 
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
			setState(53);
			nodeHead();
			setState(54);
			match(T__0);
			setState(55);
			nodeBody();
			setState(56);
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
			setState(58);
			newNodeId();
			setState(59);
			match(T__2);
			setState(60);
			nodeType();
			setState(61);
			match(T__3);
			setState(72);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(63);
				sourceNode();
				}
				break;
			case 3:
				{
				setState(64);
				sourceNode();
				setState(69);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(65);
					match(T__4);
					setState(66);
					sourceNode();
					}
					}
					setState(71);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(74);
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
			setState(78);
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
			setState(93);
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
				setState(81);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(82);
				statement();
				setState(87);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(83);
						match(T__4);
						setState(84);
						statement();
						}
						} 
					}
					setState(89);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(90);
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
		public PathOrderStmtContext pathOrderStmt() {
			return getRuleContext(PathOrderStmtContext.class,0);
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
			setState(110);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(95);
				allowedLocationsStmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(96);
				inputFormatStmt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(97);
				mechanismStmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(98);
				typeStmt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(99);
				outputFormatStmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(100);
				statefulStmt();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 7);
				{
				setState(101);
				concreteLocationStmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 8);
				{
				setState(102);
				sizeStmt();
				}
				break;
			case T__17:
				enterOuterAlt(_localctx, 9);
				{
				setState(103);
				expectedDurationStmt();
				}
				break;
			case T__18:
				enterOuterAlt(_localctx, 10);
				{
				setState(104);
				scalingCPUThresholdStmt();
				}
				break;
			case T__19:
				enterOuterAlt(_localctx, 11);
				{
				setState(105);
				scalingMemoryThresholdStmt();
				}
				break;
			case T__20:
				enterOuterAlt(_localctx, 12);
				{
				setState(106);
				queueThreshold();
				}
				break;
			case T__21:
				enterOuterAlt(_localctx, 13);
				{
				setState(107);
				replicationAllowedStmt();
				}
				break;
			case T__22:
				enterOuterAlt(_localctx, 14);
				{
				setState(108);
				pinnedStmt();
				}
				break;
			case T__23:
				enterOuterAlt(_localctx, 15);
				{
				setState(109);
				pathOrderStmt();
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
			setState(112);
			match(T__6);
			setState(113);
			match(T__2);
			setState(117);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==LOCATION) {
				{
				{
				setState(114);
				match(LOCATION);
				}
				}
				setState(119);
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
			setState(120);
			match(T__7);
			setState(121);
			match(T__2);
			setState(122);
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
			setState(124);
			match(T__8);
			setState(125);
			match(T__2);
			setState(127); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(126);
				match(STRING);
				}
				}
				setState(129); 
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
			setState(131);
			match(T__9);
			setState(132);
			match(T__2);
			setState(133);
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
			setState(135);
			match(T__10);
			setState(136);
			match(T__2);
			setState(137);
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
			setState(139);
			match(T__11);
			setState(140);
			match(T__2);
			setState(141);
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
			setState(143);
			match(T__12);
			setState(144);
			match(T__2);
			setState(145);
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
		public TerminalNode JOIN() { return getToken(VispParser.JOIN, 0); }
		public TerminalNode SPLIT() { return getToken(VispParser.SPLIT, 0); }
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
			setState(147);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOURCE) | (1L << OPERATOR) | (1L << SINK) | (1L << SPLIT) | (1L << JOIN))) != 0)) ) {
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
			setState(149);
			match(T__13);
			setState(150);
			match(T__2);
			setState(151);
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
			setState(153);
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
			setState(155);
			match(T__17);
			setState(156);
			match(T__2);
			setState(157);
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
			setState(159);
			match(T__18);
			setState(160);
			match(T__2);
			setState(161);
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
			setState(163);
			match(T__19);
			setState(164);
			match(T__2);
			setState(165);
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
			setState(167);
			match(T__20);
			setState(168);
			match(T__2);
			setState(169);
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
			setState(171);
			match(T__21);
			setState(172);
			match(T__2);
			setState(173);
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
			setState(175);
			match(T__22);
			setState(176);
			match(T__2);
			setState(177);
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

	public static class PathOrderStmtContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(VispParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(VispParser.ID, i);
		}
		public PathOrderStmtContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pathOrderStmt; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).enterPathOrderStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof VispListener ) ((VispListener)listener).exitPathOrderStmt(this);
		}
	}

	public final PathOrderStmtContext pathOrderStmt() throws RecognitionException {
		PathOrderStmtContext _localctx = new PathOrderStmtContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_pathOrderStmt);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(179);
			match(T__23);
			setState(180);
			match(T__2);
			setState(182); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(181);
				match(ID);
				}
				}
				setState(184); 
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

	public static final String _serializedATN =
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3-\u00bd\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\3\2\6\2\64\n\2\r\2\16\2\65\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\3\4\3\4\3\4\7\4F\n\4\f\4\16\4I\13\4\5\4K\n\4\3\4\3\4\3\5\3\5\3\6\3"+
		"\6\3\7\3\7\3\7\3\7\3\7\7\7X\n\7\f\7\16\7[\13\7\3\7\5\7^\n\7\5\7`\n\7\3"+
		"\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\3\b\5\bq\n\b\3"+
		"\t\3\t\3\t\7\tv\n\t\f\t\16\ty\13\t\3\n\3\n\3\n\3\n\3\13\3\13\3\13\6\13"+
		"\u0082\n\13\r\13\16\13\u0083\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16\3\16"+
		"\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\21\3\21\3\21\3\21\3\22\3\22"+
		"\3\23\3\23\3\23\3\23\3\24\3\24\3\24\3\24\3\25\3\25\3\25\3\25\3\26\3\26"+
		"\3\26\3\26\3\27\3\27\3\27\3\27\3\30\3\30\3\30\3\30\3\31\3\31\3\31\6\31"+
		"\u00b9\n\31\r\31\16\31\u00ba\3\31\2\2\32\2\4\6\b\n\f\16\20\22\24\26\30"+
		"\32\34\36 \"$&(*,.\60\2\4\3\2#\'\3\2\21\23\u00bd\2\63\3\2\2\2\4\67\3\2"+
		"\2\2\6<\3\2\2\2\bN\3\2\2\2\nP\3\2\2\2\f_\3\2\2\2\16p\3\2\2\2\20r\3\2\2"+
		"\2\22z\3\2\2\2\24~\3\2\2\2\26\u0085\3\2\2\2\30\u0089\3\2\2\2\32\u008d"+
		"\3\2\2\2\34\u0091\3\2\2\2\36\u0095\3\2\2\2 \u0097\3\2\2\2\"\u009b\3\2"+
		"\2\2$\u009d\3\2\2\2&\u00a1\3\2\2\2(\u00a5\3\2\2\2*\u00a9\3\2\2\2,\u00ad"+
		"\3\2\2\2.\u00b1\3\2\2\2\60\u00b5\3\2\2\2\62\64\5\4\3\2\63\62\3\2\2\2\64"+
		"\65\3\2\2\2\65\63\3\2\2\2\65\66\3\2\2\2\66\3\3\2\2\2\678\5\6\4\289\7\3"+
		"\2\29:\5\f\7\2:;\7\4\2\2;\5\3\2\2\2<=\5\b\5\2=>\7\5\2\2>?\5\36\20\2?J"+
		"\7\6\2\2@K\3\2\2\2AK\5\n\6\2BG\5\n\6\2CD\7\7\2\2DF\5\n\6\2EC\3\2\2\2F"+
		"I\3\2\2\2GE\3\2\2\2GH\3\2\2\2HK\3\2\2\2IG\3\2\2\2J@\3\2\2\2JA\3\2\2\2"+
		"JB\3\2\2\2KL\3\2\2\2LM\7\b\2\2M\7\3\2\2\2NO\7)\2\2O\t\3\2\2\2PQ\7)\2\2"+
		"Q\13\3\2\2\2R`\3\2\2\2S`\5\16\b\2TY\5\16\b\2UV\7\7\2\2VX\5\16\b\2WU\3"+
		"\2\2\2X[\3\2\2\2YW\3\2\2\2YZ\3\2\2\2Z]\3\2\2\2[Y\3\2\2\2\\^\7\7\2\2]\\"+
		"\3\2\2\2]^\3\2\2\2^`\3\2\2\2_R\3\2\2\2_S\3\2\2\2_T\3\2\2\2`\r\3\2\2\2"+
		"aq\5\20\t\2bq\5\24\13\2cq\5\26\f\2dq\5\30\r\2eq\5\32\16\2fq\5\34\17\2"+
		"gq\5\22\n\2hq\5 \21\2iq\5$\23\2jq\5&\24\2kq\5(\25\2lq\5*\26\2mq\5,\27"+
		"\2nq\5.\30\2oq\5\60\31\2pa\3\2\2\2pb\3\2\2\2pc\3\2\2\2pd\3\2\2\2pe\3\2"+
		"\2\2pf\3\2\2\2pg\3\2\2\2ph\3\2\2\2pi\3\2\2\2pj\3\2\2\2pk\3\2\2\2pl\3\2"+
		"\2\2pm\3\2\2\2pn\3\2\2\2po\3\2\2\2q\17\3\2\2\2rs\7\t\2\2sw\7\5\2\2tv\7"+
		"\34\2\2ut\3\2\2\2vy\3\2\2\2wu\3\2\2\2wx\3\2\2\2x\21\3\2\2\2yw\3\2\2\2"+
		"z{\7\n\2\2{|\7\5\2\2|}\7\34\2\2}\23\3\2\2\2~\177\7\13\2\2\177\u0081\7"+
		"\5\2\2\u0080\u0082\7(\2\2\u0081\u0080\3\2\2\2\u0082\u0083\3\2\2\2\u0083"+
		"\u0081\3\2\2\2\u0083\u0084\3\2\2\2\u0084\25\3\2\2\2\u0085\u0086\7\f\2"+
		"\2\u0086\u0087\7\5\2\2\u0087\u0088\7(\2\2\u0088\27\3\2\2\2\u0089\u008a"+
		"\7\r\2\2\u008a\u008b\7\5\2\2\u008b\u008c\7(\2\2\u008c\31\3\2\2\2\u008d"+
		"\u008e\7\16\2\2\u008e\u008f\7\5\2\2\u008f\u0090\7(\2\2\u0090\33\3\2\2"+
		"\2\u0091\u0092\7\17\2\2\u0092\u0093\7\5\2\2\u0093\u0094\7\37\2\2\u0094"+
		"\35\3\2\2\2\u0095\u0096\t\2\2\2\u0096\37\3\2\2\2\u0097\u0098\7\20\2\2"+
		"\u0098\u0099\7\5\2\2\u0099\u009a\5\"\22\2\u009a!\3\2\2\2\u009b\u009c\t"+
		"\3\2\2\u009c#\3\2\2\2\u009d\u009e\7\24\2\2\u009e\u009f\7\5\2\2\u009f\u00a0"+
		"\7\33\2\2\u00a0%\3\2\2\2\u00a1\u00a2\7\25\2\2\u00a2\u00a3\7\5\2\2\u00a3"+
		"\u00a4\7\33\2\2\u00a4\'\3\2\2\2\u00a5\u00a6\7\26\2\2\u00a6\u00a7\7\5\2"+
		"\2\u00a7\u00a8\7\33\2\2\u00a8)\3\2\2\2\u00a9\u00aa\7\27\2\2\u00aa\u00ab"+
		"\7\5\2\2\u00ab\u00ac\7\33\2\2\u00ac+\3\2\2\2\u00ad\u00ae\7\30\2\2\u00ae"+
		"\u00af\7\5\2\2\u00af\u00b0\7\37\2\2\u00b0-\3\2\2\2\u00b1\u00b2\7\31\2"+
		"\2\u00b2\u00b3\7\5\2\2\u00b3\u00b4\7\37\2\2\u00b4/\3\2\2\2\u00b5\u00b6"+
		"\7\32\2\2\u00b6\u00b8\7\5\2\2\u00b7\u00b9\7)\2\2\u00b8\u00b7\3\2\2\2\u00b9"+
		"\u00ba\3\2\2\2\u00ba\u00b8\3\2\2\2\u00ba\u00bb\3\2\2\2\u00bb\61\3\2\2"+
		"\2\f\65GJY]_pw\u0083\u00ba";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}