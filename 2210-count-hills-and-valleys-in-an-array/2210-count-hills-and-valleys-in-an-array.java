// class Solution {
//     public int countHillValley(int[] nums) {

//         int c=0;
//         for(int i=1;i<nums.length-1;i++)
//         {

//             if(i>=0 && i<nums.length && nums[i-1]<nums[i] && nums[i]>nums[i+1]||i>=0 && i<nums.length &&nums[i-1]>nums[i] && nums[i]<nums[i+1])
//             {

//                 c++;
//                 nums[i]=-1;
//             }
//             // else if(i>=0 && i<nums.length &&nums[i-1]>nums[i] && nums[i]<nums[i+1])c++;

//         }
//         return c;
//     }
// }
class Solution {
    public int countHillValley(int[] nums) {
        int c = 0;
        int prev=nums[0];
        for (int i = 1; i < nums.length - 1; i++) {
            if(prev<nums[i]&&nums[i]>nums[i+1]||nums[i]<prev && nums[i]<nums[i+1]){
                c++;
            }
            if(nums[i]!=nums[i+1])
            {
                prev=nums[i];
            }
        }
        return c;
    }
}
// public int countHillValley(int[] nums) {
//         int ans = 0;
//         int prev = nums[0];
//         for(int i = 1; i < nums.length-1; i++){
//             if((nums[i] > nums[i+1] && nums[i] > prev || (nums[i] < nums[i+1] && nums[i] < prev)))
//                 ans++;
//             if(nums[i] != nums[i+1]){
//                 prev = nums[i];
//             }
//         }
//         return ans;
//     }
// 	```
