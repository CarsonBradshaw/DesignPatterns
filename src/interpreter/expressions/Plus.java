package interpreter.expressions;

import java.util.Map;

public class Plus implements Expression {
    private Expression leftOp;
    private Expression rightOp;

    public Plus(Expression leftOp, Expression rightOp){
        this.leftOp = leftOp;
        this.rightOp = rightOp;
    }

    @Override
    public int interpret(Map<String, Expression> variables) {
        return leftOp.interpret(variables) + rightOp.interpret(variables);
    }
}
