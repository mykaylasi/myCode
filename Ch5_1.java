// Count positive and negative numbers and compute the average of numbers
// By: MyKayla Silar
package edu.gsu.cis.chapter05;
import java.util.Scanner;
public class Ch5_1 {
	public static void main(String[] args)	{
		
		int countPositive = 0;
		int countNegative = 0;
		int entry;
		int total = 0;
		int count = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter integers ending with 0: ");

		while ((entry = input.nextInt())!= 0 ) {
			
			total += entry;
			count++;
			
			if (entry > 0) {
				countPositive++;
				
			}
			
			if (entry < 0) {
				countNegative++;
				
			}
		}
		
		
		
		
		
		System.out.println("The number of positives is " + countPositive);
		System.out.println("The number of negatives is " + countNegative);
		System.out.println("The total is " + total);
		
		double average = (double)total/count;
		System.out.println("The average is " + average);
		
		
		
		
		
	}

}
