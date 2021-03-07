package easy;

public class No_53_Maximum_Subarray {
    public int maxSubArray(int[] nums) {
        if(nums.length == 1)
            return nums[0];
        
        int sumMax = -1000000;
        int sum = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] > 0){
                sum += nums[i];
                
                for(int j = i + 1; j < nums.length; j++){
                    sum += nums[j];
                    if(sumMax < sum){
                        sumMax = sum;
                    }
                }
            }
                sum = 0;
        }
        
        Arrays.sort(nums);

        return Math.max(sumMax, nums[nums.length-1]);
    }
}