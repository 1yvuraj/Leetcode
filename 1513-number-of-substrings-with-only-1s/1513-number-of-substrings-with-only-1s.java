class Solution {
    public int numSub(String s) {
        int count=0;
        
        int ans=0;
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(ch=='1'){
                count++;
            }
            else{
                count=0;
            }
            ans+=count;
            ans=ans%(int)(Math.pow(10,9)+7);
        }
        return ans;
    }
}