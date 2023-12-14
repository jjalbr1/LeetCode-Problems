package Easy;

import java.util.HashMap;

class ReverseVowelsOfAString {

	public String reverseVowels(String s) {

		char[] arr = s.toCharArray();

		int a = 0;
		int b = arr.length - 1;
		HashMap<Character, Character> hm = new HashMap<>();
		hm.put('a', 'a');
		hm.put('e', 'e');
		hm.put('i', 'i');
		hm.put('o', 'o');
		hm.put('u', 'u');
		// hm.put('y', 'y');
		hm.put('A', 'A');
		hm.put('E', 'E');
		hm.put('I', 'I');
		hm.put('O', 'O');
		hm.put('U', 'U');
		// hm.put('Y', 'Y');
		while (a < b) {
			if (!hm.containsKey(s.charAt(a))) {
				a++;
			}
			if (!hm.containsKey(s.charAt(b))) {
				b--;
			} else if (hm.containsKey(s.charAt(b)) && hm.containsKey(s.charAt(a))) {
				arr[a] = s.charAt(b);
				arr[b] = s.charAt(a);
				b--;
				a++;
			}
		}
		String arr1 = new String(arr);
		return arr1;
	}
}
