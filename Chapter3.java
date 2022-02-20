package inClassExe;

public class Chapter3 {
	// you can only apply && and || to boolean values
	// && false false false          || false false false
	//    false true false              false true true
	//    true false false              true  false true
	//    true true true                true true true
	//(^) is called exclusive or
	// ^  false false false
	//    false true true
	//    true false true
	//    true true false

	
	public static void main(String[] args) {
		int num = 12;
		
		if (num % 2 == 0 && num % 3 == 0) {
			System.out.println("It is divisible by 2 and 3.");
		}
		if (num % 2 == 0 || num % 3 == 0) {
			System.out.println("It is divisible by 2 or 3.");
		}
		if (num % 2 == 0 ^ num % 3 == 0) {
			System.out.println("It is divisible by 2 and 3 but not both.");
			// when both conditions are true in excl or it is false. 
			// which is why both of these are false.
		}
	
	
	
	
	
	
	
	}
	
	
	
	
}
