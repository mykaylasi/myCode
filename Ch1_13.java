/** Algebra: solve 2 × 2 linear equations
 * By: MyKayla Silar
 */
package chapter1;

public class Ch1_13 {
	
	public static void main(String[] args) {
		
		double a = 3.4;
		double b = 50.2;
		double c = 2.1;
		double d = 0.55;
		
		double e = 44.5;
		double f = 5.9;
		
		double numerator1 = (e*d) - (b*f);
		double denominator1 = (a*d) - (b*c);
		
		double numerator2 = (a*f) - (e*c);
		double denominator2 = (a*d) - (b*c);
		
		double x = numerator1 / denominator1;
		
		double y = numerator2 / denominator2;
		
		System.out.printf("The value for x is " + "%.2f",x);
		System.out.println();
		System.out.printf("The value for y is " + "%.2f",y);
		System.out.println();
		
		
		
	}

}
