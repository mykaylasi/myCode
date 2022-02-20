/**Sum the digits in an integer
 * By: MyKayla Silar
 */
package chapter2;
import java.util.Scanner;
public class Ch2_6 {
	public static void main(String[] args) {
	
	Scanner input = new Scanner(System.in);
	System.out.print("Enter an integer between 0 and 1000: ");
	int number = input.nextInt();
	
	int lastNumber = number % 10;
	
	int withoutLast = number / 10;
	int middleNumber = withoutLast % 10;
	
	int firstNumber = number / 100;

	
	int together = lastNumber + middleNumber + firstNumber;
	System.out.println("The sum of all digits in " + number + " is " + together);
	
	}

}
