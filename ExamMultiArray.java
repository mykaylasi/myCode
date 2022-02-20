package arrays;

public class ExamMultiArray {

	public static void main(String[] args) {
		
		// that gets a 2d array and returns a brand new array that each element is one more unit
		// than the calling array
		
		int [][] array = {{1,2,3},
				          {3,4,7},
				          {5,2,8}};
		int[][] r = increment(array);
		
		
	}
	
	public static int[][] increment(int[][] a) {
		
		int[][] result = new int[a.length][a[0].length];
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j <a[i].length; j++) {
				
				System.out.print((result[i][j] = a[i][j] + 1) + " ");
				
			}
			System.out.println();
		}
		
		return result;
	}

}
