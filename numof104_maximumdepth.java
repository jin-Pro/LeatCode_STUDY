package java_LEET;

public class numof104_maximumdepth {

	 public int maxDepth(TreeNode root) {
    	 return maxDepth_fun(root,0);
        }
        
    public int maxDepth_fun(TreeNode root,int cnt) {
    	int left,right;
        if(root==null) return cnt;//���°��� 0�� ��ȯ�Ѵ�
        //������ ���࿡ ���� ���������� �ȵǼ� �Ѵ� �˻����� ū����������= math.max�Լ� ���
        else {  
           //���� �ϳ��� �ִ°��
            	cnt=cnt+1;
                left=maxDepth_fun(root.left,cnt);
            	right=maxDepth_fun(root.right,cnt);
            	
            
            return Math.max(left, right);
        }
        
    }
}
