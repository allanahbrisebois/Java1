

package Math;


public class Multiplication {
    public static void main(String[] args) {
		// TODO Auto-generated method stub
		double price = 1.25;
		int qty = 2;
		double totalCost = price * qty;
		System.out.println(totalCost); //2.5
		qty*=2;
		price=1.00;
		totalCost=price*qty;
		System.out.println(totalCost);//4
	}
}
