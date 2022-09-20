grammar impl;

start   : command* EOF;

command : function
      |  expr
;

block : '{' command* '}'
      | command
      ;

expr : '!' expr
     | expr '&&' expr
     | expr '||' expr
     | CONST
     | IDENTIFIER
     ;
function : '.'expr+
;

IDENTIFIER : [a-zA-Z_] [a-zA-Z0-9_]*;

CONST : [0-1]+ ;

HVIDRUM : [ \t\n]+ -> skip ;
KOMMENTAR : '//' ~[\n]* -> skip ;
MULTILINECOMMENTS :  '/*'  ( '*'~[/] | ~[*]  )* '*/' -> skip;