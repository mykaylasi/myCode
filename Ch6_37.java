// Format an integer
// By: MyKayla Silar
package edu.gsu.cis.chapter06;
import java.util.Scanner;
public class Ch6_37 {
	public static void main(String[] args)	{
		Scanner input = new Scanner(System.in);
		System.out.println("Enter an integer: ");
		int g = input.nextInt();
		System.out.println("Enter the width: ");
		int width = input.nextInt();
		System.out.print("The formatted number is: " + format(g,width));	
	
	}
	
	public static String format(int number, int width)	{
		String a = number + "";
		if (a.length() < width)	{
			int h = width - a.length(); // this gives you the difference which is 1 right now. i want it to show 1 zero.
			
			for (int i  = 1; i <= h; i++) {
			a = "0" + a;
		}			
		
		}
		
		else {
		}
		
		
		return a;	
	}


}
