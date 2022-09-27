grammar light;

start : hardware inputs outputs latches update rules* simulate* EOF;

hardware: '.hardware' name=IDENTIFIER ;

inputs: '.inputs' name=IDENTIFIER*;

outputs: '.outputs' name=IDENTIFIER*;

latches: '.latch' latchOP;

rules: name=IDENTIFIER '=' expr;

update: '.update';

latchOP : name1=IDENTIFIER '->' name2=IDENTIFIER;

simulate: '.simulate' rules expr*;

command : expr
;

block : '{' command* '}'
      | command
      ;

expr : '!' e1=expr
     | e1=expr '&&' e2=expr
     | e1=expr '||' e2=expr
     | c=CONST
     | x=IDENTIFIER
     ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-1]+ ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;