// COMPILADORES :: ENGENHARIA DA COMPUTAÇÃO
// Gramática referente à AP1 
// Aluno: Tancredo Souza
//----------------------------------------------------//

grammar AP1 ;

// Variável inicial
s : multExpr ;

// Operações de baixa prioridade
op : '+'
    | '-' ;

// Operações de maior prioridade
hop : '/'
    | '*' ;

// Se a expressão é ou não multipla
// A expressão inicial pode ter 0 ou mais expressões após ela
// Prefiri omitir o ';' à direita da ultima expressão. Fica mais bonito! :P
multExpr : expr (';' expr+ )* ;

// Expressões organizadas baseadas em sua prioridade:
// 1. expressões entre parenteses com operador / ou *
// 2. expressões entre parenteses com operador + ou -
// 3. expressões sem parentees com operador / ou *
// 4. expressões sem parentees com operador + ou -
expr : '(' expr hop expr ')'
     | '(' expr op expr ')'
     | expr hop expr
     | expr op expr
     | term ;

// Variável auxiliar, só pra ficar mais legível
term : INT ;

// Regras léxicas de inteiro, pular espaco em branco, 
// pular comentario de linha e pular comentario de bloco.
INT : [0-9]+ ;
WS : [ \t\r\n]+ -> skip ;
COMMENT : '//' ~[\r\n]* -> skip ;
BLOCK_COMMENT : '/*' .*? '*/' -> skip ;