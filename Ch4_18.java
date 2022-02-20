//Student major and status
// 	by: MYKAYLA SILAR
package edu.gsu.cis.chapter04;
import java.util.Scanner;
public class Ch4_18 {
	public static void main(String[] args) {
		System.out.println("Enter two characters: ");
		Scanner input = new Scanner(System.in);
		String major = input.nextLine();
		if (major.charAt(0) == 'M') {
			System.out.print("Mathematics ");
		}
		if (major.charAt(0) == 'C') {
			System.out.print("Computer Science ");
		}
		if (major.charAt(0) == 'I') {
			System.out.print("Information Technology ");
		}
		
		if (major.charAt(1) == '1') {
			System.out.print("Freshman");
		}
		if (major.charAt(1) == '2') {
			System.out.print("Sophomore");
		}
		if (major.charAt(1) == '3') {
			System.out.print("Junior");
		}
		if (major.charAt(1) == '4') {
			System.out.print("Senior");
		}
	}

}
