package Array1;

import java.util.Arrays;

public class Has23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given an int array length 2, return true if it contains a 2 or a 3.
//
//				has23([2, 5])  true
//				has23([4, 3])  true
//				has23([4, 5])  false
		int[] a  = {2, 5};
		int[] b  = {4, 3};
		int[] c  = {4, 5};
		System.out.println(has23(a));
		System.out.println(has23(b));
		System.out.println(has23(c));
	
	}

	public static boolean has23(int[] nums) {
		if (   nums[0]==2 ||  nums[0]==3 ||  nums[1]==2 || nums[1]==3    ) {
			return true;
		}else {
			return false;
		}
	}
	
}
