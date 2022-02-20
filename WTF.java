package chapter_5;

public class WTF {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int n = 27;
		
		for (int i = 2; i < n; i++) {
			if (n % i == 0)	{
				System.out.println(i);
				
		}
			else {
				System.out.println("nope");
			}
		}
	}

}
