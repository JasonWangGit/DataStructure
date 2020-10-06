package Sorting;

public class MergeSort {
	public static int[] sort(int[] array) {
		recur(array, 0, array.length - 1);
		return array;
	}
	
	public static void recur(int[] array, int lower, int upper) {
		if(lower >= upper) {
			
		} else {
			int middle = lower + (upper - lower) / 2;
			recur(array, lower, middle);
			recur(array, middle + 1, upper);
			mergeForSort(array, lower, middle, upper);
		}
	}
	
	// merge method for one array and its boundary
	public static void mergeForSort(int[] array, int lower, int middle,  int upper) {
		int[] a = new int[middle - lower + 1];
		int[] b = new int[upper - middle];
		int lowerTemp = lower;
		int middleTemp = middle;
		for(int i = 0; i < a.length; i++) {
			a[i] = array[lowerTemp++];
		}
		middleTemp++;
		for(int i = 0; i < b.length; i++) {
			b[i] = array[middleTemp++];
		}
		int[] result = merge(a, b);
		int index = 0;
		for(int i = lower; i <= upper; i++) {
			array[i] = result[index++];
		}
	}
	
	// merge method for two arrays
	public static int[] merge(int[] a, int[] b) {
		int[] result = new int[a.length + b.length];
		int aIndex = 0;
		int bIndex = 0;
		for(int i = 0; i < result.length; i++) {
			if(aIndex < a.length && bIndex < b.length) {
				if(a[aIndex] <= b[bIndex]) {
					result[i] = a[aIndex++];
				} else if(b[bIndex] < a[aIndex] ) {
					result[i] = b[bIndex++];
				}
			} else if(aIndex == a.length) {
				result[i] = b[bIndex++];
			} else if(bIndex == b.length) {
				result[i] = a[aIndex++];
			}
			
		}
		return result;
	}
}
