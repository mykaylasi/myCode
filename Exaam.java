package arrays;

public class Exaam {

	public static void main(String[] args) {
		
		int n = 2;
		int[] j = new int[10];
		
		array(n, j);
		System.out.println("n is: " + n);
		System.out.println("j[0] is: " + j[n]);
		
	

	}
	
	public static void array(int n, int[] j) {
		j[1]++;
		n++;
		
	}

}
