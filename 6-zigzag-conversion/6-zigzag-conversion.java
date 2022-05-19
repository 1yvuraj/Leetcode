class Solution {
    public String convert(String s, int numRows) {
        String[][] matrix = new String[numRows][s.length()];
        
        int count = 0;
        int row = 0;
        int col = 0;
        while(count < s.length()){
            row = 0;
            for(int i = 0 ; i < numRows ; i++){
                if(count >= s.length())
                    break;
                else{
                    matrix[row][col] = Character.toString(s.charAt(count));
                    count++;
                    row++;
                }
                
            }
            
            row--;
            for(int i = 0 ; i < numRows - 2 ; i++){
                if(count >= s.length())
                    break;
                row--;
                col++;
                matrix[row][col] = Character.toString(s.charAt(count));
                count++;
            }
            
            row--;
            col++;
        }
        
        String result = "";
        for(int i = 0 ; i<numRows ; i++){
            for(int j = 0 ; j<matrix[0].length ; j++){
                if(matrix[i][j] != null){
                    result += matrix[i][j];
                }
            }
        }
        
        return result;
    }
}