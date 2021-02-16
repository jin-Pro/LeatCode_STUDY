package easy;

class TreeNode {
	int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
    	this.val = val;
        this.left = left;
        this.right = right;
    }
}

public class No_104_MaximumDepthofBinaryTree {
	 public int max(int left, int right){
	        return (left > right ? left : right); 
	    }
	    public int maxDepth(TreeNode root) {
	        int depth = 0;
	        
	        if(root != null){
	            depth = 1 + max(maxDepth(root.left), maxDepth(root.right));
	        }
	        
	        return depth;
	    }
}
