package Sorting;

public class InsertionSort {
	public static int[] sort(int[] array) {
		int length = array.length;
		int temp;
		for(int outer = 1; outer < length; outer++) {
			temp = array[outer];
			int inner = outer;
			while(true) {
				if(array[inner - 1] > temp) {
					array[inner] = array[inner - 1];
					inner--;
				} else if(array[inner - 1] <= temp || inner == 0) {
					array[inner] = temp;
					break;
				}
			}
		}
		return array;
	}
}
