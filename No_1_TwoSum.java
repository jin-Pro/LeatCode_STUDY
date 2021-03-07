package easy;

public class No_1_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int location1 = 0;
        int location2 = -1;
        
        for (int i = 0; i < nums.length; i++){
            int leftover = target - nums[i];
            location1 = i;
            for (int j = i+1; j < nums.length; j++){
                if (nums[j] == leftover){
                    location2 = j;
                    break;
                }
            }
            if (location2 != -1)
                break;
        }
        
        int[] result = {location1, location2};
        
        return result;
    }
}