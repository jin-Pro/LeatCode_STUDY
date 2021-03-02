package LeetCode;

public class No_101_SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root == null) return true;
        return helper(root.left,root.right);
    }
    
    private boolean helper(TreeNode leftNode, TreeNode rightNode){
        if(leftNode == null && rightNode == null) return true;
        if(leftNode == null || rightNode == null) return false;
        if(leftNode.val != rightNode.val) return false;
        if(!helper(leftNode.right,rightNode.left)) return false;
        if(!helper(leftNode.left,rightNode.right)) return false;
     
        return true;
    }
}

// Runtime: 0 ms, faster than 100.00% of Java
// Memory Usage: 36.9 MB, less than 77.01% of Java