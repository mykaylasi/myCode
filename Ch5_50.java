// Count uppercase letters
// By: MyKayla Silar
package edu.gsu.cis.chapter05;
import java.util.Scanner;
public class Ch5_50 {
	
	public static void main(String[] args)  {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a string: ");
		String str = input.nextLine();
		int count = 0;
		
			for (int i = 0; i < str.length(); i++ ) {
			
			if (Character.isUpperCase(str.charAt(i))) {
				count++;
				
			}
			
			}
			
			System.out.println(count);
	}
}
