grammar light;

start : '.hardware' nameH=IDENTIFIER '.inputs' nameIn=IDENTIFIER* '.outputs' nameOut=IDENTIFIER* latch+ '.update' updateDec* '.simulate' sims+=simulate* EOF;

latch: '.latch' name1=IDENTIFIER '->' name2=IDENTIFIER;

updateDec: name=IDENTIFIER '=' expr;

simulate:  name=IDENTIFIER '=' CONST;


expr :'(' e1=expr ')'       # Parentheses
     |'!' e1=expr           # Not
     | e1=expr '&&' e2=expr # And
     | e1=expr '||' e2=expr # Or
     | x=IDENTIFIER         # Variable
     ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-1]+ ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;