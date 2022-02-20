package inClassExe;
import java.util.Scanner;
public class IfTwo {
	public static void main(String[] args) {
		int num1 = (int)(Math.random()*10);
		int num2 = (int)(Math.random()*10);
		
		int response;
		Scanner input = new Scanner(System.in);
		
		if (num2 > num1) {
			int temp;
			temp = num1;
			num1 = num2;
			num2 = temp;
		}
		
		System.out.println("What is " + num1 + "-" + num2 + "?" );
		response = input.nextInt();
		System.out.println(response == num1 - num2);
	}

}
