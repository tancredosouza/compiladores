grammar Cymbol;

//Lexer
fragment NUMBER    : [0-9];
fragment LETTER    : [a-zA-Z];
fragment UNDERLINE : '_';
fragment DECPT     : '.'; // decimal point for float values

TYPEINT  : 'int'; // integer type
TYPEVOID : 'void'; // void type
TYPEFLOAT : 'float'; // float type
TYPEBOOLEAN : 'boolean'; // boolean type
TYPESTRING : 'string'; // string type

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
AND   : '&&'; // AND logic operator
OR    : '||'; // OR logic operator

STRING : '"' ~('\r' | '\n' | '"')* '"'; // string type definition
BOOL : 'true' | 'false'; // bool type definition
ID  : (UNDERLINE | LETTER) (UNDERLINE | LETTER | NUMBER)*;
INT : NUMBER+;
FLOAT : NUMBER+ DECPT NUMBER+; // float type definition


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
     | TYPEFLOAT                                 #FormTypeFloat 
     | TYPEBOOLEAN                               #FormTypeBoolean
     | TYPESTRING                                #FormTypeString
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
     ;

expr : BOOL                                      #BoolExpr
     | ID '(' exprList? ')'                      #FunctionCallExpr
     | op=('+' | '-') expr                       #SignedExpr
     | '!' expr                                  #NotExpr
     | expr op=('<' | '>' | '<=' | '>=') expr    #ComparisonExpr
     | expr op=('*' | '/') expr                  #MulDivExpr
     | expr op=('+' | '-') expr                  #AddSubExpr
     | expr op=('==' | '!=') expr                #EqExpr
     | ID                                        #VarIdExpr
     | INT                                       #IntExpr
     | FLOAT                                     #FloatExpr
     | STRING                                    #StringExpr
     | '(' expr ')'                              #ParenExpr
     | expr op=('&&' | '||') expr                #LogicExpr
     ;