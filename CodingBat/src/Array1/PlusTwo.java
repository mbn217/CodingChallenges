package Array1;

import java.util.Arrays;

public class PlusTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given 2 int arrays, each length 2, return a new array length 4 containing all their elements.
//
//				plusTwo([1, 2], [3, 4])  [1, 2, 3, 4]
//				plusTwo([4, 4], [2, 2])  [4, 4, 2, 2]
//				plusTwo([9, 2], [3, 4])  [9, 2, 3, 4]
		
		int[] a = { 1, 2};
		int[] b = { 3,4 };
		int[] d = { 4 ,4};
		int[] e = { 2, 2 };
		int[] f = { 9 ,2};
		int[] g = { 3, 4 };
		
		
		System.out.println(Arrays.toString(plusTwo(a, b)));
		System.out.println(Arrays.toString(plusTwo(d,e)));		
		System.out.println(Arrays.toString(plusTwo(f, g)));
		
		
		
	}
	
	public static int[] plusTwo(int[] a, int[] b) {
		int[] newArr = new int[4];
		newArr[0] = a[0];
		newArr[1] = a[1];
		newArr[2] = b[0];
		newArr[3] = b[1];
		return newArr;
	}

}
