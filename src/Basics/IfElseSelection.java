package Basics;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class IfElseSelection {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String num1 = JOptionPane.showInputDialog("Please enter a low number");
        int y = Integer.parseInt(num1);
        
        String num2 = JOptionPane.showInputDialog("Please enter a high number");
        int z = Integer.parseInt(num2);
        
        if(z<y){
            System.out.println("Your number is too low.");
        }else{
            System.out.println("You entered a good number");
        }
    }
}
