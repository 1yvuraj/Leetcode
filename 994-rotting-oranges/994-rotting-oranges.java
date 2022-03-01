class Solution {
  public int orangesRotting(int[][] grid) {
    if (grid == null || grid.length == 0) return -1;
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[0].length; j++) {
        if (grid[i][j] == 2) {
          dfs(grid, i, j, grid[i][j]);
        }
      }
    }
    int res = 2;
    for (int[] row: grid) {
      for (int col: row) {
        if (col == 1) return -1;
        res = Math.max(res, col);
      }
    }
    return res - 2;
  }
  public static void dfs(int[][] grid, int i, int j, int col) {
    if (i < 0 || j < 0 || i >= grid.length || j >= grid[0].length || grid[i][j] == 0 || (1 < grid[i][j] && grid[i][j] < col)) return;
    grid[i][j] = col;
    dfs(grid, i + 1, j, col + 1);
    dfs(grid, i - 1, j, col + 1);
    dfs(grid, i, j - 1, col + 1);
    dfs(grid, i, j + 1, col + 1);

  }
}