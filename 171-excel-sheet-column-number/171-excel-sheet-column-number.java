class Solution {
    public int titleToNumber(String cT) {
        int ans = 0;
        for (int i = 0;i<cT.length();i++)
            ans = ans*26+(cT.charAt(i)-'A'+1);
        
        return ans;
    }
}