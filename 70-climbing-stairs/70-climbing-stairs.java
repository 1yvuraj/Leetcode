class Solution {

    public int climbStairs(int n) {
        int[] dp = new int[n + 1];
        return solver(n, dp);
    }

    //     public int solver(int n,int[]dp) {

    //      if(n<0)return 0;
    //      if(n<=0)return 1;
    //      if(dp[n]!=0)return dp[n];
    //      return dp[n]=solver(n-1,dp)+solver(n-2,dp);
    //     }
    public int solver(int N, int[] dp) {
        for (int n = 0; n <= N; n++) {
            if (n <= 0) {
                dp[n] = 1;
                continue;
            }
            dp[n] += dp[n - 1] ;
                if(n-2>=0){
                dp[n] +=dp[n - 2];
                }
        }
        return dp[N];
    }
}
