package Array1;

import java.util.Arrays;

public class MidThree {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given an array of ints of odd length, return a new array length 3 containing 
//				the elements from the middle of the array. The array length will be at least 3.
//
//				midThree([1, 2, 3, 4, 5]) → [2, 3, 4]
//				midThree([8, 6, 7, 5, 3, 0, 9]) → [7, 5, 3]
//				midThree([1, 2, 3]) → [1, 2, 3]
		

		int[] a = {1, 2, 3, 4, 5};
		int[] b = {8, 6, 7, 5, 3, 0, 9};
		int[] c = {1, 2, 3};
		System.out.println(a.length/2);
		System.out.println(Arrays.toString(midThree(a)));
		System.out.println(Arrays.toString(midThree(b)));
		System.out.println(Arrays.toString(midThree(c)));
	}
	
	public static int[] midThree(int[] nums ) {
		int[] newArr = new int[3];
		newArr[0] = nums[(nums.length/2)-1];
		newArr[1] = nums[(nums.length/2)];
		newArr[2] = nums[(nums.length/2)+1];
		return newArr;
	}

}
