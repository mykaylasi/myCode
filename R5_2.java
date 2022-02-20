package chapter_5;
import java.util.Scanner;
public class R5_2 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
	
		int right = 0;
		long start = System.currentTimeMillis();
		
		
		
		
		for(int i = 0; i < 3; i++)	{
			int num1 = (int)((1 + (Math.random() * 15)));
			int num2 = (int)((1 + (Math.random() * 15)));
			System.out.println(num1 + " + " + num2 + "?");
			int ans = input.nextInt();
			
			if (ans == (num1 + num2))	{
				right++;
			}
			
			
			
			
		}
		
		long end = System.currentTimeMillis();
		
		long totalTime = (end - start) / 1000;
		System.out.println("You got " + right + " correct!");
		System.out.println("It took you " + totalTime + " seconds to complete.");
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
