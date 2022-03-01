class Solution {
    public int maxSubArray(int[] nums) {
        int curmax=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++)
        {
                curmax+=nums[i];
                if(max<curmax)max=curmax;
                if(curmax<0)
                {
                    curmax=0;
                }
               
            
        }
        return max;
    }
}