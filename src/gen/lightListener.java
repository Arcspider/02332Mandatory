// Generated from C:/Users/soren/IdeaProjects/02332Mandatory/src\light.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link lightParser}.
 */
public interface lightListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link lightParser#start}.
	 * @param ctx the parse tree
	 */
	void enterStart(lightParser.StartContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#start}.
	 * @param ctx the parse tree
	 */
	void exitStart(lightParser.StartContext ctx);
	/**
	 * Enter a parse tree produced by {@link lightParser#hardware}.
	 * @param ctx the parse tree
	 */
	void enterHardware(lightParser.HardwareContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#hardware}.
	 * @param ctx the parse tree
	 */
	void exitHardware(lightParser.HardwareContext ctx);
	/**
	 * Enter a parse tree produced by {@link lightParser#inputs}.
	 * @param ctx the parse tree
	 */
	void enterInputs(lightParser.InputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#inputs}.
	 * @param ctx the parse tree
	 */
	void exitInputs(lightParser.InputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lightParser#outputs}.
	 * @param ctx the parse tree
	 */
	void enterOutputs(lightParser.OutputsContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#outputs}.
	 * @param ctx the parse tree
	 */
	void exitOutputs(lightParser.OutputsContext ctx);
	/**
	 * Enter a parse tree produced by {@link lightParser#latches}.
	 * @param ctx the parse tree
	 */
	void enterLatches(lightParser.LatchesContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#latches}.
	 * @param ctx the parse tree
	 */
	void exitLatches(lightParser.LatchesContext ctx);
	/**
	 * Enter a parse tree produced by {@link lightParser#rules}.
	 * @param ctx the parse tree
	 */
	void enterRules(lightParser.RulesContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#rules}.
	 * @param ctx the parse tree
	 */
	void exitRules(lightParser.RulesContext ctx);
	/**
	 * Enter a parse tree produced by {@link lightParser#update}.
	 * @param ctx the parse tree
	 */
	void enterUpdate(lightParser.UpdateContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#update}.
	 * @param ctx the parse tree
	 */
	void exitUpdate(lightParser.UpdateContext ctx);
	/**
	 * Enter a parse tree produced by {@link lightParser#latchOP}.
	 * @param ctx the parse tree
	 */
	void enterLatchOP(lightParser.LatchOPContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#latchOP}.
	 * @param ctx the parse tree
	 */
	void exitLatchOP(lightParser.LatchOPContext ctx);
	/**
	 * Enter a parse tree produced by {@link lightParser#simulate}.
	 * @param ctx the parse tree
	 */
	void enterSimulate(lightParser.SimulateContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#simulate}.
	 * @param ctx the parse tree
	 */
	void exitSimulate(lightParser.SimulateContext ctx);
	/**
	 * Enter a parse tree produced by {@link lightParser#command}.
	 * @param ctx the parse tree
	 */
	void enterCommand(lightParser.CommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#command}.
	 * @param ctx the parse tree
	 */
	void exitCommand(lightParser.CommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link lightParser#block}.
	 * @param ctx the parse tree
	 */
	void enterBlock(lightParser.BlockContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#block}.
	 * @param ctx the parse tree
	 */
	void exitBlock(lightParser.BlockContext ctx);
	/**
	 * Enter a parse tree produced by {@link lightParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(lightParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(lightParser.ExprContext ctx);
}