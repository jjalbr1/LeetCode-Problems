package Easy;

class MaxDepthOfBinaryTree {
	public int maxDepth(TreeNode root) {
		return mDepth(root);
	}

	public int mDepth(TreeNode node) {

		if (node == null) {
			return 0;
		}

		return 1 + Math.max(mDepth(node.left), mDepth(node.right));
	}
}
