package Math;
import java.util.Scanner;
import java.lang.Math;

public class ClassProblems1 {
    public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please enter a number");
		double a = sc.nextDouble();
		System.out.println("Please enter a number");
		double b = sc.nextDouble();
		
		double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
		
		System.out.println("The square root of a sqaured + b squared is: " +c);
		
		double p = Math.sqrt(Math.abs(b-a));
		System.out.println("The sqare root of the absolute value of b -a is: " +p);
		
		double sum = (a*(Math.pow(b, 2)))/b-1;
		System.out.println("The sum of the equation is: " +sum );
	}
}
