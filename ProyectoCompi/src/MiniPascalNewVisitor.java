//public class MiniPascalNewVisitor extends MiniPascalBaseVisitor<String>
//{
//    @Override
//    public String visitProgram(MiniPascalParser.ProgramContext ctx) {
//        return this.visitProgram_block(ctx.program_block());
//    }
//
//    @Override
//    public String visitProgram_block(MiniPascalParser.Program_blockContext ctx) {
//        String str = "PROGRAM_HEADER...\n" + ctx.PROGRAM().getText() + " " + ctx.ID().getText() + ctx.SEMICOLON().getText() + "\n\nPROGRAM_BLOCK...";
//        if (ctx.var_block() != null)
//        {
//            str += this.visitVar_block(ctx.var_block());
//        }
//        if (ctx.function_block() != null)
//        {
//            str += this.visitFunction_block(ctx.function_block());
//        }
//
//        str += "\n" + ctx.BEGIN().getText() + "\n";
//
//        for (int i = 0; i < ctx.instr().size(); i++)
//        {
//            str += ctx.instr(i).getText() + "\n";
//        }
//
//        str += ctx.END().getText() + ctx.PERIOD().getText();
//        return str;
//    }
//
//    @Override
//    public String visitFunction_block(MiniPascalParser.Function_blockContext ctx) {
//        String str = "\nFUNCTION_BLOCK...\n";
//        int nextFunc = 1;
//        for (int i = 0; i < ctx.FUNCTION().size(); i++)
//        {
//            str += ctx.FUNCTION(i).getText() + " " + ctx.ID(i).getText() + ctx.LEFTPAREN(i).getText();
//
//            if(ctx.function_var_decl(i) != null)
//            {
//                str += ctx.function_var_decl(i).getText();
//                if (ctx.SEMICOLON().size() > 2)
//                {
//                    for (int j = 0; i < ctx.SEMICOLON().size(); i++)
//                    {
//                        str += ctx.SEMICOLON(j).getText() + ctx.function_var_decl(nextFunc).getText();
//                        nextFunc += 1;
//                    }
//                }
//            }
//
//            str += ctx.RIGHTPAREN(i).getText() + ctx.COLON(i).getText() + ctx.var_type(i).getText() + ctx.SEMICOLON(i).getText();
//
//            if (ctx.var_block() != null)
//            {
//                str += this.visitVar_block(ctx.var_block(i));
//            }
//
//            str += ctx.BEGIN(i).getText() + "\n";
//
//            for (int j = 0; j < ctx.instr().size(); j++)
//            {
//                str += ctx.instr(j).getText();
//            }
//
//            str += "\n" + ctx.END(i).getText() + ctx.SEMICOLON(i).getText() + "\n";
//        }
//        return str;
//    }
//
//    @Override
//    public String visitFunction_call(MiniPascalParser.Function_callContext ctx) {
//        String str = ctx.ID().getText() + ctx.LEFTPAREN().getText();
//
//        if (ctx.expr(0) != null)
//        {
//            str += ctx.expr(0).getText();
//            if (ctx.expr().size() > 1)
//            {
//                for (int i = 0; i < ctx.COMMA().size(); i++)
//                {
//                    str += ctx.COMMA(i).getText() + ctx.expr(i+1).getText();
//                }
//            }
//        }
//
//        str += ctx.RIGHTPAREN().getText() + ctx.SEMICOLON().getText();
//        return str;
//    }
//
//    @Override
//    public String visitFunction_var_declare(MiniPascalParser.Function_var_declareContext ctx) {
//        String str = ctx.ID(0).getText();
//
//        if (ctx.ID().size() > 1)
//        {
//            for (int i = 1; i < ctx.ID().size(); i++)
//            {
//                str += ctx.COMMA(i).getText() + ctx.ID(i).getText();
//            }
//        }
//
//        str += ctx.COLON().getText() + ctx.var_type().getText();
//        return str;
//    }
//
//    @Override
//    public String visitFunction_var_declArray(MiniPascalParser.Function_var_declArrayContext ctx) {
//        String str = ctx.ID(0).getText();
//
//        if (ctx.ID().size() > 1)
//        {
//            for (int i = 1; i < ctx.ID().size(); i++)
//            {
//                str += ctx.COMMA(i).getText() + ctx.ID(i).getText();
//            }
//        }
//
//        str += ctx.COLON().getText() + ctx.ARRAY().getText() + ctx.LEFTBRACKET().getText()
//            + this.visitSize(ctx.size(0));
//
//        if (ctx.size().size() > 1)
//        {
//            str += ctx.COMMA(0).getText() + ctx.size(1).getText();
//        }
//
//        str += ctx.RIGHTBRACKET().getText() + ctx.OF().getText() + ctx.array_type().getText();
//
//        return str;
//    }
//
//    @Override
//    public String visitFunction_var_declConst(MiniPascalParser.Function_var_declConstContext ctx) {
//        String str = ctx.ID(0).getText();
//
//        if (ctx.ID().size() > 1)
//        {
//            for (int i = 1; i < ctx.ID().size(); i++)
//            {
//                str += ctx.COMMA(i).getText() + ctx.ID(i).getText();
//            }
//        }
//
//        str += ctx.COLON().getText() + ctx.const_type().getText();
//        return str;
//    }
//
//    @Override
//    public String visitInstrVarInit(MiniPascalParser.InstrVarInitContext ctx) {
//        return ctx.var_init().getText() + "\n";
//    }
//
//    @Override
//    public String visitInstrFunCall(MiniPascalParser.InstrFunCallContext ctx) {
//        return this.visitFunction_call(ctx.function_call()) + "\n";
//    }
//
//    @Override
//    public String visitInstrReadCall(MiniPascalParser.InstrReadCallContext ctx) {
//        return this.visitRead_call(ctx.read_call()) + "\n";
//    }
//
//    @Override
//    public String visitInstrWriteCall(MiniPascalParser.InstrWriteCallContext ctx) {
//        return ctx.write_call().getText() + "\n";
//    }
//
//    @Override
//    public String visitInstrForLoop(MiniPascalParser.InstrForLoopContext ctx) {
//        return ctx.for_loop().getText() + "\n";
//    }
//
//    @Override
//    public String visitInstrWhileLoop(MiniPascalParser.InstrWhileLoopContext ctx) {
//        return ctx.while_loop().getText() + "\n";
//    }
//
//    @Override
//    public String visitInstrRepeatLoop(MiniPascalParser.InstrRepeatLoopContext ctx) {
//        return this.visitRepeat_loop(ctx.repeat_loop()) + "\n";
//    }
//
//    @Override
//    public String visitIntrIfStmt(MiniPascalParser.IntrIfStmtContext ctx) {
//        return ctx.if_statement().getText()+ "\n";
//    }
//
//    @Override
//    public String visitRead_call(MiniPascalParser.Read_callContext ctx) {
//        return ctx.READ().getText() + ctx.LEFTPAREN().getText() + ctx.ID().getText()
//                + ctx.RIGHTPAREN().getText() + ctx.SEMICOLON().getText() + "\n";
//    }
//
//    @Override
//    public String visitWrite_callNewLine(MiniPascalParser.Write_callNewLineContext ctx) {
//        String str = ctx.WRITELN().getText() + ctx.LEFTPAREN().getText() + ctx.CONST_VAL().getText();
//
//        if(ctx.COMMA().getText() != null)
//        {
//            str += ctx.COMMA().getText();
//
//            if (ctx.expr().getText() != null)
//            {
//                str += ctx.expr().getText();
//            }
//            else if (ctx.STR().getText() != null)
//            {
//                str += ctx.STR().getText();
//            }
//            else if (ctx.ID().getText() != null)
//            {
//                str += ctx.ID().getText();
//            }
//        }
//
//        str += ctx.RIGHTPAREN().getText() + ctx.SEMICOLON().getText();
//
//        return str + "\n";
//    }
//
//    @Override
//    public String visitWrite_callNoNewLine(MiniPascalParser.Write_callNoNewLineContext ctx) {
//        String str = ctx.WRITE().getText() + ctx.LEFTPAREN().getText() + ctx.CONST_VAL().getText();
//
//        if(ctx.COMMA().getText() != null)
//        {
//           str += ctx.COMMA().getText();
//
//           if (ctx.expr().getText() != null)
//           {
//               str += ctx.expr().getText();
//           }
//           else if (ctx.STR().getText() != null)
//           {
//               str += ctx.STR().getText();
//           }
//           else if (ctx.ID().getText() != null)
//           {
//               str += ctx.ID().getText();
//           }
//        }
//
//        str += ctx.RIGHTPAREN().getText() + ctx.SEMICOLON().getText();
//
//        return str + "\n";
//    }
//
//    @Override
//    public String visitFor_loopToDo(MiniPascalParser.For_loopToDoContext ctx) {
//        return ctx.FOR().getText() + ctx.ID().getText() + ctx.ASSIGN().getText()
//                + ctx.expr(0).getText() + ctx.TO().getText() + ctx.expr(1).getText()
//                + ctx.DO().getText() + ctx.instr().getText();
//    }
//
//    @Override
//    public String visitFor_loopToDoBE(MiniPascalParser.For_loopToDoBEContext ctx) {
//        String str = ctx.FOR().getText() + ctx.ID().getText() + ctx.ASSIGN().getText()
//                + ctx.expr(0).getText() + ctx.TO().getText() + ctx.expr(1).getText()
//                + ctx.DO().getText() + ctx.BEGIN().getText();
//
//        for (int i = 0; i <  ctx.instr().size(); i++)
//        {
//            str += ctx.instr(i).getText();
//        }
//
//        str += ctx.END().getText() + ctx.SEMICOLON().getText() + "\n";
//        return str;
//    }
//
//    @Override
//    public String visitFor_loopDownTo(MiniPascalParser.For_loopDownToContext ctx) {
//        return ctx.FOR().getText() + ctx.ID().getText() + ctx.ASSIGN().getText()
//                + ctx.expr(0).getText() + ctx.DOWNTO().getText() + ctx.expr(1).getText()
//                + ctx.DO().getText() + ctx.instr().getText();
//    }
//
//    @Override
//    public String visitFor_loopDownToBE(MiniPascalParser.For_loopDownToBEContext ctx) {
//        String str = ctx.FOR().getText() + ctx.ID().getText() + ctx.ASSIGN().getText()
//                + ctx.expr(0).getText() + ctx.DOWNTO().getText() + ctx.expr(1).getText()
//                + ctx.DO().getText() + ctx.BEGIN().getText();
//
//        for (int i = 0; i <  ctx.instr().size(); i++)
//        {
//            str += ctx.instr(i).getText();
//        }
//
//        str += ctx.END().getText() + ctx.SEMICOLON().getText() + "\n";
//        return str;
//    }
//
//    @Override
//    public String visitIf_condition(MiniPascalParser.If_conditionContext ctx) {
//        String str = ctx.expr(0).getText();
//
//        if (ctx.expr().size() > 1)
//        {
//            for (int i = 0; i < ctx.expr().size(); i++)
//            {
//                str += ctx.logical_opr(i).getText() + ctx.expr(i+1).getText();
//            }
//        }
//
//        return str + "\n";
//    }
//
//    @Override
//    public String visitWhile_loopSingle(MiniPascalParser.While_loopSingleContext ctx) {
//        return ctx.WHILE().getText() + ctx.LEFTPAREN().getText() + this.visitIf_condition(ctx.if_condition())
//                + ctx.RIGHTPAREN().getText() + ctx.DO().getText() + ctx.instr().getText()
//                + ctx.SEMICOLON().getText();
//    }
//
//    @Override
//    public String visitWhile_loopBE(MiniPascalParser.While_loopBEContext ctx) {
//        String str = ctx.WHILE().getText() + ctx.LEFTPAREN().getText() + this.visitIf_condition(ctx.if_condition())
//                + ctx.RIGHTPAREN().getText() + ctx.DO().getText() + ctx.BEGIN().getText();
//
//        for (int i = 0; i < ctx.instr().size(); i++)
//        {
//            str += ctx.instr(i).getText();
//        }
//
//        str += ctx.END().getText() + ctx.SEMICOLON().getText();
//        return str;
//    }
//
//    @Override
//    public String visitRepeat_loop(MiniPascalParser.Repeat_loopContext ctx) {
//        String str = ctx.REPEAT().getText();
//
//        for (int i = 0; i < ctx.instr().size(); i++)
//        {
//            str += ctx.instr(i).getText();
//        }
//
//        str += ctx.UNTIL().getText() + this.visitIf_condition(ctx.if_condition()) + ctx.SEMICOLON().getText() + "\n";
//        return str;
//    }
//
//    @Override
//    public String visitIf_statementSingle(MiniPascalParser.If_statementSingleContext ctx) {
//        String str = ctx.IF().getText() + ctx.LEFTPAREN().getText() + this.visitIf_condition(ctx.if_condition())
//                + ctx.RIGHTPAREN().getText() + ctx.THEN().getText() + ctx.instr().getText();
//
//        if(ctx.else_if() != null)
//        {
//            for (int i = 0; i < ctx.else_if().size(); i++)
//            {
//                str += ctx.else_if(i).getText();
//            }
//        }
//
//        if(ctx.else_statement() != null)
//        {
//            str += ctx.else_statement().getText();
//        }
//        return str;
//    }
//
//    @Override
//    public String visitIf_statementBE(MiniPascalParser.If_statementBEContext ctx) {
//        String str = ctx.IF().getText() + ctx.LEFTPAREN().getText() + this.visitIf_condition(ctx.if_condition())
//                + ctx.RIGHTPAREN().getText() + ctx.THEN().getText() + ctx.BEGIN().getText();
//
//        for (int i = 0; i < ctx.instr().size(); i++)
//        {
//            str += ctx.instr(i).getText();
//        }
//
//        str += ctx.END().getText() + ctx.SEMICOLON().getText();
//
//        if(ctx.else_if() != null)
//        {
//            for (int i = 0; i < ctx.else_if().size(); i++)
//            {
//                str += ctx.else_if(i).getText();
//            }
//        }
//
//        if(ctx.else_statement() != null)
//        {
//            str += ctx.else_statement().getText();
//        }
//        return str;
//    }
//
//    @Override
//    public String visitElse_ifSingle(MiniPascalParser.Else_ifSingleContext ctx) {
//        return ctx.ELSEIF().getText() + ctx.LEFTPAREN().getText() + this.visitIf_condition(ctx.if_condition())
//                + ctx.RIGHTPAREN().getText() + ctx.THEN().getText() + ctx.instr().getText();
//    }
//
//    @Override
//    public String visitElse_ifBE(MiniPascalParser.Else_ifBEContext ctx) {
//        String str = ctx.ELSEIF().getText() + ctx.LEFTPAREN().getText() + this.visitIf_condition(ctx.if_condition())
//                + ctx.RIGHTPAREN().getText() + ctx.THEN().getText() + ctx.BEGIN().getText();
//
//        for (int i = 0; i < ctx.instr().size(); i++)
//        {
//            str += ctx.instr(i).getText();
//        }
//
//        str += ctx.END().getText() + ctx.SEMICOLON().getText() + "\n";
//        return str;
//    }
//
//    @Override
//    public String visitElse_statementSingle(MiniPascalParser.Else_statementSingleContext ctx) {
//        return ctx.ELSE().getText() + ctx.instr().getText();
//    }
//
//    @Override
//    public String visitElse_statementBE(MiniPascalParser.Else_statementBEContext ctx) {
//        String str = ctx.ELSE().getText() + ctx.BEGIN().getText();
//
//        for (int i = 0; i < ctx.instr().size(); i++)
//        {
//            str += ctx.instr(i).getText();
//        }
//
//        str += ctx.END().getText() + ctx.SEMICOLON().getText();
//        return str;
//    }
//
//    @Override
//    public String visitVar_block(MiniPascalParser.Var_blockContext ctx) {
//        String str = "\nVAR_BLOCK...";
//
//        if (ctx != null)
//        {
//            str += "\n" + ctx.VAR().getText() + " ";
//            for (int i = 0; i < ctx.var_decl().size(); i++)
//            {
//                str += ctx.var_decl(i).getText() + "\n";
//            }
//        }
//        else
//        {
//            str += "[is empty]\n";
//        }
//
//        return str;
//    }
//
//    @Override
//    public String visitVar_declare(MiniPascalParser.Var_declareContext ctx) {
//        return ctx.ID().getText() + ctx.COLON().getText() + ctx.var_type().getText() + ctx.ASSIGN().getText() + ctx.expr().getText() + ctx.SEMICOLON().getText() + "\n";
//    }
//
//    @Override
//    public String visitVar_declMultiple(MiniPascalParser.Var_declMultipleContext ctx) {
//        String str = ctx.ID(0).getText();
//
//        if (ctx.ID().size() > 1)
//        {
//            for (int i = 1; i < ctx.ID().size(); i++)
//            {
//                str += ctx.COMMA(i).getText() + ctx.ID(i).getText();
//            }
//        }
//
//        str += ctx.COLON().getText() + ctx.var_type().getText() + ctx.SEMICOLON().getText();
//        return str;
//    }
//
//    @Override
//    public String visitVar_declArray(MiniPascalParser.Var_declArrayContext ctx) {
//        String str = ctx.ID(0).getText();
//
//        if (ctx.ID().size() > 1)
//        {
//            for (int i = 1; i < ctx.ID().size(); i++)
//            {
//                str += ctx.COMMA(i).getText() + ctx.ID(i).getText();
//            }
//        }
//
//        str += ctx.COLON().getText() + ctx.ARRAY().getText() + ctx.LEFTBRACKET().getText() + this.visitSize(ctx.size(0));
//
//        if (ctx.size().size() > 1)
//        {
//            str += ctx.COMMA(0).getText() + this.visitSize(ctx.size(1));
//        }
//
//        str += ctx.RIGHTBRACKET().getText() + ctx.OF().getText() + ctx.array_type().getText() + ctx.SEMICOLON().getText();
//        return str;
//    }
//
//    @Override
//    public String visitVar_declConst(MiniPascalParser.Var_declConstContext ctx) {
//        return ctx.ID().getText() + ctx.COLON().getText() + ctx.const_type().getText() + ctx.ASSIGN().getText() + ctx.CONST_VAL().getText() + ctx.SEMICOLON().getText();
//    }
//
//    @Override
//    public String visitVar_declConstMultiple(MiniPascalParser.Var_declConstMultipleContext ctx) {
//        String str = ctx.ID(0).getText();
//
//        if (ctx.ID().size() > 1)
//        {
//            for (int i = 1; i < ctx.ID().size(); i++)
//            {
//                str += ctx.COMMA(i).getText() + ctx.ID(i).getText();
//            }
//        }
//
//        str += ctx.COLON().getText() + ctx.const_type().getText() + ctx.SEMICOLON().getText();
//        return str;
//    }
//
//    @Override
//    public String visitVar_initialize(MiniPascalParser.Var_initializeContext ctx) {
//        return ctx.ID().getText() + ctx.ASSIGN().getText() + ctx.expr().getText() + ctx.SEMICOLON().getText();
//    }
//
//    @Override
//    public String visitVar_initArray(MiniPascalParser.Var_initArrayContext ctx) {
//        String str = ctx.ID().getText() + ctx.LEFTBRACKET().getText() + ctx.expr(0).getText();
//        int numExprs = 1;
//        if (ctx.expr().size() > 1)
//        {
//            str += ctx.COMMA().getText() + ctx.expr(numExprs).getText();
//            numExprs += 1;
//        }
//
//        str += ctx.RIGHTBRACKET() + ctx.ASSIGN().getText() + ctx.expr(numExprs).getText() + ctx.SEMICOLON().getText();
//        return str;
//    }
//
//    @Override
//    public String visitVar_typeInt(MiniPascalParser.Var_typeIntContext ctx) {
//        return ctx.INTEGER().getText();
//    }
//
//    @Override
//    public String visitVar_typeChar(MiniPascalParser.Var_typeCharContext ctx) {
//        return ctx.CHARACTER().getText();
//    }
//
//    @Override
//    public String visitVar_typeBool(MiniPascalParser.Var_typeBoolContext ctx) {
//        return ctx.BOOLEAN().getText();
//    }
//
//    @Override
//    public String visitVar_typeStr(MiniPascalParser.Var_typeStrContext ctx) {
//        return ctx.STRING().getText();
//    }
//
//    @Override
//    public String visitArray_typeInt(MiniPascalParser.Array_typeIntContext ctx) {
//        return ctx.INTEGER().getText();
//    }
//
//    @Override
//    public String visitArray_typeChar(MiniPascalParser.Array_typeCharContext ctx) {
//        return ctx.CHARACTER().getText();
//    }
//
//    @Override
//    public String visitArray_typeBool(MiniPascalParser.Array_typeBoolContext ctx) {
//        return ctx.BOOLEAN().getText();
//    }
//
//    @Override
//    public String visitArray_ID(MiniPascalParser.Array_IDContext ctx) {
//        String str = ctx.ID().getText() + ctx.LEFTBRACKET().getText() + ctx.expr(0).getText();
//
//        if (ctx.expr().size() > 1)
//        {
//            str += ctx.COMMA().getText() + ctx.expr(1).getText();
//        }
//
//        str += ctx.RIGHTBRACKET();
//        return str;
//    }
//
//    @Override
//    public String visitConst_typeChar(MiniPascalParser.Const_typeCharContext ctx) {
//        return ctx.CONSTCHAR().getText();
//    }
//
//    @Override
//    public String visitConst_typeStr(MiniPascalParser.Const_typeStrContext ctx) {
//        return ctx.CONSTSTR().getText();
//    }
//
//    @Override
//    public String visitExprParen(MiniPascalParser.ExprParenContext ctx) {
//        return ctx.LEFTPAREN().getText() + ctx.expr().getText() + ctx.RIGHTPAREN().getText();
//    }
//
//    @Override
//    public String visitExprFactorMath(MiniPascalParser.ExprFactorMathContext ctx) {
//        String str = ctx.expr(0).getText();
//
//        if (ctx.ASTERISK() != null)
//        {
//            str += ctx.ASTERISK().getText();
//        }
//        else if (ctx.SLASH() != null)
//        {
//            str += ctx.SLASH().getText();
//        }
//        else if (ctx.DIV() != null)
//        {
//            str += ctx.DIV().getText();
//        }
//        else if (ctx.MOD() != null)
//        {
//            str += ctx.MOD().getText();
//        }
//
//        str += ctx.expr(1).getText();
//        return str;
//    }
//
//    @Override
//    public String visitExprNegative(MiniPascalParser.ExprNegativeContext ctx) {
//        return ctx.MINUS().getText() + ctx.expr().getText();
//    }
//
//    @Override
//    public String visitExprTermMath(MiniPascalParser.ExprTermMathContext ctx) {
//        String str = ctx.expr(0).getText();
//
//        if (ctx.PLUS() != null)
//        {
//            str += ctx.PLUS().getText();
//        }
//        else if (ctx.MINUS() != null)
//        {
//            str += ctx.MINUS().getText();
//        }
//
//        str += ctx.expr(1).getText();
//        return str;
//    }
//
//    @Override
//    public String visitExprComparison(MiniPascalParser.ExprComparisonContext ctx) {
//        return ctx.expr(0).getText() + ctx.comparison().getText() + ctx.expr(1).getText();
//    }
//
//    @Override
//    public String visitExprLogical(MiniPascalParser.ExprLogicalContext ctx) {
//        return ctx.expr(0).getText() + ctx.logical_opr().getText() + ctx.expr(1).getText();
//    }
//
//    @Override
//    public String visitExprNot(MiniPascalParser.ExprNotContext ctx) {
//        return ctx.NOT().getText() + ctx.expr().getText();
//    }
//
//    @Override
//    public String visitExprDecimal(MiniPascalParser.ExprDecimalContext ctx) {
//        return ctx.DECIMAL().getText();
//    }
//
//    @Override
//    public String visitExprNum(MiniPascalParser.ExprNumContext ctx) {
//        return ctx.DIGIT().getText();
//    }
//
//    @Override
//    public String visitExprStr(MiniPascalParser.ExprStrContext ctx) {
//        return ctx.STR().getText();
//    }
//
//    @Override
//    public String visitExprArrayId(MiniPascalParser.ExprArrayIdContext ctx) {
//        return this.visitArray_ID(ctx.array_ID());
//    }
//
//    @Override
//    public String visitExprId(MiniPascalParser.ExprIdContext ctx) {
//        return ctx.ID().getText();
//    }
//
//    @Override
//    public String visitSize(MiniPascalParser.SizeContext ctx) {
//        return ctx.expr(0).getText() + ".." + ctx.expr(1).getText();
//    }
//
//    @Override
//    public String visitComparisonMayor(MiniPascalParser.ComparisonMayorContext ctx) {
//        return ctx.MAYORQUE().getText();
//    }
//
//    @Override
//    public String visitComparisonMenor(MiniPascalParser.ComparisonMenorContext ctx) {
//        return ctx.MENORQUE().getText();
//    }
//
//    @Override
//    public String visitComparisonMayorIgual(MiniPascalParser.ComparisonMayorIgualContext ctx) {
//        return ctx.MAYORIGUAL().getText();
//    }
//
//    @Override
//    public String visitComparisonMenorIgual(MiniPascalParser.ComparisonMenorIgualContext ctx) {
//        return ctx.MENORIGUAL().getText();
//    }
//
//    @Override
//    public String visitComparisonIgual(MiniPascalParser.ComparisonIgualContext ctx) {
//        return ctx.IGUAL().getText();
//    }
//
//    @Override
//    public String visitComparisonDistinto(MiniPascalParser.ComparisonDistintoContext ctx) {
//        return ctx.DISTINTO().getText();
//    }
//
//    @Override
//    public String visitLogical_oprAnd(MiniPascalParser.Logical_oprAndContext ctx) {
//        return ctx.AND().getText();
//    }
//
//    @Override
//    public String visitLogical_oprOr(MiniPascalParser.Logical_oprOrContext ctx) {
//        return ctx.OR().getText();
//    }
//}