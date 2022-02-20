package inClassExe;
import java.util.Scanner;
public class If {
	public static void main(String[] args) {
           // if today is sunny I go shopping.
	//if (bool_exp) { 
		// statement(s) }
		// so if the statement is true execute statements
		
		
		boolean isSunny = false;
		
		if (isSunny)  {
			System.out.println("I go shopping");
			System.out.println("I am happy");
		}
		
		System.out.println("I am done"); //nothing to do with the if
		
		// if there weren't braces around shopping and happy, and isSunny was false only
		// i am happy would print. without braces only i go shopping is included in the if statements.
	}
	
}
