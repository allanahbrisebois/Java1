package PracticeProblems;

import java.util.Scanner;

public class InterestRate {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your account balance");
        double balance = sc.nextDouble();
        
        System.out.println("How many years has your money been in your account?");
        double time = sc.nextDouble();
        
        if(time> 5){
            double interestRate = 0.075;
            System.out.println("Total interest: " + interestRate * balance);
        }else{
            double interestRate = 0.045;
            System.out.println("Interest: " + interestRate * balance);
        }
    }
}
