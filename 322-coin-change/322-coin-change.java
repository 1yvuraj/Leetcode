class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[]=new int[amount+1];
        Arrays.fill(dp,-1);
        int ans=coinChange(coins,amount,dp);
        return ans==(int)1e9?-1:ans;
    }
    
    public int coinChange(int[] coins, int tar,int dp[]){
        if(tar<0)return (int)1e9;
        if(tar==0){
            return dp[tar]=0;
        }
        if(dp[tar]!=-1){
            return dp[tar];
        }
        int minCoins=(int)1e9;
        for(int i=0;i<coins.length;i++){
            minCoins=Math.min(minCoins,coinChange(coins,tar-coins[i],dp)+1);
        }
        return dp[tar]= minCoins;
    }
}