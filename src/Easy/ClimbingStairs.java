package Easy;

import java.util.HashMap;

class ClimbingStairs {

	public int climbStairs(int n) {

		return stairs(n);

	}

	public HashMap<Integer, Integer> h = new HashMap<>();

	public int stairs(int n) {

		if (h.containsKey(n))
			return h.get(n);

		if (n == 0 || n == 1) {
			return 1;
		}

		if (n == 2) {
			return 2;
		}

		h.put(n, stairs(n - 1) + stairs(n - 2));
		return h.get(n);

	}
}
