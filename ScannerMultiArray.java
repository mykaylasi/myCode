package arrays;
import java.util.Scanner;
public class ScannerMultiArray {
	
	public static void main(String[] args) {
		
		int numberOfRows = 0;
		int numberOfColumns = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("How many rows? ");
		numberOfRows = input.nextInt();
		
		System.out.print("How many colums? ");
		numberOfColumns = input.nextInt();
		
		int[][] array = new int[numberOfRows][numberOfColumns];
		
		for (int i = 0; i < array.length; i++)	{
			
			for (int j = 0; j < array[i].length; j++) {
				
				System.out.println("Enter row " +  i  + " and column " + j + ":");
				array[i][j] = input.nextInt();
			}
		}
		System.out.println();
		
		for (int i = 0; i < array.length; i++)	{
			for (int j = 0; j < array[i].length; j++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
			}
		
		
	}
}
