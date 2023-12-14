package Easy;

import java.util.Stack;

class ValidParentheses {

	public boolean isValid(String s) {
		Stack stack = new Stack();

		if (s.length() == 1)
			return false;

		if (s.charAt(0) == ')' || s.charAt(0) == '}' || s.charAt(0) == ']')
			return false;

		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(' || s.charAt(i) == '{' || s.charAt(i) == '[') {
				stack.push(s.charAt(i));
			}
			if (s.charAt(i) == ')') {
				if (stack.isEmpty())
					return false;
				char check = (char) stack.pop();

				if (check != '(')
					return false;
			}

			if (s.charAt(i) == ']') {
				if (stack.isEmpty())
					return false;
				char check = (char) stack.pop();

				if (check != '[')
					return false;
			}

			if (s.charAt(i) == '}') {
				if (stack.isEmpty())
					return false;
				char check = (char) stack.pop();

				if (check != '{')
					return false;
			}

		}

		if (!stack.isEmpty())
			return false;

		return true;
	}
}
// Use stack to keep track of operations such as in calculator project
