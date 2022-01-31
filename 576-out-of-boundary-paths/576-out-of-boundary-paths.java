class Solution {
    int c=0;
     int mod=(int)1e9+7;
    public int findPaths(int m, int n, int maxMove, int startRow, int startColumn) {
       int[][][]dp=new int[m+1][n+1][maxMove+1];
        for(int[][] c1 : dp)
        for(int[] c2 : c1)
        Arrays.fill(c2,-1);
         
        return ok(m,n,maxMove,startRow,startColumn,dp) % mod;
    }
    public int ok(int m,int n,int maxMove,int startRow,int startColumn,int[][][]dp)
    {
        if(startRow<0 || startColumn<0|| startRow>=m || startColumn>=n)
        {
            
            return 1;
        }
        if(maxMove==0)
        {
            return 0;
        }
        if(dp[startRow][startColumn][maxMove]!=-1)
        {
            return dp[startRow][startColumn][maxMove];
        }
     int ans = 0;
          ans =  (ans + ok(m,n,maxMove-1,startRow+1,startColumn,dp))%mod;
           ans =(ans + ok(m,n,maxMove-1,startRow-1,startColumn,dp))%mod;
           ans = (ans + ok(m,n,maxMove-1,startRow,startColumn+1,dp))%mod;
           ans =(ans + ok(m,n,maxMove-1,startRow,startColumn-1,dp))%mod;
        
        return dp[startRow][startColumn][maxMove]= ans % mod;
    }
}