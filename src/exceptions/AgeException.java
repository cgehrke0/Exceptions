package exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class AgeException {
	public static void main(String[] args) {
	
	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter age: ");
	
	try {
		int age = scanner.nextInt();
		System.out.println(age);
		String test = null;
		test.toString();
	} catch(InputMismatchException e) {
		System.out.println("This was the junk input: "+ scanner.next());
		System.out.println("Input Mismatch Exception occured!");
		System.out.print("Enter a Integer for AGE:");
		int age = scanner.nextInt();
		System.out.println("Age entered is: " +age);
		//e.printStackTrace();
	} catch(Exception e) {
		System.out.println("Exception occured!");
		//e.printStackTrace();
	} finally {
		System.out.println("input in finally block!");
	}
	
	System.out.println(" Reached after Try-Finally!");
	scanner.close();

}
}