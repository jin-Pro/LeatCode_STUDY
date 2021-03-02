package java_LEET;

public class numof101_isSymmetric {
	 public boolean isSymmetric(TreeNode root) {
//	        TreeNode dhls,dh;//왼,오
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
		 if(left==null & right==null) return true;//무사히 끝났을때 true반환
		 if(left==null || right==null) return false;//둘중값이 없는경우
		 if(left.val!=right.val) return false; //값이 다른경우
		 a=tree(left.left,right.right);
		 b=tree(left.right,right.left);
		 return a&&b;
		 
	 }
}
