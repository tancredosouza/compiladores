grammar AP1;

s : expr;

op : '+'
    | '-' ;

expr : expr op expr
     | term;

term : INT ;

INT : [0-9]+;
WS : [ \t\r\n ]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;