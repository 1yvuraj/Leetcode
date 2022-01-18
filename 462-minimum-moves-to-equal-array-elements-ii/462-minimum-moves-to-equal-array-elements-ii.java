class Solution {
    public int minMoves2(int[] nums) {
        Arrays.sort(nums);
       int ans=0;
        int median=nums[nums.length/2];
        for(int i=0;i<nums.length;i++)
        {
            if(median>nums[i])
            {
                ans+=median-nums[i];
            }
            else
            {
                ans+=-median+nums[i];
            }
        }
        return ans;
       
        
        
    }
}