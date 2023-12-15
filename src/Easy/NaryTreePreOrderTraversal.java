package Easy;

class NaryTreePreOrderTraversal {

	List<Integer> list = new ArrayList<Integer>();

	public List<Integer> preorder(Node root) {

		pOrder(root);
		return list;
	}

	public void pOrder(Node node) {
		if (node == null) {
			return;
		}

		list.add(node.val);
		for (int i = 0; i < node.children.size(); i++) {
			pOrder(node.children.get(i));
		}
	}
}