package softwaredev;
import java.util.Random;
public class Two {
	public static void main(String[] args) {
		
		Random rando = new Random();
		Random randy = new Random();
		
		int a =  rando.nextInt(10);
		int b = randy.nextInt(10);
		int sum = a + b;
		
		System.out.println("The first random number is " + a);
		System.out.println("The second random number is " + b);
		System.out.println(sum);
		
		if (a + b > 5) {
			System.out.println("The sum is greater than 5.");
		}
		
		if (a + b < 5) {
			System.out.println("The sum is less than 5.");
		}
		
		else
			if (a + b == 5) {
				System.out.println("The sum is equal to 5.");
			}
	}

}
