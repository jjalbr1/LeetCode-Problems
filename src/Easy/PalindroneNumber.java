package Easy;

class PalindroneNumber {
	public boolean isPalindrome(int x) {
		if (x < 0)
			return false;

		if (x < 10)
			return true;

		if (x % 10 == 0)
			return false;

		int xCopy = x;
		int num2 = x % 10;

		while (x > 9) {

			x = x / 10;
			num2 = (num2 * 10) + (x % 10);

		}

		if (xCopy == num2) {
			return true;
		}
		return false;
	}
}