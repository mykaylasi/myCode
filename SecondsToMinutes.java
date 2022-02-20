package inClassExe;
import java.util.Scanner;
public class SecondsToMinutes {
	
	public static void main(String[] args) {
		
		//input: 3700
		//output: 1 hour and 1 minute and 40 seconds
		
		int seconds;
		int minutes;
		int hours;
		int remainder;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the seconds: ");
		seconds = input.nextInt();
		
		
		hours = seconds / 3600;
		
		remainder = seconds % 3600;
		minutes = remainder / 60;
		remainder = remainder % 60;
		
		
		
		System.out.println(hours + " hours " + minutes + " minutes and " + remainder + " seconds " );
	}

}
