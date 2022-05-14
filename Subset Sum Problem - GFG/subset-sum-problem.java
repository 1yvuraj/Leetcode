// { Driver Code Starts
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
            int N = Integer.parseInt(read.readLine());
            String input_line[] = read.readLine().trim().split("\\s+");
            int arr[]= new int[N];
            for(int i = 0; i < N; i++)
                arr[i] = Integer.parseInt(input_line[i]);
            int sum = Integer.parseInt(read.readLine());

            Solution ob = new Solution();
            if(ob.isSubsetSum(N, arr, sum))
            System.out.println(1);
            else
            System.out.println(0);

            
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        Boolean[][] dp = new Boolean[N+1][sum+1];
        return helper(arr.length,arr,sum,dp);
    } 
    public static boolean helper(int n , int[] arr , int sum , Boolean[][] dp){
        // base case 
         if(n==0 || sum==0)
         {
             return dp[n][sum]=sum==0?true:false;
         }
         if(dp[n][sum]!=null)return dp[n][sum] ;
         boolean res=false;
         if(sum-arr[n-1]>=0)
         {
             res=res||helper(n-1,arr,sum-arr[n-1],dp);
         }
         res=res||helper(n-1,arr,sum,dp);
         return dp[n][sum]=res;
         
         
    }
}