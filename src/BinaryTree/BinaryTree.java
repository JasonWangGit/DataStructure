package BinaryTree;

public class BinaryTree {
	private Node root;
	
	public Node getRoot() {
		return root;
	}

	public void setRoot(Node root) {
		this.root = root;
	}

	public BinaryTree() {
		// TODO Auto-generated constructor stub
		root = null;
	}

	// insert method
	public boolean insert(int data) {
		Node newNode = new Node(data);
		Node current = root;
		Node parent = null;
		if(root == null) {
			root = new Node(data);
		} else {
			while(current != null) {
				parent = current;
				if(data < current.getData()) {
					current = current.getLeftChild();
					if(current == null) {
						parent.setLeftChild(newNode);
						return true;
					}
				} else if(data > current.getData()) {
					current = current.getRightChild();
					if(current == null) {
						parent.setRightChild(newNode);
						return true;
					}
				} else {
					return false;
				}
			}
		}
		return false;
	}
	
	// find method
	public Node find(int data) {
		Node current = root;
		while(current != null) {
			if(data < current.getData()) {
				current = current.getLeftChild();
				if(current == null) {
					continue;
				}
			} else if(data > current.getData()) {
				current = current.getRightChild();
				if(current == null) {
					continue;
				}
			} else {
				return current;
			}
		}
		return null;
		
	}
	
	// find max method
	public Node findMax() {
		Node current = root;
		Node MaxNode = current;
		while(current != null) {
			MaxNode = current;
			current = current.getRightChild();
		}
		return MaxNode;
		
	}	
	
	// find min method
	public Node FindMin() {
		Node current = root;
		Node MinNode = current;
		while(current != null) {
			MinNode = current;
			current = current.getLeftChild();
		}
		return MinNode;
	}
		
	// infix-order traversal
	public void infixOrder(Node current) {
		if(current != null) {
			infixOrder(current.getLeftChild());
			System.out.print(current.getData() + "  ");
			infixOrder(current.getRightChild());
		}
	} 
	
	// pre-order traversal
	public void preOrder(Node current) {
		if(current != null) {
			System.out.print(current.getData() + "  ");
			infixOrder(current.getLeftChild());
			infixOrder(current.getRightChild());
		}
	}
	
	// after-order traversal
	public void afterOrder(Node current) {
		if(current != null) {
			infixOrder(current.getLeftChild());
			infixOrder(current.getRightChild());
			System.out.print(current.getData() + "  ");
		}
	}
	
	public boolean delete(int data) {
		return false;
	}
}
