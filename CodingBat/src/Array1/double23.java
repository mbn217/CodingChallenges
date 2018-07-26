package Array1;

import java.util.Arrays;

public class double23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given an int array, return true if the array contains 2 twice, or 3 twice. The array will be length 0, 1, or 2.
//
//				double23([2, 2])  true
//				double23([3, 3])  true
//				double23([2, 3])  false
		
		int[] a  = {2, 2};
		int[] b  = {3, 3};
		int[] c  = {3};
		System.out.println(double23(a));
		System.out.println(double23(b));
		System.out.println(double23(c));
		
	}
	
	public static boolean double23(int[] nums) {
		
		if (nums.length==0) {
			return false;
		}else if(nums.length==1) {
			return false;
		}else {
			if ((nums[0]==2 && nums[1]==2)   ||  (nums[0]==3 && nums[1]==3   ) )  {
				return true;
			}else {
				return false;
			}
		}
		

	}
	
	

}
