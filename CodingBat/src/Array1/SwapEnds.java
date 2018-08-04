package Array1;

import java.util.Arrays;

public class SwapEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Given an array of ints, swap the first and last elements in the array. Return the modified array. 
//		The array length will be at least 1.
//
//		swapEnds([1, 2, 3, 4])  [4, 2, 3, 1]
//		swapEnds([1, 2, 3])  [3, 2, 1]
//		swapEnds([8, 6, 7, 9, 5])  [5, 6, 7, 9, 8]
		
		int[] a = {1, 2, 3, 4};
		int[] b = {1, 2, 3};
		int[] c = {8, 6, 7, 9, 5};
		
		System.out.println(Arrays.toString(swapEnds(a)));
		System.out.println(Arrays.toString(swapEnds(b)));
		System.out.println(Arrays.toString(swapEnds(c)));
	}
	
	public static int[] swapEnds(int[] nums) {
		int temp;
		temp = nums[0];
		nums[0] = nums[nums.length-1];
		nums[nums.length-1] = temp;
		return nums;
		
	}

}
