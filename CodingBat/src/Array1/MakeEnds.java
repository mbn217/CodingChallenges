package Array1;

import java.util.Arrays;

public class MakeEnds {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given an array of ints, return a new array length 2 containing the 
//		first and last elements from the original array. The original array will be length 1 or more.
//
//				makeEnds([1, 2, 3])  [1, 3]
//				makeEnds([1, 2, 3, 4])  [1, 4]
//				makeEnds([7, 4, 6, 2])  [7, 2]
		int[] a  = {1, 2, 3};
		int[] b  = {1, 2, 3, 4};
		int[] c  = {7, 4, 6, 2};
		System.out.println(Arrays.toString(makeEnds(a)));
		System.out.println(Arrays.toString(makeEnds(b)));
		System.out.println(Arrays.toString(makeEnds(c)));
		
	}

	public static int[] makeEnds(int[] nums) {
		
		if (nums.length==1) {
			int[] newAray = {nums[0],nums[0]};
			return newAray;
		}else {
			int[] newAray = {nums[0],nums[nums.length-1]};
			return newAray;
		}
	}
}
