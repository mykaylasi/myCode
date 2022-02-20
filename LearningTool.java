package newInClass;
import java.util.Scanner;
public class LearningTool {
	public static void main(String[] args) {
		int count = 0;
		int countAnswer = 0;
		
		int num1 = (int)(Math.random()*11);
		int num2 = (int)(Math.random()*11);
		
		Scanner input = new Scanner(System.in);
		
		while (count < 5) {
			num1 = (int)(Math.random()*11);
			num2 = (int)(Math.random()*11);
			System.out.print("What is " + num1 + " + " + num2 + "? ");
			int response = input.nextInt();
			count++;
			
			if (response == num1 + num2) {
				countAnswer++;
			}	
		}
		
		System.out.println("Your grade is " + (countAnswer / 5.0) * 100);
	}

} // i had fun doing this one! professor helped me.
// i couldn't figure out how to get random numbers each time for the addition
