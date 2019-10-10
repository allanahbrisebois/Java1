package Basics;

import javax.swing.JOptionPane;

public class PopUpInput2 {
    public static void main(String[] args){
        String num = JOptionPane.showInputDialog("Type a number: ");
        int a = Integer.parseInt(num);
        
        String num2 = JOptionPane.showInputDialog("Type another number: ");
        int b = Integer.parseInt(num2);
        
        int sum = a + b;
        
        System.out.printf("Your number was %d", sum);
    }
}
