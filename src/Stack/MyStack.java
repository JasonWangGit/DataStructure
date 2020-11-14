package Stack;

import java.util.Arrays;
import java.util.EmptyStackException;

public class MyStack<E> {
	private int capacity;
	private Object[] element;
	private int size;
	private int top;
	
	public MyStack() {
		// TODO Auto-generated constructor stub
		capacity = 10;
		element = new Object[capacity];
		size = 0;
		top = -1;
	}
	
	public boolean isEmpty() {
		return size == 0;
	}
	
	public boolean isFull() {
		return size == capacity;
	}
	
	public void push(E data) {
		if(isFull()) {
			grow();
		}
		element[++top] = data;
		size++;
	}
	
	@SuppressWarnings("unchecked")
	public E peek() {
		if(!isEmpty()) return (E) element[top];
		else throw new EmptyStackException();
	}
	
	@SuppressWarnings("unchecked")
	public E pop() {
		if(!isEmpty()) {
			E obj = (E) element[top];
			element[top--] = null;
			size--;
			return obj;
		}
		else throw new EmptyStackException();
	}
	
	private void grow() {
		capacity = capacity << 1;
		element = Arrays.copyOf(element, capacity);
	}
}
