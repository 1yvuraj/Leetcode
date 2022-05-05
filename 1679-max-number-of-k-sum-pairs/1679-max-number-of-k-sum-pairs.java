class Solution {

    public int maxOperations(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int c = 0;

        for (int i = 0; i < nums.length; i++) {
             map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }
        for (int i = 0; i < nums.length; i++) {
            if(nums[i]==k-nums[i] && map.containsKey(nums[i]) && map.get(nums[i]) > 1 )
            {
                c++;
                map.put(nums[i], map.get(nums[i]) - 2);
            }
            else if (nums[i]!=k-nums[i] && map.containsKey(nums[i]) && map.get(nums[i]) > 0 && map.containsKey(k - nums[i]) && map.get(k - nums[i]) > 0) {
                c++;
                map.put(k - nums[i], map.get(k - nums[i]) - 1);
                map.put(nums[i], map.get(nums[i]) - 1);
            } 
        }
        return c;
    }
}