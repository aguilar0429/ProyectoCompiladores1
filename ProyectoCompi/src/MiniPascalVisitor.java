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
	 * Visit a parse tree produced by {@link MiniPascalParser#for_loop}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_loop(MiniPascalParser.For_loopContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#instr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInstr(MiniPascalParser.InstrContext ctx);
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
	 * Visit a parse tree produced by {@link MiniPascalParser#const_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConst_type(MiniPascalParser.Const_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link MiniPascalParser#expr}.
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
}