class Solution {

    public int helper(int sr, int sc, int er, int ec, int[][] dir, int[][] visited, int[][] dp) {
        if (sr == er && sc == ec) {
            dp[sr][sc] = 1;
        }

        if (dp[sr][sc] != 0) return dp[sr][sc];

        visited[sr][sc] = 1;
        int count = 0;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r <= er && c <= ec && visited[r][c] == 0) {
                count += helper(r, c, er, ec, dir, visited, dp);
                //dp[r][c] = count;
            }
        }

        visited[sr][sc] = 0;

        return dp[sr][sc] = count;
    }

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        if (obstacleGrid[0][0] == 1 || obstacleGrid[m - 1][n - 1] == 1) return 0;

        int dir[][] = { { 0, 1 }, { 1, 0 } };
        int dp[][] = new int[m+1][n+1];
        return helper(0, 0, m - 1, n - 1, dir, obstacleGrid, dp);
    }
}
