class Solution {
    public int countOrders(int n) {
        long ans=1, c=2*n;
        for(int i=n;i>0;i--)
        {
            ans=((ans*(c*(c-1)))/2)%1000000007;
            c=c-2;
        }
        return (int)ans;
    }
}