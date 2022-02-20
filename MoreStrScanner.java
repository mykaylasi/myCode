package inClassExe;
import java.util.Scanner;
public class MoreStrScanner {
	public static void main(String[] args) {
		
		
		
		
		String str = "Haello Jallov";
		String str2 = "abAd";
		
		System.out.println(str.equals(str2));
		System.out.println(str.equalsIgnoreCase(str2));
		
		System.out.println(str.compareTo(str2));     // if the first string has a bigger ASCII a positive num will return
		                                             // if the first string is smaller then a negative num will return
		
		System.out.println(str.startsWith("ab"));
		System.out.println(str.endsWith("ad"));
		
		System.out.println(str.substring(2));
		System.out.println(str.substring(2,6));      // exclusive 6 not included
		
		System.out.println(str.indexOf('a'));
		System.out.println(str.indexOf('a', 4));
		System.out.println(str.indexOf("llo",7));
		System.out.println(str.lastIndexOf('a'));
		System.out.println(str.lastIndexOf('a',1));
		System.out.println(str.lastIndexOf("llo"));
		System.out.println(str.lastIndexOf("llo", 6));
		
		
	}

}
