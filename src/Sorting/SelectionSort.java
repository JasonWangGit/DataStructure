package Sorting;

public class SelectionSort {
	public static int[] sort(int[] array) {
		int length = array.length;
		int minIndex;
		for(int outer = 0; outer < length; outer++) {
			minIndex = outer;
			for(int inner = outer + 1; inner < length; inner++) {
				if(array[inner] < array[minIndex]) {
					minIndex = inner;
				}
			}
			int temp = array[outer];
			array[outer] = array[minIndex];
			array[minIndex] = temp;
		}
		return array;
	}
}
