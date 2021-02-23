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
		//1개 또는 2개이다. 즉2개의개수가 부족한 숫자의 수,, 이고 한번에 처리하는 법을 생각해 내야함
	   // 만약에 num이 잇다면 새로운 공간 count에 1을 부여한다 각 값의 위치에 부여한다
		//카운트 값이 비여있다면 list에 그 위치의 값을 더한다 
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
