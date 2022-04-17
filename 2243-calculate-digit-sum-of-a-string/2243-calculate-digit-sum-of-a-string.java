class Solution {

    public String digitSum(String s, int k) {
        while (s.length() > k) {
            int c = 0;
            int sum = 0;
            String ans = "";
            for (int i = 0; i < s.length(); i++) {
                sum += s.charAt(i) - '0';
                c++;
                if (c == k) {
                    ans += sum;
                    sum = 0;
                    c = 0;
                }
            }
            if (c > 0) {
                ans = ans + String.valueOf(sum);
            }
            s = ans;
            
        }
        return s;
    }
}
