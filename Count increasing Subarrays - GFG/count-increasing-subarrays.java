// { Driver Code Starts
//Initial Template for Java



import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            int n = Integer.parseInt(br.readLine().trim());
            int[] arr = new int[n];
            inputLine = br.readLine().trim().split(" ");
            for (int i = 0; i < n; i++) {
                arr[i] = Integer.parseInt(inputLine[i]);
            }

            int ans = new Solution().countIncreasing(arr, n);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java



class Solution {
    int countIncreasing(int nums[], int n) {
        if(nums.length==1)
        {
            return 0;
        }
        if(nums.length==2 && nums[0]<nums[1])
        {
            return 1;
        }
        int c=0;
        
        int j=0;
        int last=nums[0];
        for(int i=1;i<nums.length;i++)
        {
           
               if(last<nums[i])
               {
                   c+=(i-j);
               }
               else{
                 j=i;
               }
               last=nums[i];
           
            
            
        }
        return c;

    }
}