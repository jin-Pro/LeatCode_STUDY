package LeetCode;

public class No_617_MergeTwoBinaryTrees {
	public static TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
		if (root1 == null)
            return root2;
        if (root2 == null)
            return root1;
        TreeNode newTree = new TreeNode();
        newTree.val = root1.val + root2.val;
        
        newTree.left = mergeTrees(root1.left, root2.left);
        newTree.right = mergeTrees(root1.right, root2.right);
        return newTree;
    }
	
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1,new TreeNode(3,new TreeNode(5),null),new TreeNode(2));
		TreeNode root2 = new TreeNode(2,new TreeNode(1,null,new TreeNode(4)),new TreeNode(3,null,new TreeNode(7)));
		
		TreeNode newTree = mergeTrees(root1,root2);
	}
}

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