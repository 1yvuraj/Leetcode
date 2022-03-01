class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean b = false;
        if (nums.length >= 2) {
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] <= nums[i + 1]) {
                    b = true;
                } else {
                    b = false;
                    break;
                }
            }
            if (b == false) {
                for (int i = 0; i < nums.length - 1; i++) {
                    if (nums[i] >= nums[i + 1]) {
                        b = true;
                    } else {
                        b = false;
                        break;
                    }
                }
            }
        } else {
            b = true;
        }
        return b;
    }
}
