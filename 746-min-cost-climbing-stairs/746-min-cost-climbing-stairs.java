class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp=new int[cost.length+1];
        return solve(cost,dp,cost.length);
    }
    public int solve(int[] cost,int []dp,int n) {
        if(n==0)return dp[n]=cost[n];
        if(n<0)return 0;
        if(dp[n]!=0)return dp[n];
        int f1=solve(cost,dp,n-1);
        int f2=solve(cost,dp,n-2);
        return dp[n]=Math.min(f1,f2)+(n==cost.length?0:cost[n]);
        
    }

}