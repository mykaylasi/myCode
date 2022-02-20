package arrays;

public class ArrayCopying {
	public static void main(String[] args) {
		
		
		
		int[] array = {1, 4, 3, 2, 8};
		
		int[] arrayCopy;
		
		arrayCopy = array;
		
		arrayCopy = new int[array.length];
		
		for (int i = 0; i < arrayCopy.length; i++)	{
			
			arrayCopy[i] = array[i];
		}
		
		array[0] = 1000;
		
		for (int i = 0; i < arrayCopy.length; i++) {
			System.out.println(arrayCopy[i]);
		}
	}

}
