class Solution {
    public int coinChange(int[] coins, int amount) {
        int dp[][]=new int[amount+1][coins.length+1];
        //Arrays.fill(dp,-1);
        int ans=coinChange(coins,amount,0,dp);
        return ans==(int)1e9?-1:ans;
    }
    
    public int coinChange(int[] coins, int tar,int idx,int dp[][]){
        if(tar==0){
            return dp[tar][idx]=0;
        }
        if(dp[tar][idx]!=0){
            return dp[tar][idx];
        }
        int minCoins=(int)1e9;
        for(int i=idx;i<coins.length;i++){
            if(tar-coins[i]>=0){
                int recMin=coinChange(coins,tar-coins[i],i,dp);
                if(recMin!=(int)1e9 && recMin+1<minCoins){
                    minCoins=recMin+1;
                }
            }
        }
        return dp[tar][idx]= minCoins;
    }
}