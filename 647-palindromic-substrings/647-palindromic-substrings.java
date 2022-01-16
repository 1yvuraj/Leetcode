class Solution {
    public int countSubstrings(String s) {
        boolean [][]dp=new boolean[s.length()][s.length()];
        int c=0;
        for(int gap=0;gap<dp.length;gap++)
        {
            for(int j=gap, i=0;j<s.length();i++,j++)
            {
                if(gap==0)
                {
                    dp[i][j]=true;
                }
                else if(gap==1)
                {
                    if(s.charAt(i)==s.charAt(j))
                    {
                        dp[i][j]=true;
                    }
                    else
                    {
                       dp[i][j]=false; 
                    }
                }
                else
                {
                    if(s.charAt(i)==s.charAt(j) && dp[i+1][j-1]==true)
                    {
                        dp[i][j]=true;
                    }
                    else
                    {
                        dp[i][j]=false; 
                    }
                }
                if(dp[i][j]){
                    ++c;
                }
            }
        }
        return c;
    }
}