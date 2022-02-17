class Solution {
    public int[] sortedSquares(int[] nums) {
        int []ans=new int[nums.length];
        int i=0;
        int k=0;
        int t=nums.length-1;
        int idx=nums.length-1;
        
       
        while(i<nums.length&&idx>=0)
        {
            
            if(nums[k]*nums[k]<nums[t]*nums[t])
            {
                if(t<nums.length){
                ans[idx]=nums[t]*nums[t];
                t--;
                }
            }
            else
            {    if(k<nums.length){
                ans[idx]=nums[k]*nums[k];
                 }
                k++;
            }
            ++i;
            idx--;
        }
        
        return ans;
    }
}