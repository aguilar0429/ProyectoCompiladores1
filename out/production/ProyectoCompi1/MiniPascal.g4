grammar MiniPascal;

options { caseInsensitive = true; }

program
   : programHeading (INTERFACE)? block DOT EOF
   ;

programHeading
   : PROGRAM identifier (L_PAREN identifierList R_PAREN)? SEMICOLON
   | UNIT identifier SEMICOLON
   ;

identifier
   : ID
   ;

block
   : (labelDeclarationPart | constantDefinitionPart | typeDefinitionPart | variableDeclarationPart | procedureAndFunctionDeclarationPart | usesUnitsPart | IMPLEMENTATION)* compoundStatement
   ;

usesUnitsPart
   : USES identifierList SEMICOLON
   ;

labelDeclarationPart
   : LABEL label (COMMA label)* SEMICOLON
   ;

label
   : unsignedInteger
   ;

constantDefinitionPart
   : CONST (constantDefinition SEMICOLON) +
   ;

constantDefinition
   : identifier EQUAL constant
   ;

constantChr
   : CHR L_PAREN unsignedInteger R_PAREN
   ;

constant
   : unsignedNumber
   | sign unsignedNumber
   | identifier
   | sign identifier
   | string
   | constantChr
   ;

unsignedNumber
   : unsignedInteger
   ;

unsignedInteger
   : NUM_INT
   ;

sign
   : PLUS
   | MINUS
   ;

bool_
   : TRUE
   | FALSE
   ;

string
   : STRING_LITERAL
   ;

typeDefinitionPart
   : TYPE (typeDefinition SEMICOLON) +
   ;

typeDefinition
   : identifier EQUAL (type_ | functionType | procedureType)
   ;

functionType
   : FUNCTION (formalParameterList)? COLON resultType
   ;

procedureType
   : PROCEDURE (formalParameterList)?
   ;

type_
   : simpleType
   | structuredType
   ;

simpleType
   : scalarType
   | subrangeType
   | typeIdentifier
   | stringtype
   ;

scalarType
   : L_PAREN identifierList R_PAREN
   ;

subrangeType
   : constant DOUBLE_DOT constant
   ;

typeIdentifier
   : identifier
   | (CHAR | BOOLEAN | INTEGER | STRING)
   ;

structuredType
   : PACKED unpackedStructuredType
   | unpackedStructuredType
   ;

unpackedStructuredType
   : arrayType
   | recordType
   | setType
   ;

stringtype
   : STRING L_BRACK (identifier | unsignedNumber) R_BRACK
   ;

arrayType
   : ARRAY L_BRACK typeList R_BRACK OF componentType
   ;

typeList
   : indexType (COMMA indexType)*
   ;

indexType
   : simpleType
   ;

componentType
   : type_
   ;

recordType
   : RECORD fieldList? END
   ;

fieldList
   : fixedPart (SEMICOLON variantPart)?
   | variantPart
   ;

fixedPart
   : recordSection (SEMICOLON recordSection)*
   ;

recordSection
   : identifierList COLON type_
   ;

variantPart
   : CASE tag OF variant (SEMICOLON variant)*
   ;

tag
   : identifier COLON typeIdentifier
   | typeIdentifier
   ;

variant
   : constList COLON L_PAREN fieldList R_PAREN
   ;

setType
   : SET OF baseType
   ;

baseType
   : simpleType
   ;

variableDeclarationPart
   : VAR variableDeclaration (SEMICOLON variableDeclaration)* SEMICOLON
   ;

variableDeclaration
   : identifierList COLON type_
   ;

procedureAndFunctionDeclarationPart
   : procedureOrFunctionDeclaration SEMICOLON
   ;

procedureOrFunctionDeclaration
   : procedureDeclaration
   | functionDeclaration
   ;

procedureDeclaration
   : PROCEDURE identifier (formalParameterList)? SEMICOLON block
   ;

formalParameterList
   : L_PAREN formalParameterSection (SEMICOLON formalParameterSection)* R_PAREN
   ;

formalParameterSection
   : parameterGroup
   | VAR parameterGroup
   | FUNCTION parameterGroup
   | PROCEDURE parameterGroup
   |
   ;

parameterGroup
   : identifierList COLON typeIdentifier
   ;

identifierList
   : identifier (COMMA identifier)*
   ;

constList
   : constant (COMMA constant)*
   ;

functionDeclaration
   : FUNCTION identifier (formalParameterList)? COLON resultType SEMICOLON block
   ;

resultType
   : typeIdentifier
   ;

statement
   : label COLON unlabelledStatement
   | writeStatement
   | readStatement
   | unlabelledStatement
   ;

writeStatement
    : WRITE L_PAREN writeArguments R_PAREN
    | WRITELN L_PAREN writeArguments R_PAREN
    ;

readStatement
   : READ L_PAREN readArguments R_PAREN
   | READLN L_PAREN readArguments R_PAREN
   ;

writeArguments
    : expression (COMMA expression)*
    ;

readArguments
    : variable (COMMA variable)*
    ;

unlabelledStatement
   : simpleStatement
   | structuredStatement
   ;

simpleStatement
   : assignmentStatement
   | procedureStatement
   | emptyStatement_
   ;

assignmentStatement
   : variable ASSIGN expression
   ;

variable
   : (AT identifier | identifier) (L_BRACK expression (COMMA expression)* R_BRACK | DOT identifier)*
   ;

expression
   : simpleExpression (relationaloperator expression)?
   ;

relationaloperator
   : EQUAL
   | NOT_EQUAL
   | LT
   | LE
   | GE
   | GT
   ;

simpleExpression
   : term (additiveoperator simpleExpression)?
   ;

additiveoperator
   : PLUS
   | MINUS
   | OR
   ;

term
   : signedFactor (multiplicativeoperator term)?
   ;

multiplicativeoperator
   : MULT
   | SLASH // CONSULTAR
   | DIV
   | MOD
   | AND
   ;

signedFactor
   : (PLUS | MINUS)? factor
   ;

factor
   : variable
   | L_PAREN expression R_PAREN
   | functionDesignator
   | unsignedConstant
   | set_
   | NOT factor
   | bool_
   ;

unsignedConstant
   : unsignedNumber
   | constantChr
   | string
   | NIL
   ;

functionDesignator
   : identifier L_PAREN parameterList R_PAREN
   ;

parameterList
   : actualParameter (COMMA actualParameter)*
   ;

set_
   : L_BRACK elementList R_BRACK
   ;

elementList
   : element (COMMA element)*
   |
   ;

element
   : expression (DOUBLE_DOT expression)?
   ;

procedureStatement
   : identifier (L_PAREN parameterList R_PAREN)?
   ;

actualParameter
   : expression parameterwidth*
   ;

parameterwidth
   : COLON expression
   ;

emptyStatement_
   :
   ;

structuredStatement
   : compoundStatement
   | conditionalStatement
   | repetetiveStatement
   ;

compoundStatement
   : BEGIN statements END
   ;


statements
   : statement (SEMICOLON statement)*
   ;

conditionalStatement
   : ifStatement
   ;

ifStatement
   : IF expression THEN statement (: ELSE statement)?
   ;

repetetiveStatement
   : compoundWhileStatement
   | whileStatement
   | repeatStatement

   | forStatement
   ;

compoundWhileStatement
   : WHILE expression DO compoundStatement
   ;

whileStatement
   : WHILE expression DO statement
   ;

repeatStatement
   : REPEAT statements UNTIL expression
   ;

compoundForStatement
    : FOR identifier ASSIGN forList DO compoundStatement
    ;

forStatement
   : FOR identifier ASSIGN forList DO statement
   | BEGIN forStatement END
   ;


forList
   : initialValue (TO | DOWNTO) finalValue
   ;

initialValue
   : expression
   ;

finalValue
   : expression
   ;

AND: 'AND'; //YA ESTA

ARRAY: 'ARRAY'; //YA ESTA

BEGIN: 'begin'; //YA ESTA

BOOLEAN: 'BOOLEAN'; //YA ESTA

CASE: 'CASE';

CHAR: 'CHAR';

CHR: 'CHR';

CONST: 'CONST';

DIV: 'DIV';

DO: 'do';

DOWNTO: 'downto';

ELSE: 'else';

END: 'end';

FOR: 'for';

FUNCTION: 'function';

IF: 'if';

INTEGER: 'INTEGER';

LABEL: 'LABEL';

MOD: 'mod';

NIL: 'NIL';

NOT: 'NOT';

OF: 'OF';

OR: 'OR';

PACKED: 'PACKED';

PROCEDURE: 'PROCEDURE';

PROGRAM: 'program';

RECORD: 'RECORD';

REPEAT: 'repeat';

SET: 'SET';

THEN: 'then';

TO: 'to';

TYPE: 'TYPE';

UNTIL: 'until';

VAR: 'var';

WHILE: 'while';

PLUS: '+';

MINUS: '-';

MULT: '*';

SLASH: '/';

ASSIGN: ':=';

COMMA: ',';

SEMICOLON: ';';

COLON: ':';

EQUAL: '=';

NOT_EQUAL: '<>';

LT: '<';

LE: '<=';

GE: '>=';

GT: '>';

L_PAREN: '(';

R_PAREN: ')';

L_BRACK: '[';

R_BRACK: ']';

AT: '@';

DOT: '.';

DOUBLE_DOT: '..';

LCURLY: '{';

RCURLY: '}';

UNIT: 'UNIT';

INTERFACE: 'INTERFACE';

USES: 'USES';

STRING: 'STRING';

IMPLEMENTATION: 'IMPLEMENTATION';

TRUE: 'true';

FALSE: 'false';

WS: [ \t\n\r] -> skip;

COMMENT: '{' .*? '}' -> skip;

ID: [a-z][a-z0-9_]*;

STRING_LITERAL: '\'' ('\'\'' | ~('\''))* '\'';

NUM_INT: [0-9]+;

READLN: 'READLN';

READ: 'READ';

WRITELN: 'WRITELN';

WRITE: 'WRITE';