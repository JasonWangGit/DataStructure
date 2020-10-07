package Searching;

public class BinarySearch {
	public static int searchByLoop(int[] array, int value) {
		int lower = 0;
		int upper = array.length - 1;
		int middle;
		while(lower < upper) {
			middle = lower + (upper - lower) / 2;
			if(value == array[middle]) {
				return array[middle];
			} else {
				if(value > array[middle]) {
					lower = middle + 1;
				} else {
					upper = middle - 1;
				}
			}
		}
		return -1;
	}
	
	public static int searchByRecur(int[] array, int value) {
		return recur(array, value, 0, array.length - 1);
	}
	
	public static int recur(int[] array, int value, int lower, int upper) {
		if(lower > upper) {
			return -1;
		}
		int middle = lower + (upper - lower) / 2;
		if(value == array[middle]) {
			return array[middle];
		} else {
			if(value > array[middle]) {
				lower = middle + 1;
				recur(array, value, middle + 1, upper);
			} else {
				upper = middle - 1;
				recur(array, value, lower, middle - 1);
			}
		}
		return -1;
	}
}
