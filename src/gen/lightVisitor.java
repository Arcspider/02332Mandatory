// Generated from C:/Users/soren/IdeaProjects/02332Mandatory/src\light.g4 by ANTLR 4.10.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

import java.beans.Expression;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link lightParser}.
 *
 * @param <AST> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface lightVisitor<AST> extends ParseTreeVisitor<AST> {
	AST visitStart(lightParser.StartContext ctx);
	AST visitHardware(lightParser.HardwareContext ctx);
	AST visitInputs(lightParser.InputsContext ctx);
	AST visitOutputs(lightParser.OutputsContext ctx);
	AST visitLatches(lightParser.LatchesContext ctx);
	AST visitRules(lightParser.RulesContext ctx);
	AST visitUpdate(lightParser.UpdateContext ctx);
	AST visitLatchOP(lightParser.LatchOPContext ctx);
	AST visitSimulate(lightParser.SimulateContext ctx);
	AST visitCommand(lightParser.CommandContext ctx);
	AST visitBlock(lightParser.BlockContext ctx);
	AST visitExpr(lightParser.ExprContext ctx);
}