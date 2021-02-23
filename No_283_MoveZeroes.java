package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class No_283_MoveZeroes {
	public void moveZeroes(int[] nums) {
        List<Integer> copyNum = new ArrayList<Integer>();
        int zeroCount = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] == 0){
                zeroCount ++;
                continue;
            }
            copyNum.add(nums[i]);
        }
        
        for(int i = 0; i < zeroCount ; i++){
            copyNum.add(0);
        }
        
        for(int i = 0; i < copyNum.size(); i++){
            nums[i] = copyNum.get(i);
        }
    }
	
	//Runtime: 1 ms, faster than 19.16% 
	//Memory Usage: 39.5 MB, less than 38.43% 
}
