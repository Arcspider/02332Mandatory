// Generated from C:/Users/Gusta/IdeaProjects/02332Mandatory/src\light.g4 by ANTLR 4.9.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lightParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lightVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link lightParser#start}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStart(lightParser.StartContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#hardware}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHardware(lightParser.HardwareContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#inputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInputs(lightParser.InputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#outputs}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutputs(lightParser.OutputsContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#latches}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatches(lightParser.LatchesContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#rules}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRules(lightParser.RulesContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#update}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitUpdate(lightParser.UpdateContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#latchOP}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLatchOP(lightParser.LatchOPContext ctx);
	/**
	 * Visit a parse tree produced by {@link lightParser#simulate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSimulate(lightParser.SimulateContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Not}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot(lightParser.NotContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Variable}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitVariable(lightParser.VariableContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Or}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr(lightParser.OrContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Constant}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant(lightParser.ConstantContext ctx);
	/**
	 * Visit a parse tree produced by the {@code And}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd(lightParser.AndContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Parentheses}
	 * labeled alternative in {@link lightParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParentheses(lightParser.ParenthesesContext ctx);
}