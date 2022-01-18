class Solution {
    public int numSquares(int n) {
        int []dp=new int[n+1];
        dp[0]=0;
        dp[1]=1;
        int min=Integer.MAX_VALUE;
        for(int i=2;i<dp.length;i++)
        {   min=Integer.MAX_VALUE;
            for(int j=1;j*j<=i;j++)
            {
                min=Math.min(dp[i-j*j],min);
            }
            dp[i]=min+1;
        }
        return dp[dp.length-1];
        
    }
}