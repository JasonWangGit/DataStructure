package LinkedList;

public class TestSingleLinkedList {
	public static void main(String[] args) {
		SingleLinkedList singleLinkedList = new SingleLinkedList();
		singleLinkedList.add(1);
		singleLinkedList.add(2);
		singleLinkedList.add(3);
		singleLinkedList.add(4);
		singleLinkedList.add(5);
		singleLinkedList.display();
		System.out.println();
		System.out.println();
		
		singleLinkedList.delete();
		singleLinkedList.delete();
		singleLinkedList.display();
	}
}
