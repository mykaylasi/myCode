package chapter_5;

public class Floats {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
		int n1 = 45;
		int n2 = 75;
		
		System.out.println("The gcd for " + n1 + " and " + n2 + " is " + gcd(n1,n2));
		
	
	}
	
	public static int gcd(int n1, int n2) {
		int gcd = 1;
		int k = 1;
		
		while (k <= n1 && k <= n2)	{
			if (n1 % k == 0 && n2 % k == 0) 
				gcd = k;
				k++;
			
		}
		return gcd;
	}

}
