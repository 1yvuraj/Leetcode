class Solution {
    public int findMiddleIndex(int[] nums) {
         int l=0;
        int r=0;
        int y=-1;
        for(int i=0;i<nums.length;i++)
        {
            r+=nums[i];
            
        }
        for(int i=0;i<nums.length;i++)
        {
           
            r-=nums[i];
           
            if(l==r)
            {
                y=i;
                break;
            }
            l+=nums[i];   
              
        }
        return y;
    }
}