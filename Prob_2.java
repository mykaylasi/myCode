package chapter6;

public class Prob_2 {
	
	public static void main(String[] args) 	{
		System.out.println(sumDigits(1982222));
		
		
	}
	
	public static int sumDigits(long n) {
		int sum = 0;
		long temp = n;
		for (int a = 0; a < String.valueOf(n).length(); a++) {
			sum += temp % 10;
			temp /= 10;
		}
		return sum;
	}

}
