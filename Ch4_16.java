//Random character
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter04;
import java.util.Random;
public class Ch4_16 {
	public static void main(String[] args) {
		
	
	int random = (int)(Math.random() * 27);
	String letters = "abcdefghijklmnopqrstuvwxyz";
	
	char randomLetter  = letters.charAt(random);
	
	char upperCases = Character.toUpperCase(randomLetter);
	
	System.out.println(upperCases);
	}

}
