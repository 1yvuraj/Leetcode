class Solution {
    public String removeDuplicateLetters(String s) {
        int []freq=new int[26];
        boolean [] exits=new boolean[26];
        Stack<Character>st=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']++;
        }
        for(int i=0;i<s.length();i++)
        {
            freq[s.charAt(i)-'a']--;
            if(exits[s.charAt(i)-'a'])
            {
                continue;
            }
            while(st.size()>0 && st.peek()>s.charAt(i) && freq[st.peek()-'a']>0)
            {
                char ch=st.pop();
                exits[ch-'a']=false;
                
            }
            st.push(s.charAt(i));
            exits[s.charAt(i)-'a']=true;
            
        }
        char[]ans=new char[st.size()];
        
        for(int i=ans.length-1;i>=0;i--)
        {
           ans[i]=st.pop();
        }
        return new String(ans);
        
    }
}