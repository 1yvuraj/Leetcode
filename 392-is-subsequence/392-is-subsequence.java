class Solution {
    public boolean isSubsequence(String s, String t) {
       if(s.length() > t.length()) { return false; }
		if(s.equals(""))           { return true; }
		int index = 0;
		for (int i = 0; i < t.length(); i++) {
			if(s.charAt(index) == t.charAt(i)) {
				index++;
				if(index == s.length()) { // reach the end
					return true;
				}
			}
		}
		return false;
    }
}