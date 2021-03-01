// CS 211 HW 8
//   TreeEvaluator can evaluate the expression tree.
//
//   It can also print the tree in "vertical format" for you to inspect.
//

public class TreeEvaluator {
    private TreeNode root;
    public TreeEvaluator(TreeNode root) {
        this.root = root;
    }

    public double evaluatie() {
        return evaluateHelper(root);
    }
    
    private double evaluateHelper(TreeNode node) {
        // TODO: implement
        return 0;
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
    
    public void print() {
        if(root != null) {
            printWithLevel(root, 0);            
        }
    }
    
    private void printWithLevel(TreeNode node, int level) {
        String content = " ";
        for(int i = 0; i < level; i++) {
            content += "      ";
        }
        content += node.getData();
        
        if (node.isOperator()) {
            printWithLevel(node.getRightChild(), level + 1);
            System.out.println(content);            
            printWithLevel(node.getLeftChild(), level + 1);
        } else if (node.isNumber()) {
            System.out.println(content);
        }
    }    
}