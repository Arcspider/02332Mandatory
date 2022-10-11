import org.antlr.v4.runtime.tree.ParseTreeVisitor;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import org.antlr.v4.runtime.CharStreams;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public abstract class AST{};

abstract class Expr extends AST{
    abstract public Boolean eval(Environment env);
}

//class Sequence extends Command{
//    Command c1,c2;
//    Sequence(Command c1,Command c2){this.c1=c1; this.c2=c2;}
//    public void eval(Environment env){
//	e1.eval(env);
//	e2.eval(env);
//    }
//}


class Assignment extends Expr{
    String varname;
    Expr e;
    Assignment(String varname, Expr e){ this.varname=varname; this.e=e;}
    public void eval(Environment env){
        env.setVariable(varname,e.eval(env));
    }
}


class Output extends Expr{
    Expr e;
    Output(Expr e){ this.e=e;}
    public void eval(Environment env){
        System.out.println(e.eval(env));
    }
}





class And extends Expr{
    Expr e1, e2;
    And(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
    public Boolean eval(Environment env){
        return e1.eval(env) && e2.eval(env);
    };
}

class Or extends  Expr{
    Expr e1, e2;
    Or(Expr e1, Expr e2){this.e1=e1; this.e2=e2;}
    public Boolean eval(Environment env){
        return e1.eval(env) || e2.eval(env);
    };
}

class Not extends Expr{
    Expr e1;
    Not(Expr e1){this.e1=e1;}
    public Boolean eval(Enviroment env){return ! e1.eval(env)}
}
class Start extends AST{
    String name;
    //List of inputs ???

}

class Circuit extends AST{
    private Trace[] inputTraces;
    private Trace[] outputTraces;
    private Integer input, output;
    public void initialize(){
        for (int i = 0; i < inputTraces.length-1; i++){
            input = inputTraces[i]
        }
    }
    public void nextCycle(){

    }
    public void runSimulator(int input){
        initialize();
    }
}
class UpdateDec extends AST{
    String name;
    Expr e1;

    public void eval(Environment env){
        env.setVariable(name,e1.eval(env));
    }
}
class Latch extends AST{
    private Boolean input;
    private Boolean output;


    private void initialize(){
        this.output = 0;
    }
    private void nextCycle(){
        this.output = this.input;
    }
}
class Trace extends AST{
    private String name;
    private boolean[] signalValue; //bool array

    public String toString(){
        for( int bool: signalValue){
            System.out.println(bool);
        }
    }
}


