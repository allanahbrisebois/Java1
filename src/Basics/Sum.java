package Basics;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);	
	System.out.println("Please enter a number");
	int num = sc.nextInt();
		
	int numModRemainder = num % 10;
	int numMod = num/10;
	int numModRemainder2 = numMod %10;
	int numMod2 = num/10;
		
		
	System.out.println("The sum of your number is :" +numMod);
	System.out.println(numModRemainder);
	System.out.println(numMod);
	System.out.println(numModRemainder2);
	System.out.println(numMod2);
    }
}
