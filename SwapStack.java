package arrays;

public class SwapStack {
	public static void main(String[] mykayla) {
		int a = 10;
		int b = 20;
		System.out.println(a + " " + b);
		swap(a,b);
		System.out.println(a + " " + b);
		
		
	}
	
	public static void swap(int a, int b) {
		System.out.println(a + " " + b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println(a + " " + b);
		
			
		
	}			// doesn't require return because of that void
		// swap does not work in java unless you use primitive type
	// that second 10 20 that results is proof.
	// it swaps locally but has no effect on the caller.
	

}
