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
	 * Enter a parse tree produced by {@link lightParser#latch}.
	 * @param ctx the parse tree
	 */
	void enterLatch(lightParser.LatchContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#latch}.
	 * @param ctx the parse tree
	 */
	void exitLatch(lightParser.LatchContext ctx);
	/**
	 * Enter a parse tree produced by {@link lightParser#updateDec}.
	 * @param ctx the parse tree
	 */
	void enterUpdateDec(lightParser.UpdateDecContext ctx);
	/**
	 * Exit a parse tree produced by {@link lightParser#updateDec}.
	 * @param ctx the parse tree
	 */
	void exitUpdateDec(lightParser.UpdateDecContext ctx);
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
	 * Enter a parse tree produced by the {@code Not}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNot(lightParser.NotContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNot(lightParser.NotContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterVariable(lightParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitVariable(lightParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Or}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterOr(lightParser.OrContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitOr(lightParser.OrContext ctx);
	/**
	 * Enter a parse tree produced by the {@code And}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAnd(lightParser.AndContext ctx);
	/**
	 * Exit a parse tree produced by the {@code And}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAnd(lightParser.AndContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterParentheses(lightParser.ParenthesesContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitParentheses(lightParser.ParenthesesContext ctx);
}