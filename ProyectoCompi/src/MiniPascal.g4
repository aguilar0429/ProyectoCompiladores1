grammar MiniPascal;

options {
    caseInsensitive = true;
}

program: var_block EOF;


//TO DO:
// | |  Comentarios { }: No anidadados y extendibles a varias lineas incluyendo el salto de linea
// | |  Variables: Declaracion de variables tipo entero, caracter, booleano y cadena hasta de 2 dimensiones. Tambien constantes. Lexcema :=
// | |  Operadores: Aritmeticos, relacionales y logicos.
// | |  Read y Write: Lectura y escritura de variables.
// | |  Funciones: Declaracion y uso de funciones con valores o referencias. Tambien recursividad.
// | |  Main: Funcion principal.
// | |  Manejo de errores: Errores lexicos.
// | |  Ciclos: Ciclos for while repeat y if.


// variable declaration
var_block
    : VAR (var_decl)+
    ;

var_decl
    : ID (',' ID)* ':' type_spec ';'
    | ID ':' type_spec ':=' expr ';'
    ;

type_spec
    : INTEGER
    | CHARACTER
    | BOOLEAN
    | STRING
    ;

expr
    : expr MUL expr
    | expr DIV expr
    | expr MOD expr
    | expr PLUS expr
    | expr MINUS expr
    | DIGIT
    ;

//OPERADORES
PLUS: '+';
MINUS: '-';
MUL: '*';
DIV: '/';
MOD: '%';

NEQ: '<>';
EQ: '=';
LT: '<';
GT: '>';
LEQ: '<=';
GEQ: '>=';


//TIPOS DE DATOS
INTEGER: 'INTEGER';
CHARACTER: 'CHARACTER';
BOOLEAN: 'BOOLEAN';
STRING: 'STRING';
CONSTCHAR: 'CONSTCHAR';
CONSTINT: 'CONSTINT';

//PALABRAS RESERVADAS
READLN: 'READLN';
READ: 'READ';

WRITELN: 'WRITELN';
WRITE: 'WRITE';

BOOL_VAL: TRUE | FALSE;

TRUE: 'true';
FALSE: 'false';

VAR: 'var';

//BUILDING BLOCKS
NEWLINE : [\r\n]+ -> skip;
STR     : '"' (ESC|.)*? '"';
ESC     : '\\"'  | '\\\\' | '\\t' | '\\n' | '\\r';
COMMENT : '{' .*? '}' -> skip;
ID     : [A-Z][A-Z0-9_]*;
LETTER : [A-Z]+;
DIGIT  : [0-9]+;
FLOAT  : DIGIT+ '.' DIGIT*
       | '.' DIGIT+
       ;
WS      : (' ' | '\t' | '\n' | '\r')+ -> skip;