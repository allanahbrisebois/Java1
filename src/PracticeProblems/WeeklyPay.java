package PracticeProblems;
import java.util.Scanner;

public class WeeklyPay {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("How many hours did you work this week?");
        double hours = sc.nextDouble();
        
        if (hours <= 40){
            double pay = hours * 10;
            System.out.println("Your weekly pay is: "+ pay);
        }else{
            double regHours = 40 *10;
            double diff = hours - 40;
            double overtime = diff * 15;
            double pay = regHours + overtime;
            System.out.println("Your weekly pay is: "+ pay);
        }
    }
}
