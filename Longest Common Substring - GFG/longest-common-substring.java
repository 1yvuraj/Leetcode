// { Driver Code Starts
//Initial Template for Java

import java.io.*;
import java.util.*;

class GFG
{
    public static void main(String args[])throws IOException
    {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(read.readLine());
        while(t-- > 0)
        {
            String input[] = read.readLine().trim().split(" ");
            int n = Integer.parseInt(input[0]);
            int m = Integer.parseInt(input[1]);
            
            String S1 = read.readLine().trim();
            String S2 = read.readLine().trim();

            Solution ob = new Solution();
            System.out.println(ob.longestCommonSubstr(S1, S2, n, m));
        }
    }
}// } Driver Code Ends


//User function Template for Java

class Solution{
    int longestCommonSubstr(String S1, String S2, int n, int m){
        return LCSub(S1,S2,n,m);
    }
    public static int LCSub(String first,String second,int N,int M){
      int[][]dp=new int[first.length()+1][second.length()+1];
      int max=-1;
      for(int n=0;n<=N;n++)
      {
          for(int m=0;m<=M;m++)
          {
              if(n==0||m==0)
              {
                  dp[n][m]=0;
                  continue;
              }
              if(first.charAt(n-1)==second.charAt(m-1))
              {
                  dp[n][m]=dp[n-1][m-1]+1;
              }else{
                  dp[n][m]=0;
              }
              max=Math.max(max,dp[n][m]);
          }
          
      }
      return max;
    }
}