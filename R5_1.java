package chapter_5;
import java.util.Scanner;
public class R5_1 {
	
	public static void main(String[] args)	{
		int countPositive = 0;
		int countNegative = 0;
		int total = 0;
		double average = 0;
		int count = 0;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter integers ending with 0: ");
		int resp;
		
		while ((resp = input.nextInt()) != 0) { // to determine each entered integer you have to use the while loop this way
			total += resp;
			count++;
			
			if (resp > 0) {
				countPositive++;
			}
			else if (resp < 0)	{
				countNegative++;
			}
		}
		
		average = (double)total / count;
		
		System.out.println("The number of positives is: " + countPositive);
		System.out.println("The number of negatives is: " + countNegative);
		System.out.println("The total is: " + total);
		System.out.println("The average is: " + average);
		
		
	}

}
