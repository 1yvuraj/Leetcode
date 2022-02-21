class Solution {
    public int majorityElement(int[] nums) {
        int cad=0;
        int life=0;
        for(int i=0;i<nums.length;i++)
        {
             if(life==0)
            {
                cad=nums[i];
            }
            
            if(cad==nums[i])
            {
                ++life;
            }
            else{
                --life;
            }
           
        }
        return cad;
    }
}