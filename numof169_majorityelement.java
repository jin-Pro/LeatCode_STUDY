package java_LEET;


import java.util.HashMap;
import java.util.Map;

public class numof169_majorityelement {
	public static void main(String[] args) {
		int[] nums = new int[7];
		nums[0] = -1;
		nums[1] = 100;
		nums[2] = 2;
		nums[3] = 100;
		nums[4] = 100;
		nums[5] = 4;
		nums[6] = 100;
		int max=0;
		/*{-1=1, 2=1, 100=4, 4=1} 키=value*/
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		for(int i:nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		for(int i:map.values()) {
			 if(max<i) {
				 max=i;
			 }	
		}
		
		System.out.println(getKey(map,max));

		
	}
	public static <K, V> K getKey(Map<K, V> map, V value) {
		 
        for (K key : map.keySet()) {
            if (value.equals(map.get(key))) {
                return key;
            }
        }
        return null;
       }
/*	public int majorityElement(int[] nums) {
		//최빈값 구하기!
		//n/2
		
		Map<Integer, Integer> map= new HashMap<Integer, Integer>();
		for(int i:nums) {
			map.put(i, map.getOrDefault(i, 0)+1);
		}
		return map;
		
		
		
    }
    */
}
