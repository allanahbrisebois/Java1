package Math;

public class Arithmetic3 {
    public static void main(String[] args) {
		double price = 1.25; 
		int qty = 2;
		double totalCost = price * qty;
		System.out.println(totalCost); //2.5
		qty*=2; //4
		price = 1.00;
		totalCost= price*qty;
		System.out.println(totalCost); //4
	}
}
