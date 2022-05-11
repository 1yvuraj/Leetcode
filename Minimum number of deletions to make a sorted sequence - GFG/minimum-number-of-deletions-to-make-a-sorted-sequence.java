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
                    int n = sc.nextInt();
                    int Arr[] = new int[n];
                    for(int i = 0;i<n;i++)
                        Arr[i] = sc.nextInt();
                    Solution ob = new Solution();
                    System.out.println(ob.minDeletions(Arr,n));
                }
        }
}    // } Driver Code Ends


//User function Template for Java
class Solution
{
	public int minDeletions(int arr[], int n) 
	{ 
	   //code here.
	   int[]dp=new int[arr.length];
	   return lengthOfLIS(arr);
	} 
	public int lengthOfLIS(int[] nums) {
        int[]dp=new int[nums.length];
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
        return  nums.length-maxs;
        
    }
}