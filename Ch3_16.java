//Random point
//	by: MYKAYLA SILAR
package edu.gsu.cis.chapter03;
import java.util.Random;
public class Ch3_16 {
	public static void main(String[] args) {
		int width = (int)((Math.random()*101)-50);
		int height = (int)((Math.random()*201)-100);
		
		System.out.println("(" + width + ","+ height+ ")");
	}

}
