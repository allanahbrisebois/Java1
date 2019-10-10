package Basics;

/**
 *
 * @author lanab
 */
public class Formatting {
    public static void main(String[] args){
        System.out.printf("%3d%n",5);
        System.out.printf("%3d%n",12345);
        System.out.println(" ____ ");
        System.out.printf("%5.2f%n",7.24);
        System.out.printf("%5.2f%n",7.277);
        System.out.printf("%5.2f%n",123.456);
        System.out.printf("%5.2f%n",123.4);  
        System.out.printf("%-5.2f%n",7.277);
        System.out.printf("%-5.2f%n",123.456);
    }
}
