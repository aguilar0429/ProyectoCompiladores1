grammar MiniPascal;

options {
    caseInsensitive = true;
}

program: program_block EOF;


//TO DO:
// |X|  Comentarios { }: No anidadados y extendibles a varias lineas incluyendo el salto de linea
// | |  Variables: Declaracion de variables tipo entero, caracter, booleano y cadena hasta de 2 dimensiones. Tambien constantes. Lexcema :=
// | |  Operadores: Aritmeticos, relacionales y logicos.
// | |  Read y Write: Lectura y escritura de variables.
// | |  Funciones: Declaracion y uso de funciones con valores o referencias. Tambien recursividad.
// | |  Main: Funcion principal.
// | |  Manejo de errores: Errores lexicos.
// | |  Ciclos: Ciclos for while repeat y if.


// variable declaration
program_block
    : PROGRAM ID var_block? function_block*? function_decl //Last Function is the main
;

function_block
    :FUNCTION ID '(' (var_decl)* ')' ':' var_type ';' var_block? function_decl
    ;

function_decl
    : 'begin' function 'end'
    ;

function
    : 'function code here'
    ;

var_block
    : VAR (var_decl)+
    ;

var_decl
    : ID (',' ID)* ':' var_type ';'
    | ID ':' var_type ':=' expr ';'
    | ID ':' ARRAY '[' REALNUM '..' REALNUM ']' OF var_type ';'
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
    ;

//OPERADORES
//PLUS: '+';
//MINUS: '-';
//MUL: '*';
//DIV: '/';
//MOD: '%';

//NEQ: '<>';
//EQ: '=';
//LT: '<';
//GT: '>';
//LEQ: '<=';
//GEQ: '>=';

//PALABRAS RESERVADAS
//Aqui hay que poner todas las palabras reservadas que no pueden ser usadas como identificadores

//Tipos de Datos
INTEGER: 'INTEGER';
CHARACTER: 'CHARACTER';
BOOLEAN: 'BOOLEAN';
ARRAY: 'ARRAY';
STRING: 'STRING';
CONSTCHAR: 'CONSTCHAR';
CONSTINT: 'CONSTINT';

//Funciones o Estados
READLN: 'READLN';
READ: 'READ';

WRITELN: 'WRITELN';
WRITE: 'WRITE';

BOOL_VAL: TRUE | FALSE;

TRUE: 'true';
FALSE: 'false';

PROGRAM: 'program';
FUNCTION: 'function';
VAR: 'var';
OF: 'of';

//BUILDING BLOCKS
ID     : [A-Z][A-Z0-9_]*;
NEWLINE : [\r\n]+ -> skip;
STR     : '"' (ESC|.)*? '"';
ESC     : '\\"'  | '\\\\' | '\\t' | '\\n' | '\\r';
COMMENT : '{' .*? '}' -> skip;
LETTER : [A-Z]+;

//NUMBERS
REALNUM   : ('-'? DIGIT | DIGIT) ;
FLOAT     : REALNUM '.' DIGIT ;
DIGIT     : [0-9]+;

WS      : (' ' | '\t' | '\n' | '\r')+ -> skip;