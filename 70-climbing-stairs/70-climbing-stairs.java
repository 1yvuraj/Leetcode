// class Solution {
//     public int climbStairs(int n) {
//         int []dp=new int[n+1];
//         return help(n,dp);
//     }
//     public int help(int n,int[]dp) {
//         for(int i=dp.length-1;i>=0;i--){
       
//         if(n==0){
//             dp[i]=1;
//             continue;
//         }
//         dp[i]+=dp[i-1];
//         if(i-2>=0)
//         {
//           dp[i]+=dp[i-2];
//         }
//         return dp[];
//         }
//     }
// }
class Solution {
    public int climbStairs(int n) {
        int[]dp=new int[n+1];
        return help(n,dp);
    }
    public int help(int n,int[]dp) {
        if(n<0)return 0;
        if(n==0)return 1;
        if(dp[n]!=0)
        {
            return dp[n];
        }
        int f1=help(n-1,dp);
        int f2=help(n-2,dp);
        return dp[n]=f1+f2;
    }
}