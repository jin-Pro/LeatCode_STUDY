package easy;

import java.util.Arrays;

public class No_169_MajorityElement {
	int majorityElement(int[] nums) {
        Arrays.sort(nums);

        return nums[nums.length/2];
    }
}
