package Math;
import java.util.Scanner;

public class CircleArea {
    public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Please enter the circle radius: ");
		double radius = scr.nextDouble(); 
		
		double radiusSq = Math.pow(radius, 2);
		
		System.out.println("The area is: "+ Math.PI * radiusSq);
	}
}
