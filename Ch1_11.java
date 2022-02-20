/**Population projection
By: MyKayla Silar
*/
package chapter1;

public class Ch1_11 {
	
	public static void main(String[] args) {
		
		long currentPopulation = 312_032_486;
		
		final int daysInYear = 365;
		
		final int secondsInYear = (60 * 60 * 24 * daysInYear);
		
		double birthsEveryYear = secondsInYear / 7.0;
		
		
		
		double deathsEveryYear = secondsInYear / 13.0;
		
		
		
		double newImmigrants = secondsInYear / 45.0;		
		
		
		
		double updates = (birthsEveryYear - deathsEveryYear) + newImmigrants;
		
		long newPop = currentPopulation + (long)updates;
		
		
		
		for (int i = 1; i < 6; i++) {
			System.out.println("In " + i + " year(s) the population will be: " + newPop);
			newPop += updates;
		}
	}

}
