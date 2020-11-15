package Sorting;

public class QuickSort_v2 {
	public static int[] sort(int[] nums) {
		recur(nums, 0, nums.length - 1);
		return nums;
	}
	
	public static void recur(int[] nums, int left, int right) {
		if(left < right) {
			int middle = partition(nums, left, right);
			recur(nums, left, middle - 1);
			recur(nums, middle + 1, right);
		}
	}
	
	public static int partition(int[] nums, int left, int right) {
		if(left == right)
			return left;
		int pivotal = nums[left];
		int i = left + 1;
		int j = right;
		while(true) {
			while(nums[i] <= pivotal && i < right) i++;
			while(nums[j] > pivotal && j > left) j--;
			if(i < j) swap(nums, i, j);
			else break;
		}
		swap(nums, left, j);
		return j;
	}
	
	public static void swap(int[] nums, int i, int j) {
		int temp = nums[i];
		nums[i] = nums[j];
		nums[j] = temp;
	}
}
