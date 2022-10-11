grammar light;

start : hardware inputs outputs latches+ update rules* simulate* EOF;

hardware: '.hardware' name=IDENTIFIER ;

inputs: '.inputs' name=IDENTIFIER*;

outputs: '.outputs' name=IDENTIFIER*;

latches: '.latch' latchOP;

rules: name=IDENTIFIER '=' expr;

update: '.update';

latchOP : name1=IDENTIFIER '->' name2=IDENTIFIER;

simulate: '.simulate' rules expr*;


expr :'(' e1=expr ')'       # Parentheses
     |'!' e1=expr           # Not
     | e1=expr '&&' e2=expr # And
     | e1=expr '||' e2=expr # Or
     | c=CONST              # Constant
     | x=IDENTIFIER         # Variable
     ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-1]+ ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;