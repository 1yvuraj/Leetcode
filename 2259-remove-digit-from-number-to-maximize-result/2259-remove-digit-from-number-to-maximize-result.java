class Solution {
    public String removeDigit(String number, char digit) {
        ArrayList<String>ans=new ArrayList<>();
        for(int i=0;i<number.length();i++)
        {
            if(number.charAt(i)==digit)
            {
                ans.add(number.substring(0,i)+number.substring(i+1));
            }
        }
        Collections.sort(ans);
        return ans.get(ans.size()-1);
    }
}