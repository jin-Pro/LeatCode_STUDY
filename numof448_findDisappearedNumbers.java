package java_LEET;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class numof448_findDisappearedNumbers {
	public static void main(String[] args) {
		int[] nums = new int[8];
		nums[0] = 4;
		nums[1] = 3;
		nums[2] = 2;
		nums[3] = 7;
		nums[4] = 8;
		nums[5] = 2;
		nums[6] = 3;
		nums[7]=1;
		//1�� �Ǵ� 2���̴�. ��2���ǰ����� ������ ������ ��,, �̰� �ѹ��� ó���ϴ� ���� ������ ������
	   // ���࿡ num�� �մٸ� ���ο� ���� count�� 1�� �ο��Ѵ� �� ���� ��ġ�� �ο��Ѵ�
		//ī��Ʈ ���� ���ִٸ� list�� �� ��ġ�� ���� ���Ѵ� 
		// 
		int len=nums.length;
		 
		 
	      ArrayList<Integer> list=new ArrayList<>();
	      int[] count=new int[len+1];
	      for(int i=0;i<len;i++) count[nums[i]]++;
	      for(int i=1;i<len+1;i++) {
	    	  if(count[i]==0) list.add(i);
	      }
//	     return list;
	      System.out.println(list);	      
	      
		 
	}
}
