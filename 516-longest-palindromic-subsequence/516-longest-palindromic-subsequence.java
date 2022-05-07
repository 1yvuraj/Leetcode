class Solution {
    public int longestPalindromeSubseq(String s) {
       int i=0;
	   int j=s.length()-1;
	   int dp[][]=new int[s.length()][s.length()];
	   for(int[] d:dp) Arrays.fill(d,-1);
	   return longestPlaindromicSubsequence_memo(s,i,j,dp);
    }
   public static int longestPlaindromicSubsequence_memo(String str, int i, int j, int[][] dp) {
         if(i>=j)
         {
             return dp[i][j]=i==j?1:0;
         }
         if(dp[i][j]!=-1)return dp[i][j];
         int a=longestPlaindromicSubsequence_memo(str,i+1,j-1,dp);
         int b=longestPlaindromicSubsequence_memo(str,i+1,j,dp);
         int c=longestPlaindromicSubsequence_memo(str,i,j-1,dp);
         if(str.charAt(i)==str.charAt(j))
         {
             return dp[i][j]=a+2;
         }else{
             return dp[i][j]=Math.max(b,c);
         }
      }
  
}