package Array1;

public class SameFirstLast {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given an array of ints, return true if the array is length 1 or more, and the first element and the last element are equal.
//
//				sameFirstLast([1, 2, 3]) false
//				sameFirstLast([1, 2, 3, 1]) true
//				sameFirstLast([1, 2, 1]) true
		
		
		int array[] = {1, 2, 3};
		sameFirstLast(array);
		int array1[] = {1, 2, 3, 1};
		sameFirstLast(array1);
		int array2[] = {1, 2, 1};
		sameFirstLast(array2);

	}
	public static void sameFirstLast(int[] nums) {
		if (nums.length>=1  && nums[0]==nums[nums.length-1]) {
			System.out.println("True");
		}else {
			System.out.println("False");
		}
	}

}
