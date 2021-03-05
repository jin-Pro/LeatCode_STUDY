package java_LEET;

public class numof1_twosum {
	 public int[] twoSum(int[] nums, int target) {
	        int i;
	        int[] output=new int[2];
	        for(i=0;i<nums.length-1;i++){   
	                for(int j=i+1;j<nums.length;j++){
	                    if(nums[i]+nums[j]==target){
	                        output[0]=i;
	                        output[1]=j;      
	                        return output;
	                    }
	                 }
	        }
	    return output;
	}
}
