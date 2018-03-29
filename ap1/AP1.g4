grammar AP1;

s : expr;

op : '+'
    | '-' ;

hop : '/'
    | '*' ;

expr : expr hop expr
     | expr op expr
     | term;

term : INT ;

INT : [0-9]+;
WS : [ \t\r\n ]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;