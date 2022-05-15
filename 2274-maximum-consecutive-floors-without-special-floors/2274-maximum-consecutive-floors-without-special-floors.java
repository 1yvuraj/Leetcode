class Solution {
    public int maxConsecutive(int bottom, int top, int[] special) {
        Arrays.sort(special);
        int c=-(int)1e9;
        c=Math.max(c,special[0]-bottom);
        for(int i=1;i<special.length;i++)
        {
            c=Math.max(c,special[i]-special[i-1]-1);
        }
        c=Math.max(c,top-special[special.length-1]); 
        return c;
    }
}