package PracticeProblems;
import java.util.Scanner;

public class PoundsToKilograms {
    public static void main(String[] args) {
		
	Scanner number = new Scanner(System.in);
	System.out.println("Please enter a number in pounds");
		
	double pounds = number.nextDouble();
	double kilograms = pounds * 0.454;
		
	System.out.println("In kilograms is: " +kilograms);
    }
}
