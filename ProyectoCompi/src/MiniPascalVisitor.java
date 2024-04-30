// Generated from D:/Code/ProyectoCompiladores1/ProyectoCompi/src/MiniPascal.g4 by ANTLR 4.13.1
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
	 * Visit a parse tree produced by {@link MiniPascalParser#function_var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_var_decl(MiniPascalParser.Function_var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr(MiniPascalParser.InstrContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#read_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRead_call(MiniPascalParser.Read_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#write_call}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWrite_call(MiniPascalParser.Write_callContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(MiniPascalParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#if_condition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_condition(MiniPascalParser.If_conditionContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#while_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhile_loop(MiniPascalParser.While_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#repeat_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRepeat_loop(MiniPascalParser.Repeat_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#if_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIf_statement(MiniPascalParser.If_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#else_if}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_if(MiniPascalParser.Else_ifContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#else_statement}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitElse_statement(MiniPascalParser.Else_statementContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#var_block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_block(MiniPascalParser.Var_blockContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#var_decl}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_decl(MiniPascalParser.Var_declContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#var_init}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_init(MiniPascalParser.Var_initContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#var_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVar_type(MiniPascalParser.Var_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#array_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_type(MiniPascalParser.Array_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#array_ID}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitArray_ID(MiniPascalParser.Array_IDContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#const_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_type(MiniPascalParser.Const_typeContext ctx);
	/**
	 * Visit a parse tree produced by
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpr(MiniPascalParser.ExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#size}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSize(MiniPascalParser.SizeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#comparison}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitComparison(MiniPascalParser.ComparisonContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#logical_opr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_opr(MiniPascalParser.Logical_oprContext ctx);
}