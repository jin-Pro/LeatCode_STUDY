package java_LEET;

import java.util.Arrays;



public class numof136_singlenumber {
	//56%로 상승
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
//solution은 list operation/hash table/math/bit manipulation 등이있었다

//7%
/* public int singleNumber(int[] nums) {
		return singleNumber_fun(nums,0,0);
	    }
	 public int singleNumber_fun(int[] nums,int i,int count) {
		//만약 n[0]과 모든 nums값과 ㅣ비교했을때의 count를 새기
		 // 카운트가 1인 경우-> nums[i[를 리턴한다
		 // 카운트가 2인경우 카운트를 초기화 한뒤, 함수를 다시 불러들인다
		 //그 외에는 0 리턴
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
