class Solution {
    public int minPathSum(int[][] grid) {
        int[][]dp=new int[grid.length][grid[0].length];
        return help(grid,0,0,dp);
    }
    public static int help(int[][]arr,int i,int j,int[][]dp) {
    if(i>=arr.length || j>=arr[0].length)return Integer.MAX_VALUE-1;
    if(i==arr.length-1 && j==arr[0].length-1)return arr[i][j];
    if(dp[i][j]!=0)return dp[i][j];
    int f1=help(arr,i,j+1,dp);
    int f2=help(arr,i+1,j,dp);
     
     return dp[i][j]=Math.min(f1,f2)+arr[i][j];
    
  }
}