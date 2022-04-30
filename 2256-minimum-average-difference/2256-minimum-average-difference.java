class Solution {
    public int minimumAverageDifference(int[] nums) {
        long sum = 0;
        long min=Integer.MAX_VALUE;
        long left=0;
        long right=0;
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            
        }
        int y = 0;
        int n=nums.length;
        for (int i = 0; i < nums.length; i++) {
            left+=nums[i];
            right=sum-left;
            long main = Math.abs(left / (i + 1) - (i == n-1 ? 0 : right / (n -i - 1)));
            if(min>main)
            {
                min=main;
                y=i;
            }
        }
        return y;
    }
}