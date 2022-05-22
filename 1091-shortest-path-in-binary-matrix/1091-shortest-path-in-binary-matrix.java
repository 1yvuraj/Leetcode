class Solution {

    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] dir = { { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 } };
        LinkedList<int[]> list = new LinkedList<>();
        list.addLast(new int[] { 0, 0, 1 });
        if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) return -1;
        while (list.size() > 0) {
            int[] arr = list.removeFirst();
            int x = arr[0];
            int y = arr[1];
            int move = arr[2];
            grid[x][y] = 1;
            for (int d = 0; d < dir.length; d++) {
                if (x == grid.length - 1 && y == grid[0].length - 1) return move;
                int r = x + dir[d][0];
                int c = y + dir[d][1];
                
                if (r >= 0 && c >= 0 && r <= grid.length - 1 && c <= grid[0].length - 1 && grid[r][c]==0) {
                    list.addLast(new int[] { r, c, move + 1 });
                    grid[r][c] = 1;
                }
            }
        }
        return -1;
    }
}
