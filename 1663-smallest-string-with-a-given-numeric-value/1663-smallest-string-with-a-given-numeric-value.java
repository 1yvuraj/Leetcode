class Solution {
    public String getSmallestString(int n, int k) {
        StringBuilder sb = new StringBuilder();
        while(n!=0){
            int t = 26;
            while((n-1)>(k-t)) t--;
            sb.append((char) (t+96));
            k-=t;
            n--;
        }
        return sb.reverse().toString();
    }
}