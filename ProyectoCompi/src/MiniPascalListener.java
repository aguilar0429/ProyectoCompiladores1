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
	 * Enter a parse tree produced by {@link MiniPascalParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void enterProgramHeading(MiniPascalParser.ProgramHeadingContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#programHeading}.
	 * @param ctx the parse tree
	 */
	void exitProgramHeading(MiniPascalParser.ProgramHeadingContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void enterIdentifier(MiniPascalParser.IdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#identifier}.
	 * @param ctx the parse tree
	 */
	void exitIdentifier(MiniPascalParser.IdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(MiniPascalParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(MiniPascalParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void enterUsesUnitsPart(MiniPascalParser.UsesUnitsPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#usesUnitsPart}.
	 * @param ctx the parse tree
	 */
	void exitUsesUnitsPart(MiniPascalParser.UsesUnitsPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterLabelDeclarationPart(MiniPascalParser.LabelDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#labelDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitLabelDeclarationPart(MiniPascalParser.LabelDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#label}.
	 * @param ctx the parse tree
	 */
	void enterLabel(MiniPascalParser.LabelContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#label}.
	 * @param ctx the parse tree
	 */
	void exitLabel(MiniPascalParser.LabelContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinitionPart(MiniPascalParser.ConstantDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#constantDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinitionPart(MiniPascalParser.ConstantDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void enterConstantDefinition(MiniPascalParser.ConstantDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#constantDefinition}.
	 * @param ctx the parse tree
	 */
	void exitConstantDefinition(MiniPascalParser.ConstantDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void enterConstantChr(MiniPascalParser.ConstantChrContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#constantChr}.
	 * @param ctx the parse tree
	 */
	void exitConstantChr(MiniPascalParser.ConstantChrContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void enterConstant(MiniPascalParser.ConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#constant}.
	 * @param ctx the parse tree
	 */
	void exitConstant(MiniPascalParser.ConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedNumber(MiniPascalParser.UnsignedNumberContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#unsignedNumber}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedNumber(MiniPascalParser.UnsignedNumberContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedInteger(MiniPascalParser.UnsignedIntegerContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#unsignedInteger}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedInteger(MiniPascalParser.UnsignedIntegerContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void enterSign(MiniPascalParser.SignContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#sign}.
	 * @param ctx the parse tree
	 */
	void exitSign(MiniPascalParser.SignContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#bool_}.
	 * @param ctx the parse tree
	 */
	void enterBool_(MiniPascalParser.Bool_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#bool_}.
	 * @param ctx the parse tree
	 */
	void exitBool_(MiniPascalParser.Bool_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#string}.
	 * @param ctx the parse tree
	 */
	void enterString(MiniPascalParser.StringContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#string}.
	 * @param ctx the parse tree
	 */
	void exitString(MiniPascalParser.StringContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinitionPart(MiniPascalParser.TypeDefinitionPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#typeDefinitionPart}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinitionPart(MiniPascalParser.TypeDefinitionPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void enterTypeDefinition(MiniPascalParser.TypeDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#typeDefinition}.
	 * @param ctx the parse tree
	 */
	void exitTypeDefinition(MiniPascalParser.TypeDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#functionType}.
	 * @param ctx the parse tree
	 */
	void enterFunctionType(MiniPascalParser.FunctionTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#functionType}.
	 * @param ctx the parse tree
	 */
	void exitFunctionType(MiniPascalParser.FunctionTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void enterProcedureType(MiniPascalParser.ProcedureTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procedureType}.
	 * @param ctx the parse tree
	 */
	void exitProcedureType(MiniPascalParser.ProcedureTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#type_}.
	 * @param ctx the parse tree
	 */
	void enterType_(MiniPascalParser.Type_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#type_}.
	 * @param ctx the parse tree
	 */
	void exitType_(MiniPascalParser.Type_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void enterSimpleType(MiniPascalParser.SimpleTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#simpleType}.
	 * @param ctx the parse tree
	 */
	void exitSimpleType(MiniPascalParser.SimpleTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void enterScalarType(MiniPascalParser.ScalarTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#scalarType}.
	 * @param ctx the parse tree
	 */
	void exitScalarType(MiniPascalParser.ScalarTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void enterSubrangeType(MiniPascalParser.SubrangeTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#subrangeType}.
	 * @param ctx the parse tree
	 */
	void exitSubrangeType(MiniPascalParser.SubrangeTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void enterTypeIdentifier(MiniPascalParser.TypeIdentifierContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#typeIdentifier}.
	 * @param ctx the parse tree
	 */
	void exitTypeIdentifier(MiniPascalParser.TypeIdentifierContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void enterStructuredType(MiniPascalParser.StructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#structuredType}.
	 * @param ctx the parse tree
	 */
	void exitStructuredType(MiniPascalParser.StructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void enterUnpackedStructuredType(MiniPascalParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#unpackedStructuredType}.
	 * @param ctx the parse tree
	 */
	void exitUnpackedStructuredType(MiniPascalParser.UnpackedStructuredTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void enterStringtype(MiniPascalParser.StringtypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#stringtype}.
	 * @param ctx the parse tree
	 */
	void exitStringtype(MiniPascalParser.StringtypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void enterArrayType(MiniPascalParser.ArrayTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#arrayType}.
	 * @param ctx the parse tree
	 */
	void exitArrayType(MiniPascalParser.ArrayTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#typeList}.
	 * @param ctx the parse tree
	 */
	void enterTypeList(MiniPascalParser.TypeListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#typeList}.
	 * @param ctx the parse tree
	 */
	void exitTypeList(MiniPascalParser.TypeListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#indexType}.
	 * @param ctx the parse tree
	 */
	void enterIndexType(MiniPascalParser.IndexTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#indexType}.
	 * @param ctx the parse tree
	 */
	void exitIndexType(MiniPascalParser.IndexTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#componentType}.
	 * @param ctx the parse tree
	 */
	void enterComponentType(MiniPascalParser.ComponentTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#componentType}.
	 * @param ctx the parse tree
	 */
	void exitComponentType(MiniPascalParser.ComponentTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#recordType}.
	 * @param ctx the parse tree
	 */
	void enterRecordType(MiniPascalParser.RecordTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#recordType}.
	 * @param ctx the parse tree
	 */
	void exitRecordType(MiniPascalParser.RecordTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void enterFieldList(MiniPascalParser.FieldListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#fieldList}.
	 * @param ctx the parse tree
	 */
	void exitFieldList(MiniPascalParser.FieldListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void enterFixedPart(MiniPascalParser.FixedPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#fixedPart}.
	 * @param ctx the parse tree
	 */
	void exitFixedPart(MiniPascalParser.FixedPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void enterRecordSection(MiniPascalParser.RecordSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#recordSection}.
	 * @param ctx the parse tree
	 */
	void exitRecordSection(MiniPascalParser.RecordSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void enterVariantPart(MiniPascalParser.VariantPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variantPart}.
	 * @param ctx the parse tree
	 */
	void exitVariantPart(MiniPascalParser.VariantPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#tag}.
	 * @param ctx the parse tree
	 */
	void enterTag(MiniPascalParser.TagContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#tag}.
	 * @param ctx the parse tree
	 */
	void exitTag(MiniPascalParser.TagContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variant}.
	 * @param ctx the parse tree
	 */
	void enterVariant(MiniPascalParser.VariantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variant}.
	 * @param ctx the parse tree
	 */
	void exitVariant(MiniPascalParser.VariantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#setType}.
	 * @param ctx the parse tree
	 */
	void enterSetType(MiniPascalParser.SetTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#setType}.
	 * @param ctx the parse tree
	 */
	void exitSetType(MiniPascalParser.SetTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#baseType}.
	 * @param ctx the parse tree
	 */
	void enterBaseType(MiniPascalParser.BaseTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#baseType}.
	 * @param ctx the parse tree
	 */
	void exitBaseType(MiniPascalParser.BaseTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclarationPart(MiniPascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variableDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclarationPart(MiniPascalParser.VariableDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterVariableDeclaration(MiniPascalParser.VariableDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variableDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitVariableDeclaration(MiniPascalParser.VariableDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void enterProcedureAndFunctionDeclarationPart(MiniPascalParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procedureAndFunctionDeclarationPart}.
	 * @param ctx the parse tree
	 */
	void exitProcedureAndFunctionDeclarationPart(MiniPascalParser.ProcedureAndFunctionDeclarationPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureOrFunctionDeclaration(MiniPascalParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procedureOrFunctionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureOrFunctionDeclaration(MiniPascalParser.ProcedureOrFunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterProcedureDeclaration(MiniPascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procedureDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitProcedureDeclaration(MiniPascalParser.ProcedureDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterList(MiniPascalParser.FormalParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#formalParameterList}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterList(MiniPascalParser.FormalParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void enterFormalParameterSection(MiniPascalParser.FormalParameterSectionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#formalParameterSection}.
	 * @param ctx the parse tree
	 */
	void exitFormalParameterSection(MiniPascalParser.FormalParameterSectionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void enterParameterGroup(MiniPascalParser.ParameterGroupContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#parameterGroup}.
	 * @param ctx the parse tree
	 */
	void exitParameterGroup(MiniPascalParser.ParameterGroupContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void enterIdentifierList(MiniPascalParser.IdentifierListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#identifierList}.
	 * @param ctx the parse tree
	 */
	void exitIdentifierList(MiniPascalParser.IdentifierListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#constList}.
	 * @param ctx the parse tree
	 */
	void enterConstList(MiniPascalParser.ConstListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#constList}.
	 * @param ctx the parse tree
	 */
	void exitConstList(MiniPascalParser.ConstListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDeclaration(MiniPascalParser.FunctionDeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#functionDeclaration}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDeclaration(MiniPascalParser.FunctionDeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#resultType}.
	 * @param ctx the parse tree
	 */
	void enterResultType(MiniPascalParser.ResultTypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#resultType}.
	 * @param ctx the parse tree
	 */
	void exitResultType(MiniPascalParser.ResultTypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(MiniPascalParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void enterWriteStatement(MiniPascalParser.WriteStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#writeStatement}.
	 * @param ctx the parse tree
	 */
	void exitWriteStatement(MiniPascalParser.WriteStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void enterReadStatement(MiniPascalParser.ReadStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#readStatement}.
	 * @param ctx the parse tree
	 */
	void exitReadStatement(MiniPascalParser.ReadStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void enterWriteArguments(MiniPascalParser.WriteArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#writeArguments}.
	 * @param ctx the parse tree
	 */
	void exitWriteArguments(MiniPascalParser.WriteArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#readArguments}.
	 * @param ctx the parse tree
	 */
	void enterReadArguments(MiniPascalParser.ReadArgumentsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#readArguments}.
	 * @param ctx the parse tree
	 */
	void exitReadArguments(MiniPascalParser.ReadArgumentsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void enterUnlabelledStatement(MiniPascalParser.UnlabelledStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#unlabelledStatement}.
	 * @param ctx the parse tree
	 */
	void exitUnlabelledStatement(MiniPascalParser.UnlabelledStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void enterSimpleStatement(MiniPascalParser.SimpleStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#simpleStatement}.
	 * @param ctx the parse tree
	 */
	void exitSimpleStatement(MiniPascalParser.SimpleStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void enterAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#assignmentStatement}.
	 * @param ctx the parse tree
	 */
	void exitAssignmentStatement(MiniPascalParser.AssignmentStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(MiniPascalParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(MiniPascalParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(MiniPascalParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(MiniPascalParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void enterRelationaloperator(MiniPascalParser.RelationaloperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#relationaloperator}.
	 * @param ctx the parse tree
	 */
	void exitRelationaloperator(MiniPascalParser.RelationaloperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void enterSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#simpleExpression}.
	 * @param ctx the parse tree
	 */
	void exitSimpleExpression(MiniPascalParser.SimpleExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void enterAdditiveoperator(MiniPascalParser.AdditiveoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#additiveoperator}.
	 * @param ctx the parse tree
	 */
	void exitAdditiveoperator(MiniPascalParser.AdditiveoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 */
	void enterTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#term}.
	 * @param ctx the parse tree
	 */
	void exitTerm(MiniPascalParser.TermContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void enterMultiplicativeoperator(MiniPascalParser.MultiplicativeoperatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#multiplicativeoperator}.
	 * @param ctx the parse tree
	 */
	void exitMultiplicativeoperator(MiniPascalParser.MultiplicativeoperatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void enterSignedFactor(MiniPascalParser.SignedFactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#signedFactor}.
	 * @param ctx the parse tree
	 */
	void exitSignedFactor(MiniPascalParser.SignedFactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void enterFactor(MiniPascalParser.FactorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#factor}.
	 * @param ctx the parse tree
	 */
	void exitFactor(MiniPascalParser.FactorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void enterUnsignedConstant(MiniPascalParser.UnsignedConstantContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#unsignedConstant}.
	 * @param ctx the parse tree
	 */
	void exitUnsignedConstant(MiniPascalParser.UnsignedConstantContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void enterFunctionDesignator(MiniPascalParser.FunctionDesignatorContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#functionDesignator}.
	 * @param ctx the parse tree
	 */
	void exitFunctionDesignator(MiniPascalParser.FunctionDesignatorContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void enterParameterList(MiniPascalParser.ParameterListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#parameterList}.
	 * @param ctx the parse tree
	 */
	void exitParameterList(MiniPascalParser.ParameterListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#set_}.
	 * @param ctx the parse tree
	 */
	void enterSet_(MiniPascalParser.Set_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#set_}.
	 * @param ctx the parse tree
	 */
	void exitSet_(MiniPascalParser.Set_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#elementList}.
	 * @param ctx the parse tree
	 */
	void enterElementList(MiniPascalParser.ElementListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#elementList}.
	 * @param ctx the parse tree
	 */
	void exitElementList(MiniPascalParser.ElementListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 */
	void enterElement(MiniPascalParser.ElementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#element}.
	 * @param ctx the parse tree
	 */
	void exitElement(MiniPascalParser.ElementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void enterProcedureStatement(MiniPascalParser.ProcedureStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#procedureStatement}.
	 * @param ctx the parse tree
	 */
	void exitProcedureStatement(MiniPascalParser.ProcedureStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void enterActualParameter(MiniPascalParser.ActualParameterContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#actualParameter}.
	 * @param ctx the parse tree
	 */
	void exitActualParameter(MiniPascalParser.ActualParameterContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void enterParameterwidth(MiniPascalParser.ParameterwidthContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#parameterwidth}.
	 * @param ctx the parse tree
	 */
	void exitParameterwidth(MiniPascalParser.ParameterwidthContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void enterEmptyStatement_(MiniPascalParser.EmptyStatement_Context ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#emptyStatement_}.
	 * @param ctx the parse tree
	 */
	void exitEmptyStatement_(MiniPascalParser.EmptyStatement_Context ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void enterStructuredStatement(MiniPascalParser.StructuredStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#structuredStatement}.
	 * @param ctx the parse tree
	 */
	void exitStructuredStatement(MiniPascalParser.StructuredStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void enterCompoundStatement(MiniPascalParser.CompoundStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#compoundStatement}.
	 * @param ctx the parse tree
	 */
	void exitCompoundStatement(MiniPascalParser.CompoundStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(MiniPascalParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(MiniPascalParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void enterConditionalStatement(MiniPascalParser.ConditionalStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#conditionalStatement}.
	 * @param ctx the parse tree
	 */
	void exitConditionalStatement(MiniPascalParser.ConditionalStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void enterIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#ifStatement}.
	 * @param ctx the parse tree
	 */
	void exitIfStatement(MiniPascalParser.IfStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepetetiveStatement(MiniPascalParser.RepetetiveStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#repetetiveStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepetetiveStatement(MiniPascalParser.RepetetiveStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void enterWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#whileStatement}.
	 * @param ctx the parse tree
	 */
	void exitWhileStatement(MiniPascalParser.WhileStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void enterRepeatStatement(MiniPascalParser.RepeatStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#repeatStatement}.
	 * @param ctx the parse tree
	 */
	void exitRepeatStatement(MiniPascalParser.RepeatStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void enterForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#forStatement}.
	 * @param ctx the parse tree
	 */
	void exitForStatement(MiniPascalParser.ForStatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void enterForList(MiniPascalParser.ForListContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#forList}.
	 * @param ctx the parse tree
	 */
	void exitForList(MiniPascalParser.ForListContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void enterInitialValue(MiniPascalParser.InitialValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#initialValue}.
	 * @param ctx the parse tree
	 */
	void exitInitialValue(MiniPascalParser.InitialValueContext ctx);
	/**
	 * Enter a parse tree produced by {@link MiniPascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void enterFinalValue(MiniPascalParser.FinalValueContext ctx);
	/**
	 * Exit a parse tree produced by {@link MiniPascalParser#finalValue}.
	 * @param ctx the parse tree
	 */
	void exitFinalValue(MiniPascalParser.FinalValueContext ctx);
}