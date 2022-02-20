package softwaredev;
import java.util.Scanner;
public class Three {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String num1 = scan.nextLine();
		
		int sum = 0;
		
		for (int a = 0; a<num1.length(); a++) {
			
		
			sum = sum + num1.charAt(a) - 0;	
			System.out.println(num1.charAt(a) - 0);
		
			
		}
		
	}

}
