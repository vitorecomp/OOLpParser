/** Grammars always start with a grammar header. This grammar is called
* ArrayInit and must match the filename: ArrayInit.g4
*/
grammar OOFinal;
/** A rule called init that matches comma-separated values between {...}. */

/*------------------------------------------------------------------
 * PARSER RULES
 *------------------------------------------------------------------*/

operation    : exp * ;

factor  : value ;


/** A value can be either a nested array/struct or a simple integer (INT) */

inteiro :  INT;
booleano:  BOOL;

value :  inteiro   
| booleano
;

// Operações possíveis
soma : SUM exp exp ;
subtracao: SUB exp exp ;
negacao: SUB exp ;
and:  AND exp exp ;
condicao: IF booleano then2 else2;
then2 : THEN operation ;
else2 : ELSE operation ;

exp :  soma
| subtracao
| negacao
| and
| condicao 
| value
;


// parser rules start with lowercase letters, lexer rules with uppercase
AND : [&]+;
THEN : [then]+;
ELSE : [else]+;
BOOL: ([True]|[False])+;
INT : [0-9]+ ; // Define token INT as one or more digits
SUM : [+]+;
SUB : [-]+;
IF : [if]+;
WS : [ \t\r\n()]+ -> skip ; // Define whitespace rule, toss it out
