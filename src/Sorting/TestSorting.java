package Sorting;

public class TestSorting {
	public static void main(String[] args) {
		int[] array = {1, 256, 23, 56, 89, 7, 77, 111, 653, 47};
		// Bubble sort
		// display(BubbleSort.sort(array));
		// Selection sort
		display(SelectionSort.sort(array));
	}
	
	public static void display(int[] array) {
		for(int i : array) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
