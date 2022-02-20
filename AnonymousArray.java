package arrays;

public class AnonymousArray {
	public static void main(String[] args)	{
		
		increment(new int[] {4,5,6,4});
	//not a name
		//hence anon
		//no explicit reference value
		
	}
	
	public static void increment(int[] a) {
		a = new int[5];
		
		a[0] = 1000;
	}

}
