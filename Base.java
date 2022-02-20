package inClass;
// base10 ---> base2
// base10 ---> base16
// base2 ---> base10
// base16 ---> base10
public class Base {
	
	public static void main(String[] args) {
		
		int a;
	
		int[] array; //created an array
		array = new int[5]; //created an address
		// int_[] array = new int_[5] does both
		
	
		
		array[0] = 10;
		array[1] = ++array[0];
		array[2] = array[1] + array[0];
		array[3] += array[2];
		array[4] = array[3] + 5;
		
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
	}
	

}
