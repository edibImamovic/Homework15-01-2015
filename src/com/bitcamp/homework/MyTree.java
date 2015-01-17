package com.bitcamp.homework;

/**
 * 
 * @author Edib Imamovic
 * @versionChanges made in 17.01.2015.
 */

public class MyTree {

	private int data; // change from type String to int.
	private MyTree left;
	private MyTree right;

	/**
	 * Constructor with null values
	 */
	public MyTree() {
		data = 0;
		left = null;
		right = null;
	}

	/**
	 * Constructor with null values
	 * 
	 * @param data
	 */
	public MyTree(int data) {

		this.data = data;
		left = null;
		right = null;

	}

	/**
	 * Getter for data
	 * 
	 * @return
	 */
	public int getData() {
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
	 * @param left
	 *            the left to set
	 */
	public void setLeft(MyTree left) {
		this.left = left;
	}

	/**
	 * @param right
	 *            the right to set
	 */
	public void setRight(MyTree right) {
		this.right = right;
	}

	/**
	 * Method add
	 * 
	 * @param data
	 */
	public void addData(int data) {

		if (this.data == 0) {
			this.data = data;
			return;
		}

		if (this.data <= data) {
			if (left == null) {
				left = new MyTree(data);
			} else {
				left.addData(data);
			}
		} else {
			if (this.data > data) {
				if (right == null) {
					right = new MyTree(data);
				} else {
					right.addData(data);
				}
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
	public boolean isBST(MyTree nextNode, int leftData, int rightData) {
		if (nextNode == null) {
			return true;
		}
		if (nextNode.getData() > leftData || nextNode.getData() <= rightData) {
			return false;
		}

		return (isBST(nextNode.left, nextNode.getData(), rightData) && isBST(
				nextNode.right, leftData, nextNode.getData()));

	}

}
