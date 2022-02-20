// Find the highest score
// By: MyKayla Silar
package edu.gsu.cis.chapter05;
import java.util.Scanner;
public class Ch5_8 {
	
	public static void main(String[] args)	{
		
		int questions = 0;
		double topScore = 0;
		String topStudent = "";
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int students = input.nextInt();
		
		while (questions < students) {
			questions++;
		
		System.out.print("Enter a student name: ");
		String names = input.next();
		System.out.print("Enter a student score: ");
		double score = input.nextDouble();
		
		if (topScore < score) {
			double temp = topScore;
			topScore = score;
			score = temp;
			topStudent = names;
		}
	
		}
		
		
		System.out.println("Top student " + topStudent + "'s score is " + topScore);
	
		
		
		
		
	}

}
