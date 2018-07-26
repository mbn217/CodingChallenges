package Array1;

public class MaxEnd3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Given an array of ints length 3, figure out which is larger,
		// the first or last element in the array, and set all the other elements to be
		// that value. Return the changed array.
		//
		// maxEnd3([1, 2, 3]) [3, 3, 3]
		// maxEnd3([11, 5, 9]) [11, 11, 11]
		// maxEnd3([2, 11, 3]) [3, 3, 3]
		
		
		int[] a = {11, 5, 9};
		maxEnd3(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int[] maxEnd3(int[] nums) {
		if (nums[0] > nums[2]) {
			for (int i = 0; i < nums.length; i++) {
				nums[i] = nums[0];
			}
		} else {
			for (int i = 0; i < nums.length; i++) {
				nums[i] = nums[2];
			}
		}
		return nums;
	}

}
