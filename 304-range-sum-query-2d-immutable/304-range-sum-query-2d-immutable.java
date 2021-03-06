class NumMatrix {
int [][] dp;
public NumMatrix(int[][] matrix){
int m = matrix.length;
int n = matrix[0].length;
dp = new int[m][n+1];
for(int i = 0;i<m;i++){
dp[i][0] = 0;
for(int j =1;j<=n;j++){
dp[i][j] = dp[i][j-1] + matrix[i][j-1];
}
}
}
public int sumRegion(int row1,int col1 , int row2, int col2){
int sum = 0;
while(row1<=row2){
sum += dp[row1][col2+1] - dp[row1][col1];
row1++;
}
return sum;
}
}