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
// |O|  Read y Write: Lectura y escritura de variables.
// | |  Funciones: Declaracion y uso de funciones con valores o referencias. Tambien recursividad.
// |O|  Main: Funcion principal.
// |X|  Manejo de errores: Errores lexicos.
// | |  Ciclos: Ciclos for while repeat y if.

//BUGS A ARREGLAR:
// | | al instanciar variables, no se puede hacer algo como 5-9, porque agarra el -9 como realnum. Por ahora solo se puede hacer 5- 9.
// | | No estoy seguro de como se deben comportar los \n y demas caracteres de escape en las cadenas.

// COSAS A CONSIDERAR PARA CUANDO HAGAMOS EL ANALISIS SEMANTICO:
// | | No se pueden declarar variables con el mismo nombre que otra variable o funcion.
// | | Asignacion de variables con tipos incompatibles.
// | | Strings deben tener un maximo de 255 caracteres.

program: program_block EOF;

program_block: PROGRAM ID ';'
    var_block? //Bloque de Variables globales
    function_block? //Bloque de Funciones
    BEGIN instr+ END '.'//Este seria el main
    ;

//------------------------------------------------------FUNCIONES-------------------------------------------------------

//BLOCK DE FUNCIONES
function_block
    : (FUNCTION ID '(' (function_var_decl (';' function_var_decl)*)? ')' ':' var_type ';'
        var_block? //Bloque de Variables locales
        BEGIN
            instr+
        END ';' // puse el begin y end entre punto y coma afuera para poder utilizar function_body en otras cosas como el main
      )+
    ;

function_call
    : ID '(' (expr (',' expr)*)? ')' ';'
    ;

function_var_decl
    : ID (',' ID)* ':' var_type
    | ID (',' ID)* ':' ARRAY '[' size (',' size)? ']' OF array_type
    | ID (',' ID)* ':' const_type
    ;


//------------------------------------------------------INSTRUCCIONES-------------------------------------------------------
instr
    : var_init
    | function_call
    | read_call
    | write_call
    | for_loop
    //demas instrucciones que se puedan ejecutar como if, while, repeat, etc
    ;

//-----------------------------------------------READS Y WRITES-------------------------------------------------

read_call
    : READ '(' ID ')' ';'
    ;

write_call
    : WRITE '(' CONST_VAL (',' (math_expr|STR|ID))? ')' ';' //Integer, char o string.
    ;

//-----------------------------------------------CICLOS Y CONDICIONALES-------------------------------------------------

//CICLO FOR
//Fors que ejecutan mas de una instruccion deben ir entre begin y end
for_loop
    : FOR ID ':=' expr TO expr DO (BEGIN instr+ END ';' | instr)
    | FOR ID ':=' expr DOWNTO expr DO (BEGIN instr+ END ';' | instr)
    ;


//------------------------------------------------------VARIABLES-------------------------------------------------------
//BLOCK DE VARIABLES CON UN SOLO VAR Y VARIAS DECLARACIONES
var_block
    : VAR (var_decl)+
    ;

//DECLARACION DE VARIABLES DENTRO DE UN BLOQUE
var_decl
    : ID ':' var_type ':=' expr ';'//Probe en un compilador de pascal y no se puede asignar valor a mas de una variable a la vez
    | ID (',' ID)* ':' var_type ';'
    | ID (',' ID)* ':' ARRAY '[' size (',' size)? ']' OF array_type ';'
    | ID ':' const_type ':=' CONST_VAL ';'
    | ID (',' ID)* ':' const_type ';'
    //Puse las demas opciones comentadas ya que pienso que son parte del analisis semantico, no del analisis sintactico
    //| ID (',' ID)* ':' STRING ':=' STR ';'
    //| ID (',' ID)*  INTEGER ':=' REALNUM ';'
    //| ID ':' ARRAY '[' REALNUM '..' REALNUM ']' OF var_type ';'
    //| ID (',' ID)* ':' CHARACTER ':=' CHAR ';'
    //| ID (',' ID)* ':' BOOLEAN ':=' BOOL_VAL ';'
    // ID ':' var_type ':=' expr ';'
    ;

//INICIALIZACION DE VARIABLES
var_init
    : ID ':=' expr ';'
    | ID '[' math_expr (',' math_expr)? ']' ':=' expr ';'
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
    : ID '[' math_expr (',' math_expr)? ']'
    ;

const_type
    : CONSTCHAR
    | CONSTSTR
    ;

//------------------------------------------------------EXPRESIONES------------------------------------------------------
expr
    : math_expr
    | bool_expr
    | ID
    | STR
    ;

math_expr
    : '(' math_expr ')'
    | math_expr '*' math_expr
    | math_expr '/' math_expr
    | math_expr DIV math_expr
    | math_expr MOD math_expr
    | math_expr '+' math_expr
    | math_expr '-'math_expr
    | DECIMAL
    | REALNUM
    | array_ID
    | ID
    ;

bool_expr
    : bool_expr 'AND' bool_expr
    | bool_expr 'OR' bool_expr
    | 'NOT' bool_expr
    | '(' bool_expr ')'
    | math_expr '>' math_expr
    | math_expr '<' math_expr
    | math_expr '>=' math_expr
    | math_expr '<=' math_expr
    | math_expr '=' math_expr
    | math_expr '<>' math_expr
    | BOOL_VAL
    | array_ID
    | ID
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
CONST_VAL   : '\'' (ESC | ~["\\])* '\'' ;
ID      : [a-z][A-Z0-9_]*;
BOOL_VAL: TRUE | FALSE;
TRUE: 'true';
FALSE: 'false';
NEWLINE : [\r\n]+ -> skip;
STR     : '"' (ESC | ~["\\])* '"' ;
ESC     : '\\"'  | '\\\\' | '\\t' | '\\n' | '\\r';
//COMMENT : '{' .*? '}' -> skip; //Esta version permitia tener '{' dentro de los comentarios pero no '}'.
COMMENT : '{' ~[{}]* '}' -> skip;

LETTER  : [A-Z]+;

size    : math_expr '..' math_expr;


//NUMBERS
REALNUM   : ('-'? DIGIT | DIGIT) ;
DECIMAL     : REALNUM '.' DIGIT ;
DIGIT     : [0-9]+;

WS      : (' ' | '\t' | '\n' | '\r')+ -> skip;