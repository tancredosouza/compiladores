// COMPILADORES :: ENGENHARIA DA COMPUTAÇÃO
// Gramática referente à AP1 
// Aluno: Tancredo Souza
// Data: 29/03/2018
//----------------------------------------------------//

grammar AP1;

// Variável inicial
s : line;

atrib : VAR_ID '=' expr;

// Operações de baixa prioridade
op : '+'
    | '-';

// Operações de maior prioridade
hop : '/'
    | '*';

// Se houver múltiplas expressões, podemos assumir
// que elas podem estar ou não na mesma linha. Assim,
// Basta checar se houve nenhuma ou mais quebras de linha (BL)
// E buscar a próxima linha (se houver).
line : expr ';' BL*? line*
     | atrib ';' BL*? line*
     ;

// Expressões organizadas baseadas em sua prioridade:
// 1. expressões entre parenteses com operador / ou *
// 2. expressões entre parenteses com operador + ou -
// 3. expressões sem parentees com operador / ou *
// 4. expressões sem parentees com operador + ou -
expr : '(' expr hop expr ')'
     | '(' expr op expr ')'
     | expr hop expr
     | expr op expr
     | term;

// Variável auxiliar, só pra ficar mais legível
term : INT 
     | VAR_ID;

// Regras léxicas de inteiro, pular espaco em branco, 
// pular comentario de linha e pular comentario de bloco.
INT : [0-9]+;
VAR_ID : [a-zA-Z]+;
WS : [ \t\r\n]+ -> skip;
COMMENT : '//' ~[\r\n]* -> skip;
BLOCK_COMMENT : '/*' .*? '*/' -> skip;
BL : [\r\n];