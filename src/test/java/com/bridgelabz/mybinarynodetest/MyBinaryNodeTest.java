package com.bridgelabz.mybinarynodetest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.mybinarynode.MyBinaryTree;

public class MyBinaryNodeTest {
	@Test
	public void given3NumbersWhenAddedToBinaryTreeShouldReturnSizeThree() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		Assert.assertEquals(3, myBinaryTree.size());
	}
}
