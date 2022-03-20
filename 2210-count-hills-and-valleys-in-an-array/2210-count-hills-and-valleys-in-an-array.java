class Solution {

    public int countHillValley(int[] nums) {
        int c = 0;
        for (int i = 1; i < nums.length - 1; i++) {
            int j = i - 1;
            int k = i + 1;
            if(nums[i]==nums[i-1])continue;
            while (j >= 0 && nums[i] == nums[j]) j--;
            while (k < nums.length && nums[i] == nums[k]) k++;
            if ( j >= 0 && k < nums.length && nums[j] > nums[i] && nums[i] < nums[k]) {
                c++;
            }else if(j >= 0 && k < nums.length && nums[j] < nums[i] && nums[i] > nums[k])
            {
                c++;
            }
        }
        return c;
    }
}
// class Solution {
//     public int countHillValley(int[] nums) {
//         int c = 0;
//         int prev=nums[0];
//         for (int i = 1; i < nums.length - 1; i++) {
//             if(prev<nums[i]&&prev<nums[i+1]||nums[i]<prev && nums[i]<nums[i+1]){
//                 c++;
//             }
//             if(nums[i]!=nums[i+1])
//             {
//                 prev=nums[i];
//             }
//         }
//         return c;
//     }
// }z
