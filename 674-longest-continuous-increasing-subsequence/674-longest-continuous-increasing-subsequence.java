class Solution {
    public int findLengthOfLCIS(int[] nums) {
        
        int max=1;
        int cur=1;
        for(int i=1;i<nums.length;i++)
        {
            cur=nums[i-1]<nums[i]?cur+1:1;
            max=Math.max(cur,max);
          
        }
        return max;
    }
    
}