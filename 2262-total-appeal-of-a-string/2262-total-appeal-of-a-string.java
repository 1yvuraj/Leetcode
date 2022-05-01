
class Solution {
    public long appealSum(String s) {
     
        int n=s.length();
        long h=0,base=0;
        int ch[]=new int[26];
        for(int i=0;i<26;i++)
            ch[i]=-1;
        for(int i=0;i<n;i++)
        {
            base=base+i-ch[s.charAt(i)-'a'];
            ch[s.charAt(i)-'a']=i;
            h+=base;
         
            System.out.println(h);
                
        }
        return h;
    }
}
