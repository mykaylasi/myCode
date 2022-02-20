package inClassExe;
import java.util.Scanner;
public class Weekday {
	public static void main(String[] args) {
	System.out.println("What day is it? If today is a Sunday, press 1.");
	System.out.println("If today is Monday, press 2.");
	System.out.println("If today is Tuesday, press 3.");
	System.out.println("If today is Wednesday, press 4.");
	System.out.println("If today is Thursday, press 5.");
	System.out.println("If today is Friday, press 6.");
	System.out.println("If today is Saturday, press 7.");
	
	Scanner input = new Scanner(System.in);
	int weekday = input.nextInt();
	
    System.out.println("How many days have passed?");
    int daysPassed = input.nextInt();
	
	
	int newDay = (daysPassed + weekday) % 7;
	
	System.out.println(newDay);
	
	
	
	
	
			             

}
}
