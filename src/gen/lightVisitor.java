// Generated from C:/Users/soren/IdeaProjects/02332Mandatory/src\light.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lightParser}.
 *
 * @param <AST> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lightVisitor<AST> extends ParseTreeVisitor<AST> {
	/**
	 * Visit a parse tree produced by {@link lightParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	AST visitStart(lightParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#hardware}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	AST visitHardware(lightParser.HardwareContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	AST visitInputs(lightParser.InputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	AST visitOutputs(lightParser.OutputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#latches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	AST visitLatches(lightParser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	AST visitRules(lightParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	AST visitUpdate(lightParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#latchOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	AST visitLatchOP(lightParser.LatchOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#simulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	AST visitSimulate(lightParser.SimulateContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#command}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	AST visitCommand(lightParser.CommandContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#block}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	AST visitBlock(lightParser.BlockContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	AST visitExpr(lightParser.ExprContext ctx);
}