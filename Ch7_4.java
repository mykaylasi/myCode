// Analyze scores
// By: MyKayla Silar
package edu.gsu.cis.chapter07;
import java.util.Scanner;
public class Ch7_4 {
	public static void main(String[] args) {
		double[] scores = new double[100];
		int i = 0;
		int count = 0;
		double totalOfScores = 0;
		double avg = 0;
		int aboveAvg = 0;
		int belowAvg = 0;
		
		Scanner input = new Scanner(System.in);
		
		for(i = 0; i < 100; i++)	{
			System.out.print("Enter a new score: ");
			scores[i] = input.nextDouble();
			count++;
			if (scores[i] < 0) 
				break;	
		}
		
		count = count - 1;
		System.out.println("count is " + count);
		
		
		for(i = 0; i <= count; i++) {
			if(scores[i] > 0) {
			totalOfScores += scores[i];
			}
		}
		
		avg = totalOfScores / count;
		System.out.println("Average is " + avg);
		
		for(i = 0; i <= count; i++)	{
			if(scores[i] > 0) {
			if(scores[i] >= avg) {
				aboveAvg++;				
			}
			else {
				belowAvg++;
			}
		}
		}
		System.out.print("Number of scores above or equal to average " + aboveAvg);
		System.out.println();
		System.out.print("Number of scores below the average " + belowAvg);
	}

}
