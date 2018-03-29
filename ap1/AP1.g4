grammar Exp;

s : c
  | factor 
  ;

c : factor ';' c*
  ;

factor :
  | '(' factor ')'
  | term '/' factor
  | term '*' factor
  | term '+' factor
  | term '-' factor
  | term
  ;

term :
  | INT
  ;

INT : [0-9]+;
WS : [ \t\r\n ]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;