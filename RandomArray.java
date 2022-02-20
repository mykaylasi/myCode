package arrays;

import java.util.Scanner;

public class RandomArray {
public static void main(String[] args) {
		
		
		int[] array = new int[10];
		Scanner input = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			array[i] = (int)(Math.random() * 1001);
			
		}
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		

	}

}
