package Queue;

import java.util.Arrays;
import java.util.NoSuchElementException;

public class MyPriorityQueue {
	private int capacity;
	private int[] element;
	private int size;
	
	public MyPriorityQueue() {
		// TODO Auto-generated constructor stub
		capacity = 10;
		element = new int[capacity];
		size = 0;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public void add(int data) {
		if(isFull()) grow();
		int index = size;
		while(index > 0 && data < element[index - 1]) element[index--] = element[index - 1];
		element[index] = data;
		size++;
	}
	
	public int peek() {
		if(!isEmpty()) return element[size - 1];
		else throw new NoSuchElementException();
	}
	
	public int remove() {
		if(!isEmpty()) {
			int i = element[size - 1];
			element[size - 1] = 0;
			size--;
			return i;
		}
		else throw new NoSuchElementException();
	}
	
	private void grow() {
		capacity = capacity << 1;
		element = Arrays.copyOf(element, capacity);
	}
}
