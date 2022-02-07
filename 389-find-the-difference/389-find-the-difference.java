class Solution {
    public char findTheDifference(String s, String t) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(map.containsKey(s.charAt(i))) {
            map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }else{
                 map.put(s.charAt(i),1);
            }
        }
        char ch = '\0';
        for(int i=0;i<t.length();i++)
        {
            if(map.containsKey(t.charAt(i))) {
                map.put(t.charAt(i),map.get(t.charAt(i))-1);
                if(map.get(t.charAt(i))==0)
                map.remove(t.charAt(i));
                
            }else {
                ch= t.charAt(i);
                break;
            }
        }
        return ch;
    }
}