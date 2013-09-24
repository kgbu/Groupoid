// Generated from Groupoid.g4 by ANTLR 4.0
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class GroupoidParser extends Parser {
	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__4=1, T__3=2, T__2=3, T__1=4, T__0=5, ID=6, FLOAT=7, NUM=8, WS=9;
	public static final String[] tokenNames = {
		"<INVALID>", "'{'", "')'", "','", "'('", "'}'", "ID", "FLOAT", "NUM", 
		"WS"
	};
	public static final int
		RULE_group = 0, RULE_member = 1, RULE_weight = 2, RULE_position = 3;
	public static final String[] ruleNames = {
		"group", "member", "weight", "position"
	};

	@Override
	public String getGrammarFileName() { return "Groupoid.g4"; }

	@Override
	public String[] getTokenNames() { return tokenNames; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public ATN getATN() { return _ATN; }

	public GroupoidParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class GroupContext extends ParserRuleContext {
		public List<MemberContext> member() {
			return getRuleContexts(MemberContext.class);
		}
		public TerminalNode ID() { return getToken(GroupoidParser.ID, 0); }
		public MemberContext member(int i) {
			return getRuleContext(MemberContext.class,i);
		}
		public GroupContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupoidListener ) ((GroupoidListener)listener).enterGroup(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupoidListener ) ((GroupoidListener)listener).exitGroup(this);
		}
	}

	public final GroupContext group() throws RecognitionException {
		GroupContext _localctx = new GroupContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_group);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(8); match(ID);
			setState(9); match(1);
			setState(11);
			_la = _input.LA(1);
			if (_la==ID) {
				{
				setState(10); member();
				}
			}

			setState(17);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==3) {
				{
				{
				setState(13); match(3);
				setState(14); member();
				}
				}
				setState(19);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(20); match(5);
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

	public static class MemberContext extends ParserRuleContext {
		public PositionContext position() {
			return getRuleContext(PositionContext.class,0);
		}
		public WeightContext weight() {
			return getRuleContext(WeightContext.class,0);
		}
		public TerminalNode ID() { return getToken(GroupoidParser.ID, 0); }
		public MemberContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_member; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupoidListener ) ((GroupoidListener)listener).enterMember(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupoidListener ) ((GroupoidListener)listener).exitMember(this);
		}
	}

	public final MemberContext member() throws RecognitionException {
		MemberContext _localctx = new MemberContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_member);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(22); match(ID);
			setState(23); weight();
			setState(24); position();
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

	public static class WeightContext extends ParserRuleContext {
		public TerminalNode FLOAT() { return getToken(GroupoidParser.FLOAT, 0); }
		public WeightContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_weight; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupoidListener ) ((GroupoidListener)listener).enterWeight(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupoidListener ) ((GroupoidListener)listener).exitWeight(this);
		}
	}

	public final WeightContext weight() throws RecognitionException {
		WeightContext _localctx = new WeightContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_weight);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(26); match(FLOAT);
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

	public static class PositionContext extends ParserRuleContext {
		public List<TerminalNode> FLOAT() { return getTokens(GroupoidParser.FLOAT); }
		public TerminalNode FLOAT(int i) {
			return getToken(GroupoidParser.FLOAT, i);
		}
		public PositionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_position; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof GroupoidListener ) ((GroupoidListener)listener).enterPosition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof GroupoidListener ) ((GroupoidListener)listener).exitPosition(this);
		}
	}

	public final PositionContext position() throws RecognitionException {
		PositionContext _localctx = new PositionContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_position);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(28); match(4);
			setState(29); match(FLOAT);
			setState(30); match(3);
			setState(31); match(FLOAT);
			setState(32); match(2);
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
		"\2\3\13%\4\2\t\2\4\3\t\3\4\4\t\4\4\5\t\5\3\2\3\2\3\2\5\2\16\n\2\3\2\3"+
		"\2\7\2\22\n\2\f\2\16\2\25\13\2\3\2\3\2\3\3\3\3\3\3\3\3\3\4\3\4\3\5\3\5"+
		"\3\5\3\5\3\5\3\5\3\5\2\6\2\4\6\b\2\2\"\2\n\3\2\2\2\4\30\3\2\2\2\6\34\3"+
		"\2\2\2\b\36\3\2\2\2\n\13\7\b\2\2\13\r\7\3\2\2\f\16\5\4\3\2\r\f\3\2\2\2"+
		"\r\16\3\2\2\2\16\23\3\2\2\2\17\20\7\5\2\2\20\22\5\4\3\2\21\17\3\2\2\2"+
		"\22\25\3\2\2\2\23\21\3\2\2\2\23\24\3\2\2\2\24\26\3\2\2\2\25\23\3\2\2\2"+
		"\26\27\7\7\2\2\27\3\3\2\2\2\30\31\7\b\2\2\31\32\5\6\4\2\32\33\5\b\5\2"+
		"\33\5\3\2\2\2\34\35\7\t\2\2\35\7\3\2\2\2\36\37\7\6\2\2\37 \7\t\2\2 !\7"+
		"\5\2\2!\"\7\t\2\2\"#\7\4\2\2#\t\3\2\2\2\4\r\23";
	public static final ATN _ATN =
		ATNSimulator.deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
	}
}