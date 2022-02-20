package arrays;

public class ShiftingElements2 {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 7, 2};
		
		int first = array[0];
		
		
		for (int i = 0; i < array.length - 1; i++) {
			array[i] = array[i + 1];
			
			
		
			
		}
		for (int i = 0; i < array.length -1; i--) {
		
		System.out.print(array[i] + " ");
		}
		
		

	}

}
