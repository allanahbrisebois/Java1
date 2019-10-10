/*
 * Name: Allanah Brisebois
 * Program: Computer System Technology: SDNE
 * Class: Java 1: PROG10082
 * Assignment: 2
 */

package Assignment2;
import java.util.Scanner;

public class Question2 {
    public static void main(String[] args) {
        //create scanner object	
	Scanner sc = new Scanner(System.in);
	//first scanner to get animal name
	System.out.print("An animal: ");
	String animal = sc.nextLine();
	//second scanner to get a colour
	System.out.print("A colour: ");
	String colour = sc.nextLine();
	//third scanner to get a colour
	System.out.printf("Something %s: ", colour);
	String colourObject = sc.nextLine();
	//fourth scanner to get a verb
	System.out.print("A verb (imperative): ");
	String verb = sc.nextLine();
	System.out.println("__________________________");
        //output Mad-Lib results
	System.out.println("Marry had a litte " + animal);
	System.out.printf("It's fleece as %s as %s \n", colour, colourObject);
	System.out.println("And everywhere that Mary went,");
	System.out.printf("The %s was sure to %s \n", animal, verb);
    }
}
