package me.moriya.exercicio9;

public class Tree {

	private BinaryTree root;

	public void add(int value) {
		root = add(root, value);
	}
	
	public int sum() {
		return sum(root);
	}
	
	private int sum(BinaryTree node) {
		if (node == null)
			return 0;
		int old = node.getValor();
		node.setValor(sum(node.getLeft()) + sum(node.getRight()));
		
		return node.getValor() + old;
	}

	private BinaryTree add(BinaryTree node, int data) {
		if (node == null) {
			node = BinaryTree.of(data);
		} else {
			if (data <= node.getValor())
				node.setLeft(add(node.getLeft(), data));
			else
				node.setRight(add(node.getRight(), data));
		}
		return node;
	}
	
}