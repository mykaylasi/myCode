package inClass;

public class Sept17Sorting {
	
	public static void main(String[] args)	{
		
		
		int[] list = {3,10,4,7,2,5};
		
		for(int i = 0; i < list.length; i++) {
			
		
		
		for (int j = 0; j < list.length - 1; j++) {
			
			if (list[j] > list[j+1]) {
				int temp = list[j+1];
				list[j+1] = list[j];
				list[j] = temp;
				
			}
		}
			
			}
		for(int v : list) {
			System.out.print(v + " ");
			
		}
	}

}


/**bubble
selection
insertion
quick
radix
heap
merge
*/