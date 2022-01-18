class Solution {
    public int maximalSquare(char[][] matrix) {
        int[][]dp=new int[matrix.length][matrix[0].length];
        int max=0;
        for(int i=dp.length-1;i>=0;i--)
        {
            for(int j=dp[0].length-1;j>=0;j--)
            {
                if(matrix[i][j]=='0')
                {
                    dp[i][j]=0;
                }
                else if(j==matrix[0].length-1)
                {
                    dp[i][j]=matrix[i][j]-'0';
                }
                else if(i==matrix.length-1)
                {
                   dp[i][j]=matrix[i][j]-'0'; 
                }
                else
                {
                    
                    dp[i][j]=Math.min(dp[i][j+1],Math.min(dp[i+1][j+1],dp[i+1][j]))+1;
                }
                 if(max<dp[i][j])
		        {
		            max=dp[i][j];
		        }
		        
            }
        }
        
        return max*max;
    }
}