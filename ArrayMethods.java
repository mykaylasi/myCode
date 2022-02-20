package arrays;

public class ArrayMethods {
	public static void main(String[] args) {
		int[] array = {1, 4, 3, 2, 8};
		
		
		
			for(int i = 0; i < array.length; i++)	{
			
				System.out.print(array[i] + " ");
				
			}
			
			System.out.println();	
		
		
		increment(array);
	
		
		for (int num : array) 
			System.out.print(num + " ");
			
			
	}
	
	public static void increment(int[] a)	{
		 
		a[0] = 1000;
		a[1] = 75;
		
		
		
		
	}

}
