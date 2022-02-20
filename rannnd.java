package homePractice;
import java.util.Random;
public class rannnd {
	public static void main(String[] args) {
		int rand = (int)(Math.random() * 26);
		int rand2 = (int)(Math.random() * 26);
		
		String alpabet = "abcefghijklmnopqrstuvwxyz";
		String caps = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		
		System.out.println(alpabet.charAt(rand));
		System.out.println(caps.charAt(rand2));
	}

}
