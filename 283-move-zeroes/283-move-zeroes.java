//class Solution {
//     public void moveZeroes(int[] nums) {
//         int y=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             if(nums[i]!=0)
//             {
                
                
//                 nums[y]=nums[i];
//                 ++y;
                
//             }
            
           
            
//         }
//        while(y<nums.length)
//        {
//            nums[y]=0;
//            ++y;
//        }
//        for(int i=0;i<nums.length;i++)
//            System.out.print(nums[i]);
     
    

        
//     }
    
// }
// }
class Solution {
    public void moveZeroes(int[] nums) {
    
        int j = 0;
        for(int i = 0;i<nums.length ;i++){
            if(nums[i]!=0){
                nums[j++] = nums[i];
            }
        }
        while(j<nums.length){
            nums[j++] = 0;
        }
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]);
    }
}