package me.moriya.exercicio9;

/**
 * Exercicio 9 <br/>
 * - Considerando a estrutura de uma árvore binária:
 * 
 * <pre>
 * {@code
 * public class BinaryTree {
 *     int valor; 
 *     BinaryTree left; 
 *     BinaryTree right;  
 * }
 * </pre>
 * 
 * Desenvolva um método que dado um nó da árvore calcule a soma de todos os nós
 * subsequentes.
 * 
 * @author andremoriya@gmail.com
 *
 */
public class BinaryTree {
	
	private int valor;
	
	private BinaryTree left;
	private BinaryTree right;
	
	private BinaryTree(int valor) {
		this.valor = valor;
	}
	
	public static BinaryTree of(int valor) {
		return new BinaryTree(valor);
	}

	public BinaryTree getLeft() {
		return left;
	}

	public void setLeft(BinaryTree left) {
		this.left = left;
	}

	public BinaryTree getRight() {
		return right;
	}

	public void setRight(BinaryTree right) {
		this.right = right;
	}
	
	public int getValor() {
		return valor;
	}
	
	public void setValor(int valor) {
		this.valor = valor;
	}
	
	/*private int sum = 0;
	private Node root;

	public void add(int value) {
		Node node = new Node(value);

		if (root == null) {
			root = node;
		} else {
			Node aux = root;
			Node main;

			while (true) {
				main = aux;

				if (value < aux.getValue()) {
					aux = aux.getLeft();

					if (aux == null) {
						main.setLeft(node);
						return;
					}
				} else {
					aux = aux.getRight();

					if (aux == null) {
						main.setRight(node);
						return;
					}
				}
			}
		}
	}

	public int sum(Node node) {
		if (node == null)
			return 0;

		if (node == root)
			sum = sum(node.getLeft()) + sum(node.getRight());
		else
			sum = sum(node.getLeft()) + sum(node.getRight()) + node.getValue();
		
		return sum;
	}*/
	
}

/*class Node {
	private int value;

	private Node left;
	private Node right;

	Node(int value) {
		this.value = value;
	}

	public Node getLeft() {
		return left;
	}

	public void setLeft(Node left) {
		this.left = left;
	}

	public Node getRight() {
		return right;
	}

	public void setRight(Node right) {
		this.right = right;
	}

	public int getValue() {
		return value;
	}
}*/