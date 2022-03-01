class Solution {

    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int c = 0;
        boolean b = false;
        for (int i = 0; i < flowerbed.length; i++) {
            if (flowerbed[i] == 0) {
                int prev = (i == 0 || flowerbed[i - 1] == 0) ? 0 : 1;
                int next = (i == flowerbed.length - 1 || flowerbed[i + 1] != 1) ? 0 : 1;
                if (prev == 0 && next == 0) {
                    flowerbed[i] = 1;
                    ++c;
                }
            }
        }

        if (c >= n) {
            b = true;
        }

        return b;
    }
}
