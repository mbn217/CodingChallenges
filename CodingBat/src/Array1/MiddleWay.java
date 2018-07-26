package Array1;

import java.util.Arrays;

public class MiddleWay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given 2 int arrays, a and b, each length 3, return a new array length 2 containing their middle elements.
//
//				middleWay([1, 2, 3], [4, 5, 6])  [2, 5]
//				middleWay([7, 7, 7], [3, 8, 0])  [7, 8]
//				middleWay([5, 2, 9], [1, 4, 5])  [2, 4]
	
	int[] a = {1,2,3};
	int[] b = {4, 5, 6};
	System.out.println(Arrays.toString(middleWay(a, b)));
	
	
	}

	public static int[] middleWay(int[] a , int[] b ) {
		int[] newArray = {a[1],b[1]};
		return newArray;
	}
	
}
