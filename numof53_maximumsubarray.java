package java_LEET;

public class numof53_maximumsubarray {
	public int maxSubArray(int[] nums) {
        int curMax = nums[0];
        int max = nums[0];
        for(int i=1;i<nums.length;i++) {
           curMax= Math.max(nums[i],curMax+nums[i]);
           if(curMax > max) {
               max = curMax;
           } 
        }
        return max;
    }   
}
