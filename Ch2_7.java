/** Find the number of years
 * By: MyKayla Silar
 */
package chapter2;
import java.util.Scanner;
public class Ch2_7 {

	public static void main(String[] args)	{
		
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of minutes: ");
		long minutes = input.nextLong();
		
		int minutesInAYear = (60 * 24 * 365);
		
		long years = minutes / minutesInAYear;
		
		long minutesToYears = (years * minutesInAYear);
		
		int leftoverMins = (int)(minutes - minutesToYears);
		
		int minutesInADay = (24 * 60);
		
		int days = (leftoverMins / minutesInADay);
		
		System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days");
	
		
	}
}
