package interpreter.expressions;

import java.util.Map;

public class Minus implements Expression {
    private Expression leftOp;
    private Expression rightOp;


    public Minus(Expression leftOp, Expression rightOp) {
        this.leftOp = leftOp;
        this.rightOp = rightOp;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return leftOp.interpret(variables) - rightOp.interpret(variables);
    }
}
