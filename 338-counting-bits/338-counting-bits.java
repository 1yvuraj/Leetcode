class Solution {
    public int[] countBits(int n) {
        int []ans =new int[n+1];
        for(int i=0;i<=n;i++)
        {
            ans[i]=sum(i);
        }
       return ans;
        
    }
    public int sum(int n)
    {
        int s=0;
        while(n!=0)
        {
            int rem=n%2;
            s+=rem;
            n/=2;
        }
        return s;
    }
}