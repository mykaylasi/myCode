package inClassExe;

public class CharacterMethods {
	public static void main(String[] args) {
		
		char ch = 'a';
		
		System.out.println(Character.isDigit(ch));             // is it a digit - true or false
		System.out.println(Character.isLetter(ch));
		System.out.println(Character.isLetterOrDigit(ch));
		System.out.println(Character.isLowerCase(ch));
		System.out.println(Character.isUpperCase(ch));
		
		System.out.println(Character.toUpperCase(ch));       // to UpperCase ... UpperCases l.o.l.
	}

}
