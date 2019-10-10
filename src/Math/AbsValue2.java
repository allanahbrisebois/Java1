package Math;

import java.util.Scanner;

public class AbsValue2 {
    public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Enter a number: ");
		double a = scr.nextDouble();
		System.out.println("Enter another number: ");
		double b = scr.nextDouble();
		
		Math.pow(a, 2);
		Math.pow(b, 2);
		
		double c = a - b;
		
		System.out.println(Math.abs(c));

	}
}
