//Sum the digits in an integer
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter02;
import java.util.Scanner;
public class Ch2_6 {
	public static void main(String[] args) {
		System.out.print("Enter an integer between 0 and 1000: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		
		int end = num % 10;
		int div = num / 10;
		int middle = div % 10;
		int begin = num / 100;
		
		
		int sum = end + middle + begin;
		
		System.out.println("The sum of all digits in " + num + " is " + sum);
	}

}
