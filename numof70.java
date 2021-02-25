package java_LEET;

public class numof70 {
	public int combination(int i, int n) { 
        if (i > n) {
            return 0;
        }
        if (i == n) {
            return 1;
        }
        return combination(i + 1, n) +combination(i + 2, n);
    }
	public int climbStairs(int n) {
        int cnt=combination(0,n);
        return cnt;
    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}

}
