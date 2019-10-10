

package PracticeProblems;
import java.util.Scanner; 

public class FuelEfficiency {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the driving distance: ");
	double milage = sc.nextDouble();
	System.out.print("Enter miles per gallon: ");
	double milePerGallon = sc.nextDouble();
	System.out.print("Enter the price per gallon: ");
	double pricePerGallon = sc.nextDouble();
		
	double costOfDriving = milage * (pricePerGallon / milePerGallon);
		
	System.out.println("The cost of driving is: " +costOfDriving);
		
	}
}
