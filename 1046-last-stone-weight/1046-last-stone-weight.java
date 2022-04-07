class Solution {

    public int lastStoneWeight(int[] stones) {
        if (stones.length == 1) {
            return stones[0];
        }
        if (stones.length == 0) {
            return 0;
        }
        for (int i = 0; i < stones.length; i++) {
            Arrays.sort(stones);
            int a = stones[stones.length - 1];
            int b = stones[stones.length - 2];
            if (b == 0) return a;
            stones[stones.length - 1] = a - b;
            stones[stones.length - 2] = 0;
        }
        return 0;
    }
}
