package java_LEET;

public class numof104_maximumdepth {

	 public int maxDepth(TreeNode root) {
    	 return maxDepth_fun(root,0);
        }
        
    public int maxDepth_fun(TreeNode root,int cnt) {
    	int left,right;
        if(root==null) return cnt;//없는경우는 0을 반환한다
        //왼쪽이 만약에 먼저 끝나버리면 안되서 둘다 검사한후 큰값가져오기= math.max함수 사용
        else {  
           //둘중 하나라도 있는경우
            	cnt=cnt+1;
                left=maxDepth_fun(root.left,cnt);
            	right=maxDepth_fun(root.right,cnt);
            	
            
            return Math.max(left, right);
        }
        
    }
}
