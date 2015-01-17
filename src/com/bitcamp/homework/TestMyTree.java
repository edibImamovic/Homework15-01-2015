package com.bitcamp.homework;

/**
 * Test Class for Class MyTree
 * 
 * @author Edib Imamovic
 *
 */
public class TestMyTree {

	public static void main(String[] args) {

		MyTree test = new MyTree();

		test.addData(2);
		test.addData(2);
		test.addData(2);
		test.addData(2);
		test.addData(2);
		test.addData(2);
		test.preOrderPrint();

		System.out.println(test.isBST(test, Integer.MIN_VALUE,
				Integer.MAX_VALUE));

	}

}
