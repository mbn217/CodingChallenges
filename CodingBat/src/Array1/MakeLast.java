package Array1;

import java.util.Arrays;

public class MakeLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//				Given an int array, return a new array with double the length 
//				where its last element is the same as the original array, 
//				and all the other elements are 0. The original array will
//				be length 1 or more. Note: by default, a new int array contains all 0's.
//
//				makeLast([4, 5, 6])  [0, 0, 0, 0, 0, 6]
//				makeLast([1, 2])  [0, 0, 0, 2]
//				makeLast([3])  [0, 3]
		
		
		
		int[] a  = {4, 5, 6};
		int[] b  = {1, 2};
		int[] c  = {3};
		System.out.println(Arrays.toString(makeLast(a)));
		System.out.println(Arrays.toString(makeLast(b)));
		System.out.println(Arrays.toString(makeLast(c)));
		
	}
	
	public static int[] makeLast(int[] nums) {
		int[] newArray = new int[(nums.length)*2];
		for (int i = 0; i < newArray.length-1; i++) {
			newArray[i]=0;
		}
		newArray[newArray.length-1]=nums[nums.length-1];
		
		return newArray;
	}
	
	

}
