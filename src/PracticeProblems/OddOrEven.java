package PracticeProblems;

import java.util.Scanner; 

public class OddOrEven {
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number");
        int x = sc.nextInt();
        
        if (x%2 == 0){
            System.out.println("Your number is even");
            
        }else {
            System.out.println("Your number is odd");
        }
        
    }
}
