class Solution {

    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> a = new ArrayList<>();
        Arrays.sort(candidates);
        combinationSum2(candidates, target, 0, ans, a);
        return ans;
    }

    public int combinationSum2(int[] coins, int tar, int idx, List<List<Integer>> ans, ArrayList<Integer> a) {
        if (tar == 0) {
            List<Integer> base = new ArrayList<>(a);
            ans.add(base);
            return 1;
        }

        int count = 0;
        int prev=-1;
        for (int i = idx; i < coins.length; i++) {
            if (prev!=coins[i] && tar - coins[i] >= 0 ) {
                a.add(coins[i]);
                count += combinationSum2(coins, tar - coins[i], i+1, ans, a);
                a.remove(a.size() - 1);
                prev=coins[i];
            }
        }

        return count;
    }
   
}
