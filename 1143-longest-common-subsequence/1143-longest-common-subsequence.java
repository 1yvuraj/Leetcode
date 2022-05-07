class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        int[][]dp=new int[text1.length()+1][text2.length()+1];
        for (int[] d : dp)
            Arrays.fill(d, -1);
        return longestPlaindromicSubsequence_memo(text1,text2,text1.length(),text2.length(),dp);
    }
     public static int longestPlaindromicSubsequence_memo(String s1,String s2, int n, int m, int[][] dp) {
         if(n==0 || m==0)
         {
             return dp[n][m]=0;
         }
         if(dp[n][m]!=-1)return dp[n][m];
         int a=longestPlaindromicSubsequence_memo(s1,s2,n-1,m-1,dp);
         int b=longestPlaindromicSubsequence_memo(s1,s2,n-1,m,dp);
         int c=longestPlaindromicSubsequence_memo(s1,s2,n,m-1,dp);
         if(s1.charAt(n-1)==s2.charAt(m-1))
         {
             return dp[n][m]=a+1;
         }else{
             return dp[n][m]=Math.max(b,c);
         }
    }
}