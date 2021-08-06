package br.edu.uni7.aed2.tree;

public class TreeNode {
	private Integer key;
	private Object paylod;
	private TreeNode leftChild;
	private TreeNode rightChild;
	private TreeNode parent;

	public TreeNode(Integer key, Object value) {
		this(key, value, null, null, null);
	}

	public TreeNode(Integer key, Object value, TreeNode parent) {
		this(key, value, null, null, parent);
	}

	public TreeNode(Integer key, Object value, TreeNode leftChild, TreeNode rightChild, TreeNode parent) {
		this.key = key;
		this.paylod = value;
		this.leftChild = leftChild;
		this.rightChild = rightChild;
		this.parent = parent;
	}

	public Integer getKey() {
		return key;
	}

	public void setParent(TreeNode parent) {
		this.parent = parent;
	}

	public TreeNode getLeftChild() {
		return leftChild;
	}

	public TreeNode getRightChild() {
		return rightChild;
	}

	public boolean isLeftChild() {
		boolean result = false;

		if ((parent != null) && (parent.leftChild == this)) {
			result = true;
		}

		return result;
	}

	public boolean isRightChild() {
		boolean result = false;

		if ((parent != null) && (parent.rightChild == this)) {
			result = true;
		}

		return result;
	}

	public boolean isRoot() {
		return parent == null;
	}

	public boolean isLeaf() {
		boolean result = (rightChild == null) && (leftChild == null);

		return result;
	}

	public boolean hasAnyChildren() {
		boolean result = (rightChild != null) || (leftChild != null);

		return result;
	}

	public boolean hasBothChildren() {
		boolean result = (rightChild != null) && (leftChild != null);

		return result;
	}

	public boolean hasLeftChild() {
		return getLeftChild() != null;
	}

	public boolean hasRightChild() {
		return getRightChild() != null;
	}

	public void replaceNodeData(Integer key, Object value, TreeNode lc, TreeNode rc) {
		this.key = key;
		this.paylod = value;
		this.leftChild = lc;
		this.rightChild = rc;

		if (lc != null) {
			lc.setParent(this);
		}

		if (rc != null) {
			rc.setParent(this);
		}
	}

	public void setLeftChild(TreeNode leftChild) {
		this.leftChild = leftChild;
	}

	public void setRightChild(TreeNode rightChild) {
		this.rightChild = rightChild;
	}
	
	public TreeNode getParent() {
		return parent;
	}
	
	public Object getPaylod() {
		return paylod;
	}
}
