package arrays;
import java.util.Scanner;
public class ScannerArray {

	public static void main(String[] args) {
		
		
		int[] array = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number " + i + ":");
			array[i] = input.nextInt();
			
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i] + " ");
		}
		

	}

}
