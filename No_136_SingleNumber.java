package LeetCode;

public class No_136_SingleNumber {
	public int singleNumber(int[] nums) {
        if(nums.length == 1) return nums[0];
        int target = 0;
        
        int max = -30000;
        int min = 30000;
        
        for(int i = 0; i < nums.length; i++) {
        	if(max < nums[i]) max = nums[i];
        	if(min > nums[i]) min = nums[i];
        }
        
        int fromMaxtoMin = max - min;
        
        int[] count = new int[fromMaxtoMin + 1];
        
        for(int i = 0; i < nums.length; i++) {
        	count[nums[i] - min] ++;
        }
        
        for(int i = 0; i < count.length; i++) {
        	if(count[i] == 1) {
        		target = i;
        	}
        }
        
        return count[target] + min;
    }
}
