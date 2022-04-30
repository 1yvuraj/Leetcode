class Solution {

    public int canCompleteCircuit(int[] gas, int[] cost) {
        int gassum = 0;
        int costsum = 0;
        int idx = 0;
        for (int i = 0; i < gas.length; i++) {
            gassum += gas[i];
            costsum += cost[i];
        }
        if (gassum < costsum) return -1;
        int cursum = 0;
        int s = 0;
        for (int i = 0; i < gas.length; i++) {
            cursum += gas[i] - cost[i];
            if (cursum < 0) {
                cursum = 0;
                s = i + 1;
            }
        }
        return s;
    }
}
