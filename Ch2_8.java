/**Current time
 * By: MyKayla Silar
 */
package chapter2;
import java.util.Scanner;
public class Ch2_8 {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the time zone offset to GMT: ");
		int offset = input.nextInt();
		
		long milliseconds = System.currentTimeMillis();
		
		long allSeconds = milliseconds / 1000;
		
		long secondNow = allSeconds % 60;
		
		long allminutes = allSeconds / 60;
		
		long minuteNow = allminutes % 60;
		
		long allhours = allminutes / 60;
		
		long hourNow = allhours % 24;
		
		long time = hourNow + offset;
		
		if (time == 24) {
			time = 0;
		}
		
		if (time > 24) {
			time -= 24;
		}
		
		if (offset > 24) {
			int g = offset % 12;
			time = hourNow + g;
		}
		
		if (minuteNow < 10) {
			String minutNow = "0" + minuteNow;
			System.out.println("Current time is " + time + ":" + minutNow + ":" + secondNow);
		}
		else {
		System.out.println("Current time is " + time + ":" + minuteNow + ":" + secondNow);
		
		}
		
		
		
	}

}
