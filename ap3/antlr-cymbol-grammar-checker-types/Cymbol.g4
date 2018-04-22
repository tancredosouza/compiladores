grammar Cymbol;



//Lexer
fragment NUMBER    : [0-9];
fragment LETTER    : [a-zA-Z];
fragment UNDERLINE : '_';

TYPEINT  : 'int';
TYPEVOID : 'void';
TYPEFLOAT : 'float';
TYPESTRING : 'string';
TYPEBOOLEAN : 'boolean';

IF     : 'if';
ELSE   : 'else';
RETURN : 'return';

LP        : '(';
RP        : ')';
COMMA     : ',';
SEMICOLON : ';';
LB        : '{';
RB        : '}';

AS    : '=';
EQ    : '==';
NE    : '!=';
NOT   : '!';
GT    : '>';
LT    : '<';
GE    : '>=';
LE    : '<=';
MUL   : '*';
DIV   : '/';
PLUS  : '+';
MINUS : '-';
AND : '&&';
OR : '||';

BOOLEAN : 'true' | 'false';
INT : NUMBER+;
FLOAT : (NUMBER+)'.'(NUMBER+);
STRING : '"'.*?'"';
ID  : (UNDERLINE | LETTER) (UNDERLINE | LETTER | NUMBER)*;


BLOCKCOMMENT : '/*' .*? '*/' -> skip;
LINECOMMENT  : '//' .*? '\n' -> skip;
WS           : [ \t\n\r]+ -> skip;



//Parser
file : (funcDecl | varDecl)+ EOF?
     ;

varDecl : type ID ('=' expr)? ';'
        ;

type : TYPEINT                                   #FormTypeInt
     | TYPEVOID                                  #FormTypeVoid
     | TYPEBOOLEAN                               #FormTypeBoolean
     | TYPESTRING                                #FormTypeString
     | TYPEFLOAT                                 #FormTypeFloat
     ;

funcDecl : type ID '(' paramTypeList? ')' block
         ;

paramTypeList : paramType (',' paramType)*
              ;

paramType : type ID
          ;

block : '{' stat* '}'
      ;

assignStat : ID '=' expr ';'
           ;

returnStat : 'return' expr? ';'
           ;

ifElseStat : ifStat (elseStat)?
           ;

ifElseExprStat : block 
               | ifElseStat
               | returnStat
               | assignStat
               | exprStat
               ;

exprStat : expr ';'
         ;

exprList : expr (',' expr)* 
         ;

ifStat : 'if' '(' expr ')' ifElseExprStat
       ;

elseStat : 'else' ifElseExprStat
         ;

stat : varDecl
     | ifElseStat
     | returnStat
     | assignStat
     | exprStat
     ;

expr : ID '(' exprList? ')'                      #FunctionCallExpr
     | op=('+' | '-') expr                       #SignedExpr
     | '!' expr                                  #NotExpr
     | expr op=('<' | '>' | '<=' | '>=') expr    #ComparisonExpr
     | expr op=('*' | '/') expr                  #MulDivExpr
     | expr op=('+' | '-') expr                  #AddSubExpr
     | expr op=('==' | '!=') expr                #EqExpr
     | expr op=('&&' | '||') expr                #AndOrExpr
     | ID                                        #VarIdExpr
     | INT                                       #IntExpr
     | FLOAT                                     #FloatExpr
     | STRING                                    #StringExpr
     | BOOLEAN                                   #BooleanExpr
     | '(' expr ')'                              #ParenExpr
     ;