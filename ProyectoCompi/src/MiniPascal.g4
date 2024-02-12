grammar MiniPascal;

//TO DO:
// |X|  Comentarios { }: No anidadados y extendibles a varias lineas incluyendo el salto de linea
// |X|  Variables: Declaracion de variables tipo entero, caracter, booleano y cadena hasta de 2 dimensiones. Tambien constantes. Lexcema :=
// | |  Operadores: Aritmeticos, relacionales y logicos.
// | |  Read y Write: Lectura y escritura de variables.
// | |  Funciones: Declaracion y uso de funciones con valores o referencias. Tambien recursividad.
// | |  Main: Funcion principal.
// | |  Manejo de errores: Errores lexicos.
// | |  Ciclos: Ciclos for while repeat y if.

options {
    caseInsensitive = true;
}

program: PROGRAM program_block EOF;

program_block: ID ';' var_block? function_block? 'begin' (var_init)* (function_decl)* 'end' '.' ;

var_block
    : VAR (var_decl)+
    ;

var_decl
    : ID (',' ID)* ':' var_type ';'
    // ID ':' var_type ':=' expr ';'
    | ID (',' ID)* ':' STRING ':=' STR ';'
    | ID (',' ID)*  INTEGER ':=' REALNUM ';'
    //| ID ':' ARRAY '[' REALNUM '..' REALNUM ']' OF var_type ';'
    | ID (',' ID)* ':' CHARACTER ':=' CHAR ';'
    | ID (',' ID)* ':' BOOLEAN ':=' BOOL_VAL ';'
    | ID (',' ID)* ':' ARRAY '[' SIZE ']' OF var_type ';'
    | ID (',' ID)* ':' ARRAY '[' SIZE ',' SIZE ']' OF var_type ';'
    | ID (',' ID)* ':' const_type ':=' CONST ';'
    ;

var_init
    :
    ID ':=' expr ';'
    ;

function_block
    :
    (function_decl)+
    ;

function_decl
    : FUNCTION ID '(' var_init? var_decl?  ')' ':' var_type ';' 'begin' function 'end' ';'
    ;

function
    : var_init?
    ;

var_type
    : INTEGER
    | CHARACTER
    | BOOLEAN
    | STRING
    ;

expr
    : expr '*' expr
    | expr '/' expr
    | expr '%' expr
    | expr '+' expr
    | expr '-' expr
    | REALNUM
    | DECIMAL
    | STR
    ;

const_type
    : CONSTCHAR
    | CONSTSTR
    ;

INTEGER: 'INTEGER';
FLOAT: 'float';
CHARACTER: 'CHARACTER';
BOOLEAN: 'BOOLEAN';
ARRAY: 'ARRAY';
STRING: 'STRING';
CONSTCHAR: 'CONSTCHAR';
CONSTSTR: 'CONSTSTR';

BOOL_VAL: TRUE | FALSE;

TRUE: 'true';
FALSE: 'false';

PROGRAM: 'program';
FUNCTION: 'function';
VAR: 'var';
OF: 'of';

//BUILDING BLOCKS
ID      : [a-z][A-Z0-9_]*;
CHAR    : '\'' . '\'' ;
CONST   : '\'' (ESC | ~["\\])* '\'' ;
NEWLINE : [\r\n]+ -> skip;
STR     : '"' (ESC | ~["\\])* '"' ;
ESC     : '\\"'  | '\\\\' | '\\t' | '\\n' | '\\r';
COMMENT : '{' .*? '}' -> skip;
LETTER  : [A-Z]+;

SIZE    : REALNUM '..' REALNUM;

//NUMBERS
REALNUM   : ('-'? DIGIT | DIGIT) ;
DECIMAL     : REALNUM '.' DIGIT ;
DIGIT     : [0-9]+;

WS      : (' ' | '\t' | '\n' | '\r')+ -> skip;