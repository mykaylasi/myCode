//Find the character of an ASCII code
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter04;
import java.util.Scanner;
public class Ch4_8 {
	public static void main(String[] args)	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an ASCII code: ");
		
		int charNum = input.nextInt();
		char let = (char)charNum;
		
		
		System.out.println("The character for ASCII code " + charNum + " is " + let);
	}

}
