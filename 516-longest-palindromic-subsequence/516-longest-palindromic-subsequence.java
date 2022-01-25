class Solution {
    public int longestPalindromeSubseq(String s) {
        int[][]dp=new int[s.length()+1][s.length()+1];
        return ok(s,0,s.length()-1,dp);
    }
    public int ok(String s,int n,int m,int [][]dp)
    {
        if(n>m)
        {
            return 0;
        }
        if(n==m)
        {
            return 1;
        }
        if(dp[n][m]!=0)
        {
            return dp[n][m];
        }
        int f1=0;
        if(s.charAt(n)==s.charAt(m))
        {
             f1=ok(s,n+1,m-1,dp)+2;
        }
        else{
             f1=Math.max(ok(s,n,m-1,dp),ok(s,n+1,m,dp));
        }
        return dp[n][m]=f1;
    }
    
}