// Generated from C:/Users/eduar/OneDrive/Documents/GitHub/ProyectoCompi1/ProyectoCompi/src/MiniPascal.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link MiniPascalParser}.
 */
public interface MiniPascalListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#program_block}.
	 * @param ctx the parse tree
	 */
	void enterProgram_block(MiniPascalParser.Program_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#program_block}.
	 * @param ctx the parse tree
	 */
	void exitProgram_block(MiniPascalParser.Program_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#function_block}.
	 * @param ctx the parse tree
	 */
	void enterFunction_block(MiniPascalParser.Function_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#function_block}.
	 * @param ctx the parse tree
	 */
	void exitFunction_block(MiniPascalParser.Function_blockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#function_call}.
	 * @param ctx the parse tree
	 */
	void enterFunction_call(MiniPascalParser.Function_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#function_call}.
	 * @param ctx the parse tree
	 */
	void exitFunction_call(MiniPascalParser.Function_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_var_declare}
	 * labeled alternative in {@link MiniPascalParser#function_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_var_declare(MiniPascalParser.Function_var_declareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_var_declare}
	 * labeled alternative in {@link MiniPascalParser#function_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_var_declare(MiniPascalParser.Function_var_declareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_var_declArray}
	 * labeled alternative in {@link MiniPascalParser#function_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_var_declArray(MiniPascalParser.Function_var_declArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_var_declArray}
	 * labeled alternative in {@link MiniPascalParser#function_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_var_declArray(MiniPascalParser.Function_var_declArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code function_var_declConst}
	 * labeled alternative in {@link MiniPascalParser#function_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_var_declConst(MiniPascalParser.Function_var_declConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code function_var_declConst}
	 * labeled alternative in {@link MiniPascalParser#function_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_var_declConst(MiniPascalParser.Function_var_declConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrVarInit}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstrVarInit(MiniPascalParser.InstrVarInitContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrVarInit}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstrVarInit(MiniPascalParser.InstrVarInitContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrFunCall}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstrFunCall(MiniPascalParser.InstrFunCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrFunCall}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstrFunCall(MiniPascalParser.InstrFunCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrReadCall}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstrReadCall(MiniPascalParser.InstrReadCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrReadCall}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstrReadCall(MiniPascalParser.InstrReadCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrWriteCall}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstrWriteCall(MiniPascalParser.InstrWriteCallContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrWriteCall}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstrWriteCall(MiniPascalParser.InstrWriteCallContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrForLoop}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstrForLoop(MiniPascalParser.InstrForLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrForLoop}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstrForLoop(MiniPascalParser.InstrForLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrWhileLoop}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstrWhileLoop(MiniPascalParser.InstrWhileLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrWhileLoop}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstrWhileLoop(MiniPascalParser.InstrWhileLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code instrRepeatLoop}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstrRepeatLoop(MiniPascalParser.InstrRepeatLoopContext ctx);
	/**
	 * Exit a parse tree produced by the {@code instrRepeatLoop}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstrRepeatLoop(MiniPascalParser.InstrRepeatLoopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code intrIfStmt}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterIntrIfStmt(MiniPascalParser.IntrIfStmtContext ctx);
	/**
	 * Exit a parse tree produced by the {@code intrIfStmt}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitIntrIfStmt(MiniPascalParser.IntrIfStmtContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#read_call}.
	 * @param ctx the parse tree
	 */
	void enterRead_call(MiniPascalParser.Read_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#read_call}.
	 * @param ctx the parse tree
	 */
	void exitRead_call(MiniPascalParser.Read_callContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write_callNewLine}
	 * labeled alternative in {@link MiniPascalParser#write_call}.
	 * @param ctx the parse tree
	 */
	void enterWrite_callNewLine(MiniPascalParser.Write_callNewLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write_callNewLine}
	 * labeled alternative in {@link MiniPascalParser#write_call}.
	 * @param ctx the parse tree
	 */
	void exitWrite_callNewLine(MiniPascalParser.Write_callNewLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code write_callNoNewLine}
	 * labeled alternative in {@link MiniPascalParser#write_call}.
	 * @param ctx the parse tree
	 */
	void enterWrite_callNoNewLine(MiniPascalParser.Write_callNoNewLineContext ctx);
	/**
	 * Exit a parse tree produced by the {@code write_callNoNewLine}
	 * labeled alternative in {@link MiniPascalParser#write_call}.
	 * @param ctx the parse tree
	 */
	void exitWrite_callNoNewLine(MiniPascalParser.Write_callNoNewLineContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_loopToDo}
	 * labeled alternative in {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loopToDo(MiniPascalParser.For_loopToDoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_loopToDo}
	 * labeled alternative in {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loopToDo(MiniPascalParser.For_loopToDoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_loopToDoBE}
	 * labeled alternative in {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loopToDoBE(MiniPascalParser.For_loopToDoBEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_loopToDoBE}
	 * labeled alternative in {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loopToDoBE(MiniPascalParser.For_loopToDoBEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_loopDownTo}
	 * labeled alternative in {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loopDownTo(MiniPascalParser.For_loopDownToContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_loopDownTo}
	 * labeled alternative in {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loopDownTo(MiniPascalParser.For_loopDownToContext ctx);
	/**
	 * Enter a parse tree produced by the {@code for_loopDownToBE}
	 * labeled alternative in {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loopDownToBE(MiniPascalParser.For_loopDownToBEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code for_loopDownToBE}
	 * labeled alternative in {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loopDownToBE(MiniPascalParser.For_loopDownToBEContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void enterIf_condition(MiniPascalParser.If_conditionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#if_condition}.
	 * @param ctx the parse tree
	 */
	void exitIf_condition(MiniPascalParser.If_conditionContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_loopSingle}
	 * labeled alternative in {@link MiniPascalParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loopSingle(MiniPascalParser.While_loopSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_loopSingle}
	 * labeled alternative in {@link MiniPascalParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loopSingle(MiniPascalParser.While_loopSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code while_loopBE}
	 * labeled alternative in {@link MiniPascalParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loopBE(MiniPascalParser.While_loopBEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code while_loopBE}
	 * labeled alternative in {@link MiniPascalParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loopBE(MiniPascalParser.While_loopBEContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#repeat_loop}.
	 * @param ctx the parse tree
	 */
	void enterRepeat_loop(MiniPascalParser.Repeat_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#repeat_loop}.
	 * @param ctx the parse tree
	 */
	void exitRepeat_loop(MiniPascalParser.Repeat_loopContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_statementSingle}
	 * labeled alternative in {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statementSingle(MiniPascalParser.If_statementSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_statementSingle}
	 * labeled alternative in {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statementSingle(MiniPascalParser.If_statementSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code if_statementBE}
	 * labeled alternative in {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statementBE(MiniPascalParser.If_statementBEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code if_statementBE}
	 * labeled alternative in {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statementBE(MiniPascalParser.If_statementBEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code else_ifSingle}
	 * labeled alternative in {@link MiniPascalParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_ifSingle(MiniPascalParser.Else_ifSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code else_ifSingle}
	 * labeled alternative in {@link MiniPascalParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_ifSingle(MiniPascalParser.Else_ifSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code else_ifBE}
	 * labeled alternative in {@link MiniPascalParser#else_if}.
	 * @param ctx the parse tree
	 */
	void enterElse_ifBE(MiniPascalParser.Else_ifBEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code else_ifBE}
	 * labeled alternative in {@link MiniPascalParser#else_if}.
	 * @param ctx the parse tree
	 */
	void exitElse_ifBE(MiniPascalParser.Else_ifBEContext ctx);
	/**
	 * Enter a parse tree produced by the {@code else_statementSingle}
	 * labeled alternative in {@link MiniPascalParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statementSingle(MiniPascalParser.Else_statementSingleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code else_statementSingle}
	 * labeled alternative in {@link MiniPascalParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statementSingle(MiniPascalParser.Else_statementSingleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code else_statementBE}
	 * labeled alternative in {@link MiniPascalParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void enterElse_statementBE(MiniPascalParser.Else_statementBEContext ctx);
	/**
	 * Exit a parse tree produced by the {@code else_statementBE}
	 * labeled alternative in {@link MiniPascalParser#else_statement}.
	 * @param ctx the parse tree
	 */
	void exitElse_statementBE(MiniPascalParser.Else_statementBEContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#var_block}.
	 * @param ctx the parse tree
	 */
	void enterVar_block(MiniPascalParser.Var_blockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#var_block}.
	 * @param ctx the parse tree
	 */
	void exitVar_block(MiniPascalParser.Var_blockContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_declare}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_declare(MiniPascalParser.Var_declareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_declare}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_declare(MiniPascalParser.Var_declareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_declMultiple}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_declMultiple(MiniPascalParser.Var_declMultipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_declMultiple}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_declMultiple(MiniPascalParser.Var_declMultipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_declArray}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_declArray(MiniPascalParser.Var_declArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_declArray}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_declArray(MiniPascalParser.Var_declArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_declConst}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_declConst(MiniPascalParser.Var_declConstContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_declConst}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_declConst(MiniPascalParser.Var_declConstContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_declConstMultiple}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_declConstMultiple(MiniPascalParser.Var_declConstMultipleContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_declConstMultiple}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_declConstMultiple(MiniPascalParser.Var_declConstMultipleContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_initialize}
	 * labeled alternative in {@link MiniPascalParser#var_init}.
	 * @param ctx the parse tree
	 */
	void enterVar_initialize(MiniPascalParser.Var_initializeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_initialize}
	 * labeled alternative in {@link MiniPascalParser#var_init}.
	 * @param ctx the parse tree
	 */
	void exitVar_initialize(MiniPascalParser.Var_initializeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_initArray}
	 * labeled alternative in {@link MiniPascalParser#var_init}.
	 * @param ctx the parse tree
	 */
	void enterVar_initArray(MiniPascalParser.Var_initArrayContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_initArray}
	 * labeled alternative in {@link MiniPascalParser#var_init}.
	 * @param ctx the parse tree
	 */
	void exitVar_initArray(MiniPascalParser.Var_initArrayContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_typeInt}
	 * labeled alternative in {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_typeInt(MiniPascalParser.Var_typeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_typeInt}
	 * labeled alternative in {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_typeInt(MiniPascalParser.Var_typeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_typeChar}
	 * labeled alternative in {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_typeChar(MiniPascalParser.Var_typeCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_typeChar}
	 * labeled alternative in {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_typeChar(MiniPascalParser.Var_typeCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_typeBool}
	 * labeled alternative in {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_typeBool(MiniPascalParser.Var_typeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_typeBool}
	 * labeled alternative in {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_typeBool(MiniPascalParser.Var_typeBoolContext ctx);
	/**
	 * Enter a parse tree produced by the {@code var_typeStr}
	 * labeled alternative in {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_typeStr(MiniPascalParser.Var_typeStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code var_typeStr}
	 * labeled alternative in {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_typeStr(MiniPascalParser.Var_typeStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_typeInt}
	 * labeled alternative in {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_typeInt(MiniPascalParser.Array_typeIntContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_typeInt}
	 * labeled alternative in {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_typeInt(MiniPascalParser.Array_typeIntContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_typeChar}
	 * labeled alternative in {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_typeChar(MiniPascalParser.Array_typeCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_typeChar}
	 * labeled alternative in {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_typeChar(MiniPascalParser.Array_typeCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code array_typeBool}
	 * labeled alternative in {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_typeBool(MiniPascalParser.Array_typeBoolContext ctx);
	/**
	 * Exit a parse tree produced by the {@code array_typeBool}
	 * labeled alternative in {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_typeBool(MiniPascalParser.Array_typeBoolContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#array_ID}.
	 * @param ctx the parse tree
	 */
	void enterArray_ID(MiniPascalParser.Array_IDContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#array_ID}.
	 * @param ctx the parse tree
	 */
	void exitArray_ID(MiniPascalParser.Array_IDContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_typeChar}
	 * labeled alternative in {@link MiniPascalParser#const_type}.
	 * @param ctx the parse tree
	 */
	void enterConst_typeChar(MiniPascalParser.Const_typeCharContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_typeChar}
	 * labeled alternative in {@link MiniPascalParser#const_type}.
	 * @param ctx the parse tree
	 */
	void exitConst_typeChar(MiniPascalParser.Const_typeCharContext ctx);
	/**
	 * Enter a parse tree produced by the {@code const_typeStr}
	 * labeled alternative in {@link MiniPascalParser#const_type}.
	 * @param ctx the parse tree
	 */
	void enterConst_typeStr(MiniPascalParser.Const_typeStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code const_typeStr}
	 * labeled alternative in {@link MiniPascalParser#const_type}.
	 * @param ctx the parse tree
	 */
	void exitConst_typeStr(MiniPascalParser.Const_typeStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprArrayId}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprArrayId(MiniPascalParser.ExprArrayIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprArrayId}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprArrayId(MiniPascalParser.ExprArrayIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprParen}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprParen(MiniPascalParser.ExprParenContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprParen}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprParen(MiniPascalParser.ExprParenContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprTermMath}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprTermMath(MiniPascalParser.ExprTermMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprTermMath}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprTermMath(MiniPascalParser.ExprTermMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNot(MiniPascalParser.ExprNotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNot(MiniPascalParser.ExprNotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprStr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprStr(MiniPascalParser.ExprStrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprStr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprStr(MiniPascalParser.ExprStrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprFactorMath}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprFactorMath(MiniPascalParser.ExprFactorMathContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprFactorMath}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprFactorMath(MiniPascalParser.ExprFactorMathContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprComparison}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprComparison(MiniPascalParser.ExprComparisonContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprComparison}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprComparison(MiniPascalParser.ExprComparisonContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprId(MiniPascalParser.ExprIdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprId(MiniPascalParser.ExprIdContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprLogical(MiniPascalParser.ExprLogicalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprLogical(MiniPascalParser.ExprLogicalContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNum(MiniPascalParser.ExprNumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNum(MiniPascalParser.ExprNumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprNegative}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprNegative(MiniPascalParser.ExprNegativeContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprNegative}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprNegative(MiniPascalParser.ExprNegativeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code exprDecimal}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExprDecimal(MiniPascalParser.ExprDecimalContext ctx);
	/**
	 * Exit a parse tree produced by the {@code exprDecimal}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExprDecimal(MiniPascalParser.ExprDecimalContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#size}.
	 * @param ctx the parse tree
	 */
	void enterSize(MiniPascalParser.SizeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#size}.
	 * @param ctx the parse tree
	 */
	void exitSize(MiniPascalParser.SizeContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonMayor}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparisonMayor(MiniPascalParser.ComparisonMayorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonMayor}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparisonMayor(MiniPascalParser.ComparisonMayorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonMenor}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparisonMenor(MiniPascalParser.ComparisonMenorContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonMenor}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparisonMenor(MiniPascalParser.ComparisonMenorContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonMayorIgual}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparisonMayorIgual(MiniPascalParser.ComparisonMayorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonMayorIgual}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparisonMayorIgual(MiniPascalParser.ComparisonMayorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonMenorIgual}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparisonMenorIgual(MiniPascalParser.ComparisonMenorIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonMenorIgual}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparisonMenorIgual(MiniPascalParser.ComparisonMenorIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonIgual}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparisonIgual(MiniPascalParser.ComparisonIgualContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonIgual}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparisonIgual(MiniPascalParser.ComparisonIgualContext ctx);
	/**
	 * Enter a parse tree produced by the {@code comparisonDistinto}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparisonDistinto(MiniPascalParser.ComparisonDistintoContext ctx);
	/**
	 * Exit a parse tree produced by the {@code comparisonDistinto}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparisonDistinto(MiniPascalParser.ComparisonDistintoContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logical_oprAnd}
	 * labeled alternative in {@link MiniPascalParser#logical_opr}.
	 * @param ctx the parse tree
	 */
	void enterLogical_oprAnd(MiniPascalParser.Logical_oprAndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logical_oprAnd}
	 * labeled alternative in {@link MiniPascalParser#logical_opr}.
	 * @param ctx the parse tree
	 */
	void exitLogical_oprAnd(MiniPascalParser.Logical_oprAndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code logical_oprOr}
	 * labeled alternative in {@link MiniPascalParser#logical_opr}.
	 * @param ctx the parse tree
	 */
	void enterLogical_oprOr(MiniPascalParser.Logical_oprOrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code logical_oprOr}
	 * labeled alternative in {@link MiniPascalParser#logical_opr}.
	 * @param ctx the parse tree
	 */
	void exitLogical_oprOr(MiniPascalParser.Logical_oprOrContext ctx);
}