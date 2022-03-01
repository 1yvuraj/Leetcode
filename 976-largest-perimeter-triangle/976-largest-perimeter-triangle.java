class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        int i = nums.length - 1;
        int ans = 0;
        while (i >= 2) {
            if (nums[i - 2] + nums[i - 1] > nums[i]) {
                ans = nums[i] + nums[i - 1] + nums[i - 2];

                break;
            }
            --i;
        }
        return ans;
    }
}
