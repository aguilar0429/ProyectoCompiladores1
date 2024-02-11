grammar MiniPascal;

//TO DO:
// |X|  Comentarios { }: No anidadados y extendibles a varias lineas incluyendo el salto de linea
// | |  Variables: Declaracion de variables tipo entero, caracter, booleano y cadena hasta de 2 dimensiones. Tambien constantes. Lexcema :=
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

program_block: ID SEMCOLON function_block? ;

var_block
    : VAR (var_decl)+
    ;

var_decl
    : ID (COMMA ID)* COLON var_type SEMCOLON
    // ID COLON var_type ASIGN expr SEMCOLON
    | ID COLON STRING ASIGN STR SEMCOLON
    | ID COLON INTEGER ASIGN REALNUM SEMCOLON
    //| ID ':' ARRAY '[' REALNUM '..' REALNUM ']' OF var_type ';'
    | ID COLON CHARACTER ASIGN CHAR SEMCOLON
    | ID COLON BOOLEAN ASIGN BOOL_VAL SEMCOLON
    | ID COLON ARRAY LBRACKET SIZE RBRACKET OF var_type SEMCOLON
    | ID COLON ARRAY LBRACKET SIZE COMMA SIZE RBRACKET OF var_type SEMCOLON
    ;

var_init
    :
    ID ASIGN expr SEMCOLON
    ;

function_block
    :
    (function_decl)+
    ;

function_decl
    : FUNCTION ID SEMCOLON 'begin' function 'end' SEMCOLON
    ;

function
    : var_block?
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

INTEGER: 'INTEGER';
FLOAT: 'float';
CHARACTER: 'CHARACTER';
BOOLEAN: 'BOOLEAN';
ARRAY: 'ARRAY';
STRING: 'STRING';
CONSTCHAR: 'CONSTCHAR';
CONSTINT: 'CONSTINT';

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
NEWLINE : [\r\n]+ -> skip;
STR     : '"' (ESC | ~["\\])* '"' ;
ESC     : '\\"'  | '\\\\' | '\\t' | '\\n' | '\\r';
COMMENT : LCURVY .*? RCURVY -> skip;
LETTER  : [A-Z]+;

SIZE    : REALNUM '..' REALNUM;

//NUMBERS
REALNUM   : (HYPHEN? DIGIT | DIGIT) ;
DECIMAL     : REALNUM '.' DIGIT ;
DIGIT     : [0-9]+;

WS      : (' ' | '\t' | '\n' | '\r')+ -> skip;

//SYMBOLS
SEMCOLON    : ';';
COLON       : ':';

LPAREN      : '(';
RPAREN      : ')';

LBRACKET    : '[';
RBRACKET    : ']';

LCURVY      : '{';
RCURVY      : '}';

COMMA       : ',';
HYPHEN      : '-';

ASIGN       : ':=';