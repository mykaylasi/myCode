package softwaredev;
import java.util.Scanner;
import java.lang.Math.*;
public class GM {
	
	public static void main(String[] args) {
		
		 Scanner scan = new Scanner(System.in);
		    int x1 = scan.nextInt();
		    int y1 = scan.nextInt();
		    
		    int x2 = scan.nextInt();
		    int y2 = scan.nextInt();
		    
		    double distance = Math.sqrt((x2-x1)*(x2-x1) + (y2-y1)*(y2-y1));
		    
		    int dist = (int)(distance);
		    
		    System.out.println(dist);
	
		    
	}

}
