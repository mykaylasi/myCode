package chapter6;

public class Prob_10 {
	public static void main(String[] args)	{
		System.out.println(isPrime(10000));
		
	}
	
	public static boolean isPrime(int number) {
		for(int a = 2; a < number; a++) {
			
			if(number % a == 0)	{
				return false;
			}
			
		}
		return true;
	}

}
