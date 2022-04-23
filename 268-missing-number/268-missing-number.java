class Solution {
    public int missingNumber(int[] nums) {
       int n=nums.length;
       int ans=n,i=0;
       while(i<n)
       {
           ans^=nums[i]^i;
           i++;
       }
        return ans;
    }
}