class Solution {
    public int numberOfWays(String corridor) {
        int c = 0;
        int mod = (int) 1e9 + 7;
        for (int i = 0; i < corridor.length(); i++) {
            if (corridor.charAt(i) == 'S') {
                ++c;
            }
        }
        long ans = 1;
        if (c == 0 || c % 2 == 1) return 0;
        c = 0;
        for (int i = 0; i < corridor.length(); i++) {
            if (corridor.charAt(i) == 'S') {
                c++; 
            }
            if (c == 2) {
                int cnt = 1;
                i++;
                while (i < corridor.length() && corridor.charAt(i) == 'P') {
                    cnt++;
                    i++;
                }
                if (i == corridor.length()) break;
                ans = (ans * cnt) % mod;
                cnt = 1;
                c = 0;
                i--;
            }
        }
        return (int) ans;
    }
}
