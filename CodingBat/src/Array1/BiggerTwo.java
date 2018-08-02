package Array1;

import java.util.Arrays;

public class BiggerTwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		
//		Start with 2 int arrays, a and b, each length 2. Consider the sum of the values in each array. Return the array which has the largest sum. In event of a tie, return a.
//
//				biggerTwo([1, 2], [3, 4]) [3, 4]
//				biggerTwo([3, 4], [1, 2])  [3, 4]
//				biggerTwo([1, 1], [1, 2])  [1, 2]
		
		int[] a = { 1, 2};
		int[] b = { 3,4 };
		int[] d = { 1 ,2};
		int[] e = { 1, 1 };
		
		
		System.out.println(Arrays.toString(biggerTwo(a, b)));
		System.out.println(Arrays.toString(biggerTwo(b,d)));		
		System.out.println(Arrays.toString(biggerTwo(e, d)));
	}

	public static int[] biggerTwo(int[] a , int[] b ) {
		int sumofA = a[0]+a[1];
		int sumofB = b[0]+b[1];
		if (sumofA==sumofB) return a;
		if (sumofA>sumofB) {
			return a;
		}else {
			return b;
		}
		
	}
}
