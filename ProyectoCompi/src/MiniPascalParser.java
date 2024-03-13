// Generated from C:/Users/eduar/OneDrive/Documents/GitHub/ProyectoCompi1/ProyectoCompi/src/MiniPascal.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast", "CheckReturnValue"})
public class MiniPascalParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.13.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, AND=2, ARRAY=3, BEGIN=4, CASE=5, CONST=6, DIV=7, DO=8, DOWNTO=9, 
		ELSE=10, ELSEIF=11, END=12, FILE=13, FOR=14, FUNCTION=15, GOTO=16, IF=17, 
		IN=18, LABEL=19, MOD=20, NIL=21, NOT=22, OR=23, OF=24, PACKED=25, PROCEDURE=26, 
		PROGRAM=27, READ=28, RECORD=29, REPEAT=30, SET=31, THEN=32, TO=33, TYPE=34, 
		UNTIL=35, VAR=36, WHILE=37, WRITE=38, WRITELN=39, WITH=40, INTEGER=41, 
		FLOAT=42, CHARACTER=43, BOOLEAN=44, STRING=45, CONSTCHAR=46, CONSTSTR=47, 
		CONST_VAL=48, ID=49, PERIOD=50, COMMA=51, COLON=52, SEMICOLON=53, LEFTPAREN=54, 
		RIGHTPAREN=55, LEFTBRACKET=56, RIGHTBRACKET=57, ASSIGN=58, PLUS=59, MINUS=60, 
		ASTERISK=61, SLASH=62, MAYORQUE=63, MENORQUE=64, MAYORIGUAL=65, MENORIGUAL=66, 
		IGUAL=67, DISTINTO=68, BOOL_VAL=69, TRUE=70, FALSE=71, NEWLINE=72, STR=73, 
		ESC=74, COMMENT=75, LETTER=76, REALNUM=77, DECIMAL=78, DIGIT=79, WS=80;
	public static final int
		RULE_program = 0, RULE_program_block = 1, RULE_function_block = 2, RULE_function_call = 3, 
		RULE_function_var_decl = 4, RULE_instr = 5, RULE_read_call = 6, RULE_write_call = 7, 
		RULE_for_loop = 8, RULE_while_loop = 9, RULE_repeat_loop = 10, RULE_if_statement = 11, 
		RULE_if_condition = 12, RULE_var_block = 13, RULE_var_decl = 14, RULE_var_init = 15, 
		RULE_var_type = 16, RULE_array_type = 17, RULE_array_ID = 18, RULE_const_type = 19, 
		RULE_expr = 20, RULE_math_expr = 21, RULE_bool_expr = 22, RULE_comparison = 23, 
		RULE_logical_opr = 24, RULE_size = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_block", "function_block", "function_call", "function_var_decl", 
			"instr", "read_call", "write_call", "for_loop", "while_loop", "repeat_loop", 
			"if_statement", "if_condition", "var_block", "var_decl", "var_init", 
			"var_type", "array_type", "array_ID", "const_type", "expr", "math_expr", 
			"bool_expr", "comparison", "logical_opr", "size"
		};
	}
	public static final String[] ruleNames = makeRuleNames();

	private static String[] makeLiteralNames() {
		return new String[] {
			null, "'..'", "'and'", "'array'", "'begin'", "'case'", "'const'", "'div'", 
			"'do'", "'downto'", "'else'", "'elseif'", "'end'", "'file'", "'for'", 
			"'function'", "'goto'", "'if'", "'in'", "'label'", "'mod'", "'nil'", 
			"'not'", "'or'", "'of'", "'packed'", "'procedure'", "'program'", "'read'", 
			"'record'", "'repeat'", "'set'", "'then'", "'to'", "'type'", "'until'", 
			"'var'", "'while'", "'write'", "'writeln'", "'with'", "'INTEGER'", "'float'", 
			"'CHARACTER'", "'BOOLEAN'", "'STRING'", "'CONSTCHAR'", "'CONSTSTR'", 
			null, null, "'.'", "','", "':'", "';'", "'('", "')'", "'['", "']'", "':='", 
			"'+'", "'-'", "'*'", "'/'", "'>'", "'<'", "'>='", "'<='", "'='", "'<>'", 
			null, "'true'", "'false'"
		};
	}
	private static final String[] _LITERAL_NAMES = makeLiteralNames();
	private static String[] makeSymbolicNames() {
		return new String[] {
			null, null, "AND", "ARRAY", "BEGIN", "CASE", "CONST", "DIV", "DO", "DOWNTO", 
			"ELSE", "ELSEIF", "END", "FILE", "FOR", "FUNCTION", "GOTO", "IF", "IN", 
			"LABEL", "MOD", "NIL", "NOT", "OR", "OF", "PACKED", "PROCEDURE", "PROGRAM", 
			"READ", "RECORD", "REPEAT", "SET", "THEN", "TO", "TYPE", "UNTIL", "VAR", 
			"WHILE", "WRITE", "WRITELN", "WITH", "INTEGER", "FLOAT", "CHARACTER", 
			"BOOLEAN", "STRING", "CONSTCHAR", "CONSTSTR", "CONST_VAL", "ID", "PERIOD", 
			"COMMA", "COLON", "SEMICOLON", "LEFTPAREN", "RIGHTPAREN", "LEFTBRACKET", 
			"RIGHTBRACKET", "ASSIGN", "PLUS", "MINUS", "ASTERISK", "SLASH", "MAYORQUE", 
			"MENORQUE", "MAYORIGUAL", "MENORIGUAL", "IGUAL", "DISTINTO", "BOOL_VAL", 
			"TRUE", "FALSE", "NEWLINE", "STR", "ESC", "COMMENT", "LETTER", "REALNUM", 
			"DECIMAL", "DIGIT", "WS"
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
	public String getGrammarFileName() { return "MiniPascal.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public MiniPascalParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}

	@SuppressWarnings("CheckReturnValue")
	public static class ProgramContext extends ParserRuleContext {
		public Program_blockContext program_block() {
			return getRuleContext(Program_blockContext.class,0);
		}
		public TerminalNode EOF() { return getToken(MiniPascalParser.EOF, 0); }
		public ProgramContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterProgram(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitProgram(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitProgram(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ProgramContext program() throws RecognitionException {
		ProgramContext _localctx = new ProgramContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_program);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(52);
			program_block();
			setState(53);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
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
	public static class Program_blockContext extends ParserRuleContext {
		public TerminalNode PROGRAM() { return getToken(MiniPascalParser.PROGRAM, 0); }
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public TerminalNode PERIOD() { return getToken(MiniPascalParser.PERIOD, 0); }
		public Var_blockContext var_block() {
			return getRuleContext(Var_blockContext.class,0);
		}
		public Function_blockContext function_block() {
			return getRuleContext(Function_blockContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public Program_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_program_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterProgram_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitProgram_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitProgram_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Program_blockContext program_block() throws RecognitionException {
		Program_blockContext _localctx = new Program_blockContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_program_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(55);
			match(PROGRAM);
			setState(56);
			match(ID);
			setState(57);
			match(SEMICOLON);
			setState(59);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==VAR) {
				{
				setState(58);
				var_block();
				}
			}

			setState(62);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==FUNCTION) {
				{
				setState(61);
				function_block();
				}
			}

			setState(64);
			match(BEGIN);
			setState(66); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(65);
				instr();
				}
				}
				setState(68); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 563913368420352L) != 0) );
			setState(70);
			match(END);
			setState(71);
			match(PERIOD);
			}
		}
		catch (RecognitionException re) {
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
	public static class Function_blockContext extends ParserRuleContext {
		public List<TerminalNode> FUNCTION() { return getTokens(MiniPascalParser.FUNCTION); }
		public TerminalNode FUNCTION(int i) {
			return getToken(MiniPascalParser.FUNCTION, i);
		}
		public List<TerminalNode> ID() { return getTokens(MiniPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPascalParser.ID, i);
		}
		public List<TerminalNode> LEFTPAREN() { return getTokens(MiniPascalParser.LEFTPAREN); }
		public TerminalNode LEFTPAREN(int i) {
			return getToken(MiniPascalParser.LEFTPAREN, i);
		}
		public List<TerminalNode> RIGHTPAREN() { return getTokens(MiniPascalParser.RIGHTPAREN); }
		public TerminalNode RIGHTPAREN(int i) {
			return getToken(MiniPascalParser.RIGHTPAREN, i);
		}
		public List<TerminalNode> COLON() { return getTokens(MiniPascalParser.COLON); }
		public TerminalNode COLON(int i) {
			return getToken(MiniPascalParser.COLON, i);
		}
		public List<Var_typeContext> var_type() {
			return getRuleContexts(Var_typeContext.class);
		}
		public Var_typeContext var_type(int i) {
			return getRuleContext(Var_typeContext.class,i);
		}
		public List<TerminalNode> SEMICOLON() { return getTokens(MiniPascalParser.SEMICOLON); }
		public TerminalNode SEMICOLON(int i) {
			return getToken(MiniPascalParser.SEMICOLON, i);
		}
		public List<TerminalNode> BEGIN() { return getTokens(MiniPascalParser.BEGIN); }
		public TerminalNode BEGIN(int i) {
			return getToken(MiniPascalParser.BEGIN, i);
		}
		public List<TerminalNode> END() { return getTokens(MiniPascalParser.END); }
		public TerminalNode END(int i) {
			return getToken(MiniPascalParser.END, i);
		}
		public List<Function_var_declContext> function_var_decl() {
			return getRuleContexts(Function_var_declContext.class);
		}
		public Function_var_declContext function_var_decl(int i) {
			return getRuleContext(Function_var_declContext.class,i);
		}
		public List<Var_blockContext> var_block() {
			return getRuleContexts(Var_blockContext.class);
		}
		public Var_blockContext var_block(int i) {
			return getRuleContext(Var_blockContext.class,i);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public Function_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFunction_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFunction_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFunction_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_blockContext function_block() throws RecognitionException {
		Function_blockContext _localctx = new Function_blockContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_function_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(102); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(73);
				match(FUNCTION);
				setState(74);
				match(ID);
				setState(75);
				match(LEFTPAREN);
				setState(84);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ID) {
					{
					setState(76);
					function_var_decl();
					setState(81);
					_errHandler.sync(this);
					_la = _input.LA(1);
					while (_la==SEMICOLON) {
						{
						{
						setState(77);
						match(SEMICOLON);
						setState(78);
						function_var_decl();
						}
						}
						setState(83);
						_errHandler.sync(this);
						_la = _input.LA(1);
					}
					}
				}

				setState(86);
				match(RIGHTPAREN);
				setState(87);
				match(COLON);
				setState(88);
				var_type();
				setState(89);
				match(SEMICOLON);
				setState(91);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==VAR) {
					{
					setState(90);
					var_block();
					}
				}

				setState(93);
				match(BEGIN);
				setState(95); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(94);
					instr();
					}
					}
					setState(97); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 563913368420352L) != 0) );
				setState(99);
				match(END);
				setState(100);
				match(SEMICOLON);
				}
				}
				setState(104); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( _la==FUNCTION );
			}
		}
		catch (RecognitionException re) {
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
	public static class Function_callContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public Function_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFunction_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFunction_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFunction_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_callContext function_call() throws RecognitionException {
		Function_callContext _localctx = new Function_callContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_function_call);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(106);
			match(ID);
			setState(107);
			match(LEFTPAREN);
			setState(116);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 110478932788117505L) != 0)) {
				{
				setState(108);
				expr();
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(109);
					match(COMMA);
					setState(110);
					expr();
					}
					}
					setState(115);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
			}

			setState(118);
			match(RIGHTPAREN);
			setState(119);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
	public static class Function_var_declContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPascalParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public TerminalNode ARRAY() { return getToken(MiniPascalParser.ARRAY, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(MiniPascalParser.LEFTBRACKET, 0); }
		public List<SizeContext> size() {
			return getRuleContexts(SizeContext.class);
		}
		public SizeContext size(int i) {
			return getRuleContext(SizeContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(MiniPascalParser.RIGHTBRACKET, 0); }
		public TerminalNode OF() { return getToken(MiniPascalParser.OF, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
		public Function_var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFunction_var_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFunction_var_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFunction_var_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_var_declContext function_var_decl() throws RecognitionException {
		Function_var_declContext _localctx = new Function_var_declContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_function_var_decl);
		int _la;
		try {
			setState(161);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,14,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(121);
				match(ID);
				setState(126);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(122);
					match(COMMA);
					setState(123);
					match(ID);
					}
					}
					setState(128);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(129);
				match(COLON);
				setState(130);
				var_type();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(131);
				match(ID);
				setState(136);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(132);
					match(COMMA);
					setState(133);
					match(ID);
					}
					}
					setState(138);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(139);
				match(COLON);
				setState(140);
				match(ARRAY);
				setState(141);
				match(LEFTBRACKET);
				setState(142);
				size();
				setState(145);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(143);
					match(COMMA);
					setState(144);
					size();
					}
				}

				setState(147);
				match(RIGHTBRACKET);
				setState(148);
				match(OF);
				setState(149);
				array_type();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(151);
				match(ID);
				setState(156);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(152);
					match(COMMA);
					setState(153);
					match(ID);
					}
					}
					setState(158);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(159);
				match(COLON);
				setState(160);
				const_type();
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
	public static class InstrContext extends ParserRuleContext {
		public Var_initContext var_init() {
			return getRuleContext(Var_initContext.class,0);
		}
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public Read_callContext read_call() {
			return getRuleContext(Read_callContext.class,0);
		}
		public Write_callContext write_call() {
			return getRuleContext(Write_callContext.class,0);
		}
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public Repeat_loopContext repeat_loop() {
			return getRuleContext(Repeat_loopContext.class,0);
		}
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final InstrContext instr() throws RecognitionException {
		InstrContext _localctx = new InstrContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_instr);
		try {
			setState(171);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,15,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				var_init();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				function_call();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				read_call();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				write_call();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				for_loop();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				while_loop();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				repeat_loop();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(170);
				if_statement();
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
	public static class Read_callContext extends ParserRuleContext {
		public TerminalNode READ() { return getToken(MiniPascalParser.READ, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public Read_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_read_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterRead_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitRead_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitRead_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Read_callContext read_call() throws RecognitionException {
		Read_callContext _localctx = new Read_callContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_read_call);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(173);
			match(READ);
			setState(174);
			match(LEFTPAREN);
			setState(175);
			match(ID);
			setState(176);
			match(RIGHTPAREN);
			setState(177);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
	public static class Write_callContext extends ParserRuleContext {
		public TerminalNode WRITELN() { return getToken(MiniPascalParser.WRITELN, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public TerminalNode CONST_VAL() { return getToken(MiniPascalParser.CONST_VAL, 0); }
		public TerminalNode COMMA() { return getToken(MiniPascalParser.COMMA, 0); }
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public TerminalNode STR() { return getToken(MiniPascalParser.STR, 0); }
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode WRITE() { return getToken(MiniPascalParser.WRITE, 0); }
		public Write_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_call; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWrite_call(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWrite_call(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWrite_call(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Write_callContext write_call() throws RecognitionException {
		Write_callContext _localctx = new Write_callContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_write_call);
		int _la;
		try {
			setState(205);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case WRITELN:
				enterOuterAlt(_localctx, 1);
				{
				setState(179);
				match(WRITELN);
				setState(180);
				match(LEFTPAREN);
				{
				setState(181);
				match(CONST_VAL);
				}
				setState(188);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(182);
					match(COMMA);
					setState(186);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,16,_ctx) ) {
					case 1:
						{
						setState(183);
						math_expr(0);
						}
						break;
					case 2:
						{
						setState(184);
						match(STR);
						}
						break;
					case 3:
						{
						setState(185);
						match(ID);
						}
						break;
					}
					}
				}

				setState(190);
				match(RIGHTPAREN);
				setState(191);
				match(SEMICOLON);
				}
				break;
			case WRITE:
				enterOuterAlt(_localctx, 2);
				{
				setState(192);
				match(WRITE);
				setState(193);
				match(LEFTPAREN);
				{
				setState(194);
				match(CONST_VAL);
				}
				setState(201);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(195);
					match(COMMA);
					setState(199);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,18,_ctx) ) {
					case 1:
						{
						setState(196);
						math_expr(0);
						}
						break;
					case 2:
						{
						setState(197);
						match(STR);
						}
						break;
					case 3:
						{
						setState(198);
						match(ID);
						}
						break;
					}
					}
				}

				setState(203);
				match(RIGHTPAREN);
				setState(204);
				match(SEMICOLON);
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
	public static class For_loopContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(MiniPascalParser.FOR, 0); }
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode TO() { return getToken(MiniPascalParser.TO, 0); }
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public TerminalNode DOWNTO() { return getToken(MiniPascalParser.DOWNTO, 0); }
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFor_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFor_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFor_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_loopContext for_loop() throws RecognitionException {
		For_loopContext _localctx = new For_loopContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_for_loop);
		int _la;
		try {
			setState(257);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(FOR);
				setState(208);
				match(ID);
				setState(209);
				match(ASSIGN);
				setState(210);
				expr();
				setState(211);
				match(TO);
				setState(212);
				expr();
				setState(213);
				match(DO);
				{
				setState(214);
				instr();
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(FOR);
				setState(217);
				match(ID);
				setState(218);
				match(ASSIGN);
				setState(219);
				expr();
				setState(220);
				match(TO);
				setState(221);
				expr();
				setState(222);
				match(DO);
				{
				setState(223);
				match(BEGIN);
				setState(225); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(224);
					instr();
					}
					}
					setState(227); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 563913368420352L) != 0) );
				setState(229);
				match(END);
				setState(230);
				match(SEMICOLON);
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(FOR);
				setState(233);
				match(ID);
				setState(234);
				match(ASSIGN);
				setState(235);
				expr();
				setState(236);
				match(DOWNTO);
				setState(237);
				expr();
				setState(238);
				match(DO);
				{
				setState(239);
				instr();
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(FOR);
				setState(242);
				match(ID);
				setState(243);
				match(ASSIGN);
				setState(244);
				expr();
				setState(245);
				match(DOWNTO);
				setState(246);
				expr();
				setState(247);
				match(DO);
				{
				setState(248);
				match(BEGIN);
				setState(250); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(249);
					instr();
					}
					}
					setState(252); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 563913368420352L) != 0) );
				setState(254);
				match(END);
				setState(255);
				match(SEMICOLON);
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
	public static class While_loopContext extends ParserRuleContext {
		public TerminalNode WHILE() { return getToken(MiniPascalParser.WHILE, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWhile_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWhile_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWhile_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_while_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			match(WHILE);
			setState(260);
			match(LEFTPAREN);
			setState(261);
			expr();
			setState(262);
			comparison();
			setState(263);
			expr();
			setState(264);
			match(RIGHTPAREN);
			setState(265);
			match(DO);
			{
			setState(266);
			match(BEGIN);
			setState(268); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(267);
				instr();
				}
				}
				setState(270); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 563913368420352L) != 0) );
			setState(272);
			match(END);
			setState(273);
			match(SEMICOLON);
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
	public static class Repeat_loopContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(MiniPascalParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(MiniPascalParser.UNTIL, 0); }
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public Repeat_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_repeat_loop; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterRepeat_loop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitRepeat_loop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitRepeat_loop(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Repeat_loopContext repeat_loop() throws RecognitionException {
		Repeat_loopContext _localctx = new Repeat_loopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_repeat_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(REPEAT);
			setState(277); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(276);
				instr();
				}
				}
				setState(279); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 563913368420352L) != 0) );
			setState(281);
			match(UNTIL);
			setState(282);
			bool_expr(0);
			setState(283);
			match(SEMICOLON);
			}
		}
		catch (RecognitionException re) {
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
	public static class If_statementContext extends ParserRuleContext {
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public List<TerminalNode> LEFTPAREN() { return getTokens(MiniPascalParser.LEFTPAREN); }
		public TerminalNode LEFTPAREN(int i) {
			return getToken(MiniPascalParser.LEFTPAREN, i);
		}
		public List<If_conditionContext> if_condition() {
			return getRuleContexts(If_conditionContext.class);
		}
		public If_conditionContext if_condition(int i) {
			return getRuleContext(If_conditionContext.class,i);
		}
		public List<TerminalNode> RIGHTPAREN() { return getTokens(MiniPascalParser.RIGHTPAREN); }
		public TerminalNode RIGHTPAREN(int i) {
			return getToken(MiniPascalParser.RIGHTPAREN, i);
		}
		public List<TerminalNode> THEN() { return getTokens(MiniPascalParser.THEN); }
		public TerminalNode THEN(int i) {
			return getToken(MiniPascalParser.THEN, i);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public List<TerminalNode> ELSEIF() { return getTokens(MiniPascalParser.ELSEIF); }
		public TerminalNode ELSEIF(int i) {
			return getToken(MiniPascalParser.ELSEIF, i);
		}
		public List<TerminalNode> ELSE() { return getTokens(MiniPascalParser.ELSE); }
		public TerminalNode ELSE(int i) {
			return getToken(MiniPascalParser.ELSE, i);
		}
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterIf_statement(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitIf_statement(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIf_statement(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_if_statement);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(285);
			match(IF);
			setState(286);
			match(LEFTPAREN);
			setState(287);
			if_condition();
			setState(288);
			match(RIGHTPAREN);
			setState(289);
			match(THEN);
			setState(291); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(290);
					instr();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(293); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,26,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			setState(307);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(295);
					match(ELSEIF);
					setState(296);
					match(LEFTPAREN);
					setState(297);
					if_condition();
					setState(298);
					match(RIGHTPAREN);
					setState(299);
					match(THEN);
					setState(301); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(300);
							instr();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(303); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,27,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(309);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
			}
			setState(318);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(310);
					match(ELSE);
					setState(312); 
					_errHandler.sync(this);
					_alt = 1;
					do {
						switch (_alt) {
						case 1:
							{
							{
							setState(311);
							instr();
							}
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(314); 
						_errHandler.sync(this);
						_alt = getInterpreter().adaptivePredict(_input,29,_ctx);
					} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
					}
					} 
				}
				setState(320);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,30,_ctx);
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
	public static class If_conditionContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public List<Logical_oprContext> logical_opr() {
			return getRuleContexts(Logical_oprContext.class);
		}
		public Logical_oprContext logical_opr(int i) {
			return getRuleContext(Logical_oprContext.class,i);
		}
		public If_conditionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_condition; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterIf_condition(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitIf_condition(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIf_condition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_conditionContext if_condition() throws RecognitionException {
		If_conditionContext _localctx = new If_conditionContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(321);
			expr();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(322);
				logical_opr();
				setState(323);
				expr();
				}
				}
				setState(329);
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
	public static class Var_blockContext extends ParserRuleContext {
		public TerminalNode VAR() { return getToken(MiniPascalParser.VAR, 0); }
		public List<Var_declContext> var_decl() {
			return getRuleContexts(Var_declContext.class);
		}
		public Var_declContext var_decl(int i) {
			return getRuleContext(Var_declContext.class,i);
		}
		public Var_blockContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_block; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_block(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_block(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_block(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_blockContext var_block() throws RecognitionException {
		Var_blockContext _localctx = new Var_blockContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_var_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(330);
			match(VAR);
			setState(332); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(331);
				var_decl();
				}
				}
				setState(334); 
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

	@SuppressWarnings("CheckReturnValue")
	public static class Var_declContext extends ParserRuleContext {
		public List<TerminalNode> ID() { return getTokens(MiniPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPascalParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public TerminalNode ARRAY() { return getToken(MiniPascalParser.ARRAY, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(MiniPascalParser.LEFTBRACKET, 0); }
		public List<SizeContext> size() {
			return getRuleContexts(SizeContext.class);
		}
		public SizeContext size(int i) {
			return getRuleContext(SizeContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(MiniPascalParser.RIGHTBRACKET, 0); }
		public TerminalNode OF() { return getToken(MiniPascalParser.OF, 0); }
		public Array_typeContext array_type() {
			return getRuleContext(Array_typeContext.class,0);
		}
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
		public TerminalNode CONST_VAL() { return getToken(MiniPascalParser.CONST_VAL, 0); }
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_decl(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_decl(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_decl(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_var_decl);
		int _la;
		try {
			setState(395);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(336);
				match(ID);
				setState(337);
				match(COLON);
				setState(338);
				var_type();
				setState(339);
				match(ASSIGN);
				setState(340);
				expr();
				setState(341);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(343);
				match(ID);
				setState(348);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(344);
					match(COMMA);
					setState(345);
					match(ID);
					}
					}
					setState(350);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(351);
				match(COLON);
				setState(352);
				var_type();
				setState(353);
				match(SEMICOLON);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(355);
				match(ID);
				setState(360);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(356);
					match(COMMA);
					setState(357);
					match(ID);
					}
					}
					setState(362);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(363);
				match(COLON);
				setState(364);
				match(ARRAY);
				setState(365);
				match(LEFTBRACKET);
				setState(366);
				size();
				setState(369);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(367);
					match(COMMA);
					setState(368);
					size();
					}
				}

				setState(371);
				match(RIGHTBRACKET);
				setState(372);
				match(OF);
				setState(373);
				array_type();
				setState(374);
				match(SEMICOLON);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(376);
				match(ID);
				setState(377);
				match(COLON);
				setState(378);
				const_type();
				setState(379);
				match(ASSIGN);
				setState(380);
				match(CONST_VAL);
				setState(381);
				match(SEMICOLON);
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(383);
				match(ID);
				setState(388);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(384);
					match(COMMA);
					setState(385);
					match(ID);
					}
					}
					setState(390);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(391);
				match(COLON);
				setState(392);
				const_type();
				setState(393);
				match(SEMICOLON);
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
	public static class Var_initContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(MiniPascalParser.LEFTBRACKET, 0); }
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(MiniPascalParser.RIGHTBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(MiniPascalParser.COMMA, 0); }
		public Var_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_init; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_init(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_init(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_init(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_initContext var_init() throws RecognitionException {
		Var_initContext _localctx = new Var_initContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_var_init);
		int _la;
		try {
			setState(414);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,39,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(397);
				match(ID);
				setState(398);
				match(ASSIGN);
				setState(399);
				expr();
				setState(400);
				match(SEMICOLON);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(402);
				match(ID);
				setState(403);
				match(LEFTBRACKET);
				setState(404);
				math_expr(0);
				setState(407);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(405);
					match(COMMA);
					setState(406);
					math_expr(0);
					}
				}

				setState(409);
				match(RIGHTBRACKET);
				setState(410);
				match(ASSIGN);
				setState(411);
				expr();
				setState(412);
				match(SEMICOLON);
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
	public static class Var_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public TerminalNode CHARACTER() { return getToken(MiniPascalParser.CHARACTER, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public TerminalNode STRING() { return getToken(MiniPascalParser.STRING, 0); }
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 63771674411008L) != 0)) ) {
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
	public static class Array_typeContext extends ParserRuleContext {
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public TerminalNode CHARACTER() { return getToken(MiniPascalParser.CHARACTER, 0); }
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterArray_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitArray_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitArray_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_array_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(418);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 28587302322176L) != 0)) ) {
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
	public static class Array_IDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(MiniPascalParser.LEFTBRACKET, 0); }
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(MiniPascalParser.RIGHTBRACKET, 0); }
		public TerminalNode COMMA() { return getToken(MiniPascalParser.COMMA, 0); }
		public Array_IDContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_ID; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterArray_ID(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitArray_ID(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitArray_ID(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_IDContext array_ID() throws RecognitionException {
		Array_IDContext _localctx = new Array_IDContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_array_ID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(420);
			match(ID);
			setState(421);
			match(LEFTBRACKET);
			setState(422);
			math_expr(0);
			setState(425);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(423);
				match(COMMA);
				setState(424);
				math_expr(0);
				}
			}

			setState(427);
			match(RIGHTBRACKET);
			}
		}
		catch (RecognitionException re) {
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
	public static class Const_typeContext extends ParserRuleContext {
		public TerminalNode CONSTCHAR() { return getToken(MiniPascalParser.CONSTCHAR, 0); }
		public TerminalNode CONSTSTR() { return getToken(MiniPascalParser.CONSTSTR, 0); }
		public Const_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_type; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterConst_type(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitConst_type(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitConst_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_typeContext const_type() throws RecognitionException {
		Const_typeContext _localctx = new Const_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_const_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(429);
			_la = _input.LA(1);
			if ( !(_la==CONSTCHAR || _la==CONSTSTR) ) {
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
	public static class ExprContext extends ParserRuleContext {
		public Math_exprContext math_expr() {
			return getRuleContext(Math_exprContext.class,0);
		}
		public Bool_exprContext bool_expr() {
			return getRuleContext(Bool_exprContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode STR() { return getToken(MiniPascalParser.STR, 0); }
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExpr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExpr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExpr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		ExprContext _localctx = new ExprContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_expr);
		try {
			setState(435);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(431);
				math_expr(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(432);
				bool_expr(0);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(433);
				match(ID);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(434);
				match(STR);
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
	public static class Math_exprContext extends ParserRuleContext {
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public TerminalNode DECIMAL() { return getToken(MiniPascalParser.DECIMAL, 0); }
		public TerminalNode REALNUM() { return getToken(MiniPascalParser.REALNUM, 0); }
		public Array_IDContext array_ID() {
			return getRuleContext(Array_IDContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode ASTERISK() { return getToken(MiniPascalParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(MiniPascalParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(MiniPascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiniPascalParser.MOD, 0); }
		public TerminalNode PLUS() { return getToken(MiniPascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniPascalParser.MINUS, 0); }
		public Math_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterMath_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitMath_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitMath_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_exprContext math_expr() throws RecognitionException {
		return math_expr(0);
	}

	private Math_exprContext math_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_exprContext _localctx = new Math_exprContext(_ctx, _parentState);
		Math_exprContext _prevctx = _localctx;
		int _startState = 42;
		enterRecursionRule(_localctx, 42, RULE_math_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(446);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,42,_ctx) ) {
			case 1:
				{
				setState(438);
				match(LEFTPAREN);
				setState(439);
				math_expr(0);
				setState(440);
				match(RIGHTPAREN);
				}
				break;
			case 2:
				{
				setState(442);
				match(DECIMAL);
				}
				break;
			case 3:
				{
				setState(443);
				match(REALNUM);
				}
				break;
			case 4:
				{
				setState(444);
				array_ID();
				}
				break;
			case 5:
				{
				setState(445);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(468);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(466);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
					case 1:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(448);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(449);
						match(ASTERISK);
						setState(450);
						math_expr(11);
						}
						break;
					case 2:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(451);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(452);
						match(SLASH);
						setState(453);
						math_expr(10);
						}
						break;
					case 3:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(454);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(455);
						match(DIV);
						setState(456);
						math_expr(9);
						}
						break;
					case 4:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(457);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(458);
						match(MOD);
						setState(459);
						math_expr(8);
						}
						break;
					case 5:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(460);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(461);
						match(PLUS);
						setState(462);
						math_expr(7);
						}
						break;
					case 6:
						{
						_localctx = new Math_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_math_expr);
						setState(463);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(464);
						match(MINUS);
						setState(465);
						math_expr(6);
						}
						break;
					}
					} 
				}
				setState(470);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,44,_ctx);
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
	public static class Bool_exprContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(MiniPascalParser.NOT, 0); }
		public List<Bool_exprContext> bool_expr() {
			return getRuleContexts(Bool_exprContext.class);
		}
		public Bool_exprContext bool_expr(int i) {
			return getRuleContext(Bool_exprContext.class,i);
		}
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public TerminalNode MAYORQUE() { return getToken(MiniPascalParser.MAYORQUE, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(MiniPascalParser.MAYORIGUAL, 0); }
		public TerminalNode MENORQUE() { return getToken(MiniPascalParser.MENORQUE, 0); }
		public TerminalNode MENORIGUAL() { return getToken(MiniPascalParser.MENORIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(MiniPascalParser.IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(MiniPascalParser.DISTINTO, 0); }
		public TerminalNode BOOL_VAL() { return getToken(MiniPascalParser.BOOL_VAL, 0); }
		public Array_IDContext array_ID() {
			return getRuleContext(Array_IDContext.class,0);
		}
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode AND() { return getToken(MiniPascalParser.AND, 0); }
		public TerminalNode OR() { return getToken(MiniPascalParser.OR, 0); }
		public Bool_exprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_expr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterBool_expr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitBool_expr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitBool_expr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_exprContext bool_expr() throws RecognitionException {
		return bool_expr(0);
	}

	private Bool_exprContext bool_expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Bool_exprContext _localctx = new Bool_exprContext(_ctx, _parentState);
		Bool_exprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_bool_expr, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(505);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				{
				setState(472);
				match(NOT);
				setState(473);
				bool_expr(11);
				}
				break;
			case 2:
				{
				setState(474);
				match(LEFTPAREN);
				setState(475);
				bool_expr(0);
				setState(476);
				match(RIGHTPAREN);
				}
				break;
			case 3:
				{
				setState(478);
				math_expr(0);
				setState(479);
				match(MAYORQUE);
				setState(480);
				math_expr(0);
				}
				break;
			case 4:
				{
				setState(482);
				math_expr(0);
				setState(483);
				match(MAYORIGUAL);
				setState(484);
				math_expr(0);
				}
				break;
			case 5:
				{
				setState(486);
				math_expr(0);
				setState(487);
				match(MENORQUE);
				setState(488);
				math_expr(0);
				}
				break;
			case 6:
				{
				setState(490);
				math_expr(0);
				setState(491);
				match(MENORIGUAL);
				setState(492);
				math_expr(0);
				}
				break;
			case 7:
				{
				setState(494);
				math_expr(0);
				setState(495);
				match(IGUAL);
				setState(496);
				math_expr(0);
				}
				break;
			case 8:
				{
				setState(498);
				math_expr(0);
				setState(499);
				match(DISTINTO);
				setState(500);
				math_expr(0);
				}
				break;
			case 9:
				{
				setState(502);
				match(BOOL_VAL);
				}
				break;
			case 10:
				{
				setState(503);
				array_ID();
				}
				break;
			case 11:
				{
				setState(504);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(515);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(513);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,46,_ctx) ) {
					case 1:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(507);
						if (!(precpred(_ctx, 13))) throw new FailedPredicateException(this, "precpred(_ctx, 13)");
						setState(508);
						match(AND);
						setState(509);
						bool_expr(14);
						}
						break;
					case 2:
						{
						_localctx = new Bool_exprContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_bool_expr);
						setState(510);
						if (!(precpred(_ctx, 12))) throw new FailedPredicateException(this, "precpred(_ctx, 12)");
						setState(511);
						match(OR);
						setState(512);
						bool_expr(13);
						}
						break;
					}
					} 
				}
				setState(517);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,47,_ctx);
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
	public static class ComparisonContext extends ParserRuleContext {
		public TerminalNode MAYORQUE() { return getToken(MiniPascalParser.MAYORQUE, 0); }
		public TerminalNode MENORQUE() { return getToken(MiniPascalParser.MENORQUE, 0); }
		public TerminalNode MAYORIGUAL() { return getToken(MiniPascalParser.MAYORIGUAL, 0); }
		public TerminalNode MENORIGUAL() { return getToken(MiniPascalParser.MENORIGUAL, 0); }
		public TerminalNode IGUAL() { return getToken(MiniPascalParser.IGUAL, 0); }
		public TerminalNode DISTINTO() { return getToken(MiniPascalParser.DISTINTO, 0); }
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitComparison(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_comparison);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(518);
			_la = _input.LA(1);
			if ( !(((((_la - 63)) & ~0x3f) == 0 && ((1L << (_la - 63)) & 63L) != 0)) ) {
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
	public static class Logical_oprContext extends ParserRuleContext {
		public TerminalNode AND() { return getToken(MiniPascalParser.AND, 0); }
		public TerminalNode OR() { return getToken(MiniPascalParser.OR, 0); }
		public Logical_oprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_opr; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterLogical_opr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitLogical_opr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitLogical_opr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_oprContext logical_opr() throws RecognitionException {
		Logical_oprContext _localctx = new Logical_oprContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_logical_opr);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(520);
			_la = _input.LA(1);
			if ( !(_la==AND || _la==OR) ) {
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
	public static class SizeContext extends ParserRuleContext {
		public List<Math_exprContext> math_expr() {
			return getRuleContexts(Math_exprContext.class);
		}
		public Math_exprContext math_expr(int i) {
			return getRuleContext(Math_exprContext.class,i);
		}
		public SizeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_size; }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterSize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitSize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitSize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SizeContext size() throws RecognitionException {
		SizeContext _localctx = new SizeContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(522);
			math_expr(0);
			setState(523);
			match(T__0);
			setState(524);
			math_expr(0);
			}
		}
		catch (RecognitionException re) {
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
		case 21:
			return math_expr_sempred((Math_exprContext)_localctx, predIndex);
		case 22:
			return bool_expr_sempred((Bool_exprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean math_expr_sempred(Math_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 10);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		case 4:
			return precpred(_ctx, 6);
		case 5:
			return precpred(_ctx, 5);
		}
		return true;
	}
	private boolean bool_expr_sempred(Bool_exprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 13);
		case 7:
			return precpred(_ctx, 12);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001P\u020f\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
		"\u0002\u0007\u0002\u0002\u0003\u0007\u0003\u0002\u0004\u0007\u0004\u0002"+
		"\u0005\u0007\u0005\u0002\u0006\u0007\u0006\u0002\u0007\u0007\u0007\u0002"+
		"\b\u0007\b\u0002\t\u0007\t\u0002\n\u0007\n\u0002\u000b\u0007\u000b\u0002"+
		"\f\u0007\f\u0002\r\u0007\r\u0002\u000e\u0007\u000e\u0002\u000f\u0007\u000f"+
		"\u0002\u0010\u0007\u0010\u0002\u0011\u0007\u0011\u0002\u0012\u0007\u0012"+
		"\u0002\u0013\u0007\u0013\u0002\u0014\u0007\u0014\u0002\u0015\u0007\u0015"+
		"\u0002\u0016\u0007\u0016\u0002\u0017\u0007\u0017\u0002\u0018\u0007\u0018"+
		"\u0002\u0019\u0007\u0019\u0001\u0000\u0001\u0000\u0001\u0000\u0001\u0001"+
		"\u0001\u0001\u0001\u0001\u0001\u0001\u0003\u0001<\b\u0001\u0001\u0001"+
		"\u0003\u0001?\b\u0001\u0001\u0001\u0001\u0001\u0004\u0001C\b\u0001\u000b"+
		"\u0001\f\u0001D\u0001\u0001\u0001\u0001\u0001\u0001\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0005\u0002P\b"+
		"\u0002\n\u0002\f\u0002S\t\u0002\u0003\u0002U\b\u0002\u0001\u0002\u0001"+
		"\u0002\u0001\u0002\u0001\u0002\u0001\u0002\u0003\u0002\\\b\u0002\u0001"+
		"\u0002\u0001\u0002\u0004\u0002`\b\u0002\u000b\u0002\f\u0002a\u0001\u0002"+
		"\u0001\u0002\u0001\u0002\u0004\u0002g\b\u0002\u000b\u0002\f\u0002h\u0001"+
		"\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0001\u0003\u0005\u0003p\b"+
		"\u0003\n\u0003\f\u0003s\t\u0003\u0003\u0003u\b\u0003\u0001\u0003\u0001"+
		"\u0003\u0001\u0003\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004}\b"+
		"\u0004\n\u0004\f\u0004\u0080\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004"+
		"\u0001\u0004\u0001\u0004\u0005\u0004\u0087\b\u0004\n\u0004\f\u0004\u008a"+
		"\t\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0003\u0004\u0092\b\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0001"+
		"\u0004\u0001\u0004\u0001\u0004\u0001\u0004\u0005\u0004\u009b\b\u0004\n"+
		"\u0004\f\u0004\u009e\t\u0004\u0001\u0004\u0001\u0004\u0003\u0004\u00a2"+
		"\b\u0004\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001\u0005\u0001"+
		"\u0005\u0001\u0005\u0001\u0005\u0003\u0005\u00ac\b\u0005\u0001\u0006\u0001"+
		"\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0006\u0001\u0007\u0001"+
		"\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0003"+
		"\u0007\u00bb\b\u0007\u0003\u0007\u00bd\b\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007\u0001\u0007"+
		"\u0001\u0007\u0003\u0007\u00c8\b\u0007\u0003\u0007\u00ca\b\u0007\u0001"+
		"\u0007\u0001\u0007\u0003\u0007\u00ce\b\u0007\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00e2\b\b\u000b\b\f"+
		"\b\u00e3\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001\b\u0001"+
		"\b\u0001\b\u0001\b\u0001\b\u0001\b\u0004\b\u00fb\b\b\u000b\b\f\b\u00fc"+
		"\u0001\b\u0001\b\u0001\b\u0003\b\u0102\b\b\u0001\t\u0001\t\u0001\t\u0001"+
		"\t\u0001\t\u0001\t\u0001\t\u0001\t\u0001\t\u0004\t\u010d\b\t\u000b\t\f"+
		"\t\u010e\u0001\t\u0001\t\u0001\t\u0001\n\u0001\n\u0004\n\u0116\b\n\u000b"+
		"\n\f\n\u0117\u0001\n\u0001\n\u0001\n\u0001\n\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0004\u000b\u0124\b\u000b\u000b"+
		"\u000b\f\u000b\u0125\u0001\u000b\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\u000b\u0004\u000b\u012e\b\u000b\u000b\u000b\f\u000b\u012f"+
		"\u0005\u000b\u0132\b\u000b\n\u000b\f\u000b\u0135\t\u000b\u0001\u000b\u0001"+
		"\u000b\u0004\u000b\u0139\b\u000b\u000b\u000b\f\u000b\u013a\u0005\u000b"+
		"\u013d\b\u000b\n\u000b\f\u000b\u0140\t\u000b\u0001\f\u0001\f\u0001\f\u0001"+
		"\f\u0005\f\u0146\b\f\n\f\f\f\u0149\t\f\u0001\r\u0001\r\u0004\r\u014d\b"+
		"\r\u000b\r\f\r\u014e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005"+
		"\u000e\u015b\b\u000e\n\u000e\f\u000e\u015e\t\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0005\u000e"+
		"\u0167\b\u000e\n\u000e\f\u000e\u016a\t\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u0172\b\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0005\u000e\u0183\b\u000e\n\u000e\f\u000e"+
		"\u0186\t\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e\u0003\u000e"+
		"\u018c\b\u000e\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0003\u000f"+
		"\u0198\b\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f\u0001\u000f"+
		"\u0003\u000f\u019f\b\u000f\u0001\u0010\u0001\u0010\u0001\u0011\u0001\u0011"+
		"\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012"+
		"\u01aa\b\u0012\u0001\u0012\u0001\u0012\u0001\u0013\u0001\u0013\u0001\u0014"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014\u01b4\b\u0014\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0003\u0015\u01bf\b\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015"+
		"\u0001\u0015\u0001\u0015\u0001\u0015\u0001\u0015\u0005\u0015\u01d3\b\u0015"+
		"\n\u0015\f\u0015\u01d6\t\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0003\u0016\u01fa\b\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001"+
		"\u0016\u0001\u0016\u0001\u0016\u0005\u0016\u0202\b\u0016\n\u0016\f\u0016"+
		"\u0205\t\u0016\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001\u0019"+
		"\u0001\u0019\u0001\u0019\u0001\u0019\u0001\u0019\u0000\u0002*,\u001a\u0000"+
		"\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018\u001a\u001c"+
		"\u001e \"$&(*,.02\u0000\u0005\u0002\u0000))+-\u0002\u0000))+,\u0001\u0000"+
		"./\u0001\u0000?D\u0002\u0000\u0002\u0002\u0017\u0017\u0244\u00004\u0001"+
		"\u0000\u0000\u0000\u00027\u0001\u0000\u0000\u0000\u0004f\u0001\u0000\u0000"+
		"\u0000\u0006j\u0001\u0000\u0000\u0000\b\u00a1\u0001\u0000\u0000\u0000"+
		"\n\u00ab\u0001\u0000\u0000\u0000\f\u00ad\u0001\u0000\u0000\u0000\u000e"+
		"\u00cd\u0001\u0000\u0000\u0000\u0010\u0101\u0001\u0000\u0000\u0000\u0012"+
		"\u0103\u0001\u0000\u0000\u0000\u0014\u0113\u0001\u0000\u0000\u0000\u0016"+
		"\u011d\u0001\u0000\u0000\u0000\u0018\u0141\u0001\u0000\u0000\u0000\u001a"+
		"\u014a\u0001\u0000\u0000\u0000\u001c\u018b\u0001\u0000\u0000\u0000\u001e"+
		"\u019e\u0001\u0000\u0000\u0000 \u01a0\u0001\u0000\u0000\u0000\"\u01a2"+
		"\u0001\u0000\u0000\u0000$\u01a4\u0001\u0000\u0000\u0000&\u01ad\u0001\u0000"+
		"\u0000\u0000(\u01b3\u0001\u0000\u0000\u0000*\u01be\u0001\u0000\u0000\u0000"+
		",\u01f9\u0001\u0000\u0000\u0000.\u0206\u0001\u0000\u0000\u00000\u0208"+
		"\u0001\u0000\u0000\u00002\u020a\u0001\u0000\u0000\u000045\u0003\u0002"+
		"\u0001\u000056\u0005\u0000\u0000\u00016\u0001\u0001\u0000\u0000\u0000"+
		"78\u0005\u001b\u0000\u000089\u00051\u0000\u00009;\u00055\u0000\u0000:"+
		"<\u0003\u001a\r\u0000;:\u0001\u0000\u0000\u0000;<\u0001\u0000\u0000\u0000"+
		"<>\u0001\u0000\u0000\u0000=?\u0003\u0004\u0002\u0000>=\u0001\u0000\u0000"+
		"\u0000>?\u0001\u0000\u0000\u0000?@\u0001\u0000\u0000\u0000@B\u0005\u0004"+
		"\u0000\u0000AC\u0003\n\u0005\u0000BA\u0001\u0000\u0000\u0000CD\u0001\u0000"+
		"\u0000\u0000DB\u0001\u0000\u0000\u0000DE\u0001\u0000\u0000\u0000EF\u0001"+
		"\u0000\u0000\u0000FG\u0005\f\u0000\u0000GH\u00052\u0000\u0000H\u0003\u0001"+
		"\u0000\u0000\u0000IJ\u0005\u000f\u0000\u0000JK\u00051\u0000\u0000KT\u0005"+
		"6\u0000\u0000LQ\u0003\b\u0004\u0000MN\u00055\u0000\u0000NP\u0003\b\u0004"+
		"\u0000OM\u0001\u0000\u0000\u0000PS\u0001\u0000\u0000\u0000QO\u0001\u0000"+
		"\u0000\u0000QR\u0001\u0000\u0000\u0000RU\u0001\u0000\u0000\u0000SQ\u0001"+
		"\u0000\u0000\u0000TL\u0001\u0000\u0000\u0000TU\u0001\u0000\u0000\u0000"+
		"UV\u0001\u0000\u0000\u0000VW\u00057\u0000\u0000WX\u00054\u0000\u0000X"+
		"Y\u0003 \u0010\u0000Y[\u00055\u0000\u0000Z\\\u0003\u001a\r\u0000[Z\u0001"+
		"\u0000\u0000\u0000[\\\u0001\u0000\u0000\u0000\\]\u0001\u0000\u0000\u0000"+
		"]_\u0005\u0004\u0000\u0000^`\u0003\n\u0005\u0000_^\u0001\u0000\u0000\u0000"+
		"`a\u0001\u0000\u0000\u0000a_\u0001\u0000\u0000\u0000ab\u0001\u0000\u0000"+
		"\u0000bc\u0001\u0000\u0000\u0000cd\u0005\f\u0000\u0000de\u00055\u0000"+
		"\u0000eg\u0001\u0000\u0000\u0000fI\u0001\u0000\u0000\u0000gh\u0001\u0000"+
		"\u0000\u0000hf\u0001\u0000\u0000\u0000hi\u0001\u0000\u0000\u0000i\u0005"+
		"\u0001\u0000\u0000\u0000jk\u00051\u0000\u0000kt\u00056\u0000\u0000lq\u0003"+
		"(\u0014\u0000mn\u00053\u0000\u0000np\u0003(\u0014\u0000om\u0001\u0000"+
		"\u0000\u0000ps\u0001\u0000\u0000\u0000qo\u0001\u0000\u0000\u0000qr\u0001"+
		"\u0000\u0000\u0000ru\u0001\u0000\u0000\u0000sq\u0001\u0000\u0000\u0000"+
		"tl\u0001\u0000\u0000\u0000tu\u0001\u0000\u0000\u0000uv\u0001\u0000\u0000"+
		"\u0000vw\u00057\u0000\u0000wx\u00055\u0000\u0000x\u0007\u0001\u0000\u0000"+
		"\u0000y~\u00051\u0000\u0000z{\u00053\u0000\u0000{}\u00051\u0000\u0000"+
		"|z\u0001\u0000\u0000\u0000}\u0080\u0001\u0000\u0000\u0000~|\u0001\u0000"+
		"\u0000\u0000~\u007f\u0001\u0000\u0000\u0000\u007f\u0081\u0001\u0000\u0000"+
		"\u0000\u0080~\u0001\u0000\u0000\u0000\u0081\u0082\u00054\u0000\u0000\u0082"+
		"\u00a2\u0003 \u0010\u0000\u0083\u0088\u00051\u0000\u0000\u0084\u0085\u0005"+
		"3\u0000\u0000\u0085\u0087\u00051\u0000\u0000\u0086\u0084\u0001\u0000\u0000"+
		"\u0000\u0087\u008a\u0001\u0000\u0000\u0000\u0088\u0086\u0001\u0000\u0000"+
		"\u0000\u0088\u0089\u0001\u0000\u0000\u0000\u0089\u008b\u0001\u0000\u0000"+
		"\u0000\u008a\u0088\u0001\u0000\u0000\u0000\u008b\u008c\u00054\u0000\u0000"+
		"\u008c\u008d\u0005\u0003\u0000\u0000\u008d\u008e\u00058\u0000\u0000\u008e"+
		"\u0091\u00032\u0019\u0000\u008f\u0090\u00053\u0000\u0000\u0090\u0092\u0003"+
		"2\u0019\u0000\u0091\u008f\u0001\u0000\u0000\u0000\u0091\u0092\u0001\u0000"+
		"\u0000\u0000\u0092\u0093\u0001\u0000\u0000\u0000\u0093\u0094\u00059\u0000"+
		"\u0000\u0094\u0095\u0005\u0018\u0000\u0000\u0095\u0096\u0003\"\u0011\u0000"+
		"\u0096\u00a2\u0001\u0000\u0000\u0000\u0097\u009c\u00051\u0000\u0000\u0098"+
		"\u0099\u00053\u0000\u0000\u0099\u009b\u00051\u0000\u0000\u009a\u0098\u0001"+
		"\u0000\u0000\u0000\u009b\u009e\u0001\u0000\u0000\u0000\u009c\u009a\u0001"+
		"\u0000\u0000\u0000\u009c\u009d\u0001\u0000\u0000\u0000\u009d\u009f\u0001"+
		"\u0000\u0000\u0000\u009e\u009c\u0001\u0000\u0000\u0000\u009f\u00a0\u0005"+
		"4\u0000\u0000\u00a0\u00a2\u0003&\u0013\u0000\u00a1y\u0001\u0000\u0000"+
		"\u0000\u00a1\u0083\u0001\u0000\u0000\u0000\u00a1\u0097\u0001\u0000\u0000"+
		"\u0000\u00a2\t\u0001\u0000\u0000\u0000\u00a3\u00ac\u0003\u001e\u000f\u0000"+
		"\u00a4\u00ac\u0003\u0006\u0003\u0000\u00a5\u00ac\u0003\f\u0006\u0000\u00a6"+
		"\u00ac\u0003\u000e\u0007\u0000\u00a7\u00ac\u0003\u0010\b\u0000\u00a8\u00ac"+
		"\u0003\u0012\t\u0000\u00a9\u00ac\u0003\u0014\n\u0000\u00aa\u00ac\u0003"+
		"\u0016\u000b\u0000\u00ab\u00a3\u0001\u0000\u0000\u0000\u00ab\u00a4\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000\u0000\u0000\u00ab\u00a6\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000\u0000\u0000\u00ab\u00a8\u0001"+
		"\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000\u0000\u0000\u00ab\u00aa\u0001"+
		"\u0000\u0000\u0000\u00ac\u000b\u0001\u0000\u0000\u0000\u00ad\u00ae\u0005"+
		"\u001c\u0000\u0000\u00ae\u00af\u00056\u0000\u0000\u00af\u00b0\u00051\u0000"+
		"\u0000\u00b0\u00b1\u00057\u0000\u0000\u00b1\u00b2\u00055\u0000\u0000\u00b2"+
		"\r\u0001\u0000\u0000\u0000\u00b3\u00b4\u0005\'\u0000\u0000\u00b4\u00b5"+
		"\u00056\u0000\u0000\u00b5\u00bc\u00050\u0000\u0000\u00b6\u00ba\u00053"+
		"\u0000\u0000\u00b7\u00bb\u0003*\u0015\u0000\u00b8\u00bb\u0005I\u0000\u0000"+
		"\u00b9\u00bb\u00051\u0000\u0000\u00ba\u00b7\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b8\u0001\u0000\u0000\u0000\u00ba\u00b9\u0001\u0000\u0000\u0000\u00bb"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bc\u00b6\u0001\u0000\u0000\u0000\u00bc"+
		"\u00bd\u0001\u0000\u0000\u0000\u00bd\u00be\u0001\u0000\u0000\u0000\u00be"+
		"\u00bf\u00057\u0000\u0000\u00bf\u00ce\u00055\u0000\u0000\u00c0\u00c1\u0005"+
		"&\u0000\u0000\u00c1\u00c2\u00056\u0000\u0000\u00c2\u00c9\u00050\u0000"+
		"\u0000\u00c3\u00c7\u00053\u0000\u0000\u00c4\u00c8\u0003*\u0015\u0000\u00c5"+
		"\u00c8\u0005I\u0000\u0000\u00c6\u00c8\u00051\u0000\u0000\u00c7\u00c4\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c5\u0001\u0000\u0000\u0000\u00c7\u00c6\u0001"+
		"\u0000\u0000\u0000\u00c8\u00ca\u0001\u0000\u0000\u0000\u00c9\u00c3\u0001"+
		"\u0000\u0000\u0000\u00c9\u00ca\u0001\u0000\u0000\u0000\u00ca\u00cb\u0001"+
		"\u0000\u0000\u0000\u00cb\u00cc\u00057\u0000\u0000\u00cc\u00ce\u00055\u0000"+
		"\u0000\u00cd\u00b3\u0001\u0000\u0000\u0000\u00cd\u00c0\u0001\u0000\u0000"+
		"\u0000\u00ce\u000f\u0001\u0000\u0000\u0000\u00cf\u00d0\u0005\u000e\u0000"+
		"\u0000\u00d0\u00d1\u00051\u0000\u0000\u00d1\u00d2\u0005:\u0000\u0000\u00d2"+
		"\u00d3\u0003(\u0014\u0000\u00d3\u00d4\u0005!\u0000\u0000\u00d4\u00d5\u0003"+
		"(\u0014\u0000\u00d5\u00d6\u0005\b\u0000\u0000\u00d6\u00d7\u0003\n\u0005"+
		"\u0000\u00d7\u0102\u0001\u0000\u0000\u0000\u00d8\u00d9\u0005\u000e\u0000"+
		"\u0000\u00d9\u00da\u00051\u0000\u0000\u00da\u00db\u0005:\u0000\u0000\u00db"+
		"\u00dc\u0003(\u0014\u0000\u00dc\u00dd\u0005!\u0000\u0000\u00dd\u00de\u0003"+
		"(\u0014\u0000\u00de\u00df\u0005\b\u0000\u0000\u00df\u00e1\u0005\u0004"+
		"\u0000\u0000\u00e0\u00e2\u0003\n\u0005\u0000\u00e1\u00e0\u0001\u0000\u0000"+
		"\u0000\u00e2\u00e3\u0001\u0000\u0000\u0000\u00e3\u00e1\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e4\u0001\u0000\u0000\u0000\u00e4\u00e5\u0001\u0000\u0000"+
		"\u0000\u00e5\u00e6\u0005\f\u0000\u0000\u00e6\u00e7\u00055\u0000\u0000"+
		"\u00e7\u0102\u0001\u0000\u0000\u0000\u00e8\u00e9\u0005\u000e\u0000\u0000"+
		"\u00e9\u00ea\u00051\u0000\u0000\u00ea\u00eb\u0005:\u0000\u0000\u00eb\u00ec"+
		"\u0003(\u0014\u0000\u00ec\u00ed\u0005\t\u0000\u0000\u00ed\u00ee\u0003"+
		"(\u0014\u0000\u00ee\u00ef\u0005\b\u0000\u0000\u00ef\u00f0\u0003\n\u0005"+
		"\u0000\u00f0\u0102\u0001\u0000\u0000\u0000\u00f1\u00f2\u0005\u000e\u0000"+
		"\u0000\u00f2\u00f3\u00051\u0000\u0000\u00f3\u00f4\u0005:\u0000\u0000\u00f4"+
		"\u00f5\u0003(\u0014\u0000\u00f5\u00f6\u0005\t\u0000\u0000\u00f6\u00f7"+
		"\u0003(\u0014\u0000\u00f7\u00f8\u0005\b\u0000\u0000\u00f8\u00fa\u0005"+
		"\u0004\u0000\u0000\u00f9\u00fb\u0003\n\u0005\u0000\u00fa\u00f9\u0001\u0000"+
		"\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000\u00fc\u00fa\u0001\u0000"+
		"\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000\u00fd\u00fe\u0001\u0000"+
		"\u0000\u0000\u00fe\u00ff\u0005\f\u0000\u0000\u00ff\u0100\u00055\u0000"+
		"\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00cf\u0001\u0000\u0000"+
		"\u0000\u0101\u00d8\u0001\u0000\u0000\u0000\u0101\u00e8\u0001\u0000\u0000"+
		"\u0000\u0101\u00f1\u0001\u0000\u0000\u0000\u0102\u0011\u0001\u0000\u0000"+
		"\u0000\u0103\u0104\u0005%\u0000\u0000\u0104\u0105\u00056\u0000\u0000\u0105"+
		"\u0106\u0003(\u0014\u0000\u0106\u0107\u0003.\u0017\u0000\u0107\u0108\u0003"+
		"(\u0014\u0000\u0108\u0109\u00057\u0000\u0000\u0109\u010a\u0005\b\u0000"+
		"\u0000\u010a\u010c\u0005\u0004\u0000\u0000\u010b\u010d\u0003\n\u0005\u0000"+
		"\u010c\u010b\u0001\u0000\u0000\u0000\u010d\u010e\u0001\u0000\u0000\u0000"+
		"\u010e\u010c\u0001\u0000\u0000\u0000\u010e\u010f\u0001\u0000\u0000\u0000"+
		"\u010f\u0110\u0001\u0000\u0000\u0000\u0110\u0111\u0005\f\u0000\u0000\u0111"+
		"\u0112\u00055\u0000\u0000\u0112\u0013\u0001\u0000\u0000\u0000\u0113\u0115"+
		"\u0005\u001e\u0000\u0000\u0114\u0116\u0003\n\u0005\u0000\u0115\u0114\u0001"+
		"\u0000\u0000\u0000\u0116\u0117\u0001\u0000\u0000\u0000\u0117\u0115\u0001"+
		"\u0000\u0000\u0000\u0117\u0118\u0001\u0000\u0000\u0000\u0118\u0119\u0001"+
		"\u0000\u0000\u0000\u0119\u011a\u0005#\u0000\u0000\u011a\u011b\u0003,\u0016"+
		"\u0000\u011b\u011c\u00055\u0000\u0000\u011c\u0015\u0001\u0000\u0000\u0000"+
		"\u011d\u011e\u0005\u0011\u0000\u0000\u011e\u011f\u00056\u0000\u0000\u011f"+
		"\u0120\u0003\u0018\f\u0000\u0120\u0121\u00057\u0000\u0000\u0121\u0123"+
		"\u0005 \u0000\u0000\u0122\u0124\u0003\n\u0005\u0000\u0123\u0122\u0001"+
		"\u0000\u0000\u0000\u0124\u0125\u0001\u0000\u0000\u0000\u0125\u0123\u0001"+
		"\u0000\u0000\u0000\u0125\u0126\u0001\u0000\u0000\u0000\u0126\u0133\u0001"+
		"\u0000\u0000\u0000\u0127\u0128\u0005\u000b\u0000\u0000\u0128\u0129\u0005"+
		"6\u0000\u0000\u0129\u012a\u0003\u0018\f\u0000\u012a\u012b\u00057\u0000"+
		"\u0000\u012b\u012d\u0005 \u0000\u0000\u012c\u012e\u0003\n\u0005\u0000"+
		"\u012d\u012c\u0001\u0000\u0000\u0000\u012e\u012f\u0001\u0000\u0000\u0000"+
		"\u012f\u012d\u0001\u0000\u0000\u0000\u012f\u0130\u0001\u0000\u0000\u0000"+
		"\u0130\u0132\u0001\u0000\u0000\u0000\u0131\u0127\u0001\u0000\u0000\u0000"+
		"\u0132\u0135\u0001\u0000\u0000\u0000\u0133\u0131\u0001\u0000\u0000\u0000"+
		"\u0133\u0134\u0001\u0000\u0000\u0000\u0134\u013e\u0001\u0000\u0000\u0000"+
		"\u0135\u0133\u0001\u0000\u0000\u0000\u0136\u0138\u0005\n\u0000\u0000\u0137"+
		"\u0139\u0003\n\u0005\u0000\u0138\u0137\u0001\u0000\u0000\u0000\u0139\u013a"+
		"\u0001\u0000\u0000\u0000\u013a\u0138\u0001\u0000\u0000\u0000\u013a\u013b"+
		"\u0001\u0000\u0000\u0000\u013b\u013d\u0001\u0000\u0000\u0000\u013c\u0136"+
		"\u0001\u0000\u0000\u0000\u013d\u0140\u0001\u0000\u0000\u0000\u013e\u013c"+
		"\u0001\u0000\u0000\u0000\u013e\u013f\u0001\u0000\u0000\u0000\u013f\u0017"+
		"\u0001\u0000\u0000\u0000\u0140\u013e\u0001\u0000\u0000\u0000\u0141\u0147"+
		"\u0003(\u0014\u0000\u0142\u0143\u00030\u0018\u0000\u0143\u0144\u0003("+
		"\u0014\u0000\u0144\u0146\u0001\u0000\u0000\u0000\u0145\u0142\u0001\u0000"+
		"\u0000\u0000\u0146\u0149\u0001\u0000\u0000\u0000\u0147\u0145\u0001\u0000"+
		"\u0000\u0000\u0147\u0148\u0001\u0000\u0000\u0000\u0148\u0019\u0001\u0000"+
		"\u0000\u0000\u0149\u0147\u0001\u0000\u0000\u0000\u014a\u014c\u0005$\u0000"+
		"\u0000\u014b\u014d\u0003\u001c\u000e\u0000\u014c\u014b\u0001\u0000\u0000"+
		"\u0000\u014d\u014e\u0001\u0000\u0000\u0000\u014e\u014c\u0001\u0000\u0000"+
		"\u0000\u014e\u014f\u0001\u0000\u0000\u0000\u014f\u001b\u0001\u0000\u0000"+
		"\u0000\u0150\u0151\u00051\u0000\u0000\u0151\u0152\u00054\u0000\u0000\u0152"+
		"\u0153\u0003 \u0010\u0000\u0153\u0154\u0005:\u0000\u0000\u0154\u0155\u0003"+
		"(\u0014\u0000\u0155\u0156\u00055\u0000\u0000\u0156\u018c\u0001\u0000\u0000"+
		"\u0000\u0157\u015c\u00051\u0000\u0000\u0158\u0159\u00053\u0000\u0000\u0159"+
		"\u015b\u00051\u0000\u0000\u015a\u0158\u0001\u0000\u0000\u0000\u015b\u015e"+
		"\u0001\u0000\u0000\u0000\u015c\u015a\u0001\u0000\u0000\u0000\u015c\u015d"+
		"\u0001\u0000\u0000\u0000\u015d\u015f\u0001\u0000\u0000\u0000\u015e\u015c"+
		"\u0001\u0000\u0000\u0000\u015f\u0160\u00054\u0000\u0000\u0160\u0161\u0003"+
		" \u0010\u0000\u0161\u0162\u00055\u0000\u0000\u0162\u018c\u0001\u0000\u0000"+
		"\u0000\u0163\u0168\u00051\u0000\u0000\u0164\u0165\u00053\u0000\u0000\u0165"+
		"\u0167\u00051\u0000\u0000\u0166\u0164\u0001\u0000\u0000\u0000\u0167\u016a"+
		"\u0001\u0000\u0000\u0000\u0168\u0166\u0001\u0000\u0000\u0000\u0168\u0169"+
		"\u0001\u0000\u0000\u0000\u0169\u016b\u0001\u0000\u0000\u0000\u016a\u0168"+
		"\u0001\u0000\u0000\u0000\u016b\u016c\u00054\u0000\u0000\u016c\u016d\u0005"+
		"\u0003\u0000\u0000\u016d\u016e\u00058\u0000\u0000\u016e\u0171\u00032\u0019"+
		"\u0000\u016f\u0170\u00053\u0000\u0000\u0170\u0172\u00032\u0019\u0000\u0171"+
		"\u016f\u0001\u0000\u0000\u0000\u0171\u0172\u0001\u0000\u0000\u0000\u0172"+
		"\u0173\u0001\u0000\u0000\u0000\u0173\u0174\u00059\u0000\u0000\u0174\u0175"+
		"\u0005\u0018\u0000\u0000\u0175\u0176\u0003\"\u0011\u0000\u0176\u0177\u0005"+
		"5\u0000\u0000\u0177\u018c\u0001\u0000\u0000\u0000\u0178\u0179\u00051\u0000"+
		"\u0000\u0179\u017a\u00054\u0000\u0000\u017a\u017b\u0003&\u0013\u0000\u017b"+
		"\u017c\u0005:\u0000\u0000\u017c\u017d\u00050\u0000\u0000\u017d\u017e\u0005"+
		"5\u0000\u0000\u017e\u018c\u0001\u0000\u0000\u0000\u017f\u0184\u00051\u0000"+
		"\u0000\u0180\u0181\u00053\u0000\u0000\u0181\u0183\u00051\u0000\u0000\u0182"+
		"\u0180\u0001\u0000\u0000\u0000\u0183\u0186\u0001\u0000\u0000\u0000\u0184"+
		"\u0182\u0001\u0000\u0000\u0000\u0184\u0185\u0001\u0000\u0000\u0000\u0185"+
		"\u0187\u0001\u0000\u0000\u0000\u0186\u0184\u0001\u0000\u0000\u0000\u0187"+
		"\u0188\u00054\u0000\u0000\u0188\u0189\u0003&\u0013\u0000\u0189\u018a\u0005"+
		"5\u0000\u0000\u018a\u018c\u0001\u0000\u0000\u0000\u018b\u0150\u0001\u0000"+
		"\u0000\u0000\u018b\u0157\u0001\u0000\u0000\u0000\u018b\u0163\u0001\u0000"+
		"\u0000\u0000\u018b\u0178\u0001\u0000\u0000\u0000\u018b\u017f\u0001\u0000"+
		"\u0000\u0000\u018c\u001d\u0001\u0000\u0000\u0000\u018d\u018e\u00051\u0000"+
		"\u0000\u018e\u018f\u0005:\u0000\u0000\u018f\u0190\u0003(\u0014\u0000\u0190"+
		"\u0191\u00055\u0000\u0000\u0191\u019f\u0001\u0000\u0000\u0000\u0192\u0193"+
		"\u00051\u0000\u0000\u0193\u0194\u00058\u0000\u0000\u0194\u0197\u0003*"+
		"\u0015\u0000\u0195\u0196\u00053\u0000\u0000\u0196\u0198\u0003*\u0015\u0000"+
		"\u0197\u0195\u0001\u0000\u0000\u0000\u0197\u0198\u0001\u0000\u0000\u0000"+
		"\u0198\u0199\u0001\u0000\u0000\u0000\u0199\u019a\u00059\u0000\u0000\u019a"+
		"\u019b\u0005:\u0000\u0000\u019b\u019c\u0003(\u0014\u0000\u019c\u019d\u0005"+
		"5\u0000\u0000\u019d\u019f\u0001\u0000\u0000\u0000\u019e\u018d\u0001\u0000"+
		"\u0000\u0000\u019e\u0192\u0001\u0000\u0000\u0000\u019f\u001f\u0001\u0000"+
		"\u0000\u0000\u01a0\u01a1\u0007\u0000\u0000\u0000\u01a1!\u0001\u0000\u0000"+
		"\u0000\u01a2\u01a3\u0007\u0001\u0000\u0000\u01a3#\u0001\u0000\u0000\u0000"+
		"\u01a4\u01a5\u00051\u0000\u0000\u01a5\u01a6\u00058\u0000\u0000\u01a6\u01a9"+
		"\u0003*\u0015\u0000\u01a7\u01a8\u00053\u0000\u0000\u01a8\u01aa\u0003*"+
		"\u0015\u0000\u01a9\u01a7\u0001\u0000\u0000\u0000\u01a9\u01aa\u0001\u0000"+
		"\u0000\u0000\u01aa\u01ab\u0001\u0000\u0000\u0000\u01ab\u01ac\u00059\u0000"+
		"\u0000\u01ac%\u0001\u0000\u0000\u0000\u01ad\u01ae\u0007\u0002\u0000\u0000"+
		"\u01ae\'\u0001\u0000\u0000\u0000\u01af\u01b4\u0003*\u0015\u0000\u01b0"+
		"\u01b4\u0003,\u0016\u0000\u01b1\u01b4\u00051\u0000\u0000\u01b2\u01b4\u0005"+
		"I\u0000\u0000\u01b3\u01af\u0001\u0000\u0000\u0000\u01b3\u01b0\u0001\u0000"+
		"\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b3\u01b2\u0001\u0000"+
		"\u0000\u0000\u01b4)\u0001\u0000\u0000\u0000\u01b5\u01b6\u0006\u0015\uffff"+
		"\uffff\u0000\u01b6\u01b7\u00056\u0000\u0000\u01b7\u01b8\u0003*\u0015\u0000"+
		"\u01b8\u01b9\u00057\u0000\u0000\u01b9\u01bf\u0001\u0000\u0000\u0000\u01ba"+
		"\u01bf\u0005N\u0000\u0000\u01bb\u01bf\u0005M\u0000\u0000\u01bc\u01bf\u0003"+
		"$\u0012\u0000\u01bd\u01bf\u00051\u0000\u0000\u01be\u01b5\u0001\u0000\u0000"+
		"\u0000\u01be\u01ba\u0001\u0000\u0000\u0000\u01be\u01bb\u0001\u0000\u0000"+
		"\u0000\u01be\u01bc\u0001\u0000\u0000\u0000\u01be\u01bd\u0001\u0000\u0000"+
		"\u0000\u01bf\u01d4\u0001\u0000\u0000\u0000\u01c0\u01c1\n\n\u0000\u0000"+
		"\u01c1\u01c2\u0005=\u0000\u0000\u01c2\u01d3\u0003*\u0015\u000b\u01c3\u01c4"+
		"\n\t\u0000\u0000\u01c4\u01c5\u0005>\u0000\u0000\u01c5\u01d3\u0003*\u0015"+
		"\n\u01c6\u01c7\n\b\u0000\u0000\u01c7\u01c8\u0005\u0007\u0000\u0000\u01c8"+
		"\u01d3\u0003*\u0015\t\u01c9\u01ca\n\u0007\u0000\u0000\u01ca\u01cb\u0005"+
		"\u0014\u0000\u0000\u01cb\u01d3\u0003*\u0015\b\u01cc\u01cd\n\u0006\u0000"+
		"\u0000\u01cd\u01ce\u0005;\u0000\u0000\u01ce\u01d3\u0003*\u0015\u0007\u01cf"+
		"\u01d0\n\u0005\u0000\u0000\u01d0\u01d1\u0005<\u0000\u0000\u01d1\u01d3"+
		"\u0003*\u0015\u0006\u01d2\u01c0\u0001\u0000\u0000\u0000\u01d2\u01c3\u0001"+
		"\u0000\u0000\u0000\u01d2\u01c6\u0001\u0000\u0000\u0000\u01d2\u01c9\u0001"+
		"\u0000\u0000\u0000\u01d2\u01cc\u0001\u0000\u0000\u0000\u01d2\u01cf\u0001"+
		"\u0000\u0000\u0000\u01d3\u01d6\u0001\u0000\u0000\u0000\u01d4\u01d2\u0001"+
		"\u0000\u0000\u0000\u01d4\u01d5\u0001\u0000\u0000\u0000\u01d5+\u0001\u0000"+
		"\u0000\u0000\u01d6\u01d4\u0001\u0000\u0000\u0000\u01d7\u01d8\u0006\u0016"+
		"\uffff\uffff\u0000\u01d8\u01d9\u0005\u0016\u0000\u0000\u01d9\u01fa\u0003"+
		",\u0016\u000b\u01da\u01db\u00056\u0000\u0000\u01db\u01dc\u0003,\u0016"+
		"\u0000\u01dc\u01dd\u00057\u0000\u0000\u01dd\u01fa\u0001\u0000\u0000\u0000"+
		"\u01de\u01df\u0003*\u0015\u0000\u01df\u01e0\u0005?\u0000\u0000\u01e0\u01e1"+
		"\u0003*\u0015\u0000\u01e1\u01fa\u0001\u0000\u0000\u0000\u01e2\u01e3\u0003"+
		"*\u0015\u0000\u01e3\u01e4\u0005A\u0000\u0000\u01e4\u01e5\u0003*\u0015"+
		"\u0000\u01e5\u01fa\u0001\u0000\u0000\u0000\u01e6\u01e7\u0003*\u0015\u0000"+
		"\u01e7\u01e8\u0005@\u0000\u0000\u01e8\u01e9\u0003*\u0015\u0000\u01e9\u01fa"+
		"\u0001\u0000\u0000\u0000\u01ea\u01eb\u0003*\u0015\u0000\u01eb\u01ec\u0005"+
		"B\u0000\u0000\u01ec\u01ed\u0003*\u0015\u0000\u01ed\u01fa\u0001\u0000\u0000"+
		"\u0000\u01ee\u01ef\u0003*\u0015\u0000\u01ef\u01f0\u0005C\u0000\u0000\u01f0"+
		"\u01f1\u0003*\u0015\u0000\u01f1\u01fa\u0001\u0000\u0000\u0000\u01f2\u01f3"+
		"\u0003*\u0015\u0000\u01f3\u01f4\u0005D\u0000\u0000\u01f4\u01f5\u0003*"+
		"\u0015\u0000\u01f5\u01fa\u0001\u0000\u0000\u0000\u01f6\u01fa\u0005E\u0000"+
		"\u0000\u01f7\u01fa\u0003$\u0012\u0000\u01f8\u01fa\u00051\u0000\u0000\u01f9"+
		"\u01d7\u0001\u0000\u0000\u0000\u01f9\u01da\u0001\u0000\u0000\u0000\u01f9"+
		"\u01de\u0001\u0000\u0000\u0000\u01f9\u01e2\u0001\u0000\u0000\u0000\u01f9"+
		"\u01e6\u0001\u0000\u0000\u0000\u01f9\u01ea\u0001\u0000\u0000\u0000\u01f9"+
		"\u01ee\u0001\u0000\u0000\u0000\u01f9\u01f2\u0001\u0000\u0000\u0000\u01f9"+
		"\u01f6\u0001\u0000\u0000\u0000\u01f9\u01f7\u0001\u0000\u0000\u0000\u01f9"+
		"\u01f8\u0001\u0000\u0000\u0000\u01fa\u0203\u0001\u0000\u0000\u0000\u01fb"+
		"\u01fc\n\r\u0000\u0000\u01fc\u01fd\u0005\u0002\u0000\u0000\u01fd\u0202"+
		"\u0003,\u0016\u000e\u01fe\u01ff\n\f\u0000\u0000\u01ff\u0200\u0005\u0017"+
		"\u0000\u0000\u0200\u0202\u0003,\u0016\r\u0201\u01fb\u0001\u0000\u0000"+
		"\u0000\u0201\u01fe\u0001\u0000\u0000\u0000\u0202\u0205\u0001\u0000\u0000"+
		"\u0000\u0203\u0201\u0001\u0000\u0000\u0000\u0203\u0204\u0001\u0000\u0000"+
		"\u0000\u0204-\u0001\u0000\u0000\u0000\u0205\u0203\u0001\u0000\u0000\u0000"+
		"\u0206\u0207\u0007\u0003\u0000\u0000\u0207/\u0001\u0000\u0000\u0000\u0208"+
		"\u0209\u0007\u0004\u0000\u0000\u02091\u0001\u0000\u0000\u0000\u020a\u020b"+
		"\u0003*\u0015\u0000\u020b\u020c\u0005\u0001\u0000\u0000\u020c\u020d\u0003"+
		"*\u0015\u0000\u020d3\u0001\u0000\u0000\u00000;>DQT[ahqt~\u0088\u0091\u009c"+
		"\u00a1\u00ab\u00ba\u00bc\u00c7\u00c9\u00cd\u00e3\u00fc\u0101\u010e\u0117"+
		"\u0125\u012f\u0133\u013a\u013e\u0147\u014e\u015c\u0168\u0171\u0184\u018b"+
		"\u0197\u019e\u01a9\u01b3\u01be\u01d2\u01d4\u01f9\u0201\u0203";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}