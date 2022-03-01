class Solution {

    public int[] sortArrayByParityII(int[] nums) {
        int[] ans = new int[nums.length];
        int y = 0;
        int i = 0;
        int j = 1;

        while (y < nums.length) {
            if (nums[y] % 2 == 0) {
                if (i < nums.length) {
                    ans[i] = nums[y];
                    i += 2;
                }
            } else {
                if (j < nums.length) {
                    ans[j] = nums[y];
                    j += 2;
                }
            }
            y++;
        }
        return ans;
    }
}
