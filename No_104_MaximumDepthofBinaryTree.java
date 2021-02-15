package LeetCode;

public class No_104_MaximumDepthofBinaryTree {
	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(1,new TreeNode(3,new TreeNode(5),null),new TreeNode(2));
		
		int answer = maxDepth(root1);
		
		System.out.println(answer);
	}
	public static int maxDepth(TreeNode root) {
		
		if(root == null) {
			return 0;
		}
		
		int answer = 1;
		
		if(root.left == null) {
			answer += maxDepth(root.right);
			return answer;
		}
		if(root.right == null) {
			answer += maxDepth(root.left);
			return answer;
		}
		
		int leftDepth = maxDepth(root.left);
		int rightDepth = maxDepth(root.right);
		
		return (leftDepth > rightDepth) ? leftDepth + 1:  rightDepth + 1;
	}
}