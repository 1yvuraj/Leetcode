class Solution {
    public int nthUglyNumber(int n) {
       int[]dp=new int[n+1];
        dp[1]=1;
        int p1=1;
        int p2=1;
        int p3=1;
        for(int i=2;i<dp.length;i++)
        {
            int f1=2*dp[p1];
            int f2=3*dp[p2];
            int f3=5*dp[p3];
            int ans=Math.min(f1,Math.min(f2,f3));
            dp[i]=ans;
            if(ans==f1)
            {
                p1++;
            }
            if(ans==f2)
            {
                p2++;
            }
            if(ans==f3)
            {
                p3++;
            }
        }
        return dp[n];
    }
}