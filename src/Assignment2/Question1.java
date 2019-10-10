/*
 * Name: Allanah Brisebois
 * Program: Computer System Technology: SDNE
 * Class: Java 1: PROG10082
 * Assignment: 2
 */

package Assignment2;
//import scanner package 
import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
	//create scanner object	
	Scanner sc = new Scanner(System.in);
        //first scanner to get product name
	System.out.print("Enter product name: ");
	String productName = sc.nextLine();
	//second scanner to get product cost
	System.out.print("Enter product cost: ");
	double productCost = sc.nextDouble();
	//third scanner to get quatity
	System.out.print("Enter quantity on hand: ");
	int productQuantity = sc.nextInt();
	//calculate total value 
	double totalValue = productCost * productQuantity;
	//print out the product name and total value 
	System.out.printf("Total value of %s: is %.2f \n", productName, totalValue);
    }
}
