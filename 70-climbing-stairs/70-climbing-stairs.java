class Solution {
    public int climbStairs(int n) {
        int[]dp=new int[n+1];
       return solver(n,dp) ;
    }
    public int solver(int n,int[]dp) {
        if(n<0)
        {
            return 0;
        }
        if(n==0)
        {
            return 1;
        }
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int f1=solver(n-1,dp);
        int f2=solver(n-2,dp);
        return dp[n]=f1+f2;
    }
}