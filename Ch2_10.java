//Science: calculating energy
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter02;
import java.util.Scanner;
public class Ch2_10 {
	public static void main(String[] args) {
		System.out.print("Enter the amount of water in kilograms: ");
		Scanner input = new Scanner(System.in);
		double weight = input.nextDouble();
		
		System.out.print("Enter the inital temperature: ");
		double iTemp = input.nextDouble();
		
		System.out.print("Enter the final temperature: ");
		double fTemp = input.nextDouble();
		
		double energy = weight * (fTemp - iTemp) * 4184;
		
		System.out.println("The energy needed is " + energy + " joules.");
		
		
	}

}
