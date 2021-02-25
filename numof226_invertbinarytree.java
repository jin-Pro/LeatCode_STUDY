package java_LEET;

public class numof226_invertbinarytree {
	 public TreeNode invertTree(TreeNode root) {
	        //같ㅇ은 높이에있는애들끼리 순서를 바꾸자
	        /*1.높이 에 따라 , 배열에 넣어서 배열의 순서를 바꾼뒤 다시 넣기
	        2. 깊이에 따라, 왼왼왼<->오오오/왼오<->오왼*/ 
	        //배열은 번거로운거같아서 이름을 바꿔서 재귀함수로 왼오를 바꿔주기로      했음
	        if(root == null) return null;//기본 종료조건
	        TreeNode tmp;
	        tmp=root.left;
	        root.left=root.right;
	        root.right=tmp;
	        invertTree(root.left);
	        invertTree(root.right);
	        return root;
	        
	    }

}
