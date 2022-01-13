class Solution {
    public List<String> findAndReplacePattern(String[] words, String pattern) {
       
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            if(ok(words[i],pattern))
            {
                ans.add(words[i]);
            }
        }
        return ans;
    }
    public boolean ok(String word,String pattern)
    {
        HashMap<Character,Character>map=new HashMap<>();
        HashSet<Character>set=new HashSet<>();
        for(int i=0;i<word.length();i++)
        {
            char w=word.charAt(i);
            char p=pattern.charAt(i);
            if(map.containsKey(p))
            {
                if(map.get(p)!=w)
                {
                    return false;
                }
            }
            else
            {
                if(set.contains(w))
                {
                    return false;
                }
                map.put(p,w);
                set.add(w);
            }
        }
        return true;
    }
}