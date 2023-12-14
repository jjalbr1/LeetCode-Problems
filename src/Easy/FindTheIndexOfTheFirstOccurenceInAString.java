package Easy;

class FindTheIndexOfTheFirstOccurenceInAString {

	public int strStr(String haystack, String needle) {

		int a = 0;
		int answer = -1;

		for (int i = 0; i < haystack.length() - needle.length() + 1; i++) {

			if (haystack.charAt(i) == needle.charAt(0)) {

				boolean test = true;
				for (int j = 0; j < needle.length(); j++) {

					if (haystack.charAt(i + j) != needle.charAt(j)) {

						test = false;

					}
				}

				if (test && answer == -1) {
					answer = i;
				}

			}

		}

		return answer;

	}
}
