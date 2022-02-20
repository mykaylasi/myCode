package newInClass;

public class SmallestIndexLargestElement {
	public static void main(String[] args) {
		int[] array = {1, 7, 5, 3, 7, 2};
		
		int max = array[0];
		int maxIndex = 0;
		for (int i = 0; i < array.length; i++) {
			
			if (array[i] > max) {
				max = array[i];
				maxIndex = i;
			}
			
		}
		
	
			System.out.println(maxIndex);
		
		

	}

}
