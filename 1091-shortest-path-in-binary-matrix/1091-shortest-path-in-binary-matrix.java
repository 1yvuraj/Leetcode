class Solution {

    public int shortestPathBinaryMatrix(int[][] grid) {
        int[][] dir = { { -1, 0 }, { -1, 1 }, { 0, 1 }, { 1, 1 }, { 1, 0 }, { 1, -1 }, { 0, -1 }, { -1, -1 } };
        Queue<int[]> ans = new LinkedList<>();
        if (grid[0][0] == 1 || grid[grid.length - 1][grid[0].length - 1] == 1) return -1;
        ans.add(new int[] { 0, 0, 1 });
        grid[0][0] = 1;
        while (ans.size() > 0) {
            int[] arr = ans.poll();
            for (int d = 0; d < dir.length; d++) {
                if (arr[0] == grid.length - 1 && arr[1] == grid[0].length - 1) return arr[2];
                int r = arr[0] + dir[d][0];
                int c = arr[1] + dir[d][1];
                if (r >= 0 && c >= 0 && r <= grid.length - 1 && c <= grid[0].length - 1 && grid[r][c] == 0) {
                    ans.add(new int[] { r, c, arr[2] + 1 });
                    grid[r][c] = 1;
                }
            }
        }
        return -1;
    }
}
