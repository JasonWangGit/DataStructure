package LinkedList;

import java.util.LinkedList;

public class SingleLinkedList {
	private int size;
	private Node head;
	// constructor
	public SingleLinkedList() {
		// TODO Auto-generated constructor stub
		size = 0;
		head = null;
	}
	// internal class for node
	private class Node {
		private Object data;
		private Node next;
		// constructor
		public Node(Object obj) {
			// TODO Auto-generated constructor stub
			data = obj;
			next = null;
		}
	}
	// isEmpty method
	public boolean isEmpty() {
		return size == 0;
	}
	// add method
	public void add(Object obj) {
		Node node = new Node(obj);
		if(size == 0) {
			head = node;
		} else {
			node.next = head;
			head = node;
		}
		size++;
	}
	// delete method
	public boolean delete() {
		if(!isEmpty()){
			head = head.next;
			size--;
		} else {
			return false;
		}
		return false;
	}
	// display method
	public void display() {
		int temp = size;
		Node current = head;
		if(!isEmpty()){
			System.out.print("[ " + current.data + " -> ");
			current = current.next;
			temp--;
			while(temp > 0) {
				if(temp == 1) {
					System.out.print(current.data + " ]");
				} else {
					System.out.print(current.data + " -> ");
				}
				current = current.next;
				temp--;
			}
			System.out.println();
		}
	}
	
}
