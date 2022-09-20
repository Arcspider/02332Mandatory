grammar impl;

start   : hardware inputs outputs latches* updates assignment* simulate* EOF;



expr : '(' expr ')'
     | '!' expr
     | expr '&&' expr
     | expr '||' expr
     | CONST
     | IDENTIFIER
     ;
hardware : '.hardware' IDENTIFIER+
;
inputs : '.inputs' IDENTIFIER+
;
outputs : '.outputs' IDENTIFIER+;
latches : '.latch' IDENTIFIER '->' IDENTIFIER
;
updates : '.update';

assignment : expr '=' expr;

simulate : '.simulate' assignment*;



IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-1]+ ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;