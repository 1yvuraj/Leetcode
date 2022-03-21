class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list=new ArrayList();
        int[] lastOccur=new int[26];
        for(int i=0;i<s.length();i++)
        {
            lastOccur[s.charAt(i)-'a']=i;
        }
        int j=0;
        int a=0;
        for(int i=0;i<s.length();i++)
        {
            j=Math.max(j,lastOccur[s.charAt(i)-'a']);
            if(i==j)
            {
                list.add(i-a+1);
                a=i+1;
            }
        }
        return list;
    }
}