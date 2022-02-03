class Solution {
    public int minimumCost(int[] cost) {
        Arrays.sort(cost);
        int sum = 0;
        int i = cost.length - 1;
        while (i >= 0) {
            sum += cost[i];
            sum += i - 1 >= 0 ? cost[i - 1] : 0;
            i -= 3;
        }
        return sum;
    }
}
