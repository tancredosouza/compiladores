grammar AP1;

s : bigExpr;

op : '+'
    | '-' ;

hop : '/'
    | '*' ;

bigExpr : expr (';' expr+)*
        ;

expr : '(' expr hop expr ')'
     | '(' expr op expr ')'
     | expr hop expr
     | expr op expr
     | term;

term : INT ;

INT : [0-9]+;
WS : [ \t\r\n]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;