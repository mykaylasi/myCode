package newInClass;

public class Methods {
// methods can have 0 to infinity inputs
// either 0 or 1 output
	public static void main(String[] args) {
		
	
		
		System.out.println(test(20));
		
		
	}
	
	public static int test(int a) {
		
		return sumOfIntegers(1, a);
	}
	
	//public static typeOfOutput(how many inputs are required and their types)
	public static int sumOfIntegers(int num1, int num2) {
		
		int sum = 0;
		
		for (int i = num1; i <= num2; i++) {
			sum += i;
		}
		// must have return. you return what it is that you want. we want the sum.
		return sum;
		
	}
	
}
