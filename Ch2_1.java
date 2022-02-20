//Convert Celsius to Fahrenheit
// 	by: MYKAYLA SILAR
package edu.gsu.cis.chapter02;
import java.util.Scanner;
public class Ch2_1 {
	public static void main(String[] args) {
		double celsius;
		double fahrenheit;
		System.out.println("Enter a temperature in Celsius: ");
		
		Scanner input = new Scanner(System.in);
		celsius = input.nextDouble();
		
		fahrenheit = ((9.0/5) * celsius) + 32;
		
		System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
		
	}

}
