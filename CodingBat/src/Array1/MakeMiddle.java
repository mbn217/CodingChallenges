package Array1;

import java.util.Arrays;

public class MakeMiddle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Given an array of ints of even length, return a new array length 2 containing the middle two elements from the original array. The original array will be length 2 or more.
//
//				makeMiddle([1, 2, 3, 4])  [2, 3]
//				makeMiddle([7, 1, 2, 3, 4, 9])  [2, 3]
//				makeMiddle([1, 2])  [1, 2]
		
		int[] a = {1, 2, 3, 4};
		int[] b = { 7, 1, 2, 3, 4, 9};
		int[] d = { 1,2};

		
		
		System.out.println(Arrays.toString(makeMiddle(a)));
		System.out.println(Arrays.toString(makeMiddle(b)));		
		System.out.println(Arrays.toString(makeMiddle(d)));
	}
	
	public static int[] makeMiddle(int[] a) {
		int[] newArr = new int[2];
		newArr[0]=a[(a.length/2)-1];
		newArr[1]=a[(a.length/2)];
		return newArr;
	}

}
