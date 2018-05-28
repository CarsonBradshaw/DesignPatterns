package interpreter;

import interpreter.expressions.Expression;
import interpreter.parser.PostFixNotationGrammarParser;
import interpreter.expressions.Number;

import java.util.Map;

public class App {
    public static void main(String[] args) {
        String expression = "w x z - +";
        PostFixNotationGrammarParser evaluation = new PostFixNotationGrammarParser(expression);

        Map<String, Expression> variables = Map.of("w", new Number(5), "x", new Number(10), "z", new Number(42));
        int result = evaluation.interpret(variables);
        System.out.println(result);
    }
}
