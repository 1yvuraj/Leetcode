class Solution {
    public int minimumLines(int[][] c) {
        
        int ans=0;
        Arrays.sort(c,(a,b) -> a[0] - b[0]);
        for(int i=0;i<c.length-1;i++){
            if(i == c.length-2){ans++; continue;} 
            int first=(c[i+1][1]-c[i][1])*(c[i+2][0]-c[i+1][0]);
            int second=(c[i+2][1]-c[i+1][1])*(c[i+1][0]-c[i][0]);
             if(first!=second)ans++;
        }
        return ans;
    }
}
// class Solution {
//     public int minimumLines(int[][] stock) {
//         int n = stock.length,res = 0;
//         Arrays.sort(stock,(a,b) -> a[0] - b[0]);
        
//         for(int i=0;i<n-1;++i){
//             if(i == n-2){res++; continue;} // it's not part of previous line and there is no next line
//                 int x1 = stock[i+1][1] - stock[i][1] , x2 = stock[i+2][1] - stock[i+1][1];
//                 int y1 = stock[i+1][0] - stock[i][0] , y2 = stock[i+2][0] - stock[i+1][0];
// 				// Cross Multiplication 
// 				// x1/y1 != x2/y2 can be written as x1 * y2 != x2 * y1
//                 if(x1 * y2 != x2 * y1) res++;
//         }
//         return res;
//     }
// }