package inClassExe;

public class Subtraction {

	public static void main(String[] args) {
		int factor1 = (int)(Math.random()* 11);
		int factor2 = (int)(Math.random()* 11);
		
		if (factor1 < factor2) {
			int temp = factor1;
			factor1 = factor2;
			factor2 = temp;
		}
		
		System.out.println(factor1 + "-" + factor2);

	}

}
