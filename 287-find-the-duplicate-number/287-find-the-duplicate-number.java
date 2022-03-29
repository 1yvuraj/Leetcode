class Solution {
    public int findDuplicate(int[] nums) {
     int i=0;
        while(i<nums.length)
        {
            int cur=nums[i]-1;
            if(nums[i]!=nums[cur])
            {
                swap(nums,i,cur);
            }
            else
            {
                i++;
            }    
        }
        int ans=0;
        for(int k=0;k<nums.length;k++)
          {
               
              if(nums[k]!=k+1)
              {
                 ans= nums[k];
                  break;
              }
         }  
        return ans;
           
        }                                                                        
    public void swap(int[] nums,int f,int e) 
    {
        int temp =nums[f];
        nums[f]=nums[e];
        nums[e]=temp;
    }
} 
