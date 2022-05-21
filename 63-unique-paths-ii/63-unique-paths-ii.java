class Solution {

    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int[][] dir = { { 1, 0 }, { 0, 1 } };
        int[][] dp = new int[obstacleGrid.length][obstacleGrid[0].length];
        if(obstacleGrid[0][0]==1 || obstacleGrid[obstacleGrid.length-1][obstacleGrid[0].length-1]==1)return 0;
        return help(0, 0, obstacleGrid.length - 1, obstacleGrid[0].length - 1, dir,obstacleGrid,dp);
    }

    public int help(int sr,int sc,int er,int ec,int[][]dir,int[][] obstacleGrid,int[][]dp) {
        if (sr == er && sc == ec) return dp[sr][sc]=1;
        if(dp[sr][sc]!=0)
        {
            return dp[sr][sc];
        }
        int count = 0;
        obstacleGrid[sr][sc]=1;
        for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if (r >= 0 && c >= 0 && r <= er && c <= ec && obstacleGrid[r][c]==0) {
                count += help(r, c, er, ec, dir,obstacleGrid,dp);
            }
        }
        obstacleGrid[sr][sc]=0;
        return dp[sr][sc]=count;
    }
}
