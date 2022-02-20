// Display characters
// By: MyKayla Silar
package edu.gsu.cis.chapter06;

public class Ch6_12 {
	public static void main(String[] args) {
		printChars('1','z',10);
		
	}
	
	public static void printChars(char ch1, char ch2, int numberPerLine)	{
			
			for(int i = 1; ch1 <= ch2; i++)	{
			System.out.print(ch1 + " ");
			 if(i % 10 == 0)
			      System.out.print("\n");
			ch1++;
				
				
			}
			
		
		
	}

}
