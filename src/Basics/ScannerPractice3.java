

package Basics;
import java.util.Scanner;

public class ScannerPractice3 {
public static void main(String[] args) {
		Scanner keyIn = new Scanner(System.in);
		System.out.println("Enter your favourite class");
		String className = keyIn.nextLine();
		
		System.out.println("Your favourite class is: " +className);
	}
}
