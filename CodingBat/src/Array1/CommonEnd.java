package Array1;

public class CommonEnd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Given 2 arrays of ints, a and b, return true if they have the same first element or they have the same last element. 
//		Both arrays will be length 1 or more.
//
//				commonEnd([1, 2, 3], [7, 3]) true
//				commonEnd([1, 2, 3], [7, 3, 2])  false
//				commonEnd([1, 2, 3], [1, 3])  true
		
		
		
		int[] a = {1, 2, 3};
		int[] b = {7, 3};
		System.out.println(commonEnd(a, b));
		System.out.println("+++++++++++++");
		int[] c = {1, 2, 3};
		int[] d = {7, 3, 2};
		System.out.println(commonEnd(c, d));
		System.out.println("+++++++++++++");
		int[] e = {1, 2, 3};
		int[] f = {1, 3};
		System.out.println(commonEnd(e, f));
	
	
	
	}

	public static boolean commonEnd(int[] a, int[] b ) {
		if (a[0]==b[0] || a[a.length-1]==b[b.length-1] ) {
			return true;
		}else {
			return false;
		}
	}
}
