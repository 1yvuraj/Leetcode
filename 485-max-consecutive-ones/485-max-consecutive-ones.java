
class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int y=0;
        int max=0;
       
        int []ans=new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {   
            
           if(nums[i]!=0){
            
            
                if(nums[i]==1)
                {
                    ++y;
                }
                else
                {
                    y=0;
                }
             max=Math.max(max,y);   
            
           }
            else
            {
                y=0;
            }
             
            
         
        }
        return max;
    }
}