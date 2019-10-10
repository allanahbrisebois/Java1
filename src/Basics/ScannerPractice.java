

package Basics;
import java.util.Scanner;

public class ScannerPractice {
    public static void main(String[] args) {
		System.out.println("Please enter the bill amount");
		Scanner num = new Scanner(System.in);
		double bill = num.nextDouble();
		double tip = 1.15;
		double total = bill*tip;
		
		System.out.println("Your bill was $" + bill);
		System.out.println("Your total with a 15% tip is "+ total);
	}
}
