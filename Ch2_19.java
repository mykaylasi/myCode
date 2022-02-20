//Geometry: area of a triangle
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter02;
import java.util.Scanner;
public class Ch2_19 {
	public static void main(String[] args) {
		System.out.println("Enter three points for a triangle: ");
		Scanner input = new Scanner(System.in);
		double X1 = input.nextDouble();
		double Y1 = input.nextDouble();
		double X2 = input.nextDouble();
		double Y2 = input.nextDouble();
		double X3 = input.nextDouble();
		double Y3 = input.nextDouble();
		
		double side1 = Math.pow(Math.pow(X2 - X1, 2) + Math.pow(Y2 - Y1, 2), 0.5);
		double side2 = Math.pow(Math.pow(X3 - X2, 2) + Math.pow(Y3 - Y2, 2), 0.5);
		double side3 = Math.pow(Math.pow(X1 - X3, 2) + Math.pow(Y1 - Y3, 2), 0.5);
		double s = (side1 + side2 + side3) / 2;
		double area = Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);

		
		
		System.out.println(area);
		
	}

}
