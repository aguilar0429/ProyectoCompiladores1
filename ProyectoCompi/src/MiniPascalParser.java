// Generated from D:/Code/ProyectoCompiladores1/ProyectoCompi/src/MiniPascal.g4 by ANTLR 4.13.1
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
		ESC=74, COMMENT=75, LETTER=76, DECIMAL=77, DIGIT=78, WS=79;
	public static final int
		RULE_program = 0, RULE_program_block = 1, RULE_function_block = 2, RULE_function_call = 3, 
		RULE_function_var_decl = 4, RULE_instr = 5, RULE_read_call = 6, RULE_write_call = 7, 
		RULE_for_loop = 8, RULE_if_condition = 9, RULE_while_loop = 10, RULE_repeat_loop = 11, 
		RULE_if_statement = 12, RULE_else_if = 13, RULE_else_statement = 14, RULE_var_block = 15, 
		RULE_var_decl = 16, RULE_var_init = 17, RULE_var_type = 18, RULE_array_type = 19, 
		RULE_array_ID = 20, RULE_const_type = 21, RULE_expr = 22, RULE_size = 23, 
		RULE_comparison = 24, RULE_logical_opr = 25;
	private static String[] makeRuleNames() {
		return new String[] {
			"program", "program_block", "function_block", "function_call", "function_var_decl", 
			"instr", "read_call", "write_call", "for_loop", "if_condition", "while_loop", 
			"repeat_loop", "if_statement", "else_if", "else_statement", "var_block", 
			"var_decl", "var_init", "var_type", "array_type", "array_ID", "const_type", 
			"expr", "size", "comparison", "logical_opr"
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
			"TRUE", "FALSE", "NEWLINE", "STR", "ESC", "COMMENT", "LETTER", "DECIMAL", 
			"DIGIT", "WS"
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
			if (((((_la - 22)) & ~0x3f) == 0 && ((1L << (_la - 22)) & 110338470177669121L) != 0)) {
				{
				setState(108);
				expr(0);
				setState(113);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(109);
					match(COMMA);
					setState(110);
					expr(0);
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
		public Function_var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_var_decl; }
	 
		public Function_var_declContext() { }
		public void copyFrom(Function_var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_var_declareContext extends Function_var_declContext {
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
		public Function_var_declareContext(Function_var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFunction_var_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFunction_var_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFunction_var_declare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_var_declArrayContext extends Function_var_declContext {
		public List<TerminalNode> ID() { return getTokens(MiniPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPascalParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
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
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public Function_var_declArrayContext(Function_var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFunction_var_declArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFunction_var_declArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFunction_var_declArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Function_var_declConstContext extends Function_var_declContext {
		public List<TerminalNode> ID() { return getTokens(MiniPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPascalParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public Function_var_declConstContext(Function_var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFunction_var_declConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFunction_var_declConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFunction_var_declConst(this);
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
				_localctx = new Function_var_declareContext(_localctx);
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
				_localctx = new Function_var_declArrayContext(_localctx);
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
				_localctx = new Function_var_declConstContext(_localctx);
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
		public InstrContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_instr; }
	 
		public InstrContext() { }
		public void copyFrom(InstrContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstrFunCallContext extends InstrContext {
		public Function_callContext function_call() {
			return getRuleContext(Function_callContext.class,0);
		}
		public InstrFunCallContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstrFunCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstrFunCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstrFunCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstrForLoopContext extends InstrContext {
		public For_loopContext for_loop() {
			return getRuleContext(For_loopContext.class,0);
		}
		public InstrForLoopContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstrForLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstrForLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstrForLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstrRepeatLoopContext extends InstrContext {
		public Repeat_loopContext repeat_loop() {
			return getRuleContext(Repeat_loopContext.class,0);
		}
		public InstrRepeatLoopContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstrRepeatLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstrRepeatLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstrRepeatLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstrVarInitContext extends InstrContext {
		public Var_initContext var_init() {
			return getRuleContext(Var_initContext.class,0);
		}
		public InstrVarInitContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstrVarInit(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstrVarInit(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstrVarInit(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class IntrIfStmtContext extends InstrContext {
		public If_statementContext if_statement() {
			return getRuleContext(If_statementContext.class,0);
		}
		public IntrIfStmtContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterIntrIfStmt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitIntrIfStmt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIntrIfStmt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstrWhileLoopContext extends InstrContext {
		public While_loopContext while_loop() {
			return getRuleContext(While_loopContext.class,0);
		}
		public InstrWhileLoopContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstrWhileLoop(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstrWhileLoop(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstrWhileLoop(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstrReadCallContext extends InstrContext {
		public Read_callContext read_call() {
			return getRuleContext(Read_callContext.class,0);
		}
		public InstrReadCallContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstrReadCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstrReadCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstrReadCall(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class InstrWriteCallContext extends InstrContext {
		public Write_callContext write_call() {
			return getRuleContext(Write_callContext.class,0);
		}
		public InstrWriteCallContext(InstrContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterInstrWriteCall(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitInstrWriteCall(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitInstrWriteCall(this);
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
				_localctx = new InstrVarInitContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(163);
				var_init();
				}
				break;
			case 2:
				_localctx = new InstrFunCallContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(164);
				function_call();
				}
				break;
			case 3:
				_localctx = new InstrReadCallContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(165);
				read_call();
				}
				break;
			case 4:
				_localctx = new InstrWriteCallContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(166);
				write_call();
				}
				break;
			case 5:
				_localctx = new InstrForLoopContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(167);
				for_loop();
				}
				break;
			case 6:
				_localctx = new InstrWhileLoopContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(168);
				while_loop();
				}
				break;
			case 7:
				_localctx = new InstrRepeatLoopContext(_localctx);
				enterOuterAlt(_localctx, 7);
				{
				setState(169);
				repeat_loop();
				}
				break;
			case 8:
				_localctx = new IntrIfStmtContext(_localctx);
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
		public Write_callContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_write_call; }
	 
		public Write_callContext() { }
		public void copyFrom(Write_callContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Write_callNoNewLineContext extends Write_callContext {
		public TerminalNode WRITE() { return getToken(MiniPascalParser.WRITE, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public TerminalNode CONST_VAL() { return getToken(MiniPascalParser.CONST_VAL, 0); }
		public TerminalNode COMMA() { return getToken(MiniPascalParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STR() { return getToken(MiniPascalParser.STR, 0); }
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public Write_callNoNewLineContext(Write_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWrite_callNoNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWrite_callNoNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWrite_callNoNewLine(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Write_callNewLineContext extends Write_callContext {
		public TerminalNode WRITELN() { return getToken(MiniPascalParser.WRITELN, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public TerminalNode CONST_VAL() { return getToken(MiniPascalParser.CONST_VAL, 0); }
		public TerminalNode COMMA() { return getToken(MiniPascalParser.COMMA, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode STR() { return getToken(MiniPascalParser.STR, 0); }
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public Write_callNewLineContext(Write_callContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWrite_callNewLine(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWrite_callNewLine(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWrite_callNewLine(this);
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
				_localctx = new Write_callNewLineContext(_localctx);
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
						expr(0);
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
				_localctx = new Write_callNoNewLineContext(_localctx);
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
						expr(0);
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
		public For_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_loop; }
	 
		public For_loopContext() { }
		public void copyFrom(For_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class For_loopToDoBEContext extends For_loopContext {
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
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public For_loopToDoBEContext(For_loopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFor_loopToDoBE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFor_loopToDoBE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFor_loopToDoBE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class For_loopDownToBEContext extends For_loopContext {
		public TerminalNode FOR() { return getToken(MiniPascalParser.FOR, 0); }
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOWNTO() { return getToken(MiniPascalParser.DOWNTO, 0); }
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
		public For_loopDownToBEContext(For_loopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFor_loopDownToBE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFor_loopDownToBE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFor_loopDownToBE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class For_loopToDoContext extends For_loopContext {
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
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public For_loopToDoContext(For_loopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFor_loopToDo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFor_loopToDo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFor_loopToDo(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class For_loopDownToContext extends For_loopContext {
		public TerminalNode FOR() { return getToken(MiniPascalParser.FOR, 0); }
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode DOWNTO() { return getToken(MiniPascalParser.DOWNTO, 0); }
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public For_loopDownToContext(For_loopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterFor_loopDownTo(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitFor_loopDownTo(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitFor_loopDownTo(this);
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
				_localctx = new For_loopToDoContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(207);
				match(FOR);
				setState(208);
				match(ID);
				setState(209);
				match(ASSIGN);
				setState(210);
				expr(0);
				setState(211);
				match(TO);
				setState(212);
				expr(0);
				setState(213);
				match(DO);
				{
				setState(214);
				instr();
				}
				}
				break;
			case 2:
				_localctx = new For_loopToDoBEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(216);
				match(FOR);
				setState(217);
				match(ID);
				setState(218);
				match(ASSIGN);
				setState(219);
				expr(0);
				setState(220);
				match(TO);
				setState(221);
				expr(0);
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
				_localctx = new For_loopDownToContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(232);
				match(FOR);
				setState(233);
				match(ID);
				setState(234);
				match(ASSIGN);
				setState(235);
				expr(0);
				setState(236);
				match(DOWNTO);
				setState(237);
				expr(0);
				setState(238);
				match(DO);
				{
				setState(239);
				instr();
				}
				}
				break;
			case 4:
				_localctx = new For_loopDownToBEContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(241);
				match(FOR);
				setState(242);
				match(ID);
				setState(243);
				match(ASSIGN);
				setState(244);
				expr(0);
				setState(245);
				match(DOWNTO);
				setState(246);
				expr(0);
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
		enterRule(_localctx, 18, RULE_if_condition);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(259);
			expr(0);
			setState(265);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AND || _la==OR) {
				{
				{
				setState(260);
				logical_opr();
				setState(261);
				expr(0);
				}
				}
				setState(267);
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
	public static class While_loopContext extends ParserRuleContext {
		public While_loopContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_while_loop; }
	 
		public While_loopContext() { }
		public void copyFrom(While_loopContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class While_loopBEContext extends While_loopContext {
		public TerminalNode WHILE() { return getToken(MiniPascalParser.WHILE, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
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
		public While_loopBEContext(While_loopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWhile_loopBE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWhile_loopBE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWhile_loopBE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class While_loopSingleContext extends While_loopContext {
		public TerminalNode WHILE() { return getToken(MiniPascalParser.WHILE, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public TerminalNode DO() { return getToken(MiniPascalParser.DO, 0); }
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public While_loopSingleContext(While_loopContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterWhile_loopSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitWhile_loopSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitWhile_loopSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final While_loopContext while_loop() throws RecognitionException {
		While_loopContext _localctx = new While_loopContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_while_loop);
		int _la;
		try {
			setState(290);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,26,_ctx) ) {
			case 1:
				_localctx = new While_loopSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(268);
				match(WHILE);
				setState(269);
				match(LEFTPAREN);
				setState(270);
				if_condition();
				setState(271);
				match(RIGHTPAREN);
				setState(272);
				match(DO);
				setState(273);
				instr();
				setState(274);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new While_loopBEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(276);
				match(WHILE);
				setState(277);
				match(LEFTPAREN);
				setState(278);
				if_condition();
				setState(279);
				match(RIGHTPAREN);
				setState(280);
				match(DO);
				{
				setState(281);
				match(BEGIN);
				setState(283); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(282);
					instr();
					}
					}
					setState(285); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 563913368420352L) != 0) );
				setState(287);
				match(END);
				setState(288);
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
	public static class Repeat_loopContext extends ParserRuleContext {
		public TerminalNode REPEAT() { return getToken(MiniPascalParser.REPEAT, 0); }
		public TerminalNode UNTIL() { return getToken(MiniPascalParser.UNTIL, 0); }
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
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
		enterRule(_localctx, 22, RULE_repeat_loop);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(292);
			match(REPEAT);
			setState(294); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(293);
				instr();
				}
				}
				setState(296); 
				_errHandler.sync(this);
				_la = _input.LA(1);
			} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 563913368420352L) != 0) );
			setState(298);
			match(UNTIL);
			setState(299);
			if_condition();
			setState(300);
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
		public If_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_if_statement; }
	 
		public If_statementContext() { }
		public void copyFrom(If_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class If_statementBEContext extends If_statementContext {
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public If_statementBEContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterIf_statementBE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitIf_statementBE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIf_statementBE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class If_statementSingleContext extends If_statementContext {
		public TerminalNode IF() { return getToken(MiniPascalParser.IF, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public List<Else_ifContext> else_if() {
			return getRuleContexts(Else_ifContext.class);
		}
		public Else_ifContext else_if(int i) {
			return getRuleContext(Else_ifContext.class,i);
		}
		public Else_statementContext else_statement() {
			return getRuleContext(Else_statementContext.class,0);
		}
		public If_statementSingleContext(If_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterIf_statementSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitIf_statementSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitIf_statementSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final If_statementContext if_statement() throws RecognitionException {
		If_statementContext _localctx = new If_statementContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_if_statement);
		int _la;
		try {
			int _alt;
			setState(340);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				_localctx = new If_statementSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(302);
				match(IF);
				setState(303);
				match(LEFTPAREN);
				setState(304);
				if_condition();
				setState(305);
				match(RIGHTPAREN);
				setState(306);
				match(THEN);
				setState(307);
				instr();
				setState(311);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(308);
						else_if();
						}
						} 
					}
					setState(313);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,28,_ctx);
				}
				setState(315);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,29,_ctx) ) {
				case 1:
					{
					setState(314);
					else_statement();
					}
					break;
				}
				}
				break;
			case 2:
				_localctx = new If_statementBEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(317);
				match(IF);
				setState(318);
				match(LEFTPAREN);
				setState(319);
				if_condition();
				setState(320);
				match(RIGHTPAREN);
				setState(321);
				match(THEN);
				{
				setState(322);
				match(BEGIN);
				setState(324); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(323);
					instr();
					}
					}
					setState(326); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 563913368420352L) != 0) );
				setState(328);
				match(END);
				setState(329);
				match(SEMICOLON);
				}
				setState(334);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
					if ( _alt==1 ) {
						{
						{
						setState(331);
						else_if();
						}
						} 
					}
					setState(336);
					_errHandler.sync(this);
					_alt = getInterpreter().adaptivePredict(_input,31,_ctx);
				}
				setState(338);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,32,_ctx) ) {
				case 1:
					{
					setState(337);
					else_statement();
					}
					break;
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
	public static class Else_ifContext extends ParserRuleContext {
		public Else_ifContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_if; }
	 
		public Else_ifContext() { }
		public void copyFrom(Else_ifContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Else_ifBEContext extends Else_ifContext {
		public TerminalNode ELSEIF() { return getToken(MiniPascalParser.ELSEIF, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public Else_ifBEContext(Else_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterElse_ifBE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitElse_ifBE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitElse_ifBE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Else_ifSingleContext extends Else_ifContext {
		public TerminalNode ELSEIF() { return getToken(MiniPascalParser.ELSEIF, 0); }
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public If_conditionContext if_condition() {
			return getRuleContext(If_conditionContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public TerminalNode THEN() { return getToken(MiniPascalParser.THEN, 0); }
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public Else_ifSingleContext(Else_ifContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterElse_ifSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitElse_ifSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitElse_ifSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_ifContext else_if() throws RecognitionException {
		Else_ifContext _localctx = new Else_ifContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_else_if);
		int _la;
		try {
			setState(363);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,35,_ctx) ) {
			case 1:
				_localctx = new Else_ifSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(342);
				match(ELSEIF);
				setState(343);
				match(LEFTPAREN);
				setState(344);
				if_condition();
				setState(345);
				match(RIGHTPAREN);
				setState(346);
				match(THEN);
				{
				setState(347);
				instr();
				}
				}
				break;
			case 2:
				_localctx = new Else_ifBEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(349);
				match(ELSEIF);
				setState(350);
				match(LEFTPAREN);
				setState(351);
				if_condition();
				setState(352);
				match(RIGHTPAREN);
				setState(353);
				match(THEN);
				{
				setState(354);
				match(BEGIN);
				setState(356); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(355);
					instr();
					}
					}
					setState(358); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 563913368420352L) != 0) );
				setState(360);
				match(END);
				setState(361);
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
	public static class Else_statementContext extends ParserRuleContext {
		public Else_statementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_else_statement; }
	 
		public Else_statementContext() { }
		public void copyFrom(Else_statementContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementBEContext extends Else_statementContext {
		public TerminalNode ELSE() { return getToken(MiniPascalParser.ELSE, 0); }
		public TerminalNode BEGIN() { return getToken(MiniPascalParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(MiniPascalParser.END, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public List<InstrContext> instr() {
			return getRuleContexts(InstrContext.class);
		}
		public InstrContext instr(int i) {
			return getRuleContext(InstrContext.class,i);
		}
		public Else_statementBEContext(Else_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterElse_statementBE(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitElse_statementBE(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitElse_statementBE(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Else_statementSingleContext extends Else_statementContext {
		public TerminalNode ELSE() { return getToken(MiniPascalParser.ELSE, 0); }
		public InstrContext instr() {
			return getRuleContext(InstrContext.class,0);
		}
		public Else_statementSingleContext(Else_statementContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterElse_statementSingle(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitElse_statementSingle(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitElse_statementSingle(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Else_statementContext else_statement() throws RecognitionException {
		Else_statementContext _localctx = new Else_statementContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_else_statement);
		int _la;
		try {
			setState(377);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,37,_ctx) ) {
			case 1:
				_localctx = new Else_statementSingleContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(365);
				match(ELSE);
				{
				setState(366);
				instr();
				}
				}
				break;
			case 2:
				_localctx = new Else_statementBEContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(367);
				match(ELSE);
				{
				setState(368);
				match(BEGIN);
				setState(370); 
				_errHandler.sync(this);
				_la = _input.LA(1);
				do {
					{
					{
					setState(369);
					instr();
					}
					}
					setState(372); 
					_errHandler.sync(this);
					_la = _input.LA(1);
				} while ( (((_la) & ~0x3f) == 0 && ((1L << _la) & 563913368420352L) != 0) );
				setState(374);
				match(END);
				setState(375);
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
		enterRule(_localctx, 30, RULE_var_block);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(379);
			match(VAR);
			setState(381); 
			_errHandler.sync(this);
			_la = _input.LA(1);
			do {
				{
				{
				setState(380);
				var_decl();
				}
				}
				setState(383); 
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
		public Var_declContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_decl; }
	 
		public Var_declContext() { }
		public void copyFrom(Var_declContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_declConstMultipleContext extends Var_declContext {
		public List<TerminalNode> ID() { return getTokens(MiniPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPascalParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public Var_declConstMultipleContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_declConstMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_declConstMultiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_declConstMultiple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_declConstContext extends Var_declContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public Const_typeContext const_type() {
			return getRuleContext(Const_typeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public TerminalNode CONST_VAL() { return getToken(MiniPascalParser.CONST_VAL, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public Var_declConstContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_declConst(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_declConst(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_declConst(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_declareContext extends Var_declContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public Var_declareContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_declare(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_declare(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_declare(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_declMultipleContext extends Var_declContext {
		public List<TerminalNode> ID() { return getTokens(MiniPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPascalParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
		public Var_typeContext var_type() {
			return getRuleContext(Var_typeContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public Var_declMultipleContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_declMultiple(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_declMultiple(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_declMultiple(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_declArrayContext extends Var_declContext {
		public List<TerminalNode> ID() { return getTokens(MiniPascalParser.ID); }
		public TerminalNode ID(int i) {
			return getToken(MiniPascalParser.ID, i);
		}
		public TerminalNode COLON() { return getToken(MiniPascalParser.COLON, 0); }
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
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public List<TerminalNode> COMMA() { return getTokens(MiniPascalParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(MiniPascalParser.COMMA, i);
		}
		public Var_declArrayContext(Var_declContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_declArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_declArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_declArray(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_declContext var_decl() throws RecognitionException {
		Var_declContext _localctx = new Var_declContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_var_decl);
		int _la;
		try {
			setState(444);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,43,_ctx) ) {
			case 1:
				_localctx = new Var_declareContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(385);
				match(ID);
				setState(386);
				match(COLON);
				setState(387);
				var_type();
				setState(388);
				match(ASSIGN);
				setState(389);
				expr(0);
				setState(390);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new Var_declMultipleContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(392);
				match(ID);
				setState(397);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(393);
					match(COMMA);
					setState(394);
					match(ID);
					}
					}
					setState(399);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(400);
				match(COLON);
				setState(401);
				var_type();
				setState(402);
				match(SEMICOLON);
				}
				break;
			case 3:
				_localctx = new Var_declArrayContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(404);
				match(ID);
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(405);
					match(COMMA);
					setState(406);
					match(ID);
					}
					}
					setState(411);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(412);
				match(COLON);
				setState(413);
				match(ARRAY);
				setState(414);
				match(LEFTBRACKET);
				setState(415);
				size();
				setState(418);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(416);
					match(COMMA);
					setState(417);
					size();
					}
				}

				setState(420);
				match(RIGHTBRACKET);
				setState(421);
				match(OF);
				setState(422);
				array_type();
				setState(423);
				match(SEMICOLON);
				}
				break;
			case 4:
				_localctx = new Var_declConstContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(425);
				match(ID);
				setState(426);
				match(COLON);
				setState(427);
				const_type();
				setState(428);
				match(ASSIGN);
				setState(429);
				match(CONST_VAL);
				setState(430);
				match(SEMICOLON);
				}
				break;
			case 5:
				_localctx = new Var_declConstMultipleContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(432);
				match(ID);
				setState(437);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(433);
					match(COMMA);
					setState(434);
					match(ID);
					}
					}
					setState(439);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(440);
				match(COLON);
				setState(441);
				const_type();
				setState(442);
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
		public Var_initContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_init; }
	 
		public Var_initContext() { }
		public void copyFrom(Var_initContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_initArrayContext extends Var_initContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(MiniPascalParser.LEFTBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode RIGHTBRACKET() { return getToken(MiniPascalParser.RIGHTBRACKET, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public TerminalNode COMMA() { return getToken(MiniPascalParser.COMMA, 0); }
		public Var_initArrayContext(Var_initContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_initArray(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_initArray(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_initArray(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_initializeContext extends Var_initContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode ASSIGN() { return getToken(MiniPascalParser.ASSIGN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode SEMICOLON() { return getToken(MiniPascalParser.SEMICOLON, 0); }
		public Var_initializeContext(Var_initContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_initialize(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_initialize(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_initialize(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_initContext var_init() throws RecognitionException {
		Var_initContext _localctx = new Var_initContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_var_init);
		int _la;
		try {
			setState(463);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,45,_ctx) ) {
			case 1:
				_localctx = new Var_initializeContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(446);
				match(ID);
				setState(447);
				match(ASSIGN);
				setState(448);
				expr(0);
				setState(449);
				match(SEMICOLON);
				}
				break;
			case 2:
				_localctx = new Var_initArrayContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(451);
				match(ID);
				setState(452);
				match(LEFTBRACKET);
				setState(453);
				expr(0);
				setState(456);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==COMMA) {
					{
					setState(454);
					match(COMMA);
					setState(455);
					expr(0);
					}
				}

				setState(458);
				match(RIGHTBRACKET);
				setState(459);
				match(ASSIGN);
				setState(460);
				expr(0);
				setState(461);
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
		public Var_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_var_type; }
	 
		public Var_typeContext() { }
		public void copyFrom(Var_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeIntContext extends Var_typeContext {
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public Var_typeIntContext(Var_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_typeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_typeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_typeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeStrContext extends Var_typeContext {
		public TerminalNode STRING() { return getToken(MiniPascalParser.STRING, 0); }
		public Var_typeStrContext(Var_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_typeStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_typeStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_typeStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeCharContext extends Var_typeContext {
		public TerminalNode CHARACTER() { return getToken(MiniPascalParser.CHARACTER, 0); }
		public Var_typeCharContext(Var_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_typeChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_typeChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_typeChar(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Var_typeBoolContext extends Var_typeContext {
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public Var_typeBoolContext(Var_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterVar_typeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitVar_typeBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitVar_typeBool(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Var_typeContext var_type() throws RecognitionException {
		Var_typeContext _localctx = new Var_typeContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_var_type);
		try {
			setState(469);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new Var_typeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(465);
				match(INTEGER);
				}
				break;
			case CHARACTER:
				_localctx = new Var_typeCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(466);
				match(CHARACTER);
				}
				break;
			case BOOLEAN:
				_localctx = new Var_typeBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(467);
				match(BOOLEAN);
				}
				break;
			case STRING:
				_localctx = new Var_typeStrContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(468);
				match(STRING);
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
	public static class Array_typeContext extends ParserRuleContext {
		public Array_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_array_type; }
	 
		public Array_typeContext() { }
		public void copyFrom(Array_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_typeBoolContext extends Array_typeContext {
		public TerminalNode BOOLEAN() { return getToken(MiniPascalParser.BOOLEAN, 0); }
		public Array_typeBoolContext(Array_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterArray_typeBool(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitArray_typeBool(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitArray_typeBool(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_typeIntContext extends Array_typeContext {
		public TerminalNode INTEGER() { return getToken(MiniPascalParser.INTEGER, 0); }
		public Array_typeIntContext(Array_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterArray_typeInt(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitArray_typeInt(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitArray_typeInt(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Array_typeCharContext extends Array_typeContext {
		public TerminalNode CHARACTER() { return getToken(MiniPascalParser.CHARACTER, 0); }
		public Array_typeCharContext(Array_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterArray_typeChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitArray_typeChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitArray_typeChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Array_typeContext array_type() throws RecognitionException {
		Array_typeContext _localctx = new Array_typeContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_array_type);
		try {
			setState(474);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INTEGER:
				_localctx = new Array_typeIntContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(471);
				match(INTEGER);
				}
				break;
			case CHARACTER:
				_localctx = new Array_typeCharContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(472);
				match(CHARACTER);
				}
				break;
			case BOOLEAN:
				_localctx = new Array_typeBoolContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(473);
				match(BOOLEAN);
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
	public static class Array_IDContext extends ParserRuleContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public TerminalNode LEFTBRACKET() { return getToken(MiniPascalParser.LEFTBRACKET, 0); }
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 40, RULE_array_ID);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(476);
			match(ID);
			setState(477);
			match(LEFTBRACKET);
			setState(478);
			expr(0);
			setState(481);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(479);
				match(COMMA);
				setState(480);
				expr(0);
				}
			}

			setState(483);
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
		public Const_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_const_type; }
	 
		public Const_typeContext() { }
		public void copyFrom(Const_typeContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Const_typeStrContext extends Const_typeContext {
		public TerminalNode CONSTSTR() { return getToken(MiniPascalParser.CONSTSTR, 0); }
		public Const_typeStrContext(Const_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterConst_typeStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitConst_typeStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitConst_typeStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Const_typeCharContext extends Const_typeContext {
		public TerminalNode CONSTCHAR() { return getToken(MiniPascalParser.CONSTCHAR, 0); }
		public Const_typeCharContext(Const_typeContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterConst_typeChar(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitConst_typeChar(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitConst_typeChar(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Const_typeContext const_type() throws RecognitionException {
		Const_typeContext _localctx = new Const_typeContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_const_type);
		try {
			setState(487);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case CONSTCHAR:
				_localctx = new Const_typeCharContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(485);
				match(CONSTCHAR);
				}
				break;
			case CONSTSTR:
				_localctx = new Const_typeStrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(486);
				match(CONSTSTR);
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
	public static class ExprContext extends ParserRuleContext {
		public ExprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expr; }
	 
		public ExprContext() { }
		public void copyFrom(ExprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprArrayIdContext extends ExprContext {
		public Array_IDContext array_ID() {
			return getRuleContext(Array_IDContext.class,0);
		}
		public ExprArrayIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExprArrayId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExprArrayId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExprArrayId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprParenContext extends ExprContext {
		public TerminalNode LEFTPAREN() { return getToken(MiniPascalParser.LEFTPAREN, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public TerminalNode RIGHTPAREN() { return getToken(MiniPascalParser.RIGHTPAREN, 0); }
		public ExprParenContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExprParen(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExprParen(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExprParen(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprTermMathContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode PLUS() { return getToken(MiniPascalParser.PLUS, 0); }
		public TerminalNode MINUS() { return getToken(MiniPascalParser.MINUS, 0); }
		public ExprTermMathContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExprTermMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExprTermMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExprTermMath(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNotContext extends ExprContext {
		public TerminalNode NOT() { return getToken(MiniPascalParser.NOT, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNotContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExprNot(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExprNot(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExprNot(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprStrContext extends ExprContext {
		public TerminalNode STR() { return getToken(MiniPascalParser.STR, 0); }
		public ExprStrContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExprStr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExprStr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExprStr(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprFactorMathContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public TerminalNode ASTERISK() { return getToken(MiniPascalParser.ASTERISK, 0); }
		public TerminalNode SLASH() { return getToken(MiniPascalParser.SLASH, 0); }
		public TerminalNode DIV() { return getToken(MiniPascalParser.DIV, 0); }
		public TerminalNode MOD() { return getToken(MiniPascalParser.MOD, 0); }
		public ExprFactorMathContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExprFactorMath(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExprFactorMath(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExprFactorMath(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprComparisonContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public ComparisonContext comparison() {
			return getRuleContext(ComparisonContext.class,0);
		}
		public ExprComparisonContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExprComparison(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExprComparison(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExprComparison(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprIdContext extends ExprContext {
		public TerminalNode ID() { return getToken(MiniPascalParser.ID, 0); }
		public ExprIdContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExprId(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExprId(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExprId(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprLogicalContext extends ExprContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
		}
		public Logical_oprContext logical_opr() {
			return getRuleContext(Logical_oprContext.class,0);
		}
		public ExprLogicalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExprLogical(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExprLogical(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExprLogical(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNumContext extends ExprContext {
		public TerminalNode DIGIT() { return getToken(MiniPascalParser.DIGIT, 0); }
		public ExprNumContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExprNum(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExprNum(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExprNum(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprNegativeContext extends ExprContext {
		public TerminalNode MINUS() { return getToken(MiniPascalParser.MINUS, 0); }
		public ExprContext expr() {
			return getRuleContext(ExprContext.class,0);
		}
		public ExprNegativeContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExprNegative(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExprNegative(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExprNegative(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ExprDecimalContext extends ExprContext {
		public TerminalNode DECIMAL() { return getToken(MiniPascalParser.DECIMAL, 0); }
		public ExprDecimalContext(ExprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterExprDecimal(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitExprDecimal(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitExprDecimal(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExprContext expr() throws RecognitionException {
		return expr(0);
	}

	private ExprContext expr(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		ExprContext _localctx = new ExprContext(_ctx, _parentState);
		ExprContext _prevctx = _localctx;
		int _startState = 44;
		enterRecursionRule(_localctx, 44, RULE_expr, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,50,_ctx) ) {
			case 1:
				{
				_localctx = new ExprParenContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(490);
				match(LEFTPAREN);
				setState(491);
				expr(0);
				setState(492);
				match(RIGHTPAREN);
				}
				break;
			case 2:
				{
				_localctx = new ExprNegativeContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(494);
				match(MINUS);
				setState(495);
				expr(10);
				}
				break;
			case 3:
				{
				_localctx = new ExprNotContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(496);
				match(NOT);
				setState(497);
				expr(6);
				}
				break;
			case 4:
				{
				_localctx = new ExprDecimalContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(498);
				match(DECIMAL);
				}
				break;
			case 5:
				{
				_localctx = new ExprNumContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(499);
				match(DIGIT);
				}
				break;
			case 6:
				{
				_localctx = new ExprStrContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(500);
				match(STR);
				}
				break;
			case 7:
				{
				_localctx = new ExprArrayIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(501);
				array_ID();
				}
				break;
			case 8:
				{
				_localctx = new ExprIdContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(502);
				match(ID);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(521);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(519);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,51,_ctx) ) {
					case 1:
						{
						_localctx = new ExprFactorMathContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(505);
						if (!(precpred(_ctx, 11))) throw new FailedPredicateException(this, "precpred(_ctx, 11)");
						setState(506);
						_la = _input.LA(1);
						if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & 6917529027642130560L) != 0)) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(507);
						expr(12);
						}
						break;
					case 2:
						{
						_localctx = new ExprTermMathContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(508);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(509);
						_la = _input.LA(1);
						if ( !(_la==PLUS || _la==MINUS) ) {
						_errHandler.recoverInline(this);
						}
						else {
							if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
							_errHandler.reportMatch(this);
							consume();
						}
						setState(510);
						expr(10);
						}
						break;
					case 3:
						{
						_localctx = new ExprComparisonContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(511);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(512);
						comparison();
						setState(513);
						expr(9);
						}
						break;
					case 4:
						{
						_localctx = new ExprLogicalContext(new ExprContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_expr);
						setState(515);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(516);
						logical_opr();
						setState(517);
						expr(8);
						}
						break;
					}
					} 
				}
				setState(523);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,52,_ctx);
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
	public static class SizeContext extends ParserRuleContext {
		public List<ExprContext> expr() {
			return getRuleContexts(ExprContext.class);
		}
		public ExprContext expr(int i) {
			return getRuleContext(ExprContext.class,i);
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
		enterRule(_localctx, 46, RULE_size);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(524);
			expr(0);
			setState(525);
			match(T__0);
			setState(526);
			expr(0);
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
	public static class ComparisonContext extends ParserRuleContext {
		public ComparisonContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_comparison; }
	 
		public ComparisonContext() { }
		public void copyFrom(ComparisonContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonMayorContext extends ComparisonContext {
		public TerminalNode MAYORQUE() { return getToken(MiniPascalParser.MAYORQUE, 0); }
		public ComparisonMayorContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterComparisonMayor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitComparisonMayor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitComparisonMayor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonMenorContext extends ComparisonContext {
		public TerminalNode MENORQUE() { return getToken(MiniPascalParser.MENORQUE, 0); }
		public ComparisonMenorContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterComparisonMenor(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitComparisonMenor(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitComparisonMenor(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonIgualContext extends ComparisonContext {
		public TerminalNode IGUAL() { return getToken(MiniPascalParser.IGUAL, 0); }
		public ComparisonIgualContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterComparisonIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitComparisonIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitComparisonIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonMayorIgualContext extends ComparisonContext {
		public TerminalNode MAYORIGUAL() { return getToken(MiniPascalParser.MAYORIGUAL, 0); }
		public ComparisonMayorIgualContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterComparisonMayorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitComparisonMayorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitComparisonMayorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonMenorIgualContext extends ComparisonContext {
		public TerminalNode MENORIGUAL() { return getToken(MiniPascalParser.MENORIGUAL, 0); }
		public ComparisonMenorIgualContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterComparisonMenorIgual(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitComparisonMenorIgual(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitComparisonMenorIgual(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class ComparisonDistintoContext extends ComparisonContext {
		public TerminalNode DISTINTO() { return getToken(MiniPascalParser.DISTINTO, 0); }
		public ComparisonDistintoContext(ComparisonContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterComparisonDistinto(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitComparisonDistinto(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitComparisonDistinto(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ComparisonContext comparison() throws RecognitionException {
		ComparisonContext _localctx = new ComparisonContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_comparison);
		try {
			setState(534);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case MAYORQUE:
				_localctx = new ComparisonMayorContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(528);
				match(MAYORQUE);
				}
				break;
			case MENORQUE:
				_localctx = new ComparisonMenorContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(529);
				match(MENORQUE);
				}
				break;
			case MAYORIGUAL:
				_localctx = new ComparisonMayorIgualContext(_localctx);
				enterOuterAlt(_localctx, 3);
				{
				setState(530);
				match(MAYORIGUAL);
				}
				break;
			case MENORIGUAL:
				_localctx = new ComparisonMenorIgualContext(_localctx);
				enterOuterAlt(_localctx, 4);
				{
				setState(531);
				match(MENORIGUAL);
				}
				break;
			case IGUAL:
				_localctx = new ComparisonIgualContext(_localctx);
				enterOuterAlt(_localctx, 5);
				{
				setState(532);
				match(IGUAL);
				}
				break;
			case DISTINTO:
				_localctx = new ComparisonDistintoContext(_localctx);
				enterOuterAlt(_localctx, 6);
				{
				setState(533);
				match(DISTINTO);
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
	public static class Logical_oprContext extends ParserRuleContext {
		public Logical_oprContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_opr; }
	 
		public Logical_oprContext() { }
		public void copyFrom(Logical_oprContext ctx) {
			super.copyFrom(ctx);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Logical_oprAndContext extends Logical_oprContext {
		public TerminalNode AND() { return getToken(MiniPascalParser.AND, 0); }
		public Logical_oprAndContext(Logical_oprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterLogical_oprAnd(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitLogical_oprAnd(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitLogical_oprAnd(this);
			else return visitor.visitChildren(this);
		}
	}
	@SuppressWarnings("CheckReturnValue")
	public static class Logical_oprOrContext extends Logical_oprContext {
		public TerminalNode OR() { return getToken(MiniPascalParser.OR, 0); }
		public Logical_oprOrContext(Logical_oprContext ctx) { copyFrom(ctx); }
		@Override
		public void enterRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).enterLogical_oprOr(this);
		}
		@Override
		public void exitRule(ParseTreeListener listener) {
			if ( listener instanceof MiniPascalListener ) ((MiniPascalListener)listener).exitLogical_oprOr(this);
		}
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof MiniPascalVisitor ) return ((MiniPascalVisitor<? extends T>)visitor).visitLogical_oprOr(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_oprContext logical_opr() throws RecognitionException {
		Logical_oprContext _localctx = new Logical_oprContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_logical_opr);
		try {
			setState(538);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AND:
				_localctx = new Logical_oprAndContext(_localctx);
				enterOuterAlt(_localctx, 1);
				{
				setState(536);
				match(AND);
				}
				break;
			case OR:
				_localctx = new Logical_oprOrContext(_localctx);
				enterOuterAlt(_localctx, 2);
				{
				setState(537);
				match(OR);
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

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 22:
			return expr_sempred((ExprContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean expr_sempred(ExprContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 11);
		case 1:
			return precpred(_ctx, 9);
		case 2:
			return precpred(_ctx, 8);
		case 3:
			return precpred(_ctx, 7);
		}
		return true;
	}

	public static final String _serializedATN =
		"\u0004\u0001O\u021d\u0002\u0000\u0007\u0000\u0002\u0001\u0007\u0001\u0002"+
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
		"\t\u0005\t\u0108\b\t\n\t\f\t\u010b\t\t\u0001\n\u0001\n\u0001\n\u0001\n"+
		"\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001\n\u0001"+
		"\n\u0001\n\u0001\n\u0004\n\u011c\b\n\u000b\n\f\n\u011d\u0001\n\u0001\n"+
		"\u0001\n\u0003\n\u0123\b\n\u0001\u000b\u0001\u000b\u0004\u000b\u0127\b"+
		"\u000b\u000b\u000b\f\u000b\u0128\u0001\u000b\u0001\u000b\u0001\u000b\u0001"+
		"\u000b\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f"+
		"\u0136\b\f\n\f\f\f\u0139\t\f\u0001\f\u0003\f\u013c\b\f\u0001\f\u0001\f"+
		"\u0001\f\u0001\f\u0001\f\u0001\f\u0001\f\u0004\f\u0145\b\f\u000b\f\f\f"+
		"\u0146\u0001\f\u0001\f\u0001\f\u0001\f\u0005\f\u014d\b\f\n\f\f\f\u0150"+
		"\t\f\u0001\f\u0003\f\u0153\b\f\u0003\f\u0155\b\f\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001\r\u0001"+
		"\r\u0001\r\u0001\r\u0004\r\u0165\b\r\u000b\r\f\r\u0166\u0001\r\u0001\r"+
		"\u0001\r\u0003\r\u016c\b\r\u0001\u000e\u0001\u000e\u0001\u000e\u0001\u000e"+
		"\u0001\u000e\u0004\u000e\u0173\b\u000e\u000b\u000e\f\u000e\u0174\u0001"+
		"\u000e\u0001\u000e\u0001\u000e\u0003\u000e\u017a\b\u000e\u0001\u000f\u0001"+
		"\u000f\u0004\u000f\u017e\b\u000f\u000b\u000f\f\u000f\u017f\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u018c\b\u0010\n\u0010"+
		"\f\u0010\u018f\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0005\u0010\u0198\b\u0010\n\u0010"+
		"\f\u0010\u019b\t\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0003\u0010\u01a3\b\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0001\u0010"+
		"\u0001\u0010\u0005\u0010\u01b4\b\u0010\n\u0010\f\u0010\u01b7\t\u0010\u0001"+
		"\u0010\u0001\u0010\u0001\u0010\u0001\u0010\u0003\u0010\u01bd\b\u0010\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01c9\b\u0011\u0001"+
		"\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0001\u0011\u0003\u0011\u01d0"+
		"\b\u0011\u0001\u0012\u0001\u0012\u0001\u0012\u0001\u0012\u0003\u0012\u01d6"+
		"\b\u0012\u0001\u0013\u0001\u0013\u0001\u0013\u0003\u0013\u01db\b\u0013"+
		"\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0001\u0014\u0003\u0014"+
		"\u01e2\b\u0014\u0001\u0014\u0001\u0014\u0001\u0015\u0001\u0015\u0003\u0015"+
		"\u01e8\b\u0015\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0003\u0016\u01f8\b\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016\u0001\u0016"+
		"\u0001\u0016\u0005\u0016\u0208\b\u0016\n\u0016\f\u0016\u020b\t\u0016\u0001"+
		"\u0017\u0001\u0017\u0001\u0017\u0001\u0017\u0001\u0018\u0001\u0018\u0001"+
		"\u0018\u0001\u0018\u0001\u0018\u0001\u0018\u0003\u0018\u0217\b\u0018\u0001"+
		"\u0019\u0001\u0019\u0003\u0019\u021b\b\u0019\u0001\u0019\u0000\u0001,"+
		"\u001a\u0000\u0002\u0004\u0006\b\n\f\u000e\u0010\u0012\u0014\u0016\u0018"+
		"\u001a\u001c\u001e \"$&(*,.02\u0000\u0002\u0003\u0000\u0007\u0007\u0014"+
		"\u0014=>\u0001\u0000;<\u0256\u00004\u0001\u0000\u0000\u0000\u00027\u0001"+
		"\u0000\u0000\u0000\u0004f\u0001\u0000\u0000\u0000\u0006j\u0001\u0000\u0000"+
		"\u0000\b\u00a1\u0001\u0000\u0000\u0000\n\u00ab\u0001\u0000\u0000\u0000"+
		"\f\u00ad\u0001\u0000\u0000\u0000\u000e\u00cd\u0001\u0000\u0000\u0000\u0010"+
		"\u0101\u0001\u0000\u0000\u0000\u0012\u0103\u0001\u0000\u0000\u0000\u0014"+
		"\u0122\u0001\u0000\u0000\u0000\u0016\u0124\u0001\u0000\u0000\u0000\u0018"+
		"\u0154\u0001\u0000\u0000\u0000\u001a\u016b\u0001\u0000\u0000\u0000\u001c"+
		"\u0179\u0001\u0000\u0000\u0000\u001e\u017b\u0001\u0000\u0000\u0000 \u01bc"+
		"\u0001\u0000\u0000\u0000\"\u01cf\u0001\u0000\u0000\u0000$\u01d5\u0001"+
		"\u0000\u0000\u0000&\u01da\u0001\u0000\u0000\u0000(\u01dc\u0001\u0000\u0000"+
		"\u0000*\u01e7\u0001\u0000\u0000\u0000,\u01f7\u0001\u0000\u0000\u0000."+
		"\u020c\u0001\u0000\u0000\u00000\u0216\u0001\u0000\u0000\u00002\u021a\u0001"+
		"\u0000\u0000\u000045\u0003\u0002\u0001\u000056\u0005\u0000\u0000\u0001"+
		"6\u0001\u0001\u0000\u0000\u000078\u0005\u001b\u0000\u000089\u00051\u0000"+
		"\u00009;\u00055\u0000\u0000:<\u0003\u001e\u000f\u0000;:\u0001\u0000\u0000"+
		"\u0000;<\u0001\u0000\u0000\u0000<>\u0001\u0000\u0000\u0000=?\u0003\u0004"+
		"\u0002\u0000>=\u0001\u0000\u0000\u0000>?\u0001\u0000\u0000\u0000?@\u0001"+
		"\u0000\u0000\u0000@B\u0005\u0004\u0000\u0000AC\u0003\n\u0005\u0000BA\u0001"+
		"\u0000\u0000\u0000CD\u0001\u0000\u0000\u0000DB\u0001\u0000\u0000\u0000"+
		"DE\u0001\u0000\u0000\u0000EF\u0001\u0000\u0000\u0000FG\u0005\f\u0000\u0000"+
		"GH\u00052\u0000\u0000H\u0003\u0001\u0000\u0000\u0000IJ\u0005\u000f\u0000"+
		"\u0000JK\u00051\u0000\u0000KT\u00056\u0000\u0000LQ\u0003\b\u0004\u0000"+
		"MN\u00055\u0000\u0000NP\u0003\b\u0004\u0000OM\u0001\u0000\u0000\u0000"+
		"PS\u0001\u0000\u0000\u0000QO\u0001\u0000\u0000\u0000QR\u0001\u0000\u0000"+
		"\u0000RU\u0001\u0000\u0000\u0000SQ\u0001\u0000\u0000\u0000TL\u0001\u0000"+
		"\u0000\u0000TU\u0001\u0000\u0000\u0000UV\u0001\u0000\u0000\u0000VW\u0005"+
		"7\u0000\u0000WX\u00054\u0000\u0000XY\u0003$\u0012\u0000Y[\u00055\u0000"+
		"\u0000Z\\\u0003\u001e\u000f\u0000[Z\u0001\u0000\u0000\u0000[\\\u0001\u0000"+
		"\u0000\u0000\\]\u0001\u0000\u0000\u0000]_\u0005\u0004\u0000\u0000^`\u0003"+
		"\n\u0005\u0000_^\u0001\u0000\u0000\u0000`a\u0001\u0000\u0000\u0000a_\u0001"+
		"\u0000\u0000\u0000ab\u0001\u0000\u0000\u0000bc\u0001\u0000\u0000\u0000"+
		"cd\u0005\f\u0000\u0000de\u00055\u0000\u0000eg\u0001\u0000\u0000\u0000"+
		"fI\u0001\u0000\u0000\u0000gh\u0001\u0000\u0000\u0000hf\u0001\u0000\u0000"+
		"\u0000hi\u0001\u0000\u0000\u0000i\u0005\u0001\u0000\u0000\u0000jk\u0005"+
		"1\u0000\u0000kt\u00056\u0000\u0000lq\u0003,\u0016\u0000mn\u00053\u0000"+
		"\u0000np\u0003,\u0016\u0000om\u0001\u0000\u0000\u0000ps\u0001\u0000\u0000"+
		"\u0000qo\u0001\u0000\u0000\u0000qr\u0001\u0000\u0000\u0000ru\u0001\u0000"+
		"\u0000\u0000sq\u0001\u0000\u0000\u0000tl\u0001\u0000\u0000\u0000tu\u0001"+
		"\u0000\u0000\u0000uv\u0001\u0000\u0000\u0000vw\u00057\u0000\u0000wx\u0005"+
		"5\u0000\u0000x\u0007\u0001\u0000\u0000\u0000y~\u00051\u0000\u0000z{\u0005"+
		"3\u0000\u0000{}\u00051\u0000\u0000|z\u0001\u0000\u0000\u0000}\u0080\u0001"+
		"\u0000\u0000\u0000~|\u0001\u0000\u0000\u0000~\u007f\u0001\u0000\u0000"+
		"\u0000\u007f\u0081\u0001\u0000\u0000\u0000\u0080~\u0001\u0000\u0000\u0000"+
		"\u0081\u0082\u00054\u0000\u0000\u0082\u00a2\u0003$\u0012\u0000\u0083\u0088"+
		"\u00051\u0000\u0000\u0084\u0085\u00053\u0000\u0000\u0085\u0087\u00051"+
		"\u0000\u0000\u0086\u0084\u0001\u0000\u0000\u0000\u0087\u008a\u0001\u0000"+
		"\u0000\u0000\u0088\u0086\u0001\u0000\u0000\u0000\u0088\u0089\u0001\u0000"+
		"\u0000\u0000\u0089\u008b\u0001\u0000\u0000\u0000\u008a\u0088\u0001\u0000"+
		"\u0000\u0000\u008b\u008c\u00054\u0000\u0000\u008c\u008d\u0005\u0003\u0000"+
		"\u0000\u008d\u008e\u00058\u0000\u0000\u008e\u0091\u0003.\u0017\u0000\u008f"+
		"\u0090\u00053\u0000\u0000\u0090\u0092\u0003.\u0017\u0000\u0091\u008f\u0001"+
		"\u0000\u0000\u0000\u0091\u0092\u0001\u0000\u0000\u0000\u0092\u0093\u0001"+
		"\u0000\u0000\u0000\u0093\u0094\u00059\u0000\u0000\u0094\u0095\u0005\u0018"+
		"\u0000\u0000\u0095\u0096\u0003&\u0013\u0000\u0096\u00a2\u0001\u0000\u0000"+
		"\u0000\u0097\u009c\u00051\u0000\u0000\u0098\u0099\u00053\u0000\u0000\u0099"+
		"\u009b\u00051\u0000\u0000\u009a\u0098\u0001\u0000\u0000\u0000\u009b\u009e"+
		"\u0001\u0000\u0000\u0000\u009c\u009a\u0001\u0000\u0000\u0000\u009c\u009d"+
		"\u0001\u0000\u0000\u0000\u009d\u009f\u0001\u0000\u0000\u0000\u009e\u009c"+
		"\u0001\u0000\u0000\u0000\u009f\u00a0\u00054\u0000\u0000\u00a0\u00a2\u0003"+
		"*\u0015\u0000\u00a1y\u0001\u0000\u0000\u0000\u00a1\u0083\u0001\u0000\u0000"+
		"\u0000\u00a1\u0097\u0001\u0000\u0000\u0000\u00a2\t\u0001\u0000\u0000\u0000"+
		"\u00a3\u00ac\u0003\"\u0011\u0000\u00a4\u00ac\u0003\u0006\u0003\u0000\u00a5"+
		"\u00ac\u0003\f\u0006\u0000\u00a6\u00ac\u0003\u000e\u0007\u0000\u00a7\u00ac"+
		"\u0003\u0010\b\u0000\u00a8\u00ac\u0003\u0014\n\u0000\u00a9\u00ac\u0003"+
		"\u0016\u000b\u0000\u00aa\u00ac\u0003\u0018\f\u0000\u00ab\u00a3\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a4\u0001\u0000\u0000\u0000\u00ab\u00a5\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a6\u0001\u0000\u0000\u0000\u00ab\u00a7\u0001\u0000"+
		"\u0000\u0000\u00ab\u00a8\u0001\u0000\u0000\u0000\u00ab\u00a9\u0001\u0000"+
		"\u0000\u0000\u00ab\u00aa\u0001\u0000\u0000\u0000\u00ac\u000b\u0001\u0000"+
		"\u0000\u0000\u00ad\u00ae\u0005\u001c\u0000\u0000\u00ae\u00af\u00056\u0000"+
		"\u0000\u00af\u00b0\u00051\u0000\u0000\u00b0\u00b1\u00057\u0000\u0000\u00b1"+
		"\u00b2\u00055\u0000\u0000\u00b2\r\u0001\u0000\u0000\u0000\u00b3\u00b4"+
		"\u0005\'\u0000\u0000\u00b4\u00b5\u00056\u0000\u0000\u00b5\u00bc\u0005"+
		"0\u0000\u0000\u00b6\u00ba\u00053\u0000\u0000\u00b7\u00bb\u0003,\u0016"+
		"\u0000\u00b8\u00bb\u0005I\u0000\u0000\u00b9\u00bb\u00051\u0000\u0000\u00ba"+
		"\u00b7\u0001\u0000\u0000\u0000\u00ba\u00b8\u0001\u0000\u0000\u0000\u00ba"+
		"\u00b9\u0001\u0000\u0000\u0000\u00bb\u00bd\u0001\u0000\u0000\u0000\u00bc"+
		"\u00b6\u0001\u0000\u0000\u0000\u00bc\u00bd\u0001\u0000\u0000\u0000\u00bd"+
		"\u00be\u0001\u0000\u0000\u0000\u00be\u00bf\u00057\u0000\u0000\u00bf\u00ce"+
		"\u00055\u0000\u0000\u00c0\u00c1\u0005&\u0000\u0000\u00c1\u00c2\u00056"+
		"\u0000\u0000\u00c2\u00c9\u00050\u0000\u0000\u00c3\u00c7\u00053\u0000\u0000"+
		"\u00c4\u00c8\u0003,\u0016\u0000\u00c5\u00c8\u0005I\u0000\u0000\u00c6\u00c8"+
		"\u00051\u0000\u0000\u00c7\u00c4\u0001\u0000\u0000\u0000\u00c7\u00c5\u0001"+
		"\u0000\u0000\u0000\u00c7\u00c6\u0001\u0000\u0000\u0000\u00c8\u00ca\u0001"+
		"\u0000\u0000\u0000\u00c9\u00c3\u0001\u0000\u0000\u0000\u00c9\u00ca\u0001"+
		"\u0000\u0000\u0000\u00ca\u00cb\u0001\u0000\u0000\u0000\u00cb\u00cc\u0005"+
		"7\u0000\u0000\u00cc\u00ce\u00055\u0000\u0000\u00cd\u00b3\u0001\u0000\u0000"+
		"\u0000\u00cd\u00c0\u0001\u0000\u0000\u0000\u00ce\u000f\u0001\u0000\u0000"+
		"\u0000\u00cf\u00d0\u0005\u000e\u0000\u0000\u00d0\u00d1\u00051\u0000\u0000"+
		"\u00d1\u00d2\u0005:\u0000\u0000\u00d2\u00d3\u0003,\u0016\u0000\u00d3\u00d4"+
		"\u0005!\u0000\u0000\u00d4\u00d5\u0003,\u0016\u0000\u00d5\u00d6\u0005\b"+
		"\u0000\u0000\u00d6\u00d7\u0003\n\u0005\u0000\u00d7\u0102\u0001\u0000\u0000"+
		"\u0000\u00d8\u00d9\u0005\u000e\u0000\u0000\u00d9\u00da\u00051\u0000\u0000"+
		"\u00da\u00db\u0005:\u0000\u0000\u00db\u00dc\u0003,\u0016\u0000\u00dc\u00dd"+
		"\u0005!\u0000\u0000\u00dd\u00de\u0003,\u0016\u0000\u00de\u00df\u0005\b"+
		"\u0000\u0000\u00df\u00e1\u0005\u0004\u0000\u0000\u00e0\u00e2\u0003\n\u0005"+
		"\u0000\u00e1\u00e0\u0001\u0000\u0000\u0000\u00e2\u00e3\u0001\u0000\u0000"+
		"\u0000\u00e3\u00e1\u0001\u0000\u0000\u0000\u00e3\u00e4\u0001\u0000\u0000"+
		"\u0000\u00e4\u00e5\u0001\u0000\u0000\u0000\u00e5\u00e6\u0005\f\u0000\u0000"+
		"\u00e6\u00e7\u00055\u0000\u0000\u00e7\u0102\u0001\u0000\u0000\u0000\u00e8"+
		"\u00e9\u0005\u000e\u0000\u0000\u00e9\u00ea\u00051\u0000\u0000\u00ea\u00eb"+
		"\u0005:\u0000\u0000\u00eb\u00ec\u0003,\u0016\u0000\u00ec\u00ed\u0005\t"+
		"\u0000\u0000\u00ed\u00ee\u0003,\u0016\u0000\u00ee\u00ef\u0005\b\u0000"+
		"\u0000\u00ef\u00f0\u0003\n\u0005\u0000\u00f0\u0102\u0001\u0000\u0000\u0000"+
		"\u00f1\u00f2\u0005\u000e\u0000\u0000\u00f2\u00f3\u00051\u0000\u0000\u00f3"+
		"\u00f4\u0005:\u0000\u0000\u00f4\u00f5\u0003,\u0016\u0000\u00f5\u00f6\u0005"+
		"\t\u0000\u0000\u00f6\u00f7\u0003,\u0016\u0000\u00f7\u00f8\u0005\b\u0000"+
		"\u0000\u00f8\u00fa\u0005\u0004\u0000\u0000\u00f9\u00fb\u0003\n\u0005\u0000"+
		"\u00fa\u00f9\u0001\u0000\u0000\u0000\u00fb\u00fc\u0001\u0000\u0000\u0000"+
		"\u00fc\u00fa\u0001\u0000\u0000\u0000\u00fc\u00fd\u0001\u0000\u0000\u0000"+
		"\u00fd\u00fe\u0001\u0000\u0000\u0000\u00fe\u00ff\u0005\f\u0000\u0000\u00ff"+
		"\u0100\u00055\u0000\u0000\u0100\u0102\u0001\u0000\u0000\u0000\u0101\u00cf"+
		"\u0001\u0000\u0000\u0000\u0101\u00d8\u0001\u0000\u0000\u0000\u0101\u00e8"+
		"\u0001\u0000\u0000\u0000\u0101\u00f1\u0001\u0000\u0000\u0000\u0102\u0011"+
		"\u0001\u0000\u0000\u0000\u0103\u0109\u0003,\u0016\u0000\u0104\u0105\u0003"+
		"2\u0019\u0000\u0105\u0106\u0003,\u0016\u0000\u0106\u0108\u0001\u0000\u0000"+
		"\u0000\u0107\u0104\u0001\u0000\u0000\u0000\u0108\u010b\u0001\u0000\u0000"+
		"\u0000\u0109\u0107\u0001\u0000\u0000\u0000\u0109\u010a\u0001\u0000\u0000"+
		"\u0000\u010a\u0013\u0001\u0000\u0000\u0000\u010b\u0109\u0001\u0000\u0000"+
		"\u0000\u010c\u010d\u0005%\u0000\u0000\u010d\u010e\u00056\u0000\u0000\u010e"+
		"\u010f\u0003\u0012\t\u0000\u010f\u0110\u00057\u0000\u0000\u0110\u0111"+
		"\u0005\b\u0000\u0000\u0111\u0112\u0003\n\u0005\u0000\u0112\u0113\u0005"+
		"5\u0000\u0000\u0113\u0123\u0001\u0000\u0000\u0000\u0114\u0115\u0005%\u0000"+
		"\u0000\u0115\u0116\u00056\u0000\u0000\u0116\u0117\u0003\u0012\t\u0000"+
		"\u0117\u0118\u00057\u0000\u0000\u0118\u0119\u0005\b\u0000\u0000\u0119"+
		"\u011b\u0005\u0004\u0000\u0000\u011a\u011c\u0003\n\u0005\u0000\u011b\u011a"+
		"\u0001\u0000\u0000\u0000\u011c\u011d\u0001\u0000\u0000\u0000\u011d\u011b"+
		"\u0001\u0000\u0000\u0000\u011d\u011e\u0001\u0000\u0000\u0000\u011e\u011f"+
		"\u0001\u0000\u0000\u0000\u011f\u0120\u0005\f\u0000\u0000\u0120\u0121\u0005"+
		"5\u0000\u0000\u0121\u0123\u0001\u0000\u0000\u0000\u0122\u010c\u0001\u0000"+
		"\u0000\u0000\u0122\u0114\u0001\u0000\u0000\u0000\u0123\u0015\u0001\u0000"+
		"\u0000\u0000\u0124\u0126\u0005\u001e\u0000\u0000\u0125\u0127\u0003\n\u0005"+
		"\u0000\u0126\u0125\u0001\u0000\u0000\u0000\u0127\u0128\u0001\u0000\u0000"+
		"\u0000\u0128\u0126\u0001\u0000\u0000\u0000\u0128\u0129\u0001\u0000\u0000"+
		"\u0000\u0129\u012a\u0001\u0000\u0000\u0000\u012a\u012b\u0005#\u0000\u0000"+
		"\u012b\u012c\u0003\u0012\t\u0000\u012c\u012d\u00055\u0000\u0000\u012d"+
		"\u0017\u0001\u0000\u0000\u0000\u012e\u012f\u0005\u0011\u0000\u0000\u012f"+
		"\u0130\u00056\u0000\u0000\u0130\u0131\u0003\u0012\t\u0000\u0131\u0132"+
		"\u00057\u0000\u0000\u0132\u0133\u0005 \u0000\u0000\u0133\u0137\u0003\n"+
		"\u0005\u0000\u0134\u0136\u0003\u001a\r\u0000\u0135\u0134\u0001\u0000\u0000"+
		"\u0000\u0136\u0139\u0001\u0000\u0000\u0000\u0137\u0135\u0001\u0000\u0000"+
		"\u0000\u0137\u0138\u0001\u0000\u0000\u0000\u0138\u013b\u0001\u0000\u0000"+
		"\u0000\u0139\u0137\u0001\u0000\u0000\u0000\u013a\u013c\u0003\u001c\u000e"+
		"\u0000\u013b\u013a\u0001\u0000\u0000\u0000\u013b\u013c\u0001\u0000\u0000"+
		"\u0000\u013c\u0155\u0001\u0000\u0000\u0000\u013d\u013e\u0005\u0011\u0000"+
		"\u0000\u013e\u013f\u00056\u0000\u0000\u013f\u0140\u0003\u0012\t\u0000"+
		"\u0140\u0141\u00057\u0000\u0000\u0141\u0142\u0005 \u0000\u0000\u0142\u0144"+
		"\u0005\u0004\u0000\u0000\u0143\u0145\u0003\n\u0005\u0000\u0144\u0143\u0001"+
		"\u0000\u0000\u0000\u0145\u0146\u0001\u0000\u0000\u0000\u0146\u0144\u0001"+
		"\u0000\u0000\u0000\u0146\u0147\u0001\u0000\u0000\u0000\u0147\u0148\u0001"+
		"\u0000\u0000\u0000\u0148\u0149\u0005\f\u0000\u0000\u0149\u014a\u00055"+
		"\u0000\u0000\u014a\u014e\u0001\u0000\u0000\u0000\u014b\u014d\u0003\u001a"+
		"\r\u0000\u014c\u014b\u0001\u0000\u0000\u0000\u014d\u0150\u0001\u0000\u0000"+
		"\u0000\u014e\u014c\u0001\u0000\u0000\u0000\u014e\u014f\u0001\u0000\u0000"+
		"\u0000\u014f\u0152\u0001\u0000\u0000\u0000\u0150\u014e\u0001\u0000\u0000"+
		"\u0000\u0151\u0153\u0003\u001c\u000e\u0000\u0152\u0151\u0001\u0000\u0000"+
		"\u0000\u0152\u0153\u0001\u0000\u0000\u0000\u0153\u0155\u0001\u0000\u0000"+
		"\u0000\u0154\u012e\u0001\u0000\u0000\u0000\u0154\u013d\u0001\u0000\u0000"+
		"\u0000\u0155\u0019\u0001\u0000\u0000\u0000\u0156\u0157\u0005\u000b\u0000"+
		"\u0000\u0157\u0158\u00056\u0000\u0000\u0158\u0159\u0003\u0012\t\u0000"+
		"\u0159\u015a\u00057\u0000\u0000\u015a\u015b\u0005 \u0000\u0000\u015b\u015c"+
		"\u0003\n\u0005\u0000\u015c\u016c\u0001\u0000\u0000\u0000\u015d\u015e\u0005"+
		"\u000b\u0000\u0000\u015e\u015f\u00056\u0000\u0000\u015f\u0160\u0003\u0012"+
		"\t\u0000\u0160\u0161\u00057\u0000\u0000\u0161\u0162\u0005 \u0000\u0000"+
		"\u0162\u0164\u0005\u0004\u0000\u0000\u0163\u0165\u0003\n\u0005\u0000\u0164"+
		"\u0163\u0001\u0000\u0000\u0000\u0165\u0166\u0001\u0000\u0000\u0000\u0166"+
		"\u0164\u0001\u0000\u0000\u0000\u0166\u0167\u0001\u0000\u0000\u0000\u0167"+
		"\u0168\u0001\u0000\u0000\u0000\u0168\u0169\u0005\f\u0000\u0000\u0169\u016a"+
		"\u00055\u0000\u0000\u016a\u016c\u0001\u0000\u0000\u0000\u016b\u0156\u0001"+
		"\u0000\u0000\u0000\u016b\u015d\u0001\u0000\u0000\u0000\u016c\u001b\u0001"+
		"\u0000\u0000\u0000\u016d\u016e\u0005\n\u0000\u0000\u016e\u017a\u0003\n"+
		"\u0005\u0000\u016f\u0170\u0005\n\u0000\u0000\u0170\u0172\u0005\u0004\u0000"+
		"\u0000\u0171\u0173\u0003\n\u0005\u0000\u0172\u0171\u0001\u0000\u0000\u0000"+
		"\u0173\u0174\u0001\u0000\u0000\u0000\u0174\u0172\u0001\u0000\u0000\u0000"+
		"\u0174\u0175\u0001\u0000\u0000\u0000\u0175\u0176\u0001\u0000\u0000\u0000"+
		"\u0176\u0177\u0005\f\u0000\u0000\u0177\u0178\u00055\u0000\u0000\u0178"+
		"\u017a\u0001\u0000\u0000\u0000\u0179\u016d\u0001\u0000\u0000\u0000\u0179"+
		"\u016f\u0001\u0000\u0000\u0000\u017a\u001d\u0001\u0000\u0000\u0000\u017b"+
		"\u017d\u0005$\u0000\u0000\u017c\u017e\u0003 \u0010\u0000\u017d\u017c\u0001"+
		"\u0000\u0000\u0000\u017e\u017f\u0001\u0000\u0000\u0000\u017f\u017d\u0001"+
		"\u0000\u0000\u0000\u017f\u0180\u0001\u0000\u0000\u0000\u0180\u001f\u0001"+
		"\u0000\u0000\u0000\u0181\u0182\u00051\u0000\u0000\u0182\u0183\u00054\u0000"+
		"\u0000\u0183\u0184\u0003$\u0012\u0000\u0184\u0185\u0005:\u0000\u0000\u0185"+
		"\u0186\u0003,\u0016\u0000\u0186\u0187\u00055\u0000\u0000\u0187\u01bd\u0001"+
		"\u0000\u0000\u0000\u0188\u018d\u00051\u0000\u0000\u0189\u018a\u00053\u0000"+
		"\u0000\u018a\u018c\u00051\u0000\u0000\u018b\u0189\u0001\u0000\u0000\u0000"+
		"\u018c\u018f\u0001\u0000\u0000\u0000\u018d\u018b\u0001\u0000\u0000\u0000"+
		"\u018d\u018e\u0001\u0000\u0000\u0000\u018e\u0190\u0001\u0000\u0000\u0000"+
		"\u018f\u018d\u0001\u0000\u0000\u0000\u0190\u0191\u00054\u0000\u0000\u0191"+
		"\u0192\u0003$\u0012\u0000\u0192\u0193\u00055\u0000\u0000\u0193\u01bd\u0001"+
		"\u0000\u0000\u0000\u0194\u0199\u00051\u0000\u0000\u0195\u0196\u00053\u0000"+
		"\u0000\u0196\u0198\u00051\u0000\u0000\u0197\u0195\u0001\u0000\u0000\u0000"+
		"\u0198\u019b\u0001\u0000\u0000\u0000\u0199\u0197\u0001\u0000\u0000\u0000"+
		"\u0199\u019a\u0001\u0000\u0000\u0000\u019a\u019c\u0001\u0000\u0000\u0000"+
		"\u019b\u0199\u0001\u0000\u0000\u0000\u019c\u019d\u00054\u0000\u0000\u019d"+
		"\u019e\u0005\u0003\u0000\u0000\u019e\u019f\u00058\u0000\u0000\u019f\u01a2"+
		"\u0003.\u0017\u0000\u01a0\u01a1\u00053\u0000\u0000\u01a1\u01a3\u0003."+
		"\u0017\u0000\u01a2\u01a0\u0001\u0000\u0000\u0000\u01a2\u01a3\u0001\u0000"+
		"\u0000\u0000\u01a3\u01a4\u0001\u0000\u0000\u0000\u01a4\u01a5\u00059\u0000"+
		"\u0000\u01a5\u01a6\u0005\u0018\u0000\u0000\u01a6\u01a7\u0003&\u0013\u0000"+
		"\u01a7\u01a8\u00055\u0000\u0000\u01a8\u01bd\u0001\u0000\u0000\u0000\u01a9"+
		"\u01aa\u00051\u0000\u0000\u01aa\u01ab\u00054\u0000\u0000\u01ab\u01ac\u0003"+
		"*\u0015\u0000\u01ac\u01ad\u0005:\u0000\u0000\u01ad\u01ae\u00050\u0000"+
		"\u0000\u01ae\u01af\u00055\u0000\u0000\u01af\u01bd\u0001\u0000\u0000\u0000"+
		"\u01b0\u01b5\u00051\u0000\u0000\u01b1\u01b2\u00053\u0000\u0000\u01b2\u01b4"+
		"\u00051\u0000\u0000\u01b3\u01b1\u0001\u0000\u0000\u0000\u01b4\u01b7\u0001"+
		"\u0000\u0000\u0000\u01b5\u01b3\u0001\u0000\u0000\u0000\u01b5\u01b6\u0001"+
		"\u0000\u0000\u0000\u01b6\u01b8\u0001\u0000\u0000\u0000\u01b7\u01b5\u0001"+
		"\u0000\u0000\u0000\u01b8\u01b9\u00054\u0000\u0000\u01b9\u01ba\u0003*\u0015"+
		"\u0000\u01ba\u01bb\u00055\u0000\u0000\u01bb\u01bd\u0001\u0000\u0000\u0000"+
		"\u01bc\u0181\u0001\u0000\u0000\u0000\u01bc\u0188\u0001\u0000\u0000\u0000"+
		"\u01bc\u0194\u0001\u0000\u0000\u0000\u01bc\u01a9\u0001\u0000\u0000\u0000"+
		"\u01bc\u01b0\u0001\u0000\u0000\u0000\u01bd!\u0001\u0000\u0000\u0000\u01be"+
		"\u01bf\u00051\u0000\u0000\u01bf\u01c0\u0005:\u0000\u0000\u01c0\u01c1\u0003"+
		",\u0016\u0000\u01c1\u01c2\u00055\u0000\u0000\u01c2\u01d0\u0001\u0000\u0000"+
		"\u0000\u01c3\u01c4\u00051\u0000\u0000\u01c4\u01c5\u00058\u0000\u0000\u01c5"+
		"\u01c8\u0003,\u0016\u0000\u01c6\u01c7\u00053\u0000\u0000\u01c7\u01c9\u0003"+
		",\u0016\u0000\u01c8\u01c6\u0001\u0000\u0000\u0000\u01c8\u01c9\u0001\u0000"+
		"\u0000\u0000\u01c9\u01ca\u0001\u0000\u0000\u0000\u01ca\u01cb\u00059\u0000"+
		"\u0000\u01cb\u01cc\u0005:\u0000\u0000\u01cc\u01cd\u0003,\u0016\u0000\u01cd"+
		"\u01ce\u00055\u0000\u0000\u01ce\u01d0\u0001\u0000\u0000\u0000\u01cf\u01be"+
		"\u0001\u0000\u0000\u0000\u01cf\u01c3\u0001\u0000\u0000\u0000\u01d0#\u0001"+
		"\u0000\u0000\u0000\u01d1\u01d6\u0005)\u0000\u0000\u01d2\u01d6\u0005+\u0000"+
		"\u0000\u01d3\u01d6\u0005,\u0000\u0000\u01d4\u01d6\u0005-\u0000\u0000\u01d5"+
		"\u01d1\u0001\u0000\u0000\u0000\u01d5\u01d2\u0001\u0000\u0000\u0000\u01d5"+
		"\u01d3\u0001\u0000\u0000\u0000\u01d5\u01d4\u0001\u0000\u0000\u0000\u01d6"+
		"%\u0001\u0000\u0000\u0000\u01d7\u01db\u0005)\u0000\u0000\u01d8\u01db\u0005"+
		"+\u0000\u0000\u01d9\u01db\u0005,\u0000\u0000\u01da\u01d7\u0001\u0000\u0000"+
		"\u0000\u01da\u01d8\u0001\u0000\u0000\u0000\u01da\u01d9\u0001\u0000\u0000"+
		"\u0000\u01db\'\u0001\u0000\u0000\u0000\u01dc\u01dd\u00051\u0000\u0000"+
		"\u01dd\u01de\u00058\u0000\u0000\u01de\u01e1\u0003,\u0016\u0000\u01df\u01e0"+
		"\u00053\u0000\u0000\u01e0\u01e2\u0003,\u0016\u0000\u01e1\u01df\u0001\u0000"+
		"\u0000\u0000\u01e1\u01e2\u0001\u0000\u0000\u0000\u01e2\u01e3\u0001\u0000"+
		"\u0000\u0000\u01e3\u01e4\u00059\u0000\u0000\u01e4)\u0001\u0000\u0000\u0000"+
		"\u01e5\u01e8\u0005.\u0000\u0000\u01e6\u01e8\u0005/\u0000\u0000\u01e7\u01e5"+
		"\u0001\u0000\u0000\u0000\u01e7\u01e6\u0001\u0000\u0000\u0000\u01e8+\u0001"+
		"\u0000\u0000\u0000\u01e9\u01ea\u0006\u0016\uffff\uffff\u0000\u01ea\u01eb"+
		"\u00056\u0000\u0000\u01eb\u01ec\u0003,\u0016\u0000\u01ec\u01ed\u00057"+
		"\u0000\u0000\u01ed\u01f8\u0001\u0000\u0000\u0000\u01ee\u01ef\u0005<\u0000"+
		"\u0000\u01ef\u01f8\u0003,\u0016\n\u01f0\u01f1\u0005\u0016\u0000\u0000"+
		"\u01f1\u01f8\u0003,\u0016\u0006\u01f2\u01f8\u0005M\u0000\u0000\u01f3\u01f8"+
		"\u0005N\u0000\u0000\u01f4\u01f8\u0005I\u0000\u0000\u01f5\u01f8\u0003("+
		"\u0014\u0000\u01f6\u01f8\u00051\u0000\u0000\u01f7\u01e9\u0001\u0000\u0000"+
		"\u0000\u01f7\u01ee\u0001\u0000\u0000\u0000\u01f7\u01f0\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f2\u0001\u0000\u0000\u0000\u01f7\u01f3\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f4\u0001\u0000\u0000\u0000\u01f7\u01f5\u0001\u0000\u0000"+
		"\u0000\u01f7\u01f6\u0001\u0000\u0000\u0000\u01f8\u0209\u0001\u0000\u0000"+
		"\u0000\u01f9\u01fa\n\u000b\u0000\u0000\u01fa\u01fb\u0007\u0000\u0000\u0000"+
		"\u01fb\u0208\u0003,\u0016\f\u01fc\u01fd\n\t\u0000\u0000\u01fd\u01fe\u0007"+
		"\u0001\u0000\u0000\u01fe\u0208\u0003,\u0016\n\u01ff\u0200\n\b\u0000\u0000"+
		"\u0200\u0201\u00030\u0018\u0000\u0201\u0202\u0003,\u0016\t\u0202\u0208"+
		"\u0001\u0000\u0000\u0000\u0203\u0204\n\u0007\u0000\u0000\u0204\u0205\u0003"+
		"2\u0019\u0000\u0205\u0206\u0003,\u0016\b\u0206\u0208\u0001\u0000\u0000"+
		"\u0000\u0207\u01f9\u0001\u0000\u0000\u0000\u0207\u01fc\u0001\u0000\u0000"+
		"\u0000\u0207\u01ff\u0001\u0000\u0000\u0000\u0207\u0203\u0001\u0000\u0000"+
		"\u0000\u0208\u020b\u0001\u0000\u0000\u0000\u0209\u0207\u0001\u0000\u0000"+
		"\u0000\u0209\u020a\u0001\u0000\u0000\u0000\u020a-\u0001\u0000\u0000\u0000"+
		"\u020b\u0209\u0001\u0000\u0000\u0000\u020c\u020d\u0003,\u0016\u0000\u020d"+
		"\u020e\u0005\u0001\u0000\u0000\u020e\u020f\u0003,\u0016\u0000\u020f/\u0001"+
		"\u0000\u0000\u0000\u0210\u0217\u0005?\u0000\u0000\u0211\u0217\u0005@\u0000"+
		"\u0000\u0212\u0217\u0005A\u0000\u0000\u0213\u0217\u0005B\u0000\u0000\u0214"+
		"\u0217\u0005C\u0000\u0000\u0215\u0217\u0005D\u0000\u0000\u0216\u0210\u0001"+
		"\u0000\u0000\u0000\u0216\u0211\u0001\u0000\u0000\u0000\u0216\u0212\u0001"+
		"\u0000\u0000\u0000\u0216\u0213\u0001\u0000\u0000\u0000\u0216\u0214\u0001"+
		"\u0000\u0000\u0000\u0216\u0215\u0001\u0000\u0000\u0000\u02171\u0001\u0000"+
		"\u0000\u0000\u0218\u021b\u0005\u0002\u0000\u0000\u0219\u021b\u0005\u0017"+
		"\u0000\u0000\u021a\u0218\u0001\u0000\u0000\u0000\u021a\u0219\u0001\u0000"+
		"\u0000\u0000\u021b3\u0001\u0000\u0000\u00007;>DQT[ahqt~\u0088\u0091\u009c"+
		"\u00a1\u00ab\u00ba\u00bc\u00c7\u00c9\u00cd\u00e3\u00fc\u0101\u0109\u011d"+
		"\u0122\u0128\u0137\u013b\u0146\u014e\u0152\u0154\u0166\u016b\u0174\u0179"+
		"\u017f\u018d\u0199\u01a2\u01b5\u01bc\u01c8\u01cf\u01d5\u01da\u01e1\u01e7"+
		"\u01f7\u0207\u0209\u0216\u021a";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}