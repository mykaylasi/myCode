//Palindrome number
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter03;
import java.util.Scanner;
public class Ch3_12 {
	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		Scanner input = new Scanner(System.in);
		String str = input.nextLine();
		
		if (str.charAt(str.length()-1) == str.charAt(0)) {
			System.out.println(str + " is a palindrome");
		}
		else {
			System.out.println(str + " is not a palindrome");
		}
		
	}

}
