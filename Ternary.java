package newInClass;

public class Ternary {
	public static void main(String[] args) {
		
		// ternary
		// bool_exp ? expr1 : expr2
		// if bool_exp is true -----> expr1
		// if false ----------------> expr2
		
		int max;
		
		int a = 10;
		int b = 20;
		
		max = a > b ? a : b;
		// true, so the equation is max = b
		
		// if int a = 40; max = a;
		
		/** same things as
		 * if ( a > b) 
		 * 		max = a;
		 * else
		 * 		max = b;
		 */
		System.out.println(max);
		int num = 45;
		System.out.println((num % 2 == 0)? num + " is even" : num + " is odd");
		
	}

}
