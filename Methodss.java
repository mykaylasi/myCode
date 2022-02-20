package newInClass;

public class Methodss {
	public static void main(String[] args) {
	// say the name of the argument
	System.out.println(sumOfIntegers(1,10));  // same thing as "calling it"
	System.out.println(sumOfIntegers(20,35));
	System.out.println(sumOfIntegers(35,45)); 
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


