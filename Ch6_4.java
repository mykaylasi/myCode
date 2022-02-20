// Display an integer reversed
// By: MyKayla Silar
package edu.gsu.cis.chapter06;
import java.util.Scanner;
public class Ch6_4 {
	public static void main(String[] args)	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an integer: ");
		int entry = input.nextInt();
		
		reverse(entry);
		
	}
	
	public static void reverse(int number) 	{
		if (number < 10)
			System.out.println(number);
		else {
		System.out.print(number % 10);
		reverse(number / 10);
		}
	}

}
