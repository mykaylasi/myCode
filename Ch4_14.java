//Convert letter grade to number
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter04;
import java.util.Scanner;
public class Ch4_14 {
	public static void main(String[] args) {
		System.out.print("Enter a letter grade: ");
		Scanner input = new Scanner(System.in);
		String grade = input.nextLine();
		
		if (grade.charAt(0) == 'A') {
			System.out.println("The numeric value for grade " + grade + " is 4");
		}
		
		else if (grade.charAt(0) == 'B') {
			System.out.println("The numeric value for grade " + grade + " is 3");
		}
		
		else if (grade.charAt(0) == 'C') {
			System.out.println("The numeric value for grade " + grade + " is 2");
		}
		
		else if (grade.charAt(0) == 'D') {
			System.out.println("The numeric value for grade " + grade + " is 1");
		}
		
		else if (grade.charAt(0) == 'F') {
			System.out.println("The numeric value for grade " + grade + " is 0");
		}
		
		else {
			System.out.println("Invalid grade!");
		}
		
		
		
		
	}

}
