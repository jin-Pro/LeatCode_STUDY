package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class No_448_FindAllNumbersDisappearedinanArray {
	public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> answer = new ArrayList<Integer>();
        
        int[] count = new int[nums.length];
        
        for(int i = 0; i < nums.length; i++) {
        	count[nums[i]-1] ++;
        }
        
        for(int i = 0; i < count.length; i++) {
        	if(count[i] == 0) {
        		answer.add(i+1);
        	}
        }
        
        return answer;
    }
	//Runtime: 3 ms, faster than 100.00% 
	//Memory Usage: 48.1 MB, less than 60.62% 
}
