class Solution {
    public int numDistinct(String s, String t) {
         int[][] dp = new int[s.length() + 1][t.length()+ 1];
        for (int[] d : dp)
              Arrays.fill(d, -1);
        return numDistinct_memo(s,t,s.length(),t.length(),dp);
    }
    public int numDistinct_memo(String s1, String s2, int n, int m, int[][] dp) {
        // if(n==0)return dp[n][m]=0;
        // else if(m==0)return dp[n][m]=1;
        if (m == 0)
            return dp[n][m] = 1;
        else if (n == 0)
            return dp[n][m] = 0;

        if (dp[n][m] != -1)
            return dp[n][m];

        int a = numDistinct_memo(s1, s2, n - 1, m - 1, dp);
        int b = numDistinct_memo(s1, s2, n - 1, m, dp);

        if (s1.charAt(n-1) == s2.charAt(m - 1))
            return dp[n][m] = a+b;
        else
            return dp[n][m] = b;
    }

  
}