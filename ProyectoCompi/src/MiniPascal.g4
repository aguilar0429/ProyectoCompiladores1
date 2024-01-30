grammar MiniPascal;

options { caseInsensitive = true; }


STRING: 'STRING';

READLN: 'READLN';

READ: 'READ';

WRITELN: 'WRITELN';

WRITE: 'WRITE';

TRUE: 'true';

FALSE: 'false';

NEWLINE : [\r\n]+ -> skip;
STR     : '"' (ESC|.)*? '"';
ESC     : '\\"'  | '\\\\' | '\\t' | '\\n' | '\\r';
COMMENT : '{' .*? '}' -> skip;
ID     : [a-zA-Z][a-zA-Z0-9_]*;
LETTER : [a-zA-Z]+;
DIGIT  : [0-9]+;
FLOAT  : DIGIT+ '.' DIGIT*
       | '.' DIGIT+
       ;
WS      : (' ' | '\t' | '\n' | '\r')+ -> skip;

