class Solution {
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> smallAns = new ArrayList<>();
        Arrays.sort(nums);
        permute(nums,0, ans, smallAns);
        return ans;
    }
    public static int permute(int[] coins, int idx,List<List<Integer>> ans,ArrayList<Integer> smallAns) {
        if (idx == coins.length) {
            ArrayList<Integer> base=new ArrayList<>(smallAns);
            ans.add(base);
            return 1;
        }

        int count = 0;
        int prev=-19;
        for (int i = 0; i < coins.length; i++) {
            if (prev!=coins[i] && coins[i] >-11 ) {
                int val = coins[i];
                coins[i] = -11;
                smallAns.add(val);
                count += permute(coins,idx+1,ans,smallAns);
                coins[i] = val;
                smallAns.remove(smallAns.size()-1);
                prev=coins[i];
            }
        }

        return count;
    }
}