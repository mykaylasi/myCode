package arrays;
import java.util.Scanner;
public class Array100Nums {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double[] numbers = new double[5];
	
		
		for (int i = 0; i < numbers.length; i++)	{
			
			System.out.println("Enter a number: ");
			numbers[i] = input.nextDouble();
			
		}
		
		double sum = 0;
		
		for (int i = 0; i < numbers.length; i++)	{
			
			sum += numbers[i];
			
		
		}
		
		int aboveAvg = 0;
		
		for (int i = 0; i < numbers.length; i++) 	{
			
			if (numbers[i] > aboveAvg)
				aboveAvg++;
		}
	}
	

}
