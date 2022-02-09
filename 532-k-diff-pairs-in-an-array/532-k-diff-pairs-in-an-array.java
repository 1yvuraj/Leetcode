class Solution {
    public int findPairs(int[] nums, int k) {
        int n=nums.length;
        int c=0;
        
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<n;i++)
        {
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
        }
        for(int key : map.keySet()){
            if((k>0 && map.containsKey(key+k)) || (k==0 && map.get(key)>1)) c++;
        }
        return c;
        
    }
}
