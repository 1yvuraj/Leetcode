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
            String[] S = br.readLine().split(" ");
            int[] nums = new int[n];
            for(int i = 0; i < n; i++)
                nums[i] = Integer.parseInt(S[i]);
            Solution ob = new Solution();
            int ans = ob.AlternatingaMaxLength(nums);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution
{
    public int AlternatingaMaxLength(int[] nums)
    {
        // code here
        if(nums.length==1)
        {
            return 1;
        }
        int p=nums[1]-nums[0];
        int count=p!=0?2:1;
        for(int i=2;i<nums.length;i++)
        {
            int cur=nums[i]-nums[i-1];
            if(p<=0&&cur>0||p>=0&&cur<0)
            {
                count+=1;
                p=cur;
            }
            
        }
        return count;
    }
}