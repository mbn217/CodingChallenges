package Array1;

public class MaxTriple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given an array of ints of odd length, look at the first, last, and middle values in the array and return the largest. 
//		The array length will be a least 1.
//
//				maxTriple([1, 2, 3]) → 3
//				maxTriple([1, 5, 3]) → 5
//				maxTriple([5, 2, 3]) → 5
		

		int[] a = {1, 2, 3};
		int[] b = {1, 5, 3};
		int[] c = {5, 2, 3};
		
		System.out.println(maxTriple(a));
		System.out.println(maxTriple(b));
		System.out.println(maxTriple(c));
		
		
	}

	
	public static int maxTriple(int[] nums) {
		int swapped = nums[0];
		if(nums.length==1) return nums[0];
		for (int i = 0; i < nums.length-1; i++) {
		
			if (swapped <= nums[i]) swapped = nums[i];
		}
		
		
		return swapped;
		
	}
}
