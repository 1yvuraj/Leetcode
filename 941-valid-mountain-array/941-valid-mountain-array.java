class Solution {
    public boolean validMountainArray(int[] arr) {
        boolean b = false;
        int y = 0;
        int k = 0;
        if (arr.length <= 2) {
            return b;
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1]) {
                b = true;
                ++y;
            } else {
                b = false;
                break;
            }
        }
        if (b == false) {
            for (int i = y; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    b = true;
                    ++k;
                } else {
                    b = false;
                    break;
                }
            }
        } else {
            b = false;
        }
        if (k == arr.length - 1) {
            b = false;
        }
        return b;
    }
}
