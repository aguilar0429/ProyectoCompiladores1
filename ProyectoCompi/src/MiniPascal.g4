grammar MiniPascal;

options { caseInsensitive = true; }

//TO DO:
// | |  Comentarios { }: No anidadados y extendibles a varias lineas incluyendo el salto de linea
// | |  Variables: Declaracion de variables tipo entero, caracter, booleano y cadena hasta de 2 dimensiones. Tambien constantes. Lexcema :=
// | |  Operadores: Aritmeticos, relacionales y logicos.
// | |  Read y Write: Lectura y escritura de variables.
// | |  Funciones: Declaracion y uso de funciones con valores o referencias. Tambien recursividad.
// | |  Main: Funcion principal.
// | |  Manejo de errores: Errores lexicos.
// | |  Ciclos: Ciclos for while repeat y if.


//variable declaration
var_decl
    : VAR ID (',' ID)* ':' type_spec
    ;
    
type_spec
    : INTEGER
    | CHARACTER
    | BOOLEAN
    | STRING
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

TRUE: 'true';
FALSE: 'false';

VAR: 'VAR';


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

