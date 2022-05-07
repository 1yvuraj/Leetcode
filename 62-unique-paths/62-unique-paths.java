class Solution {

    public int uniquePaths(int m, int n) {
        int[][] dir = { { 1, 0 }, { 0, 1 } };
        String[] dirS = { "V", "H" };
        int[][] dp = new int[m][n];
        return mazePath2(0, 0, m - 1, n - 1, dir, dirS, dp);
    }

    public static int mazePath2(int sr, int sc, int er, int ec, int[][] dir, String[] dirS, int[][] dp) {
        if (sr == er && sc == ec) {
            return 1;
        }
        if (dp[sr][sc] != 0) return dp[sr][sc];
        int count = 0;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if (r >= 0 && c >= 0 && r <= er && c <= ec) {
                count += mazePath2(r, c, er, ec, dir, dirS, dp);
            }
        }
        return dp[sr][sc] = count;
    }
}
