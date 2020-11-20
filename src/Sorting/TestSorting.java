package Sorting;

public class TestSorting {
	public static void main(String[] args) {
		int[] array = {100, 256, 23, 56, 89, 7, 77, 111, 653, 47};
		// Bubble sort
		// display(BubbleSort.sort(array));
		
		// Selection sort
		// display(SelectionSort.sort(array));
		
		// Insertion sort
		// display(InsertionSort.sort(array));
		
		// Merge sort
		//display(MergeSort.sort(array));
		
		// Quick sort
		// display(QuickSort.sort(array));
		// display(QuickSort_v2.sort(array));
		display(QuickSort_v3.sort(array));
	}
	
	public static void display(int[] array) {
		for(int i : array) {
			System.out.print(i + "\t");
		}
		System.out.println();
	}
}
