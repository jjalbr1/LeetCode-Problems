package Easy;

class RepeatedSubStringPattern {

	public boolean repeatedSubstringPattern(String s) {

		for (int i = 1; i <= s.length() / 2; i++) {

			if (s.length() % i == 0) {
				int mult = s.length() / i;
				String test = "";

				for (int j = 1; j <= mult; j++) {
					test = test + s.substring(0, i);

				}

				if (test.equalsIgnoreCase(s)) {
					return true;

				}
			}

		}
		return false;
	}
}
