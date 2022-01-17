class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int ans1=maxSubArray(nums);
        int sum=0;
        for(int i=0;i<nums.length;i++)
        {
            sum+=nums[i];
            nums[i]=nums[i]*-1;
        }
        int ans2=maxSubArray(nums);
         if(sum+ans2==0)return ans1;
        return ans2==0?ans1:Math.max(ans1,sum+ans2);
        
    }
    public int maxSubArray(int[] nums) {
        int curmax=0;
        int maxans=-(int)1e9;
        for(int si=0;si<nums.length;si++)
        {  
            curmax=curmax+nums[si];
            if(curmax>maxans)
            {
                maxans=curmax;
            }
            if(curmax<0){
                curmax=0;
            }
      
        }
        
   
        return maxans;
    }
}