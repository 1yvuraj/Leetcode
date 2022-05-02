class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int [][]dp=new int[obstacleGrid.length][obstacleGrid[0].length];
        if(dp[0][0]==1)
        {
            return 0;
        }
       return  uniquePathsWithObstacless(obstacleGrid,0,0,obstacleGrid.length-1,obstacleGrid[0].length-1,dp);
    }
     public static int  uniquePathsWithObstacless(int [][] obstacleGrid,int sr, int sc, int dr, int dc,int[][] dp)
  {
    if(sr>dr ||sc>dc||obstacleGrid[sr][sc]!=0)
    {
        return 0;
    }
    if (sr == dr  && sc == dc )
    {
      return dp[sr][sc]=1 ;
    }
     
    if(sr>dr||sc>dc)
      return 0;
     if(dp[sr][sc]!=0) return dp[sr][sc];
    

     int r=uniquePathsWithObstacless(obstacleGrid,sr, sc + 1, dr, dc,dp);


     int c=uniquePathsWithObstacless(obstacleGrid,sr + 1, sc, dr, dc,dp);
      return dp[sr][sc]=r+c;



  }

}