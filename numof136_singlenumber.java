package java_LEET;

import java.util.Arrays;



public class numof136_singlenumber {
	//56%�� ���
	 public int singleNumber(int[] nums) {
			 Arrays.sort(nums);//ex)11224
			 for (int i =0;i<nums.length-1;i++){
		            if (nums[i] != nums[i+1]){
		                return nums[i];
		            }else{
		                i++;
		            }
		        }
		        return nums[nums.length-1];
			
			
		    }
		 
}
//solution�� list operation/hash table/math/bit manipulation �����־���

//7%
/* public int singleNumber(int[] nums) {
		return singleNumber_fun(nums,0,0);
	    }
	 public int singleNumber_fun(int[] nums,int i,int count) {
		//���� n[0]�� ��� nums���� �Ӻ��������� count�� ����
		 // ī��Ʈ�� 1�� ���-> nums[i[�� �����Ѵ�
		 // ī��Ʈ�� 2�ΰ�� ī��Ʈ�� �ʱ�ȭ �ѵ�, �Լ��� �ٽ� �ҷ����δ�
		 //�� �ܿ��� 0 ����
		 for(int j=0;j<nums.length;j++) {
			 if(nums[i]==nums[j]) count++;
		 }
		 
		 if(count==1) return nums[i];
		    count=0;
             i=i+1;
            int fun=singleNumber_fun(nums,i,count);
             return fun;
        
		 
	 }
*/

//5%
/*class Solution {
    
    
 public int singleNumber(int[] nums) {
     int count=0;
     for(int i=0;i<nums.length;i++){
		  for(int h=0;h<nums.length;h++) {
			 if(nums[i]==nums[h]) { 
                 count++;
                 }
			 	}  
         if(count==1) return nums[i];
		 else count=0;
     }
         
		return 0;    
}
}
*/
