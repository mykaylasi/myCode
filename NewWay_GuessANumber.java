package newInClass;
import java.util.Scanner;
public class NewWay_GuessANumber {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Guess a number between 0 and 100!");
		
			int guess = input.nextInt();
			int randNum = (int)(Math.random() * 100);
			System.out.println(guess < randNum ? "Too Low" : "Too High");
		
		
		
	}

}
