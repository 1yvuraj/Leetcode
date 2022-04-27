class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int []dp=new int[cost.length+1];
        return solve(cost,dp,cost.length);
    }
    public int solve(int[] cost,int []dp,int n) {
        
        if(n<=1)return dp[n]=cost[n];
        if(dp[n]!=0)return dp[n];
        int f1=solve(cost,dp,n-1);
        int f2=solve(cost,dp,n-2);
        return dp[n]=Math.min(f1,f2)+(n==cost.length?0:cost[n]);
        
    }
//     public int solve(int[] cost,int[]dp) {
//         dp[0]=cost[0];
//          dp[1]=Math.min(cost[0],cost[1]);
//         for(int i=2;i<cost.length;i++)
//         {
//             dp[i]=Math.min(dp[i-2],dp[i-1])+cost[i];
//         }
//         return dp[dp.length-1];
        
//     }
}