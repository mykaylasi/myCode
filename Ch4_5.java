//Geometry: area of a regular polygon
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter04;
import java.util.Scanner;
public class Ch4_5 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of sides the polygon has: ");
		double sides = input.nextDouble();
		
		System.out.print("Enter the length of a side: ");
		double length = input.nextDouble();
		
		double area = (sides * (Math.pow(length, 2)) / ( 4 * ((Math.tan(Math.PI/sides)))));
		
		System.out.println("The area of the polygon is " + area);
		
	}

}
