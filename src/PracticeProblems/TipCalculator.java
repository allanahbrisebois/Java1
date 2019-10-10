

package PracticeProblems;


public class TipCalculator {
    public static void main(String[] args) {
	double billPrice = 35.10;
	double tipPercentage = 0.15;
	double tipAmount = billPrice * tipPercentage;
	double total = tipAmount + billPrice;
		
	System.out.println("Bill Amount: $" + billPrice);
	System.out.println("Tip: 15% ");
	System.out.println("Tip Amount : $" +tipAmount);
	System.out.println("Total Paid: $" + total);
	}
}
