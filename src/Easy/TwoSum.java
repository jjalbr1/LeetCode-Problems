package Easy;

import java.util.Arrays;

class TwoSm {
	public String longestCommonPrefix(String[] strs) {

		Arrays.sort(strs);
		String s1 = strs[0];
		String s2 = strs[strs.length - 1];
		int idx = 0;
		while (idx < s1.length() && idx < s2.length()) {
			if (s1.charAt(idx) == s2.charAt(idx)) {
				idx++;
			} else {
				break;
			}
		}
		return s1.substring(0, idx);
	}
}
// Trick is to sort the array of strings and compare the first string to the
// last. The longest commond //prefix between the two will contain the strings
// in between
