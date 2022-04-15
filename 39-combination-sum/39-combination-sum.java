class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>a=new ArrayList<>();
        coinChangeCombination_IN(candidates,target,0,ans,a);
        return ans;
    }
    public  int coinChangeCombination_IN(int[] coins, int tar, int idx, List<List<Integer>>ans,ArrayList<Integer>a) {
        if (tar == 0) {
            List<Integer> base = new ArrayList<>(a);
            ans.add(base);
            return 1;
        }

        int count = 0;
        for (int i = idx; i < coins.length; i++) {
            if (tar - coins[i] >= 0) {
                a.add(coins[i]);
                count += coinChangeCombination_IN(coins, tar - coins[i], i, ans,a);
                 a.remove(a.size()-1);
            }
        }
    
        return count;
    }

}