package arrays;

public class MaxSumArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] array = {{1,2,3},
				         {3,4,7},
				         {5,2,8}};
		
		
		
		
		int sum = 0;
		int max = array[0][0] + array[0][1] + array[0][2];
		int maxIndex = 0;
		
		for (int i = 1; i < array.length; i++) {
			
			for (int j = 0; j < array[i].length; j++)	{
				
				sum += array[i][j];
			}
			
			if (sum > max) {
				
				max = sum;
				maxIndex = 1;
				
			}
			
			sum = 0;
		}
		System.out.println(max);
	}

}
