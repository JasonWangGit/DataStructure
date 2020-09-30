package BinaryTree;

public class TestBinaryTree {
	public static void main(String[] args) {
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(45);
		binaryTree.insert(55);
		binaryTree.insert(12);
		binaryTree.insert(33);
		binaryTree.insert(25);
		binaryTree.insert(78);
		binaryTree.insert(90);
		
		binaryTree.infixOrder(binaryTree.getRoot());
		System.out.println();
		binaryTree.preOrder(binaryTree.getRoot());
		System.out.println();
		binaryTree.afterOrder(binaryTree.getRoot());
		System.out.println();
		
		System.out.println(binaryTree.find(45));
		
		System.out.println(binaryTree.findMax());
		
		System.out.println(binaryTree.FindMin());
		
	}
}
