package LeetCode;

public class No_70_ClimbingStairs {
	 static Integer[] cache;
	    
	    public static int climbStairs(int n) {
	       cache = new Integer[n+1];
	        
	       return helper(n);
	    }
	    
	    public static int helper(int n){
	        if(cache[n] == null){
	            if(n == 0) return cache[0] = 1;
	            if(n == 1) return cache[1] = 1;
	            cache[n] = helper(n-1) + helper(n-2);
	        }
	        return cache[n];
	    }
	    
	    public static void main(String[] args) {
			System.out.println(climbStairs(5));
		}
}

//Runtime: 0 ms, faster than 100.00%
//Memory Usage: 35.4 MB, less than 96.72%