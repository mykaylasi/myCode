package arrays;

public class MaxArray {
	public static void main(String[] args) {
		int[] array = {1, 5, 3, 7, 2};
		
		int max = array[0];
		
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > max) {
				max = array[i];
			}
			
		}
		
	
			System.out.println(max);
		
		

	}

}
