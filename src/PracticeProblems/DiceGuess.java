package PracticeProblems;
import java.util.Scanner;

public class DiceGuess {
    public static void main(String[] args){
        int x = (int)(Math.random() *5 +1);
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number between 1 to 5:");
        int guess = sc.nextInt();
        
        if(guess == x){
            
           System.out.println("You guessed correctly!");
           System.out.println("Your number:" + guess);
           System.out.println("Our number:" +x);
        }else{
           System.out.println("You guessed incorrectly.");
           System.out.println("Your number:" + guess);
           System.out.println("Our number:" +x);
        }
    }
}
