package arrays;

public class RandomShuffling {
	public static void main(String[] args) {
		
		int[] array = {1, 5, 3, 7, 2};
		
		
		
		for (int i = 0; i < array.length; i++) {
			
			int randIndex = (int)(Math.random() * array.length);
			
			int temp = array[i];
			array[i] = array[randIndex];
			array[randIndex] = temp;
			
			}
		for (int i = 0; i < array.length; i++)
			
			System.out.print(array[i] + " ");
		
	
		
		

	}

}
