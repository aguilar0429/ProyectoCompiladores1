grammar MiniPascal;

options {
    caseInsensitive = true;
}
//TO DO:
// |X|  Comentarios { }: No anidadados y extendibles a varias lineas incluyendo el salto de linea
// | |  Variables: Declaracion de variables tipo entero, caracter, booleano y cadena hasta de 2 dimensiones. Tambien constantes. Lexcema :=
// | |  Operadores: Aritmeticos, relacionales y logicos.
// | |  Read y Write: Lectura y escritura de variables.
// | |  Funciones: Declaracion y uso de funciones con valores o referencias. Tambien recursividad.
// | |  Main: Funcion principal.
// | |  Manejo de errores: Errores lexicos.
// | |  Ciclos: Ciclos for while repeat y if.


program: program_block EOF;

program_block: PROGRAM ID ';'
    var_block? //Bloque de Variables globales
    function_block? //Bloque de Funciones
    BEGIN instr+ END '.'//Este seria el main
    ;

//------------------------------------------------------FUNCIONES-------------------------------------------------------

//BLOCK DE FUNCIONES
function_block
    : (FUNCTION ID '(' (var_decl (';' var_decl)*)? ')' ':' var_type ';'
        var_block? //Bloque de Variables locales
        BEGIN
            instr+
        END ';' // puse el begin y end entre punto y coma afuera para poder utilizar function_body en otras cosas como el main
      )+
    ;


//-----------------------------------------------CICLOS Y CONDICIONALES-------------------------------------------------

//CICLO FOR
//Fors que ejecutan mas de una instruccion deben ir entre begin y end
for_loop
    : FOR ID ':=' expr TO expr DO (BEGIN instr+ END ';' | instr)
    | FOR ID ':=' expr DOWNTO expr DO (BEGIN instr+ END ';' | instr)
    ;

//INSTRUCCIONES
instr
    : var_init
    | READ '(' ID ')' ';'
    | WRITE '(' expr ')' ';'
    | for_loop
    //demas instrucciones que se puedan ejecutar como if, while, repeat, etc
    ;


//------------------------------------------------------VARIABLES-------------------------------------------------------
//BLOCK DE VARIABLES CON UN SOLO VAR Y VARIAS DECLARACIONES
var_block
    : VAR (var_decl ';')+ //Saque el punto y coma para que pueda ser utilizado dentro de los inputs de las funciones
    ;

//DECLARACION DE VARIABLES DENTRO DE UN BLOQUE
var_decl
    : ID (',' ID)* ':' (var_type) (':=' expr)?
    | ID (',' ID)* ':' ARRAY '[' size (',' size)? ']' OF var_type
    | ID (',' ID)* ':' const_type ':=' CONST
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
    ;

//TIPOS DE VARIABLES`
var_type
    : INTEGER
    | CHARACTER
    | BOOLEAN
    | STRING
    ;

const_type
    : CONSTCHAR
    | CONSTSTR
    ;

//EXPRESIONES ASIGNABLES A VARIABLES
expr
    : expr '*' expr
    | expr '/' expr
    | expr '%' expr
    | expr '+' expr
    | expr '-' expr
    | REALNUM
    ;

//----------------------------------------------RESERVADAS Y PALABRAS---------------------------------------------------

//PALABRAS RESERVADAS
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
FOR: 'for';
TO: 'to';
DOWNTO: 'downto';
DO: 'do';
BEGIN: 'begin';
END: 'end';
IF: 'if';
THEN: 'then';
ELSE: 'else';

//BUILDING BLOCKS
CHAR    : '\'' . '\'' ;
CONST   : '\'' (ESC | ~["\\])* '\'' ;
ID      : [a-z][A-Z0-9_]*;
NEWLINE : [\r\n]+ -> skip;
STR     : '"' (ESC|.)*? '"';
ESC     : '\\"'  | '\\\\' | '\\t' | '\\n' | '\\r';
COMMENT : '{' .*? '}' -> skip;
LETTER  : [A-Z]+;

size    : REALNUM '..' REALNUM;

//NUMBERS
REALNUM   : ('-'? DIGIT | DIGIT) ;
FLOAT     : REALNUM '.' DIGIT ;
DIGIT     : [0-9]+;

WS      : (' ' | '\t' | '\n' | '\r')+ -> skip;