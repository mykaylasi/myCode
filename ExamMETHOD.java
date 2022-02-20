package newInClass;
// write a method that gets two input as int_ and returns the biggest of the two
public class ExamMETHOD {
	public static void main(String[] args)	{
		
		int a = 10;
		int b = 20;
		int c = 40;
		System.out.println(maxOfTwoInt(a,b)); //actual parameters
		System.out.println(maxOfTwoInt((maxOfTwoInt(a,b)),c));
		
		
	}
	
	public static int maxOfTwoInt(int a, int b) {
		
		if ( a > b)
			return a;
		else
			return b;
	}
	
	public static int maxOfThreeInt(int a, int b, int c) {  //formal parameters
		
		return maxOfTwoInt(maxOfTwoInt(a, b), c);
	}
	

}
