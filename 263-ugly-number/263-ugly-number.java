class Solution {
    public boolean isUgly(int n) {
        int []div={2,3,5};
        if(n==0)
        {
            return false;
        }
        for(int i:div)
        { 
           while(n%i==0)
           {
               n/=i;
           }
        }
        return n==1?true:false;
    }
}