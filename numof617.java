package java_LEET;
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class numof617 {
	    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
	    	
	    	TreeNode root = new TreeNode();
	    	if(root1 == null)  root = root2;
			else if(root2 == null)  root = root1;
			else {
				root.val = root1.val + root2.val;
		    	root.left = mergeTrees(root1.left, root2.left);
		    	root.right = mergeTrees(root1.right, root2.right);
	    	}
	    	return root;
		}
	}

