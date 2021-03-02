public class Solution {
    public int climbStairs(int n) {
        if (n == 1) {
            return 1;
        }
        int[] dp = new int[n + 1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
/*n=4
=1c0
2 2 =2c2
1 1 2 =3c1
2 1 1 
1 1 1 1 4c0 
--------------
n=5

2 2 1=3c2
1112=4c1
11111=5c0
--------------
n=6
222=3c3=1

1122=4c2=6

11112=5c1=5

111111=6c0=1

*/
//컨비네이션 사용//동적 계산법 사용