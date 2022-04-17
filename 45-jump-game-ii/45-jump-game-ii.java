class Solution {

    public int jump(int[] nums) {
        int n=nums.length;
        int[]dp=new int[n];
        return jumpsolver(nums,dp,n);
    }

    public int jumpsolver(int[] nums,int[]dp,int n) {
        dp[n-1]=0;
        for (int i = n-2; i >=0; i--) {
            int min = (int) 1e9;
            for (int jump = 1; jump <= nums[i]; jump++) {
                if(i+jump<dp.length)
                {
                    min=Math.min(min,dp[i+jump]);
                }
            }
            dp[i]=min+1;
        }
        return dp[0];
    }
}
