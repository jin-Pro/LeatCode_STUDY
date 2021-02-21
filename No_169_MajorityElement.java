package LeetCode;

import java.util.Arrays;

public class No_169_MajorityElement {
	public static void main(String[] args) {
		int[] nums = new int[7];
		nums[0] = -1;
		nums[1] = 100;
		nums[2] = 2;
		nums[3] = 100;
		nums[4] = 100;
		nums[5] = 4;
		nums[6] = 100;
		
		int answer = majorityElement(nums);
		
		System.out.println(answer);
	}
	
	public static int majorityElement(int[] nums) {
        int answer = 0;
        int compAnswer = 1;
        Arrays.sort(nums);
        int target = nums[0];
        int compTarget = nums[0];
        
        for(int i = 1; i < nums.length; i++) {
        	if(compTarget == nums[i]) {
        		compAnswer ++;
        	}else {
        		if(compAnswer > answer) {
        			answer = compAnswer;
        			target = compTarget;
        			compAnswer = 1;
        		}
    			compTarget = nums[i];
        	}
        }
        
        if(compAnswer > answer) {
			answer = compAnswer;
			target = compTarget;
        }
        
        return target;
	}
}
