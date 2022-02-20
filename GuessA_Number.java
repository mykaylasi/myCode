package homePractice;
import java.util.Scanner;
public class GuessA_Number {
	public static void main(String[] args)	{
		int random = (int)(Math.random()*101);
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a magic number between 0 and 100\n");
		
		System.out.print("Enter your guess: ");
		int response = input.nextInt();
		
		while (response != random) {
			if (response > random) {
				System.out.println("Your guess is too high. \n");
				System.out.print("Enter your guess: ");
				response = input.nextInt();
			}
			if (response < random) {
				System.out.print("Your guess is too low. Guess again! ");
				response = input.nextInt();
			}
		}
		System.out.println("You guessed correctly! The number is " + random + ".");
	}

}
