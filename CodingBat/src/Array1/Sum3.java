package Array1;

public class Sum3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given an array of ints length 3, return the sum of all the elements.
//
//				sum3([1, 2, 3])  6
//				sum3([5, 11, 2])  18
//				sum3([7, 0, 0])  7
	
	int[] a = {1, 2, 3};
	int[] b = {5, 11, 2};
	int[] c = {7, 0, 0};
	
	System.out.println("Total of the element of the array is : "+ sum3(a));
	System.out.println("Total of the element of the array is : "+ sum3(b));
	System.out.println("Total of the element of the array is : "+ sum3(c));
	
	}

	public static int sum3(int[] nums) {
		int total = 0;
		for (int i = 0; i < nums.length; i++) {
			total+=nums[i];
		}
		return total;
	}
	
	
	
}
