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