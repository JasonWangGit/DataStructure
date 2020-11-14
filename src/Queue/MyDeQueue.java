package Queue;

import java.util.NoSuchElementException;

public class MyDeQueue<E> {
	private int capacity;
	private Object[] element;
	private int size;
	private int head;
	private int tail;
	
	public MyDeQueue() {
		// TODO Auto-generated constructor stub
		capacity = 16;
		element = new Object[capacity];
		size = 0;
		head = 0;
		tail = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public void addFirst(E data) {
		if(isFull()) grow();
		head = (head - 1) & (capacity - 1);
		element[head] = data;
		size++;
	}
	
	public void addLast(E data) {
		if(isFull()) grow();
		element[tail] = data;
		tail = (tail + 1) & (capacity - 1);
		size++;
	}
	
	@SuppressWarnings("unchecked")
	public E peekFirst() {
		if(!isEmpty()) return (E) element[head];
		else throw new NoSuchElementException();
	}
	
	@SuppressWarnings("unchecked")
	public E peekLast() {
		if(!isEmpty()) return (E) element[tail - 1];
		else throw new NoSuchElementException();
	}
	
	public E removeFirst() {
		if(!isEmpty()) {
			@SuppressWarnings("unchecked")
			E obj = (E) element[head];
			element[head] = null;
			head = (head + 1) & (capacity - 1);
			size--;
			return obj;
		} else throw new NoSuchElementException();
	}
	
	public E removeLast() {
		if(!isEmpty()) {
			tail = (tail - 1) & (capacity - 1);
			@SuppressWarnings("unchecked")
			E obj = (E) element[tail];
			element[tail] = null;
			size--;
			return obj;
		} else throw new NoSuchElementException();
	}
	
	private void grow() {
		int newCapacity = capacity << 1;
		Object[] newElement = new Object[newCapacity];
		System.arraycopy(element, 0, newElement, 0, tail);
		System.arraycopy(element, head, newElement, capacity - 1 + head, capacity - head);
		head = capacity - 1 + head;
		capacity = newCapacity;
		element = newElement;
	}
}
