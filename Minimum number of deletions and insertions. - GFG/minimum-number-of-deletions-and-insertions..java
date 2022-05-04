// { Driver Code Starts
//Initial Template for Java
import java.io.*;
import java.util.*;
class GfG
{
    public static void main(String args[])
        {
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while(t-->0)
                {
                    String s1 = sc.next();
                    String s2 = sc.next();
                    Solution ob = new Solution();
                    System.out.println(ob.minOperations(s1,s2));
                }
        }
}    // } Driver Code Ends


//User function Template for Java

class Solution
{
	public int minOperations(String s1, String s2) 
	{ 
	    // Your code goes here
	    int[][]dp=new int[s1.length()+1][s2.length()+1];
        return minDistance_tabu(s1,s2,s1.length(),s2.length(),dp);
	} 
	public static int minDistance_tabu(String s1, String s2, int N, int M, int[][] dp) {
        for (int n = 0; n <= N; n++) {
            for (int m = 0; m <= M; m++) {
                if (n == 0 || m == 0) {
                    dp[n][m] = n != 0 ? n : m;
                    continue;
                }
                if (s1.charAt(n - 1) == s2.charAt(m - 1))
                    dp[n][m] = dp[n - 1][m - 1];
                else
                    dp[n][m] = Math.min(dp[n][m - 1], dp[n - 1][m]) + 1;
            }
        }

        return dp[N][M];
    }
}