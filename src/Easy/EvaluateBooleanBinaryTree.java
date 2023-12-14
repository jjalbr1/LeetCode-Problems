package Easy;

class EvaluateBooleanBinaryTree {
	public boolean evaluateTree(TreeNode root) {

		return boolTree(root);

	}

	public boolean boolTree(TreeNode root) {

		if (root == null) {
			return false;
		}

		if (root.left == null) {
			if (root.val == 0)
				return false;
			return true;
		}

		boolean left = boolTree(root.left);
		boolean right = boolTree(root.right);

		if (root.val == 2) {
			return left || right;
		} else {
			return left && right;
		}

	}
}
