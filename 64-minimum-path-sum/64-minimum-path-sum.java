class Solution {
    public int minPathSum(int[][] grid) {
        int m=grid.length;
        int n=grid[0].length;
        int [][]dir = { { 1,0 }, { 0,1} };
        int [][]dp = new int[m][n];
        return mazePath2(0, 0, m - 1, n - 1, dir, grid, dp);
    }
    public static int mazePath2( int sr,int sc,int er, int ec,int[][]dir,int[][]grid, int[][] dp)    {
        if (sr == er && sc == ec) {
            return grid[sr][sc];
        }
        if (dp[sr][sc] != 0) return dp[sr][sc];
       
        int min=(int)1e9;
         for (int d = 0; d < dir.length; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];
            if(r >= 0 && c >= 0 && r <= er && c <= ec) {
                
                min = Math.min(min,mazePath2(r, c, er, ec, dir, grid, dp));
                
            }
        }
         
        return dp[sr][sc] = min+grid[sr][sc];
    }
}
