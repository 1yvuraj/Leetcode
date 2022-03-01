// class Solution {
//      //recrsion
//     public int minCostClimbingStairs(int[] cost) {
//         int[] dp = new int[cost.length + 1];
//         int f1 = minCostClimbingStairss(cost, dp);
//         return f1;
//     }

//     public int minCostClimbingStairss(int[] cost, int[] dp) {
//         for (int idx = 0; idx < dp.length; idx++) {
//             if (idx == 0 || idx == 1) {
//                 dp[idx] = 0;
//                 continue;
//             }
//             int f1 = 0;
//             int f2 = 0;
//             if (idx - 2 >= 0) f1 = cost[idx - 2] + dp[idx - 2];
//             if (idx - 1 >= 0) f2 = cost[idx - 1] + dp[idx - 1];
//             dp[idx] = Math.min(f1, f2);
//         }
//         return dp[dp.length - 1];
//     }
// }
class Solution {
    //recrsion
    public int minCostClimbingStairs(int[] cost) {
        int[]dp=new int[cost.length+1];
       int f1=minCostClimbingStairss(cost,cost.length,dp);
       return f1;
     }
    public int minCostClimbingStairss(int[] cost,int idx,int[]dp) 
    {
        if(idx<0)
        {
            return 0;
        }
        if(idx==0||idx==1)
        {
            return 0;
        }
        if(dp[idx]!=0)
        {
            return dp[idx];
        }
        int f1=cost[idx-2]+minCostClimbingStairss(cost,idx-2,dp);
         int f2=cost[idx-1]+minCostClimbingStairss(cost,idx-1,dp);
        return dp[idx]=Math.min(f1,f2);
    }
}
