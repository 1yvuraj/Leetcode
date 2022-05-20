class Solution {
    public List<String> removeAnagrams(String[] words) {
        String ans="";
        ArrayList<String>main=new ArrayList<>();
        for(int i=0;i<words.length;i++)
        {
            char[]arr=words[i].toCharArray();
            Arrays.sort(arr);
            String temp=new String(arr);
            if(!ans.equals(temp))
            {
                main.add(words[i]);
            }
            ans=temp;
        }
        return main;
    }
}
