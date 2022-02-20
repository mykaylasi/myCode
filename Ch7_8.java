// Average an array
// By: MyKayla Silar
package edu.gsu.cis.chapter07;
import java.util.Scanner;
public class Ch7_8 {
	
	public static void main(String[] args) {
		System.out.print("Enter 10 integers: ");
		Scanner input = new Scanner(System.in);
		int[] values = new int [10];
		
		for(int i = 0; i < 9; i++)	{
			values[i] = input.nextInt();
		}
		
		System.out.println("The average of these integers is " + average(values));
		
		System.out.print("Enter 10 doubles: ");
		double[] valuess = new double [10];
		for(int a = 0; a < valuess.length; a++)	{
			valuess[a] = input.nextDouble();
		}
		
		System.out.println("The average of these doubles is " + average(valuess));
		
	}
	
	public static int average(int[] array)	{
		int total = 0;
		
		for(int k = 0; k < array.length; k++) {
			total += array[k];
		}
		
		int average = total / (array.length);
		return average;
	}
	
	public static double average(double[] array)	{
		double total = 0.0;
		
		for(int k = 0; k < array.length; k++) {
			total += array[k];
		}
		
		double average = total / (array.length);
		return average;
	}

}
