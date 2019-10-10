package Basics;


public class OperatorsPractice2 {
    public static void main(String[] args) {
        int a =1;
	int b = 2;
	int c;
	int d;
		
	c = ++b;
	d=a++;
	c++;
		
	System.out.println("A = "+ a); //2
	System.out.println("B = "+ b); //3
	System.out.println("C = "+ c); //4
	System.out.println("D = "+ d); //1
    }
}