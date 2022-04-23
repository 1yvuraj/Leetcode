class Solution {
    public int[] singleNumber(int[] nums) {
        int xor=0,a=0,b=0;
        for(int i:nums)xor^=i;
        int mask=xor&(-xor);
        for(int i:nums)
        {
            if((mask&i)==0)a^=i;
            else b^=i;
            
        }
        return new int[]{a,b};
    }
}