package arrays;

public class Print2MultiArr {
	public static void main(String[] args) 	{
		int sum = 0;
		
		
		int[][] array = {{1, 2, 3},
						{4, 5, 6},
						{7, 8, 9},
						{9, 8, 7}};
		
		
		for(int a = 0; a < array.length; a++) {
			
			for(int i = 0; i < array[a].length; i++) {
				System.out.print(array[a][i] + " ");
			}
			System.out.println();
		}
	
		
		
	
	
	for(int a = 0; a < array.length; a++) {
		sum = 0;
		for (int b = 0; b < array[a].length; b++) {
			
			sum += array[b][a];
			
		
		}
		
		
	}
	
	System.out.println("The sum of the " + sum);
	}
}
