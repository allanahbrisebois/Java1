package Assignment2;
import java.util.Scanner;

/*
 * Name: Allanah Brisebois
 * Program: Computer System Technology: SDNE
 * Class: Java 1: PROG10082
 * Assignment: 2
 */

public class Question3 {
    public static void main(String[] args) {	
        //Scanner object
	Scanner sc = new Scanner(System.in);
        //variable coordinates
        double x1 = 3.0;
        double y1 = 2.0; 
        double x2 = 5.7;
        double y2 = 7.5;
        double slope = (y2 - y1)/(x2 - x1);
        double midx = (x1 + x2)/2;
        double midy = (y1 + y2)/2;
        //output points
        System.out.println("Point P: (3.0, 2.0)");
        System.out.println("Point Q: (5.7, 7.5) \n");
        //output slope and midpoint
	System.out.println("A line connected by P(3.0, 2.0) and Q(5.7, 7.5)");	
        System.out.printf("-Has a slope of %.2f \n", slope);
        System.out.printf("-Has a midpoint of (%.2f, %.2f)\n ", midx, midy); 
	}
}
