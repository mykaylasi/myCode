package newInClass;

public class MoreCh5 {
	public static void main(String[] args) {
		int count = 0;
		
		while (count < 10) {
			
			if (count == 5) {
				count++;
				continue; // count is at 6 now. skip the sixth count! 6th index! so it will not print 5!
				// continue stays inside the loop.
				// break does not
				
			}
			System.out.println(count);
			count++;
		// continue goes here
			}
		// break goes here
	}

}
