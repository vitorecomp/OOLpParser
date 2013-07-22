/** Grammars always start with a grammar header. This grammar is called
* ArrayInit and must match the filename: ArrayInit.g4
*/
grammar OOFinal;
/** A rule called init that matches comma-separated values between {...}. */

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

//Ponto inicial
operation    : exp * ;


/** A value can be either a nested array/struct or a simple integer (INT) */

//Valores definidos na linguagem
inteiro :  INT;
booleano:  BOOL;


// Opera��es poss�veis
soma : SUM exp exp ;
subtracao: SUB exp exp ;
negacao: SUB exp ;
and:  AND exp exp ;
condicao: IF exp then2 else2;
then2 : THEN exp ;
else2 : ELSE exp ;

exp :  soma
| subtracao
| negacao
| and
| condicao 
| inteiro
| booleano
;


// parser rules start with lowercase letters, lexer rules with uppercase
//Identifica as express�es
AND : [&|And]+;
THEN : [then]+;
ELSE : [else]+;
BOOL: ([True]|[False])+;
INT : [0-9]+ ; // Define token INT as one or more digits
SUM : [+|Add]+;
SUB : [-|Sub]+;
IF : [if]+;
//Identifica coisas que n�o s�o necess�rias
WS : [ \t\r\n(){},]+ -> skip ; 
//Identifica coment�rios
COMENTARIO : '#' ~[\r\n]* '\r'? '\n' -> skip ;
