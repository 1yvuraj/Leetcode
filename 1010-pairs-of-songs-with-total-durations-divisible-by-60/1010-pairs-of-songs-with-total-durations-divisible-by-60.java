
class Solution {
    public int numPairsDivisibleBy60(int[] time) {

        int[] cnt = new int[60];
        int total = 0;
        for (int num : time) {
            int remainder = num % 60;
            System.out.print(remainder+" ");
            int comp = (60 - remainder) % 60;
            System.out.print(comp+" ");
            total += cnt[comp];
            cnt[remainder]++;
        }

        return total;
    }
}