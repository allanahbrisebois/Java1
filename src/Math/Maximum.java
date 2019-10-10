package Math;
import java.util.Scanner;
import java.lang.Math;

public class Maximum {
    public static void main(String[] args) {
                Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		double num1 = scr.nextDouble();
		
		System.out.println("Enter another number: ");
		double num2 = scr.nextDouble();
		
		System.out.println("The higer number is: " + Math.max(num1, num2));
		
	}
}
