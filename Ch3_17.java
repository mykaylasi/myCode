//Game: scissor, rock, paper
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter03;
import java.util.*;
public class Ch3_17 {
	public static void main(String[] args) {		
		int random = (int)(Math.random() * 3);
		System.out.println("Scissor (0), Paper(1), Rock(2)?");
		Scanner input = new Scanner(System.in);
		int choice = input.nextInt();
		
		
		if (random == 0) {
			System.out.print("The computer is scissor. ");
		}
		if (random == 1) {
			System.out.print("The computer is paper. ");
		}
		if (random == 2) {
			System.out.print("The computer is rock. ");
		}
		
		if (random == 0 && choice == 0) {
			System.out.println("You picked scissor. It's a draw!");
		}
		if (random == 0 && choice == 1) {
			System.out.println("You picked paper. You lost!");
		}
		if (random == 0 && choice == 2) {
			System.out.println("You picked rock. You won!");
		}
		
		if (random == 1 && choice == 0) {
			System.out.println("You picked scissor. You won!");
		}
		
		if (random == 1 && choice == 1) {
			System.out.println("You picked paper. It's a draw!");
		}
		
		if (random == 1 && choice == 2) {
			System.out.println("You picked rock. You lost!");
		}
		
		if (random == 2 && choice == 0) {
			System.out.println("You picked scissor. You lost!");
		}
		
		if (random == 2 && choice == 1) {
			System.out.println("You picked paper. You won!");
		}
		
		if (random == 2 && choice == 2) {
			System.out.println("You picked rock. It's a draw!");
		}
		
	}

}
