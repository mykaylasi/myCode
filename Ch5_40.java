// Simulation: heads or tails
// By: MyKayla Silar
package edu.gsu.cis.chapter05;

public class Ch5_40 {
	
	public static void main(String[] args) {
		
		int totalHeads = 0; 
		int totalTails = 0;
		
		for (int i = 0; i < 1000000; i++) {
			int coin = (int)(Math.random() * 2);
			
			if (coin == 1) 
				totalHeads++;
			else  
				totalTails++;	
		}
		
		System.out.println("Heads = " + totalHeads);
		System.out.println("Tails = " + totalTails);
		
	}

}
