// Sum the digits in an integer
// By: MyKayla Silar
package edu.gsu.cis.chapter06;
import java.util.Scanner;
public class Ch6_2 {
	
	public static void main(String[] args)	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a number: ");
		long q = input.nextLong();
		long r = sumDigits(q);	
		System.out.println(sumDigits(q));		
	}
	
	public static int sumDigits(long n) {
			 String a = n + "";
			 int sum = 0;
			 
			 for(int i = 0; i < a.length(); i++) {
				 
				 long remainder = n % 10;
				 sum += remainder;
				 n = n / 10;
				 
			 }
		 
					
		return sum;
	}

}
