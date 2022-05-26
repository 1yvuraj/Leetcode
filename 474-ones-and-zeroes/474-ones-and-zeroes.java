class Solution {
    int [][][] dp;
    public int findMaxForm(String[] strs, int m, int n) {
        dp = new int[m + 1][n + 1][strs.length];
        return helper(strs, m, n, 0);
    }
    private int helper(String [] strs, int zeros, int ones, int idx){
        if(idx == strs.length || zeros + ones == 0){
            return 0;
        }
        if(dp[zeros][ones][idx] > 0){
            return dp[zeros][ones][idx];
        }
        int [] count = count(strs[idx]);
        int consider = 0;
        //consider -> changes to count of ones and zeros
        if(zeros >= count[0] && ones >= count[1]){
            consider = 1 + helper(strs, zeros - count[0], ones - count[1], idx + 1);
        }
        // skip
        int skip = helper(strs, zeros, ones, idx + 1);
        return dp[zeros][ones][idx] = Math.max(consider, skip);
    }
    private int [] count(String str){
        int [] count = new int[2];
        for(char c : str.toCharArray()){
            count[c - '0']++;
        }
        return count;
    }
}