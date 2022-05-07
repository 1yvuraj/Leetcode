class Solution {
    public int minDistance(String s1, String s2) {
        int[][]dp=new int[s1.length()+1][s2.length()+1];
        return minDistance_memo(s1,s2,s1.length(),s2.length(),dp);
    }
    public static int minDistance_memo(String s1,String s2, int n, int m, int[][] dp) {
       if (n == 0 || m == 0) {
            return dp[n][m] = n != 0 ? n : m;
        }

        if (dp[n][m] != 0)
            return dp[n][m];

        int a = minDistance_memo(s1, s2, n - 1, m - 1, dp);
        int b = minDistance_memo(s1, s2, n - 1, m, dp);
        int c = minDistance_memo(s1, s2, n, m - 1, dp);

        if (s1.charAt(n -1) == s2.charAt(m - 1))
            return dp[n][m] = a;
        else
            return dp[n][m] = Math.min(Math.min(a, b), c) + 1; 
    }
}