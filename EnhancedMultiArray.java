package arrays;

public class EnhancedMultiArray {
	
	public static void main(String[] args)	{
		
		 int[][] array = {{1,2,3},
                          {5,6,8},
                          {9,9,2},
                          {6,7,8}};



		 for(int[] ref : array)	{
	
			 	for (int var : ref)	{
			 			
			 		System.out.print(var + " ");
			 	}
	
			 		System.out.println();
	
	}
		 
	}

}
