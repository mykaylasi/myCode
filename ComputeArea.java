package inClassExe;

import java.util.Scanner;

public class ComputeArea {
	
	public static void main(String[] args) {
		
		double radius;
		double area;
		
		Scanner input = new Scanner(System.in);
		
		//radius = 20
	    System.out.print("Enter a radius: ");
	    radius = input.nextDouble();
		area = radius * radius * 3.14;
		
		System.out.println("The area of a circle with radius " + radius + " is " + area);
	}

}
