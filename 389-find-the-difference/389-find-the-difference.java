class Solution {
    public char findTheDifference(String s, String t) 
    {
       char sstring[]=s.toCharArray();
        char tstring[]=t.toCharArray();
        Arrays.sort(sstring);
        Arrays.sort(tstring);
        int len=Math.min(s.length(),t.length());
        for(int i=0;i<len;i++)
        {
            if(sstring[i]!=tstring[i])
            {
                return tstring[i];
            }
        }
        return tstring[tstring.length-1];
        
    }
}