import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.RuleNode;
import org.antlr.v4.runtime.tree.TerminalNode;

public class prettyLightVisitor implements lightVisitor {
    @Override
    public AST visitStart(lightParser.StartContext ctx) {
        return visitChildren(ctx.name);
    }

    @Override
    public AST visitHardware(lightParser.HardwareContext ctx) {
        return visit(ctx.name);
    }

    @Override
    public AST visitInputs(lightParser.InputsContext ctx) {
        return visit(ctx.name);
    }

    @Override
    public AST visitOutputs(lightParser.OutputsContext ctx) {
        return visit(ctx.name);
    }

    @Override
    public AST visitLatches(lightParser.LatchesContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AST visitRules(lightParser.RulesContext ctx) {
        return visitChildren(ctx);
    }

    @Override
    public AST visitUpdate(lightParser.UpdateContext ctx) {
        return null;
    }

    @Override
    public AST visitLatchOP(lightParser.LatchOPContext ctx) {
        return new Sequence((Command)visit(ctx.name1),(Command)visit(ctx.name2));
    }

    @Override
    public AST visitSimulate(lightParser.SimulateContext ctx) {
        return null;
    }

    @Override
    public AST visitCommand(lightParser.CommandContext ctx) {
        return null;
    }

    @Override
    public AST visitBlock(lightParser.BlockContext ctx) {
        return null;
    }

    @Override
    public AST visitExpr(lightParser.ExprContext ctx) {
        return null;
    }

    @Override
    public AST visit(ParseTree parseTree) {
        return null;
    }

    @Override
    public AST visitChildren(RuleNode ruleNode) {
        return null;
    }

    @Override
    public AST visitTerminal(TerminalNode terminalNode) {
        return null;
    }

    @Override
    public AST visitErrorNode(ErrorNode errorNode) {
        return null;
    }
}
