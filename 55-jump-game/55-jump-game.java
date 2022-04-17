class Solution {
    public boolean canJump(int[] nums) {
        int n=nums.length;
        int[]dp=new int[n];
        for(int i=0;i<dp.length;i++)
        {
            dp[i]=-1;
        }
        return jumpsolver(nums,dp,n)<0?false:true;
    }
    public int jumpsolver(int[] nums,int[]dp,int n) {
        dp[n-1]=0;
        for (int i = n-2; i >=0; i--) {
            int min = -(int)1e9;
            for (int jump = 1; jump <= nums[i]; jump++) {
                if(i+jump<dp.length)
                {
                    min=Math.max(min,dp[i+jump]);
                }
            }
            dp[i]=min+1;
        }
        return dp[0];
    }
}