class Solution {

    public int minimumRounds(int[] tasks) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < tasks.length; i++) {
            if (mp.containsKey(tasks[i])) mp.put(tasks[i], mp.get(tasks[i]) + 1); else mp.put(tasks[i], 1);
        }
        int ans = 0;
        for (Integer key : mp.keySet()) {
            if (mp.get(key) <= 1) return -1;
            int tmp = mp.get(key);
            if (tmp % 3 == 0) ans += tmp / 3; else {
                ans += (tmp / 3) + 1;
            }
        }
        return ans;
    }
}
