grammar light;

start : hardware inputs outputs latches update rules* simulate* EOF;

hardware: '.hardware' IDENTIFIER ;

inputs: '.inputs' IDENTIFIER*;

outputs: '.outputs' IDENTIFIER*;

latches: '.latch' latchOP;

rules: IDENTIFIER '=' expr;

update: '.update';

latchOP : IDENTIFIER '->' IDENTIFIER;

simulate: '.simulate' rules expr*;

command : expr
;

block : '{' command* '}'
      | command
      ;

expr : '!' expr
     | expr '&&' expr
     | expr '||' expr
     | c=CONST
     | x=IDENTIFIER
     ;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-1]+ ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;