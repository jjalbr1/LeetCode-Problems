package Easy;

class NaryTreePostOrderTraversal {
	List<Integer> list = new ArrayList<Integer>();

	public List<Integer> postorder(Node root) {

		pOrder(root);
		return list;

	}

	public void pOrder(Node root) {

		if (root == null) {
			return;
		}
		for (int i = 0; i < root.children.size(); i++) {

			pOrder(root.children.get(i));
		}
		list.add(root.val);
	}
}