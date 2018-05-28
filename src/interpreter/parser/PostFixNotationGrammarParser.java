package interpreter.parser;

import interpreter.expressions.Expression;
import interpreter.expressions.Minus;
import interpreter.expressions.Plus;
import interpreter.expressions.Variable;

import java.util.*;

public class PostFixNotationGrammarParser implements Expression {
    private Expression syntaxTree;

    public PostFixNotationGrammarParser(String expression) {
        Queue<Expression> exprStack = Collections.asLifoQueue(new ArrayDeque<>());

        for(String token : expression.split(" ")){
            if(token.equals("+")){
                Expression plusExpr = new Plus(exprStack.remove(), exprStack.remove());
                exprStack.add(plusExpr);
            }else if(token.equals("-")){
                Expression right = exprStack.remove();
                Expression left = exprStack.remove();
                Expression minusExpr = new Minus(left, right);
                exprStack.add(minusExpr);
            }else{
                exprStack.add(new Variable(token));
            }
        }
        syntaxTree = exprStack.remove();
        if(exprStack.size() != 0)
            throw new IllegalArgumentException("[" + expression + "] is not a valid expression.");
    }


    @Override
    public int interpret(Map<String, Expression> variables) {
        return syntaxTree.interpret(variables);
    }
}
