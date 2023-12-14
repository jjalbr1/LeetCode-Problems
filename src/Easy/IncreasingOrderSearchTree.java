package Easy;

class IncreasingOrderSearchTree {

	TreeNode dummy = new TreeNode(0);
	TreeNode start = dummy;

	public TreeNode increasingBST(TreeNode root) {
		increasingTree(root);
		return start.right;
	}

	public void increasingTree(TreeNode root) {
		if (root == null) {
			return;
		}

		increasingTree(root.left);
		TreeNode n = new TreeNode(root.val);
		dummy.right = n;
		dummy = dummy.right;

		increasingTree(root.right);

	}
}
