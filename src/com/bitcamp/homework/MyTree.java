package com.bitcamp.homework;

/**
 * 
 * @author Edib Imamovic
 *
 */

public class MyTree {

	private String data;
	private MyTree left;
	private MyTree right;

	/**
	 * Constructor with null values
	 */
	public MyTree() {
		data = null;
		left = null;
		right = null;
	}

	/**
	 * Constructor with null values
	 * 
	 * @param data
	 */
	public MyTree(String data) {

		this.data = data;
		left = null;
		right = null;

	}

	/**
	 * Getter for data
	 * 
	 * @return
	 */
	public String getData() {
		return data;
	}

	/**
	 * Getter for left
	 * 
	 * @return
	 */
	public MyTree getLeft() {
		return left;
	}

	/**
	 * Getter for right
	 * 
	 * @return
	 */
	public MyTree getRight() {
		return right;
	}

	/**
	 * Method add
	 * 
	 * @param data
	 */
	public void addData(String data) {

		if (this.data.equals(null)) {
			this.data = data;
			return;
		}

		if (this.data.compareToIgnoreCase(data) < 0) {
			if (left == null) {
				left = new MyTree(data);
			} else {
				left.addData(data);
			}
		}

		else {
			if (right == null) {
				right = new MyTree(data);
			} else {
				right.addData(data);
			}
		}
	}

	/**
	 * Method for print pre order
	 */
	public void preOrderPrint() {

		System.out.println(data);
		if (left != null) {
			left.preOrderPrint();
		}
		if (right != null) {
			right.preOrderPrint();
		}
	}

	/**
	 * Method for print post-order
	 */
	public void postOrderPrint() {

		if (left != null) {
			left.postOrderPrint();
		}
		if (right != null) {
			right.postOrderPrint();
		}
		System.out.println(data);
	}

	/**
	 * Method for print in order
	 */
	public void inOrderPrint() {

		if (left != null) {
			left.inOrderPrint();
		}
		System.out.println(data);
		if (right != null) {
			right.inOrderPrint();
		}
	}

	/**
	 * Method for check if some tree are "binary search tree".
	 * 
	 * @param nextNode
	 * @param leftData
	 * @param rightData
	 * @return boolean value
	 */
	public boolean isBST(Node nextNode, int leftData, int rightData) {
		if (nextNode == null) {
			return true;
		}
		if (nextNode.getData() > leftData || nextNode.getData() <= rightData) {
			return false;
		}

		return (isBST(nextNode.left, nextNode.getData(), rightData) && isBST(
				nextNode.right, leftData, nextNode.getData()));

	}

	/**
	 * Inner class Node for Class MyTree
	 * 
	 * @author Edib Imamovic
	 *
	 */
	private class Node {

		public int value;
		public Node right;
		public Node left;
		public Node nextNode;

		public Node(int value, Node right, Node left, Node nextNode) {
		
			this.value = value;
			this.right = right;
			this.left = left;
			this.nextNode = nextNode;
		}


		/**
		 * Getter for data (int value, boolean method)
		 * 
		 * @return
		 */
		public int getData() {
			return 0;
		}

	}

}