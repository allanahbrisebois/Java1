package Basics;
import javax.swing.JOptionPane;
/**
 *
 * @author lanab
 */
public class JOptionPrac2 {
    public static void main(String[] args){
       // JOptionPane.showMessageDialog(null, "Hello");
        String number = JOptionPane.showInputDialog("Enter a number");
        int num = Integer.parseInt(number);
        
        JOptionPane.showMessageDialog(null, num);
        
    }
}
