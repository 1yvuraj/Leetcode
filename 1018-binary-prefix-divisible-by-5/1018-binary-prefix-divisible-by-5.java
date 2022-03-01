class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        ArrayList<Boolean>a=new ArrayList<>();
         int p=nums[0];
        
         a.add(p%5==0?true:false);
        
        for(int i=1;i<nums.length;i++)
        {
           if(nums[i]==1)
           {
               p=p*2+1;
           }
          else
            {
                p=p*2;
            }
            if(p%5==0)
            {
               a.add(true); 
            }
            else
            {
                a.add(false);
            }
           p=p%5;
        }
        return a;
    }
}