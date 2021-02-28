package LeetCode;

public class No_543_DiameterofBinaryTree {
	static int answer ;
    
    public int diameterOfBinaryTree(TreeNode root) {
        answer = 0;
        helper(root);
        return answer;
    }
    
    public int helper(TreeNode root){
        if(root == null) return 0;
        
        int leftLength = helper(root.left);
        int rightLength = helper(root.right);
        
        answer = Math.max(answer, leftLength + rightLength);
        
        return Math.max(leftLength,rightLength) + 1;
    }
}

//Runtime: 0 ms, faster than 100.00% 
//Memory Usage: 39 MB, less than 46.21% of Java
