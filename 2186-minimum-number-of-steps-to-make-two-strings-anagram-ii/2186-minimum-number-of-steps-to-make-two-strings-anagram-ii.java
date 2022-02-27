class Solution {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];
        char[] ss = s.toCharArray();
        char[] tt = t.toCharArray();
        for(char c:ss)
        {
            arr[c-'a'] ++;
        }
        for(char c:tt)
        {
            arr[c - 'a'] --;
        }
        int ans=0;
        for(int i:arr)
        {
            ans=ans+Math.abs(i);
        }
        return ans; 
    }
}