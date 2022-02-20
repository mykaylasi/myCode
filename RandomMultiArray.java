package arrays;

public class RandomMultiArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = {{1,2,3},
				         {3,4,7},
				         {5,2,8}};
		
		int rand1;
		int rand2;
		
		for (int i = 0; i < array.length; i++)	{
			
			for (int j = 0; j < array[i].length; j++)	{
				
				rand1 = (int)(Math.random() * array.length);
				rand2 = (int)(Math.random() * array[i].length);
				
				int temp = array[i][j];
				array[i][j] = array[rand1][rand2];
				array[rand1][rand2] = temp;
			}
			
		}
		
		for (int i = 0; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++) {
				
				System.out.print(array[i][j] + " ");
			}
			
			System.out.println();
		}
		
	

	}

}
