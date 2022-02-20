package arrays;

public class SumOfJagColsArrays {

	public static void main(String[] args) {
		
		 int[][] array = {{1},
		                  {3,4},
                          {5,2,8}};


		 for(int i = 0; i < array.length; i++)	{
	
			 for (int j = 0; j < array[i].length; j++)	{
				 System.out.print(array[i][j] + " ");
			 }
	
			 System.out.println();
	
}



	} // add the columns up for a challenge

}
