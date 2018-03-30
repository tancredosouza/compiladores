// COMPILADORES :: ENGENHARIA DA COMPUTAÇÃO
// Gramática referente à AP1 
// Aluno: Tancredo Souza <tantan@cin.ufpe.br>
// Data: 29/03/2018
//----------------------------------------------------//

grammar AP1;

// Variável inicial
s : line;

// Em uma linha, podemos ter uma atribuição ou
// o calculo de alguma expressão.
line : expr ';' BL*? line*
     | atrib ';' BL*? line*;

// Atribuição de valor à variável
atrib : VAR_ID '=' expr;

// Operações de baixa prioridade
op : '+'
   | '-';

// Operações de maior prioridade
hop : '/'
    | '*';

// Expressões organizadas baseadas em sua prioridade:
// 1. expressões entre parenteses com operador / ou *
// 2. expressões entre parenteses com operador + ou -
// 3. expressões sem parentees com operador / ou *
// 4. expressões sem parentees com operador + ou -
expr : '(' expr ')'
     | expr hop expr
     | expr op expr
     | term;

// Variável auxiliar, só pra ficar mais legível
term : INT 
     | VAR_ID;

// Regras léxicas
INT : [0-9]+; // Definição de inteiro
VAR_ID : [a-zA-Z]+; // Definição de id de variável (string)
WS : [ \t\r\n]+ -> skip; // Desconsiderar espaços em branco e afins
COMMENT : '//' ~[\r\n]* -> skip; // Comentário de linha
BLOCK_COMMENT : '/*' .*? '*/' -> skip; // Comentário de bloco
BL : [\r\n]; // Definição auxiliar de quebra de linha