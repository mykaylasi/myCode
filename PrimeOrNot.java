package newInClass;

public class PrimeOrNot {
	public static void main(String[] args) {
		
		int num1 = 4;
		boolean isPrime = true;
		
		for (int i = 2; i < num1; i++) {
			
			if (num1 % i == 0) {
				isPrime = false;
				break;
			
			}
		}
		
		System.out.println(isPrime ? "It is prime" : "It is not prime");
	}

}
