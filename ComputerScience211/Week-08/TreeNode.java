// CS 211 HW 8
//   TreeNode represents a node inside an expression
//
//   Please don't modify!

public class TreeNode {
    private String operators = "+-*/";
    private String data;
    private TreeNode leftChild, rightChild;
    
    public TreeNode(String data, TreeNode leftChild, TreeNode rightChild) {
        this.data = data;
        this.leftChild = leftChild;
        this.rightChild = rightChild;
    }

    public String getData() {
        return data;
    }

    public TreeNode getLeftChild() {
        return leftChild;
    }
    
    public TreeNode getRightChild() {
        return rightChild;
    }
    
    public boolean isOperator() {
        return (leftChild != null) && (rightChild != null) && operators.contains(data);
    }

    public boolean isNumber() {
        return (leftChild == null) && (rightChild == null);
    }
    
    public String getOperator() {
        if(isOperator()) {
            return data;
        } else {
            throw new IllegalStateException();
        }
    }
    
    public double getNumber() {
        if(isNumber()) {
            return Double.parseDouble(data);
        } else {
            throw new IllegalStateException();
        }
    }
}