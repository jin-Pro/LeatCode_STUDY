package java_LEET;

public class numof101_isSymmetric {
	 public boolean isSymmetric(TreeNode root) {
//	        TreeNode dhls,dh;//��,��
//	        dhls=root.left;
//	        dh=root.right;
//	        if(dhls!=dh) return false;
//	        if(dhls==null&&dh==null) return true;
//	        if(dhls.left==dh.right) {
//	        	dhls=dhls.left;
//	        	isSymmetric(dhls);
//	        }
//	        if(dhls.right==dh.left) {
//	        	dh=dh.right;
//	        	isSymmetric(dhls);
//	        }
//	        else {
//	        	return false;
//	        }
		 if(root==null) return true;
		 return tree(root.left,root.right);
	    }
	 boolean tree(TreeNode left,TreeNode right) {
		 boolean a,b;
		 if(left==null & right==null) return true;//������ �������� true��ȯ
		 if(left==null || right==null) return false;//���߰��� ���°��
		 if(left.val!=right.val) return false; //���� �ٸ����
		 a=tree(left.left,right.right);
		 b=tree(left.right,right.left);
		 return a&&b;
		 
	 }
}
