package homePractice;
import java.util.Scanner;
public class Hmm {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int first = number % 10;
		int second = number / 10;
		int sec = second % 10;
		int th = second / 10;
		System.out.println(first + sec + th);
		
	}

}
