package Basics;

import javax.swing.JOptionPane;

public class JOptionPrac {
    public static void main(String[] args){
        String number = JOptionPane.showInputDialog("Enter number");
        int num1 = Integer.parseInt(number);
        
        JOptionPane.showMessageDialog(null, num1);
    }
}
