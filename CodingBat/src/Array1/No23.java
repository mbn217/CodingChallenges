package Array1;

public class No23 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		Given an int array length 2, return true if it does not contain a 2 or 3.
//
//				no23([4, 5])  true
//				no23([4, 2])  false
//				no23([3, 5])  false
		
		int[] a  = {4, 5};
		int[] b  = {4, 2};
		int[] c  = {3, 5};
		System.out.println(no23(a));
		System.out.println(no23(b));
		System.out.println(no23(c));
	
	}

	public static boolean no23(int[] nums) {
		if (  ( nums[0]==2 ||  nums[0]==3) || ( nums[1]==2 || nums[1]==3  )  ) {
			return false;
		}else {
			return true ;
		}
	}
	
}