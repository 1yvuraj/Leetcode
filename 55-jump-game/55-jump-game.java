class Solution{
    public boolean canJump(int[] nums) {
       boolean []dp=new boolean[nums.length+1];
       return help(nums,dp);
    }
    public boolean help(int[] nums,boolean []dp) {
       dp[nums.length-1]=true;
      for(int i=nums.length-2;i>=0;i--)
      {
         
          for(int j=1;j<=nums[i];j++)
          {
              if(j+i<dp.length)
              {
                  if(dp[j+i]){
                      dp[i]=true;
                      break;
                  }
              }
          }
      }
       return dp[0] ;
    } 
}