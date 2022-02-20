package inClass;

public class Sept17 {
	
	public static void main(String[] args) {
		
	int[] array = {5, 8, 2, 9, 10, 4};
		

		
		int max = array[0];
		int secondmax = array[0];
		
		for(int i = 0; i < array.length; i++) {
			
			if(array[i] > max)
				max = array[i];	
				}
		for (int i = 0; i < array.length; i++) {
			
			if(array[i] > secondmax) {
				while (secondmax != max) {
					secondmax = array[i];	
			}
			
			
					
		}
		
		System.out.println(max);
		System.out.println(secondmax);
		}
	
	}

}
