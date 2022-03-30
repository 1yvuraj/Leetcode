class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
       
        int r=matrix[0].length-1;
        int l=0;
        
        while(l<matrix.length && r>=0)
        {
            
            if(matrix[l][r]==target)
            {
                return true;
            }
            else if(matrix[l][r]<target)
            {
                l++;
                
            }
            else
            {
                r--;
                
            }
            
          
                
        }
        return false;
    }
}
// class Solution {
//     public boolean searchMatrix(int[][] matrix, int target) {
//      int row=0;
//         int col=matrix[0].length-1;
//         while(row<matrix.length && col>=0){
//             if(matrix[row][col]==target){
//                 return true;
//             }
//             if(matrix[row][col]<target){
//                 row++;
//             }else{
//                 col--;
//             }
          
//         }
//         return false;
//     }
// }  