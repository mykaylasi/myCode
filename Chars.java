package inClassExe;

public class Chars {
	public static void main(String[] args) {
		
		char ch;
		
		ch = 'A'; // okay to enter in as lower-case
		ch++;  //  ch = ch + 1;
		ch = (char)(ch + 1);  //casted bc if not a number would be the result
		
		System.out.println(ch);
		
		System.out.println("Hell\"o Java"); //use this for double quotes "
		System.out.println("Hello\nJava");  // use this for next line
		System.out.println("Hello\tJava");  // use this to tab
		System.out.println("Hello\\Java");  // use this when you want a backslash
	
	}
	

}
