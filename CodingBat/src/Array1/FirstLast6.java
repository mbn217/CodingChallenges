package Array1;

public class FirstLast6 {

	public static void main(String[] args) {
		
//		Given an array of ints, return true if 6 appears as either the 
//		first or last element in the array. The array will be length 1 or more.
//
//				firstLast6([1, 2, 6]) true
//				firstLast6([6, 1, 2, 3]) true
//				firstLast6([13, 6, 1, 2, 3])  false
		
		int array[] = {1, 2, 6};
		firstLast6(array);
		int array1[] = {6, 1, 2, 3};
		firstLast6(array1);
		int array2[] = {13, 6, 1, 2, 3};
		firstLast6(array2);

	}
	public static void firstLast6(int[] nums) {
		if (nums[0] ==6 || nums[nums.length-1] ==6 ) {
			System.out.println("true");
		}else {
			System.out.println("False");
		}
	
	}

}
