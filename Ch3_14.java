//Game: heads or tails
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter03;
import java.util.*;
public class Ch3_14 {
	public static void main(String[] args) {
		int num1 = (int) (Math.random()*2);
		
		System.out.println("Guess! Heads or Tails? Enter 0 for Heads and 1 for Tails.");
		
		Scanner input = new Scanner(System.in);
		int ht = input.nextInt();
		
		if(ht == num1) {
			System.out.println("Correct! The coin landed on heads.");
		}
		else {
			System.out.println("Correct! The coin landed on tails.");
		
		}
		
		
		
	
		
	}

}
