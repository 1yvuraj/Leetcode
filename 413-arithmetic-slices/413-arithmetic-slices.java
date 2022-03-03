class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        
        if(nums.length<3){
            return 0;
        }
        
        int acq=1;
        
        int count=0;
        
        while(acq<nums.length){
            
            int rel= acq-1;
            
            int diff= nums[acq]- nums[rel];
            
            boolean flag= false;
            
            while(acq<nums.length && nums[acq]-nums[acq-1]==diff){
                
                flag=true;
                
                if(acq-rel>=2){
                    count+=acq-rel-1;
                }
                
                acq++;
                
            }
            
            if(flag==false){
                acq++;
            }
            
            //acq++;
            
        }
        
        return count;
        
    }
}