package Sorting;

public class BubbleSort {
	public static int[] sort(int[] array) {
		int length = array.length;
		for(int outer = length - 1; outer >= 0; outer--) {
			for(int inner = 0; inner < outer; inner++) {
				if(array[inner] > array[inner + 1]) {
					int temp = array[inner];
					array[inner] = array[inner + 1];
					array[inner + 1] = temp;
				}
			}
		}
		return array;
	}
}
