package Math;
import java.lang.Math;

import java.util.Scanner;
public class SquareRoot2 {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter a number: ");
		double x = sc.nextDouble();
		
		System.out.println("Please enter another number: ");
		double y = sc.nextDouble();
		
		double z = x-y;
		
		System.out.println(Math.sqrt(z));
	}
}
