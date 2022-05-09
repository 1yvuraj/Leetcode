// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.lang.*;
import java.io.*;
class GFG
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while(T-->0)
        {
            int n = Integer.parseInt(br.readLine().trim());
            String s = br.readLine().trim();
            String[] s1 = s.split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < s1.length; i++)
                nums[i] = Integer.parseInt(s1[i]);
            Solution ob = new Solution();
            int ans = ob.LongestBitonicSequence(nums);
            System.out.println(ans);           
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int LongestBitonicSequence(int[] nums)
    {
       int maxs=Integer.MIN_VALUE;
       int[]LIS=new int[nums.length];
       int[]LDS=new int[nums.length];
       lis(nums,LIS);
       lds(nums,LDS);
       for(int i=0;i<nums.length;i++)
       {
           maxs=Math.max(LIS[i]+LDS[i]-1,maxs);
       }
       return maxs;
    }
    public int lis(int[] nums,int[]dp)
    {
        
        int maxs=Integer.MIN_VALUE;
       for(int i=0;i<nums.length;i++) 
       {
           int max=0;
           for(int j=0;j<i;j++)
           {
               if(nums[i]>nums[j])
                max=Math.max(dp[j],max) ;
           }
           
           dp[i]=max+1;
           maxs=Math.max(dp[i],maxs);
           
       }
        return  maxs;
    }
    public static int lds(int[] arr,int[]dp) {
        int maxLen = 0, n = arr.length;
        
        for (int i = n - 1; i >= 0; i--) {
            dp[i] = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[i]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }

            maxLen = Math.max(maxLen, dp[i]);
        }

        return maxLen;
    }
}