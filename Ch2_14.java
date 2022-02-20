//Health application: computing BMI
package Assignment1;
import java.util.Scanner;
public class Ch2_14 {
	public static void main(String[] args) {
		System.out.print("Enter weight in pounds: ");
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		System.out.print("Enter height in inches: ");
		double height = input.nextDouble();
		
		weight *= 0.45359237;
		height *= 0.0254;
		
		double bmi = weight / (Math.pow(height, 2));
		System.out.println("BMI is " + bmi);
	}

}
