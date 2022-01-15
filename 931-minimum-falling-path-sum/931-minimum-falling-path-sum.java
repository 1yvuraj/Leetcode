class Solution {
    public int minFallingPathSum(int[][] matrix) {
        int min=Integer.MAX_VALUE;
        int [][]dp=new int[matrix.length][matrix[0].length];
       for(int i=0;i<matrix.length;i++)
       {
           min=Math.min(min,ok(matrix,0,i,dp));
       }
        return min;
    }
    public int ok(int[][] matrix,int row,int col,int[][]dp)
    {
        
        if(row<0||col<0||row>=matrix.length||col>=matrix[0].length)
        {
            return Integer.MAX_VALUE;
        }
        if(row==matrix.length-1)
        {
            return matrix[row][col];
        }
        if(dp[row][col]!=0)
        {
            return dp[row][col];
        }
        int h=ok(matrix,row + 1,col - 1,dp);
        int v=ok(matrix,row + 1,col,dp);
        int d=ok(matrix,row + 1,col +1,dp);
        return dp[row][col]=Math.min(h,Math.min(v,d))+matrix[row][col];
    }
    
}