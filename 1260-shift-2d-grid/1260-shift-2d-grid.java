// Time complexity: O(MN)
// Space complexity: O(MN) if we count output
class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        if (grid == null || grid.length == 0) return new ArrayList<>();
        final int M = grid.length, N = grid[0].length;
        List<List<Integer>> matrix = new ArrayList<>(M);
        for (int i = 0; i < M; i++) {
            List<Integer> row = new ArrayList<>(N);
            for (int j = 0; j < N; j++) {
                row.add(0);
            }
            matrix.add(row);
        }
        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                int shift1 = (j + k) / N;
                int shift2 = k - shift1 * N;
                int a = (i + shift1) % M;
                int b = j + shift2;
                matrix.get(a).set(b, grid[i][j]);
            }
        }
        return matrix;
    }
}