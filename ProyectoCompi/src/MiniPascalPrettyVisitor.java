public class MiniPascalPrettyVisitor extends MiniPascalBaseVisitor<String>{
    @Override
    public String visitProgram(MiniPascalParser.ProgramContext ctx) {
        System.out.println("visitProgram");
        return visitChildren(ctx);
    }

    @Override
    public String visitProgram_block(MiniPascalParser.Program_blockContext ctx) {
        System.out.println("visitProgram_block");
        return visitChildren(ctx);
    }

    @Override
    public String visitFunction_block(MiniPascalParser.Function_blockContext ctx) {
        System.out.println("visitFunction_block");
        return visitChildren(ctx);
    }

    @Override
    public String visitFunction_call(MiniPascalParser.Function_callContext ctx) {
        System.out.println("visitFunction_call");
        return visitChildren(ctx);
    }

    @Override
    public String visitFunction_var_decl(MiniPascalParser.Function_var_declContext ctx) {
        System.out.println("visitFunction_var_decl");
        return visitChildren(ctx);
    }

    @Override
    public String visitInstr(MiniPascalParser.InstrContext ctx) {
        System.out.println("visitInstr");
        return visitChildren(ctx);
    }

    @Override
    public String visitRead_call(MiniPascalParser.Read_callContext ctx) {
        System.out.println("visitRead_call");
        return visitChildren(ctx);
    }

    @Override
    public String visitWrite_call(MiniPascalParser.Write_callContext ctx) {
        System.out.println("visitWrite_call");
        return visitChildren(ctx);
    }

    @Override
    public String visitFor_loop(MiniPascalParser.For_loopContext ctx) {
        System.out.println("visitFor_loop");
        return visitChildren(ctx);
    }

    @Override
    public String visitIf_condition(MiniPascalParser.If_conditionContext ctx) {
        System.out.println("visitIf_condition");
        return visitChildren(ctx);
    }

    @Override
    public String visitWhile_loop(MiniPascalParser.While_loopContext ctx) {
        System.out.println("visitWhile_loop");
        return visitChildren(ctx);
    }

    @Override
    public String visitRepeat_loop(MiniPascalParser.Repeat_loopContext ctx) {
        System.out.println("visitRepeat_loop");
        return visitChildren(ctx);
    }

    @Override
    public String visitIf_statement(MiniPascalParser.If_statementContext ctx) {
        System.out.println("visitIf_statement");
        return visitChildren(ctx);
    }

    @Override
    public String visitElse_if(MiniPascalParser.Else_ifContext ctx) {
        System.out.println("visitElse_if");
        return visitChildren(ctx);
    }

    @Override
    public String visitElse_statement(MiniPascalParser.Else_statementContext ctx) {
        System.out.println("visitElse_statement");
        return visitChildren(ctx);
    }

    @Override
    public String visitVar_block(MiniPascalParser.Var_blockContext ctx) {
        System.out.println("visitVar_block");
        return visitChildren(ctx);
    }

    @Override
    public String visitVar_decl(MiniPascalParser.Var_declContext ctx) {
        System.out.println("visitVar_decl");
        return visitChildren(ctx);
    }

    @Override
    public String visitVar_init(MiniPascalParser.Var_initContext ctx) {
        System.out.println("visitVar_init");
        return visitChildren(ctx);
    }

    @Override
    public String visitVar_type(MiniPascalParser.Var_typeContext ctx) {
        System.out.println("visitVar_type");
        return visitChildren(ctx);
    }

    @Override
    public String visitArray_type(MiniPascalParser.Array_typeContext ctx) {
        System.out.println("visitArray_type");
        return visitChildren(ctx);
    }

    @Override
    public String visitConst_type(MiniPascalParser.Const_typeContext ctx) {
        System.out.println("visitConst_type");
        return visitChildren(ctx);
    }

    @Override
    public String visitExpr(MiniPascalParser.ExprContext ctx) {
        System.out.println("visitExpr");
        return visitChildren(ctx);
    }

    @Override
    public String visitSize(MiniPascalParser.SizeContext ctx) {
        System.out.println("visitSize");
        return visitChildren(ctx);
    }

    @Override
    public String visitComparison(MiniPascalParser.ComparisonContext ctx) {
        System.out.println("visitComparison");
        return visitChildren(ctx);
    }

    @Override
    public String visitLogical_opr(MiniPascalParser.Logical_oprContext ctx) {
        System.out.println("visitLogical_opr");
        return visitChildren(ctx);
    }

}
