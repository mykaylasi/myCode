package inClassExe;
import java.util.Scanner;
public class Whoa {
	public static void main(String[] args) {
		
		boolean myBoolean;
		
		myBoolean = true;
		myBoolean = false;
		
		Scanner input = new Scanner(System.in);
		 int num1 = (int) (Math.random() * 10);
		 int num2 = (int) (Math.random() * 10);
		 
		 if (num1 > num2) {
			 System.out.println("What is " + num1 + "-" + num2 + "?");
		 }
		 
		 else
			 System.out.println("What is " + num2 + "-" + num1 + "?");
		 
		 int response = input.nextInt();
		 
		 System.out.println(response == num1 - num2);
			 
		 
	
		 		
	}

}
