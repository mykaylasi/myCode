package arrays;

public class PrintMultiArray {
	
	public static void main(String[] args) {
		
		//int_[][] array = new int_[3][4];
		
		// or
		
		 int[][] array = {{1,2,3},
		                  {5,6,8},
		                  {9,9,2},
		                  {6,7,8}};
		
		//System.out.println(array.length);     rows
		//System.out.println(array[0].length);  columns
		
		for(int i = 0; i < array.length; i++)	{
			
			for (int j = 0; j < array[i].length; j++)	{
				System.out.print(array[i][j] + " ");
			}
			
			System.out.println();
			
		}
		
		
		
		
		
		
	}

}
