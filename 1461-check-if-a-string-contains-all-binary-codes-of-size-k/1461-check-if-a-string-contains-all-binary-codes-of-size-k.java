class Solution {
	public boolean hasAllCodes(String s, int k) {
		Set<Integer> set = new HashSet<>();
		int maxPower = 1 << (k - 1);
		int uniqueNumbers = 1 << k;

		if(s.length() < k) {
			return false;
		}

		int num = 0;

		for(int i = 0; i < k; i++) {
			int val = s.charAt(i) - '0';
			num = num * 2 + val;
		}

		set.add(num);

		for(int i = k; i < s.length(); i++) {
			int first = s.charAt(i - k) - '0';
			int prevNum = first * maxPower;
			num = num - prevNum;

			int val = s.charAt(i) - '0';
			num = num * 2 + val;

			set.add(num);
		}

		return set.size() >= uniqueNumbers;
	}
}