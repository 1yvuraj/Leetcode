class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int [][]dp=new int[s1.length()+1][s2.length()+1];
       return ok(s1,s2,0,0,dp); 
    }
    public int ok(String s1,String s2,int i,int j,int [][]dp)
    {
        if(i==s1.length()&&j==s2.length())
        {
            return 0;
        }
        
        int f1=Integer.MAX_VALUE;
        if(dp[i][j]!=0)
        {
            return dp[i][j];
        }
        if(i<s1.length() && j<s2.length() &&s1.charAt(i)==s2.charAt(j))
        {
           f1=Math.min(f1,ok(s1,s2,i+1,j+1,dp));
        }
        else{
            if(i<s1.length())
            {
                f1=Math.min(f1,ok(s1,s2,i+1,j,dp)+(int)(s1.charAt(i)));
                
            }
            if(j<s2.length())
            {
                f1=Math.min(f1,ok(s1,s2,i,j+1,dp)+(int)(s2.charAt(j)));
            }
                
            
        }
                       
        return dp[i][j]=f1;                 
    }
}