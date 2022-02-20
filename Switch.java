package inClassExe;

public class Switch {
	public static void main(String[] args) {
		
		int a = 15;
		
		switch(a) {
		
		case 5:
			System.out.println("A");
			
		case 15:
			System.out.println("B"); //once 
			
		case 10:
			System.out.println("C");
			
		case 35:
			System.out.println("D");
		    
		default:
			System.out.println("E");
		}
		System.out.println("F");
	}

}
