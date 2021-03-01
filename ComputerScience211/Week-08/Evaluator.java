// CS 211 HW 8
//   Evaluator can evaluate the postfix expression
//
//   Please don't modify!

import java.util.*;

public class Evaluator {
    private String postfix;
    public Evaluator(String postfix) {
        this.postfix = postfix;
    }

    public double evaluate() {
        Stack<Double> values = new Stack<>();
        Tokenizer tokenizer = new Tokenizer(postfix);
        String operators = "+-*/";
        
        while(tokenizer.hasNextToken()) {
            String t = tokenizer.nextToken();
            if(operators.contains(t)) {
                double op2 = values.pop();
                double op1 = values.pop();
                double r = calculate(t, op1, op2);
                values.push(r);
            } else {
                values.push(Double.parseDouble(t));
            }
        }
        return values.pop();
    }
    
    private double calculate(String operator, double op1, double op2) {
        if (operator.equals("+")) {
            return op1 + op2;
        } else if (operator.equals("-")) {
            return op1 - op2;
        } else if (operator.equals("*")) {
            return op1 * op2;
        } else if (operator.equals("/")) {
            return op1 / op2;
        } else {
            throw new IllegalStateException();
        }
    }
}