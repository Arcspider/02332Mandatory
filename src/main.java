import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;

public class main {
    public static void main(String[] args) throws IOException{

	// we expect exactly one argument: the name of the input file
	if (args.length!=1) {
	    System.err.println("\n");
	    System.err.println("Traffic Light Interpreter\n");
	    System.err.println("=================\n\n");
	    System.err.println("Please give as input argument a filename\n");
	    System.exit(-1);
	}
	String filename=args[0];

	// open the input file
	CharStream input = CharStreams.fromFileName(filename);
	    //new ANTLRFileStream (filename); // depricated
	
	// create a lexer/scanner
	lightLexer lex = new lightLexer(input);
	
	// get the stream of tokens from the scanner
	CommonTokenStream tokens = new CommonTokenStream(lex);
	
	// create a parser
	lightParser parser = new lightParser(tokens);
	
	// and parse anything from the grammar for "start"
	ParseTree parseTree = parser.start();

	// Construct an interpreter and run it on the parse tree
	Interpreter interpreter = new Interpreter();
	Expr result= (Expr) interpreter.visit(parseTree);
//	System.out.println("The result is: "+result.eval(new Environment()));
    }
}

// We write an interpreter that implements interface
// "implVisitor<T>" that is automatically generated by ANTLR
// This is parameterized over a return type "<T>" which is in our case
// simply a Double.

class Interpreter extends AbstractParseTreeVisitor<AST> implements lightVisitor<AST> {
	//Section Based on impl week 4
    public AST visitStart(lightParser.StartContext ctx){
		System.out.println("Start er her");
		return visitChildren(ctx);}

	public AST visitLatch(lightParser.LatchContext ctx) {
		System.out.println("Latch er her");
		return new Latch(ctx.name1, ctx.name2);}

//	public AST visitCommands(implParser.CommandsContext ctx){
//		List<Command> cmds = new ArrayList<Command>();
//		for(implParser.CommandContext c : ctx.cmds){
//			cmds.add((Command) visit(c));
//		}



		@Override
	public AST visitUpdateDec(lightParser.UpdateDecContext ctx) {
		return null;
	}

	@Override
	public AST visitSimulate(lightParser.SimulateContext ctx) {
		return null;
	}

	public AST visitOr(lightParser.OrContext ctx){return new Or((Expr)visit(ctx.e1),(Expr)visit(ctx.e2));}
	public AST visitNot(lightParser.NotContext ctx){return new Not((Expr)visit(ctx.e1));}

	@Override
	public AST visitVariable(lightParser.VariableContext ctx) {
		return null;
	}

	public AST visitAnd(lightParser.AndContext ctx){return new And((Expr)visit(ctx.e1),(Expr)visit(ctx.e2));}

	@Override
	public AST visitParentheses(lightParser.ParenthesesContext ctx) {
		return null;
	}
}

