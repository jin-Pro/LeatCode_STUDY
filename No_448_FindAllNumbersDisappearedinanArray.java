package easy;

import java.util.ArrayList;
import java.util.List;

public class No_448_FindAllNumbersDisappearedinanArray {
    List<Integer> findDisappearedNumbers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<Integer>();
            int[] exist = new int[nums.length+1];
            for(int i = 0; i < nums.length; i++){
                exist[nums[i]]++;
            }
        
            for(int i = 1; i < exist.length; i++){
                if(exist[i] == 0){
                    list.add(i);
                }
            }
        
        return list;
    }
}