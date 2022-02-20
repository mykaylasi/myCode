package homePractice;
import java.util.Scanner;
public class DaysFromNow {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("What day is today?: ");
		String today = input.nextLine();
		System.out.print("How many days from now?: ");
		int days = input.nextInt();	
		
		
		
		switch(today) {
		case "Monday":
			System.out.println((1 + days) % 7);
			break;
		case "Tuesday":
			System.out.println((2 + days) % 7);
			break;
		case "Wednesday":
			System.out.println((3 + days) % 7);
			break;
		case "Thursday":
			System.out.println((4 + days) % 7);
			break;
		case "Friday":
			System.out.println((5 + days) % 7);
			break;
		case "Saturday":
			System.out.println((6 + days) % 7);
			break;
		case "Sunday":
			System.out.println((7 + days) % 7);
			break;
		}
		
	
	
		
		
	}

}
