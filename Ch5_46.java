// Reverse a string
// By: MyKayla Silar
package edu.gsu.cis.chapter05;
import java.util.Scanner;
public class Ch5_46 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String forward = input.nextLine();
		
		String reverse = "";
		
		for(int i = forward.length()-1; i >= 0; i--) {
			
			reverse += forward.charAt(i);
		}
		
		System.out.println("The reversed string is " + reverse);
	}
}
