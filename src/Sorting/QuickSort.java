package Sorting;

public class QuickSort {
	public static int[] sort(int[] array) {
		recur(array, 0, array.length - 1);
		return array;
	}
	
	public static void recur(int[] array, int lower, int upper) {
		if(upper <= lower) {
			
		} else {
			int middle = divideArray(array, lower, upper);
			recur(array, lower, middle - 1);
			recur(array, middle + 1, upper);
		}	
	}
	
	public static void swap(int[] array, int i, int j) {
		int temp = array[i];
		array[i] = array[j];
		array[j] = temp;
	}
	
	public static int divideArray(int[] array, int lower, int upper) {
		int middleVal = array[lower];
		int i = lower + 1;
		int j = upper;
		while(true) {
			while(array[i] < middleVal && i < upper) {
				i++;
			}
			while(array[j] > middleVal && j > lower) {
				j--;
			}
			if(i >= j) {
				swap(array, j, lower);
				break;
			} else {
				swap(array, i, j);
			}
		}
		return j;
	}
}
