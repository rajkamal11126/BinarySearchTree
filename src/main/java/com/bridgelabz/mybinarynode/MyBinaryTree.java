package com.bridgelabz.mybinarynode;

public class MyBinaryTree<K extends Comparable<K>> {

	private MyBinaryNode<K> root;

	/**
	 * @param key Element added using recursion
	 */
	public void add(K key) {
		this.root = this.addRecursively(root, key);
	}

	private MyBinaryNode<K> addRecursively(MyBinaryNode<K> current, K key) {
		if (current == null)
			return new MyBinaryNode<>(key);
		int compareResult = key.compareTo(current.key);
		if (compareResult == 0)
			return current;

		if (compareResult < 0)
			current.left = addRecursively(current.left, key);
		else if (compareResult > 0)
			current.right = addRecursively(current.right, key);
		return current;
	}

	/**
	 * To get size 
	 */
	public int size() {
		return this.getSizeRecursively(root);
	}

	private int getSizeRecursively(MyBinaryNode<K> current) {
		return (current == null) ? 0 : 1 + getSizeRecursively(current.left) + getSizeRecursively(current.right);
	}

	/**
	 * search method using recursion
	 */
	public boolean searchNode(K key)  {
        root = searchRecursive(root, key);
        if (root!= null)
            return true;
        else
            return false;
    }

    public MyBinaryNode<K> searchRecursive( MyBinaryNode<K> current, K key)  {
        if (current==null || current.key==key)
            return current;
        if (current.key.compareTo(key) > 0)
            return searchRecursive(current.left, key);
        else
            return searchRecursive(current.right, key);
    }

}