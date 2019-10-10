package Math;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        double assignGrade = sc.nextDouble();
        
        System.out.println("Please enter another grade");
        double assignGrade2 = sc.nextDouble();
        
        double finalGrade = (assignGrade + assignGrade2)/2;
        
        finalGrade += 2;
        
        System.out.printf("Your final grade is: %.2f%n", finalGrade);
        
    }
}
