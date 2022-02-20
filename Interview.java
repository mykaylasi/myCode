package softwaredev;
import java.util.Scanner;
public class Interview {
	public static void main(String[] args) {
		
		System.out.println("Enter two integers: ");
		
		Scanner input = new Scanner(System.in);
		int a = input.nextInt();
		int b = input.nextInt();
		
		if (a + b > 5) {
			System.out.println("The sum is greater than 5.");
		}
		
		if (a + b < 5) {
			System.out.println("The sum is less than 5.");
		}
	    else {
	    	if (a + b == 5) {
			System.out.println("The sum is equal to 5.");
	    	}
		}
	}

}
