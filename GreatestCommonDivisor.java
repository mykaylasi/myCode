package newInClass;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		int num1 = 12;
		int num2 = 18;
		
		int gcd = 1;
		
		for (int i = 2; i <= Math.min(num1, num2); i++)	{
			
			if (num1 % i == 0 && num2 % i == 0) {
				
				gcd = i;
			}
		}
	
		System.out.println(gcd);
		
	}

}
//greatest common divisor
// 12 and 18 gcd_ is 6 ... the biggest number both of these can be divided by!
// 12 and 8 gcd_ is 4 ... same!