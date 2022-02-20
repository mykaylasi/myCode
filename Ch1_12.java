// Average speed in kilometers
// 	by: MYKAYLA SILAR
package edu.gsu.cis.chapter01;

public class Ch1_12 {
	public static void main(String[] args) {
		
		
		  double mile = 24;
		//The book states a runner run 24 miles
		  
		  double KilometersPerHour;
		  
		  double secondsInAnhour = 3600;
		  double secondsInAminute = 60;
		  
		  
		  double actualSeconds = 35;
		  double actualMinutes = 40;
		  double actualHours = 1;
		  
		  double actualMinstoSecs = actualMinutes * secondsInAminute;
		  double actualHourstoSecs = actualHours * secondsInAnhour;
		  
		  double actualTimeInSecs = actualHourstoSecs + actualMinstoSecs + actualSeconds;
		  
		  double MilesPerHourInSecs = secondsInAnhour * mile;
		  double MilesPerHour = MilesPerHourInSecs / actualTimeInSecs;

		  
		  
		  KilometersPerHour = 1.6 * MilesPerHour;
		  
		  System.out.println(KilometersPerHour);
		
		
		  
		  
		  
	}

}
