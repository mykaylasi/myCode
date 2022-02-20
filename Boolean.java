//Learning boolean today 6/25
package inClassExe;
import java.util.Scanner;
public class Boolean {
	public static void main(String[] args) {
	
	boolean myBoolean;
	
	myBoolean = true;
	myBoolean = false;
	
	System.out.println(5 == 7);
	
	boolean b1 = 7 < 60;
	
	boolean b2 = 7 > 8 == 9 < 10;
	
	System.out.println(b1);
	
	//random
	Scanner input = new Scanner(System.in);
	int num1 = (int) (Math.random() * 10);   //[0,1)  Can gen 0 can never gen 1. 0 incl 1 excl
	int num2 = (int) (Math.random() * 10); //[0,10)
	
	int response;
	
	System.out.println("What is " + num1 + "-" + (num2) + "?");
	response = input.nextInt();
	System.out.println(response == num1 - num2);


}
}