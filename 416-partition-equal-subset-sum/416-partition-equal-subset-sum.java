class Solution {
    public boolean canPartition(int[] nums) {
        int sum=0;
        boolean b=false;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
        }
        if(sum%2==1)
        {
            return false;
        }
        else{
            Boolean[][]dp=new Boolean[sum/2+1][nums.length+1];
          b=ok(nums,sum/2,0,dp); 
        }
        return b;
    }
    public static boolean ok(int[]nums,int tar,int idx,Boolean[][]dp)
    {
        if(idx>=nums.length||tar<0)
        {
            return false;
        }
        if(idx==nums.length-1){
        if(tar==0)
        {
            return true;
        }
        }
        if(dp[tar][idx]!=null)
        {
            return dp[tar][idx];
        }
        boolean f1=ok(nums,tar-nums[idx],idx+1,dp);
        boolean f2=ok(nums,tar,idx+1,dp);
        return dp[tar][idx]=f1||f2;
        
    }
}