//Geometry: area of a triangle
package Assignment1;
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
		
		double side1  = (X2 - X1);
		double side2 = (X3 - X2);
		double side3 = (X1 - X3);
		
		
		
		double s = (side1 + side2 + side3)/2;
		double area = Math.sqrt(s*((s-side1) * (s-side2) * (s-side3)));
		
		System.out.println(area);
		
	}

}
