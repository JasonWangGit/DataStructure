package Searching;

public class TestSearching {
	public static void main(String[] args) {
		int[] array = {1, 5, 23, 56, 64, 77, 91, 111, 653};
		// Binary search by loop
		System.out.println(BinarySearch.searchByLoop(array, 0));
		
		// Binary search by recur
		System.out.println(BinarySearch.searchByRecur(array, 666));
	}
}
