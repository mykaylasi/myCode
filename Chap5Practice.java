package homePractice;
import java.util.*;
public class Chap5Practice {
	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 10);
		int number2 = (int)(Math.random() * 10);
		
		Scanner input = new Scanner(System.in);
		System.out.print("What is " + number1 + " + " + number2 + "? ");

		int response = input.nextInt();
		
		while (number1 + number2 != response) {
			System.out.print("Wrong answer. Try again, what is " + number1 + " + " + number2 + "? ");
			response = input.nextInt();
		}
		
		System.out.println("You got it!");
	}

}
