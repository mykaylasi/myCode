package softwaredev;
import java.util.Scanner;

public class Weird {
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		 int N = scan.nextInt();
		 
		 if (N % 2 != 0) {
		        System.out.println("Weird");
		        }
		        
		 else if (N % 2 != 0 && N > 20) {
		        System.out.println("Not Weird");
		         }
		        
	}

}
