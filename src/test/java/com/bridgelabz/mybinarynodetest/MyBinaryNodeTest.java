package com.bridgelabz.mybinarynodetest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.mybinarynode.MyBinaryTree;

public class MyBinaryNodeTest {
	/**
	 * Added three numbers in binary search tree
	 */
	@Test
	public void given3Numbers_WhenAddedToBinaryTree_ShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		Assert.assertEquals(3, myBinaryTree.size());
	}

}
