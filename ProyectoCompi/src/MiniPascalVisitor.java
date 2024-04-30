// Generated from C:/Users/eduar/OneDrive/Documents/GitHub/ProyectoCompi1/ProyectoCompi/src/MiniPascal.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link MiniPascalParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface MiniPascalVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(MiniPascalParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#program_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram_block(MiniPascalParser.Program_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#function_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_block(MiniPascalParser.Function_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#function_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_call(MiniPascalParser.Function_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_var_declare}
	 * labeled alternative in {@link MiniPascalParser#function_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_var_declare(MiniPascalParser.Function_var_declareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_var_declArray}
	 * labeled alternative in {@link MiniPascalParser#function_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_var_declArray(MiniPascalParser.Function_var_declArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code function_var_declConst}
	 * labeled alternative in {@link MiniPascalParser#function_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_var_declConst(MiniPascalParser.Function_var_declConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrVarInit}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrVarInit(MiniPascalParser.InstrVarInitContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrFunCall}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrFunCall(MiniPascalParser.InstrFunCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrReadCall}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrReadCall(MiniPascalParser.InstrReadCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrWriteCall}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrWriteCall(MiniPascalParser.InstrWriteCallContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrForLoop}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrForLoop(MiniPascalParser.InstrForLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrWhileLoop}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrWhileLoop(MiniPascalParser.InstrWhileLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code instrRepeatLoop}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstrRepeatLoop(MiniPascalParser.InstrRepeatLoopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code intrIfStmt}
	 * labeled alternative in {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIntrIfStmt(MiniPascalParser.IntrIfStmtContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#read_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_call(MiniPascalParser.Read_callContext ctx);
	/**
	 * Visit a parse tree produced by the {@code write_callNewLine}
	 * labeled alternative in {@link MiniPascalParser#write_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_callNewLine(MiniPascalParser.Write_callNewLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code write_callNoNewLine}
	 * labeled alternative in {@link MiniPascalParser#write_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_callNoNewLine(MiniPascalParser.Write_callNoNewLineContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_loopToDo}
	 * labeled alternative in {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loopToDo(MiniPascalParser.For_loopToDoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_loopToDoBE}
	 * labeled alternative in {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loopToDoBE(MiniPascalParser.For_loopToDoBEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_loopDownTo}
	 * labeled alternative in {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loopDownTo(MiniPascalParser.For_loopDownToContext ctx);
	/**
	 * Visit a parse tree produced by the {@code for_loopDownToBE}
	 * labeled alternative in {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loopDownToBE(MiniPascalParser.For_loopDownToBEContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(MiniPascalParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_loopSingle}
	 * labeled alternative in {@link MiniPascalParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loopSingle(MiniPascalParser.While_loopSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code while_loopBE}
	 * labeled alternative in {@link MiniPascalParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loopBE(MiniPascalParser.While_loopBEContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#repeat_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_loop(MiniPascalParser.Repeat_loopContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_statementSingle}
	 * labeled alternative in {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statementSingle(MiniPascalParser.If_statementSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code if_statementBE}
	 * labeled alternative in {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statementBE(MiniPascalParser.If_statementBEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code else_ifSingle}
	 * labeled alternative in {@link MiniPascalParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_ifSingle(MiniPascalParser.Else_ifSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code else_ifBE}
	 * labeled alternative in {@link MiniPascalParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_ifBE(MiniPascalParser.Else_ifBEContext ctx);
	/**
	 * Visit a parse tree produced by the {@code else_statementSingle}
	 * labeled alternative in {@link MiniPascalParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statementSingle(MiniPascalParser.Else_statementSingleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code else_statementBE}
	 * labeled alternative in {@link MiniPascalParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statementBE(MiniPascalParser.Else_statementBEContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#var_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_block(MiniPascalParser.Var_blockContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_declare}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declare(MiniPascalParser.Var_declareContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_declMultiple}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declMultiple(MiniPascalParser.Var_declMultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_declArray}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declArray(MiniPascalParser.Var_declArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_declConst}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declConst(MiniPascalParser.Var_declConstContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_declConstMultiple}
	 * labeled alternative in {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_declConstMultiple(MiniPascalParser.Var_declConstMultipleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_initialize}
	 * labeled alternative in {@link MiniPascalParser#var_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_initialize(MiniPascalParser.Var_initializeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_initArray}
	 * labeled alternative in {@link MiniPascalParser#var_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_initArray(MiniPascalParser.Var_initArrayContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_typeInt}
	 * labeled alternative in {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_typeInt(MiniPascalParser.Var_typeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_typeChar}
	 * labeled alternative in {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_typeChar(MiniPascalParser.Var_typeCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_typeBool}
	 * labeled alternative in {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_typeBool(MiniPascalParser.Var_typeBoolContext ctx);
	/**
	 * Visit a parse tree produced by the {@code var_typeStr}
	 * labeled alternative in {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_typeStr(MiniPascalParser.Var_typeStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_typeInt}
	 * labeled alternative in {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_typeInt(MiniPascalParser.Array_typeIntContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_typeChar}
	 * labeled alternative in {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_typeChar(MiniPascalParser.Array_typeCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code array_typeBool}
	 * labeled alternative in {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_typeBool(MiniPascalParser.Array_typeBoolContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#array_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_ID(MiniPascalParser.Array_IDContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_typeChar}
	 * labeled alternative in {@link MiniPascalParser#const_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_typeChar(MiniPascalParser.Const_typeCharContext ctx);
	/**
	 * Visit a parse tree produced by the {@code const_typeStr}
	 * labeled alternative in {@link MiniPascalParser#const_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_typeStr(MiniPascalParser.Const_typeStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprArrayId}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprArrayId(MiniPascalParser.ExprArrayIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprParen}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprParen(MiniPascalParser.ExprParenContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprTermMath}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprTermMath(MiniPascalParser.ExprTermMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNot}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNot(MiniPascalParser.ExprNotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprStr}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprStr(MiniPascalParser.ExprStrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprFactorMath}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprFactorMath(MiniPascalParser.ExprFactorMathContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprComparison}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprComparison(MiniPascalParser.ExprComparisonContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprId}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprId(MiniPascalParser.ExprIdContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprLogical}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprLogical(MiniPascalParser.ExprLogicalContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNum}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNum(MiniPascalParser.ExprNumContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprNegative}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprNegative(MiniPascalParser.ExprNegativeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code exprDecimal}
	 * labeled alternative in {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExprDecimal(MiniPascalParser.ExprDecimalContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(MiniPascalParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonMayor}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonMayor(MiniPascalParser.ComparisonMayorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonMenor}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonMenor(MiniPascalParser.ComparisonMenorContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonMayorIgual}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonMayorIgual(MiniPascalParser.ComparisonMayorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonMenorIgual}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonMenorIgual(MiniPascalParser.ComparisonMenorIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonIgual}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonIgual(MiniPascalParser.ComparisonIgualContext ctx);
	/**
	 * Visit a parse tree produced by the {@code comparisonDistinto}
	 * labeled alternative in {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparisonDistinto(MiniPascalParser.ComparisonDistintoContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logical_oprAnd}
	 * labeled alternative in {@link MiniPascalParser#logical_opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_oprAnd(MiniPascalParser.Logical_oprAndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code logical_oprOr}
	 * labeled alternative in {@link MiniPascalParser#logical_opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_oprOr(MiniPascalParser.Logical_oprOrContext ctx);
}