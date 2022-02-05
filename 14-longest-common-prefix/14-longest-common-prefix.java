class Solution {
    public String longestCommonPrefix(String[] strs) {
       String ans="";
        ans+=strs[0];
       for(int i=1;i<strs.length;i++)
       {  
          ans=ok(ans,strs[i]); 
       }
        return ans;
    }
    public String ok(String strs,String strs1) {
        int n=strs.length()>strs1.length()?strs1.length():strs.length();
        String ans="";
        for(int i=0;i<n;i++)
        {
            if(strs.charAt(i)==strs1.charAt(i))ans+=strs.charAt(i);
            else break;
        }
        return ans;
    }
}