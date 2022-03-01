class Solution {
    public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);

        List<List<Integer>> a = new ArrayList<>();
        int min = 999999999;
        for (int i = 0; i < arr.length - 1; i++) {
            min = Math.min(min, Math.abs(arr[i] - arr[i + 1]));
        }
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1] && Math.abs(arr[i] - arr[i + 1]) == min) {
                List<Integer> w = new ArrayList<Integer>();
                w.add(arr[i]);
                w.add(arr[i + 1]);
                a.add(w);
            }
        }

        return a;
    }
}
