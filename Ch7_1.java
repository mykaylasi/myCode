// Assign grades
// By: MyKayla Silar
package edu.gsu.cis.chapter07;
import java.util.Scanner;
public class Ch7_1 {
	public static void main(String[] args)	{
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of students: ");
		int number = input.nextInt();
		double[] numOfStudents = new double[number];
		
		System.out.print("Enter " + number + " scores: ");
		numOfStudents[0] = input.nextDouble();
		numOfStudents[1] = input.nextDouble();
		numOfStudents[2] = input.nextDouble();
		numOfStudents[3] = input.nextDouble();
		
		double maxScore = 0;
		for(int i = 0; i < numOfStudents.length; i++ ) {
			if (numOfStudents[i] >= maxScore) {
				maxScore = numOfStudents[i];
			}
			
			}
		System.out.println(maxScore);
		
		
		
		for(int i = 0; i < number; i++)	{
			if (numOfStudents[i] >= maxScore - 10) {
			System.out.println("Student " + i + " score is " + numOfStudents[i] + " and grade is A");
			}
			else if (numOfStudents[i] >= maxScore - 20) {
			System.out.println("Student " + i + " score is " + numOfStudents[i] + " and grade is B");
			}
			else if (numOfStudents[i] >= maxScore - 30) {
			System.out.println("Student " + i + " score is " + numOfStudents[i] + " and grade is C");
			}
			else if (numOfStudents[i] >= maxScore - 40) {
			System.out.println("Student " + i + " score is " + numOfStudents[i] + " and grade is D");
			}
			else
			System.out.println("Student " + i + " score is " + numOfStudents[i] + " and grade is F");
		
			
			
		}
		
		
		
		
	}

}
