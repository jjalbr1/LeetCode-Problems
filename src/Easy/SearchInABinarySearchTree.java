package Easy;

class SearchInABinarySearchTree {

	public TreeNode searchBST(TreeNode root, int val) {

		return sBST(root, val);
	}

	public TreeNode sBST(TreeNode node, int val) {

		if (node == null) {
			return null;
		}

		if (node.val == val) {
			return node;
		}

		if (node.val < val) {
			return sBST(node.right, val);
		} else {

			return sBST(node.left, val);
		}
	}
}
