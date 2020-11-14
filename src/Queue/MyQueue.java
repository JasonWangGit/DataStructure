package Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyQueue<E> {
	private int capacity;
	private Object[] element;
	private int size;
	private int front;
	private int rear;
	
	public MyQueue() {
		// TODO Auto-generated constructor stub
		capacity = 10;
		element = new Object[capacity];
		size = 0;
		front = 0;
		rear = -1;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public void add(E data) {
		if(isFull()) grow();
		if(rear == capacity - 1) rear = -1;
		element[++rear] = data;
		size++;
	}
	
	@SuppressWarnings("unchecked")
	public E peek() {
		if(!isEmpty()) return (E) element[front];
		else throw new NoSuchElementException();
	}
	
	public E remove() {
		if(!isEmpty()) {
			@SuppressWarnings("unchecked")
			E obj = (E) element[front];
			element[front++] = null;
			if(front == capacity) front = 0;
			size--;
			return obj;
		} //else throw new NoSuchElementException();
		else throw new NoSuchElementException();
	}
	
	private void grow() {
		capacity = capacity << 1;
		element = Arrays.copyOf(element, capacity);
	}
}
