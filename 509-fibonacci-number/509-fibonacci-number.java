class Solution {
    public int fib(int n) {
      
        int []dp=new int [n+1];
        if(n>0&&n>1){
        dp[0]=0;
        dp[1]=1;
        }
        //int ans=0;
         if(n==1)
           {
            return 1;
           }
        else{
        for(int i=2;i<dp.length;i++)
        { 
            dp[i]=dp[i-1]+dp[i-2];
        }
         return dp[n];   
        }
        
    }
}
