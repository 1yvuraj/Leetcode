class Solution {
    public int maxProfit(int[] prices) {
        return Profit(prices);
    }
    public int Profit(int[]prices)
    {
        int y=0;
        int ans=-1;
        
        
        int b=prices[0];
        int s=prices[0];
        for(int i=1;i<prices.length;i++)
        {
            if(prices[i-1]<prices[i])
            {
                s=prices[i];
            }
            else
            {
                 y+=s-b;
                  b=prices[i];
                  s=prices[i];
                
                
                
            }
            
            
            
        }
        y+=s-b;
        return y;
    }
}