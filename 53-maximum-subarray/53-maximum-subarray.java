class Solution {
    public int maxSubArray(int[] nums) {
        int curmax=0;
        int maxans=-9999999;
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
//         if(maxans==0)
//         {
//             Arrays.sort(nums);
//         }
   
        return maxans;
    }
}
