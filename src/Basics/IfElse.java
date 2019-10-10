package Basics;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter a number: ");
        double num = sc.nextDouble();
        if (num < 100){
            System.out.println("The square root of this number is "+ Math.sqrt(num));
            System.out.println("The square of the number is "+ Math.pow(num, 2));
            System.out.println("The cube of the number is " + Math.pow(num, 3));
        }else{
            System.out.println("Your number is large");
        }
    }
}
