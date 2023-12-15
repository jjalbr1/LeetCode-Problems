package Easy;

class InvertBinaryTree {

	public TreeNode invertTree(TreeNode root) {

		TreeNode root2 = root;
		iTree(root);
		return root2;
	}

	public void iTree(TreeNode root) {

		if (root == null) {
			return;
		}
		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		iTree(root.left);
		iTree(root.right);
	}
}
