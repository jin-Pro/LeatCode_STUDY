package easy;

  public class TreeNode1 {
      int val;
      TreeNode1 left;
      TreeNode1 right;
      TreeNode1() {}
      TreeNode1(int val) { this.val = val; }
      TreeNode1(int val, TreeNode1 left, TreeNode1 right) {
          this.val = val;
          this.left = left;
          this.right = right;
      }
  }
 

public class No_226_InvertBinaryTree {
    TreeNode1 temp = new TreeNode1();
    
    public TreeNode1 invertTree(TreeNode1 root) {
        if(root != null) {
            temp = root.right;
            root.right = root.left;
            root.left = temp;
        }
        else{
            return root;
        }

        invertTree(root.left);
        invertTree(root.right);
        
        return root;
    }
}
