package arrays;

public class Arrays {
	public static void main(String[] args) {
		
		int a = 10;
		
		double[] array = new double[5];
		// double[] array = {1, 10, 20, 30, 40}; works too
		// for (int_ i = 0; i < array.length; i++) is the same thing as the loop below.
		 // the length is 5.
		
		String[] list = new String[10];
		
		array[0] = 5;
		array[1] = array[0]++;
		array[2] = array[0] + array[1];
		array[3] = array[2] + 1;
		array[4] = 10;
		
		for (int i = 0; i < 5; i++) {
		System.out.println(array[i]);
		}
		
		// let me explain this loop!
		
		
		// had me confused for a bit! so...
		
		/* i = 0
		 * 0 is less than 5
		 * so move onto the statements
		 * print array[i] but wait!
		 * i is now 0. because of the declaration at the first star
		 * print array[0]
		*/
		
		
		
		
		
		
		
		
		
		
		
		
		// array elements take default variables. array[0] = 0.0
		// local elements like a up there can not printed if that 10 was not there.
		// int_ a can not be printed without a value. arrays can.
		//              defaults
		// array double     0.0
		// array int_         0
		// boolean        false
		// char        '\u0000'
		// String          null
		
		//	types are either reference of non-reference
		//                 (address type)  (primitive)
		//                   scanner      int_, byte, short, long, double, float, boolean, char
		//      any thing other than those ^ 8.
	
		
		String ss = "Hello";
		ss = "Bye";
		ss = null;
		//now ss_ is blank
	}

}
