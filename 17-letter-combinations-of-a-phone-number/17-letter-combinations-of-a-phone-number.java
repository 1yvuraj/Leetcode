class Solution {

    public List<String> letterCombinations(String digits) {
        String[] ans = { " "," ", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };
        if(digits.length()==0)return new ArrayList<>();
        ArrayList<String> a = new ArrayList<>();
        letter(digits, ans, 0, a, "");
        return a;
    }

    public int letter(String digits, String[] ans, int idx, ArrayList<String> a, String psf) {
        if (idx == digits.length()) {
            a.add(psf);
            return 1;
        }
        int count = 0;
        int val = digits.charAt(idx) - '0';
        String str=ans[val];
        for(int i=0;i<str.length();i++)
        {
            count+=letter(digits,ans,idx+1,a,psf+str.charAt(i));
        }
        return count;
    }
}
