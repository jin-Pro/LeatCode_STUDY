package easy;

import java.util.Arrays;

public class No_136_SingleNumber {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);      // 배열 정렬
        
        if (nums.length == 1){  // 개수가 한 개이면
            return nums[0];
        }
        
        else{
            for(int i = 0; i < nums.length; i += 2){
                if(i == nums.length - 1){       // 마지막 요소 전까지 문제가 없었으면
                    return nums[i];
            }
                if(nums[i] != nums[i+1]){       // 홑 숫자가 나타나면
                    return nums[i];
            }
        }
    }
        return -1;
    }
}
