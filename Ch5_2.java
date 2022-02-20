// Repeat Additions
// By: MyKayla Silar
package edu.gsu.cis.chapter05;
import java.util.Scanner;
public class Ch5_2 {
	public static void main(String[] args) 	{
		int correct = 0;
		int questions = 0;
		
		long startTime = System.currentTimeMillis();
		int a = (int)(1 + (Math.random() * 15));
		int b = (int)(1 + (Math.random() * 15));
		
	
		while (questions < 10) {
			Scanner input = new Scanner(System.in);
				
				a = (int)(1 + (Math.random() * 15));
				b = (int)(1 + (Math.random() * 15));
				System.out.println(a + " + " + b + "?");
				int answer = input.nextInt();	
				questions++;
				if (answer == (a+b)) 
					correct++;
					
				
		}
		long endTime = System.currentTimeMillis();
		long testTime = endTime - startTime;
		
		long seconds = testTime / 1000;
		
		System.out.println("You got " + correct + " right!");
		System.out.println("It took you " + seconds + " seconds to complete.");
		
		
		

		
		
		
		
		
		
		
		
		
	}

}
