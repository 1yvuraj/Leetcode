class Solution {
     public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int row = image.length;
        int col = image[0].length;
        helper(image, sr, sc, row, col, newColor, image[sr][sc]);
        return image;
    }
    public static void helper(int[][] image, int sr, int sc, int row, int col, int newColor, int intialColor){
        //if sr crosses row Length or 
        //sc crosses colLenth  or 
        //if current Color is not equal as intial color or 
        //current color is same color no need to change simply return
        if(sr<0 || sr>=row || sc<0 || sc>=col || image[sr][sc]!=intialColor || image[sr][sc]==newColor) return;
        //change color
        image[sr][sc] = newColor;
        //recursive call to bottom
        helper(image, sr+1, sc, row, col, newColor, intialColor);
         //recursive call to top
        helper(image, sr-1, sc, row, col, newColor, intialColor);
         //recursive call to right
        helper(image, sr, sc+1, row, col, newColor, intialColor);
         //recursive call to left
        helper(image, sr, sc-1, row, col, newColor, intialColor);
    }
}