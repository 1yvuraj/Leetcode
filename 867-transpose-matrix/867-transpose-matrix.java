class Solution {
    public int[][] transpose(int[][] matrix) {
            int[][]ans=new int[matrix[0].length][matrix.length];
         for(int i=0;i<ans[0].length;i++){
            for(int j=0;j<ans.length;j++)
            {
                ans[j][i]=matrix[i][j];
                
            }
         }
        
        return ans;
    }
}