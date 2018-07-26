package Array1;

public class RotateLeft3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		Given an array of ints length 3, return an array with the elements "rotated left" so {1, 2, 3} yields {2, 3, 1}.
//
//				rotateLeft3([1, 2, 3])  [2, 3, 1]
//				rotateLeft3([5, 11, 9])  [11, 9, 5]
//				rotateLeft3([7, 0, 0])  [0, 0, 7]
		
		int[] a = {1, 2, 3};
		rotateLeft3(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	public static int[] rotateLeft3(int[] nums) {
		int temp = nums[0];
		nums[0] = nums[1];
		nums[1] = nums[2];
		nums[2] = temp;
		return nums;
	}
}
