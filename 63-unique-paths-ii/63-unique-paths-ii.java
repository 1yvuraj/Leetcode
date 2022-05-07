class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) return 0;

        int dir[][] = { { 0, 1 }, { 1, 0 } };
        int dp[][] = new int[m][n];
        return mazePath2(0, 0, m - 1, n - 1, dir, obstacleGrid, dp);
    }
     public static int mazePath2(int sr, int sc, int er, int ec, int[][] dir,int[][]obstacleGrid, int[][] dp) {
        if (sr == er && sc == ec) {
            return 1;
        }
        if (dp[sr][sc] != 0) return dp[sr][sc];
        int count = 0;
         
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if (r >= 0 && c >= 0 && r <= er && c <= ec && obstacleGrid[r][c]!=1) {
                obstacleGrid[r][c]=1;
                count += mazePath2(r, c, er, ec, dir, obstacleGrid, dp);
                obstacleGrid[r][c]=0;
            }
        }
         
        return dp[sr][sc] = count;
    }
}
