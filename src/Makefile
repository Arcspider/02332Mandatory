antlr4 = java org.antlr.v4.Tool
grun = java org.antlr.v4.gui.TestRig
SRCFILES = main.java
GENERATED = lightParser.java lightBaseVisitor.java lightVisitor.java lightLexer.java

all:
	make tree

main.class:	$(SRCFILES) $(GENERATED) light.g4
	javac  $(SRCFILES) $(GENERATED)

implLexer.java:	light.g4
	$(antlr4) -visitor light.g4

implLexer.class: lightLexer.java
	javac $(GENERATED)

test:	main.class input.txt
	java main input.txt

tree:	lightLexer.class light.g4 input.txt
	$(grun) light start -gui -tokens input.txt
