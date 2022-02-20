// Sum the major diagonal in a matrix
// By: MyKayla Silar
package edu.gsu.cis.chapter08;
import java.util.Scanner;
public class Ch8_2 {
	 public static void main(String[] args) {
	        Scanner in = new Scanner(System.in);
	        double[][] m = new double[4][4];
	        System.out.println("Enter a 4 x 4 matrix row by row: ");
	        
	        for (int i = 0; i < m.length; i++) {
	            for (int j = 0; j < m[0].length; j++) {
	                m[i][j] = in.nextDouble();
	            }
	        }
	        
	        System.out.printf("Sum of the slements in the major diagonal is %.1f",
	            sumMajorDiagonal(m));
	        
	    }
	    
	    public static double sumMajorDiagonal(double[][] m) {
	        double sum = 0.0;
	        for (int i = 0; i < m.length; i++) {
	            sum += m[i][i];
	        }
	        return sum;
	    }

}
