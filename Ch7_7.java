// Count single digits
// By: MyKayla Silar
package edu.gsu.cis.chapter07;

public class Ch7_7 {
	public static void main(String[] args) {
		int c = 0;
		int randoms = 0;
		int[] counts = new int[10];	
		
		for (int i = 0; i < 100; i++) {
				counts[(int)(Math.random() * 10)]++;	
			}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Number " + i + " is counted " + counts[i] + " time(s)");
		
			
			
		}
	}

}
