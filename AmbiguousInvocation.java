package newInClass;

public class AmbiguousInvocation {
	public static void main(String[] args) {
	//	System.out.println(max(1,2));
		
	//}
	
	//public static double max(int num1, double num2)	{
		//if (num1 > num2)
			//return num1;
	//	if (num2 > num1)
		//	return num2;
	//}
	
//	public static double max(double num1, int num2)	{
		//if (num1 > num2)
			//return num1;
		//if (num2 > num1)
			//return num2;
	}

}

// they don't know which one you want to use so they don't try to guess
// it's ambiguous and the compiler doesn't know which method to use.
