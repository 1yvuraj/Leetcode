class Solution {
    public int rob(int[] nums) {
       int[]dp=new int[nums.length];
        int max=0;
        if(nums.length==2)
        {
           return max=Math.max(nums[0],nums[1]); 
        }
         else if(nums.length==1)
        {
            return nums[0];
        }
        
        dp[0]=nums[0];
        dp[1]=Math.max(dp[0],nums[1]);
        
       
        for(int i=2;i<nums.length;i++)
        {
            dp[i]=Math.max(dp[i-2]+nums[i],dp[i-1]);
            max=Math.max(max,dp[i]);
        }
        return max;
    }
}