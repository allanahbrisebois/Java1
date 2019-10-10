package Math;
import java.util.Scanner;
//import javax.swing.JOptionPane;

public class GroceryReceipt {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Please enter the cost of your first item: ");
        String item1 = sc.nextLine();
        double itemPrice = Double.parseDouble(item1);
        
        System.out.println("Please enter second item price: ");
        String item2 = sc.nextLine();
        double itemPrice2 = Double.parseDouble(item2);
        
        double total = itemPrice + itemPrice2;
        
        System.out.println(total);
        //JOptionPane.showMessageDialog(null, "Bill:"+total);
    }
}
