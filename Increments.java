package inClassExe;

public class Increments {
	public static void main(String[] args) {
		
		// increments! finally.
		// integer a = 10;
		// a++ is 11 ... a = a + 1
		
		
		// integer b;
		// b = a++;
		
		// in the comment above b = 10! if those ++ are not in front of a, nothing happens
		// for b! it remains whatever b is. 
		// once it gets to that variable it is over with!
		
		// so b = a++ is whatever a is but a is increased by one.
		// b = ++a  b is increased by one and so is a.
		// in both a is always increased.
		// b is only increased when the operator comes before the variable
		int a  = 54;
	
		System.out.println(a++); // just PRINTS 10, but dont forget to increase by 1! ++ means plus 1!
		System.out.println(++a); // we start at 11 because of prev now we add one to that because ++ comes in the front! so PRINT 12.
		System.out.println(a++); // we start with 12 and it stops at 13 but 13 doesn't get printed.
		System.out.println(++a); // we start with 13 and add one so we PRINT 14.
		
		// remember that ++ is "increase by one"
		

	}

}
