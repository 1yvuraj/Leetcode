// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int sum=0;
//         int c=0;
//         for(int i=0;i<nums.length;i++)
//         {
//             sum=0;
//             for(int j=i;j<nums.length;j++)
//             {
//                 sum+=nums[j];
//                 if(sum==k)
//                 {
//                     ++c;
                   
                   
//                 }
//             }
//         }
//         return c;
        
//     }
// }
class Solution {
 	public int subarraySum(int[] nums, int k) {

 		HashMap<Integer, Integer> arr_sums = new HashMap();
 		
 		int sum = 0, count = 0;
 		
 		for(int i = 0; i < nums.length; i++) {
            arr_sums.put(sum, arr_sums.getOrDefault(sum, 0) + 1);
 			sum += nums[i];
 			if(arr_sums.containsKey(sum - k)) {
 				count += arr_sums.get(sum - k);
 			}
 			
 		}
 		return count;
 	}
 }