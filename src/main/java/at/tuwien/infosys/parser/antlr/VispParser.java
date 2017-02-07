// Generated from /projects/dsg_practical/code/VISP-Runtime-dev/src/main/java/at/tuwien/infosys/topology/antlr/Visp.g4 by ANTLR 4.5.3
package at.tuwien.infosys.parser.antlr;

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
	static { RuntimeMetaData.checkVersion("4.5.3", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, T__1=2, T__2=3, T__3=4, T__4=5, T__5=6, T__6=7, T__7=8, T__8=9, 
		T__9=10, T__10=11, T__11=12, T__12=13, T__13=14, BOOLEAN=15, IP_ADDRESS=16, 
		OCTET=17, DIGIT=18, SOURCE=19, OPERATOR=20, SINK=21, STRING=22, ID=23, 
		INT=24, PREPROC=25, WS=26;
	public static final int
		RULE_configfile = 0, RULE_nodeBlock = 1, RULE_nodeHead = 2, RULE_newNodeId = 3, 
		RULE_sourceNode = 4, RULE_nodeBody = 5, RULE_statement = 6, RULE_allowedLocationsStmt = 7, 
		RULE_concreteLocationStmt = 8, RULE_inputFormatStmt = 9, RULE_sourceStmt = 10, 
		RULE_mechanismStmt = 11, RULE_typeStmt = 12, RULE_outputFormatStmt = 13, 
		RULE_statefulStmt = 14, RULE_nodeType = 15;
	public static final String[] ruleNames = {
		"configfile", "nodeBlock", "nodeHead", "newNodeId", "sourceNode", "nodeBody", 
		"statement", "allowedLocationsStmt", "concreteLocationStmt", "inputFormatStmt", 
		"sourceStmt", "mechanismStmt", "typeStmt", "outputFormatStmt", "statefulStmt", 
		"nodeType"
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
			setState(33); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(32);
				nodeBlock();
				}
				}
				setState(35); 
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
			setState(37);
			nodeHead();
			setState(38);
			match(T__0);
			setState(39);
			nodeBody();
			setState(40);
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
			setState(42);
			newNodeId();
			setState(43);
			match(T__2);
			setState(44);
			nodeType();
			setState(45);
			match(T__3);
			setState(56);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				}
				break;
			case 2:
				{
				setState(47);
				sourceNode();
				}
				break;
			case 3:
				{
				setState(48);
				sourceNode();
				setState(53);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==T__4) {
					{
					{
					setState(49);
					match(T__4);
					setState(50);
					sourceNode();
					}
					}
					setState(55);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			}
			setState(58);
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
			setState(60);
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
			setState(62);
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
			setState(77);
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
				setState(65);
				statement();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(66);
				statement();
				setState(71);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(67);
						match(T__4);
						setState(68);
						statement();
						}
						} 
					}
					setState(73);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,3,_ctx);
				}
				setState(75);
				_la = _input.LA(1);
				if (_la==T__4) {
					{
					setState(74);
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
			setState(87);
			switch (_input.LA(1)) {
			case T__6:
				enterOuterAlt(_localctx, 1);
				{
				setState(79);
				allowedLocationsStmt();
				}
				break;
			case T__8:
				enterOuterAlt(_localctx, 2);
				{
				setState(80);
				inputFormatStmt();
				}
				break;
			case T__9:
				enterOuterAlt(_localctx, 3);
				{
				setState(81);
				sourceStmt();
				}
				break;
			case T__10:
				enterOuterAlt(_localctx, 4);
				{
				setState(82);
				mechanismStmt();
				}
				break;
			case T__11:
				enterOuterAlt(_localctx, 5);
				{
				setState(83);
				typeStmt();
				}
				break;
			case T__12:
				enterOuterAlt(_localctx, 6);
				{
				setState(84);
				outputFormatStmt();
				}
				break;
			case T__13:
				enterOuterAlt(_localctx, 7);
				{
				setState(85);
				statefulStmt();
				}
				break;
			case T__7:
				enterOuterAlt(_localctx, 8);
				{
				setState(86);
				concreteLocationStmt();
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
		public List<TerminalNode> IP_ADDRESS() { return getTokens(VispParser.IP_ADDRESS); }
		public TerminalNode IP_ADDRESS(int i) {
			return getToken(VispParser.IP_ADDRESS, i);
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
			setState(89);
			match(T__6);
			setState(90);
			match(T__2);
			setState(94);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==IP_ADDRESS) {
				{
				{
				setState(91);
				match(IP_ADDRESS);
				}
				}
				setState(96);
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
		public TerminalNode IP_ADDRESS() { return getToken(VispParser.IP_ADDRESS, 0); }
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
			setState(97);
			match(T__7);
			setState(98);
			match(T__2);
			setState(99);
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
			setState(101);
			match(T__8);
			setState(102);
			match(T__2);
			setState(103);
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
			setState(105);
			match(T__9);
			setState(106);
			match(T__2);
			setState(107);
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
			setState(109);
			match(T__10);
			setState(110);
			match(T__2);
			setState(111);
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
			setState(113);
			match(T__11);
			setState(114);
			match(T__2);
			setState(115);
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
			setState(117);
			match(T__12);
			setState(118);
			match(T__2);
			setState(119);
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
			setState(121);
			match(T__13);
			setState(122);
			match(T__2);
			setState(123);
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
			setState(125);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << SOURCE) | (1L << OPERATOR) | (1L << SINK))) != 0)) ) {
			_errHandler.recoverInline(this);
			} else {
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
		"\3\u0430\ud6d1\u8206\uad2d\u4417\uaef1\u8d80\uaadd\3\34\u0082\4\2\t\2"+
		"\4\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13"+
		"\t\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\3\2\6\2"+
		"$\n\2\r\2\16\2%\3\3\3\3\3\3\3\3\3\3\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3"+
		"\4\7\4\66\n\4\f\4\16\49\13\4\5\4;\n\4\3\4\3\4\3\5\3\5\3\6\3\6\3\7\3\7"+
		"\3\7\3\7\3\7\7\7H\n\7\f\7\16\7K\13\7\3\7\5\7N\n\7\5\7P\n\7\3\b\3\b\3\b"+
		"\3\b\3\b\3\b\3\b\3\b\5\bZ\n\b\3\t\3\t\3\t\7\t_\n\t\f\t\16\tb\13\t\3\n"+
		"\3\n\3\n\3\n\3\13\3\13\3\13\3\13\3\f\3\f\3\f\3\f\3\r\3\r\3\r\3\r\3\16"+
		"\3\16\3\16\3\16\3\17\3\17\3\17\3\17\3\20\3\20\3\20\3\20\3\21\3\21\3\21"+
		"\2\2\22\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \2\3\3\2\25\27\u0081\2"+
		"#\3\2\2\2\4\'\3\2\2\2\6,\3\2\2\2\b>\3\2\2\2\n@\3\2\2\2\fO\3\2\2\2\16Y"+
		"\3\2\2\2\20[\3\2\2\2\22c\3\2\2\2\24g\3\2\2\2\26k\3\2\2\2\30o\3\2\2\2\32"+
		"s\3\2\2\2\34w\3\2\2\2\36{\3\2\2\2 \177\3\2\2\2\"$\5\4\3\2#\"\3\2\2\2$"+
		"%\3\2\2\2%#\3\2\2\2%&\3\2\2\2&\3\3\2\2\2\'(\5\6\4\2()\7\3\2\2)*\5\f\7"+
		"\2*+\7\4\2\2+\5\3\2\2\2,-\5\b\5\2-.\7\5\2\2./\5 \21\2/:\7\6\2\2\60;\3"+
		"\2\2\2\61;\5\n\6\2\62\67\5\n\6\2\63\64\7\7\2\2\64\66\5\n\6\2\65\63\3\2"+
		"\2\2\669\3\2\2\2\67\65\3\2\2\2\678\3\2\2\28;\3\2\2\29\67\3\2\2\2:\60\3"+
		"\2\2\2:\61\3\2\2\2:\62\3\2\2\2;<\3\2\2\2<=\7\b\2\2=\7\3\2\2\2>?\7\31\2"+
		"\2?\t\3\2\2\2@A\7\31\2\2A\13\3\2\2\2BP\3\2\2\2CP\5\16\b\2DI\5\16\b\2E"+
		"F\7\7\2\2FH\5\16\b\2GE\3\2\2\2HK\3\2\2\2IG\3\2\2\2IJ\3\2\2\2JM\3\2\2\2"+
		"KI\3\2\2\2LN\7\7\2\2ML\3\2\2\2MN\3\2\2\2NP\3\2\2\2OB\3\2\2\2OC\3\2\2\2"+
		"OD\3\2\2\2P\r\3\2\2\2QZ\5\20\t\2RZ\5\24\13\2SZ\5\26\f\2TZ\5\30\r\2UZ\5"+
		"\32\16\2VZ\5\34\17\2WZ\5\36\20\2XZ\5\22\n\2YQ\3\2\2\2YR\3\2\2\2YS\3\2"+
		"\2\2YT\3\2\2\2YU\3\2\2\2YV\3\2\2\2YW\3\2\2\2YX\3\2\2\2Z\17\3\2\2\2[\\"+
		"\7\t\2\2\\`\7\5\2\2]_\7\22\2\2^]\3\2\2\2_b\3\2\2\2`^\3\2\2\2`a\3\2\2\2"+
		"a\21\3\2\2\2b`\3\2\2\2cd\7\n\2\2de\7\5\2\2ef\7\22\2\2f\23\3\2\2\2gh\7"+
		"\13\2\2hi\7\5\2\2ij\7\30\2\2j\25\3\2\2\2kl\7\f\2\2lm\7\5\2\2mn\7\30\2"+
		"\2n\27\3\2\2\2op\7\r\2\2pq\7\5\2\2qr\7\30\2\2r\31\3\2\2\2st\7\16\2\2t"+
		"u\7\5\2\2uv\7\30\2\2v\33\3\2\2\2wx\7\17\2\2xy\7\5\2\2yz\7\30\2\2z\35\3"+
		"\2\2\2{|\7\20\2\2|}\7\5\2\2}~\7\21\2\2~\37\3\2\2\2\177\u0080\t\2\2\2\u0080"+
		"!\3\2\2\2\n%\67:IMOY`";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}