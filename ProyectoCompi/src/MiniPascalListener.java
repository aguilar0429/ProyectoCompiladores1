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
	 * Enter a parse tree produced by {@link MiniPascalParser#function_var_decl}.
	 * @param ctx the parse tree
	 */
	void enterFunction_var_decl(MiniPascalParser.Function_var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#function_var_decl}.
	 * @param ctx the parse tree
	 */
	void exitFunction_var_decl(MiniPascalParser.Function_var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void enterInstr(MiniPascalParser.InstrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 */
	void exitInstr(MiniPascalParser.InstrContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#write_call}.
	 * @param ctx the parse tree
	 */
	void enterWrite_call(MiniPascalParser.Write_callContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#write_call}.
	 * @param ctx the parse tree
	 */
	void exitWrite_call(MiniPascalParser.Write_callContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void enterFor_loop(MiniPascalParser.For_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 */
	void exitFor_loop(MiniPascalParser.For_loopContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void enterWhile_loop(MiniPascalParser.While_loopContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#while_loop}.
	 * @param ctx the parse tree
	 */
	void exitWhile_loop(MiniPascalParser.While_loopContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void enterIf_statement(MiniPascalParser.If_statementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 */
	void exitIf_statement(MiniPascalParser.If_statementContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void enterVar_decl(MiniPascalParser.Var_declContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 */
	void exitVar_decl(MiniPascalParser.Var_declContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#var_init}.
	 * @param ctx the parse tree
	 */
	void enterVar_init(MiniPascalParser.Var_initContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#var_init}.
	 * @param ctx the parse tree
	 */
	void exitVar_init(MiniPascalParser.Var_initContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 */
	void enterVar_type(MiniPascalParser.Var_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 */
	void exitVar_type(MiniPascalParser.Var_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 */
	void enterArray_type(MiniPascalParser.Array_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 */
	void exitArray_type(MiniPascalParser.Array_typeContext ctx);
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
	 * Enter a parse tree produced by {@link MiniPascalParser#const_type}.
	 * @param ctx the parse tree
	 */
	void enterConst_type(MiniPascalParser.Const_typeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#const_type}.
	 * @param ctx the parse tree
	 */
	void exitConst_type(MiniPascalParser.Const_typeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(MiniPascalParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(MiniPascalParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void enterMath_expr(MiniPascalParser.Math_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#math_expr}.
	 * @param ctx the parse tree
	 */
	void exitMath_expr(MiniPascalParser.Math_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void enterBool_expr(MiniPascalParser.Bool_exprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#bool_expr}.
	 * @param ctx the parse tree
	 */
	void exitBool_expr(MiniPascalParser.Bool_exprContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void enterComparison(MiniPascalParser.ComparisonContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 */
	void exitComparison(MiniPascalParser.ComparisonContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#logical_opr}.
	 * @param ctx the parse tree
	 */
	void enterLogical_opr(MiniPascalParser.Logical_oprContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#logical_opr}.
	 * @param ctx the parse tree
	 */
	void exitLogical_opr(MiniPascalParser.Logical_oprContext ctx);
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
}