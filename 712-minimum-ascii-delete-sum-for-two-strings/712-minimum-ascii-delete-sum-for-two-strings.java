class Solution {
    public int minimumDeleteSum(String s1, String s2) {
        int [][]dp=new int[s1.length()+1][s2.length()+1];
       return ok(s1,s2,dp); 
    }
    public int ok(String s1,String s2,int [][]dp)
    {
        
        for(int i = s1.length() ; i >= 0 ; i--){
            for(int j = s2.length() ; j >= 0 ; j--){
               if(i==s1.length()&&j==s2.length())
        {
            dp[i][j] = 0;
                   continue;
        }
        
        int f1=Integer.MAX_VALUE;
       
        if(i<s1.length() && j<s2.length() &&s1.charAt(i)==s2.charAt(j))
        {
           f1=Math.min(f1,dp[i + 1][j + 1]);
        }
        else{
            if(i<s1.length())
            {
                f1=Math.min(f1,dp[i + 1][j]+(int)(s1.charAt(i)));
                
            }
            if(j<s2.length())
            {
                f1=Math.min(f1,dp[i ][j + 1]+(int)(s2.charAt(j)));
            }
                
            
        }
                       
            dp[i][j]=f1;      
            }
        }
        
      
        return dp[0][0];
                    
    }
}