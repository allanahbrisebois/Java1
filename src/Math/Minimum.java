package Math;
import java.util.Scanner;
import java.lang.Math;

public class Minimum {
    public static void main(String[] args) {
	Scanner scn = new Scanner(System.in); 
	
	System.out.println("Please enter a number");
	double dblNum1 = scn.nextDouble(); 
	
	System.out.println("Please enter a number");
	double dblNum2 = scn.nextDouble();
	
	System.out.println("The smaller number is: " + Math.min(dblNum1, dblNum2));
}
}
