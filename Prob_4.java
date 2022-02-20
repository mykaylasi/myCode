package chapter6;

public class Prob_4 {
	
	public static void main(String[] args) {
		int entry = 3040;
		System.out.print("This number reversed is ");
		reverse(entry);
		
	}
	
	public static void reverse(int number)	{
		
		while (number > 0) {
			System.out.print((number % 10));
			number /= 10;
		}
			
		}
		
	
	
	
	
}
