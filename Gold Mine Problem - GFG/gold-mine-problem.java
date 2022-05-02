// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG{
    public static void main(String args[])throws IOException
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(in.readLine());
        while(t-- > 0){
            String inline[] = in.readLine().trim().split("\\s+");
            int n = Integer.parseInt(inline[0]);
            int m = Integer.parseInt(inline[1]);
            String inline1[] = in.readLine().trim().split("\\s+");
            int M[][] = new int[n][m];
            for(int i = 0;i < n*m;i++){
                M[i/m][i%m] = Integer.parseInt(inline1[i]);
            }
            
            Solution ob = new Solution();
            System.out.println(ob.maxGold(n, m, M));
        }
    }
} // } Driver Code Ends


//User function Template for Java

class Solution{
    static int maxGold(int n, int m, int M[][])
    {
        int[][] dp = new int[n][m];
       int[][] dir = {{0, 1}, {1, 1}, {-1, 1}};
        int max=-(int)1e9;
        for(int []d:dp)Arrays.fill(d,-1);
        for(int i=0;i<M.length;i++)
        {
           max=Math.max(max,solve(n-1,m-1,M,dp,i,0,dir));
        }
        return max;
    }
    static int solve(int n, int m, int M[][],int[][] dp,int sr,int sc,int [][]dir)
    {
        
        if(sc==m) return M[sr][sc];
        int max=-(int)1e9;
        if(dp[sr][sc]!=-1)return dp[sr][sc];
        for(int d=0;d<dir.length;d++)
        {
            int r=sr+dir[d][0];
            int c=sc+dir[d][1];
            if(r>=0 && c>=0 && r<=n && c<=m)
            max=Math.max(max,solve(n,m,M,dp,r,c,dir));
            
        }
        return dp[sr][sc]=max+M[sr][sc];
    }
}