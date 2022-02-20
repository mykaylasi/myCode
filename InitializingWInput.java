package arrays;
import java.util.Scanner;
public class InitializingWInput {
	
	public static void main(String[] args)	{
		int[][] matrix = new int[4][3];
		Scanner input = new Scanner(System.in);
		for (int row = 0; row < matrix.length; row++)	{
			for(int column = 0; column < matrix[row].length; column++)	{
				matrix[row][column] = (int)(Math.random()*100);
			}
		}
		
		for (int row = 0; row < matrix.length; row++) {
			  for (int column = 0; column < matrix[row].length; column++) {
			    System.out.print(matrix[row][column] + " ");
			  }

			  System.out.println();
			} 
		
		
		
	}

}
