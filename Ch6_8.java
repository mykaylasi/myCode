// Conversions between Celsius and Fahrenheit
// By: MyKayla Silar
package edu.gsu.cis.chapter06;
import java.util.Scanner;
public class Ch6_8 {
	
	public static void main(String[] args) {
		
		System.out.println("Celsius        Fahrenheit       |      Fahrenheit     Celsius");
		System.out.println("--------------------------------------------------------------");
		
		
		for (double celsius = 40,  fahrenheit = 120; celsius >= 31;  celsius--, fahrenheit -=10) {
			String fahr = String.format("%.1f", (celsiusToFahrenheit(celsius)));
			String cels = String.format("%.2f", (fahrenheitToCelsius(fahrenheit)));
			System.out.println(celsius + "\t" + "\t"+ fahr + "\t\t|" + "    " + fahrenheit + "\t" + "\t" + cels);		
		}
	}
	
	public static double celsiusToFahrenheit(double celsius)	{
			return ((9.0 / 5) * celsius + 32);			
		}	

	
	public static double fahrenheitToCelsius(double fahrenheit)	{
		return (5.0 / 9) * (fahrenheit - 32);	
		}
		
}
