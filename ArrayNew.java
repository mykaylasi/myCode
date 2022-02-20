package arrays;

public class ArrayNew {
	public static void main(String[] args) {
		int[] array = {0, 1, 2, 3};
		increment(array);
	
		
	}
	
	// write a method that returns and accepts an array and returns a brand new array that increases the original array by 1
	
	public static int increment(int[] a) {
		int result = 0;
		int k;
		for (int i = 0; i < a.length; i++) {
			
			System.out.println((result = (a[i] + 1)));		 
		
		}
		
	
		return result;
		 
}
}
