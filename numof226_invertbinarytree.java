package java_LEET;

public class numof226_invertbinarytree {
	 public TreeNode invertTree(TreeNode root) {
	        //������ ���̿��ִ¾ֵ鳢�� ������ �ٲ���
	        /*1.���� �� ���� , �迭�� �־ �迭�� ������ �ٲ۵� �ٽ� �ֱ�
	        2. ���̿� ����, �޿޿�<->������/�޿�<->����*/ 
	        //�迭�� ���ŷο�Ű��Ƽ� �̸��� �ٲ㼭 ����Լ��� �޿��� �ٲ��ֱ��      ����
	        if(root == null) return null;//�⺻ ��������
	        TreeNode tmp;
	        tmp=root.left;
	        root.left=root.right;
	        root.right=tmp;
	        invertTree(root.left);
	        invertTree(root.right);
	        return root;
	        
	    }

}
