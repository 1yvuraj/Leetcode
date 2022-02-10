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
    public static int LCSub(String first,String second,int n,int m){
        int[][] dp = new int[n+1][m+1];
        int max = 0;
        /*
        if the characters at the end are the same then check inwards
        else the string is not common and the size is reset to 0
        keep storing the max size that can be found
         */
        for(int i=1;i<n+1;i++){
            for(int j=1;j<m+1;j++){
                if(first.charAt(i-1)==second.charAt(j-1)){
                    dp[i][j] = 1 + dp[i-1][j-1];
                }else{
                    dp[i][j] = 0;
                }
                max = Math.max(max,dp[i][j]);
            }
        }
        return max;
    }
}