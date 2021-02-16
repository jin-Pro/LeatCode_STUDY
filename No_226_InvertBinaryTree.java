package LeetCode;

public class No_226_InvertBinaryTree {
	public TreeNode invertTree(TreeNode root) {
		if(root == null) {
			return root;
		}
		
		TreeNode temp = root.right;
		root.right = root.left;
		root.left = temp;
		
		invertTree(root.right);
		invertTree(root.left);
		
		return root;
    }
}
