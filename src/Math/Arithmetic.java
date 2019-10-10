

package Math;
/*
 * Types of operators: 
 * Arithmetic - +, -, *, /, %
 * Bitwise
 * Relational 
 * Logical
 */

public class Arithmetic {
    public static void main(String[] args) {
		int m = 6;
		int n=5, q=12;
		int r1 = m + n;
		int r2 = m - n;
		int r3 = q / m;
		int r4 = m * n;
		double r5 = (double)q/n; //must put double on other side to return decimal
		int r6 = q%n;
		
		
		System.out.println(r1);
		System.out.println(r2);
		System.out.println(r3);
		System.out.println(r4);
		System.out.println(r5);
		System.out.println(r6);
		
		System.out.println("___________");
		System.out.println(n);
		System.out.println(m);
		n += 2;
		m++;  //post increment - pre increment would be ++n;
		System.out.println(n);
		System.out.println(m);
	}
}
