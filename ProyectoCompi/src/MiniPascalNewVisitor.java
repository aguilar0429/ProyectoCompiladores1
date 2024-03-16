public class MiniPascalNewVisitor extends MiniPascalBaseVisitor<String>
{
    @Override
    public String visitProgram(MiniPascalParser.ProgramContext ctx) {
        return this.visitProgram_block(ctx.program_block());
    }

    @Override
    public String visitProgram_block(MiniPascalParser.Program_blockContext ctx) {
        String str = "PROGRAM_HEADER...\n" + ctx.PROGRAM().getText() + " " + ctx.ID().getText() + ctx.SEMICOLON().getText() + "\nPROGRAM_BLOCK...";
        if (ctx.var_block() != null)
        {
            str += this.visitVar_block(ctx.var_block());
        }
        if (ctx.function_block() != null)
        {
            str += this.visitFunction_block(ctx.function_block());
        }

        str += "\n" + ctx.BEGIN().getText() + "\n";

        for (int i = 0; i < ctx.instr().size(); i++)
        {
            str += ctx.instr(i).getText() + "\n";
        }

        str += ctx.END().getText() + ctx.PERIOD().getText();
        return str;
    }

    @Override
    public String visitFunction_block(MiniPascalParser.Function_blockContext ctx) {
        String str = "\nFUNCTION_BLOCK...\n";
        int nextFunc = 1;
        for (int i = 0; i < ctx.FUNCTION().size(); i++)
        {
            str += ctx.FUNCTION(i).getText() + " " + ctx.ID(i).getText() + ctx.LEFTPAREN(i).getText();

            if(ctx.function_var_decl(i) != null)
            {
                str += ctx.function_var_decl(i).getText();
                if (ctx.SEMICOLON().size() > 2)
                {
                    for (int j = 0; i < ctx.SEMICOLON().size(); i++)
                    {
                        str += ctx.SEMICOLON(j).getText() + ctx.function_var_decl(nextFunc).getText();
                        nextFunc += 1;
                    }
                }
            }

            str += ctx.RIGHTPAREN(i).getText() + ctx.COLON(i).getText() + ctx.var_type(i).getText() + ctx.SEMICOLON(i).getText();

            if (ctx.var_block() != null)
            {
                str += this.visitVar_block(ctx.var_block(i));
            }

            str += ctx.BEGIN(i).getText() + "\n";

            for (int j = 0; j < ctx.instr().size(); j++)
            {
                str += ctx.instr(j).getText();
            }

            str += "\n" + ctx.END(i).getText() + ctx.SEMICOLON(i).getText() + "\n";
        }
        return str;
    }

    @Override
    public String visitFunction_call(MiniPascalParser.Function_callContext ctx) {
        String str = ctx.ID().getText() + ctx.LEFTPAREN().getText();

        if (ctx.expr(0) != null)
        {
            str += ctx.expr(0).getText();
            if (ctx.expr().size() > 1)
            {
                for (int i = 0; i < ctx.COMMA().size(); i++)
                {
                    str += ctx.COMMA(i).getText() + ctx.expr(i+1).getText();
                }
            }
        }

        str += ctx.RIGHTPAREN().getText() + ctx.SEMICOLON().getText();
        return str;
    }

    @Override
    public String visitFunction_var_declare(MiniPascalParser.Function_var_declareContext ctx) {
        String str = ctx.ID(0).getText();

        if (ctx.ID().size() > 1)
        {
            for (int i = 1; i < ctx.ID().size(); i++)
            {
                str += ctx.COMMA(i).getText() + ctx.ID(i).getText();
            }
        }

        str += ctx.COLON().getText() + ctx.var_type().getText();
        return str;
    }

    @Override
    public String visitFunction_var_declArray(MiniPascalParser.Function_var_declArrayContext ctx) {
        String str = ctx.ID(0).getText();

        if (ctx.ID().size() > 1)
        {
            for (int i = 1; i < ctx.ID().size(); i++)
            {
                str += ctx.COMMA(i).getText() + ctx.ID(i).getText();
            }
        }

        str += ctx.COLON().getText() + ctx.ARRAY().getText() + ctx.LEFTBRACKET().getText()
            + this.visitSize(ctx.size(0));

        if (ctx.size().size() > 1)
        {
            str += ctx.COMMA(0).getText() + ctx.size(1).getText();
        }

        str += ctx.RIGHTBRACKET().getText() + ctx.OF().getText() + ctx.array_type().getText();

        return str;
    }

    @Override
    public String visitFunction_var_declConst(MiniPascalParser.Function_var_declConstContext ctx) {
        String str = ctx.ID(0).getText();

        if (ctx.ID().size() > 1)
        {
            for (int i = 1; i < ctx.ID().size(); i++)
            {
                str += ctx.COMMA(i).getText() + ctx.ID(i).getText();
            }
        }

        str += ctx.COLON().getText() + ctx.const_type().getText();
        return str;
    }

    @Override
    public String visitInstrVarInit(MiniPascalParser.InstrVarInitContext ctx) {
        return ctx.var_init().getText() + "\n";
    }

    @Override
    public String visitInstrFunCall(MiniPascalParser.InstrFunCallContext ctx) {
        return this.visitFunction_call(ctx.function_call()) + "\n";
    }

    @Override
    public String visitInstrReadCall(MiniPascalParser.InstrReadCallContext ctx) {
        return this.visitRead_call(ctx.read_call()) + "\n";
    }

    @Override
    public String visitInstrWriteCall(MiniPascalParser.InstrWriteCallContext ctx) {
        return ctx.write_call().getText() + "\n";
    }

    @Override
    public String visitInstrForLoop(MiniPascalParser.InstrForLoopContext ctx) {
        return ctx.for_loop().getText() + "\n";
    }

    @Override
    public String visitInstrWhileLoop(MiniPascalParser.InstrWhileLoopContext ctx) {
        return this.visitWhile_loop(ctx.while_loop()) + "\n";
    }

    @Override
    public String visitInstrRepeatLoop(MiniPascalParser.InstrRepeatLoopContext ctx) {
        return this.visitRepeat_loop(ctx.repeat_loop()) + "\n";
    }

    @Override
    public String visitIntrIfStmt(MiniPascalParser.IntrIfStmtContext ctx) {
        return this.visitIf_statement(ctx.if_statement()) + "\n";
    }

    @Override
    public String visitRead_call(MiniPascalParser.Read_callContext ctx) {
        return ctx.READ().getText() + ctx.LEFTPAREN().getText() + ctx.ID().getText()
                + ctx.RIGHTPAREN().getText() + ctx.SEMICOLON().getText() + "\n";
    }

    @Override
    public String visitWrite_callNewLine(MiniPascalParser.Write_callNewLineContext ctx) {
        String str = ctx.WRITELN().getText() + ctx.LEFTPAREN().getText() + ctx.CONST_VAL().getText();

        if(ctx.COMMA().getText() != null)
        {
            str += ctx.COMMA().getText();

            if (ctx.math_expr().getText() != null)
            {
                str += ctx.math_expr().getText();
            }
            else if (ctx.STR().getText() != null)
            {
                str += ctx.STR().getText();
            }
            else if (ctx.ID().getText() != null)
            {
                str += ctx.ID().getText();
            }
        }

        str += ctx.RIGHTPAREN().getText() + ctx.SEMICOLON().getText();

        return str + "\n";
    }

    @Override
    public String visitWrite_callNoNewLine(MiniPascalParser.Write_callNoNewLineContext ctx) {
        String str = ctx.WRITE().getText() + ctx.LEFTPAREN().getText() + ctx.CONST_VAL().getText();

        if(ctx.COMMA().getText() != null)
        {
           str += ctx.COMMA().getText();

           if (ctx.math_expr().getText() != null)
           {
               str += ctx.math_expr().getText();
           }
           else if (ctx.STR().getText() != null)
           {
               str += ctx.STR().getText();
           }
           else if (ctx.ID().getText() != null)
           {
               str += ctx.ID().getText();
           }
        }

        str += ctx.RIGHTPAREN().getText() + ctx.SEMICOLON().getText();

        return str + "\n";
    }

    @Override
    public String visitFor_loopToDo(MiniPascalParser.For_loopToDoContext ctx) {
        return ctx.FOR().getText() + ctx.ID().getText() + ctx.ASSIGN().getText()
                + ctx.expr(0).getText() + ctx.TO().getText() + ctx.expr(1).getText()
                + ctx.DO().getText() + ctx.instr().getText();
    }

    @Override
    public String visitFor_loopToDoBE(MiniPascalParser.For_loopToDoBEContext ctx) {
        String str = ctx.FOR().getText() + ctx.ID().getText() + ctx.ASSIGN().getText()
                + ctx.expr(0).getText() + ctx.TO().getText() + ctx.expr(1).getText()
                + ctx.DO().getText() + ctx.BEGIN().getText();

        for (int i = 0; i <  ctx.instr().size(); i++)
        {
            str += ctx.instr(i).getText();
        }

        str += ctx.END().getText() + ctx.SEMICOLON().getText() + "\n";
        return str;
    }

    @Override
    public String visitFor_loopDownTo(MiniPascalParser.For_loopDownToContext ctx) {
        return ctx.FOR().getText() + ctx.ID().getText() + ctx.ASSIGN().getText()
                + ctx.expr(0).getText() + ctx.DOWNTO().getText() + ctx.expr(1).getText()
                + ctx.DO().getText() + ctx.instr().getText();
    }

    @Override
    public String visitFor_loopDownToBE(MiniPascalParser.For_loopDownToBEContext ctx) {
        String str = ctx.FOR().getText() + ctx.ID().getText() + ctx.ASSIGN().getText()
                + ctx.expr(0).getText() + ctx.DOWNTO().getText() + ctx.expr(1).getText()
                + ctx.DO().getText() + ctx.BEGIN().getText();

        for (int i = 0; i <  ctx.instr().size(); i++)
        {
            str += ctx.instr(i).getText();
        }

        str += ctx.END().getText() + ctx.SEMICOLON().getText() + "\n";
        return str;
    }

    @Override
    public String visitWhile_loop(MiniPascalParser.While_loopContext ctx) {
        String str = ctx.WHILE().getText() + ctx.LEFTPAREN().getText()
                + ctx.expr(0).getText() + ctx.comparison().getText() + ctx.expr(1).getText()
                + ctx.RIGHTPAREN().getText() + ctx.DO().getText() + ctx.BEGIN().getText();

        for (int i = 0; i < ctx.instr().size(); i++)
        {
            str += ctx.instr(i).getText();
        }

        str += ctx.END().getText() + ctx.SEMICOLON().getText() + "\n";
        return str;
    }

    @Override
    public String visitRepeat_loop(MiniPascalParser.Repeat_loopContext ctx) {
        String str = ctx.REPEAT().getText();

        for (int i = 0; i < ctx.instr().size(); i++)
        {
            str += ctx.instr(i).getText();
        }

        str += ctx.UNTIL().getText() + ctx.bool_expr().getText() + ctx.SEMICOLON().getText() + "\n";
        return str;
    }

    @Override
    public String visitIf_statement(MiniPascalParser.If_statementContext ctx) {
        return ctx.getText() + "\n";
    }

    @Override
    public String visitIf_condition(MiniPascalParser.If_conditionContext ctx) {
        String str = ctx.expr(0).getText();

        if (ctx.expr().size() > 1)
        {
            for (int i = 0; i < ctx.expr().size(); i++)
            {
                str += ctx.logical_opr(i).getText() + ctx.expr(i+1).getText();
            }
        }

        return str + "\n";
    }

    @Override
    public String visitVar_block(MiniPascalParser.Var_blockContext ctx) {
        String str = "\nVAR_BLOCK...";

        if (ctx != null)
        {
            str += "\n" + ctx.VAR().getText() + " ";
            for (int i = 0; i < ctx.var_decl().size(); i++)
            {
                str += ctx.var_decl(i).getText() + "\n";
            }
        }
        else
        {
            str += "[is empty]\n";
        }

        return str;
    }

    @Override
    public String visitVar_declare(MiniPascalParser.Var_declareContext ctx) {
        return ctx.ID().getText() + ctx.COLON().getText() + ctx.var_type().getText() + ctx.ASSIGN().getText() + ctx.expr().getText() + ctx.SEMICOLON().getText() + "\n";
    }

    @Override
    public String visitVar_declMultiple(MiniPascalParser.Var_declMultipleContext ctx) {
        String str = ctx.ID(0).getText();

        if (ctx.ID().size() > 1)
        {
            for (int i = 1; i < ctx.ID().size(); i++)
            {
                str += ctx.COMMA(i).getText() + ctx.ID(i).getText();
            }
        }

        str += ctx.COLON().getText() + ctx.var_type().getText() + ctx.SEMICOLON().getText();
        return str;
    }

    @Override
    public String visitVar_declArray(MiniPascalParser.Var_declArrayContext ctx) {
        String str = ctx.ID(0).getText();

        if (ctx.ID().size() > 1)
        {
            for (int i = 1; i < ctx.ID().size(); i++)
            {
                str += ctx.COMMA(i).getText() + ctx.ID(i).getText();
            }
        }

        str += ctx.COLON().getText() + ctx.ARRAY().getText() + ctx.LEFTBRACKET().getText() + this.visitSize(ctx.size(0));

        if (ctx.size().size() > 1)
        {
            str += ctx.COMMA(0).getText() + this.visitSize(ctx.size(1));
        }

        str += ctx.RIGHTBRACKET().getText() + ctx.OF().getText() + ctx.array_type().getText() + ctx.SEMICOLON().getText();
        return str;
    }

    @Override
    public String visitVar_declConst(MiniPascalParser.Var_declConstContext ctx) {
        return ctx.ID().getText() + ctx.COLON().getText() + ctx.const_type().getText() + ctx.ASSIGN().getText() + ctx.CONST_VAL().getText() + ctx.SEMICOLON().getText();
    }

    @Override
    public String visitVar_declConstMultiple(MiniPascalParser.Var_declConstMultipleContext ctx) {
        String str = ctx.ID(0).getText();

        if (ctx.ID().size() > 1)
        {
            for (int i = 1; i < ctx.ID().size(); i++)
            {
                str += ctx.COMMA(i).getText() + ctx.ID(i).getText();
            }
        }

        str += ctx.COLON().getText() + ctx.const_type().getText() + ctx.SEMICOLON().getText();
        return str;
    }

    @Override
    public String visitVar_initialize(MiniPascalParser.Var_initializeContext ctx) {
        return ctx.ID().getText() + ctx.ASSIGN().getText() + ctx.expr().getText() + ctx.SEMICOLON().getText();
    }

    @Override
    public String visitVar_initArray(MiniPascalParser.Var_initArrayContext ctx) {
        String str = ctx.ID().getText() + ctx.LEFTBRACKET().getText() + ctx.math_expr(0).getText();

        if (ctx.math_expr().size() > 1)
        {
            str += ctx.COMMA().getText() + ctx.math_expr(1).getText();
        }

        str += ctx.RIGHTBRACKET() + ctx.ASSIGN().getText() + ctx.expr().getText() + ctx.SEMICOLON().getText();
        return str;
    }

    @Override
    public String visitVar_typeInt(MiniPascalParser.Var_typeIntContext ctx) {
        return ctx.INTEGER().getText();
    }

    @Override
    public String visitVar_typeChar(MiniPascalParser.Var_typeCharContext ctx) {
        return ctx.CHARACTER().getText();
    }

    @Override
    public String visitVar_typeBool(MiniPascalParser.Var_typeBoolContext ctx) {
        return ctx.BOOLEAN().getText();
    }

    @Override
    public String visitVar_typeStr(MiniPascalParser.Var_typeStrContext ctx) {
        return ctx.STRING().getText();
    }

    @Override
    public String visitArray_typeInt(MiniPascalParser.Array_typeIntContext ctx) {
        return ctx.INTEGER().getText();
    }

    @Override
    public String visitArray_typeChar(MiniPascalParser.Array_typeCharContext ctx) {
        return ctx.CHARACTER().getText();
    }

    @Override
    public String visitArray_typeBool(MiniPascalParser.Array_typeBoolContext ctx) {
        return ctx.BOOLEAN().getText();
    }

    @Override
    public String visitArray_ID(MiniPascalParser.Array_IDContext ctx) {
        String str = ctx.ID().getText() + ctx.LEFTBRACKET().getText() + ctx.math_expr(0).getText();

        if (ctx.math_expr().size() > 1)
        {
            str += ctx.COMMA().getText() + ctx.math_expr(1).getText();
        }

        str += ctx.RIGHTBRACKET();
        return str;
    }

    @Override
    public String visitConst_typeChar(MiniPascalParser.Const_typeCharContext ctx) {
        return ctx.CONSTCHAR().getText();
    }

    @Override
    public String visitConst_typeStr(MiniPascalParser.Const_typeStrContext ctx) {
        return ctx.CONSTSTR().getText();
    }

    @Override
    public String visitExprMath(MiniPascalParser.ExprMathContext ctx) {
        return ctx.math_expr().getText();
    }

    @Override
    public String visitExprBool(MiniPascalParser.ExprBoolContext ctx) {
        return ctx.bool_expr().getText();
    }

    @Override
    public String visitExprId(MiniPascalParser.ExprIdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitExprStr(MiniPascalParser.ExprStrContext ctx) {
        return ctx.STR().getText();
    }

    @Override
    public String visitMathSlash(MiniPascalParser.MathSlashContext ctx) {
        return ctx.math_expr(0).getText() + ctx.SLASH().getText() + ctx.math_expr(1).getText();
    }

    @Override
    public String visitMathSuma(MiniPascalParser.MathSumaContext ctx) {
        return ctx.math_expr(0).getText() + ctx.PLUS().getText() + ctx.math_expr(1).getText();
    }

    @Override
    public String visitMathRealNum(MiniPascalParser.MathRealNumContext ctx) {
        return ctx.REALNUM().getText();
    }

    @Override
    public String visitMathResta(MiniPascalParser.MathRestaContext ctx) {
        return ctx.math_expr(0).getText() + ctx.MINUS().getText() + ctx.math_expr(1).getText();
    }

    @Override
    public String visitMathParen(MiniPascalParser.MathParenContext ctx) {
        return ctx.LEFTPAREN().getText() + ctx.math_expr().getText() + ctx.RIGHTPAREN().getText();
    }

    @Override
    public String visitMathDiv(MiniPascalParser.MathDivContext ctx) {
        return ctx.math_expr(0).getText() + ctx.DIV().getText() + ctx.math_expr(1).getText();
    }

    @Override
    public String visitMathMod(MiniPascalParser.MathModContext ctx) {
        return ctx.math_expr(0).getText() + ctx.MOD().getText() + ctx.math_expr(1).getText();
    }

    @Override
    public String visitMathMul(MiniPascalParser.MathMulContext ctx) {
        return ctx.math_expr(0).getText() + ctx.ASTERISK().getText() + ctx.math_expr(1).getText();
    }

    @Override
    public String visitMathArrayId(MiniPascalParser.MathArrayIdContext ctx) {
        return this.visitArray_ID(ctx.array_ID());
    }

    @Override
    public String visitMathId(MiniPascalParser.MathIdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitMathDecimal(MiniPascalParser.MathDecimalContext ctx) {
        return ctx.DECIMAL().getText();
    }

    @Override
    public String visitBoolOr(MiniPascalParser.BoolOrContext ctx) {
        return ctx.bool_expr(0).getText() + ctx.OR().getText() + ctx.bool_expr(1).getText();
    }

    @Override
    public String visitBoolMathMayor(MiniPascalParser.BoolMathMayorContext ctx) {
        return ctx.math_expr(0).getText() + ctx.MAYORQUE().getText() + ctx.math_expr(1).getText();
    }

    @Override
    public String visitBoolMathMenorIgual(MiniPascalParser.BoolMathMenorIgualContext ctx) {
        return ctx.math_expr(0).getText() + ctx.MENORIGUAL().getText() + ctx.math_expr(1).getText();
    }

    @Override
    public String visitBoolParen(MiniPascalParser.BoolParenContext ctx) {
        return ctx.LEFTPAREN().getText() + ctx.bool_expr().getText() + ctx.RIGHTPAREN().getText();
    }

    @Override
    public String visitBoolMathIgual(MiniPascalParser.BoolMathIgualContext ctx) {
        return ctx.math_expr(0).getText() + ctx.IGUAL().getText() + ctx.math_expr(1).getText();
    }

    @Override
    public String visitBoolArrayId(MiniPascalParser.BoolArrayIdContext ctx) {
        return this.visitArray_ID(ctx.array_ID());
    }

    @Override
    public String visitBoolVal(MiniPascalParser.BoolValContext ctx) {
        return ctx.BOOL_VAL().getText();
    }

    @Override
    public String visitBoolId(MiniPascalParser.BoolIdContext ctx) {
        return ctx.ID().getText();
    }

    @Override
    public String visitBoolNot(MiniPascalParser.BoolNotContext ctx) {
        return ctx.NOT().getText() + ctx.bool_expr().getText();
    }

    @Override
    public String visitBoolMathMenor(MiniPascalParser.BoolMathMenorContext ctx) {
        return ctx.math_expr(0).getText() + ctx.MENORQUE().getText() + ctx.math_expr(1).getText();
    }

    @Override
    public String visitBoolAnd(MiniPascalParser.BoolAndContext ctx) {
        return ctx.bool_expr(0).getText() + ctx.AND().getText() + ctx.bool_expr(1).getText();
    }

    @Override
    public String visitBoolMathMayorIgual(MiniPascalParser.BoolMathMayorIgualContext ctx) {
        return ctx.math_expr(0).getText() + ctx.MAYORIGUAL().getText() + ctx.math_expr(1).getText();
    }

    @Override
    public String visitBoolMathDistinto(MiniPascalParser.BoolMathDistintoContext ctx) {
        return ctx.math_expr(0).getText() + ctx.DISTINTO().getText() + ctx.math_expr(1).getText();
    }

    @Override
    public String visitComparisonMayor(MiniPascalParser.ComparisonMayorContext ctx) {
        return ctx.MAYORQUE().getText();
    }

    @Override
    public String visitComparisonMenor(MiniPascalParser.ComparisonMenorContext ctx) {
        return ctx.MENORQUE().getText();
    }

    @Override
    public String visitComparisonMayorIgual(MiniPascalParser.ComparisonMayorIgualContext ctx) {
        return ctx.MAYORIGUAL().getText();
    }

    @Override
    public String visitComparisonMenorIgual(MiniPascalParser.ComparisonMenorIgualContext ctx) {
        return ctx.MENORIGUAL().getText();
    }

    @Override
    public String visitComparisonIgual(MiniPascalParser.ComparisonIgualContext ctx) {
        return ctx.IGUAL().getText();
    }

    @Override
    public String visitComparisonDistinto(MiniPascalParser.ComparisonDistintoContext ctx) {
        return ctx.DISTINTO().getText();
    }

    @Override
    public String visitLogical_oprAnd(MiniPascalParser.Logical_oprAndContext ctx) {
        return ctx.AND().getText();
    }

    @Override
    public String visitLogical_oprOr(MiniPascalParser.Logical_oprOrContext ctx) {
        return ctx.OR().getText();
    }

    @Override
    public String visitSize(MiniPascalParser.SizeContext ctx) {
        return ctx.math_expr(0).getText() + ".." + ctx.math_expr(1).getText();
    }
}