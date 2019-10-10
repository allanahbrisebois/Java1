package ManyMethods;

import java.util.Scanner;

public class apples {
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        tuna tunaObject = new tuna();
        System.out.println("Please enter your first girlfriend");
        String gf = sc.nextLine();
        
        tunaObject.setName(gf);
        tunaObject.saying();
    }
}
