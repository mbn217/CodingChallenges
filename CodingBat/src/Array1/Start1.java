package Array1;

public class Start1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Start with 2 int arrays, a and b, of any length. Return how many of the
		// arrays have 1 as their first element.
		//
		// start1([1, 2, 3], [1, 3]) 2
		// start1([7, 2, 3], [1]) 1
		// start1([1, 2], []) 1

		int[] a = { 1, 2, 3 };
		int[] b = { 1, 3 };
		int[] c = { 7, 2, 3 };
		int[] d = { 1 };
		int[] e = { 1, 2 };
		int[] f = {};
		int[] g = {};

		System.out.println(start1(a, b));
		System.out.println(start1(c, d));
		System.out.println(start1(e, f));
		System.out.println(start1(g, f));
	
	}

	public static int start1(int[] a, int[] b) {
		int count = 0;
		if (a.length==0 && b.length==0) {	
				count=0;
		}else {
			if (a.length==0 && b.length!=0) {
				if (b[0]==1) {
					count=1;
				}
			}else if(a.length!=0 && b.length==0) {
				if (a[0]==1) {
					count=1;
				}
			}else {
				if (a[0] == 1 && b[0] == 1) {
					count = 2;
				} else if (a[0] == 1 || b[0] == 1) {
					count = 1;
				} else {
					count = 0;
				}
				
			}
			
		}
		
		return count;
		

	}
}
