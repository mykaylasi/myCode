package Assignment1;
//Financial application: calculate tips
import java.util.Scanner;
public class Ch2_5 {
	public static void main(String[] args) {
		System.out.println("Enter the subtotal and a gratuity rate: ");
        Scanner input = new Scanner(System.in);
        double subtotal = input.nextDouble();
        double gratuity = input.nextDouble();
        
        gratuity = subtotal * (gratuity / 100);
       
        
        double total = subtotal + gratuity;
        
        System.out.println("The gratuity is $" + gratuity + " and total is $" + total );
	}

}
