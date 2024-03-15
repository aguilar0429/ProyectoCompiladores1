public class MiniPascalNewVisitor extends MiniPascalBaseVisitor<String>
{
    @Override
    public String visitProgram(MiniPascalParser.ProgramContext ctx) {
        return "PROGRAM_BLOCK ...\n" + this.visitProgram_block(ctx.program_block());
    }

    @Override
    public String visitProgram_block(MiniPascalParser.Program_blockContext ctx)
    {
        String str = ctx.PROGRAM() + " " + ctx.ID() + ";\n"
                + this.visitVar_block(ctx.var_block())
                + this.visitFunction_block(ctx.function_block())
                + ctx.BEGIN();
        for (int i = 0; i < ctx.instr().size(); i++)
        {
            str += this.visitInstr(ctx.instr(i));
        }
        str += ctx.END();
        return str;
        //return ctx.getText() + "\t\n";
    }

    @Override
    public String visitFunction_block(MiniPascalParser.Function_blockContext ctx) {
        return "FUNCTION_BLOCK...\n" + ctx + "\t\n";
    }

    @Override
    public String visitFunction_call(MiniPascalParser.Function_callContext ctx) {
        return "FUNCTION_CALL...\n" + ctx + "\t\n";
    }

    @Override
    public String visitFunction_var_decl(MiniPascalParser.Function_var_declContext ctx) {
        return "FUNCTION_VAR_DECL...\n" + ctx + "\t\n";
    }

    @Override
    public String visitInstr(MiniPascalParser.InstrContext ctx) {
        return "INSTR...\n" + ctx + "\t\n";
    }

    @Override
    public String visitRead_call(MiniPascalParser.Read_callContext ctx) {
        return "READ_CALL...\n" + ctx + "\t\n";
    }

    @Override
    public String visitWrite_call(MiniPascalParser.Write_callContext ctx) {
        return "WRITE_CALL...\n" + ctx + "\t\n";
    }

    @Override
    public String visitFor_loop(MiniPascalParser.For_loopContext ctx) {
        return "FOR_LOOP...\n" + ctx + "\t\n";
    }

    @Override
    public String visitWhile_loop(MiniPascalParser.While_loopContext ctx) {
        return "WHILE_LOOP...\n" + ctx + "\t\n";
    }

    @Override
    public String visitRepeat_loop(MiniPascalParser.Repeat_loopContext ctx) {
        return "REPEAT_LOOP...\n" + ctx + "\t\n";
    }

    @Override
    public String visitIf_statement(MiniPascalParser.If_statementContext ctx) {
        return "IF_STATEMENT...\n" + ctx + "\t\n";
    }

    @Override
    public String visitIf_condition(MiniPascalParser.If_conditionContext ctx) {
        return "IF_CONDITION...\n" + ctx + "\t\n";
    }

    @Override
    public String visitVar_block(MiniPascalParser.Var_blockContext ctx) {
        return "VAR_BLOCK...\n" + ctx.getText() + "\t\n";
    }

    @Override
    public String visitVar_decl(MiniPascalParser.Var_declContext ctx) {
        return "VAR_DECL..." + ctx + "\t\n";
    }

    @Override
    public String visitVar_init(MiniPascalParser.Var_initContext ctx) {
        return "VAR_INIT..." + ctx.getText() + "\t\n";
    }

    @Override
    public String visitVar_type(MiniPascalParser.Var_typeContext ctx) {
        return "VAR_TYPE...\n" + ctx + "\t\n";
    }

    @Override
    public String visitArray_type(MiniPascalParser.Array_typeContext ctx) {
        return "ARRAY_TYPE...\n" + ctx + "\t\n";
    }

    @Override
    public String visitArray_ID(MiniPascalParser.Array_IDContext ctx) {
        return "ARRAY_ID...\n" + ctx + "\t\n";
    }

    @Override
    public String visitConst_type(MiniPascalParser.Const_typeContext ctx) {
        return "CONST_TYPE...\n" + ctx + "\t\n";
    }

    @Override
    public String visitExpr(MiniPascalParser.ExprContext ctx) {
        return "EXPR...\n" + ctx + "\t\n";
    }

    @Override
    public String visitMath_expr(MiniPascalParser.Math_exprContext ctx) {
        return "MATH_EXPR...\n" + ctx + "\t\n";
    }

    @Override
    public String visitBool_expr(MiniPascalParser.Bool_exprContext ctx) {
        return "BOOL_EXPR...\n" + ctx + "\t\n";
    }

    @Override
    public String visitComparison(MiniPascalParser.ComparisonContext ctx) {
        return "COMPARISON...\n" + ctx + "\t\n";
    }

    @Override
    public String visitLogical_opr(MiniPascalParser.Logical_oprContext ctx) {
        return "LOGICAL_OPR...\n" + ctx + "\t\n";
    }

    @Override
    public String visitSize(MiniPascalParser.SizeContext ctx) {
        return "SIZE..." + ctx + "\t";
    }
}
