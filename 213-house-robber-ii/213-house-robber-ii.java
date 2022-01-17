class Solution {
    public int rob(int[] nums) {
        int n=nums.length;
        if(n==1){
            return nums[0];
        }
        return Math.max(robs(nums,0,n-2),robs(nums,1,n-1));
        
    }
     public int robs(int[] nums,int s,int e) {
       int[]dp=new int[e-s+1];
        int max=0;
        if(dp.length==0)
        {
           return 0;
        }
         else if(dp.length==1)
        {
             System.out.println(s+" "+e+" "+nums[s]);
            return nums[s];
        }
        
        dp[0]=nums[s];
        dp[1]=Math.max(dp[0],nums[s+1]);
        
       
        for(int i=2;i<dp.length;i++)
        {
            dp[i]=Math.max(dp[i-2]+nums[s+i],dp[i-1]);
            
        }
        return dp[dp.length-1];
    }
}