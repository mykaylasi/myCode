package inClassExe;

public class Strings {
	public static void main(String[] args)	{
		
		
		String str;
		String str2;
		
		str = "Hello";
		str2 = "Java";
		
		System.out.println(str);
		System.out.println(str.length());
		System.out.println(str.charAt(0));
		
		System.out.println(str.charAt(str.length() - 1));    // use to get last character in the string
		
		System.out.println(str + str2);
		System.out.println(str.concat(str2));
		System.out.println(str.toUpperCase());
		System.out.println(str.toLowerCase());
		System.out.println(str.trim());                     // extracts all white space
		
		
	}

}
