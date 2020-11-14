package Stack;

public class TestStack {
	public static void main(String[] args) {
		MyStack<Integer> myStack = new MyStack<>();
		myStack.push(1);
		myStack.push(2);
		myStack.push(3);
		myStack.push(4);
		myStack.push(5);
		myStack.push(6);
		myStack.push(7);
		myStack.push(8);
		myStack.pop();
		myStack.pop();
		myStack.pop();
		myStack.push(9);
		myStack.push(10);
		myStack.push(11);
		myStack.push(12);
		System.out.println(myStack.peek());
		myStack.push(13);
		System.out.println(myStack.peek());
		myStack.push(14);
		System.out.println(myStack.peek());
		myStack.push(15);
		myStack.push(16);
		System.out.println();
	}
}
