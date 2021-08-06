package br.edu.uni7.aed2.tree;

public class BinarySearchTree {
	private TreeNode root;
	private int size;

	public BinarySearchTree() {
		this.root = null;
		this.size = 0;
	}

	public int length() {
		return size;
	}

	public void put(Integer key, Object value) {
		if (root != null) {
			_put(key, value, root);
		} else {
			root = new TreeNode(key, value);
		}

		size++;
	}

	private void _put(Integer key, Object value, TreeNode currentNode) {
		if (key < currentNode.getKey()) {
			if (currentNode.hasLeftChild()) {
				_put(key, value, currentNode.getLeftChild());
			} else {
				currentNode.setLeftChild(new TreeNode(key, value, currentNode));
			}
		} else {
			if (currentNode.hasRightChild()) {
				_put(key, value, currentNode.getRightChild());
			} else {
				currentNode.setRightChild(new TreeNode(key, value, currentNode));
			}
		}
	}

	public Object get(Integer key) {
		if (root != null) {
			TreeNode res = _get(key, root);

			if (res != null) {
				return res.getPaylod();
			} else {
				return null;
			}
		} else {
			return null;
		}
	}

	private TreeNode _get(Integer key, TreeNode currentNode) {
		if (currentNode == null) {
			return null;
		} else if (currentNode.getKey() == key) {
			return currentNode;
		} else if (key < currentNode.getKey()) {
			return _get(key, currentNode.getLeftChild());
		} else {
			return _get(key, currentNode.getRightChild());
		}
	}

	public boolean contains(Integer key) {
		boolean result = false;

		if (_get(key, root) != null) {
			result = true;
		}

		return result;
	}

	public static void main(String[] args) {
		BinarySearchTree tree = new BinarySearchTree();
		Integer numbers[] = { 70, 31, 93, 94, 14, 23, 73 };

		for (Integer number : numbers) {
			tree.put(number, "number: " + number);
		}

		for (Integer n : numbers) {
			System.out.println("Contains " + n + " : " + tree.contains(n));
		}

		System.out.println();

		Integer numbers2[] = { 70, 31, 93, 94, 14, 23, 73, 32 };
		for (Integer n : numbers2) {
			System.out.println("Contains " + n + " : " + tree.contains(n));
		}
	}
}
