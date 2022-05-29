class Solution {
    public int rearrangeCharacters(String s, String target) {
        if(s.length()<target.length())return 0;
        int[]arr=new int[26];
        int[]arr2=new int[26];
        for(int i=0;i<s.length();i++)
        {
          
            arr[s.charAt(i)-'a']++;
        }
        for(int i=0;i<target.length();i++)
        {
            arr2[target.charAt(i)-'a']++;
        }
       int ans=(int)1e9;
        
        for(int i=0;i<target.length() ;i++)
        {
           ans=Math.min(ans,arr[target.charAt(i)-'a']/arr2[target.charAt(i)-'a']);
        }
       
        return ans;
    }
}