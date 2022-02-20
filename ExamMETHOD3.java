package newInClass;
// FYI: ANY CLASS CAN BE COMPILED. EVEN WITHOUT MAIN. WITHOUT MAIN IT CAN'T BE RAN THO.
public class ExamMETHOD3 {
	
	
	public static int test(int a) {
// if (a >= 0 || a < 0)   the compiler sees if (). it does not read the conditions.
//		return a + 1;

		 if (a >= 0 || a < 0)
			 return a + 1;
		 else
			 return a + 1;  // works!  the compiler still doesn't see the conditions though
		
		
	}
	public static int maxOfTwoInt(int a, int b) {
		
		return a > b ? a : b;
	}

}
