class Solution {

    public int rob(int[] nums) {
        int []dp=new int[nums.length];
        Arrays.fill(dp,-1);
        return r(nums,0,dp);
        
    }
    public int r(int[] nums,int idx,int[]dp) {
        if(idx==nums.length || idx>nums.length)return 0; 
        int c=0;
        if(dp[idx]!=-1)return dp[idx];
        c=r(nums,idx+2,dp)+nums[idx];
        int k=r(nums,idx+1,dp);
        return dp[idx]=Math.max(c,k);
        
    }
}