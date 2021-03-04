package LeetCode;

public class No_53_Maximum_Subarray {
	public int maxSubArray(int[] nums) {
		int max = nums[0];
		int answer = max;
		
		for(int i = 1; i < nums.length; i++) {
			max = Math.max(nums[i], answer + nums[i]);
			answer = Math.max(answer, max);
		}
		
		return answer;
    }
}

//Runtime: 0 ms, faster than 100.00% of Java
//Memory Usage: 38.9 MB, less than 71.63% of Java
