// Use the isPrime Method
// By: MyKayla Silar
package edu.gsu.cis.chapter06;

public class Ch6_10 {
	public static void main(String[] args)	{
		 int primes = 0;
		  for (int i = 1; i < 100000; i++) {
			  if (isPrime(i + 1)) {
				  primes++; 
		   }
		 }
		  System.out.println("There are " + primes + " prime numbers below 10,000."); 
	}
		 
		 public static boolean isPrime(int number) {
		  for (int i = 2; i <= number / 2; i++) {
			  if (number % i == 0) {
				  return false;
		   }
		  }
		  return true;
		 }
}
