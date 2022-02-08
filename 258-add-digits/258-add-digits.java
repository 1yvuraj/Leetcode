class Solution {
    public int addDigits(int num) {
        int ans=add(num);
        while(ans%10!=ans)
        {
            ans=add(ans);
        }
        return ans;
    }
    public int add(int num)
    {
        int sum=0;
        while(num!=0)
        {
           int rem=num%10;
            sum+=rem;
        num/=10;
        }
        return sum;
    }
    
}