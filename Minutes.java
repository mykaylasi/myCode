package homePractice;
import java.util.Scanner;
public class Minutes {
	public static void main(String[] args) {
		System.out.println("Enter the number of minutes: ");
		Scanner input = new Scanner(System.in);
		int minutes = input.nextInt();
		
		int minsInAYear = minutes / 60;
		
		int totalDays = minsInAYear / 24;
		
		int years = totalDays / 365;
		int days = totalDays % 365;
		
		
		System.out.println(minutes + " minutes is about " + years + " and " + days + " days.");
		
		
	}

}
