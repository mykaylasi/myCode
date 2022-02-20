package inClass;
import java.util.Scanner;
public class ToBeChanged {
	
	public static void main(String[] args) {
		
		int total;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many numbers?");
		
		total = input.nextInt();
		
		int[] array = new int[total];
		
		for(int i = 0; i < array.length; i++) {
			
			System.out.println("Enter you number " + i + ":");
			array[i] = input.nextInt();
		}
	
		System.out.println("***********");
		 for(int i = 0; i < array.length; i++) {
			 
			 System.out.print(array[i] + " ");
	 
	}
	}

}
