package inClassExe;

import java.util.Scanner;

public class ComputeAreaRec {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter length of rectangle: ");
		double length = input.nextDouble();
		System.out.print("Enter width of rectangle: ");
		double width = input.nextDouble();
		double area = length * width;
		
		System.out.println("The area of a rectangle with length " 
		+ length + " and width " + width + " is " + area);
	}

}
