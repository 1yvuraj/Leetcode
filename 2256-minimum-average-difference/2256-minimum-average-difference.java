class Solution {
//     public int minimumAverageDifference(int[] nums) {
//         int sum = 0;
//         long min=(long)1e9;
//         int left=0;
        
        
//         for (int i = 0; i < nums.length; i++) {
//             sum += nums[i];
            
//         }
//         int y = 0;
//         int n=nums.length;
        
//         for (int i = 0; i < nums.length; i++) {
//             left+=nums[i];
//             int ans=sum-left;
//             long main = Math.abs(left / (i + 1) - (n - i == 1 ? 0 : ans / (n -i - 1)));
//             if(min>main)
//             {
//                 min=main;
//                 y=i;
//             }
//         }
        
//         return y;
//     }
    public int minimumAverageDifference(int[] nums) {
	int len = nums.length, res = 0;
	long min = Integer.MAX_VALUE, sum = 0, leftSum = 0, rightSum = 0;
	for (int num : nums)
		sum += num;
	for (int i = 0; i < len; i++) {
		leftSum += nums[i];
		rightSum = sum - leftSum;
		long diff = Math.abs(leftSum / (i + 1) - (len - i == 1 ? 0 : rightSum / (len -i - 1)));
		if (diff < min) {
			min = diff;
			res = i;
		}
	}
	return res;
}
}
// public int minimumAverageDifference(int[] nums) {
// 	int len = nums.length, res = 0;
// 	long min = Integer.MAX_VALUE, sum = 0, leftSum = 0, rightSum = 0;
// 	for (int num : nums)
// 		sum += num;
// 	for (int i = 0; i < len; i++) {
// 		leftSum += nums[i];
// 		rightSum = sum - leftSum;
// 		long diff = Math.abs(leftSum / (i + 1) - (len - i == 1 ? 0 : rightSum / (len -i - 1)));
// 		if (diff < min) {
// 			min = diff;
// 			res = i;
// 		}
// 	}
// 	return res;
// }