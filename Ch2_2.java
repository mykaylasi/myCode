//Compute the volume of a cylinder
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter02;
import java.util.Scanner;
public class Ch2_2 {
	public static void main(String[] args) {
		System.out.println("Enter the radius and length of a cylinder: ");
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		double length = input.nextDouble();
		
		double area = radius * radius * 3.14159;
		double volume = area * length;
		
		System.out.println("The area is " + area);
		System.out.println("The volume of the cylinder is " + volume);
	}

}
