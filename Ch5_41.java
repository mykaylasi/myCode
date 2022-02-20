// Occurrence of max numbers
// By: MyKayla Silar
package edu.gsu.cis.chapter05;
import java.util.Scanner;
public class Ch5_41 {
	
	public static void main(String[] args)	{
		int count = 0;
		int max = 0;
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer (0: for end of input): ");
		int entry = input.nextInt();
		
		max = entry;
		count++;
			
		while (entry != 0) {
			
			System.out.print("Enter an integer (0: for end of input): ");
			entry = input.nextInt();
			
			if (max < entry) {
				int temp = max;
				max = entry;
				count = 1;
			}
			
			else if (max == entry) {
				count++;
			}
					
		}
		
		System.out.println("The largest number is " + max);
		System.out.println("The occurrence of the largest number is " + count);
		
			
		
	}

}
