package arrays;

public class Array_RandomChar {
	public static void main(String[] args)	{
		
		
		char[] chars = new char[100];
		
		for (int i = 0; i < 100; i++)	{
			
			chars[i] = (char)('a' + (int)(Math.random() * 26));
		}
		
		int[] counts = new int[26];
		
		for (int i = 0; i < chars.length; i++)	{
			
			counts[chars[i] - 'a']++; 
		}
		
		for (char var : chars) {
			System.out.print(var);
		}
		System.out.println();
		
		for (int i = 0; i < counts.length; i++) {
			System.out.println((char)('a' + i) + " = " + counts[i]) ;
		}
	}
}
