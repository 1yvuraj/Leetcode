class Solution {
    public boolean hasAllCodes(String s, int k) {
        HashSet<String>set=new HashSet<>();
        StringBuilder sb=new StringBuilder();
       
        int j=0;
        for(int i=0;i<=s.length()-k;i++){
            set.add(s.substring(i,i+k));
        }
        return set.size()==Math.pow(2,k);
    }
    
}