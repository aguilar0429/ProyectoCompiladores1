

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MiniPascalNewVisitor extends MiniPascalBaseVisitor<Object> {

    SymbolTable symbol_table = new SymbolTable();
    boolean validateSemantics = true;
    Map<String, String> types = new HashMap<>();

    ArrayList<String> translatedStatements = new ArrayList<>();

    String error_color = "\033[31m";

    @Override
    public Object visitVariableDeclaration(MiniPascalParser.VariableDeclarationContext ctx) {
        String declaredVariables = ctx.identifierList().getText();
        String[] allVariables = new String[0];

        if (declaredVariables.contains(",")) {
            // Caso en que se haya declarado más de una variable
            allVariables = declaredVariables.split(",");
        }

        Object value = null;
        String variableType = ctx.type_().getText().toLowerCase();

        // Identificamos el tipo que tiene la(s) variable(s)0\
        if (variableType.contains("array")) {
            // Caso en el que tengamos Arrays

        } else if (variableType.contains("string")) {
            // Caso en el que tengamos Strings
            value = "";
        } else if (variableType.contains("boolean")) {
            // Caso en el que tengamos Boolean
            value = true;
        } else if (variableType.contains("char")) {
            // Caso en el que tengamos Char
            value = 'a';
        } else if (variableType.contains("integer")) {
            // Caso en el que tengamos Integer
            value = 0;
        } else {
            // Tipo no aceptado
            System.out.println(error_color + "Error Semántico: El tipo ingresado '" + variableType + "' NO es valido");
            validateSemantics = false;
            return null;
        }

        if (allVariables.length != 0) {
            // Caso en que se haya declarado más de una variable
            for (int i = 0; i < allVariables.length; i++) {
                if (validarDeclaracionVariables(allVariables[i])) {
                    // Validación variable ya declarada
                    System.out.println(error_color + "Error Semántico: La variable '" + allVariables[i] + "' ya ha sido declarada");
                    validateSemantics = false;
                } else {
                    // Validación variable no declarada
                    Variable variableInfo = new Variable(allVariables[i], ctx.type_().getText().toLowerCase(), value);

                    // Adición de la variable en la tabla de símbolos
                    symbol_table.addVariable(variableInfo);
                    System.out.println("Declaración de la variable '" + allVariables[i] + "' de tipo " + ctx.type_().getText());

                    // Traducción de código
                    String codeLine = "";
                    switch (variableInfo.getType()) {
                        case "integer":
                            codeLine += "%" + variableInfo.getId() + " = alloca  i32\n";
                            break;
                        case "string":
                            codeLine += "%" + variableInfo.getId() + " = constant [256 * i8]";
                            break;
                        case "boolean":
                            codeLine += "%" + variableInfo.getId() + " = alloca  i1\n";
                            break;
                        case "char":
                            codeLine += "%" + variableInfo.getId() + "alloca i8\n";
                            break;
                        default:
                            break;
                    }
                    translatedStatements.add(codeLine);
                }
            }
        } else {
            // Caso en que se haya declarado una sola variable
            if (validarDeclaracionVariables(declaredVariables)) {
                // Validación variable ya inicializada
                System.out.println(error_color + "Error Semántico: La variable '" + declaredVariables + "' ya ha sido declarada");
                validateSemantics = false;
            } else {
                // Validación variable no inicializada
                Variable variableInfo = new Variable(declaredVariables, ctx.type_().getText().toLowerCase(), value);

                // Adición de la variable en la tabla de símbolos
                symbol_table.addVariable(variableInfo);
                System.out.println("Declaración de la variable '" + declaredVariables + "' de tipo " + ctx.type_().getText());

                // Traducción de código
                String codeLine = "";
                switch (variableInfo.getType()) {
                    case "integer":
                        codeLine += "%" + variableInfo.getId() + " = alloca  i32\n";
                        break;
                    case "string":
                        codeLine += "%" + variableInfo.getId() + " = constant [256 * i8]";
                        break;
                    case "boolean":
                        codeLine += "%" + variableInfo.getId() + " = alloca  i1\n";
                        break;
                    case "char":
                        codeLine += "%" + variableInfo.getId() + "alloca i8\n";
                        break;
                    default:
                        break;
                }
                translatedStatements.add(codeLine);
            }
        }

        return value;
    }

    @Override
    public Object visitFunctionDeclaration(MiniPascalParser.FunctionDeclarationContext ctx) {
        String functionID = ctx.identifier().getText();
        String functionType = ctx.resultType().typeIdentifier().getText().toLowerCase();
        if (!functionType.equals("integer") && !functionType.equals("string") && !functionType.equals("char") && !functionType.equals("boolean") && !functionType.equals("array")) {
            // El tipo de la función no es válido
            System.out.println(error_color + "Error Semántico: El tipo ingresado '" + functionType + "' NO es valido");
            return null;
        }

        Function functionInfo = new Function(functionID, functionType);

        if (!ctx.formalParameterList().getText().equals("()")) {
            String generatedCode = "declare ";
            // La función tiene parámetros
            String parameters = ctx.formalParameterList().getText();
            parameters = parameters.substring(1, parameters.length() - 1);
            // Añadiendo al string generatedCode el tipo de retorno de la función
            switch (functionInfo.getReturnType()) {
                case "integer":
                    generatedCode += "i32 @" + functionInfo.getId() + " ";
                    break;
                case "string":
                    generatedCode += " i8* @" + functionInfo.getId() + " ";
                    break;
                case "boolean":
                    generatedCode += "i1 @" + functionInfo.getId() + " ";
                    break;
                case "char":
                    generatedCode += "i8 @" + functionInfo.getId() + " ";
                    break;
                default:
                    break;
            }
            generatedCode += "(";
            String[] allParameters;
            allParameters = parameters.split(";");

            // Recorremos el arreglo con cada parámetro
            for (int i = 0; i < allParameters.length; i++) {
                String varExistence = allParameters[i].substring(0, 3).toLowerCase();
                String[] parameter = allParameters[i].split(":");

                if (varExistence.equals("var")) {
                    // Validación del paso de una variable por referencia
                    parameter[0] = parameter[0].substring(3);
                    if (!validarDeclaracionVariables(parameter[0])) {
                        // La variable pasada por referencia no existe
                        System.out.println(error_color + "Error Semántico: La variable '" + parameter[0] + "' pasada por referencia NO existe");
                        return null;
                    }
                }

                if (!parameter[1].equals("integer") && !parameter[1].equals("string") && !parameter[1].equals("char") && !parameter[1].equals("boolean") && !parameter[1].equals("array")) {
                    // El tipo de una de las variables no es válido
                    System.out.println(error_color + "Error Semántico: El tipo ingresado '" + parameter[1] + "' para la variable '" + parameter[0] + "' NO es valido");
                    return null;
                }

                // Adición de los parámetros en la función
                Parameter parameterInfo = new Parameter(parameter[0], parameter[1]);
                functionInfo.addParameter(parameterInfo);

                // Añadiendo el string generatedCode los tipos de cada parámetro recibido
                switch (parameter[1]) {
                    case "integer":
                        generatedCode += "i32 %" + parameter[0] + ", ";
                        break;
                    case "string":
                        generatedCode += "i8* %" + parameter[0] + ", ";
                        break;
                    case "boolean":
                        generatedCode += "i1 %" + parameter[0] + ", ";
                        break;
                    case "char":
                        generatedCode += "i8 %" + parameter[0] + ", ";
                        break;
                    default:
                        break;
                }
            }
            // Retirando caracteres innecesarios
            generatedCode = generatedCode.substring(0, generatedCode.length() - 2);
            generatedCode += ") {\n";
            //Añadiendo a la lista de instrucciones traducidas de MiniPascal a LLVM
            translatedStatements.add(generatedCode);
            int place = translatedStatements.size();

            List<MiniPascalParser.VariableDeclarationPartContext> variablesBlock = ctx.block().variableDeclarationPart();
            List<MiniPascalParser.StatementContext> statementsBlock = ctx.block().compoundStatement().statements().statement();

            if (variablesBlock.size() > 0) {
                visitVariableDeclaration(variablesBlock.get(0).variableDeclaration().get(0));
            }

            if (statementsBlock.size() > 0) {
                for (MiniPascalParser.StatementContext s : statementsBlock) {
                    statementVisitor(s);
                }
            }
            for (int i = place; i < translatedStatements.size(); i++) {
                String aux = "\t" + translatedStatements.get(i);
                translatedStatements.set(i, aux);
            }
            translatedStatements.add("}\n");
        }
        if (validarDeclaracionFunciones(functionID)) {
            // Validación función ya declarada
            System.out.println(error_color + "Error Semántico: La función '" + functionID + "' ya ha sido declarada");
            return null;
        } else {
            // Adición de la función en la tabla de símbolos
            symbol_table.addFunction(functionInfo);
        }
        return null;
    }

    @Override
    public Object visitFunctionDesignator(MiniPascalParser.FunctionDesignatorContext ctx) {
        String functionName = ctx.identifier().getText().toLowerCase();
        String parameters = ctx.parameterList().getText().toLowerCase();
        String[] allParameters;
        allParameters = parameters.split(",");

        ArrayList<Parameter> functionParameters = obtainFunctionParameters(functionName);
        if (functionParameters == null) {
            // Validación función declarada previamente
            System.out.println(error_color + "Error Semántico: La función '" + functionName + "' no ha sido declarada");
            return null;
        }

        int cantParameters = functionParameters.size();
        if (cantParameters != allParameters.length) {
            // Validación cantidad de parámetros coincidan
            System.out.println(error_color + "Error Semántico: La cantidad de parámetros no coinciden con la función declarada. Se encontraron " + allParameters.length + " y deberían ser " + cantParameters);
            return null;
        }

        for (int i = 0; i < cantParameters; i++) {
            if (!validarDeclaracionVariables(allParameters[i])) {
                // Validación las variables fueron declaradas previamente
                System.out.println(error_color + "Error Semántico: La variable '" + allParameters[i] + "' no ha sido declarada");
                return null;
            }

            String parameterTypeSend = obtainVariableType(allParameters[i]);
            String parameterTypeDeclared = functionParameters.get(i).getVariableType();

            if (!parameterTypeSend.equals(parameterTypeDeclared)) {
                // Validación parámetros enviados coincidan con el tipo indicado en la función
                System.out.println(error_color + "Error Semántico: El tipo de la variable '" + allParameters[i] + "' no coincide con el tipo esperado. Se esperaba un tipo " + parameterTypeDeclared + " y se encontró " + parameterTypeSend);
                return null;
            }
        }

        System.out.println("No se encontraron errores semánticos en la designación de la función '" + functionName + "'");
        // SUGGESTION: TAL VEZ ENCONTRAR EL VALOR DE LA FUNCIÓN ACA SERIA UTIL
        return null;
    }

    @Override
    public Object visitProcedureDeclaration(MiniPascalParser.ProcedureDeclarationContext ctx) {
        // EJEMPLO FORMATOS PROCEDURE: procedure adder(), procedure adder(var a : integer), procedure adder(var a : integer; b : string);
        String procedureID = ctx.identifier().getText();
        Procedure procedureInfo = new Procedure(procedureID);
        String generatedCode = "define i32 @"+procedureID+" (";
        if (!ctx.formalParameterList().getText().equals("()")) {
            // El procedimiento tiene parámetros
            String parameters = ctx.formalParameterList().getText();
            parameters = parameters.substring(1, parameters.length() - 1);
            String[] allParameters;
            allParameters = parameters.split(";");
            // Recorremos el arreglo con cada parámetro
            for (int i = 0; i < allParameters.length; i++) {
                String varExistence = allParameters[i].substring(0, 3);
                String[] parameter = allParameters[i].split(":");
                switch (parameter[1].toLowerCase()) {
                    case "integer":
                        generatedCode += "i32 %" + parameter[0] + ", ";
                        break;
                    case "string":
                        generatedCode += "i8* %" + parameter[0] + ", ";
                        break;
                    case "boolean":
                        generatedCode += "i1 %" + parameter[0] + ", ";
                        break;
                    case "char":
                        generatedCode += "i8 %" + parameter[0] + ", ";
                        break;
                    default:
                        break;
                }
                if (varExistence.equals("var")) {
                    // Validación del paso de una variable por referencia
                    parameter[0] = parameter[0].substring(3);
                    if (!validarDeclaracionVariables(parameter[0])) {
                        // La variable pasada por referencia no existe
                        System.out.println(error_color + "Error Semántico: La variable '" + parameter[0] + "' pasada por referencia NO existe");
                        return null;
                    }
                }

                if (!parameter[1].equals("integer") && !parameter[1].equals("string") && !parameter[1].equals("char") && !parameter[1].equals("boolean") && !parameter[1].equals("array")) {
                    // El tipo de una de las variables no es válido
                    System.out.println(error_color + "Error Semántico: El tipo ingresado '" + parameter[1] + "' para la variable '" + parameter[0] + "' NO es valido");
                    return null;
                }

                // Adición de los parámetros en el procedimiento
                Parameter parameterInfo = new Parameter(parameter[0], parameter[1]);
                procedureInfo.addParameter(parameterInfo);
            }
            // Retirando caracteres innecesarios
            generatedCode = generatedCode.substring(0, generatedCode.length() - 2);
            generatedCode += ") {\n";//Añadiendo a la lista de instrucciones traducidas de MiniPascal a LLVM
            translatedStatements.add(generatedCode);
            int place = translatedStatements.size();

            List<MiniPascalParser.VariableDeclarationPartContext> variablesBlock = ctx.block().variableDeclarationPart();
            List<MiniPascalParser.StatementContext> statementsBlock = ctx.block().compoundStatement().statements().statement();

            if (variablesBlock.size() > 0) {
                visitVariableDeclaration(variablesBlock.get(0).variableDeclaration().get(0));
            }

            if (statementsBlock.size() > 0) {
                for (MiniPascalParser.StatementContext s : statementsBlock) {
                    statementVisitor(s);
                }
            }
            for (int i = place; i < translatedStatements.size(); i++) {
                String aux = "\t" + translatedStatements.get(i);
                translatedStatements.set(i, aux);
            }
            translatedStatements.add("}\n");
        }

        if (validarDeclaracionProcedimientos(procedureID)) {
            // Validación procedimiento ya declarado
            System.out.println(error_color + "Error Semántico: El procedimiento '" + procedureID + "' ya ha sido declarado");
            return null;
        } else {
            // Adición del procedimiento en la tabla de símbolos
            symbol_table.addProcedure(procedureInfo);
        }
        return null;
    }

    @Override
    public Object visitProcedureStatement(MiniPascalParser.ProcedureStatementContext ctx) {
        String identifier = ctx.identifier().getText().toLowerCase();
        String method_expr = "";
        try {
            method_expr = ctx.parameterList().getText();
        }catch (Exception e){}

        boolean error = false;

        String input_regex = identifier + "(" + method_expr + ")";

        String write_regex = "(writeln|write)\\(((('[^']*')|([a-zA-Z]+\\s*,\\s*)+('[^']*')|(\\w+\\s*)+)\\s*,?\\s*)*\\)";

        Pattern write_pattern = Pattern.compile(write_regex);
        Matcher write_matcher = write_pattern.matcher(input_regex.replace("%d", ""));

        String helper_input = input_regex.replace("[", "").replace("]", "").replace("%d", "").replace("%s", "").replace("%f", "");
        Matcher help = write_pattern.matcher(helper_input);

        if (identifier.equalsIgnoreCase("writeln") || identifier.equalsIgnoreCase("write")) {//reviso si es un write statement
            String acumulador = "";
            if (write_matcher.matches() || (help.matches() && ContainsArray(method_expr))) {
                try {
                    String[] expressions = method_expr.split(",");
                    for (int i = 0; i < expressions.length; i++) {
                        String helper = expressions[i].replace(" ", "");
                        int index = helper.length() - 1;
                        //Quiere decir que es una frase encapsulada en '' como 'Hola Mundo'
                        if (helper.charAt(0) == 39 && helper.charAt(index) == 39) {//39 = '
                            // System.out.println("Se hizo " + identifier + " de " + expressions[i] + " del origen: " + method_expr);
                        } else {
                            String number_regex = "^\\d+$";
                            Pattern number_pattern = Pattern.compile(number_regex);
                            Matcher number_matcher = number_pattern.matcher(expressions[i]);

                            //REVISAMOS SI LO QUE SE ESCRIBE ES UN NÚMERO
                            if (number_matcher.matches()) {
                                // System.out.println("Se hizo '" + identifier + "' de " + expressions[i] + " del origen: " + method_expr);
                            } else {
                                //CASO QUE NO SEA UN NÚMERO
                                boolean var_existe = false;

                                String acumulador_nombre_array = "";
                                //con este if puedo agarrar el nombre del array
                                if (expressions[i].contains("[")) {
                                    for (int k = 0; k < expressions[i].length(); k++) {
                                        if (expressions[i].charAt(k) == '[') {
                                            break;
                                        } else {
                                            acumulador_nombre_array += expressions[i].charAt(k);
                                        }
                                    }//fin for k
                                }

                                //Busca que el token esté dentro de las variables existentes
                                for (Variable v : symbol_table.getVariables()) {
                                    if (v.getId().equals(expressions[i])) {
                                        var_existe = true;
                                        break;
                                    }//fin if
                                    if (v.getId().equals(acumulador_nombre_array)) {
                                        var_existe = true;
                                        break;
                                    }//fin if
                                }//fin for

                                //No encontró la variable
                                if (!var_existe) {
                                    System.out.println(error_color + "Error Semántico: el parámetro '" + expressions[i] + "' en " + identifier + " no se puede reconocer: " + method_expr);
                                } else {
                                    //encontró la variable
                                    // System.out.println("Se hizo " + identifier + " de '" + expressions[i] + "' del origen: " + method_expr);
                                }
                            }//fin else

                        }//fin else
                    }//fin for i
                    System.out.println("No se encontraron errores semánticos en el " + identifier + " statement");
                } catch (Exception e) {
                    //No se si debería ir este sout de error o no porque el programa ya muestra  otro error
                    //System.out.println(error_color + "Error Semántico: el parámetro " + method_expr  + " en " + identifier + " no se puede reconocer: " + method_expr);
                }
            } else {
                //NO HIZO MATCH PORQUE TIENE ARREGLO(S) ENTONCES CAE ACÁ
                System.out.println(error_color + "Error Semántico: el parámetro --" + method_expr + "-- en " + identifier + " no se puede reconocer: " + method_expr);
                return null;
            }
        } else if (identifier.equalsIgnoreCase("readln") || identifier.equalsIgnoreCase("read")) {//reviso si es un read statement

            if (!CharIsVarChar(method_expr.charAt(0))) {//reviso que la variable sea valida
                System.out.println(error_color + "Error Semántico: el parámetro ingresado en " + identifier + " no se puede reconocer: " + method_expr);
                return null;
            }
            boolean var_existe = false;

            //CONFIRMAMOS QUE LA VARIABLE EXISTA
            for (Variable v : symbol_table.getVariables()) {
                if (v.getId().equals(method_expr)) {
                    var_existe = true;
                    break;
                }//fin if
            }//fin for

            //LA VARIABLE NO EXISTE
            if (!var_existe) {
                System.out.println(error_color + "Error Semántico: el parámetro ingresado en " + identifier + " no se puede reconocer: " + method_expr);
                return null;
            }//fin if

            //SI LLEGÓ HASTA ACÁ QUIERE DECIR QUE TODO ESTÁ CORRECTO
            System.out.println("Se hizo " + identifier + " de la variable: " + method_expr);
        } else {
            // Caso en el que se tiene un procedure statement
            String procedureName = ctx.identifier().getText().toLowerCase();
            String parameters = ctx.parameterList().getText().toLowerCase();
            String[] allParameters;
            allParameters = parameters.split(",");

            ArrayList<Parameter> procedureParameters = obtainProcedureParameters(procedureName);
            if (procedureParameters == null) {
                // Validación procedimiento declarado previamente
                System.out.println(error_color + "Error Semántico: El procedimiento '" + procedureName + "' no ha sido declarado");
                return null;
            }

            int cantParameters = procedureParameters.size();
            if (cantParameters != allParameters.length) {
                // Validación cantidad de parámetros coincidan
                System.out.println(error_color + "Error Semántico: La cantidad de parámetros no coinciden con el procedimiento declarado. Se encontraron " + allParameters.length + " y deberían ser " + cantParameters);
                return null;
            }

            for (int i = 0; i < cantParameters; i++) {
                if (!validarDeclaracionVariables(allParameters[i])) {
                    // Validación las variables fueron declaradas previamente
                    System.out.println(error_color + "Error Semántico: La variable '" + allParameters[i] + "' no ha sido declarada");
                    return null;
                }

                String parameterTypeSend = obtainVariableType(allParameters[i]);
                String parameterTypeDeclared = procedureParameters.get(i).getVariableType();

                if (!parameterTypeSend.equals(parameterTypeDeclared)) {
                    // Validación parámetros enviados coincidan con el tipo indicado en el procedimiento
                    System.out.println(error_color + "Error Semántico: El tipo de la variable '" + allParameters[i] + "' no coincide con el tipo esperado. Se esperaba un tipo " + parameterTypeDeclared + " y se encontró " + parameterTypeSend);
                    return null;
                }
            }
            System.out.println("No se encontraron errores semánticos en el procedure statement '" + procedureName + "'");
        }

        return null;
    }

    @Override
    public Object visitWhileStatement(MiniPascalParser.WhileStatementContext ctx) {
        String expression = ctx.expression().getText();
        String relationalOperator = ctx.expression().relationaloperator().getText();
        String[] allExpressions;
        allExpressions = expression.split(relationalOperator);
        String leftTerm, rightTerm;
        leftTerm = allExpressions[0];
        rightTerm = allExpressions[1];
        String generatedCode = "loop_check:\n";

        // Validación de sí las variables fueron declaradas previamente
        boolean leftIsDeclared, rightIsDeclared;
        leftIsDeclared = validarDeclaracionVariables(leftTerm);
        rightIsDeclared = validarDeclaracionVariables(rightTerm);
        System.out.println("RIGHT IS DECLARED: " + rightIsDeclared);
        System.out.println("LEFT IS DECLARED: " + leftIsDeclared);
        String leftVariableType, rightVariableType, opRelLLVM = "";
        switch (relationalOperator) {
            case "<":
                opRelLLVM = " slt ";
                break;
            case ">":
                opRelLLVM = " sgt ";
                break;
            case "=":
                opRelLLVM = " eq ";
                break;
            case "<>":
                opRelLLVM = " ne ";
                break;
            case "<=":
                opRelLLVM = " sle ";
                break;
            case ">=":
                opRelLLVM = " sge ";
                break;
            default:
                break;
        }
        if (leftIsDeclared && rightIsDeclared) {
            // Ambas variables fueron declaradas
            leftVariableType = obtainVariableType(leftTerm);
            rightVariableType = obtainVariableType(rightTerm);
            if (!leftVariableType.equals(rightVariableType)) {
                // Los tipos de ambas variables no coinciden
                System.out.println(error_color + "Error Semántico: Los tipos de las variables no coinciden. No se puede comparar el tipo " + leftVariableType + " con el tipo " + rightVariableType);
                return null;
            }
        } else if (leftIsDeclared) {
            // Solo la variable de la izquierda fue declarada
            leftVariableType = obtainVariableType(leftTerm);

            if (isNumber(rightTerm)) {
                if (!leftVariableType.equals("integer")) {
                    System.out.println(error_color + "Error Semántico: Los tipos de las variables no coinciden. No se puede comparar el tipo " + leftVariableType + " con el tipo integer");
                    return null;
                }
            } else if (isBoolean(rightTerm)) {
                if (!leftVariableType.equals("boolean")) {
                    System.out.println(error_color + "Error Semántico: Los tipos de las variables no coinciden. No se puede comparar el tipo " + leftVariableType + " con el tipo boolean");
                    return null;
                }
            } else if (isChar(rightTerm)) {
                if (!leftVariableType.equals("char")) {
                    System.out.println(error_color + "Error Semántico: Los tipos de las variables no coinciden. No se puede comparar el tipo " + leftVariableType + " con el tipo char");
                    return null;
                }
            } else if (isString(rightTerm)) {
                if (!leftVariableType.equals("string")) {
                    System.out.println(error_color + "Error semántico: Los tipos de las variables no coinciden. No se puede comparar el tipo " + leftVariableType + " con el tipo string");
                    return null;
                }
            } else {
                System.out.println(error_color + "Error semántico: La variable '" + rightTerm + "' no ha sido declarada");
                return null;
            }
        } else if (rightIsDeclared) {
            // Solo la variable de la derecha fue declarada
            rightVariableType = obtainVariableType(rightTerm);

            if (isNumber(leftTerm)) {
                if (!rightVariableType.equals("integer")) {
                    System.out.println(error_color + "Error Semántico: Los tipos de las variables no coinciden. No se puede comparar el tipo " + rightVariableType + " con el tipo integer");
                    return null;
                }
            } else if (isBoolean(leftTerm)) {
                if (!rightVariableType.equals("boolean")) {
                    System.out.println(error_color + "Error Semántico: Los tipos de las variables no coinciden. No se puede comparar el tipo " + rightVariableType + " con el tipo boolean");
                    return null;
                }
            } else if (isChar(leftTerm)) {
                if (!rightVariableType.equals("char")) {
                    System.out.println(error_color + "Error Semántico: Los tipos de las variables no coinciden. No se puede comparar el tipo " + rightVariableType + " con el tipo char");
                    return null;
                }
            } else if (isString(leftTerm)) {
                if (!rightVariableType.equals("string")) {
                    System.out.println(error_color + "Error semántico: Los tipos de las variables no coinciden. No se puede comparar el tipo " + rightVariableType + " con el tipo string");
                    return null;
                }
            } else {
                System.out.println(error_color + "Error semántico: La variable '" + leftTerm + "' no ha sido declarada");
                return null;
            }
        } else {
            System.out.println(error_color + "Error semántico: Las variables '" + leftTerm + "' y '" + rightTerm + "' no han sido declaradas");
            return null;
        }

        System.out.println("No se encontraron errores semánticos en el while statement");

        generatedCode += "\t%compare = icmp " + opRelLLVM + " %" + leftTerm + ", %" + rightTerm + "\n\tbr i1 %compare, label %loop_body, label %loop_end\nloop_body\n";
        //PRINT OUT WHATEVER IS INSIDE THE WHILE LOOP
        System.out.println("ESTO ES LO QUE ESTA DENTRO DEL WHILE LOOP");
        System.out.println("ENTRANDO");
        String[] blockStatements = statementsVisitor(ctx.statement()); //ESTA COMENTADO POR EL MOMENTO
        System.out.println("SALIENDO");
        translatedStatements.add(generatedCode);
        try{
            for (int k = 0; k < blockStatements.length; k++) {
                translatedStatements.add("\t" + blockStatements[k]);
            }
        } catch (Exception e) {

        }
        translatedStatements.add("loop_end:\n");
        return null;
    }

    @Override
    public Object visitIfStatement(MiniPascalParser.IfStatementContext ctx) {
        String getStatement = ctx.expression().getText();
        String generatedCode = "%compare = icmp ";
        int pos = 0;
        String opRel = "", opRelLLVM = "";
        Object leftValue = null, rightValue = null;
        // Buscando posicion donde tokenizar dependiendo del operador relacional
        for (int i = 0; i < getStatement.length(); i++) {
            if (getStatement.charAt(i) == '<' || getStatement.charAt(i) == '>' || getStatement.charAt(i) == '=') {
                pos = i;
                opRel += getStatement.charAt(i);
            }
        }
        String leftOperand = getStatement.substring(0, pos);
        String rightOperand = "";
        if (getStatement.charAt(pos + 1) == '=' || getStatement.charAt(pos + 1) == '>') {
            rightOperand = getStatement.substring(pos + 2, getStatement.length() - 1);
            opRel += getStatement.charAt(pos + 1);
        } else {
            rightOperand = getStatement.substring(pos + 1, getStatement.length());
        }

        switch (opRel) {
            case "<":
                opRelLLVM = " slt ";
                break;
            case ">":
                opRelLLVM = " sgt ";
                break;
            case "=":
                opRelLLVM = " eq ";
                break;
            case "<>":
                opRelLLVM = " ne ";
                break;
            case "<=":
                opRelLLVM = " sle ";
                break;
            case ">=":
                opRelLLVM = " sge ";
                break;
            default:
                break;

        }
        generatedCode += opRelLLVM;
        boolean leftIsDeclared = false, rightIsDeclared = false;

        /*
         * Primer/Segunda flag valida si, ya sea el operando de la izquierda o el de la derecha
         * es una variable ya declarada y agregada en la tabla de simbolos.
         */

        for (Variable v : symbol_table.getVariables()) {
            String aux = v.getId();
            if (aux.equals(leftOperand)) {
                leftIsDeclared = true;
            } else if (aux.equals(rightOperand)) {
                rightIsDeclared = true;
            } else if (leftIsDeclared && rightIsDeclared) {
                break;
            }
        }

        if (leftIsDeclared && rightIsDeclared) {
            System.out.println("Ambas estan declaradas");
            String typeLeft = "", typeRight = "", idLeft = "", idRight = "";
            for (Variable v : symbol_table.getVariables()) {
                if (v.getId().equals(leftOperand)) {
                    typeLeft = v.getType();
                    idLeft = v.getId();
                    leftValue = v.getValue();
                } else if (v.getId().equals(rightOperand)) {
                    typeRight = v.getType();
                    idRight = v.getId();
                    rightValue = v.getValue();
                }
            }
            if (!typeLeft.equals(typeRight)) {
                validateSemantics = false;
                System.out.println(error_color + "Error semántico. No hay manera explicita de comparar " + typeLeft + " con " + typeRight);
                return null;
            } else {
                System.out.println("Expresion de comparacion valida de tipo entero con valores " + leftOperand + " y " + rightOperand);
                switch (typeLeft) {
                    case "integer":
                        generatedCode += "i32 %" + idLeft + ", %" + idRight + "\n";
                        break;
                    case "boolean":
                        generatedCode += "i1 %" + idLeft + ", %" + idRight + "\n";
                        break;
                    case "character":
                        generatedCode += "i8 %" + idLeft + ", %" + idRight + "\n";
                        break;
                    default:
                        break;
                }
            }
        } else if (leftIsDeclared) {
            System.out.println("izquierda esta declarada");
            String type = "", idLeft = "";
            for (Variable v : symbol_table.getVariables()) {
                if (v.getId().equals(leftOperand)) {
                    type = v.getType();
                    idLeft = v.getId();
                    leftValue = v.getValue();
                    break;
                }
            }
            if (type.equalsIgnoreCase("integer")) {
                try {
                    rightValue = Integer.parseInt(rightOperand);
                    System.out.println("Expresion de comparacion valida de tipo entero con valores " + leftOperand + " y " + rightValue);
                    generatedCode += "i32 %" + idLeft + ", " + rightValue + "\n";
                } catch (NumberFormatException e) {
                    validateSemantics = false;
                    String typeRight = "";
                    if (rightOperand.equalsIgnoreCase("true") || rightOperand.equalsIgnoreCase("false")) {
                        typeRight = "Boolean";
                    } else if (rightOperand.length() > 1) {
                        typeRight = "String";
                    } else if (rightOperand.length() == 1) {
                        typeRight = "Character";
                    }
                    System.out.println(error_color + "Error semántico. No hay manera explicita de comparar " + type + " con " + typeRight);
                    return null;
                }
            } else if (type.equalsIgnoreCase("character")) {
                if (rightOperand.length() != 3) {
                    validateSemantics = false;
                    System.out.println(error_color + "Error semántico. No hay manera explicita de comparar Character con el tipo ingresado");
                    return null;
                } else {
                    rightValue = rightOperand.charAt(1);
                    generatedCode += "i8 %" + idLeft + ", " + rightValue + "\n";
                    System.out.println("Expresion de comparacion valida");
                }
            } else if (type.equalsIgnoreCase("boolean")) {
                if (rightOperand.equalsIgnoreCase("true") || rightOperand.equalsIgnoreCase("false")) {
                    rightValue = Boolean.valueOf(rightOperand.toLowerCase());
                    generatedCode += "i1 %" + idLeft + ", " + rightValue + "\n";
                    System.out.println("Expresion de comparacion valida");
                } else {
                    validateSemantics = false;
                    System.out.println(error_color + "Error semántico. No hay manera explicita de comparar Boolean con el tipo ingresado");
                    return null;
                }
            } else if (type.equalsIgnoreCase("string")) {
                if ((rightOperand.charAt(0) == '"') && (rightOperand.charAt(rightOperand.length() - 1) == '"')) {
                    rightValue = rightOperand.substring(1, rightOperand.length() - 2);
                    System.out.println("Expresion de comparacion valida");
                } else {
                    validateSemantics = false;
                    System.out.println(error_color + "Error semántico. No hay manera explicita de comparar String con el tipo ingresado");
                    return null;
                }
            }
        } else if (rightIsDeclared) {
            System.out.println("derecha esta declarada");
            String type = "", rightId = "";
            for (Variable v : symbol_table.getVariables()) {
                if (v.getId().equals(rightOperand)) {
                    type = v.getType();
                    rightId = v.getId();
                    rightValue = v.getValue();
                    break;
                }
            }
            if (type.equalsIgnoreCase("integer")) {
                try {
                    leftValue = Integer.parseInt(leftOperand);
                    System.out.println("Expresion de comparacion valida de tipo entero con valores " + leftValue + " y " + rightOperand);
                    generatedCode += "i32 %" + leftValue + ", " + rightId + "\n";
                } catch (NumberFormatException e) {
                    validateSemantics = false;
                    String typeLeft = "";
                    if (leftOperand.equalsIgnoreCase("true") || leftOperand.equalsIgnoreCase("false")) {
                        typeLeft = "Boolean";
                    } else if (leftOperand.length() > 1) {
                        typeLeft = "String";
                    } else if (leftOperand.length() == 1) {
                        typeLeft = "Character";
                    }
                    System.out.println(error_color + "Error semántico. No hay manera explicita de comparar " + type + " con " + typeLeft);
                    return null;
                }
            } else if (type.equalsIgnoreCase("character")) {
                if (leftOperand.length() != 3) {
                    validateSemantics = false;
                    System.out.println(error_color + "Error semántico. No hay manera explicita de comparar Character con el tipo ingresado");
                    return null;
                } else {
                    leftValue = leftOperand.charAt(1);
                    generatedCode += "i8 %" + leftValue + ", " + rightId + "\n";
                    System.out.println("Expresion de comparacion valida");
                }
            } else if (type.equalsIgnoreCase("boolean")) {
                if (leftOperand.equalsIgnoreCase("true") || leftOperand.equalsIgnoreCase("false")) {
                    leftValue = Boolean.valueOf(leftOperand.toLowerCase());
                    generatedCode += "i1 %" + leftValue + ", " + rightId + "\n";
                    System.out.println("Expresion de comparacion valida");
                } else {
                    validateSemantics = false;
                    System.out.println(error_color + "Error semántico. No hay manera explicita de comparar Boolean con el tipo ingresado");
                    return null;
                }
            } else if (type.equalsIgnoreCase("string")) {
                if ((leftOperand.charAt(0) == '"') && (leftOperand.charAt(leftOperand.length() - 1) == '"')) {
                    leftValue = leftOperand;
                    System.out.println("Expresion de comparacion valida");
                } else {
                    validateSemantics = false;
                    System.out.println(error_color + "Error semántico. No hay manera explicita de comparar String con el tipo ingresado");
                    return null;
                }
            }
        }
        translatedStatements.add(generatedCode);
        translatedStatements.add("\n\tbr i1 %compare, label %if_true, label %end_if\nif_true:\n");
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        String[] blockStatements = statementsVisitor(ctx.statement(0));
        System.out.println(">>>>>>>>>>>>>>>>>>>");
        try {
            for (int k = 0; k < blockStatements.length; k++) {
                translatedStatements.add("\t" + blockStatements[k]);
            }
        } catch (Exception e) {

        }

        translatedStatements.add("end_if:\n");
        return null;
    }



    @Override
    public Object visitForStatement(MiniPascalParser.ForStatementContext ctx) {
        System.out.println("prueba?: " + ctx.getText());
        String initialValue = ctx.forList().initialValue().getText(),
                finalValue = ctx.forList().finalValue().getText(),
                identifier = ctx.identifier().getText();
        System.out.println("INI: " + initialValue);
        System.out.println("FIN: " + finalValue);
        int initial_int_value = 0,
                final_int_value = 0;

        if (validarDeclaracionVariables(initialValue) && firstCharIsLetter(initialValue)) { //aquí se valida que la variable ya haya sido declarada, el firstChar method es usado para asegurarnos que la asignación es a una variable (i = x) y no a un número (i = 1)
            //aquí se guarda el valor de la variable
            initial_int_value = getVariableValue(initialValue);
        } else if (isInteger(initialValue)) {//valida que si no se asigna una variable (i = x), se asigna un numero (i = 1)
            initial_int_value = Integer.parseInt(initialValue);
        } else {
            System.out.println(error_color + "Error Semántico: La variable " + initialValue + " no ha sido declarada o no es válida");
            return null;
        }

        if (validarDeclaracionVariables(finalValue) && firstCharIsLetter(finalValue)) {//aquí se valida que la variable ya haya sido declarada, el firstChar method es usado para asegurarnos que la asignación es a una variable (i = x) y no a un número (i = 1)
            //aquí se guarda el valor de la variable
            final_int_value = getVariableValue(finalValue);
        } else if (isInteger(finalValue)) {//valida que si no se asigna una variable (i = x), se asigna un numero (i = 1)
            final_int_value = Integer.parseInt(finalValue);
        } else {
            System.out.println(error_color + "Error Semántico: La variable " + finalValue + " no ha sido declarada o no es válida");
            return null;
        }
        String generatedCode = "%counter = alloca i32\nstore i32 " + initialValue + ", i32* %counter\nbr label loop_check\nloop_check" +
                "\n\t%current_value = load i32, i32* %counter\n\t%comparison = icmp slt i32, %current_value, " + final_int_value + "" +
                "\n\tbr i1 %compare_result, label %loop_body, label %loop_end\nloop_body:\n";
        System.out.println("No se encontraron errores semánticos en el for statement");
        translatedStatements.add(generatedCode);
        try {
            System.out.println("HELLO");
            String[] blockStatements = statementsVisitor(ctx.statement());
            for (int i = 0; i < blockStatements.length; i++) {
                translatedStatements.add("\t" + blockStatements[i]);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        translatedStatements.add("loop_end:");
        return null;
    }


    /***
     * Recibe un string e indica si el primer char  es una letra
     * @param value
     * @return boolean
     */
    public boolean firstCharIsLetter(String value){
        return (value.charAt(0)>=65 && value.charAt(0) <= 90) || (value.charAt(0)>=97 && value.charAt(0) <= 122);
    }

    /***
     *  Recibe un string e indica si sus datos representan un número o no
     * @param value
     * @return boolean
     */
    public boolean isInteger(String value){
        int start = 0;
        if(value.charAt(0) == '+' || value.charAt(0) == '-'){//nos sirve para identificar que es un número aun empezando con un - o un +, seguido de un número
            start++;
        }
        for (int i = start; i < value.length(); i++){

            if(value.charAt(i) < 48 || value.charAt(i) > 57){//encontró algo que no es un número
                return false;
            }
        }
        //es un número
        return true;
    }

    /***
     * Recibe un string y retorna el valor que le corresponde a esa variable
     * @param variableName
     * @return int
     */
    public int getVariableValue(String variableName){
        ArrayList<Variable> symbolTableVariables = symbol_table.getVariables();
        int value = 0;
        for (int i = 0; i < symbolTableVariables.size(); i++){
            if (symbolTableVariables.get(i).getId().equals(variableName)) {
                value = (int)symbolTableVariables.get(i).getValue();
                Object x = symbolTableVariables.get(i).getId();
                Object y = symbolTableVariables.get(i).getValue();
                System.out.println(x.toString() + " = " + y.toString());
            }
        }
        return value;
    }
    /***
     * Recibe un char e indica si es valido para ser primer caracter del nombre de una variable
     * @param value
     * @return boolean
     */
    public boolean CharIsVarChar(char value) {
        return (value >= 65 && value <= 90) || (value >= 97 && value <= 122) || (value == 95);
    }

    /***
     * Recibe un string y corrobora que sea el llamado a una posición de un array por ejemplo array[i]
     * @param value
     * @return boolean
     */
    public boolean ContainsArray(String value) {
        boolean contains = false;
        String acumulador = "";
        for (int i = 1; i < value.length(); i++) {
            if (value.charAt(i) == '[' && ((value.charAt(i - 1) >= 65 && value.charAt(i - 1) <= 90) || (value.charAt(i - 1) >= 97 && value.charAt(i - 1) <= 122) ||
                    (value.charAt(i - 1) >= 48 && value.charAt(i - 1) <= 57))) {//las variables pueden terminar con una letra o un número entonces acá valido que suceda eso
                contains = true;
                i++;
            }
            if (value.charAt(i) == ']') {
                contains = false;
            }
            if (contains) {
                acumulador += value.charAt(i);
            }
            if (contains && i == value.length() - 1) {
                acumulador = "";
            }
        }
        return acumulador.length() > 0;
    }

    public Object statementVisitor(MiniPascalParser.StatementContext ctx) {
        String s = ctx.getText();
        if (s.contains("if")) {
            MiniPascalParser.IfStatementContext ifS = ctx.unlabelledStatement().structuredStatement().conditionalStatement().ifStatement();
            visitIfStatement(ifS);
        } else if (s.contains("while")) {
            MiniPascalParser.WhileStatementContext whileS = ctx.unlabelledStatement().structuredStatement().repetetiveStatement().whileStatement();
            visitWhileStatement(whileS);
        }else if(s.contains("for")){
            System.out.println("Hay un for");
        } else if (s.contains(":=")) {
            System.out.println("No hay bloques if ni while");
            String generatedCode = "store ";
            String[] splittingStatement = s.split(":="); //diviendo los argumentos de cada statement
            String type = "";
            boolean flag = false;
            String leftOperand = "", rightOperand = "";
            try {
                leftOperand = splittingStatement[0];
                rightOperand = splittingStatement[1];
            } catch (Exception e) {
                return "";
            }
            boolean leftIsDeclared = false, rightIsDeclared = false;
            /*
             * Primer/Segunda flag valida si, ya sea el operando de la izquierda o el de la derecha
             * es una variable ya declarada y agregada en la tabla de simbolos.
             */

            for (Variable v : symbol_table.getVariables()) {
                if (v.getId().equals(leftOperand)) {
                    leftIsDeclared = true;
                } else if (v.getId().equals(rightOperand)) {
                    rightIsDeclared = true;
                } else if (leftIsDeclared && rightIsDeclared) {
                    break;
                }
            }

            if (leftIsDeclared && rightIsDeclared) {
                System.out.println("Ambas estan declaradas");
                String typeLeft = "", typeRight = "";
                for (Variable v : symbol_table.getVariables()) {
                    if (v.getId().equals(leftOperand)) {
                        typeLeft = v.getType();
                    } else if (v.getId().equals(rightOperand)) {
                        typeRight = v.getType();
                    }
                }
                if (!typeLeft.equals(typeRight)) {
                    //Validando que no son del mismo tipo
                    validateSemantics = false;
                    System.out.println(error_color + "Error semántico en la fila " + ctx.getStart().getLine() + ", columna " + ctx.getStart().getCharPositionInLine() + ": " + ctx.getText() + ". No hay manera explícita de asignar un valor de tipo " + typeRight + " a una variable de tipo " + typeLeft);
                    return null;
                } else {
                    System.out.println("Expresion de asignacion valida con variables " + leftOperand + " y " + rightOperand);
                    int posL = -1, posR = -1;
                    //Buscando las variables en la tabla de simbolos
                    for (Variable v : symbol_table.getVariables()) {
                        if (v.getId().equals(leftOperand)) {
                            posL = symbol_table.getVariables().indexOf(v);
                        } else if (v.getId().equals(rightOperand)) {
                            posR = symbol_table.getVariables().indexOf(v);
                        }
                    }
                    //Obteniendo el valor de la variable a la derecha para signarlo a la de la izquierda de la expresion
                    Object o = symbol_table.getVariables().get(posR).getValue();
                    symbol_table.getVariables().get(posL).setValue(o);
                    switch (typeLeft) {
                        case "integer":
                            generatedCode += "i32 " + o.toString() + ", i32* %" + leftOperand + "\n";
                            break;
                        case "character":
                            generatedCode += "i8 " + (int) o.toString().charAt(0) + ", i8* %" + leftOperand + "\n";
                            break;
                        case "string":
                            int size = o.toString().length();
                            generatedCode += "[" + size + " x i8] c\"" + o.toString().substring(1, o.toString().length() - 2) + "\\00\", [\"+size+\" x i8]* %" + leftOperand + "\n";
                            break;
                        case "boolean":
                            generatedCode += "i1 " + o.toString().toLowerCase() + ", i1* %" + leftOperand + "\n";
                            break;
                        default:
                            break;
                    }
                    System.out.println(generatedCode);
                }
            } else if (leftIsDeclared) {
                System.out.println("variable a la izquierda esta declarada");
                String typeLeft = "";
                int posVariable = -1;
                //Obteniendo el tipo de la variable
                for (Variable v : symbol_table.getVariables()) {
                    if (v.getId().equals(leftOperand)) {
                        typeLeft = v.getType();
                        posVariable = symbol_table.getVariables().indexOf(v);
                        break;
                    }
                }
                if (typeLeft.equalsIgnoreCase("integer")) {
                    try {
                        //Obteniendo el valor de la derecha siendo este un entero
                        int rightOperandValue = Integer.parseInt(rightOperand);
                        symbol_table.getVariables().get(posVariable).setValue(rightOperandValue);
                        System.out.println("Asiignacion valida de tipo entero a la variable " + leftOperand + " con el valor " + rightOperandValue);
                        generatedCode += "i32 " + rightOperandValue + ", i32* %" + leftOperand + "\n";

                    } catch (NumberFormatException e) {
                        validateSemantics = false;
                        String typeRight = "";
                        if (rightOperand.equalsIgnoreCase("true") || rightOperand.equalsIgnoreCase("false")) {
                            typeRight = "Boolean";
                        } else if (rightOperand.length() > 1) {
                            typeRight = "String";
                        } else if (rightOperand.length() == 1) {
                            typeRight = "Character";
                        }
                        System.out.println(error_color + "Error semántico en la fila " + ctx.getStart().getLine() + ", columna " + ctx.getStart().getCharPositionInLine() + ": " + ctx.getText() + ". No hay manera explícita de asignar un valor de tipo " + typeRight + " a una variable de tipo " + typeLeft);
                        return null;
                    }
                } else if (typeLeft.equalsIgnoreCase("character")) {
                    if (rightOperand.length() != 3) {
                        validateSemantics = false;
                        System.out.println(error_color + "Error semántico. No hay manera explicita de asignar un valor del tipo ingresado a una variable de tipo Character");
                        return null;
                    } else {
                        char rightOperandValue = rightOperand.charAt(1);
                        symbol_table.getVariables().get(posVariable).setValue(rightOperandValue);
                        generatedCode += "i8 " + (int) rightOperandValue + ", i8* %" + leftOperand + "\n";
                        System.out.println("Expresion de asignacion valida");
                    }
                } else if (typeLeft.equalsIgnoreCase("boolean")) {
                    if (rightOperand.equalsIgnoreCase("true") || rightOperand.equalsIgnoreCase("false")) {
                        boolean rightOperandValue = Boolean.valueOf(rightOperand.toLowerCase());
                        symbol_table.getVariables().get(posVariable).setValue(rightOperandValue);
                        generatedCode += "i1 " + rightOperandValue + ", i1* %" + leftOperand + "\n";
                        System.out.println("Expresion de asignacion valida");
                    } else {
                        validateSemantics = false;
                        System.out.println(error_color + "Error semántico. No hay manera explicita de asignar un valor del tipo ingresado a una variable de tipo Boolean");
                        return null;
                    }
                } else if (typeLeft.equalsIgnoreCase("string")) {
                    if ((rightOperand.charAt(0) == '"') && (rightOperand.charAt(rightOperand.length() - 1) == '"')) {
                        String rightOperandValue = rightOperand.substring(1, rightOperand.length() - 2);
                        symbol_table.getVariables().get(posVariable).setValue(rightOperandValue);
                        int size = rightOperandValue.length();
                        generatedCode += "[" + size + " x i8] c\"" + rightOperandValue + "\\00\", [\"+size+\" x i8]* %" + leftOperand + "\n\n";
                        System.out.println("Expresion de comparacion valida");
                    } else {
                        validateSemantics = false;
                        System.out.println(error_color + "Error semántico. No hay manera explicita de asignar un valor del tipo ingresado a una variable de tipo String");
                        return null;
                    }
                }
                if (!generatedCode.equals("store ")){
                    translatedStatements.add(generatedCode);
                    System.out.println("-------\n"+generatedCode+"-><-");
                }
            }
        } else {
            System.out.println("es un procedure");
        }

        return null;
    }

    public String[] statementsVisitor(MiniPascalParser.StatementContext ctx) {
        System.out.println("HERE");
        String aux = ctx.getText();
        System.out.println(aux);
        aux = aux.toLowerCase();
        System.out.println(aux);
        String inicio = aux.substring(0,5).toLowerCase();
        if(inicio.equalsIgnoreCase("begin")){
            System.out.println("SI TIENE");
            aux = aux.substring(5, aux.length() - 3); //Removiendo palbars claves "Begin" y "End"
        }



        String[] statements = aux.split(";"); //Separando las statements
        String[] generatedStatements = new String[statements.length];
        System.out.println(aux);
        int i = 0;
        for (String s : statements) {
            System.out.println("S: "+ s);
            s = s.toLowerCase();
            if (s.contains("if")) {
                MiniPascalParser.IfStatementContext ifS = ctx.unlabelledStatement().structuredStatement().conditionalStatement().ifStatement();
                visitIfStatement(ifS);
            } else if (s.contains("while")) {
                MiniPascalParser.WhileStatementContext whileS = ctx.unlabelledStatement().structuredStatement().repetetiveStatement().whileStatement();
                visitWhileStatement(whileS);
            }else if(s.contains("for")){
                System.out.println("FORR");
                System.out.println(ctx.getText());

                MiniPascalParser.ForStatementContext forS = ctx.unlabelledStatement().structuredStatement().repetetiveStatement().forStatement();
                visitForStatement(forS);
                System.out.println("Hay un for");
            } else if (s.contains(":=")) {
                String generatedCode = "store ";
                String[] splittingStatement = s.split(":="); //diviendo los argumentos de cada statement
                String type = "";
                boolean flag = false;
                String leftOperand = "", rightOperand = "";
                try {
                    leftOperand = splittingStatement[0];
                    rightOperand = splittingStatement[1];
                } catch (Exception e) {
                }

                boolean leftIsDeclared = false, rightIsDeclared = false;
                /*
                 * Primer/Segunda flag valida si, ya sea el operando de la izquierda o el de la derecha
                 * es una variable ya declarada y agregada en la tabla de simbolos.
                 */

                for (Variable v : symbol_table.getVariables()) {
                    if (v.getId().equals(leftOperand)) {
                        leftIsDeclared = true;
                    } else if (v.getId().equals(rightOperand)) {
                        rightIsDeclared = true;
                    } else if (leftIsDeclared && rightIsDeclared) {
                        break;
                    }
                }

                if (leftIsDeclared && rightIsDeclared) {
                    System.out.println("Ambas estan declaradas");
                    String typeLeft = "", typeRight = "";
                    for (Variable v : symbol_table.getVariables()) {
                        if (v.getId().equals(leftOperand)) {
                            typeLeft = v.getType();
                        } else if (v.getId().equals(rightOperand)) {
                            typeRight = v.getType();
                        }
                    }
                    if (!typeLeft.equals(typeRight)) {
                        //Validando que no son del mismo tipo
                        validateSemantics = false;
                        System.out.println(error_color + "Error semántico en la fila " + ctx.getStart().getLine() + ", columna " + ctx.getStart().getCharPositionInLine() + ": " + ctx.getText() + ". No hay manera explícita de asignar un valor de tipo " + typeRight + " a una variable de tipo " + typeLeft);
                        return null;
                    } else {
                        System.out.println("Expresion de asignacion valida con variables " + leftOperand + " y " + rightOperand);
                        int posL = -1, posR = -1;
                        //Buscando las variables en la tabla de simbolos
                        for (Variable v : symbol_table.getVariables()) {
                            if (v.getId().equals(leftOperand)) {
                                posL = symbol_table.getVariables().indexOf(v);
                            } else if (v.getId().equals(rightOperand)) {
                                posR = symbol_table.getVariables().indexOf(v);
                            }
                        }
                        //Obteniendo el valor de la variable a la derecha para signarlo a la de la izquierda de la expresion
                        Object o = symbol_table.getVariables().get(posR).getValue();
                        symbol_table.getVariables().get(posL).setValue(o);
                        switch (typeLeft) {
                            case "integer":
                                generatedCode += "i32 " + o.toString() + ", i32* %" + leftOperand + "\n";
                                break;
                            case "character":
                                generatedCode += "i8 " + (int) o.toString().charAt(0) + ", i8* %" + leftOperand + "\n";
                                break;
                            case "string":
                                int size = o.toString().length();
                                generatedCode += "[" + size + " x i8] c\"" + o.toString().substring(1, o.toString().length() - 2) + "\\00\", [\"+size+\" x i8]* %" + leftOperand + "\n";
                                break;
                            case "boolean":
                                generatedCode += "i1 " + o.toString().toLowerCase() + ", i1* %" + leftOperand + "\n";
                                break;
                            default:
                                break;
                        }
                        System.out.println(generatedCode);
                    }
                } else if (leftIsDeclared) {
                    System.out.println("variable a la izquierda esta declarada");
                    String typeLeft = "";
                    int posVariable = -1;
                    //Obteniendo el tipo de la variable
                    for (Variable v : symbol_table.getVariables()) {
                        if (v.getId().equals(leftOperand)) {
                            typeLeft = v.getType();
                            posVariable = symbol_table.getVariables().indexOf(v);
                            break;
                        }
                    }
                    if (typeLeft.equalsIgnoreCase("integer")) {
                        try {
                            //Obteniendo el valor de la derecha siendo este un entero
                            int rightOperandValue = Integer.parseInt(rightOperand);
                            symbol_table.getVariables().get(posVariable).setValue(rightOperandValue);
                            generatedCode += "i32 " + rightOperandValue + ", i32* %" + leftOperand + "\n";

                        } catch (NumberFormatException e) {
                            validateSemantics = false;
                            String typeRight = "";
                            if (rightOperand.equalsIgnoreCase("true") || rightOperand.equalsIgnoreCase("false")) {
                                typeRight = "Boolean";
                            } else if (rightOperand.length() > 1) {
                                typeRight = "String";
                            } else if (rightOperand.length() == 1) {
                                typeRight = "Character";
                            }
                            System.out.println(error_color + "Error semántico en la fila " + ctx.getStart().getLine() + ", columna " + ctx.getStart().getCharPositionInLine() + ": " + ctx.getText() + ". No hay manera explícita de asignar un valor de tipo " + typeRight + " a una variable de tipo " + typeLeft);
                            return null;
                        }
                    } else if (typeLeft.equalsIgnoreCase("character")) {
                        if (rightOperand.length() != 3) {
                            validateSemantics = false;
                            System.out.println(error_color + "Error semántico. No hay manera explicita de asignar un valor del tipo ingresado a una variable de tipo Character");
                            return null;
                        } else {
                            char rightOperandValue = rightOperand.charAt(1);
                            symbol_table.getVariables().get(posVariable).setValue(rightOperandValue);
                            generatedCode += "i8 " + (int) rightOperandValue + ", i8* %" + leftOperand + "\n";
                            System.out.println("Expresion de asignacion valida");
                        }
                    } else if (typeLeft.equalsIgnoreCase("boolean")) {
                        if (rightOperand.equalsIgnoreCase("true") || rightOperand.equalsIgnoreCase("false")) {
                            boolean rightOperandValue = Boolean.valueOf(rightOperand.toLowerCase());
                            symbol_table.getVariables().get(posVariable).setValue(rightOperandValue);
                            generatedCode += "i1 " + rightOperandValue + ", i1* %" + leftOperand + "\n";
                            System.out.println("Expresion de asignacion valida");
                        } else {
                            validateSemantics = false;
                            System.out.println(error_color + "Error semántico. No hay manera explicita de asignar un valor del tipo ingresado a una variable de tipo Boolean");
                            return null;
                        }
                    } else if (typeLeft.equalsIgnoreCase("string")) {
                        if ((rightOperand.charAt(0) == '"') && (rightOperand.charAt(rightOperand.length() - 1) == '"')) {
                            String rightOperandValue = rightOperand.substring(1, rightOperand.length() - 2);
                            symbol_table.getVariables().get(posVariable).setValue(rightOperandValue);
                            int size = rightOperandValue.length();
                            generatedCode += "[" + size + " x i8] c\"" + rightOperandValue + "\\00\", [\"+size+\" x i8]* %" + leftOperand + "\n";
                            System.out.println("Expresion de comparacion valida");
                        } else {
                            validateSemantics = false;
                            System.out.println(error_color + "Error semántico. No hay manera explicita de asignar un valor del tipo ingresado a una variable de tipo String");
                            return null;
                        }
                    }
                }
                if (!generatedCode.equals("store ")){
                    generatedStatements[i] = generatedCode;
                    System.out.println("-------\n"+generatedCode+"-><-");
                }
                i++;
            }
        }
        return generatedStatements;
    }


    public boolean validarDeclaracionVariables(String variableName) {
        ArrayList<Variable> symbolTableVariables = symbol_table.getVariables();
        for (int i = 0; i < symbolTableVariables.size(); i++) {
            if (symbolTableVariables.get(i).getId().equals(variableName)) {
                return true;
            }
        }
        return false;
    }

    public String obtainVariableType(String variableName) {
        ArrayList<Variable> symbolTableVariables = symbol_table.getVariables();
        for (int i = 0; i < symbolTableVariables.size(); i++) {
            if (symbolTableVariables.get(i).getId().equals(variableName)) {
                return symbolTableVariables.get(i).getType();
            }
        }
        return "";
    }

    public boolean validarDeclaracionFunciones(String functionName) {
        ArrayList<Function> symbolTableFunctions = symbol_table.getFunctions();
        for (int i = 0; i < symbolTableFunctions.size(); i++) {
            if (symbolTableFunctions.get(i).getId().equals(functionName)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Parameter> obtainFunctionParameters(String functionName) {
        ArrayList<Function> symbolTableFunctions = symbol_table.getFunctions();
        for (int i = 0; i < symbolTableFunctions.size(); i++) {
            if (symbolTableFunctions.get(i).getId().equals(functionName)) {
                return symbolTableFunctions.get(i).getParameters();
            }
        }
        return null;
    }

    public boolean validarDeclaracionProcedimientos(String procedureName) {
        ArrayList<Procedure> symbolTableProcedures = symbol_table.getProcedures();
        for (int i = 0; i < symbolTableProcedures.size(); i++) {
            if (symbolTableProcedures.get(i).getId().equals(procedureName)) {
                return true;
            }
        }
        return false;
    }

    public ArrayList<Parameter> obtainProcedureParameters(String procedureName) {
        ArrayList<Procedure> symbolTableProcedures = symbol_table.getProcedures();
        for (int i = 0; i < symbolTableProcedures.size(); i++) {
            if (symbolTableProcedures.get(i).getId().equals(procedureName)) {
                return symbolTableProcedures.get(i).getParameters();
            }
        }
        return null;
    }

    public boolean isNumber(String cadena) {
        try {
            Integer.parseInt(cadena);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean isBoolean(String cadena) {
        if (cadena.equals("true") || cadena.equals("false")) {
            return true;
        }
        return false;
    }

    public boolean isChar(String cadena) {
        if (cadena.length() != 3) {
            return false;
        }

        if (cadena.charAt(0) != '\'' || cadena.charAt(2) != '\'') {
            return false;
        }

        char character = cadena.charAt(0);
        if (!(character >= 33 && character <= 126)) {
            return false;
        }

        return true;
    }

    public boolean isString(String cadena) {
        if (cadena.length() < 2) {
            return false;
        }

        if (cadena.charAt(0) != '\'' || cadena.charAt(cadena.length() - 1) != '\'') {
            return false;
        }

        return true;
    }

    public void AddIdType(String ID, String VariableType) {
        types.put(ID, VariableType);
    }

    public String getDataType(String ID) {
        String type = types.get(ID);
        if (type != null) {
            return type;
        }
        return "null";
    }

    public boolean validateDataType(String ID, Variable assignedValue) {
        String typeID = getDataType(ID);
        String assignedValueType = assignedValue.getType();
        return typeID.equals(assignedValueType);
    }
}
