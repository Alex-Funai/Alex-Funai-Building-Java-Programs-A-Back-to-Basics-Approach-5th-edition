// CS 211 HW 8
//   Converter can convert from infix notation into exprssion tree
//
//   for exmaple, the infix is:
//   3 + 2
//
//   the expression tree is like:
//      2
//   +
//      3


import java.io.*;
import java.util.*;

public class Converter {

    public static void main(String[] args) throws FileNotFoundException {        
        // TODO: change path to match where your input file is located
        File f = new File("/hw8/expressions.txt");
        Scanner s = new Scanner(f);
        
        while(s.hasNextLine()) {
            Converter c = new Converter(s.nextLine());
            System.out.println("infix:       " + c.getInfix());           
            System.out.println("postfix:     " + c.getPostfix());
            
            Evaluator e1 = new Evaluator(c.getPostfix());
            System.out.println("result:      " + e1.evaluate());
            
            TreeNode root = c.getExpressionTree();
            
            TreeEvaluator e2 = new TreeEvaluator(root); 
            System.out.println("tree:");
            e2.print();
            
            System.out.println("tree result: " + e2.evaluatie());
            
            System.out.println("\n---\n");
        }
    }
    
    private String infix;
    private String operators = "+-*/";

    public Converter(String infix) {
        this.infix = infix;
    }
    
    public String getInfix() {
        return infix;
    }
    
    // This is a sample implementation for "postfix"
    public String getPostfix() {
        Tokenizer tokenizer = new Tokenizer(infix);
        Stack<String> ops = new Stack<>();
        
        String result = "";
        while(tokenizer.hasNextToken()) {
            String t = tokenizer.nextToken();
            if(t.equals("(")) {
                //nothing
            } else if (t.equals(")")) {
                result += ops.pop() + " ";
            } else if (operators.contains(t)) {
                ops.push(t);
            } else {
                result += t + " ";
            }
        }
        if(!ops.isEmpty()) {
            result += ops.pop() + " ";
        }
        return result;
    }
     
    public TreeNode getExpressionTree() {
        Tokenizer tokenizer = new Tokenizer(infix);
        Stack<String> ops = new Stack<>();
        Stack<TreeNode> expressions = new Stack<>();

        // TODO: implement
        return null;
    }
}