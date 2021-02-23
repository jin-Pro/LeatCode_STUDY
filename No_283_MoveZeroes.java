package easy;

public class No_283_MoveZeroes {
    void moveZeroes(int[] nums) {
        int location = 0;
        
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != 0){
                nums[location] = nums[i];
                location++;
            }
        }
        for(int i = location; i < nums.length; i++){
            nums[i] = 0;
        }
    }
}