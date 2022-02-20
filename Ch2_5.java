/** Financial application: calculate tips
 By: MyKayla Silar
 */
package chapter2;
import java.util.Scanner;
public class Ch2_5 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter subtotal and gratuity rate: ");
		
		double subtotal = input.nextDouble();
		double rate = (input.nextDouble()) / 100;
		
		double gratuity = rate * subtotal;
		double total = gratuity + subtotal;
		System.out.printf("The gratuity is $" + "%.2f",gratuity);
		System.out.printf("\nThe total is $" + "%.2f",total);
	}

}
