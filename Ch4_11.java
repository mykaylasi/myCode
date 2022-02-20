//Decimal to Hex
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter04;
import java.util.Scanner;
public class Ch4_11 {
	public static void main(String[] args) {
		System.out.print("Enter a decimal value (0 to 15): ");
		Scanner input = new Scanner(System.in);
		int deci = input.nextInt();
		
		if (deci < 10) {
			System.out.println("The hex value is " + deci);
		}
		
		if (deci >= 10 && deci <= 15) {
			System.out.println("The hex value is " + (char)(deci + 'A' - 10));
		}
		
		if (deci < 0 || deci > 15) {
			System.out.println("Invalid input!");
		}
	
		
	}

}
