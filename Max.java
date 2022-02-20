package inClass;

public class Max {
	
	public static void main(String[] args) {
	
		int[] array = {5, 8, 2, 9, 10, 4};
		
		int sum = 0;
		
		int max = array[0];
		
		for(int i = 1; i < array.length; i++) {
			
			if(array[i] > max)
				max = array[i];
		}
		
		System.out.println(max);
	}

}
// Amazon ready?! ----- In one loop, find the 2 biggest numbers!
// also when coding the shuffling program, find a way to never let 5 be array[0].
// how to shift two numbers at a time as well....*bites teeth*
// thoroughly study all powerpoints *shrugs* it is what it is! i need to know these things!
// string types are immutable
