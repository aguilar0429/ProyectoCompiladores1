grammar MiniPascal;

options {
    caseInsensitive = true;
}
// |X| == Hecho
// |O| == Medio hecho, ocupa pruebas/modificaciones
// | | == No hecho

//TO DO:
// |X|  Comentarios { }: No anidadados y extendibles a varias lineas incluyendo el salto de linea
// |X|  Variables: Declaracion de variables tipo entero, caracter, booleano y cadena hasta de 2 dimensiones. Tambien constantes. Lexcema :=
// |X|  Operadores: Aritmeticos, relacionales y logicos.
// |X|  Read y Write: Lectura y escritura de variables.
// |X|  Funciones: Declaracion y uso de funciones con valores o referencias. Tambien recursividad.
// |X|  Main: Funcion principal.
// |X|  Manejo de errores: Errores lexicos.
// |X|  Ciclos: Ciclos for while repeat y if.


//BUGS A ARREGLAR:
// |X| al instanciar variables, no se puede hacer algo como 5-9, porque agarra el -9 como realnum. Por ahora solo se puede hacer 5- 9.
// |O| No estoy seguro de como se deben comportar los \n y demas caracteres de escape en las cadenas.
// |X| En las condicionales (if) como no contiene begin y end, no se como cerrar el bloque.


// COSAS A CONSIDERAR PARA CUANDO HAGAMOS EL ANALISIS SEMANTICO:
// | | No se pueden declarar variables con el mismo nombre que otra variable o funcion.
// | | Asignacion de variables con tipos incompatibles.
// | | Strings deben tener un maximo de 255 caracteres.

program: program_block EOF ;

program_block: PROGRAM ID SEMICOLON
    var_block? //Bloque de Variables globales
    function_block? //Bloque de Funciones
    BEGIN instr+ END PERIOD//Este seria el main

    ;
//    expr #program_blockSingle;

//------------------------------------------------------FUNCIONES-------------------------------------------------------

//BLOCK DE FUNCIONES
function_block
    : (FUNCTION ID LEFTPAREN (function_var_decl (SEMICOLON function_var_decl)*)? RIGHTPAREN COLON var_type SEMICOLON
        var_block? //Bloque de Variables locales
        BEGIN
            instr+
        END SEMICOLON // puse el begin y end entre punto y coma afuera para poder utilizar function_body en otras cosas como el main
      )+

    ;

function_call
    : ID LEFTPAREN (expr (COMMA expr)*)? RIGHTPAREN SEMICOLON
    ;

function_var_decl
    : ID (COMMA ID)* COLON var_type
    | ID (COMMA ID)* COLON ARRAY LEFTBRACKET size (COMMA size)? RIGHTBRACKET OF array_type
    | ID (COMMA ID)* COLON const_type
    ;


//------------------------------------------------------INSTRUCCIONES-------------------------------------------------------
instr
    : var_init
    | function_call
    | read_call
    | write_call
    | for_loop
    | while_loop
    | repeat_loop
    | if_statement

    //demas instrucciones que se puedan ejecutar como if, while, repeat, etc
    ;

//-----------------------------------------------READS Y WRITES-------------------------------------------------

read_call
    : READ LEFTPAREN ID RIGHTPAREN SEMICOLON
    ;

write_call
    : WRITELN LEFTPAREN (CONST_VAL) (COMMA (expr|STR|ID))? RIGHTPAREN SEMICOLON
    | WRITE LEFTPAREN (CONST_VAL) (COMMA (expr|STR|ID))? RIGHTPAREN SEMICOLON
    ;

//-----------------------------------------------CICLOS Y CONDICIONALES-------------------------------------------------

//CICLO FOR
//Fors que ejecutan mas de una instruccion deben ir entre begin y end
for_loop
    : FOR ID ASSIGN expr TO expr DO (instr)
    | FOR ID ASSIGN expr TO expr DO (BEGIN instr+ END SEMICOLON)
    | FOR ID ASSIGN expr DOWNTO expr DO (instr)
    | FOR ID ASSIGN expr DOWNTO expr DO (BEGIN instr+ END SEMICOLON)
    ;

if_condition
    : expr (logical_opr expr)*
    ;

while_loop
    : WHILE LEFTPAREN if_condition RIGHTPAREN DO instr SEMICOLON
    | WHILE LEFTPAREN if_condition RIGHTPAREN DO (BEGIN instr+ END SEMICOLON)
    ;

repeat_loop
    : REPEAT instr+ UNTIL if_condition SEMICOLON
    ;

if_statement
    : IF LEFTPAREN if_condition RIGHTPAREN THEN instr else_if* else_statement?
    | IF LEFTPAREN if_condition RIGHTPAREN THEN (BEGIN instr+ END SEMICOLON) else_if* else_statement?
    ;

else_if
    : ELSEIF LEFTPAREN if_condition RIGHTPAREN THEN (instr)
    | ELSEIF LEFTPAREN if_condition RIGHTPAREN THEN (BEGIN instr+ END SEMICOLON)
    ;

else_statement
    : ELSE (instr)
    | ELSE (BEGIN instr+ END SEMICOLON)
    ;


//------------------------------------------------------VARIABLES-------------------------------------------------------
//BLOCK DE VARIABLES CON UN SOLO VAR Y VARIAS DECLARACIONES
var_block
    : VAR (var_decl)+
    ;

//DECLARACION DE VARIABLES DENTRO DE UN BLOQUE
var_decl
    : ID COLON var_type ASSIGN expr SEMICOLON     //Probe en un compilador de pascal y no se puede asignar valor a mas de una variable a la vez
    | ID (COMMA ID)* COLON var_type SEMICOLON
    | ID (COMMA ID)* COLON ARRAY LEFTBRACKET size (COMMA size)? RIGHTBRACKET OF array_type SEMICOLON
    | ID COLON const_type ASSIGN CONST_VAL SEMICOLON
    | ID (COMMA ID)* COLON const_type SEMICOLON
    ;

//INICIALIZACION DE VARIABLES
var_init
    : ID ASSIGN expr SEMICOLON
    | ID LEFTBRACKET expr (COMMA expr)? RIGHTBRACKET ASSIGN expr SEMICOLON
    ;

//TIPOS DE VARIABLES`
var_type
    : INTEGER
    | CHARACTER
    | BOOLEAN
    | STRING
    ;

array_type
    : INTEGER
    | CHARACTER
    | BOOLEAN
    ;

array_ID
    : ID LEFTBRACKET expr (COMMA expr)? RIGHTBRACKET
    ;

const_type
    : CONSTCHAR
    | CONSTSTR
    ;

//------------------------------------------------------EXPRESIONES------------------------------------------------------
expr
    : LEFTPAREN expr RIGHTPAREN
    | expr (ASTERISK | SLASH | DIV | MOD) expr
    | MINUS expr
    | expr (PLUS | MINUS) expr
    | expr comparison expr
    | expr logical_opr expr
    | NOT expr
    | DECIMAL
    | DIGIT
    | STR
    | array_ID
    | ID
    ;

size    : expr '..' expr   ;

comparison
    : MAYORQUE
    | MENORQUE
    | MAYORIGUAL
    | MENORIGUAL
    | IGUAL
    | DISTINTO
    ;

logical_opr
    : AND
    | OR
    ;


//----------------------------------------------RESERVADAS Y PALABRAS---------------------------------------------------

//PALABRAS RESERVADAS
AND: 'and';
ARRAY: 'array';
BEGIN: 'begin';
CASE: 'case';
CONST: 'const';
DIV: 'div';
DO: 'do';
DOWNTO: 'downto';
ELSE: 'else';
ELSEIF: 'elseif';
END: 'end';
FILE: 'file';
FOR: 'for';
FUNCTION: 'function';
GOTO: 'goto';
IF: 'if';
IN: 'in';
LABEL: 'label';
MOD: 'mod';
NIL: 'nil';
NOT: 'not';
OR: 'or';
OF: 'of';
PACKED: 'packed';
PROCEDURE: 'procedure';
PROGRAM: 'program';
READ: 'read';
RECORD: 'record';
REPEAT: 'repeat';
SET: 'set';
THEN: 'then';
TO: 'to';
TYPE: 'type';
UNTIL: 'until';
VAR: 'var';
WHILE: 'while';
WRITE: 'write';
WRITELN: 'writeln';
WITH: 'with';

//TIPOS DE DATOS
INTEGER: 'INTEGER';
FLOAT: 'float';
CHARACTER: 'CHARACTER';
BOOLEAN: 'BOOLEAN';
STRING: 'STRING';
CONSTCHAR: 'CONSTCHAR';
CONSTSTR: 'CONSTSTR';


//BUILDING BLOCKS
//CHAR    : '\'' . '\'' ;
CONST_VAL : '\'' (ESC | ~['\\])+ '\'' ;

ID      : [a-z][A-Z0-9_]*;

PERIOD  : '.';
COMMA   : ',';
COLON   : ':';
SEMICOLON : ';';
LEFTPAREN : '(';
RIGHTPAREN : ')';
LEFTBRACKET : '[';
RIGHTBRACKET : ']';
ASSIGN  : ':=';
PLUS    : '+';
MINUS   : '-';
ASTERISK: '*';
SLASH   : '/';
MAYORQUE : '>';
MENORQUE : '<';
MAYORIGUAL : '>=';
MENORIGUAL : '<=';
IGUAL : '=';
DISTINTO : '<>';


BOOL_VAL: TRUE | FALSE;
TRUE: 'true';
FALSE: 'false';
NEWLINE : [\r\n]+ -> skip;
STR     : '"' (ESC | ~["\\\r\n\t])* '"' ; // Excludes \r, \n, \t from the string content
ESC     : '\\"'  | '\\\\' | '\\t' | '\\n' | '\\r';
//COMMENT : '{' .*? '}' -> skip; //Esta version permitia tener '{' dentro de los comentarios pero no '}'.
COMMENT : '{' ~[{}]* '}' -> skip;

LETTER  : [A-Z]+;

//NUMBERS
DECIMAL   : DIGIT+ '.' DIGIT+;
DIGIT     : [0-9]+;

WS      : (' ' | '\t' | '\n' | '\r')+ -> skip;