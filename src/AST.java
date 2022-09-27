import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AST{};

abstract class Command extends AST{
    abstract public void eval(Environment env);
}

class Sequence extends Command{
    Command c1,c2;
    Sequence(Command c1,Command c2){this.c1=c1; this.c2=c2;}
    public void eval(Environment env){
	c1.eval(env);
	c2.eval(env);
    }
}

class NOP extends Command{
    NOP(){}
    public void eval(Environment env){};
}

class Assignment extends Command{
    String varname;
    Expr e;
    Assignment(String varname, Expr e){ this.varname=varname; this.e=e;}
    public void eval(Environment env){
	env.setVariable(varname,e.eval(env));
    }
}

class While extends Command{
    Condition c;
    Command cmd;
    While(Condition c, Command cmd){this.c=c; this.cmd=cmd;}
    public void eval(Environment env){
	while (c.eval(env))
	    cmd.eval(env);
    }
}

class Output extends Command{
    Expr e;
    Output(Expr e){ this.e=e;}
    public void eval(Environment env){
	System.out.println(e.eval(env));
    }
}

abstract class Condition extends AST{
    abstract public Boolean eval(Environment env);
};

class Greater extends Condition{
    Expr e1,e2;
    Greater(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
    public Boolean eval(Environment env){
	return e1.eval(env) > e2.eval(env);
    }
}

class And extends Condition{
    Expr e1, e2;
    And(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
    public Boolean eval(Environment env){
        return e1.eval(env) && e2.eval(env);
    };
}

class Or extends  Condition{
    xpr e1, e2;
    Or(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
    public Boolean eval(Environment env){
        return e1.eval(env) || e2.eval(env);
    };

class Less extends Condition{
    Expr e1,e2;
    Less(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
    public Boolean eval(Environment env){
        return e1.eval(env) < e2.eval(env);
    }
}

