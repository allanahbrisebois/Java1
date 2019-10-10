

package Basics;


public class OperatorPractice {
    public static void main(String[] args) {
	int a = 34;
        int b = 21;
        int c = a++ + ++b; //35 + 21 
        System.out.println(a);
        System.out.println(b);
        System.out.println(c); //56
        int d = --a + --b + c--; 
        System.out.print("_____________\n");
        System.out.println(a); //34 + 21 + 55 (after) 55 adding
        System.out.println(b);
        System.out.println(c);
        System.out.println(d); // 111
        System.out.println("_____________\n");
        int e = a + +b + +c + d--;
        System.out.println(a); //34
        System.out.println(b); // 22
        System.out.println(c); // 56
        System.out.println(d); //111 , 112 after
        System.out.println(e); 
        int f = -a + b-- + -c - d++;
        int sum = a + b + c + d + e + f;
        System.out.println("sum = " + sum);
	}
}
