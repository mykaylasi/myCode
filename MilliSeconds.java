package inClassExe;

public class MilliSeconds {
	public static void main(String[] args) {
		
		long totalMilliseconds = System.currentTimeMillis();
		
		
		
		long totalSeconds = totalMilliseconds / 1000;
		long currentSecond = totalSeconds % 60;
		
		long totalMinutes = totalSeconds / 60;
		long currentMinute = totalMinutes % 60;
		
		long totalHours = totalMinutes / 60;
		long currentHour = totalHours % 24;
		
		System.out.println(currentHour);
		
		System.out.println(currentMinute);
		System.out.println(currentSecond);
		
		
		
		
		
	}

}
