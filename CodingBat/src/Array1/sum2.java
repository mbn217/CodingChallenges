package Array1;

public class sum2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given an array of ints, return the sum of the first 2 elements in the array. 
//		If the array length is less than 2, just sum up the elements that exist, returning 0 if the array is length 0.
//
//				sum2([1, 2, 3])  3
//				sum2([1, 1])  2
//				sum2([1, 1, 1, 1])  2
		
		int a[]= {1, 2, 3};
		int b[]= {1, 1};
		int c[]= {1, 1, 1, 1};
		System.out.println(sum2(a));
		System.out.println(sum2(b));
		System.out.println(sum2(c));

	}
	
	
	public static int sum2(int[] nums) {
		if (nums.length==0) {
			return 0;
		}
		if (nums.length>=2) {
			return nums[0]+nums[1];
		}else {
			return nums[0];
		}
		
	}

}
