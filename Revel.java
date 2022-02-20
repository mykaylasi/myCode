package inClassExe;
import java.util.Scanner;
public class Revel {
	public static void main(String[] args) {
	
	        System.out.println("Enter the subtotal and a gratuity rate: ");
	        Scanner input = new Scanner(System.in);
	        double subtotal = input.nextDouble();
	        double gratuity = input.nextDouble();
	        
	        gratuity /= 10;
	        
	        double total = subtotal + gratuity;
	        
	        System.out.println("The gratuity is $" + gratuity + " and total is $" + total );
	      
	}

}
