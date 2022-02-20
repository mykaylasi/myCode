package homePractice;
import java.util.Scanner;
public class MoreSubtraction {
	public static void main(String[] args) {
		int number1 = (int)(Math.random() * 101);
		int number2 = (int)(Math.random() * 101);
		
		
		if (number1 < number2) {
			int temp = number1;
			number1 = number2;
			number2 = temp;
		}	
		    System.out.print("What is " + number1 + " - " + number2 + "? ");		
		
		Scanner input = new Scanner(System.in);
		int response = input.nextInt();
		int answer = number1 - number2;
		
		if (number1 - number2 !=  response)	{
			System.out.println("Your answer is wrong.");
			System.out.println(number1 + "-" + number2 + " should be " + answer + ".");
		}
		
		else {
			System.out.println("You got it!");
		}
		    
		    
		    
		    
		    
		    
		    
		    
	}

}
