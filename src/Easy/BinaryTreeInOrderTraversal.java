package Easy;

class BinaryTreeInOrderTraversal {
	List<Integer> list = new ArrayList<Integer>();

	public List<Integer> inorderTraversal(TreeNode root) {

		traverse(root);
		return list;

	}

	public void traverse(TreeNode node) {

		if (node == null) {
			return;
		}

		traverse(node.left);

		list.add(node.val);

		traverse(node.right);
	}
}
