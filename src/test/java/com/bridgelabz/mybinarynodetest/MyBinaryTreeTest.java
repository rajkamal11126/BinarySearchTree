package com.bridgelabz.mybinarynodetest;

import org.junit.Assert;
import org.junit.Test;

import com.bridgelabz.mybinarynode.MyBinaryTree;

public class MyBinaryTreeTest {

	/**
	 * Added 13 numbers in binary tree and return size
	 */
	@Test
	public void given13NumbersToAdd_WhenAnlysed_ShouldReturnSize13() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(40);
		myBinaryTree.add(60);
		myBinaryTree.add(95);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(16);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		Assert.assertEquals(13, myBinaryTree.size());
	}

	/**
	 * using search method to search the node in 13 elements
	 */
	@Test
	public void given13NumbersToAdd_WhenSearch63_ShouldReturnTrue() {
		MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<>();
		myBinaryTree.add(56);
		myBinaryTree.add(30);
		myBinaryTree.add(70);
		myBinaryTree.add(22);
		myBinaryTree.add(11);
		myBinaryTree.add(3);
		myBinaryTree.add(40);
		myBinaryTree.add(16);
		myBinaryTree.add(60);
		myBinaryTree.add(65);
		myBinaryTree.add(63);
		myBinaryTree.add(67);
		myBinaryTree.add(95);
		boolean result = myBinaryTree.searchNode(63);
		Assert.assertTrue(result);
	}
}
