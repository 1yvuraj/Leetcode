class Solution {
    public boolean PredictTheWinner(int[] nums) {
        int[][]dp=new int[nums.length][nums.length];
        for(int gap=0;gap<dp[0].length;gap++)
        {
            for(int i=0,j=gap;j<dp[0].length;j++,i++)
            {
                if(gap==0)
                {
                    dp[i][j]=nums[i];
                }
                else if(gap==1)
                {
                    dp[i][j]=Math.max(nums[i],nums[j]);
                }
                else{
                    int val1=nums[i]+Math.min(dp[i+2][j],dp[i+1][j-1]);
                    int val2=nums[j]+Math.min(dp[i+1][j-1],dp[i][j-2]);
                    dp[i][j]=Math.max(val1,val2);
                }
            }
        }
        int p2=0;
        for(int i=0;i<nums.length;i++)
        {
            p2+=nums[i];
        }
        return p2-dp[0][dp[0].length-1]>dp[0][dp[0].length-1]?false:true;
    }
}